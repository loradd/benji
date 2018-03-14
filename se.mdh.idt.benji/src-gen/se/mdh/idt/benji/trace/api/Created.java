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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
public final class Created extends BaseGeneratedEMFQuerySpecification<Created.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.trace.api.created pattern,
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
    
    private EObject fCurrent_element;
    
    private static List<String> parameterNames = makeImmutableList("traceLink", "current_element");
    
    private Match(final TraceLink pTraceLink, final EObject pCurrent_element) {
      this.fTraceLink = pTraceLink;
      this.fCurrent_element = pCurrent_element;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("traceLink".equals(parameterName)) return this.fTraceLink;
      if ("current_element".equals(parameterName)) return this.fCurrent_element;
      return null;
    }
    
    public TraceLink getTraceLink() {
      return this.fTraceLink;
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
    
    public void setCurrent_element(final EObject pCurrent_element) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_element = pCurrent_element;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.trace.api.created";
    }
    
    @Override
    public List<String> parameterNames() {
      return Created.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTraceLink, fCurrent_element};
    }
    
    @Override
    public Created.Match toImmutable() {
      return isMutable() ? newMatch(fTraceLink, fCurrent_element) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"traceLink\"=" + prettyPrintValue(fTraceLink) + ", ");
      result.append("\"current_element\"=" + prettyPrintValue(fCurrent_element));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fTraceLink, fCurrent_element);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Created.Match)) {
          Created.Match other = (Created.Match) obj;
          return Objects.equals(fTraceLink, other.fTraceLink) && Objects.equals(fCurrent_element, other.fCurrent_element);
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
    public Created specification() {
      return Created.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Created.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Created.Match newMutableMatch(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return new Mutable(pTraceLink, pCurrent_element);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Created.Match newMatch(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return new Immutable(pTraceLink, pCurrent_element);
    }
    
    private static final class Mutable extends Created.Match {
      Mutable(final TraceLink pTraceLink, final EObject pCurrent_element) {
        super(pTraceLink, pCurrent_element);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Created.Match {
      Immutable(final TraceLink pTraceLink, final EObject pCurrent_element) {
        super(pTraceLink, pCurrent_element);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.trace.api.created pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // trace link - created element
   * pattern created (traceLink : TraceLink, current_element : EObject) {
   * 	neg find initial (traceLink, _initial_element); 
   * 	find current (traceLink, current_element); 
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Created
   * 
   */
  public static class Matcher extends BaseMatcher<Created.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Created.Matcher on(final ViatraQueryEngine engine) {
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
    public static Created.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_TRACELINK = 0;
    
    private final static int POSITION_CURRENT_ELEMENT = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Created.Matcher.class);
    
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
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Created.Match> getAllMatches(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return rawGetAllMatches(new Object[]{pTraceLink, pCurrent_element});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Created.Match getOneArbitraryMatch(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return rawGetOneArbitraryMatch(new Object[]{pTraceLink, pCurrent_element});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return rawHasMatch(new Object[]{pTraceLink, pCurrent_element});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return rawCountMatches(new Object[]{pTraceLink, pCurrent_element});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pTraceLink, final EObject pCurrent_element, final IMatchProcessor<? super Created.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTraceLink, pCurrent_element}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pCurrent_element the fixed value of pattern parameter current_element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Created.Match newMatch(final TraceLink pTraceLink, final EObject pCurrent_element) {
      return Created.Match.newMatch(pTraceLink, pCurrent_element);
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
    public Set<TraceLink> getAllValuesOftraceLink(final Created.Match partialMatch) {
      return rawAccumulateAllValuesOftraceLink(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for traceLink.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftraceLink(final EObject pCurrent_element) {
      return rawAccumulateAllValuesOftraceLink(new Object[]{
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
    public Set<EObject> getAllValuesOfcurrent_element(final Created.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_element(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfcurrent_element(final TraceLink pTraceLink) {
      return rawAccumulateAllValuesOfcurrent_element(new Object[]{
      pTraceLink, 
      null
      });
    }
    
    @Override
    protected Created.Match tupleToMatch(final Tuple t) {
      try {
          return Created.Match.newMatch((TraceLink) t.get(POSITION_TRACELINK), (EObject) t.get(POSITION_CURRENT_ELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Created.Match arrayToMatch(final Object[] match) {
      try {
          return Created.Match.newMatch((TraceLink) match[POSITION_TRACELINK], (EObject) match[POSITION_CURRENT_ELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Created.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Created.Match.newMutableMatch((TraceLink) match[POSITION_TRACELINK], (EObject) match[POSITION_CURRENT_ELEMENT]);
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
    public static IQuerySpecification<Created.Matcher> querySpecification() {
      return Created.instance();
    }
  }
  
  private Created() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Created instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Created.Matcher instantiate(final ViatraQueryEngine engine) {
    return Created.Matcher.on(engine);
  }
  
  @Override
  public Created.Matcher instantiate() {
    return Created.Matcher.create();
  }
  
  @Override
  public Created.Match newEmptyMatch() {
    return Created.Match.newEmptyMatch();
  }
  
  @Override
  public Created.Match newMatch(final Object... parameters) {
    return Created.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.trace.api.Created (visibility: PUBLIC, simpleName: Created, identifier: se.mdh.idt.benji.trace.api.Created, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace.api) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.trace.api.Created (visibility: PUBLIC, simpleName: Created, identifier: se.mdh.idt.benji.trace.api.Created, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace.api) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Created INSTANCE = new Created();
    
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
    private final static Created.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pTraceLink = new PParameter("traceLink", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_element = new PParameter("current_element", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pTraceLink, parameter_pCurrent_element);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.trace.api.created";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("traceLink","current_element");
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
          PVariable var_current_element = body.getOrCreateVariableByName("current_element");
          PVariable var__initial_element = body.getOrCreateVariableByName("_initial_element");
          new TypeConstraint(body, Tuples.flatTupleOf(var_traceLink), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_traceLink, parameter_pTraceLink),
             new ExportedParameter(body, var_current_element, parameter_pCurrent_element)
          ));
          // 	neg find initial (traceLink, _initial_element)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_traceLink, var__initial_element), Initial.instance().getInternalQueryRepresentation());
          //  	find current (traceLink, current_element)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_traceLink, var_current_element), Current.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}