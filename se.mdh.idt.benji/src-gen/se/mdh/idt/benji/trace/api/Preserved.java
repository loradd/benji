/**
 * Generated from platform:/resource/se.mdh.idt.benji/src/se/mdh/idt/benji/trace/api/TracePatterns.vql
 */
package se.mdh.idt.benji.trace.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.trace.TraceLink;
import se.mdh.idt.benji.trace.api.Current;
import se.mdh.idt.benji.trace.api.Initial;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Preserved extends BaseGeneratedEMFQuerySpecification<Preserved.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.trace.api.preserved pattern,
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
    private TraceLink fTraceLink;
    
    private EObject fInitial_element;
    
    private EObject fCurrent_element;
    
    private static List<String> parameterNames = makeImmutableList("traceLink", "initial_element", "current_element");
    
    private Match(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      this.fTraceLink = pTraceLink;
      this.fInitial_element = pInitial_element;
      this.fCurrent_element = pCurrent_element;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("traceLink".equals(parameterName)) return this.fTraceLink;
      if ("initial_element".equals(parameterName)) return this.fInitial_element;
      if ("current_element".equals(parameterName)) return this.fCurrent_element;
      return null;
    }
    
    public TraceLink getTraceLink() {
      return this.fTraceLink;
    }
    
    public EObject getInitial_element() {
      return this.fInitial_element;
    }
    
    public EObject getCurrent_element() {
      return this.fCurrent_element;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("traceLink".equals(parameterName) ) {
          this.fTraceLink = (TraceLink) newValue;
          return true;
      }
      if ("initial_element".equals(parameterName) ) {
          this.fInitial_element = (EObject) newValue;
          return true;
      }
      if ("current_element".equals(parameterName) ) {
          this.fCurrent_element = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setTraceLink(final TraceLink pTraceLink) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTraceLink = pTraceLink;
    }
    
    public void setInitial_element(final EObject pInitial_element) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_element = pInitial_element;
    }
    
    public void setCurrent_element(final EObject pCurrent_element) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_element = pCurrent_element;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.trace.api.preserved";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTraceLink, fInitial_element, fCurrent_element};
    }
    
    @Override
    public Preserved.Match toImmutable() {
      return isMutable() ? newMatch(fTraceLink, fInitial_element, fCurrent_element) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"traceLink\"=" + prettyPrintValue(fTraceLink) + ", ");
      result.append("\"initial_element\"=" + prettyPrintValue(fInitial_element) + ", ");
      result.append("\"current_element\"=" + prettyPrintValue(fCurrent_element));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fTraceLink, fInitial_element, fCurrent_element);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved.Match)) {
          Preserved.Match other = (Preserved.Match) obj;
          return Objects.equals(fTraceLink, other.fTraceLink) && Objects.equals(fInitial_element, other.fInitial_element) && Objects.equals(fCurrent_element, other.fCurrent_element);
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
    public Preserved specification() {
      return Preserved.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved.Match newMutableMatch(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      return new Mutable(pTraceLink, pInitial_element, pCurrent_element);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved.Match newMatch(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      return new Immutable(pTraceLink, pInitial_element, pCurrent_element);
    }
    
    private static final class Mutable extends Preserved.Match {
      Mutable(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
        super(pTraceLink, pInitial_element, pCurrent_element);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved.Match {
      Immutable(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
        super(pTraceLink, pInitial_element, pCurrent_element);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.trace.api.preserved pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // trace link - preserved element 
   * pattern preserved (traceLink : TraceLink, initial_element : EObject, current_element : EObject) {
   * 	find initial (traceLink, initial_element); 
   * 	find current (traceLink, current_element); 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Preserved
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_TRACELINK = 0;
    
    private final static int POSITION_INITIAL_ELEMENT = 1;
    
    private final static int POSITION_CURRENT_ELEMENT = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved.Match> getAllMatches(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      return rawGetAllMatches(new Object[]{pTraceLink, pInitial_element, pCurrent_element});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved.Match getOneArbitraryMatch(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      return rawGetOneArbitraryMatch(new Object[]{pTraceLink, pInitial_element, pCurrent_element});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      return rawHasMatch(new Object[]{pTraceLink, pInitial_element, pCurrent_element});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      return rawCountMatches(new Object[]{pTraceLink, pInitial_element, pCurrent_element});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element, final IMatchProcessor<? super Preserved.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTraceLink, pInitial_element, pCurrent_element}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pInitial_element the fixed value of pattern parameter initial_element, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved.Match newMatch(final TraceLink pTraceLink, final EObject pInitial_element, final EObject pCurrent_element) {
      return Preserved.Match.newMatch(pTraceLink, pInitial_element, pCurrent_element);
    }
    
    /**
     * Retrieve the set of values that occur in matches for traceLink.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOftraceLink(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_TRACELINK, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for traceLink.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftraceLink() {
      return rawAccumulateAllValuesOftraceLink(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for traceLink.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftraceLink(final Preserved.Match partialMatch) {
      return rawAccumulateAllValuesOftraceLink(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for traceLink.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftraceLink(final EObject pInitial_element, final EObject pCurrent_element) {
      return rawAccumulateAllValuesOftraceLink(new Object[]{
      null, 
      pInitial_element, 
      pCurrent_element
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EObject> rawAccumulateAllValuesOfinitial_element(final Object[] parameters) {
      Set<EObject> results = new HashSet<EObject>();
      rawAccumulateAllValues(POSITION_INITIAL_ELEMENT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfinitial_element() {
      return rawAccumulateAllValuesOfinitial_element(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfinitial_element(final Preserved.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_element(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfinitial_element(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return rawAccumulateAllValuesOfinitial_element(new Object[]{
      pTraceLink, 
      null, 
      pCurrent_element
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EObject> rawAccumulateAllValuesOfcurrent_element(final Object[] parameters) {
      Set<EObject> results = new HashSet<EObject>();
      rawAccumulateAllValues(POSITION_CURRENT_ELEMENT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfcurrent_element() {
      return rawAccumulateAllValuesOfcurrent_element(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfcurrent_element(final Preserved.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_element(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfcurrent_element(final TraceLink pTraceLink, final EObject pInitial_element) {
      return rawAccumulateAllValuesOfcurrent_element(new Object[]{
      pTraceLink, 
      pInitial_element, 
      null
      });
    }
    
    @Override
    protected Preserved.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved.Match.newMatch((TraceLink) t.get(POSITION_TRACELINK), (EObject) t.get(POSITION_INITIAL_ELEMENT), (EObject) t.get(POSITION_CURRENT_ELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved.Match.newMatch((TraceLink) match[POSITION_TRACELINK], (EObject) match[POSITION_INITIAL_ELEMENT], (EObject) match[POSITION_CURRENT_ELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved.Match.newMutableMatch((TraceLink) match[POSITION_TRACELINK], (EObject) match[POSITION_INITIAL_ELEMENT], (EObject) match[POSITION_CURRENT_ELEMENT]);
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
    public static IQuerySpecification<Preserved.Matcher> querySpecification() {
      return Preserved.instance();
    }
  }
  
  private Preserved() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved.Matcher.on(engine);
  }
  
  @Override
  public Preserved.Matcher instantiate() {
    return Preserved.Matcher.create();
  }
  
  @Override
  public Preserved.Match newEmptyMatch() {
    return Preserved.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved.Match newMatch(final Object... parameters) {
    return Preserved.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.eclipse.emf.ecore.EObject) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.trace.api.Preserved (visibility: PUBLIC, simpleName: Preserved, identifier: se.mdh.idt.benji.trace.api.Preserved, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace.api) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.trace.api.Preserved (visibility: PUBLIC, simpleName: Preserved, identifier: se.mdh.idt.benji.trace.api.Preserved, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace.api) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved INSTANCE = new Preserved();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Preserved.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pTraceLink = new PParameter("traceLink", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_element = new PParameter("initial_element", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_element = new PParameter("current_element", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pTraceLink, parameter_pInitial_element, parameter_pCurrent_element);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.trace.api.preserved";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("traceLink","initial_element","current_element");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_traceLink = body.getOrCreateVariableByName("traceLink");
          PVariable var_initial_element = body.getOrCreateVariableByName("initial_element");
          PVariable var_current_element = body.getOrCreateVariableByName("current_element");
          new TypeConstraint(body, Tuples.flatTupleOf(var_traceLink), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_traceLink, parameter_pTraceLink),
             new ExportedParameter(body, var_initial_element, parameter_pInitial_element),
             new ExportedParameter(body, var_current_element, parameter_pCurrent_element)
          ));
          // 	find initial (traceLink, initial_element)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_traceLink, var_initial_element), Initial.instance().getInternalQueryRepresentation());
          //  	find current (traceLink, current_element)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_traceLink, var_current_element), Current.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}