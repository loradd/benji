/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.models20/src/se/mdh/idt/benji/examples/models20/ecore/Queries.vql
 */
package se.mdh.idt.benji.examples.models20.ecore;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         // Move Element - Postcondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern MoveElementPostcondition(
 *         	ePackage: Trace, eSubPackage: Trace, eClass: Trace
 *         ) {
 *         	
 *         	Trace.initial(eClass, eInitialClass);
 *         	Trace.current(eClass, eCurrentClass);
 *         	EClass.name(eInitialClass, eClassName);
 *         	EClass.name(eCurrentClass, eClassName);
 *         	eClassName == "DomesticAnimal";
 *         	
 *         	Trace.initial(ePackage, eInitialPackage);
 *         	Trace.current(ePackage, eCurrentPackage);
 *         	EPackage.name(eInitialPackage, ePackageName);
 *         	EPackage.name(eCurrentPackage, ePackageName);
 *         	ePackageName == "de";
 *         	EPackage.eClassifiers(eInitialPackage, eInitialClass);
 *         	neg EPackage.eClassifiers(eCurrentPackage, eCurrentClass);
 *         	
 *         	neg Trace.initial(eSubPackage, _eInitialSubPackage);
 *         	Trace.current(eSubPackage, eCurrentSubPackage);
 *         	EPackage.name(eCurrentSubPackage, "shop");
 *         	EPackage.eClassifiers(eCurrentSubPackage, eCurrentClass);
 *         	EPackage.eSuperPackage(eCurrentSubPackage, eCurrentPackage);
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MoveElementPostcondition extends BaseGeneratedEMFQuerySpecification<MoveElementPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.models20.ecore.MoveElementPostcondition pattern,
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
    private Trace fEPackage;
    
    private Trace fESubPackage;
    
    private Trace fEClass;
    
    private static List<String> parameterNames = makeImmutableList("ePackage", "eSubPackage", "eClass");
    
    private Match(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      this.fEPackage = pEPackage;
      this.fESubPackage = pESubPackage;
      this.fEClass = pEClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ePackage": return this.fEPackage;
          case "eSubPackage": return this.fESubPackage;
          case "eClass": return this.fEClass;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEPackage;
          case 1: return this.fESubPackage;
          case 2: return this.fEClass;
          default: return null;
      }
    }
    
    public Trace getEPackage() {
      return this.fEPackage;
    }
    
    public Trace getESubPackage() {
      return this.fESubPackage;
    }
    
    public Trace getEClass() {
      return this.fEClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ePackage".equals(parameterName) ) {
          this.fEPackage = (Trace) newValue;
          return true;
      }
      if ("eSubPackage".equals(parameterName) ) {
          this.fESubPackage = (Trace) newValue;
          return true;
      }
      if ("eClass".equals(parameterName) ) {
          this.fEClass = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setEPackage(final Trace pEPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEPackage = pEPackage;
    }
    
    public void setESubPackage(final Trace pESubPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fESubPackage = pESubPackage;
    }
    
    public void setEClass(final Trace pEClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEClass = pEClass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.models20.ecore.MoveElementPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MoveElementPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEPackage, fESubPackage, fEClass};
    }
    
    @Override
    public MoveElementPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fEPackage, fESubPackage, fEClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ePackage\"=" + prettyPrintValue(fEPackage) + ", ");
      result.append("\"eSubPackage\"=" + prettyPrintValue(fESubPackage) + ", ");
      result.append("\"eClass\"=" + prettyPrintValue(fEClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEPackage, fESubPackage, fEClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MoveElementPostcondition.Match)) {
          MoveElementPostcondition.Match other = (MoveElementPostcondition.Match) obj;
          return Objects.equals(fEPackage, other.fEPackage) && Objects.equals(fESubPackage, other.fESubPackage) && Objects.equals(fEClass, other.fEClass);
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
    public MoveElementPostcondition specification() {
      return MoveElementPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MoveElementPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MoveElementPostcondition.Match newMutableMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return new Mutable(pEPackage, pESubPackage, pEClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MoveElementPostcondition.Match newMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return new Immutable(pEPackage, pESubPackage, pEClass);
    }
    
    private static final class Mutable extends MoveElementPostcondition.Match {
      Mutable(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
        super(pEPackage, pESubPackage, pEClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MoveElementPostcondition.Match {
      Immutable(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
        super(pEPackage, pESubPackage, pEClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.models20.ecore.MoveElementPostcondition pattern,
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
   * // Move Element - Postcondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern MoveElementPostcondition(
   * 	ePackage: Trace, eSubPackage: Trace, eClass: Trace
   * ) {
   * 	
   * 	Trace.initial(eClass, eInitialClass);
   * 	Trace.current(eClass, eCurrentClass);
   * 	EClass.name(eInitialClass, eClassName);
   * 	EClass.name(eCurrentClass, eClassName);
   * 	eClassName == "DomesticAnimal";
   * 	
   * 	Trace.initial(ePackage, eInitialPackage);
   * 	Trace.current(ePackage, eCurrentPackage);
   * 	EPackage.name(eInitialPackage, ePackageName);
   * 	EPackage.name(eCurrentPackage, ePackageName);
   * 	ePackageName == "de";
   * 	EPackage.eClassifiers(eInitialPackage, eInitialClass);
   * 	neg EPackage.eClassifiers(eCurrentPackage, eCurrentClass);
   * 	
   * 	neg Trace.initial(eSubPackage, _eInitialSubPackage);
   * 	Trace.current(eSubPackage, eCurrentSubPackage);
   * 	EPackage.name(eCurrentSubPackage, "shop");
   * 	EPackage.eClassifiers(eCurrentSubPackage, eCurrentClass);
   * 	EPackage.eSuperPackage(eCurrentSubPackage, eCurrentPackage);
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MoveElementPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<MoveElementPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MoveElementPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MoveElementPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EPACKAGE = 0;
    
    private static final int POSITION_ESUBPACKAGE = 1;
    
    private static final int POSITION_ECLASS = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MoveElementPostcondition.Matcher.class);
    
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
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MoveElementPostcondition.Match> getAllMatches(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return rawStreamAllMatches(new Object[]{pEPackage, pESubPackage, pEClass}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MoveElementPostcondition.Match> streamAllMatches(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return rawStreamAllMatches(new Object[]{pEPackage, pESubPackage, pEClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MoveElementPostcondition.Match> getOneArbitraryMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return rawGetOneArbitraryMatch(new Object[]{pEPackage, pESubPackage, pEClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return rawHasMatch(new Object[]{pEPackage, pESubPackage, pEClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return rawCountMatches(new Object[]{pEPackage, pESubPackage, pEClass});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Consumer<? super MoveElementPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEPackage, pESubPackage, pEClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MoveElementPostcondition.Match newMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return MoveElementPostcondition.Match.newMatch(pEPackage, pESubPackage, pEClass);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfePackage(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EPACKAGE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfePackage() {
      return rawStreamAllValuesOfePackage(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfePackage() {
      return rawStreamAllValuesOfePackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfePackage(final MoveElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfePackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfePackage(final Trace pESubPackage, final Trace pEClass) {
      return rawStreamAllValuesOfePackage(new Object[]{null, pESubPackage, pEClass});
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfePackage(final MoveElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfePackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfePackage(final Trace pESubPackage, final Trace pEClass) {
      return rawStreamAllValuesOfePackage(new Object[]{null, pESubPackage, pEClass}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeSubPackage(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ESUBPACKAGE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSubPackage() {
      return rawStreamAllValuesOfeSubPackage(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeSubPackage() {
      return rawStreamAllValuesOfeSubPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeSubPackage(final MoveElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeSubPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeSubPackage(final Trace pEPackage, final Trace pEClass) {
      return rawStreamAllValuesOfeSubPackage(new Object[]{pEPackage, null, pEClass});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSubPackage(final MoveElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeSubPackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSubPackage(final Trace pEPackage, final Trace pEClass) {
      return rawStreamAllValuesOfeSubPackage(new Object[]{pEPackage, null, pEClass}).collect(Collectors.toSet());
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
    public Stream<Trace> streamAllValuesOfeClass(final MoveElementPostcondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfeClass(final Trace pEPackage, final Trace pESubPackage) {
      return rawStreamAllValuesOfeClass(new Object[]{pEPackage, pESubPackage, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeClass(final MoveElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeClass(final Trace pEPackage, final Trace pESubPackage) {
      return rawStreamAllValuesOfeClass(new Object[]{pEPackage, pESubPackage, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected MoveElementPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return MoveElementPostcondition.Match.newMatch((Trace) t.get(POSITION_EPACKAGE), (Trace) t.get(POSITION_ESUBPACKAGE), (Trace) t.get(POSITION_ECLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoveElementPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return MoveElementPostcondition.Match.newMatch((Trace) match[POSITION_EPACKAGE], (Trace) match[POSITION_ESUBPACKAGE], (Trace) match[POSITION_ECLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoveElementPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MoveElementPostcondition.Match.newMutableMatch((Trace) match[POSITION_EPACKAGE], (Trace) match[POSITION_ESUBPACKAGE], (Trace) match[POSITION_ECLASS]);
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
    public static IQuerySpecification<MoveElementPostcondition.Matcher> querySpecification() {
      return MoveElementPostcondition.instance();
    }
  }
  
  private MoveElementPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MoveElementPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoveElementPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MoveElementPostcondition.Matcher.on(engine);
  }
  
  @Override
  public MoveElementPostcondition.Matcher instantiate() {
    return MoveElementPostcondition.Matcher.create();
  }
  
  @Override
  public MoveElementPostcondition.Match newEmptyMatch() {
    return MoveElementPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public MoveElementPostcondition.Match newMatch(final Object... parameters) {
    return MoveElementPostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MoveElementPostcondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link MoveElementPostcondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MoveElementPostcondition INSTANCE = new MoveElementPostcondition();
    
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
    private static final MoveElementPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ePackage = new PParameter("ePackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eSubPackage = new PParameter("eSubPackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eClass = new PParameter("eClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ePackage, parameter_eSubPackage, parameter_eClass);
    
    private class Embedded_1_EPackage_eClassifiers extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "org.eclipse.emf.ecore.EPackage", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EPackage")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "org.eclipse.emf.ecore.EClassifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_EPackage_eClassifiers() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_2_EPackage_eClassifiers";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  EPackage.eClassifiers(eCurrentPackage, eCurrentClass)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private class Embedded_2_Trace_initial extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_2_Trace_initial() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_2_Trace_initial";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  Trace.initial(eSubPackage, _eInitialSubPackage)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.models20.ecore.MoveElementPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ePackage","eSubPackage","eClass");
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
          PVariable var_ePackage = body.getOrCreateVariableByName("ePackage");
          PVariable var_eSubPackage = body.getOrCreateVariableByName("eSubPackage");
          PVariable var_eClass = body.getOrCreateVariableByName("eClass");
          PVariable var_eInitialClass = body.getOrCreateVariableByName("eInitialClass");
          PVariable var_eCurrentClass = body.getOrCreateVariableByName("eCurrentClass");
          PVariable var_eClassName = body.getOrCreateVariableByName("eClassName");
          PVariable var_eInitialPackage = body.getOrCreateVariableByName("eInitialPackage");
          PVariable var_eCurrentPackage = body.getOrCreateVariableByName("eCurrentPackage");
          PVariable var_ePackageName = body.getOrCreateVariableByName("ePackageName");
          PVariable var__eInitialSubPackage = body.getOrCreateVariableByName("_eInitialSubPackage");
          PVariable var_eCurrentSubPackage = body.getOrCreateVariableByName("eCurrentSubPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ePackage, parameter_ePackage),
             new ExportedParameter(body, var_eSubPackage, parameter_eSubPackage),
             new ExportedParameter(body, var_eClass, parameter_eClass)
          ));
          // 		Trace.initial(eClass, eInitialClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_eInitialClass);
          // 	Trace.current(eClass, eCurrentClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_eCurrentClass);
          // 	EClass.name(eInitialClass, eClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_eClassName);
          // 	EClass.name(eCurrentClass, eClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var_eClassName);
          // 	eClassName == "DomesticAnimal"
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "DomesticAnimal");
          new Equality(body, var_eClassName, var__virtual_4_);
          // 		Trace.initial(ePackage, eInitialPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_5_, var_eInitialPackage);
          // 	Trace.current(ePackage, eCurrentPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_6_, var_eCurrentPackage);
          // 	EPackage.name(eInitialPackage, ePackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_7_, var_ePackageName);
          // 	EPackage.name(eCurrentPackage, ePackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_8_, var_ePackageName);
          // 	ePackageName == "de"
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "de");
          new Equality(body, var_ePackageName, var__virtual_9_);
          // 	EPackage.eClassifiers(eInitialPackage, eInitialClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_10_, var_eInitialClass);
          // 	neg EPackage.eClassifiers(eCurrentPackage, eCurrentClass)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_eCurrentPackage, var_eCurrentClass), new MoveElementPostcondition.GeneratedPQuery.Embedded_1_EPackage_eClassifiers());
          // 		neg Trace.initial(eSubPackage, _eInitialSubPackage)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_eSubPackage, var__eInitialSubPackage), new MoveElementPostcondition.GeneratedPQuery.Embedded_2_Trace_initial());
          // 	Trace.current(eSubPackage, eCurrentSubPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSubPackage, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_11_, var_eCurrentSubPackage);
          // 	EPackage.name(eCurrentSubPackage, "shop")
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new ConstantValue(body, var__virtual_12_, "shop");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_13_, var__virtual_12_);
          // 	EPackage.eClassifiers(eCurrentSubPackage, eCurrentClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_14_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_14_, var_eCurrentClass);
          // 	EPackage.eSuperPackage(eCurrentSubPackage, eCurrentPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eSuperPackage")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new Equality(body, var__virtual_15_, var_eCurrentPackage);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
