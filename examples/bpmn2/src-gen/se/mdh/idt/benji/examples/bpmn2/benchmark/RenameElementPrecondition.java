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
 *         // Rename Element - Precondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern RenameElementPrecondition(task: Trace) {
 *         	
 *         	Trace.initial(task, initialTask);
 *         	Trace.current(task, currentTask);
 *         	Task.name(initialTask, taskName);
 *         	Task.name(currentTask, taskName);
 *         	taskName == "Deliver Goods";
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RenameElementPrecondition extends BaseGeneratedEMFQuerySpecification<RenameElementPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.bpmn2.benchmark.RenameElementPrecondition pattern,
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
    private Trace fTask;
    
    private static List<String> parameterNames = makeImmutableList("task");
    
    private Match(final Trace pTask) {
      this.fTask = pTask;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "task": return this.fTask;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTask;
          default: return null;
      }
    }
    
    public Trace getTask() {
      return this.fTask;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("task".equals(parameterName) ) {
          this.fTask = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setTask(final Trace pTask) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTask = pTask;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.bpmn2.benchmark.RenameElementPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return RenameElementPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTask};
    }
    
    @Override
    public RenameElementPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fTask) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"task\"=" + prettyPrintValue(fTask));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTask);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RenameElementPrecondition.Match)) {
          RenameElementPrecondition.Match other = (RenameElementPrecondition.Match) obj;
          return Objects.equals(fTask, other.fTask);
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
    public RenameElementPrecondition specification() {
      return RenameElementPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RenameElementPrecondition.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RenameElementPrecondition.Match newMutableMatch(final Trace pTask) {
      return new Mutable(pTask);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RenameElementPrecondition.Match newMatch(final Trace pTask) {
      return new Immutable(pTask);
    }
    
    private static final class Mutable extends RenameElementPrecondition.Match {
      Mutable(final Trace pTask) {
        super(pTask);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RenameElementPrecondition.Match {
      Immutable(final Trace pTask) {
        super(pTask);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.bpmn2.benchmark.RenameElementPrecondition pattern,
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
   * // Rename Element - Precondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern RenameElementPrecondition(task: Trace) {
   * 	
   * 	Trace.initial(task, initialTask);
   * 	Trace.current(task, currentTask);
   * 	Task.name(initialTask, taskName);
   * 	Task.name(currentTask, taskName);
   * 	taskName == "Deliver Goods";
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RenameElementPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<RenameElementPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RenameElementPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static RenameElementPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TASK = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RenameElementPrecondition.Matcher.class);
    
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
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RenameElementPrecondition.Match> getAllMatches(final Trace pTask) {
      return rawStreamAllMatches(new Object[]{pTask}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RenameElementPrecondition.Match> streamAllMatches(final Trace pTask) {
      return rawStreamAllMatches(new Object[]{pTask});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RenameElementPrecondition.Match> getOneArbitraryMatch(final Trace pTask) {
      return rawGetOneArbitraryMatch(new Object[]{pTask});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pTask) {
      return rawHasMatch(new Object[]{pTask});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pTask) {
      return rawCountMatches(new Object[]{pTask});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pTask, final Consumer<? super RenameElementPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTask}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTask the fixed value of pattern parameter task, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RenameElementPrecondition.Match newMatch(final Trace pTask) {
      return RenameElementPrecondition.Match.newMatch(pTask);
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
    
    @Override
    protected RenameElementPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return RenameElementPrecondition.Match.newMatch((Trace) t.get(POSITION_TASK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameElementPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return RenameElementPrecondition.Match.newMatch((Trace) match[POSITION_TASK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameElementPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RenameElementPrecondition.Match.newMutableMatch((Trace) match[POSITION_TASK]);
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
    public static IQuerySpecification<RenameElementPrecondition.Matcher> querySpecification() {
      return RenameElementPrecondition.instance();
    }
  }
  
  private RenameElementPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RenameElementPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RenameElementPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return RenameElementPrecondition.Matcher.on(engine);
  }
  
  @Override
  public RenameElementPrecondition.Matcher instantiate() {
    return RenameElementPrecondition.Matcher.create();
  }
  
  @Override
  public RenameElementPrecondition.Match newEmptyMatch() {
    return RenameElementPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public RenameElementPrecondition.Match newMatch(final Object... parameters) {
    return RenameElementPrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RenameElementPrecondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RenameElementPrecondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RenameElementPrecondition INSTANCE = new RenameElementPrecondition();
    
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
    private static final RenameElementPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_task = new PParameter("task", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_task);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.bpmn2.benchmark.RenameElementPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("task");
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
          PVariable var_task = body.getOrCreateVariableByName("task");
          PVariable var_initialTask = body.getOrCreateVariableByName("initialTask");
          PVariable var_currentTask = body.getOrCreateVariableByName("currentTask");
          PVariable var_taskName = body.getOrCreateVariableByName("taskName");
          new TypeConstraint(body, Tuples.flatTupleOf(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_task, parameter_task)
          ));
          // 		Trace.initial(task, initialTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_task, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_initialTask);
          // 	Trace.current(task, currentTask)
          new TypeConstraint(body, Tuples.flatTupleOf(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_task, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_currentTask);
          // 	Task.name(initialTask, taskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initialTask, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_taskName);
          // 	Task.name(currentTask, taskName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Task")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_currentTask, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/bpmn2", "Activity", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var_taskName);
          // 	taskName == "Deliver Goods"
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "Deliver Goods");
          new Equality(body, var_taskName, var__virtual_4_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
