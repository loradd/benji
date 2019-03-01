package se.mdh.idt.benji.benchmark.api;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel;
import org.eclipse.viatra.dse.api.Objectives;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import se.mdh.idt.benji.benchmark.statecoding.BenchmarkStateCoderFactory;
import se.mdh.idt.benji.difference.api.Difference;

/**
 * @author Lorenzo Addazi 
 **/
public class Benchmark {
	
	// logger
	private Logger logger = Logger.getLogger(Benchmark.class); 
	
	// all solutions
	public static int ALL = 0; 
	
	// properties - context
	private final ResourceSet context; 
	// properties - metamodels
	private final Set<EPackage> metamodels; 
	// properties - models
	private final Set<Resource> models; 
	// properties - constraints
	private final Set<Constraint> constraints; 
	
	// constructor 
	public Benchmark(ResourceSet context, Set<EPackage> metamodels, Set<Resource> models, Set<Constraint> constraints) {
		this.context = context; 
		this.metamodels = metamodels; 
		this.models = models; 
		this.constraints = constraints; 
	}
	
	// benchmark - generate
	public void generate(int instances, String output) throws ViatraQueryException, IOException, InterruptedException {
		DesignSpaceExplorer designSpaceExplorer = new DesignSpaceExplorer();
		DesignSpaceExplorer.turnOnLogging(DseLoggingLevel.VERBOSE_FULL);
		designSpaceExplorer.setMaxNumberOfThreads(1);
		IStateCoderFactory stateCoderFactory = new BenchmarkStateCoderFactory();
		designSpaceExplorer.setStateCoderFactory(stateCoderFactory);
		designSpaceExplorer.setInitialModelUncloned(this.context);
		this.metamodels.forEach(metamodel -> designSpaceExplorer.addMetaModelPackage(metamodel)); 
		this.constraints.forEach(constraint -> designSpaceExplorer.addTransformationRule(constraint.difference.getTransformationRule()));
		this.constraints.forEach(constraint -> designSpaceExplorer.addGlobalConstraint(constraint.difference.getGlobalConstraint()));
		this.constraints.forEach(constraint -> designSpaceExplorer.addObjective(Objectives
			.createTrajcetoryCostObjective("[LOWER BOUND] " + constraint.difference.getName())
			.withRuleCost(constraint.difference.getTransformationRule(), 1.0)
			.withHardConstraintOnFitness(constraint.lowerBound, Comparators.HIGHER_IS_BETTER)));
		this.constraints.forEach(constraint -> designSpaceExplorer.addObjective(Objectives
			.createTrajcetoryCostObjective("[UPPER BOUND] " + constraint.difference.getName())
			.withRuleCost(constraint.difference.getTransformationRule(), 1.0)
			.withHardConstraintOnFitness(constraint.upperBound, Comparators.LOWER_IS_BETTER)));
		designSpaceExplorer.addObjective(Objectives.createDepthHardObjective().withMinDepth(1));
		SolutionStore solutionStore = new SolutionStore(instances).logSolutionsWhenFound();
		designSpaceExplorer.setSolutionStore(solutionStore);
		int maxDepth = this.constraints.stream().mapToInt(constraint -> constraint.upperBound).sum();  
		IStrategy strategy = Strategies.createDfsStrategy(maxDepth).continueIfHardObjectivesFulfilled();  
		long startTime = System.nanoTime();
		designSpaceExplorer.startExploration(strategy);
		logger.info(designSpaceExplorer.toStringSolutions());
		Collection<Solution> solutions = designSpaceExplorer.getSolutions();
		for (Solution solution : solutions) {
			// logger.info(solution.getStateCode());
			SolutionTrajectory solutionTrajectory = solution.getShortestTrajectory(); 
			UUID solutionTrajectoryId = UUID.randomUUID();
			Map<EObject, URI> eObjectToProxyURIMap = new HashMap<EObject, URI>();
			ChangeRecorder changeRecorder = new ChangeRecorder();
			changeRecorder.setEObjectToProxyURIMap(eObjectToProxyURIMap);
			changeRecorder.beginRecording(this.models);
			solutionTrajectory.doTransformationUndoable(this.context);
			ChangeDescription changeDescription = changeRecorder.endRecording();
			changeDescription.copyAndReverse(eObjectToProxyURIMap);
			EMFHelper.saveModel(changeDescription, output + File.separator + solutionTrajectoryId + File.separator + "Delta.xmi");
			Set<String> changedModelURIs = changeDescription.getObjectChanges().stream()
				.map(objectChange -> objectChange.getKey().eResource().getURI().toString())
				.collect(Collectors.toSet());
			changedModelURIs.addAll(changeDescription.getResourceChanges().stream()
				.map(resourceChange -> resourceChange.getResourceURI().toString())
				.collect(Collectors.toSet()));  
			Collection<Resource> changedModels = this.models.stream()
				.filter(model -> changedModelURIs.contains(model.getURI().toString()))
				.collect(Collectors.toSet()); 
			for (Resource changedModel : changedModels) {
				Resource clonedResource = (Resource) EMFHelper.clone(changedModel); 
				EMFHelper.saveModel(clonedResource, output + File.separator + solutionTrajectoryId + File.separator + changedModel.getURI().lastSegment());
			}
			solutionTrajectory.undoTransformation();
		}
		logger.info(solutions.size());
		double elapsedTime = (System.nanoTime() - startTime) * 1.0e-9;
		logger.info("Elapsed Time: " + elapsedTime + " seconds");
	}
	
	// becnhmark - constraint
	public static class Constraint {
		
		// properties - lower bound
		private final int lowerBound; 
		// properties - upper bound
		private final int upperBound; 
		// properties - difference
		private final Difference<? extends IPatternMatch, ? extends ViatraQueryMatcher<? extends IPatternMatch>, 
			? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, 
			? extends IPatternMatch, ? extends ViatraQueryMatcher<? extends IPatternMatch>, 
			? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, 
			? extends Consumer<? extends IPatternMatch>> difference; 
		
		// constructor
		public Constraint(int lowerBound, int upperBound, 
			Difference<? extends IPatternMatch, ? extends ViatraQueryMatcher<? extends IPatternMatch>, 
				? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, 
				? extends IPatternMatch, ? extends ViatraQueryMatcher<? extends IPatternMatch>, 
				? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, 
				? extends Consumer<? extends IPatternMatch>> difference) {
			this.lowerBound = lowerBound; 
			this.upperBound = upperBound; 
			this.difference = difference; 
		}

	}
	
}