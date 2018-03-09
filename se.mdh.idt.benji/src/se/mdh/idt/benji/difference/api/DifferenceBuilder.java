package se.mdh.idt.benji.difference.api;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;

/**
 * @author Lorenzo Addazi 
 **/
public class DifferenceBuilder <
	PreconditionMatch extends IPatternMatch, PreconditionMatcher extends ViatraQueryMatcher<PreconditionMatch>, 
	Precondition extends IQuerySpecification<PreconditionMatcher>, 
	PostconditionMatch extends IPatternMatch, PostconditionMatcher extends ViatraQueryMatcher<PostconditionMatch>, 
	Postcondition extends IQuerySpecification<PostconditionMatcher>,
	Action extends IMatchProcessor<PreconditionMatch>
> {
	
	// properties - name
	private String name; 
	// properties - precondition
	private Precondition precondition; 
	// properties - postcondition
	private Postcondition postcondition; 
	// properties - action
	private Action action; 
	
	// configuration - name
	public DifferenceBuilder<PreconditionMatch, PreconditionMatcher, Precondition, 
		PostconditionMatch, PostconditionMatcher, Postcondition, Action> name(String name) {
		this.name = name; 
		return this; 
	}
	// configuration - precondition
	public DifferenceBuilder<PreconditionMatch, PreconditionMatcher, Precondition, 
		PostconditionMatch, PostconditionMatcher, Postcondition, Action> precondition(Precondition precondition) {
		this.precondition = precondition; 
		return this; 
	}
	// configuration - postcondition
	public DifferenceBuilder<PreconditionMatch, PreconditionMatcher, Precondition, 
		PostconditionMatch, PostconditionMatcher, Postcondition, Action> postcondition(Postcondition postcondition) {
		this.postcondition = postcondition; 
		return this; 
	}
	// configuration - action
	public DifferenceBuilder<PreconditionMatch, PreconditionMatcher, Precondition, 
		PostconditionMatch, PostconditionMatcher, Postcondition, Action> action(Action action) {
		this.action = action; 
		return this; 
	}
	
	// build
	public Difference<PreconditionMatch, PreconditionMatcher, Precondition, 
		PostconditionMatch, PostconditionMatcher, Postcondition, Action> build() {
		return new Difference<PreconditionMatch, PreconditionMatcher, Precondition, 
			PostconditionMatch, PostconditionMatcher, Postcondition, Action>(name, precondition, postcondition, action);
	}
	
}