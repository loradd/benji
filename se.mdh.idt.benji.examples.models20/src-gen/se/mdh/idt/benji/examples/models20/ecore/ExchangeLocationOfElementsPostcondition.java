/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.models20/src/se/mdh/idt/benji/examples/models20/ecore/Queries.vql
 */
package se.mdh.idt.benji.examples.models20.ecore;

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
 *         // Exchange Location of Elements - Postcondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern ExchangeLocationOfElementsPostcondition(
 *         	eLeftPackage: Trace, eRightPackage: Trace,
 *         	eLeftClass: Trace, eRightClass: Trace
 *         ) {
 *         	
 *         	Trace.initial(eLeftClass, eInitialLeftClass);
 *         	Trace.current(eLeftClass, eCurrentLeftClass);
 *         	EClass.name(eInitialLeftClass, eLeftClassName);
 *         	EClass.name(eCurrentLeftClass, eLeftClassName);
 *         	eLeftClassName == "DomesticAnimal";
 *         	
 *         	Trace.initial(eRightClass, eInitialRightClass);
 *         	Trace.current(eRightClass, eCurrentRightClass);
 *         	EClass.name(eInitialRightClass, eRightClassName);
 *         	EClass.name(eCurrentRightClass, eRightClassName);
 *         	eRightClassName == "DomesticAnimalNew";
 *         	
 *         	Trace.initial(eLeftPackage, eInitialLeftPackage);
 *         	Trace.current(eLeftPackage, eCurrentLeftPackage);
 *         	EPackage.name(eInitialLeftPackage, eLeftPackageName);
 *         	EPackage.name(eCurrentLeftPackage, eLeftPackageName);
 *         	eLeftPackageName == "shop";
 *         	EPackage.eClassifiers(eInitialLeftPackage, eInitialLeftClass);
 *         	EPackage.eClassifiers(eCurrentLeftPackage, eCurrentRightClass);
 *         	
 *         	Trace.initial(eRightPackage, eInitialRightPackage);
 *         	Trace.current(eRightPackage, eCurrentRightPackage);
 *         	EPackage.name(eInitialRightPackage, eRightPackageName);
 *         	EPackage.name(eCurrentRightPackage, eRightPackageName);
 *         	eRightPackageName == "core";
 *         	EPackage.eClassifiers(eInitialRightPackage, eInitialRightClass);
 *         	EPackage.eClassifiers(eCurrentRightPackage, eCurrentLeftClass);
 *         	
 *         	Trace.initial(eRootPackage, eInitialRootPackage);
 *         	Trace.current(eRootPackage, eCurrentRootPackage);
 *         	EPackage.name(eInitialRootPackage, eRootPackageName);
 *         	EPackage.name(eCurrentRootPackage, eRootPackageName);
 *         	eRootPackageName == "de";
 *         	EPackage.eSubpackages(eInitialRootPackage, eInitialLeftPackage);
 *         	EPackage.eSubpackages(eCurrentRootPackage, eCurrentLeftPackage);
 *         	EPackage.eSubpackages(eInitialRootPackage, eInitialRightPackage);
 *         	EPackage.eSubpackages(eCurrentRootPackage, eCurrentRightPackage);
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
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPostcondition pattern,
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
    private Trace fELeftPackage;
    
    private Trace fERightPackage;
    
    private Trace fELeftClass;
    
    private Trace fERightClass;
    
    private static List<String> parameterNames = makeImmutableList("eLeftPackage", "eRightPackage", "eLeftClass", "eRightClass");
    
    private Match(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      this.fELeftPackage = pELeftPackage;
      this.fERightPackage = pERightPackage;
      this.fELeftClass = pELeftClass;
      this.fERightClass = pERightClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "eLeftPackage": return this.fELeftPackage;
          case "eRightPackage": return this.fERightPackage;
          case "eLeftClass": return this.fELeftClass;
          case "eRightClass": return this.fERightClass;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fELeftPackage;
          case 1: return this.fERightPackage;
          case 2: return this.fELeftClass;
          case 3: return this.fERightClass;
          default: return null;
      }
    }
    
    public Trace getELeftPackage() {
      return this.fELeftPackage;
    }
    
    public Trace getERightPackage() {
      return this.fERightPackage;
    }
    
    public Trace getELeftClass() {
      return this.fELeftClass;
    }
    
    public Trace getERightClass() {
      return this.fERightClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("eLeftPackage".equals(parameterName) ) {
          this.fELeftPackage = (Trace) newValue;
          return true;
      }
      if ("eRightPackage".equals(parameterName) ) {
          this.fERightPackage = (Trace) newValue;
          return true;
      }
      if ("eLeftClass".equals(parameterName) ) {
          this.fELeftClass = (Trace) newValue;
          return true;
      }
      if ("eRightClass".equals(parameterName) ) {
          this.fERightClass = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setELeftPackage(final Trace pELeftPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fELeftPackage = pELeftPackage;
    }
    
    public void setERightPackage(final Trace pERightPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fERightPackage = pERightPackage;
    }
    
    public void setELeftClass(final Trace pELeftClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fELeftClass = pELeftClass;
    }
    
    public void setERightClass(final Trace pERightClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fERightClass = pERightClass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExchangeLocationOfElementsPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fELeftPackage, fERightPackage, fELeftClass, fERightClass};
    }
    
    @Override
    public ExchangeLocationOfElementsPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fELeftPackage, fERightPackage, fELeftClass, fERightClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"eLeftPackage\"=" + prettyPrintValue(fELeftPackage) + ", ");
      result.append("\"eRightPackage\"=" + prettyPrintValue(fERightPackage) + ", ");
      result.append("\"eLeftClass\"=" + prettyPrintValue(fELeftClass) + ", ");
      result.append("\"eRightClass\"=" + prettyPrintValue(fERightClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fELeftPackage, fERightPackage, fELeftClass, fERightClass);
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
          return Objects.equals(fELeftPackage, other.fELeftPackage) && Objects.equals(fERightPackage, other.fERightPackage) && Objects.equals(fELeftClass, other.fELeftClass) && Objects.equals(fERightClass, other.fERightClass);
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
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExchangeLocationOfElementsPostcondition.Match newMutableMatch(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return new Mutable(pELeftPackage, pERightPackage, pELeftClass, pERightClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExchangeLocationOfElementsPostcondition.Match newMatch(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return new Immutable(pELeftPackage, pERightPackage, pELeftClass, pERightClass);
    }
    
    private static final class Mutable extends ExchangeLocationOfElementsPostcondition.Match {
      Mutable(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
        super(pELeftPackage, pERightPackage, pELeftClass, pERightClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExchangeLocationOfElementsPostcondition.Match {
      Immutable(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
        super(pELeftPackage, pERightPackage, pELeftClass, pERightClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPostcondition pattern,
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
   * // Exchange Location of Elements - Postcondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern ExchangeLocationOfElementsPostcondition(
   * 	eLeftPackage: Trace, eRightPackage: Trace,
   * 	eLeftClass: Trace, eRightClass: Trace
   * ) {
   * 	
   * 	Trace.initial(eLeftClass, eInitialLeftClass);
   * 	Trace.current(eLeftClass, eCurrentLeftClass);
   * 	EClass.name(eInitialLeftClass, eLeftClassName);
   * 	EClass.name(eCurrentLeftClass, eLeftClassName);
   * 	eLeftClassName == "DomesticAnimal";
   * 	
   * 	Trace.initial(eRightClass, eInitialRightClass);
   * 	Trace.current(eRightClass, eCurrentRightClass);
   * 	EClass.name(eInitialRightClass, eRightClassName);
   * 	EClass.name(eCurrentRightClass, eRightClassName);
   * 	eRightClassName == "DomesticAnimalNew";
   * 	
   * 	Trace.initial(eLeftPackage, eInitialLeftPackage);
   * 	Trace.current(eLeftPackage, eCurrentLeftPackage);
   * 	EPackage.name(eInitialLeftPackage, eLeftPackageName);
   * 	EPackage.name(eCurrentLeftPackage, eLeftPackageName);
   * 	eLeftPackageName == "shop";
   * 	EPackage.eClassifiers(eInitialLeftPackage, eInitialLeftClass);
   * 	EPackage.eClassifiers(eCurrentLeftPackage, eCurrentRightClass);
   * 	
   * 	Trace.initial(eRightPackage, eInitialRightPackage);
   * 	Trace.current(eRightPackage, eCurrentRightPackage);
   * 	EPackage.name(eInitialRightPackage, eRightPackageName);
   * 	EPackage.name(eCurrentRightPackage, eRightPackageName);
   * 	eRightPackageName == "core";
   * 	EPackage.eClassifiers(eInitialRightPackage, eInitialRightClass);
   * 	EPackage.eClassifiers(eCurrentRightPackage, eCurrentLeftClass);
   * 	
   * 	Trace.initial(eRootPackage, eInitialRootPackage);
   * 	Trace.current(eRootPackage, eCurrentRootPackage);
   * 	EPackage.name(eInitialRootPackage, eRootPackageName);
   * 	EPackage.name(eCurrentRootPackage, eRootPackageName);
   * 	eRootPackageName == "de";
   * 	EPackage.eSubpackages(eInitialRootPackage, eInitialLeftPackage);
   * 	EPackage.eSubpackages(eCurrentRootPackage, eCurrentLeftPackage);
   * 	EPackage.eSubpackages(eInitialRootPackage, eInitialRightPackage);
   * 	EPackage.eSubpackages(eCurrentRootPackage, eCurrentRightPackage);
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
    
    private static final int POSITION_ELEFTPACKAGE = 0;
    
    private static final int POSITION_ERIGHTPACKAGE = 1;
    
    private static final int POSITION_ELEFTCLASS = 2;
    
    private static final int POSITION_ERIGHTCLASS = 3;
    
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
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExchangeLocationOfElementsPostcondition.Match> getAllMatches(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawStreamAllMatches(new Object[]{pELeftPackage, pERightPackage, pELeftClass, pERightClass}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ExchangeLocationOfElementsPostcondition.Match> streamAllMatches(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawStreamAllMatches(new Object[]{pELeftPackage, pERightPackage, pELeftClass, pERightClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ExchangeLocationOfElementsPostcondition.Match> getOneArbitraryMatch(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawGetOneArbitraryMatch(new Object[]{pELeftPackage, pERightPackage, pELeftClass, pERightClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawHasMatch(new Object[]{pELeftPackage, pERightPackage, pELeftClass, pERightClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawCountMatches(new Object[]{pELeftPackage, pERightPackage, pELeftClass, pERightClass});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass, final Consumer<? super ExchangeLocationOfElementsPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pELeftPackage, pERightPackage, pELeftClass, pERightClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pELeftPackage the fixed value of pattern parameter eLeftPackage, or null if not bound.
     * @param pERightPackage the fixed value of pattern parameter eRightPackage, or null if not bound.
     * @param pELeftClass the fixed value of pattern parameter eLeftClass, or null if not bound.
     * @param pERightClass the fixed value of pattern parameter eRightClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExchangeLocationOfElementsPostcondition.Match newMatch(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return ExchangeLocationOfElementsPostcondition.Match.newMatch(pELeftPackage, pERightPackage, pELeftClass, pERightClass);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeLeftPackage(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEFTPACKAGE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeLeftPackage() {
      return rawStreamAllValuesOfeLeftPackage(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeLeftPackage() {
      return rawStreamAllValuesOfeLeftPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeLeftPackage(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeLeftPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeLeftPackage(final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawStreamAllValuesOfeLeftPackage(new Object[]{null, pERightPackage, pELeftClass, pERightClass});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeLeftPackage(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeLeftPackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeLeftPackage(final Trace pERightPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawStreamAllValuesOfeLeftPackage(new Object[]{null, pERightPackage, pELeftClass, pERightClass}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeRightPackage(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ERIGHTPACKAGE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeRightPackage() {
      return rawStreamAllValuesOfeRightPackage(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeRightPackage() {
      return rawStreamAllValuesOfeRightPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeRightPackage(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeRightPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeRightPackage(final Trace pELeftPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawStreamAllValuesOfeRightPackage(new Object[]{pELeftPackage, null, pELeftClass, pERightClass});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeRightPackage(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeRightPackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeRightPackage(final Trace pELeftPackage, final Trace pELeftClass, final Trace pERightClass) {
      return rawStreamAllValuesOfeRightPackage(new Object[]{pELeftPackage, null, pELeftClass, pERightClass}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeLeftClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEFTCLASS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeLeftClass() {
      return rawStreamAllValuesOfeLeftClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeLeftClass() {
      return rawStreamAllValuesOfeLeftClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeLeftClass(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeLeftClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeLeftClass(final Trace pELeftPackage, final Trace pERightPackage, final Trace pERightClass) {
      return rawStreamAllValuesOfeLeftClass(new Object[]{pELeftPackage, pERightPackage, null, pERightClass});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeLeftClass(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeLeftClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eLeftClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeLeftClass(final Trace pELeftPackage, final Trace pERightPackage, final Trace pERightClass) {
      return rawStreamAllValuesOfeLeftClass(new Object[]{pELeftPackage, pERightPackage, null, pERightClass}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeRightClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ERIGHTCLASS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeRightClass() {
      return rawStreamAllValuesOfeRightClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeRightClass() {
      return rawStreamAllValuesOfeRightClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeRightClass(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeRightClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeRightClass(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass) {
      return rawStreamAllValuesOfeRightClass(new Object[]{pELeftPackage, pERightPackage, pELeftClass, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeRightClass(final ExchangeLocationOfElementsPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeRightClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eRightClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeRightClass(final Trace pELeftPackage, final Trace pERightPackage, final Trace pELeftClass) {
      return rawStreamAllValuesOfeRightClass(new Object[]{pELeftPackage, pERightPackage, pELeftClass, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ExchangeLocationOfElementsPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExchangeLocationOfElementsPostcondition.Match.newMatch((Trace) t.get(POSITION_ELEFTPACKAGE), (Trace) t.get(POSITION_ERIGHTPACKAGE), (Trace) t.get(POSITION_ELEFTCLASS), (Trace) t.get(POSITION_ERIGHTCLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExchangeLocationOfElementsPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExchangeLocationOfElementsPostcondition.Match.newMatch((Trace) match[POSITION_ELEFTPACKAGE], (Trace) match[POSITION_ERIGHTPACKAGE], (Trace) match[POSITION_ELEFTCLASS], (Trace) match[POSITION_ERIGHTCLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExchangeLocationOfElementsPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExchangeLocationOfElementsPostcondition.Match.newMutableMatch((Trace) match[POSITION_ELEFTPACKAGE], (Trace) match[POSITION_ERIGHTPACKAGE], (Trace) match[POSITION_ELEFTCLASS], (Trace) match[POSITION_ERIGHTCLASS]);
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
    return ExchangeLocationOfElementsPostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3]);
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
    
    private final PParameter parameter_eLeftPackage = new PParameter("eLeftPackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eRightPackage = new PParameter("eRightPackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eLeftClass = new PParameter("eLeftClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eRightClass = new PParameter("eRightClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_eLeftPackage, parameter_eRightPackage, parameter_eLeftClass, parameter_eRightClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("eLeftPackage","eRightPackage","eLeftClass","eRightClass");
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
          PVariable var_eLeftPackage = body.getOrCreateVariableByName("eLeftPackage");
          PVariable var_eRightPackage = body.getOrCreateVariableByName("eRightPackage");
          PVariable var_eLeftClass = body.getOrCreateVariableByName("eLeftClass");
          PVariable var_eRightClass = body.getOrCreateVariableByName("eRightClass");
          PVariable var_eInitialLeftClass = body.getOrCreateVariableByName("eInitialLeftClass");
          PVariable var_eCurrentLeftClass = body.getOrCreateVariableByName("eCurrentLeftClass");
          PVariable var_eLeftClassName = body.getOrCreateVariableByName("eLeftClassName");
          PVariable var_eInitialRightClass = body.getOrCreateVariableByName("eInitialRightClass");
          PVariable var_eCurrentRightClass = body.getOrCreateVariableByName("eCurrentRightClass");
          PVariable var_eRightClassName = body.getOrCreateVariableByName("eRightClassName");
          PVariable var_eInitialLeftPackage = body.getOrCreateVariableByName("eInitialLeftPackage");
          PVariable var_eCurrentLeftPackage = body.getOrCreateVariableByName("eCurrentLeftPackage");
          PVariable var_eLeftPackageName = body.getOrCreateVariableByName("eLeftPackageName");
          PVariable var_eInitialRightPackage = body.getOrCreateVariableByName("eInitialRightPackage");
          PVariable var_eCurrentRightPackage = body.getOrCreateVariableByName("eCurrentRightPackage");
          PVariable var_eRightPackageName = body.getOrCreateVariableByName("eRightPackageName");
          PVariable var_eRootPackage = body.getOrCreateVariableByName("eRootPackage");
          PVariable var_eInitialRootPackage = body.getOrCreateVariableByName("eInitialRootPackage");
          PVariable var_eCurrentRootPackage = body.getOrCreateVariableByName("eCurrentRootPackage");
          PVariable var_eRootPackageName = body.getOrCreateVariableByName("eRootPackageName");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_eLeftPackage, parameter_eLeftPackage),
             new ExportedParameter(body, var_eRightPackage, parameter_eRightPackage),
             new ExportedParameter(body, var_eLeftClass, parameter_eLeftClass),
             new ExportedParameter(body, var_eRightClass, parameter_eRightClass)
          ));
          // 		Trace.initial(eLeftClass, eInitialLeftClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_eInitialLeftClass);
          // 	Trace.current(eLeftClass, eCurrentLeftClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftClass, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_eCurrentLeftClass);
          // 	EClass.name(eInitialLeftClass, eLeftClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialLeftClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialLeftClass, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_eLeftClassName);
          // 	EClass.name(eCurrentLeftClass, eLeftClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentLeftClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentLeftClass, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var_eLeftClassName);
          // 	eLeftClassName == "DomesticAnimal"
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "DomesticAnimal");
          new Equality(body, var_eLeftClassName, var__virtual_4_);
          // 		Trace.initial(eRightClass, eInitialRightClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightClass, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_5_, var_eInitialRightClass);
          // 	Trace.current(eRightClass, eCurrentRightClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightClass, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_6_, var_eCurrentRightClass);
          // 	EClass.name(eInitialRightClass, eRightClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRightClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRightClass, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_7_, var_eRightClassName);
          // 	EClass.name(eCurrentRightClass, eRightClassName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRightClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRightClass, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_8_, var_eRightClassName);
          // 	eRightClassName == "DomesticAnimalNew"
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "DomesticAnimalNew");
          new Equality(body, var_eRightClassName, var__virtual_9_);
          // 		Trace.initial(eLeftPackage, eInitialLeftPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftPackage, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_10_, var_eInitialLeftPackage);
          // 	Trace.current(eLeftPackage, eCurrentLeftPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eLeftPackage, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_11_, var_eCurrentLeftPackage);
          // 	EPackage.name(eInitialLeftPackage, eLeftPackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialLeftPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialLeftPackage, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_12_, var_eLeftPackageName);
          // 	EPackage.name(eCurrentLeftPackage, eLeftPackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentLeftPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentLeftPackage, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_13_, var_eLeftPackageName);
          // 	eLeftPackageName == "shop"
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new ConstantValue(body, var__virtual_14_, "shop");
          new Equality(body, var_eLeftPackageName, var__virtual_14_);
          // 	EPackage.eClassifiers(eInitialLeftPackage, eInitialLeftClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialLeftPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialLeftPackage, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_15_, var_eInitialLeftClass);
          // 	EPackage.eClassifiers(eCurrentLeftPackage, eCurrentRightClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentLeftPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentLeftPackage, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_16_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_16_, var_eCurrentRightClass);
          // 		Trace.initial(eRightPackage, eInitialRightPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightPackage, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_17_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_17_, var_eInitialRightPackage);
          // 	Trace.current(eRightPackage, eCurrentRightPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRightPackage, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_18_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_18_, var_eCurrentRightPackage);
          // 	EPackage.name(eInitialRightPackage, eRightPackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRightPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRightPackage, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_19_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_19_, var_eRightPackageName);
          // 	EPackage.name(eCurrentRightPackage, eRightPackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRightPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRightPackage, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_20_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_20_, var_eRightPackageName);
          // 	eRightPackageName == "core"
          PVariable var__virtual_21_ = body.getOrCreateVariableByName(".virtual{21}");
          new ConstantValue(body, var__virtual_21_, "core");
          new Equality(body, var_eRightPackageName, var__virtual_21_);
          // 	EPackage.eClassifiers(eInitialRightPackage, eInitialRightClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRightPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_22_ = body.getOrCreateVariableByName(".virtual{22}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRightPackage, var__virtual_22_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_22_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_22_, var_eInitialRightClass);
          // 	EPackage.eClassifiers(eCurrentRightPackage, eCurrentLeftClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRightPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRightPackage, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_23_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_23_, var_eCurrentLeftClass);
          // 		Trace.initial(eRootPackage, eInitialRootPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRootPackage, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_24_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_24_, var_eInitialRootPackage);
          // 	Trace.current(eRootPackage, eCurrentRootPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_25_ = body.getOrCreateVariableByName(".virtual{25}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eRootPackage, var__virtual_25_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_25_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_25_, var_eCurrentRootPackage);
          // 	EPackage.name(eInitialRootPackage, eRootPackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_26_ = body.getOrCreateVariableByName(".virtual{26}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRootPackage, var__virtual_26_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_26_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_26_, var_eRootPackageName);
          // 	EPackage.name(eCurrentRootPackage, eRootPackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_27_ = body.getOrCreateVariableByName(".virtual{27}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRootPackage, var__virtual_27_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_27_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_27_, var_eRootPackageName);
          // 	eRootPackageName == "de"
          PVariable var__virtual_28_ = body.getOrCreateVariableByName(".virtual{28}");
          new ConstantValue(body, var__virtual_28_, "de");
          new Equality(body, var_eRootPackageName, var__virtual_28_);
          // 	EPackage.eSubpackages(eInitialRootPackage, eInitialLeftPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_29_ = body.getOrCreateVariableByName(".virtual{29}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRootPackage, var__virtual_29_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eSubpackages")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_29_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new Equality(body, var__virtual_29_, var_eInitialLeftPackage);
          // 	EPackage.eSubpackages(eCurrentRootPackage, eCurrentLeftPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_30_ = body.getOrCreateVariableByName(".virtual{30}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRootPackage, var__virtual_30_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eSubpackages")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_30_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new Equality(body, var__virtual_30_, var_eCurrentLeftPackage);
          // 	EPackage.eSubpackages(eInitialRootPackage, eInitialRightPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_31_ = body.getOrCreateVariableByName(".virtual{31}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialRootPackage, var__virtual_31_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eSubpackages")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_31_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new Equality(body, var__virtual_31_, var_eInitialRightPackage);
          // 	EPackage.eSubpackages(eCurrentRootPackage, eCurrentRightPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRootPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_32_ = body.getOrCreateVariableByName(".virtual{32}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentRootPackage, var__virtual_32_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eSubpackages")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_32_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new Equality(body, var__virtual_32_, var_eCurrentRightPackage);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
