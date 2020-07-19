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
 *         // Move Element - Precondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern MoveElementPrecondition(
 *         	process: Trace, 								 
 *         	startEvent: Trace, task: Trace, endEvent: Trace, 
 *         	startEventToTask: Trace, taskToEndEvent: Trace 	 
 *         ) {
 *         	
 *         	Trace.initial(startEvent, initialStartEvent);
 *         	Trace.current(startEvent, currentStartEvent);
 *         	StartEvent(initialStartEvent);
 *         	StartEvent(currentStartEvent);
 *         	
 *         	Trace.initial(task, initialTask);
 *         	Trace.current(task, currentTask);
 *         	Task.name(initialTask, taskName);
 *         	Task.name(currentTask, taskName);
 *         	taskName == "Deliver Goods";
 *         	
 *         	Trace.initial(endEvent, initialEndEvent);
 *         	Trace.current(endEvent, currentEndEvent);
 *         	EndEvent(initialEndEvent);
 *         	EndEvent(currentEndEvent);
 *         	
 *         	Trace.initial(startEventToTask, initialStartEventToTask);
 *         	Trace.current(startEventToTask, currentStartEventToTask);
 *         	SequenceFlow.sourceRef(initialStartEventToTask, initialStartEvent);
 *         	SequenceFlow.sourceRef(currentStartEventToTask, currentStartEvent);
 *         	SequenceFlow.targetRef(initialStartEventToTask, initialTask);
 *         	SequenceFlow.targetRef(currentStartEventToTask, currentTask);
 *         	
 *         	Trace.initial(taskToEndEvent, initialTaskToEndEvent);
 *         	Trace.current(taskToEndEvent, currentTaskToEndEvent);
 *         	SequenceFlow.sourceRef(initialTaskToEndEvent, initialTask);
 *         	SequenceFlow.sourceRef(currentTaskToEndEvent, currentTask);
 *         	SequenceFlow.targetRef(initialTaskToEndEvent, initialEndEvent);
 *         	SequenceFlow.targetRef(currentTaskToEndEvent, currentEndEvent);
 *         	
 *         	Trace.initial(process, initialProcess);
 *         	Trace.current(process, currentProcess);
 *         	Process.flowElements(initialProcess, initialStartEvent);
 *         	Process.flowElements(currentProcess, currentStartEvent);
 *         	Process.flowElements(initialProcess, initialTask);
 *         	Process.flowElements(currentProcess, currentTask);
 *         	Process.flowElements(initialProcess, initialEndEvent);
 *         	Process.flowElements(currentProcess, currentEndEvent);
 *         	Process.flowElements(initialProcess, initialStartEventToTask);
 *         	Process.flowElements(currentProcess, currentStartEventToTask);
 *         	Process.flowElements(initialProcess, initialTaskToEndEvent);
 *         	Process.flowElements(currentProcess, currentTaskToEndEvent);
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MoveElementPrecondition extends BaseGeneratedEMFQuerySpecification<MoveElementPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.models20.bpmn2.MoveElementPrecondition pattern,
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
    
    private Trace fStartEvent;
    
    private Trace fTask;
    
    private Trace fEndEvent;
    
    private Trace fStartEventToTask;
    
    private Trace fTaskToEndEvent;
    
    private static List<String> parameterNames = makeImmutableList("process", "startEvent", "task", "endEvent", "startEventToTask", "taskToEndEvent");
    
    private Match(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      this.fProcess = pProcess;
      this.fStartEvent = pStartEvent;
      this.fTask = pTask;
      this.fEndEvent = pEndEvent;
      this.fStartEventToTask = pStartEventToTask;
      this.fTaskToEndEvent = pTaskToEndEvent;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "process": return this.fProcess;
          case "startEvent": return this.fStartEvent;
          case "task": return this.fTask;
          case "endEvent": return this.fEndEvent;
          case "startEventToTask": return this.fStartEventToTask;
          case "taskToEndEvent": return this.fTaskToEndEvent;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fProcess;
          case 1: return this.fStartEvent;
          case 2: return this.fTask;
          case 3: return this.fEndEvent;
          case 4: return this.fStartEventToTask;
          case 5: return this.fTaskToEndEvent;
          default: return null;
      }
    }
    
    public Trace getProcess() {
      return this.fProcess;
    }
    
    public Trace getStartEvent() {
      return this.fStartEvent;
    }
    
    public Trace getTask() {
      return this.fTask;
    }
    
    public Trace getEndEvent() {
      return this.fEndEvent;
    }
    
    public Trace getStartEventToTask() {
      return this.fStartEventToTask;
    }
    
    public Trace getTaskToEndEvent() {
      return this.fTaskToEndEvent;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("process".equals(parameterName) ) {
          this.fProcess = (Trace) newValue;
          return true;
      }
      if ("startEvent".equals(parameterName) ) {
          this.fStartEvent = (Trace) newValue;
          return true;
      }
      if ("task".equals(parameterName) ) {
          this.fTask = (Trace) newValue;
          return true;
      }
      if ("endEvent".equals(parameterName) ) {
          this.fEndEvent = (Trace) newValue;
          return true;
      }
      if ("startEventToTask".equals(parameterName) ) {
          this.fStartEventToTask = (Trace) newValue;
          return true;
      }
      if ("taskToEndEvent".equals(parameterName) ) {
          this.fTaskToEndEvent = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setProcess(final Trace pProcess) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProcess = pProcess;
    }
    
    public void setStartEvent(final Trace pStartEvent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStartEvent = pStartEvent;
    }
    
    public void setTask(final Trace pTask) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTask = pTask;
    }
    
    public void setEndEvent(final Trace pEndEvent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEndEvent = pEndEvent;
    }
    
    public void setStartEventToTask(final Trace pStartEventToTask) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStartEventToTask = pStartEventToTask;
    }
    
    public void setTaskToEndEvent(final Trace pTaskToEndEvent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTaskToEndEvent = pTaskToEndEvent;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.models20.bpmn2.MoveElementPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MoveElementPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fProcess, fStartEvent, fTask, fEndEvent, fStartEventToTask, fTaskToEndEvent};
    }
    
    @Override
    public MoveElementPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fProcess, fStartEvent, fTask, fEndEvent, fStartEventToTask, fTaskToEndEvent) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"process\"=" + prettyPrintValue(fProcess) + ", ");
      result.append("\"startEvent\"=" + prettyPrintValue(fStartEvent) + ", ");
      result.append("\"task\"=" + prettyPrintValue(fTask) + ", ");
      result.append("\"endEvent\"=" + prettyPrintValue(fEndEvent) + ", ");
      result.append("\"startEventToTask\"=" + prettyPrintValue(fStartEventToTask) + ", ");
      result.append("\"taskToEndEvent\"=" + prettyPrintValue(fTaskToEndEvent));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fProcess, fStartEvent, fTask, fEndEvent, fStartEventToTask, fTaskToEndEvent);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MoveElementPrecondition.Match)) {
          MoveElementPrecondition.Match other = (MoveElementPrecondition.Match) obj;
          return Objects.equals(fProcess, other.fProcess) && Objects.equals(fStartEvent, other.fStartEvent) && Objects.equals(fTask, other.fTask) && Objects.equals(fEndEvent, other.fEndEvent) && Objects.equals(fStartEventToTask, other.fStartEventToTask) && Objects.equals(fTaskToEndEvent, other.fTaskToEndEvent);
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
    public MoveElementPrecondition specification() {
      return MoveElementPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MoveElementPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MoveElementPrecondition.Match newMutableMatch(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return new Mutable(pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MoveElementPrecondition.Match newMatch(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return new Immutable(pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent);
    }
    
    private static final class Mutable extends MoveElementPrecondition.Match {
      Mutable(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
        super(pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MoveElementPrecondition.Match {
      Immutable(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
        super(pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.models20.bpmn2.MoveElementPrecondition pattern,
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
   * // Move Element - Precondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern MoveElementPrecondition(
   * 	process: Trace, 								 
   * 	startEvent: Trace, task: Trace, endEvent: Trace, 
   * 	startEventToTask: Trace, taskToEndEvent: Trace 	 
   * ) {
   * 	
   * 	Trace.initial(startEvent, initialStartEvent);
   * 	Trace.current(startEvent, currentStartEvent);
   * 	StartEvent(initialStartEvent);
   * 	StartEvent(currentStartEvent);
   * 	
   * 	Trace.initial(task, initialTask);
   * 	Trace.current(task, currentTask);
   * 	Task.name(initialTask, taskName);
   * 	Task.name(currentTask, taskName);
   * 	taskName == "Deliver Goods";
   * 	
   * 	Trace.initial(endEvent, initialEndEvent);
   * 	Trace.current(endEvent, currentEndEvent);
   * 	EndEvent(initialEndEvent);
   * 	EndEvent(currentEndEvent);
   * 	
   * 	Trace.initial(startEventToTask, initialStartEventToTask);
   * 	Trace.current(startEventToTask, currentStartEventToTask);
   * 	SequenceFlow.sourceRef(initialStartEventToTask, initialStartEvent);
   * 	SequenceFlow.sourceRef(currentStartEventToTask, currentStartEvent);
   * 	SequenceFlow.targetRef(initialStartEventToTask, initialTask);
   * 	SequenceFlow.targetRef(currentStartEventToTask, currentTask);
   * 	
   * 	Trace.initial(taskToEndEvent, initialTaskToEndEvent);
   * 	Trace.current(taskToEndEvent, currentTaskToEndEvent);
   * 	SequenceFlow.sourceRef(initialTaskToEndEvent, initialTask);
   * 	SequenceFlow.sourceRef(currentTaskToEndEvent, currentTask);
   * 	SequenceFlow.targetRef(initialTaskToEndEvent, initialEndEvent);
   * 	SequenceFlow.targetRef(currentTaskToEndEvent, currentEndEvent);
   * 	
   * 	Trace.initial(process, initialProcess);
   * 	Trace.current(process, currentProcess);
   * 	Process.flowElements(initialProcess, initialStartEvent);
   * 	Process.flowElements(currentProcess, currentStartEvent);
   * 	Process.flowElements(initialProcess, initialTask);
   * 	Process.flowElements(currentProcess, currentTask);
   * 	Process.flowElements(initialProcess, initialEndEvent);
   * 	Process.flowElements(currentProcess, currentEndEvent);
   * 	Process.flowElements(initialProcess, initialStartEventToTask);
   * 	Process.flowElements(currentProcess, currentStartEventToTask);
   * 	Process.flowElements(initialProcess, initialTaskToEndEvent);
   * 	Process.flowElements(currentProcess, currentTaskToEndEvent);
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MoveElementPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<MoveElementPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MoveElementPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MoveElementPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PROCESS = 0;
    
    private static final int POSITION_STARTEVENT = 1;
    
    private static final int POSITION_TASK = 2;
    
    private static final int POSITION_ENDEVENT = 3;
    
    private static final int POSITION_STARTEVENTTOTASK = 4;
    
    private static final int POSITION_TASKTOENDEVENT = 5;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MoveElementPrecondition.Matcher.class);
    
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
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MoveElementPrecondition.Match> getAllMatches(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllMatches(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MoveElementPrecondition.Match> streamAllMatches(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllMatches(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MoveElementPrecondition.Match> getOneArbitraryMatch(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawGetOneArbitraryMatch(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawHasMatch(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawCountMatches(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent, final Consumer<? super MoveElementPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProcess the fixed value of pattern parameter process, or null if not bound.
     * @param pStartEvent the fixed value of pattern parameter startEvent, or null if not bound.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param pEndEvent the fixed value of pattern parameter endEvent, or null if not bound.
     * @param pStartEventToTask the fixed value of pattern parameter startEventToTask, or null if not bound.
     * @param pTaskToEndEvent the fixed value of pattern parameter taskToEndEvent, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MoveElementPrecondition.Match newMatch(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return MoveElementPrecondition.Match.newMatch(pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent);
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
    public Stream<Trace> streamAllValuesOfprocess(final MoveElementPrecondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfprocess(final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfprocess(new Object[]{null, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfprocess(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfprocess(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for process.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfprocess(final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfprocess(new Object[]{null, pStartEvent, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfstartEvent(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STARTEVENT, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfstartEvent() {
      return rawStreamAllValuesOfstartEvent(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfstartEvent() {
      return rawStreamAllValuesOfstartEvent(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEvent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfstartEvent(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfstartEvent(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEvent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfstartEvent(final Trace pProcess, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfstartEvent(new Object[]{pProcess, null, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfstartEvent(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfstartEvent(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfstartEvent(final Trace pProcess, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfstartEvent(new Object[]{pProcess, null, pTask, pEndEvent, pStartEventToTask, pTaskToEndEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for task.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOftask(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TASK, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for task.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftask() {
      return rawStreamAllValuesOftask(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for task.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftask() {
      return rawStreamAllValuesOftask(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for task.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftask(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOftask(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for task.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftask(final Trace pProcess, final Trace pStartEvent, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOftask(new Object[]{pProcess, pStartEvent, null, pEndEvent, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for task.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftask(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOftask(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for task.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftask(final Trace pProcess, final Trace pStartEvent, final Trace pEndEvent, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOftask(new Object[]{pProcess, pStartEvent, null, pEndEvent, pStartEventToTask, pTaskToEndEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfendEvent(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENDEVENT, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for endEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfendEvent() {
      return rawStreamAllValuesOfendEvent(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfendEvent() {
      return rawStreamAllValuesOfendEvent(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endEvent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfendEvent(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfendEvent(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endEvent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfendEvent(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfendEvent(new Object[]{pProcess, pStartEvent, pTask, null, pStartEventToTask, pTaskToEndEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for endEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfendEvent(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfendEvent(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfendEvent(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pStartEventToTask, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfendEvent(new Object[]{pProcess, pStartEvent, pTask, null, pStartEventToTask, pTaskToEndEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEventToTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfstartEventToTask(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STARTEVENTTOTASK, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEventToTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfstartEventToTask() {
      return rawStreamAllValuesOfstartEventToTask(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEventToTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfstartEventToTask() {
      return rawStreamAllValuesOfstartEventToTask(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEventToTask.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfstartEventToTask(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfstartEventToTask(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEventToTask.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfstartEventToTask(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfstartEventToTask(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, null, pTaskToEndEvent});
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEventToTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfstartEventToTask(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfstartEventToTask(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for startEventToTask.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfstartEventToTask(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pTaskToEndEvent) {
      return rawStreamAllValuesOfstartEventToTask(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, null, pTaskToEndEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskToEndEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOftaskToEndEvent(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TASKTOENDEVENT, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskToEndEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskToEndEvent() {
      return rawStreamAllValuesOftaskToEndEvent(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskToEndEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskToEndEvent() {
      return rawStreamAllValuesOftaskToEndEvent(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskToEndEvent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskToEndEvent(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOftaskToEndEvent(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskToEndEvent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftaskToEndEvent(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask) {
      return rawStreamAllValuesOftaskToEndEvent(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskToEndEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskToEndEvent(final MoveElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOftaskToEndEvent(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for taskToEndEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftaskToEndEvent(final Trace pProcess, final Trace pStartEvent, final Trace pTask, final Trace pEndEvent, final Trace pStartEventToTask) {
      return rawStreamAllValuesOftaskToEndEvent(new Object[]{pProcess, pStartEvent, pTask, pEndEvent, pStartEventToTask, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected MoveElementPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return MoveElementPrecondition.Match.newMatch((Trace) t.get(POSITION_PROCESS), (Trace) t.get(POSITION_STARTEVENT), (Trace) t.get(POSITION_TASK), (Trace) t.get(POSITION_ENDEVENT), (Trace) t.get(POSITION_STARTEVENTTOTASK), (Trace) t.get(POSITION_TASKTOENDEVENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoveElementPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return MoveElementPrecondition.Match.newMatch((Trace) match[POSITION_PROCESS], (Trace) match[POSITION_STARTEVENT], (Trace) match[POSITION_TASK], (Trace) match[POSITION_ENDEVENT], (Trace) match[POSITION_STARTEVENTTOTASK], (Trace) match[POSITION_TASKTOENDEVENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoveElementPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MoveElementPrecondition.Match.newMutableMatch((Trace) match[POSITION_PROCESS], (Trace) match[POSITION_STARTEVENT], (Trace) match[POSITION_TASK], (Trace) match[POSITION_ENDEVENT], (Trace) match[POSITION_STARTEVENTTOTASK], (Trace) match[POSITION_TASKTOENDEVENT]);
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
    public static IQuerySpecification<MoveElementPrecondition.Matcher> querySpecification() {
      return MoveElementPrecondition.instance();
    }
  }
  
  private MoveElementPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MoveElementPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoveElementPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MoveElementPrecondition.Matcher.on(engine);
  }
  
  @Override
  public MoveElementPrecondition.Matcher instantiate() {
    return MoveElementPrecondition.Matcher.create();
  }
  
  @Override
  public MoveElementPrecondition.Match newEmptyMatch() {
    return MoveElementPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public MoveElementPrecondition.Match newMatch(final Object... parameters) {
    return MoveElementPrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3], (se.mdh.idt.benji.trace.Trace) parameters[4], (se.mdh.idt.benji.trace.Trace) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MoveElementPrecondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link MoveElementPrecondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MoveElementPrecondition INSTANCE = new MoveElementPrecondition();
    
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
    private static final MoveElementPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_process = new PParameter("process", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_startEvent = new PParameter("startEvent", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_task = new PParameter("task", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_endEvent = new PParameter("endEvent", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_startEventToTask = new PParameter("startEventToTask", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_taskToEndEvent = new PParameter("taskToEndEvent", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_process, parameter_startEvent, parameter_task, parameter_endEvent, parameter_startEventToTask, parameter_taskToEndEvent);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.models20.bpmn2.MoveElementPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("process","startEvent","task","endEvent","startEventToTask","taskToEndEvent");
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
          PVariable var_startEvent = body.getOrCreateVariableByName("startEvent");
          PVariable var_task = body.getOrCreateVariableByName("task");
          PVariable var_endEvent = body.getOrCreateVariableByName("endEvent");
          PVariable var_startEventToTask = body.getOrCreateVariableByName("startEventToTask");
          PVariable var_taskToEndEvent = body.getOrCreateVariableByName("taskToEndEvent");
          PVariable var_initialStartEvent = body.getOrCreateVariableByName("initialStartEvent");
          PVariable var_currentStartEvent = body.getOrCreateVariableByName("currentStartEvent");
          PVariable var_initialTask = body.getOrCreateVariableByName("initialTask");
          PVariable var_currentTask = body.getOrCreateVariableByName("currentTask");
          PVariable var_taskName = body.getOrCreateVariableByName("taskName");
          PVariable var_initialEndEvent = body.getOrCreateVariableByName("initialEndEvent");
          PVariable var_currentEndEvent = body.getOrCreateVariableByName("currentEndEvent");
          PVariable var_initialStartEventToTask = body.getOrCreateVariableByName("initialStartEventToTask");
          PVariable var_currentStartEventToTask = body.getOrCreateVariableByName("currentStartEventToTask");
          PVariable var_initialTaskToEndEvent = body.getOrCreateVariableByName("initialTaskToEndEvent");
          PVariable var_currentTaskToEndEvent = body.getOrCreateVariableByName("currentTaskToEndEvent");
          PVariable var_initialProcess = body.getOrCreateVariableByName("initialProcess");
          PVariable var_currentProcess = body.getOrCreateVariableByName("currentProcess");
          new TypeConstraint(body, Tuples.flatTupleOf(var_process), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_endEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEventToTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskToEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_process, parameter_process),
             new ExportedParameter(body, var_startEvent, parameter_startEvent),
             new ExportedParameter(body, var_task, parameter_task),
             new ExportedParameter(body, var_endEvent, parameter_endEvent),
             new ExportedParameter(body, var_startEventToTask, parameter_startEventToTask),
             new ExportedParameter(body, var_taskToEndEvent, parameter_taskToEndEvent)
          ));
          // 		Trace.initial(startEvent, initialStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEvent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_initialStartEvent);
          // 	Trace.current(startEvent, currentStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEvent, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_currentStartEvent);
          // 	StartEvent(initialStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialStartEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "StartEvent")));
          // 	StartEvent(currentStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentStartEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "StartEvent")));
          // 		Trace.initial(task, initialTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_task, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_2_, var_initialTask);
          // 	Trace.current(task, currentTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_task, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_3_, var_currentTask);
          // 	Task.name(initialTask, taskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Task")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTask, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_4_, var_taskName);
          // 	Task.name(currentTask, taskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Task")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTask, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_5_, var_taskName);
          // 	taskName == "Deliver Goods"
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new ConstantValue(body, var__virtual_6_, "Deliver Goods");
          new Equality(body, var_taskName, var__virtual_6_);
          // 		Trace.initial(endEvent, initialEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_endEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_endEvent, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_7_, var_initialEndEvent);
          // 	Trace.current(endEvent, currentEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_endEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_endEvent, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_8_, var_currentEndEvent);
          // 	EndEvent(initialEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "EndEvent")));
          // 	EndEvent(currentEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "EndEvent")));
          // 		Trace.initial(startEventToTask, initialStartEventToTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEventToTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEventToTask, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_9_, var_initialStartEventToTask);
          // 	Trace.current(startEventToTask, currentStartEventToTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEventToTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_startEventToTask, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_10_, var_currentStartEventToTask);
          // 	SequenceFlow.sourceRef(initialStartEventToTask, initialStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialStartEventToTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialStartEventToTask, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "sourceRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_11_, var_initialStartEvent);
          // 	SequenceFlow.sourceRef(currentStartEventToTask, currentStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentStartEventToTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentStartEventToTask, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "sourceRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_12_, var_currentStartEvent);
          // 	SequenceFlow.targetRef(initialStartEventToTask, initialTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialStartEventToTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialStartEventToTask, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "targetRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_13_, var_initialTask);
          // 	SequenceFlow.targetRef(currentStartEventToTask, currentTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentStartEventToTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentStartEventToTask, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "targetRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_14_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_14_, var_currentTask);
          // 		Trace.initial(taskToEndEvent, initialTaskToEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskToEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskToEndEvent, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_15_, var_initialTaskToEndEvent);
          // 	Trace.current(taskToEndEvent, currentTaskToEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskToEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taskToEndEvent, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_16_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_16_, var_currentTaskToEndEvent);
          // 	SequenceFlow.sourceRef(initialTaskToEndEvent, initialTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskToEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskToEndEvent, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "sourceRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_17_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_17_, var_initialTask);
          // 	SequenceFlow.sourceRef(currentTaskToEndEvent, currentTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskToEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskToEndEvent, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "sourceRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_18_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_18_, var_currentTask);
          // 	SequenceFlow.targetRef(initialTaskToEndEvent, initialEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskToEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTaskToEndEvent, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "targetRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_19_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_19_, var_initialEndEvent);
          // 	SequenceFlow.targetRef(currentTaskToEndEvent, currentEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskToEndEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow")));
          PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTaskToEndEvent, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "SequenceFlow", "targetRef")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_20_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowNode")));
          new Equality(body, var__virtual_20_, var_currentEndEvent);
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
          // 	Process.flowElements(initialProcess, initialStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_23_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_23_, var_initialStartEvent);
          // 	Process.flowElements(currentProcess, currentStartEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_24_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_24_, var_currentStartEvent);
          // 	Process.flowElements(initialProcess, initialTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_25_ = body.getOrCreateVariableByName(".virtual{25}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_25_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_25_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_25_, var_initialTask);
          // 	Process.flowElements(currentProcess, currentTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_26_ = body.getOrCreateVariableByName(".virtual{26}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_26_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_26_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_26_, var_currentTask);
          // 	Process.flowElements(initialProcess, initialEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_27_ = body.getOrCreateVariableByName(".virtual{27}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_27_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_27_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_27_, var_initialEndEvent);
          // 	Process.flowElements(currentProcess, currentEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_28_ = body.getOrCreateVariableByName(".virtual{28}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_28_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_28_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_28_, var_currentEndEvent);
          // 	Process.flowElements(initialProcess, initialStartEventToTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_29_ = body.getOrCreateVariableByName(".virtual{29}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_29_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_29_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_29_, var_initialStartEventToTask);
          // 	Process.flowElements(currentProcess, currentStartEventToTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_30_ = body.getOrCreateVariableByName(".virtual{30}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_30_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_30_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_30_, var_currentStartEventToTask);
          // 	Process.flowElements(initialProcess, initialTaskToEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_31_ = body.getOrCreateVariableByName(".virtual{31}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialProcess, var__virtual_31_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_31_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_31_, var_initialTaskToEndEvent);
          // 	Process.flowElements(currentProcess, currentTaskToEndEvent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "Process")));
          PVariable var__virtual_32_ = body.getOrCreateVariableByName(".virtual{32}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentProcess, var__virtual_32_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElementsContainer", "flowElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_32_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/bpmn2", "FlowElement")));
          new Equality(body, var__virtual_32_, var_currentTaskToEndEvent);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
