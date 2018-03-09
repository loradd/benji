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
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private EObject fSource;
    
    private static List<String> parameterNames = makeImmutableList("source");
    
    private Match(final EObject pSource) {
      this.fSource = pSource;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("source".equals(parameterName)) return this.fSource;
      return null;
    }
    
    public EObject getSource() {
      return this.fSource;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("source".equals(parameterName) ) {
          this.fSource = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setSource(final EObject pSource) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSource = pSource;
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
      return new Object[]{fSource};
    }
    
    @Override
    public Deleted.Match toImmutable() {
      return isMutable() ? newMatch(fSource) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"source\"=" + prettyPrintValue(fSource));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSource);
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
          return Objects.equals(fSource, other.fSource);
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
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Deleted.Match newMutableMatch(final EObject pSource) {
      return new Mutable(pSource);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Deleted.Match newMatch(final EObject pSource) {
      return new Immutable(pSource);
    }
    
    private static final class Mutable extends Deleted.Match {
      Mutable(final EObject pSource) {
        super(pSource);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Deleted.Match {
      Immutable(final EObject pSource) {
        super(pSource);
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
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // trace link - deleted element
   * pattern deleted (source : EObject) = {
   * 	find initial (traceLink, source); 
   * 	neg find current (traceLink, _); 
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Deleted
   * 
   */
  public static class Matcher extends BaseMatcher<Deleted.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
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
    
    private final static int POSITION_SOURCE = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Deleted.Matcher.class);
    
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
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Deleted.Match> getAllMatches(final EObject pSource) {
      return rawGetAllMatches(new Object[]{pSource});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Deleted.Match getOneArbitraryMatch(final EObject pSource) {
      return rawGetOneArbitraryMatch(new Object[]{pSource});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pSource) {
      return rawHasMatch(new Object[]{pSource});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pSource) {
      return rawCountMatches(new Object[]{pSource});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pSource, final IMatchProcessor<? super Deleted.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSource}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Deleted.Match newMatch(final EObject pSource) {
      return Deleted.Match.newMatch(pSource);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EObject> rawAccumulateAllValuesOfsource(final Object[] parameters) {
      Set<EObject> results = new HashSet<EObject>();
      rawAccumulateAllValues(POSITION_SOURCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfsource() {
      return rawAccumulateAllValuesOfsource(emptyArray());
    }
    
    @Override
    protected Deleted.Match tupleToMatch(final Tuple t) {
      try {
          return Deleted.Match.newMatch((EObject) t.get(POSITION_SOURCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted.Match arrayToMatch(final Object[] match) {
      try {
          return Deleted.Match.newMatch((EObject) match[POSITION_SOURCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Deleted.Match.newMutableMatch((EObject) match[POSITION_SOURCE]);
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
    return Deleted.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
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
    private final static Deleted INSTANCE = new Deleted();
    
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
    private final static Deleted.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSource = new PParameter("source", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSource);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.trace.api.deleted";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("source");
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
          PVariable var_source = body.getOrCreateVariableByName("source");
          PVariable var_traceLink = body.getOrCreateVariableByName("traceLink");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_source, parameter_pSource)
          ));
          // 	find initial (traceLink, source)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_traceLink, var_source), Initial.instance().getInternalQueryRepresentation());
          //  	neg find current (traceLink, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_traceLink, var___0_), Current.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
