/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.models20/src/se/mdh/idt/benji/examples/models20/bpmn2/Queries.vql
 */
package se.mdh.idt.benji.examples.models20.bpmn2;

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
 *         // Move Renamed Element - Postcondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern ExchangeLocationOfElementsPostcondition(
 *         	process: Trace,
 *         	leftSubProcess: Trace, leftTask: Trace,
 *         	rightSubProcess: Trace, rightTask: Trace
 *         ) {
 *         	
 *         	Trace.initial(leftTask, initialLeftTask);
 *         	Trace.current(leftTask, currentLeftTask);
 *         	Task.name(initialLeftTask, leftTaskName);
 *         	Task.name(currentLeftTask, leftTaskName);
 *         	leftTaskName == "doSomething";
 *         	
 *         	Trace.initial(rightTask, initialRightTask);
 *         	Trace.current(rightTask, currentRightTask);
 *         	Task.name(initialRightTask, rightTaskName);
 *         	Task.name(currentRightTask, rightTaskName);
 *         	rightTaskName == "doSomethingNew";
 *         	
 *         	Trace.initial(leftSubProcess, initialLeftSubProcess);
 *         	Trace.current(rightSubProcess, currentRightSubProcess);
 *         	SubProcess.name(initialLeftSubProcess, leftSubProcessName);
 *         	SubProcess.name(currentLeftSubProcess, leftSubProcessName);
 *         	leftSubProcessName == "Left";
 *         	SubProcess.flowElements(initialLeftSubProcess, initialLeftTask);
 *         	SubProcess.flowElements(currentLeftSubProcess, currentRightTask);
 *         	
 *         	Trace.initial(rightSubProcess, initialRightSubProcess);
 *         	Trace.current(rightSubProcess, currentRightSubProcess);
 *         	SubProcess.name(initialRightSubProcess, rightSubProcessName);
 *         	SubProcess.name(currentRightSubProcess, rightSubProcessName);
 *         	rightSubProcessName == "Right";
 *         	SubProcess.flowElements(initialRightSubProcess, initialRightTask);
 *         	SubProcess.flowElements(currentRightSubProcess, currentLeftTask);
 *         	
 *         	Trace.initial(process, initialProcess);
 *         	Trace.current(process, currentProcess);
 *         	Process.flowElements(initialProcess, initialLeftSubProcess);
 *         	Process.flowElements(currentProcess, currentLeftSubProcess);
 *         	Process.flowElements(initialProcess, initialRightSubProcess);
 *         	Process.flowElements(currentProcess, currentRightSubProcess);
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ExchangeLocationOfElementsPostcondition extends BaseGeneratedEMFQuerySpecification<ExchangeLocationOfElementsPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.models20.bpmn2.ExchangeLocationOfElementsPostcondition pattern,
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
    
    private Trace fLeftSubProcess;
    
    private Trace fLeftTask;
    
    private Trace fRightSubProcess;
    
    private Trace fRightTask;
    
    private static List<String> parameterNames = makeImmutableList("process", "leftSubProcess", "leftTask", "rightSubProcess", "rightTask");
    
    private Match(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      this.fProcess = pProcess;
      this.fLeftSubProcess = pLeftSubProcess;
      this.fLeftTask = pLeftTask;
      this.fRightSubProcess = pRightSubProcess;
      this.fRightTask = pRightTask;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "process": return this.fProcess;
          case "leftSubProcess": return this.fLeftSubProcess;
          case "leftTask": return this.fLeftTask;
          case "rightSubProcess": return this.fRightSubProcess;
          case "rightTask": return this.fRightTask;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fProcess;
          case 1: return this.fLeftSubProcess;
          case 2: return this.fLeftTask;
          case 3: return this.fRightSubProcess;
          case 4: return this.fRightTask;
          default: return null;
      }
    }
    
    public Trace getProcess() {
      return this.fProcess;
    }
    
    public Trace getLeftSubProcess() {
      return this.fLeftSubProcess;
    }
    
    public Trace getLeftTask() {
      return this.fLeftTask;
    }
    
    public Trace getRightSubProcess() {
      return this.fRightSubProcess;
    }
    
    public Trace getRightTask() {
      return this.fRightTask;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("process".equals(parameterName) ) {
          this.fProcess = (Trace) newValue;
          return true;
      }
      if ("leftSubProcess".equals(parameterName) ) {
          this.fLeftSubProcess = (Trace) newValue;
          return true;
      }
      if ("leftTask".equals(parameterName) ) {
          this.fLeftTask = (Trace) newValue;
          return true;
      }
      if ("rightSubProcess".equals(parameterName) ) {
          this.fRightSubProcess = (Trace) newValue;
          return true;
      }
      if ("rightTask".equals(parameterName) ) {
          this.fRightTask = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setProcess(final Trace pProcess) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProcess = pProcess;
    }
    
    public void setLeftSubProcess(final Trace pLeftSubProcess) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLeftSubProcess = pLeftSubProcess;
    }
    
    public void setLeftTask(final Trace pLeftTask) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLeftTask = pLeftTask;
    }
    
    public void setRightSubProcess(final Trace pRightSubProcess) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRightSubProcess = pRightSubProcess;
    }
    
    public void setRightTask(final Trace pRightTask) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRightTask = pRightTask;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.models20.bpmn2.ExchangeLocationOfElementsPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExchangeLocationOfElementsPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fProcess, fLeftSubProcess, fLeftTask, fRightSubProcess, fRightTask};
    }
    
    @Override
    public ExchangeLocationOfElementsPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fProcess, fLeftSubProcess, fLeftTask, fRightSubProcess, fRightTask) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"process\"=" + prettyPrintValue(fProcess) + ", ");
      result.append("\"leftSubProcess\"=" + prettyPrintValue(fLeftSubProcess) + ", ");
      result.append("\"leftTask\"=" + prettyPrintValue(fLeftTask) + ", ");
      result.append("\"rightSubProcess\"=" + prettyPrintValue(fRightSubProcess) + ", ");
      result.append("\"rightTask\"=" + prettyPrintValue(fRightTask));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fProcess, fLeftSubProcess, fLeftTask, fRightSubProcess, fRightTask);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ExchangeLocationOfElementsPostcondition.Match)) {
          ExchangeLocationOfElementsPostcondition.Match other = (ExchangeLocationOfElementsPostcondition.Match) obj;
          return Objects.equals(fProcess, other.fProcess) && Objects.equals(fLeftSubProcess, other.fLeftSubProcess) && Objects.equals(fLeftTask, other.fLeftTask) && Objects.equals(fRightSubProcess, other.fRightSubProcess) && Objects.equals(fRightTask, other.fRightTask);
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
    public ExchangeLocationOfElementsPostcondition specification() {
      return ExchangeLocationOfElementsPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ExchangeLocationOfElementsPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExchangeLocationOfElementsPostcondition.Match newMutableMatch(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return new Mutable(pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExchangeLocationOfElementsPostcondition.Match newMatch(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return new Immutable(pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask);
    }
    
    private static final class Mutable extends ExchangeLocationOfElementsPostcondition.Match {
      Mutable(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
        super(pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExchangeLocationOfElementsPostcondition.Match {
      Immutable(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
        super(pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.models20.bpmn2.ExchangeLocationOfElementsPostcondition pattern,
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
   * // Move Renamed Element - Postcondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern ExchangeLocationOfElementsPostcondition(
   * 	process: Trace,
   * 	leftSubProcess: Trace, leftTask: Trace,
   * 	rightSubProcess: Trace, rightTask: Trace
   * ) {
   * 	
   * 	Trace.initial(leftTask, initialLeftTask);
   * 	Trace.current(leftTask, currentLeftTask);
   * 	Task.name(initialLeftTask, leftTaskName);
   * 	Task.name(currentLeftTask, leftTaskName);
   * 	leftTaskName == "doSomething";
   * 	
   * 	Trace.initial(rightTask, initialRightTask);
   * 	Trace.current(rightTask, currentRightTask);
   * 	Task.name(initialRightTask, rightTaskName);
   * 	Task.name(currentRightTask, rightTaskName);
   * 	rightTaskName == "doSomethingNew";
   * 	
   * 	Trace.initial(leftSubProcess, initialLeftSubProcess);
   * 	Trace.current(rightSubProcess, currentRightSubProcess);
   * 	SubProcess.name(initialLeftSubProcess, leftSubProcessName);
   * 	SubProcess.name(currentLeftSubProcess, leftSubProcessName);
   * 	leftSubProcessName == "Left";
   * 	SubProcess.flowElements(initialLeftSubProcess, initialLeftTask);
   * 	SubProcess.flowElements(currentLeftSubProcess, currentRightTask);
   * 	
   * 	Trace.initial(rightSubProcess, initialRightSubProcess);
   * 	Trace.current(rightSubProcess, currentRightSubProcess);
   * 	SubProcess.name(initialRightSubProcess, rightSubProcessName);
   * 	SubProcess.name(currentRightSubProcess, rightSubProcessName);
   * 	rightSubProcessName == "Right";
   * 	SubProcess.flowElements(initialRightSubProcess, initialRightTask);
   * 	SubProcess.flowElements(currentRightSubProcess, currentLeftTask);
   * 	
   * 	Trace.initial(process, initialProcess);
   * 	Trace.current(process, currentProcess);
   * 	Process.flowElements(initialProcess, initialLeftSubProcess);
   * 	Process.flowElements(currentProcess, currentLeftSubProcess);
   * 	Process.flowElements(initialProcess, initialRightSubProcess);
   * 	Process.flowElements(currentProcess, currentRightSubProcess);
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ExchangeLocationOfElementsPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<ExchangeLocationOfElementsPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ExchangeLocationOfElementsPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ExchangeLocationOfElementsPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PROCESS = 0;
    
    private static final int POSITION_LEFTSUBPROCESS = 1;
    
    private static final int POSITION_LEFTTASK = 2;
    
    private static final int POSITION_RIGHTSUBPROCESS = 3;
    
    private static final int POSITION_RIGHTTASK = 4;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExchangeLocationOfElementsPostcondition.Matcher.class);
    
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
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExchangeLocationOfElementsPostcondition.Match> getAllMatches(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllMatches(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ExchangeLocationOfElementsPostcondition.Match> streamAllMatches(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllMatches(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ExchangeLocationOfElementsPostcondition.Match> getOneArbitraryMatch(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawGetOneArbitraryMatch(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawHasMatch(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawCountMatches(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask, final Consumer<? super ExchangeLocationOfElementsPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pLeftSubProcess the fixed value of pattern parameter leftSubProcess, or null if not bound.
     * @param pLeftTask the fixed value of pattern parameter leftTask, or null if not bound.
     * @param pRightSubProcess the fixed value of pattern parameter rightSubProcess, or null if not bound.
     * @param pRightTask the fixed value of pattern parameter rightTask, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExchangeLocationOfElementsPostcondition.Match newMatch(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return ExchangeLocationOfElementsPostcondition.Match.newMatch(pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask);
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
    public Stream<Trace> streamAllValuesOfprocess(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfprocess(final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllValuesOfprocess(new Object[]{null, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask});
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfprocess(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfprocess(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfprocess(final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllValuesOfprocess(new Object[]{null, pLeftSubProcess, pLeftTask, pRightSubProcess, pRightTask}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfleftSubProcess(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LEFTSUBPROCESS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfleftSubProcess() {
      return rawStreamAllValuesOfleftSubProcess(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfleftSubProcess() {
      return rawStreamAllValuesOfleftSubProcess(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftSubProcess.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfleftSubProcess(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfleftSubProcess(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftSubProcess.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfleftSubProcess(final Trace pProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllValuesOfleftSubProcess(new Object[]{pProcess, null, pLeftTask, pRightSubProcess, pRightTask});
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfleftSubProcess(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfleftSubProcess(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfleftSubProcess(final Trace pProcess, final Trace pLeftTask, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllValuesOfleftSubProcess(new Object[]{pProcess, null, pLeftTask, pRightSubProcess, pRightTask}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfleftTask(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LEFTTASK, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfleftTask() {
      return rawStreamAllValuesOfleftTask(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfleftTask() {
      return rawStreamAllValuesOfleftTask(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftTask.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfleftTask(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfleftTask(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftTask.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfleftTask(final Trace pProcess, final Trace pLeftSubProcess, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllValuesOfleftTask(new Object[]{pProcess, pLeftSubProcess, null, pRightSubProcess, pRightTask});
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfleftTask(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfleftTask(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfleftTask(final Trace pProcess, final Trace pLeftSubProcess, final Trace pRightSubProcess, final Trace pRightTask) {
      return rawStreamAllValuesOfleftTask(new Object[]{pProcess, pLeftSubProcess, null, pRightSubProcess, pRightTask}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfrightSubProcess(final Object[] parameters) {
      return rawStreamAllValues(POSITION_RIGHTSUBPROCESS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfrightSubProcess() {
      return rawStreamAllValuesOfrightSubProcess(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfrightSubProcess() {
      return rawStreamAllValuesOfrightSubProcess(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightSubProcess.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfrightSubProcess(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfrightSubProcess(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightSubProcess.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfrightSubProcess(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightTask) {
      return rawStreamAllValuesOfrightSubProcess(new Object[]{pProcess, pLeftSubProcess, pLeftTask, null, pRightTask});
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfrightSubProcess(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfrightSubProcess(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightSubProcess.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfrightSubProcess(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightTask) {
      return rawStreamAllValuesOfrightSubProcess(new Object[]{pProcess, pLeftSubProcess, pLeftTask, null, pRightTask}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfrightTask(final Object[] parameters) {
      return rawStreamAllValues(POSITION_RIGHTTASK, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfrightTask() {
      return rawStreamAllValuesOfrightTask(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfrightTask() {
      return rawStreamAllValuesOfrightTask(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightTask.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfrightTask(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfrightTask(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightTask.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfrightTask(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess) {
      return rawStreamAllValuesOfrightTask(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfrightTask(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfrightTask(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfrightTask(final Trace pProcess, final Trace pLeftSubProcess, final Trace pLeftTask, final Trace pRightSubProcess) {
      return rawStreamAllValuesOfrightTask(new Object[]{pProcess, pLeftSubProcess, pLeftTask, pRightSubProcess, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ExchangeLocationOfElementsPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExchangeLocationOfElementsPostcondition.Match.newMatch((Trace) t.get(POSITION_PROCESS), (Trace) t.get(POSITION_LEFTSUBPROCESS), (Trace) t.get(POSITION_LEFTTASK), (Trace) t.get(POSITION_RIGHTSUBPROCESS), (Trace) t.get(POSITION_RIGHTTASK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExchangeLocationOfElementsPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExchangeLocationOfElementsPostcondition.Match.newMatch((Trace) match[POSITION_PROCESS], (Trace) match[POSITION_LEFTSUBPROCESS], (Trace) match[POSITION_LEFTTASK], (Trace) match[POSITION_RIGHTSUBPROCESS], (Trace) match[POSITION_RIGHTTASK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExchangeLocationOfElementsPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExchangeLocationOfElementsPostcondition.Match.newMutableMatch((Trace) match[POSITION_PROCESS], (Trace) match[POSITION_LEFTSUBPROCESS], (Trace) match[POSITION_LEFTTASK], (Trace) match[POSITION_RIGHTSUBPROCESS], (Trace) match[POSITION_RIGHTTASK]);
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
    public static IQuerySpecification<ExchangeLocationOfElementsPostcondition.Matcher> querySpecification() {
      return ExchangeLocationOfElementsPostcondition.instance();
    }
  }
  
  private ExchangeLocationOfElementsPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ExchangeLocationOfElementsPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExchangeLocationOfElementsPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ExchangeLocationOfElementsPostcondition.Matcher.on(engine);
  }
  
  @Override
  public ExchangeLocationOfElementsPostcondition.Matcher instantiate() {
    return ExchangeLocationOfElementsPostcondition.Matcher.create();
  }
  
  @Override
  public ExchangeLocationOfElementsPostcondition.Match newEmptyMatch() {
    return ExchangeLocationOfElementsPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public ExchangeLocationOfElementsPostcondition.Match newMatch(final Object... parameters) {
    return ExchangeLocationOfElementsPostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3], (se.mdh.idt.benji.trace.Trace) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ExchangeLocationOfElementsPostcondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ExchangeLocationOfElementsPostcondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ExchangeLocationOfElementsPostcondition INSTANCE = new ExchangeLocationOfElementsPostcondition();
    
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
    private static final ExchangeLocationOfElementsPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_process = new PParameter("process", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_leftSubProcess = new PParameter("leftSubProcess", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_leftTask = new PParameter("leftTask", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_rightSubProcess = new PParameter("rightSubProcess", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_rightTask = new PParameter("rightTask", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_process, parameter_leftSubProcess, parameter_leftTask, parameter_rightSubProcess, parameter_rightTask);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.models20.bpmn2.ExchangeLocationOfElementsPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("process","leftSubProcess","leftTask","rightSubProcess","rightTask");
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
          PVariable var_leftSubProcess = body.getOrCreateVariableByName("leftSubProcess");
          PVariable var_leftTask = body.getOrCreateVariableByName("leftTask");
          PVariable var_rightSubProcess = body.getOrCreateVariableByName("rightSubProcess");
          PVariable var_rightTask = body.getOrCreateVariableByName("rightTask");
          PVariable var_initialLeftTask = body.getOrCreateVariableByName("initialLeftTask");
          PVariable var_currentLeftTask = body.getOrCreateVariableByName("currentLeftTask");
          PVariable var_leftTaskName = body.getOrCreateVariableByName("leftTaskName");
          PVariable var_initialRightTask = body.getOrCreateVariableByName("initialRightTask");
          PVariable var_currentRightTask = body.getOrCreateVariableByName("currentRightTask");
          PVariable var_rightTaskName = body.getOrCreateVariableByName("rightTaskName");
          PVariable var_initialLeftSubProcess = body.getOrCreateVariableByName("initialLeftSubProcess");
          PVariable var_currentRightSubProcess = body.getOrCreateVariableByName("currentRightSubProcess");
          PVariable var_leftSubProcessName = body.getOrCreateVariableByName("leftSubProcessName");
          PVariable var_currentLeftSubProcess = body.getOrCreateVariableByName("currentLeftSubProcess");
          PVariable var_initialRightSubProcess = body.getOrCreateVariableByName("initialRightSubProcess");
          PVariable var_rightSubProcessName = body.getOrCreateVariableByName("rightSubProcessName");
          PVariable var_initialProcess = body.getOrCreateVariableByName("initialProcess");
          PVariable var_currentProcess = body.getOrCreateVariableByName("currentProcess");
          new TypeConstraint(body, Tuples.flatTupleOf(var_process), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_process, parameter_process),
             new ExportedParameter(body, var_leftSubProcess, parameter_leftSubProcess),
             new ExportedParameter(body, var_leftTask, parameter_leftTask),
             new ExportedParameter(body, var_rightSubProcess, parameter_rightSubProcess),
             new ExportedParameter(body, var_rightTask, parameter_rightTask)
          ));
          // 		Trace.initial(leftTask, initialLeftTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftTask, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_initialLeftTask);
          // 	Trace.current(leftTask, currentLeftTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftTask, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_currentLeftTask);
          // 	Task.name(initialLeftTask, leftTaskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialLeftTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Task")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialLeftTask, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_leftTaskName);
          // 	Task.name(currentLeftTask, leftTaskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentLeftTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Task")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentLeftTask, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var_leftTaskName);
          // 	leftTaskName == "doSomething"
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "doSomething");
          new Equality(body, var_leftTaskName, var__virtual_4_);
          // 		Trace.initial(rightTask, initialRightTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightTask, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_5_, var_initialRightTask);
          // 	Trace.current(rightTask, currentRightTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightTask, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_6_, var_currentRightTask);
          // 	Task.name(initialRightTask, rightTaskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialRightTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Task")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialRightTask, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_7_, var_rightTaskName);
          // 	Task.name(currentRightTask, rightTaskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentRightTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Task")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentRightTask, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_8_, var_rightTaskName);
          // 	rightTaskName == "doSomethingNew"
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "doSomethingNew");
          new Equality(body, var_rightTaskName, var__virtual_9_);
          // 		Trace.initial(leftSubProcess, initialLeftSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftSubProcess, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_10_, var_initialLeftSubProcess);
          // 	Trace.current(rightSubProcess, currentRightSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightSubProcess, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_11_, var_currentRightSubProcess);
          // 	SubProcess.name(initialLeftSubProcess, leftSubProcessName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialLeftSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialLeftSubProcess, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_12_, var_leftSubProcessName);
          // 	SubProcess.name(currentLeftSubProcess, leftSubProcessName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentLeftSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentLeftSubProcess, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_13_, var_leftSubProcessName);
          // 	leftSubProcessName == "Left"
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new ConstantValue(body, var__virtual_14_, "Left");
          new Equality(body, var_leftSubProcessName, var__virtual_14_);
          // 	SubProcess.flowElements(initialLeftSubProcess, initialLeftTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialLeftSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialLeftSubProcess, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_15_, var_initialLeftTask);
          // 	SubProcess.flowElements(currentLeftSubProcess, currentRightTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentLeftSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentLeftSubProcess, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_16_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_16_, var_currentRightTask);
          // 		Trace.initial(rightSubProcess, initialRightSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightSubProcess, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_17_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_17_, var_initialRightSubProcess);
          // 	Trace.current(rightSubProcess, currentRightSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightSubProcess, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_18_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_18_, var_currentRightSubProcess);
          // 	SubProcess.name(initialRightSubProcess, rightSubProcessName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialRightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialRightSubProcess, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_19_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_19_, var_rightSubProcessName);
          // 	SubProcess.name(currentRightSubProcess, rightSubProcessName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentRightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentRightSubProcess, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_20_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_20_, var_rightSubProcessName);
          // 	rightSubProcessName == "Right"
          PVariable var__virtual_21_ = body.getOrCreateVariableByName(".virtual{21}");
          new ConstantValue(body, var__virtual_21_, "Right");
          new Equality(body, var_rightSubProcessName, var__virtual_21_);
          // 	SubProcess.flowElements(initialRightSubProcess, initialRightTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialRightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_22_ = body.getOrCreateVariableByName(".virtual{22}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialRightSubProcess, var__virtual_22_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_22_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_22_, var_initialRightTask);
          // 	SubProcess.flowElements(currentRightSubProcess, currentLeftTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentRightSubProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SubProcess")));
          PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentRightSubProcess, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_23_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_23_, var_currentLeftTask);
          // 		Trace.initial(process, initialProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_process), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_process, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_24_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_24_, var_initialProcess);
          // 	Trace.current(process, currentProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_process), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_25_ = body.getOrCreateVariableByName(".virtual{25}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_process, var__virtual_25_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_25_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_25_, var_currentProcess);
          // 	Process.flowElements(initialProcess, initialLeftSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_26_ = body.getOrCreateVariableByName(".virtual{26}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_26_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_26_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_26_, var_initialLeftSubProcess);
          // 	Process.flowElements(currentProcess, currentLeftSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_27_ = body.getOrCreateVariableByName(".virtual{27}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_27_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_27_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_27_, var_currentLeftSubProcess);
          // 	Process.flowElements(initialProcess, initialRightSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_28_ = body.getOrCreateVariableByName(".virtual{28}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_28_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_28_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_28_, var_initialRightSubProcess);
          // 	Process.flowElements(currentProcess, currentRightSubProcess)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_29_ = body.getOrCreateVariableByName(".virtual{29}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_29_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_29_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_29_, var_currentRightSubProcess);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
