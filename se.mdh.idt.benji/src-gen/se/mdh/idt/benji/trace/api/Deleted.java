/**
 * Generated from platform:/resource/se.mdh.idt.benji/src/se/mdh/idt/benji/trace/api/TraceQueries.vql
 */
package se.mdh.idt.benji.trace.api;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.trace.Trace;
import se.mdh.idt.benji.trace.api.Current;
import se.mdh.idt.benji.trace.api.Initial;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // trace - deleted element
 *         pattern deleted (trace : Trace, initial : EObject) {
 *         	find initial (trace, initial); 
 *         	neg find current (trace, _current);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Deleted extends BaseGeneratedEMFQuerySpecification<Deleted.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.trace.api.deleted pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   *  @see Processor
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Trace fTrace;
    
    private EObject fInitial;
    
    private static List<String> parameterNames = makeImmutableList("trace", "initial");
    
    private Match(final Trace pTrace, final EObject pInitial) {
      this.fTrace = pTrace;
      this.fInitial = pInitial;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("trace".equals(parameterName)) return this.fTrace;
      if ("initial".equals(parameterName)) return this.fInitial;
      return null;
    }
    
    public Trace getTrace() {
      return this.fTrace;
    }
    
    public EObject getInitial() {
      return this.fInitial;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("trace".equals(parameterName) ) {
          this.fTrace = (Trace) newValue;
          return true;
      }
      if ("initial".equals(parameterName) ) {
          this.fInitial = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setTrace(final Trace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    public void setInitial(final EObject pInitial) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial = pInitial;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.trace.api.deleted";
    }
    
    @Override
    public List<String> parameterNames() {
      return Deleted.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTrace, fInitial};
    }
    
    @Override
    public Deleted.Match toImmutable() {
      return isMutable() ? newMatch(fTrace, fInitial) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
      result.append("\"initial\"=" + prettyPrintValue(fInitial));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTrace, fInitial);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Deleted.Match)) {
          Deleted.Match other = (Deleted.Match) obj;
          return Objects.equals(fTrace, other.fTrace) && Objects.equals(fInitial, other.fInitial);
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
    public Deleted specification() {
      return Deleted.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Deleted.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Deleted.Match newMutableMatch(final Trace pTrace, final EObject pInitial) {
      return new Mutable(pTrace, pInitial);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Deleted.Match newMatch(final Trace pTrace, final EObject pInitial) {
      return new Immutable(pTrace, pInitial);
    }
    
    private static final class Mutable extends Deleted.Match {
      Mutable(final Trace pTrace, final EObject pInitial) {
        super(pTrace, pInitial);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Deleted.Match {
      Immutable(final Trace pTrace, final EObject pInitial) {
        super(pTrace, pInitial);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.trace.api.deleted pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // trace - deleted element
   * pattern deleted (trace : Trace, initial : EObject) {
   * 	find initial (trace, initial); 
   * 	neg find current (trace, _current);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Deleted
   * 
   */
  public static class Matcher extends BaseMatcher<Deleted.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Deleted.Matcher on(final ViatraQueryEngine engine) {
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
    public static Deleted.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TRACE = 0;
    
    private static final int POSITION_INITIAL = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Deleted.Matcher.class);
    
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
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Deleted.Match> getAllMatches(final Trace pTrace, final EObject pInitial) {
      return rawStreamAllMatches(new Object[]{pTrace, pInitial}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Deleted.Match> streamAllMatches(final Trace pTrace, final EObject pInitial) {
      return rawStreamAllMatches(new Object[]{pTrace, pInitial});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Deleted.Match> getOneArbitraryMatch(final Trace pTrace, final EObject pInitial) {
      return rawGetOneArbitraryMatch(new Object[]{pTrace, pInitial});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pTrace, final EObject pInitial) {
      return rawHasMatch(new Object[]{pTrace, pInitial});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pTrace, final EObject pInitial) {
      return rawCountMatches(new Object[]{pTrace, pInitial});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pTrace, final EObject pInitial, final Consumer<? super Deleted.Match> processor) {
      rawForEachMatch(new Object[]{pTrace, pInitial}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pTrace, final EObject pInitial, final Consumer<? super Deleted.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTrace, pInitial}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pInitial the fixed value of pattern parameter initial, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Deleted.Match newMatch(final Trace pTrace, final EObject pInitial) {
      return Deleted.Match.newMatch(pTrace, pInitial);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftrace(final Deleted.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOftrace(final EObject pInitial) {
      return rawStreamAllValuesOftrace(new Object[]{null, pInitial});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftrace(final Deleted.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftrace(final EObject pInitial) {
      return rawStreamAllValuesOftrace(new Object[]{null, pInitial}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfinitial(final Object[] parameters) {
      return rawStreamAllValues(POSITION_INITIAL, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfinitial() {
      return rawStreamAllValuesOfinitial(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfinitial() {
      return rawStreamAllValuesOfinitial(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfinitial(final Deleted.Match partialMatch) {
      return rawStreamAllValuesOfinitial(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfinitial(final Trace pTrace) {
      return rawStreamAllValuesOfinitial(new Object[]{pTrace, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfinitial(final Deleted.Match partialMatch) {
      return rawStreamAllValuesOfinitial(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfinitial(final Trace pTrace) {
      return rawStreamAllValuesOfinitial(new Object[]{pTrace, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Deleted.Match tupleToMatch(final Tuple t) {
      try {
          return Deleted.Match.newMatch((Trace) t.get(POSITION_TRACE), (EObject) t.get(POSITION_INITIAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted.Match arrayToMatch(final Object[] match) {
      try {
          return Deleted.Match.newMatch((Trace) match[POSITION_TRACE], (EObject) match[POSITION_INITIAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Deleted.Match.newMutableMatch((Trace) match[POSITION_TRACE], (EObject) match[POSITION_INITIAL]);
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
    public static IQuerySpecification<Deleted.Matcher> querySpecification() {
      return Deleted.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.trace.api.deleted pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Deleted.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pTrace the value of pattern parameter trace in the currently processed match
     * @param pInitial the value of pattern parameter initial in the currently processed match
     * 
     */
    public abstract void accept(final Trace pTrace, final EObject pInitial);
    
    @Override
    public void accept(final Deleted.Match match) {
      accept(match.getTrace(), match.getInitial());
    }
  }
  
  private Deleted() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Deleted instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Deleted.Matcher instantiate(final ViatraQueryEngine engine) {
    return Deleted.Matcher.on(engine);
  }
  
  @Override
  public Deleted.Matcher instantiate() {
    return Deleted.Matcher.create();
  }
  
  @Override
  public Deleted.Match newEmptyMatch() {
    return Deleted.Match.newEmptyMatch();
  }
  
  @Override
  public Deleted.Match newMatch(final Object... parameters) {
    return Deleted.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.trace.api.Deleted (visibility: PUBLIC, simpleName: Deleted, identifier: se.mdh.idt.benji.trace.api.Deleted, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace.api) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.trace.api.Deleted (visibility: PUBLIC, simpleName: Deleted, identifier: se.mdh.idt.benji.trace.api.Deleted, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace.api) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Deleted INSTANCE = new Deleted();
    
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
    private static final Deleted.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_trace = new PParameter("trace", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_initial = new PParameter("initial", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_trace, parameter_initial);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.trace.api.deleted";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trace","initial");
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
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_initial = body.getOrCreateVariableByName("initial");
          PVariable var__current = body.getOrCreateVariableByName("_current");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_trace, parameter_trace),
             new ExportedParameter(body, var_initial, parameter_initial)
          ));
          // 	find initial (trace, initial)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_trace, var_initial), Initial.instance().getInternalQueryRepresentation());
          //  	neg find current (trace, _current)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_trace, var__current), Current.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
