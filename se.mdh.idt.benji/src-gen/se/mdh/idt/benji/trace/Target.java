/**
 * Generated from platform:/resource/se.mdh.idt.benji/src/se/mdh/idt/benji/trace/TracePatterns.vql
 */
package se.mdh.idt.benji.trace;

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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Target extends BaseGeneratedEMFQuerySpecification<Target.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.trace.target pattern,
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
    
    private EObject fTarget;
    
    private static List<String> parameterNames = makeImmutableList("traceLink", "target");
    
    private Match(final TraceLink pTraceLink, final EObject pTarget) {
      this.fTraceLink = pTraceLink;
      this.fTarget = pTarget;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("traceLink".equals(parameterName)) return this.fTraceLink;
      if ("target".equals(parameterName)) return this.fTarget;
      return null;
    }
    
    public TraceLink getTraceLink() {
      return this.fTraceLink;
    }
    
    public EObject getTarget() {
      return this.fTarget;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("traceLink".equals(parameterName) ) {
          this.fTraceLink = (TraceLink) newValue;
          return true;
      }
      if ("target".equals(parameterName) ) {
          this.fTarget = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setTraceLink(final TraceLink pTraceLink) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTraceLink = pTraceLink;
    }
    
    public void setTarget(final EObject pTarget) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTarget = pTarget;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.trace.target";
    }
    
    @Override
    public List<String> parameterNames() {
      return Target.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTraceLink, fTarget};
    }
    
    @Override
    public Target.Match toImmutable() {
      return isMutable() ? newMatch(fTraceLink, fTarget) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"traceLink\"=" + prettyPrintValue(fTraceLink) + ", ");
      result.append("\"target\"=" + prettyPrintValue(fTarget));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fTraceLink, fTarget);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Target.Match)) {
          Target.Match other = (Target.Match) obj;
          return Objects.equals(fTraceLink, other.fTraceLink) && Objects.equals(fTarget, other.fTarget);
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
    public Target specification() {
      return Target.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Target.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Target.Match newMutableMatch(final TraceLink pTraceLink, final EObject pTarget) {
      return new Mutable(pTraceLink, pTarget);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Target.Match newMatch(final TraceLink pTraceLink, final EObject pTarget) {
      return new Immutable(pTraceLink, pTarget);
    }
    
    private static final class Mutable extends Target.Match {
      Mutable(final TraceLink pTraceLink, final EObject pTarget) {
        super(pTraceLink, pTarget);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Target.Match {
      Immutable(final TraceLink pTraceLink, final EObject pTarget) {
        super(pTraceLink, pTarget);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.trace.target pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // trace link - target
   * pattern target(traceLink : TraceLink, target : EObject) = {
   * 	TraceLink.target(traceLink, target); 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Target
   * 
   */
  public static class Matcher extends BaseMatcher<Target.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Target.Matcher on(final ViatraQueryEngine engine) {
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
    public static Target.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_TRACELINK = 0;
    
    private final static int POSITION_TARGET = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Target.Matcher.class);
    
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
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Target.Match> getAllMatches(final TraceLink pTraceLink, final EObject pTarget) {
      return rawGetAllMatches(new Object[]{pTraceLink, pTarget});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Target.Match getOneArbitraryMatch(final TraceLink pTraceLink, final EObject pTarget) {
      return rawGetOneArbitraryMatch(new Object[]{pTraceLink, pTarget});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pTraceLink, final EObject pTarget) {
      return rawHasMatch(new Object[]{pTraceLink, pTarget});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pTraceLink, final EObject pTarget) {
      return rawCountMatches(new Object[]{pTraceLink, pTarget});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pTraceLink, final EObject pTarget, final IMatchProcessor<? super Target.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTraceLink, pTarget}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTraceLink the fixed value of pattern parameter traceLink, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Target.Match newMatch(final TraceLink pTraceLink, final EObject pTarget) {
      return Target.Match.newMatch(pTraceLink, pTarget);
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
    public Set<TraceLink> getAllValuesOftraceLink(final Target.Match partialMatch) {
      return rawAccumulateAllValuesOftraceLink(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for traceLink.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftraceLink(final EObject pTarget) {
      return rawAccumulateAllValuesOftraceLink(new Object[]{
      null, 
      pTarget
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EObject> rawAccumulateAllValuesOftarget(final Object[] parameters) {
      Set<EObject> results = new HashSet<EObject>();
      rawAccumulateAllValues(POSITION_TARGET, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftarget() {
      return rawAccumulateAllValuesOftarget(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftarget(final Target.Match partialMatch) {
      return rawAccumulateAllValuesOftarget(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftarget(final TraceLink pTraceLink) {
      return rawAccumulateAllValuesOftarget(new Object[]{
      pTraceLink, 
      null
      });
    }
    
    @Override
    protected Target.Match tupleToMatch(final Tuple t) {
      try {
          return Target.Match.newMatch((TraceLink) t.get(POSITION_TRACELINK), (EObject) t.get(POSITION_TARGET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Target.Match arrayToMatch(final Object[] match) {
      try {
          return Target.Match.newMatch((TraceLink) match[POSITION_TRACELINK], (EObject) match[POSITION_TARGET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Target.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Target.Match.newMutableMatch((TraceLink) match[POSITION_TRACELINK], (EObject) match[POSITION_TARGET]);
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
    public static IQuerySpecification<Target.Matcher> querySpecification() {
      return Target.instance();
    }
  }
  
  private Target() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Target instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Target.Matcher instantiate(final ViatraQueryEngine engine) {
    return Target.Matcher.on(engine);
  }
  
  @Override
  public Target.Matcher instantiate() {
    return Target.Matcher.create();
  }
  
  @Override
  public Target.Match newEmptyMatch() {
    return Target.Match.newEmptyMatch();
  }
  
  @Override
  public Target.Match newMatch(final Object... parameters) {
    return Target.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.trace.Target (visibility: PUBLIC, simpleName: Target, identifier: se.mdh.idt.benji.trace.Target, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.trace.Target (visibility: PUBLIC, simpleName: Target, identifier: se.mdh.idt.benji.trace.Target, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.trace) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Target INSTANCE = new Target();
    
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
    private final static Target.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pTraceLink = new PParameter("traceLink", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pTarget = new PParameter("target", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pTraceLink, parameter_pTarget);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.trace.target";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("traceLink","target");
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
          PVariable var_target = body.getOrCreateVariableByName("target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_traceLink), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_traceLink, parameter_pTraceLink),
             new ExportedParameter(body, var_target, parameter_pTarget)
          ));
          // 	TraceLink.target(traceLink, target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_traceLink), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_traceLink, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_target);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
