package se.mdh.idt.benji.benchmark.api;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import se.mdh.idt.benji.benchmark.api.Benchmark.Constraint;
import se.mdh.idt.benji.difference.api.Difference;
import se.mdh.idt.benji.trace.TraceBuilder;

/**
 * @author Lorenzo Addazi 
 **/
public class BenchmarkBuilder {

	// utilities - trace builder
	private TraceBuilder traceBuilder = new TraceBuilder();
	
	// properties - metamodels
	private Set<EPackage> metamodels = new HashSet<EPackage>();
	// properties - models
	private Set<Resource> models = new HashSet<Resource>();
	// properties - constraints
	private Set<Constraint> constraints = new HashSet<Constraint>();
	
	// configuration - metamodels
	public BenchmarkBuilder metamodel(EPackage metamodel) {
		this.metamodels.add(metamodel); 
		return this; 
	}
	
	// configuration - models
	public BenchmarkBuilder model(String path) {
		Resource model = traceBuilder.load(path);
		this.models.add(model); 
		return this; 
	}
	
	// configuration - constraints
	public BenchmarkBuilder difference(int lowerBound, int upperBound, 
		Difference<? extends IPatternMatch, ? extends ViatraQueryMatcher<? extends IPatternMatch>, 
			? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, 
			? extends IPatternMatch, ? extends ViatraQueryMatcher<? extends IPatternMatch>, 
			? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, 
			? extends Consumer<? extends IPatternMatch>> difference) {
		Constraint constraint = new Constraint(lowerBound, upperBound, difference); 
		this.constraints.add(constraint); 
		return this; 
	}
	
	// build
	public Benchmark build() throws ViatraQueryException {
		ResourceSet context = traceBuilder.build();
		Benchmark benchmark = new Benchmark(context, metamodels, models, constraints); 
		return benchmark; 
	}
	
}