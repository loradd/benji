package se.mdh.idt.benji.difference;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;

import se.mdh.idt.benji.objectives.DifferenceGlobalConstraint;

/**
 * @author Lorenzo Addazi 
 **/
public class Difference <
		PreconditionMatch extends IPatternMatch, PreconditionMatcher extends ViatraQueryMatcher<PreconditionMatch>, 
		Precondition extends IQuerySpecification<PreconditionMatcher>, 
		PostconditionMatch extends IPatternMatch, PostconditionMatcher extends ViatraQueryMatcher<PostconditionMatch>, 
		Postcondition extends IQuerySpecification<PostconditionMatcher>,
		Action extends IMatchProcessor<PreconditionMatch>
> {

	// batch transformation rule factory
	private final BatchTransformationRuleFactory batchTransformationRuleFactory = new BatchTransformationRuleFactory();
	
	// properties - name
	private final String name; 
	// properties - precondition
	private final Precondition precondition; 
	// properties - postcondition
	private final Postcondition postcondition; 
	// properties - action
	private final Action action;
	// properties - transformation rule
	private BatchTransformationRule<PreconditionMatch, PreconditionMatcher> rule; 
	// properties - global constraint
	private DifferenceGlobalConstraint<Precondition, PostconditionMatch, PostconditionMatcher, Postcondition> globalConstraint; 
	
	// constructor
	public Difference(String name, Precondition precondition, Postcondition postcondition, Action action) {
		this.name = name; 
		this.precondition = precondition; 
		this.postcondition = postcondition; 
		this.action = action;
	}
	
	// getter - name
	public String getName() {
		return this.name; 
	}
	
	// getter - precondition
	public Precondition getPrecondition() {
		return this.precondition; 
	}
	
	// getter - postcondition
	public Postcondition getPostcondition() {
		return this.postcondition; 
	}
	
	// getter - action
	public Action getAction() {
		return this.action; 
	}
	
	// getter - transformation rule
	public BatchTransformationRule<PreconditionMatch, PreconditionMatcher> getTransformationRule() {
		if (this.rule == null) {
			this.rule = batchTransformationRuleFactory.<PreconditionMatch, PreconditionMatcher>createRule()
				.name(this.name).precondition(this.precondition).action(this.action).build(); 
		}
		return this.rule; 
	}
	
	// getter - global constraint
	public DifferenceGlobalConstraint<Precondition, PostconditionMatch, PostconditionMatcher, Postcondition> getGlobalConstraint() {
		if (this.globalConstraint == null) {
			this.globalConstraint = new DifferenceGlobalConstraint<Precondition, 
				PostconditionMatch, PostconditionMatcher, Postcondition>("[GLOBAL]" + name, precondition, postcondition);
		}
		return this.globalConstraint;
	}
	
}