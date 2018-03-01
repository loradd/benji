package se.mdh.idt.benji.difference;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;

/**
 * @author Lorenzo Addazi 
 **/
public class DifferenceFactory {

	// create difference instance
		public static <PreconditionMatch extends IPatternMatch, PreconditionMatcher extends ViatraQueryMatcher<PreconditionMatch>, Precondition extends IQuerySpecification<PreconditionMatcher>, 
			PostconditionMatch extends IPatternMatch, PostconditionMatcher extends ViatraQueryMatcher<PostconditionMatch>, Postcondition extends IQuerySpecification<PostconditionMatcher>, 
			Action extends IMatchProcessor<PreconditionMatch>> DifferenceBuilder<PreconditionMatch, PreconditionMatcher, Precondition, PostconditionMatch, PostconditionMatcher, Postcondition, Action> difference() {
		return new DifferenceBuilder<PreconditionMatch, PreconditionMatcher, Precondition, PostconditionMatch, PostconditionMatcher, Postcondition, Action>(); 
	}
	
}
