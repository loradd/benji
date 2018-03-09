package se.mdh.idt.benji.difference.objectives;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IGlobalConstraint;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import se.mdh.idt.benji.benchmark.statecoding.BenchmarkActivationCode;

/**
 * @author Lorenzo Addazi 
 **/
public class DifferenceGlobalConstraint <
	Precondition extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, 
	PostconditionMatch extends IPatternMatch, PostconditionMatcher extends ViatraQueryMatcher<PostconditionMatch>, 
	Postcondition extends IQuerySpecification<PostconditionMatcher>
> implements IGlobalConstraint {
	
	// properties - name
	private final String name; 
	// properties - precondition - specification
	private final Precondition precondition; 
	// properties - postcondition - specification
	private final Postcondition postcondition; 
	// properties - postcondition - matcher
	private PostconditionMatcher matcher; 
	
	public DifferenceGlobalConstraint (String name, Precondition precondition, Postcondition postcondition) {
		this.name = name;  
		this.precondition = precondition; 
		this.postcondition = postcondition; 
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public Precondition getPrecondition() {
		return this.precondition; 
	}

	public Postcondition getPostcondition() {
		return this.postcondition; 
	}
	
	@Override @SuppressWarnings("unchecked")
	public boolean checkGlobalConstraint(ThreadContext context) {
		try {
			ViatraQueryEngine engine = context.getQueryEngine(); 
			matcher = postcondition.getMatcher(engine);
			Collection<BenchmarkActivationCode> activationCodes = context.getTrajectory().stream()
				.filter(activationCode -> activationCode instanceof BenchmarkActivationCode)
				.map(BenchmarkActivationCode.class::cast).collect(Collectors.toList());
			Collection<IPatternMatch> matches = activationCodes.stream()
				.map(BenchmarkActivationCode::getMatch).collect(Collectors.toList());
			Collection<IPatternMatch> preconditionMatches = matches.stream()
				.filter(match -> match.specification().equals(precondition)).collect(Collectors.toList());
			for (IPatternMatch preconditionMatch : preconditionMatches) {
				PostconditionMatch postconditionMatch = (PostconditionMatch) postcondition.newEmptyMatch();
				Collection<String> preconditionParameterNames = precondition.getParameterNames();
				Collection<String> postconditionParameterNames = postcondition.getParameterNames();
				Collection<String> commonParameterNames = preconditionParameterNames.stream()
					.filter(postconditionParameterNames::contains).collect(Collectors.toList());
				commonParameterNames.forEach(parameterName -> postconditionMatch.set(parameterName, preconditionMatch.get(parameterName)));
				if (!matcher.hasMatch(postconditionMatch)) return false;
			}
			return true; 
		} catch (Exception e) {
			return false; 
		}
	}

	@Override
	public void init(ThreadContext context) {
		try {
			ViatraQueryEngine engine = context.getQueryEngine(); 
			matcher = postcondition.getMatcher(engine);
		} catch (ViatraQueryException e) {
			throw new DSEException("Couldn't get the VIATRA Query matcher, see inner exception", e); 
		}
	}

	@Override
	public IGlobalConstraint createNew() {
		return new DifferenceGlobalConstraint<Precondition, PostconditionMatch, PostconditionMatcher, Postcondition>(name, precondition, postcondition);
	}
	
}