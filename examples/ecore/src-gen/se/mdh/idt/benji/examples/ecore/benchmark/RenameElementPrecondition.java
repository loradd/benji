/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.ecore/src/se/mdh/idt/benji/examples/ecore/benchmark/Queries.vql
 */
package se.mdh.idt.benji.examples.ecore.benchmark;

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
 *         pattern RenameElementPrecondition(
 *         	eClass: Trace, eAttribute: Trace
 *         ) {
 *         	
 *         	Trace.initial(eAttribute, eInitialAttribute);
 *         	Trace.current(eAttribute, eCurrentAttribute);
 *         	EAttribute.name(eInitialAttribute, eAttributeName);
 *         	EAttribute.name(eCurrentAttribute, eAttributeName);
 *         	eAttributeName == "nickname";
 *         	
 *         	Trace.initial(eClass, eInitialClass);
 *         	Trace.current(eClass, eCurrentClass);
 *         	EClass.name(eInitialClass, eClassName);
 *         	EClass.name(eCurrentClass, eClassName);
 *         	eClassName == "DomesticAnimal";
 *         	EClass.eStructuralFeatures(eInitialClass, eInitialAttribute);
 *         	EClass.eStructuralFeatures(eCurrentClass, eCurrentAttribute);
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
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.ecore.benchmark.RenameElementPrecondition pattern,
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
    private Trace fEClass;
    
    private Trace fEAttribute;
    
    private static List<String> parameterNames = makeImmutableList("eClass", "eAttribute");
    
    private Match(final Trace pEClass, final Trace pEAttribute) {
      this.fEClass = pEClass;
      this.fEAttribute = pEAttribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "eClass": return this.fEClass;
          case "eAttribute": return this.fEAttribute;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEClass;
          case 1: return this.fEAttribute;
          default: return null;
      }
    }
    
    public Trace getEClass() {
      return this.fEClass;
    }
    
    public Trace getEAttribute() {
      return this.fEAttribute;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("eClass".equals(parameterName) ) {
          this.fEClass = (Trace) newValue;
          return true;
      }
      if ("eAttribute".equals(parameterName) ) {
          this.fEAttribute = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setEClass(final Trace pEClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEClass = pEClass;
    }
    
    public void setEAttribute(final Trace pEAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEAttribute = pEAttribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.ecore.benchmark.RenameElementPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return RenameElementPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEClass, fEAttribute};
    }
    
    @Override
    public RenameElementPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fEClass, fEAttribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"eClass\"=" + prettyPrintValue(fEClass) + ", ");
      result.append("\"eAttribute\"=" + prettyPrintValue(fEAttribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEClass, fEAttribute);
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
          return Objects.equals(fEClass, other.fEClass) && Objects.equals(fEAttribute, other.fEAttribute);
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
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RenameElementPrecondition.Match newMutableMatch(final Trace pEClass, final Trace pEAttribute) {
      return new Mutable(pEClass, pEAttribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RenameElementPrecondition.Match newMatch(final Trace pEClass, final Trace pEAttribute) {
      return new Immutable(pEClass, pEAttribute);
    }
    
    private static final class Mutable extends RenameElementPrecondition.Match {
      Mutable(final Trace pEClass, final Trace pEAttribute) {
        super(pEClass, pEAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RenameElementPrecondition.Match {
      Immutable(final Trace pEClass, final Trace pEAttribute) {
        super(pEClass, pEAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.ecore.benchmark.RenameElementPrecondition pattern,
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
   * pattern RenameElementPrecondition(
   * 	eClass: Trace, eAttribute: Trace
   * ) {
   * 	
   * 	Trace.initial(eAttribute, eInitialAttribute);
   * 	Trace.current(eAttribute, eCurrentAttribute);
   * 	EAttribute.name(eInitialAttribute, eAttributeName);
   * 	EAttribute.name(eCurrentAttribute, eAttributeName);
   * 	eAttributeName == "nickname";
   * 	
   * 	Trace.initial(eClass, eInitialClass);
   * 	Trace.current(eClass, eCurrentClass);
   * 	EClass.name(eInitialClass, eClassName);
   * 	EClass.name(eCurrentClass, eClassName);
   * 	eClassName == "DomesticAnimal";
   * 	EClass.eStructuralFeatures(eInitialClass, eInitialAttribute);
   * 	EClass.eStructuralFeatures(eCurrentClass, eCurrentAttribute);
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
    
    private static final int POSITION_ECLASS = 0;
    
    private static final int POSITION_EATTRIBUTE = 1;
    
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
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RenameElementPrecondition.Match> getAllMatches(final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllMatches(new Object[]{pEClass, pEAttribute}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RenameElementPrecondition.Match> streamAllMatches(final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllMatches(new Object[]{pEClass, pEAttribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RenameElementPrecondition.Match> getOneArbitraryMatch(final Trace pEClass, final Trace pEAttribute) {
      return rawGetOneArbitraryMatch(new Object[]{pEClass, pEAttribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pEClass, final Trace pEAttribute) {
      return rawHasMatch(new Object[]{pEClass, pEAttribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pEClass, final Trace pEAttribute) {
      return rawCountMatches(new Object[]{pEClass, pEAttribute});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pEClass, final Trace pEAttribute, final Consumer<? super RenameElementPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEClass, pEAttribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RenameElementPrecondition.Match newMatch(final Trace pEClass, final Trace pEAttribute) {
      return RenameElementPrecondition.Match.newMatch(pEClass, pEAttribute);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ECLASS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeClass() {
      return rawStreamAllValuesOfeClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeClass() {
      return rawStreamAllValuesOfeClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeClass(final RenameElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfeClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeClass(final Trace pEAttribute) {
      return rawStreamAllValuesOfeClass(new Object[]{null, pEAttribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeClass(final RenameElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfeClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeClass(final Trace pEAttribute) {
      return rawStreamAllValuesOfeClass(new Object[]{null, pEAttribute}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeAttribute(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EATTRIBUTE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeAttribute() {
      return rawStreamAllValuesOfeAttribute(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeAttribute() {
      return rawStreamAllValuesOfeAttribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeAttribute(final RenameElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfeAttribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeAttribute(final Trace pEClass) {
      return rawStreamAllValuesOfeAttribute(new Object[]{pEClass, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeAttribute(final RenameElementPrecondition.Match partialMatch) {
      return rawStreamAllValuesOfeAttribute(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeAttribute(final Trace pEClass) {
      return rawStreamAllValuesOfeAttribute(new Object[]{pEClass, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected RenameElementPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return RenameElementPrecondition.Match.newMatch((Trace) t.get(POSITION_ECLASS), (Trace) t.get(POSITION_EATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameElementPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return RenameElementPrecondition.Match.newMatch((Trace) match[POSITION_ECLASS], (Trace) match[POSITION_EATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameElementPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RenameElementPrecondition.Match.newMutableMatch((Trace) match[POSITION_ECLASS], (Trace) match[POSITION_EATTRIBUTE]);
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
    return RenameElementPrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1]);
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
    
    private final PParameter parameter_eClass = new PParameter("eClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eAttribute = new PParameter("eAttribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_eClass, parameter_eAttribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.ecore.benchmark.RenameElementPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("eClass","eAttribute");
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
          PVariable var_eClass = body.getOrCreateVariableByName("eClass");
          PVariable var_eAttribute = body.getOrCreateVariableByName("eAttribute");
          PVariable var_eInitialAttribute = body.getOrCreateVariableByName("eInitialAttribute");
          PVariable var_eCurrentAttribute = body.getOrCreateVariableByName("eCurrentAttribute");
          PVariable var_eAttributeName = body.getOrCreateVariableByName("eAttributeName");
          PVariable var_eInitialClass = body.getOrCreateVariableByName("eInitialClass");
          PVariable var_eCurrentClass = body.getOrCreateVariableByName("eCurrentClass");
          PVariable var_eClassName = body.getOrCreateVariableByName("eClassName");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_eClass, parameter_eClass),
             new ExportedParameter(body, var_eAttribute, parameter_eAttribute)
          ));
          // 		Trace.initial(eAttribute, eInitialAttribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eAttribute, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_eInitialAttribute);
          // 	Trace.current(eAttribute, eCurrentAttribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eAttribute, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_eCurrentAttribute);
          // 	EAttribute.name(eInitialAttribute, eAttributeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialAttribute, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_eAttributeName);
          // 	EAttribute.name(eCurrentAttribute, eAttributeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentAttribute, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var_eAttributeName);
          // 	eAttributeName == "nickname"
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "nickname");
          new Equality(body, var_eAttributeName, var__virtual_4_);
          // 		Trace.initial(eClass, eInitialClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_5_, var_eInitialClass);
          // 	Trace.current(eClass, eCurrentClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_6_, var_eCurrentClass);
          // 	EClass.name(eInitialClass, eClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_7_, var_eClassName);
          // 	EClass.name(eCurrentClass, eClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_8_, var_eClassName);
          // 	eClassName == "DomesticAnimal"
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "DomesticAnimal");
          new Equality(body, var_eClassName, var__virtual_9_);
          // 	EClass.eStructuralFeatures(eInitialClass, eInitialAttribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EStructuralFeature")));
          new Equality(body, var__virtual_10_, var_eInitialAttribute);
          // 	EClass.eStructuralFeatures(eCurrentClass, eCurrentAttribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EStructuralFeature")));
          new Equality(body, var__virtual_11_, var_eCurrentAttribute);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
