/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.bpmn2/src/se/mdh/idt/benji/examples/bpmn2/benchmark/Queries.vql
 */
package se.mdh.idt.benji.examples.bpmn2.benchmark;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         ////////////////////////////////////////////////////////////////////////////
 *         // Update Reference Target - Postcondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern UpdateReferenceTargetPostcondition(
 *         	process: Trace,
 *         	taskOne: Trace, taskTwo: Trace, taskThree: Trace,
 *         	sequenceFlow: Trace
 *         ) {
 *         	
 *         	Trace.initial(taskOne, initialTaskOne);
 *         	Trace.current(taskOne, currentTaskOne);
 *         	Task.name(initialTaskOne, taskOneName);
 *         	Task.name(currentTaskOne, taskOneName);
 *         	taskOneName == "Task 1";
 *         	
 *         	Trace.initial(taskTwo, initialTaskTwo);
 *         	Trace.current(taskTwo, currentTaskTwo);
 *         	Task.name(initialTaskTwo, taskTwoName);
 *         	Task.name(currentTaskTwo, taskTwoName);
 *         	taskTwoName == "Task 2";
 *         	
 *         	Trace.initial(taskThree, initialTaskThree);
 *         	Trace.current(taskThree, currentTaskThree);
 *         	Task.name(initialTaskThree, taskThreeName);
 *         	Task.name(currentTaskThree, taskThreeName);
 *         	taskThreeName == "Task 3";
 *         	
 *         	Trace.initial(sequenceFlow, initialSequenceFlow);
 *         	Trace.current(sequenceFlow, currentSequenceFlow);
 *         	SequenceFlow.sourceRef(initialSequenceFlow, initialTaskOne);
 *         	SequenceFlow.sourceRef(currentSequenceFlow, currentTaskOne);
 *         	SequenceFlow.targetRef(initialSequenceFlow, initialTaskTwo);
 *         	SequenceFlow.targetRef(currentSequenceFlow, currentTaskThree);
 *         	
 *         	Trace.initial(process, initialProcess);
 *         	Trace.current(process, currentProcess);
 *         	Process.flowElements(initialProcess, initialTaskOne);
 *         	Process.flowElements(currentProcess, currentTaskOne);
 *         	Process.flowElements(initialProcess, initialTaskTwo);
 *         	Process.flowElements(currentProcess, currentTaskTwo);
 *         	Process.flowElements(initialProcess, initialTaskThree);
 *         	Process.flowElements(currentProcess, currentTaskThree);
 *         	Process.flowElements(initialProcess, initialSequenceFlow);
 *         	Process.flowElements(currentProcess, currentSequenceFlow);
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class UpdateReferenceTargetPostcondition extends BaseGeneratedEMFQuerySpecification<UpdateReferenceTargetPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.bpmn2.benchmark.UpdateReferenceTargetPostcondition pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Trace fProcess;
    
    private Trace fTaskOne;
    
    private Trace fTaskTwo;
    
    private Trace fTaskThree;
    
    private Trace fSequenceFlow;
    
    private static List<String> parameterNames = makeImmutableList("process", "taskOne", "taskTwo", "taskThree", "sequenceFlow");
    
    private Match(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      this.fProcess = pProcess;
      this.fTaskOne = pTaskOne;
      this.fTaskTwo = pTaskTwo;
      this.fTaskThree = pTaskThree;
      this.fSequenceFlow = pSequenceFlow;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "process": return this.fProcess;
          case "taskOne": return this.fTaskOne;
          case "taskTwo": return this.fTaskTwo;
          case "taskThree": return this.fTaskThree;
          case "sequenceFlow": return this.fSequenceFlow;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fProcess;
          case 1: return this.fTaskOne;
          case 2: return this.fTaskTwo;
          case 3: return this.fTaskThree;
          case 4: return this.fSequenceFlow;
          default: return null;
      }
    }
    
    public Trace getProcess() {
      return this.fProcess;
    }
    
    public Trace getTaskOne() {
      return this.fTaskOne;
    }
    
    public Trace getTaskTwo() {
      return this.fTaskTwo;
    }
    
    public Trace getTaskThree() {
      return this.fTaskThree;
    }
    
    public Trace getSequenceFlow() {
      return this.fSequenceFlow;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("process".equals(parameterName) ) {
          this.fProcess = (Trace) newValue;
          return true;
      }
      if ("taskOne".equals(parameterName) ) {
          this.fTaskOne = (Trace) newValue;
          return true;
      }
      if ("taskTwo".equals(parameterName) ) {
          this.fTaskTwo = (Trace) newValue;
          return true;
      }
      if ("taskThree".equals(parameterName) ) {
          this.fTaskThree = (Trace) newValue;
          return true;
      }
      if ("sequenceFlow".equals(parameterName) ) {
          this.fSequenceFlow = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setProcess(final Trace pProcess) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProcess = pProcess;
    }
    
    public void setTaskOne(final Trace pTaskOne) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTaskOne = pTaskOne;
    }
    
    public void setTaskTwo(final Trace pTaskTwo) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTaskTwo = pTaskTwo;
    }
    
    public void setTaskThree(final Trace pTaskThree) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTaskThree = pTaskThree;
    }
    
    public void setSequenceFlow(final Trace pSequenceFlow) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSequenceFlow = pSequenceFlow;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.bpmn2.benchmark.UpdateReferenceTargetPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return UpdateReferenceTargetPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fProcess, fTaskOne, fTaskTwo, fTaskThree, fSequenceFlow};
    }
    
    @Override
    public UpdateReferenceTargetPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fProcess, fTaskOne, fTaskTwo, fTaskThree, fSequenceFlow) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"process\"=" + prettyPrintValue(fProcess) + ", ");
      result.append("\"taskOne\"=" + prettyPrintValue(fTaskOne) + ", ");
      result.append("\"taskTwo\"=" + prettyPrintValue(fTaskTwo) + ", ");
      result.append("\"taskThree\"=" + prettyPrintValue(fTaskThree) + ", ");
      result.append("\"sequenceFlow\"=" + prettyPrintValue(fSequenceFlow));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fProcess, fTaskOne, fTaskTwo, fTaskThree, fSequenceFlow);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof UpdateReferenceTargetPostcondition.Match)) {
          UpdateReferenceTargetPostcondition.Match other = (UpdateReferenceTargetPostcondition.Match) obj;
          return Objects.equals(fProcess, other.fProcess) && Objects.equals(fTaskOne, other.fTaskOne) && Objects.equals(fTaskTwo, other.fTaskTwo) && Objects.equals(fTaskThree, other.fTaskThree) && Objects.equals(fSequenceFlow, other.fSequenceFlow);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public UpdateReferenceTargetPostcondition specification() {
      return UpdateReferenceTargetPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static UpdateReferenceTargetPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static UpdateReferenceTargetPostcondition.Match newMutableMatch(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return new Mutable(pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static UpdateReferenceTargetPostcondition.Match newMatch(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return new Immutable(pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow);
    }
    
    private static final class Mutable extends UpdateReferenceTargetPostcondition.Match {
      Mutable(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
        super(pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends UpdateReferenceTargetPostcondition.Match {
      Immutable(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
        super(pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.bpmn2.benchmark.UpdateReferenceTargetPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * ////////////////////////////////////////////////////////////////////////////
   * // Update Reference Target - Postcondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern UpdateReferenceTargetPostcondition(
   * 	process: Trace,
   * 	taskOne: Trace, taskTwo: Trace, taskThree: Trace,
   * 	sequenceFlow: Trace
   * ) {
   * 	
   * 	Trace.initial(taskOne, initialTaskOne);
   * 	Trace.current(taskOne, currentTaskOne);
   * 	Task.name(initialTaskOne, taskOneName);
   * 	Task.name(currentTaskOne, taskOneName);
   * 	taskOneName == "Task 1";
   * 	
   * 	Trace.initial(taskTwo, initialTaskTwo);
   * 	Trace.current(taskTwo, currentTaskTwo);
   * 	Task.name(initialTaskTwo, taskTwoName);
   * 	Task.name(currentTaskTwo, taskTwoName);
   * 	taskTwoName == "Task 2";
   * 	
   * 	Trace.initial(taskThree, initialTaskThree);
   * 	Trace.current(taskThree, currentTaskThree);
   * 	Task.name(initialTaskThree, taskThreeName);
   * 	Task.name(currentTaskThree, taskThreeName);
   * 	taskThreeName == "Task 3";
   * 	
   * 	Trace.initial(sequenceFlow, initialSequenceFlow);
   * 	Trace.current(sequenceFlow, currentSequenceFlow);
   * 	SequenceFlow.sourceRef(initialSequenceFlow, initialTaskOne);
   * 	SequenceFlow.sourceRef(currentSequenceFlow, currentTaskOne);
   * 	SequenceFlow.targetRef(initialSequenceFlow, initialTaskTwo);
   * 	SequenceFlow.targetRef(currentSequenceFlow, currentTaskThree);
   * 	
   * 	Trace.initial(process, initialProcess);
   * 	Trace.current(process, currentProcess);
   * 	Process.flowElements(initialProcess, initialTaskOne);
   * 	Process.flowElements(currentProcess, currentTaskOne);
   * 	Process.flowElements(initialProcess, initialTaskTwo);
   * 	Process.flowElements(currentProcess, currentTaskTwo);
   * 	Process.flowElements(initialProcess, initialTaskThree);
   * 	Process.flowElements(currentProcess, currentTaskThree);
   * 	Process.flowElements(initialProcess, initialSequenceFlow);
   * 	Process.flowElements(currentProcess, currentSequenceFlow);
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see UpdateReferenceTargetPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<UpdateReferenceTargetPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static UpdateReferenceTargetPostcondition.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static UpdateReferenceTargetPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PROCESS = 0;
    
    private static final int POSITION_TASKONE = 1;
    
    private static final int POSITION_TASKTWO = 2;
    
    private static final int POSITION_TASKTHREE = 3;
    
    private static final int POSITION_SEQUENCEFLOW = 4;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(UpdateReferenceTargetPostcondition.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<UpdateReferenceTargetPostcondition.Match> getAllMatches(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllMatches(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<UpdateReferenceTargetPostcondition.Match> streamAllMatches(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllMatches(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<UpdateReferenceTargetPostcondition.Match> getOneArbitraryMatch(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawGetOneArbitraryMatch(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawHasMatch(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawCountMatches(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow, final Consumer<? super UpdateReferenceTargetPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pTaskOne the fixed value of pattern parameter taskOne, or null if not bound.
     * @param pTaskTwo the fixed value of pattern parameter taskTwo, or null if not bound.
     * @param pTaskThree the fixed value of pattern parameter taskThree, or null if not bound.
     * @param pSequenceFlow the fixed value of pattern parameter sequenceFlow, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public UpdateReferenceTargetPostcondition.Match newMatch(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return UpdateReferenceTargetPostcondition.Match.newMatch(pProcess, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow);
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfprocess(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PROCESS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfprocess() {
      return rawStreamAllValuesOfprocess(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfprocess() {
      return rawStreamAllValuesOfprocess(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfprocess(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfprocess(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfprocess(final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllValuesOfprocess(new Object[]{null, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow});
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfprocess(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfprocess(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfprocess(final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllValuesOfprocess(new Object[]{null, pTaskOne, pTaskTwo, pTaskThree, pSequenceFlow}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskOne.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOftaskOne(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TASKONE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskOne.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskOne() {
      return rawStreamAllValuesOftaskOne(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskOne.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskOne() {
      return rawStreamAllValuesOftaskOne(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskOne.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskOne(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOftaskOne(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskOne.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskOne(final Trace pProcess, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllValuesOftaskOne(new Object[]{pProcess, null, pTaskTwo, pTaskThree, pSequenceFlow});
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskOne.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskOne(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOftaskOne(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskOne.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskOne(final Trace pProcess, final Trace pTaskTwo, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllValuesOftaskOne(new Object[]{pProcess, null, pTaskTwo, pTaskThree, pSequenceFlow}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskTwo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOftaskTwo(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TASKTWO, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskTwo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskTwo() {
      return rawStreamAllValuesOftaskTwo(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskTwo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskTwo() {
      return rawStreamAllValuesOftaskTwo(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskTwo.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskTwo(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOftaskTwo(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskTwo.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskTwo(final Trace pProcess, final Trace pTaskOne, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllValuesOftaskTwo(new Object[]{pProcess, pTaskOne, null, pTaskThree, pSequenceFlow});
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskTwo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskTwo(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOftaskTwo(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskTwo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskTwo(final Trace pProcess, final Trace pTaskOne, final Trace pTaskThree, final Trace pSequenceFlow) {
      return rawStreamAllValuesOftaskTwo(new Object[]{pProcess, pTaskOne, null, pTaskThree, pSequenceFlow}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskThree.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOftaskThree(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TASKTHREE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskThree.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskThree() {
      return rawStreamAllValuesOftaskThree(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskThree.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskThree() {
      return rawStreamAllValuesOftaskThree(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskThree.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskThree(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOftaskThree(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskThree.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskThree(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pSequenceFlow) {
      return rawStreamAllValuesOftaskThree(new Object[]{pProcess, pTaskOne, pTaskTwo, null, pSequenceFlow});
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskThree.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskThree(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOftaskThree(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskThree.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskThree(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pSequenceFlow) {
      return rawStreamAllValuesOftaskThree(new Object[]{pProcess, pTaskOne, pTaskTwo, null, pSequenceFlow}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sequenceFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfsequenceFlow(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SEQUENCEFLOW, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for sequenceFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsequenceFlow() {
      return rawStreamAllValuesOfsequenceFlow(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sequenceFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfsequenceFlow() {
      return rawStreamAllValuesOfsequenceFlow(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sequenceFlow.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfsequenceFlow(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfsequenceFlow(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sequenceFlow.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfsequenceFlow(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree) {
      return rawStreamAllValuesOfsequenceFlow(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for sequenceFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsequenceFlow(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfsequenceFlow(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sequenceFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsequenceFlow(final Trace pProcess, final Trace pTaskOne, final Trace pTaskTwo, final Trace pTaskThree) {
      return rawStreamAllValuesOfsequenceFlow(new Object[]{pProcess, pTaskOne, pTaskTwo, pTaskThree, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected UpdateReferenceTargetPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return UpdateReferenceTargetPostcondition.Match.newMatch((Trace) t.get(POSITION_PROCESS), (Trace) t.get(POSITION_TASKONE), (Trace) t.get(POSITION_TASKTWO), (Trace) t.get(POSITION_TASKTHREE), (Trace) t.get(POSITION_SEQUENCEFLOW));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UpdateReferenceTargetPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return UpdateReferenceTargetPostcondition.Match.newMatch((Trace) match[POSITION_PROCESS], (Trace) match[POSITION_TASKONE], (Trace) match[POSITION_TASKTWO], (Trace) match[POSITION_TASKTHREE], (Trace) match[POSITION_SEQUENCEFLOW]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UpdateReferenceTargetPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return UpdateReferenceTargetPostcondition.Match.newMutableMatch((Trace) match[POSITION_PROCESS], (Trace) match[POSITION_TASKONE], (Trace) match[POSITION_TASKTWO], (Trace) match[POSITION_TASKTHREE], (Trace) match[POSITION_SEQUENCEFLOW]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<UpdateReferenceTargetPostcondition.Matcher> querySpecification() {
      return UpdateReferenceTargetPostcondition.instance();
    }
  }
  
  private UpdateReferenceTargetPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static UpdateReferenceTargetPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected UpdateReferenceTargetPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return UpdateReferenceTargetPostcondition.Matcher.on(engine);
  }
  
  @Override
  public UpdateReferenceTargetPostcondition.Matcher instantiate() {
    return UpdateReferenceTargetPostcondition.Matcher.create();
  }
  
  @Override
  public UpdateReferenceTargetPostcondition.Match newEmptyMatch() {
    return UpdateReferenceTargetPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public UpdateReferenceTargetPostcondition.Match newMatch(final Object... parameters) {
    return UpdateReferenceTargetPostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3], (se.mdh.idt.benji.trace.Trace) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link UpdateReferenceTargetPostcondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link UpdateReferenceTargetPostcondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final UpdateReferenceTargetPostcondition INSTANCE = new UpdateReferenceTargetPostcondition();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final UpdateReferenceTargetPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_process = new PParameter("process", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_taskOne = new PParameter("taskOne", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_taskTwo = new PParameter("taskTwo", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_taskThree = new PParameter("taskThree", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_sequenceFlow = new PParameter("sequenceFlow", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_process, parameter_taskOne, parameter_taskTwo, parameter_taskThree, parameter_sequenceFlow);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.bpmn2.benchmark.UpdateReferenceTargetPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("process","taskOne","taskTwo","taskThree","sequenceFlow");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_process = body.getOrCreateVariableByName("process");
          PVariable var_taskOne = body.getOrCreateVariableByName("taskOne");
          PVariable var_taskTwo = body.getOrCreateVariableByName("taskTwo");
          PVariable var_taskThree = body.getOrCreateVariableByName("taskThree");
          PVariable var_sequenceFlow = body.getOrCreateVariableByName("sequenceFlow");
          PVariable var_initialTaskOne = body.getOrCreateVariableByName("initialTaskOne");
          PVariable var_currentTaskOne = body.getOrCreateVariableByName("currentTaskOne");
          PVariable var_taskOneName = body.getOrCreateVariableByName("taskOneName");
          PVariable var_initialTaskTwo = body.getOrCreateVariableByName("initialTaskTwo");
          PVariable var_currentTaskTwo = body.getOrCreateVariableByName("currentTaskTwo");
          PVariable var_taskTwoName = body.getOrCreateVariableByName("taskTwoName");
          PVariable var_initialTaskThree = body.getOrCreateVariableByName("initialTaskThree");
          PVariable var_currentTaskThree = body.getOrCreateVariableByName("currentTaskThree");
          PVariable var_taskThreeName = body.getOrCreateVariableByName("taskThreeName");
          PVariable var_initialSequenceFlow = body.getOrCreateVariableByName("initialSequenceFlow");
          PVariable var_currentSequenceFlow = body.getOrCreateVariableByName("currentSequenceFlow");
          PVariable var_initialProcess = body.getOrCreateVariableByName("initialProcess");
          PVariable var_currentProcess = body.getOrCreateVariableByName("currentProcess");
          new TypeConstraint(body, Tuples.flatTupleOf(var_process), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskThree), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_sequenceFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_process, parameter_process),
             new ExportedParameter(body, var_taskOne, parameter_taskOne),
             new ExportedParameter(body, var_taskTwo, parameter_taskTwo),
             new ExportedParameter(body, var_taskThree, parameter_taskThree),
             new ExportedParameter(body, var_sequenceFlow, parameter_sequenceFlow)
          ));
          // 		Trace.initial(taskOne, initialTaskOne)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskOne, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_initialTaskOne);
          // 	Trace.current(taskOne, currentTaskOne)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskOne, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_currentTaskOne);
          // 	Task.name(initialTaskOne, taskOneName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskOne, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_taskOneName);
          // 	Task.name(currentTaskOne, taskOneName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskOne, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var_taskOneName);
          // 	taskOneName == "Task 1"
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "Task 1");
          new Equality(body, var_taskOneName, var__virtual_4_);
          // 		Trace.initial(taskTwo, initialTaskTwo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskTwo, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_5_, var_initialTaskTwo);
          // 	Trace.current(taskTwo, currentTaskTwo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskTwo, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_6_, var_currentTaskTwo);
          // 	Task.name(initialTaskTwo, taskTwoName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskTwo, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_7_, var_taskTwoName);
          // 	Task.name(currentTaskTwo, taskTwoName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskTwo, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_8_, var_taskTwoName);
          // 	taskTwoName == "Task 2"
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "Task 2");
          new Equality(body, var_taskTwoName, var__virtual_9_);
          // 		Trace.initial(taskThree, initialTaskThree)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskThree), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskThree, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_10_, var_initialTaskThree);
          // 	Trace.current(taskThree, currentTaskThree)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskThree), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskThree, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_11_, var_currentTaskThree);
          // 	Task.name(initialTaskThree, taskThreeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskThree), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskThree, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_12_, var_taskThreeName);
          // 	Task.name(currentTaskThree, taskThreeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskThree), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskThree, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_13_, var_taskThreeName);
          // 	taskThreeName == "Task 3"
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new ConstantValue(body, var__virtual_14_, "Task 3");
          new Equality(body, var_taskThreeName, var__virtual_14_);
          // 		Trace.initial(sequenceFlow, initialSequenceFlow)
          new TypeConstraint(body, Tuples.flatTupleOf(var_sequenceFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_sequenceFlow, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_15_, var_initialSequenceFlow);
          // 	Trace.current(sequenceFlow, currentSequenceFlow)
          new TypeConstraint(body, Tuples.flatTupleOf(var_sequenceFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_sequenceFlow, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_16_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_16_, var_currentSequenceFlow);
          // 	SequenceFlow.sourceRef(initialSequenceFlow, initialTaskOne)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialSequenceFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow")));
          PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialSequenceFlow, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow", "sourceRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_17_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_17_, var_initialTaskOne);
          // 	SequenceFlow.sourceRef(currentSequenceFlow, currentTaskOne)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentSequenceFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow")));
          PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentSequenceFlow, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow", "sourceRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_18_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_18_, var_currentTaskOne);
          // 	SequenceFlow.targetRef(initialSequenceFlow, initialTaskTwo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialSequenceFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow")));
          PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialSequenceFlow, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow", "targetRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_19_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_19_, var_initialTaskTwo);
          // 	SequenceFlow.targetRef(currentSequenceFlow, currentTaskThree)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentSequenceFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow")));
          PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentSequenceFlow, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "SequenceFlow", "targetRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_20_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_20_, var_currentTaskThree);
          // 		Trace.initial(process, initialProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_process), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_21_ = body.getOrCreateVariableByName(".virtual{21}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_process, var__virtual_21_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_21_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_21_, var_initialProcess);
          // 	Trace.current(process, currentProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_process), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_22_ = body.getOrCreateVariableByName(".virtual{22}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_process, var__virtual_22_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_22_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_22_, var_currentProcess);
          // 	Process.flowElements(initialProcess, initialTaskOne)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_23_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_23_, var_initialTaskOne);
          // 	Process.flowElements(currentProcess, currentTaskOne)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_24_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_24_, var_currentTaskOne);
          // 	Process.flowElements(initialProcess, initialTaskTwo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_25_ = body.getOrCreateVariableByName(".virtual{25}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_25_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_25_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_25_, var_initialTaskTwo);
          // 	Process.flowElements(currentProcess, currentTaskTwo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_26_ = body.getOrCreateVariableByName(".virtual{26}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_26_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_26_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_26_, var_currentTaskTwo);
          // 	Process.flowElements(initialProcess, initialTaskThree)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_27_ = body.getOrCreateVariableByName(".virtual{27}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_27_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_27_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_27_, var_initialTaskThree);
          // 	Process.flowElements(currentProcess, currentTaskThree)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_28_ = body.getOrCreateVariableByName(".virtual{28}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_28_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_28_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_28_, var_currentTaskThree);
          // 	Process.flowElements(initialProcess, initialSequenceFlow)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_29_ = body.getOrCreateVariableByName(".virtual{29}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_29_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_29_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_29_, var_initialSequenceFlow);
          // 	Process.flowElements(currentProcess, currentSequenceFlow)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Process")));
          PVariable var__virtual_30_ = body.getOrCreateVariableByName(".virtual{30}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_30_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_30_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_30_, var_currentSequenceFlow);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
