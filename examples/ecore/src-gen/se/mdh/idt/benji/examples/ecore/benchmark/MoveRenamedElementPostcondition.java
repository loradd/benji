/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.ecore/src/se/mdh/idt/benji/examples/ecore/benchmark/Queries.vql
 */
package se.mdh.idt.benji.examples.ecore.benchmark;

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
 *         // Move Renamed Element - Postcondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern MoveRenamedElementPostcondition(
 *         	ePackage: Trace, eSubPackage: Trace, eClass: Trace, eAttribute: Trace
 *         ) {
 *         	
 *         	Trace.initial(eAttribute, eInitialAttribute);
 *         	Trace.current(eAttribute, eCurrentAttribute);
 *         	EAttribute.name(eInitialAttribute, "nickname");
 *         	EAttribute.name(eCurrentAttribute, "moniker");
 *         	
 *         	Trace.initial(eClass, eInitialClass);
 *         	Trace.current(eClass, eCurrentClass);
 *         	EClass.name(eInitialClass, "DomesticAnimal");
 *         	EClass.name(eCurrentClass, "Pet");
 *         	EClass.eStructuralFeatures(eInitialClass, eInitialAttribute);
 *         	EClass.eStructuralFeatures(eCurrentClass, eCurrentAttribute);
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
public final class MoveRenamedElementPostcondition extends BaseGeneratedEMFQuerySpecification<MoveRenamedElementPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.ecore.benchmark.MoveRenamedElementPostcondition pattern,
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
    
    private Trace fEAttribute;
    
    private static List<String> parameterNames = makeImmutableList("ePackage", "eSubPackage", "eClass", "eAttribute");
    
    private Match(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      this.fEPackage = pEPackage;
      this.fESubPackage = pESubPackage;
      this.fEClass = pEClass;
      this.fEAttribute = pEAttribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ePackage": return this.fEPackage;
          case "eSubPackage": return this.fESubPackage;
          case "eClass": return this.fEClass;
          case "eAttribute": return this.fEAttribute;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEPackage;
          case 1: return this.fESubPackage;
          case 2: return this.fEClass;
          case 3: return this.fEAttribute;
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
    
    public Trace getEAttribute() {
      return this.fEAttribute;
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
      if ("eAttribute".equals(parameterName) ) {
          this.fEAttribute = (Trace) newValue;
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
    
    public void setEAttribute(final Trace pEAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEAttribute = pEAttribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.ecore.benchmark.MoveRenamedElementPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MoveRenamedElementPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEPackage, fESubPackage, fEClass, fEAttribute};
    }
    
    @Override
    public MoveRenamedElementPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fEPackage, fESubPackage, fEClass, fEAttribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ePackage\"=" + prettyPrintValue(fEPackage) + ", ");
      result.append("\"eSubPackage\"=" + prettyPrintValue(fESubPackage) + ", ");
      result.append("\"eClass\"=" + prettyPrintValue(fEClass) + ", ");
      result.append("\"eAttribute\"=" + prettyPrintValue(fEAttribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEPackage, fESubPackage, fEClass, fEAttribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MoveRenamedElementPostcondition.Match)) {
          MoveRenamedElementPostcondition.Match other = (MoveRenamedElementPostcondition.Match) obj;
          return Objects.equals(fEPackage, other.fEPackage) && Objects.equals(fESubPackage, other.fESubPackage) && Objects.equals(fEClass, other.fEClass) && Objects.equals(fEAttribute, other.fEAttribute);
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
    public MoveRenamedElementPostcondition specification() {
      return MoveRenamedElementPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MoveRenamedElementPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MoveRenamedElementPostcondition.Match newMutableMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return new Mutable(pEPackage, pESubPackage, pEClass, pEAttribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MoveRenamedElementPostcondition.Match newMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return new Immutable(pEPackage, pESubPackage, pEClass, pEAttribute);
    }
    
    private static final class Mutable extends MoveRenamedElementPostcondition.Match {
      Mutable(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
        super(pEPackage, pESubPackage, pEClass, pEAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MoveRenamedElementPostcondition.Match {
      Immutable(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
        super(pEPackage, pESubPackage, pEClass, pEAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.ecore.benchmark.MoveRenamedElementPostcondition pattern,
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
   * // Move Renamed Element - Postcondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern MoveRenamedElementPostcondition(
   * 	ePackage: Trace, eSubPackage: Trace, eClass: Trace, eAttribute: Trace
   * ) {
   * 	
   * 	Trace.initial(eAttribute, eInitialAttribute);
   * 	Trace.current(eAttribute, eCurrentAttribute);
   * 	EAttribute.name(eInitialAttribute, "nickname");
   * 	EAttribute.name(eCurrentAttribute, "moniker");
   * 	
   * 	Trace.initial(eClass, eInitialClass);
   * 	Trace.current(eClass, eCurrentClass);
   * 	EClass.name(eInitialClass, "DomesticAnimal");
   * 	EClass.name(eCurrentClass, "Pet");
   * 	EClass.eStructuralFeatures(eInitialClass, eInitialAttribute);
   * 	EClass.eStructuralFeatures(eCurrentClass, eCurrentAttribute);
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
   * @see MoveRenamedElementPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<MoveRenamedElementPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MoveRenamedElementPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MoveRenamedElementPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EPACKAGE = 0;
    
    private static final int POSITION_ESUBPACKAGE = 1;
    
    private static final int POSITION_ECLASS = 2;
    
    private static final int POSITION_EATTRIBUTE = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MoveRenamedElementPostcondition.Matcher.class);
    
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
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MoveRenamedElementPostcondition.Match> getAllMatches(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllMatches(new Object[]{pEPackage, pESubPackage, pEClass, pEAttribute}).collect(Collectors.toSet());
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
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MoveRenamedElementPostcondition.Match> streamAllMatches(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllMatches(new Object[]{pEPackage, pESubPackage, pEClass, pEAttribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MoveRenamedElementPostcondition.Match> getOneArbitraryMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawGetOneArbitraryMatch(new Object[]{pEPackage, pESubPackage, pEClass, pEAttribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawHasMatch(new Object[]{pEPackage, pESubPackage, pEClass, pEAttribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawCountMatches(new Object[]{pEPackage, pESubPackage, pEClass, pEAttribute});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute, final Consumer<? super MoveRenamedElementPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEPackage, pESubPackage, pEClass, pEAttribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pESubPackage the fixed value of pattern parameter eSubPackage, or null if not bound.
     * @param pEClass the fixed value of pattern parameter eClass, or null if not bound.
     * @param pEAttribute the fixed value of pattern parameter eAttribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MoveRenamedElementPostcondition.Match newMatch(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return MoveRenamedElementPostcondition.Match.newMatch(pEPackage, pESubPackage, pEClass, pEAttribute);
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
    public Stream<Trace> streamAllValuesOfePackage(final MoveRenamedElementPostcondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfePackage(final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllValuesOfePackage(new Object[]{null, pESubPackage, pEClass, pEAttribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfePackage(final MoveRenamedElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfePackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfePackage(final Trace pESubPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllValuesOfePackage(new Object[]{null, pESubPackage, pEClass, pEAttribute}).collect(Collectors.toSet());
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
    public Stream<Trace> streamAllValuesOfeSubPackage(final MoveRenamedElementPostcondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfeSubPackage(final Trace pEPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllValuesOfeSubPackage(new Object[]{pEPackage, null, pEClass, pEAttribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSubPackage(final MoveRenamedElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeSubPackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSubPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSubPackage(final Trace pEPackage, final Trace pEClass, final Trace pEAttribute) {
      return rawStreamAllValuesOfeSubPackage(new Object[]{pEPackage, null, pEClass, pEAttribute}).collect(Collectors.toSet());
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
    public Stream<Trace> streamAllValuesOfeClass(final MoveRenamedElementPostcondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfeClass(final Trace pEPackage, final Trace pESubPackage, final Trace pEAttribute) {
      return rawStreamAllValuesOfeClass(new Object[]{pEPackage, pESubPackage, null, pEAttribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeClass(final MoveRenamedElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeClass(final Trace pEPackage, final Trace pESubPackage, final Trace pEAttribute) {
      return rawStreamAllValuesOfeClass(new Object[]{pEPackage, pESubPackage, null, pEAttribute}).collect(Collectors.toSet());
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
    public Stream<Trace> streamAllValuesOfeAttribute(final MoveRenamedElementPostcondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfeAttribute(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return rawStreamAllValuesOfeAttribute(new Object[]{pEPackage, pESubPackage, pEClass, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeAttribute(final MoveRenamedElementPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeAttribute(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eAttribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeAttribute(final Trace pEPackage, final Trace pESubPackage, final Trace pEClass) {
      return rawStreamAllValuesOfeAttribute(new Object[]{pEPackage, pESubPackage, pEClass, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected MoveRenamedElementPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return MoveRenamedElementPostcondition.Match.newMatch((Trace) t.get(POSITION_EPACKAGE), (Trace) t.get(POSITION_ESUBPACKAGE), (Trace) t.get(POSITION_ECLASS), (Trace) t.get(POSITION_EATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoveRenamedElementPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return MoveRenamedElementPostcondition.Match.newMatch((Trace) match[POSITION_EPACKAGE], (Trace) match[POSITION_ESUBPACKAGE], (Trace) match[POSITION_ECLASS], (Trace) match[POSITION_EATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoveRenamedElementPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MoveRenamedElementPostcondition.Match.newMutableMatch((Trace) match[POSITION_EPACKAGE], (Trace) match[POSITION_ESUBPACKAGE], (Trace) match[POSITION_ECLASS], (Trace) match[POSITION_EATTRIBUTE]);
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
    public static IQuerySpecification<MoveRenamedElementPostcondition.Matcher> querySpecification() {
      return MoveRenamedElementPostcondition.instance();
    }
  }
  
  private MoveRenamedElementPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MoveRenamedElementPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoveRenamedElementPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MoveRenamedElementPostcondition.Matcher.on(engine);
  }
  
  @Override
  public MoveRenamedElementPostcondition.Matcher instantiate() {
    return MoveRenamedElementPostcondition.Matcher.create();
  }
  
  @Override
  public MoveRenamedElementPostcondition.Match newEmptyMatch() {
    return MoveRenamedElementPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public MoveRenamedElementPostcondition.Match newMatch(final Object... parameters) {
    return MoveRenamedElementPostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MoveRenamedElementPostcondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link MoveRenamedElementPostcondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MoveRenamedElementPostcondition INSTANCE = new MoveRenamedElementPostcondition();
    
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
    private static final MoveRenamedElementPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ePackage = new PParameter("ePackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eSubPackage = new PParameter("eSubPackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eClass = new PParameter("eClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eAttribute = new PParameter("eAttribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ePackage, parameter_eSubPackage, parameter_eClass, parameter_eAttribute);
    
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
      return "se.mdh.idt.benji.examples.ecore.benchmark.MoveRenamedElementPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ePackage","eSubPackage","eClass","eAttribute");
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
          PVariable var_eAttribute = body.getOrCreateVariableByName("eAttribute");
          PVariable var_eInitialAttribute = body.getOrCreateVariableByName("eInitialAttribute");
          PVariable var_eCurrentAttribute = body.getOrCreateVariableByName("eCurrentAttribute");
          PVariable var_eInitialClass = body.getOrCreateVariableByName("eInitialClass");
          PVariable var_eCurrentClass = body.getOrCreateVariableByName("eCurrentClass");
          PVariable var_eInitialPackage = body.getOrCreateVariableByName("eInitialPackage");
          PVariable var_eCurrentPackage = body.getOrCreateVariableByName("eCurrentPackage");
          PVariable var_ePackageName = body.getOrCreateVariableByName("ePackageName");
          PVariable var__eInitialSubPackage = body.getOrCreateVariableByName("_eInitialSubPackage");
          PVariable var_eCurrentSubPackage = body.getOrCreateVariableByName("eCurrentSubPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ePackage, parameter_ePackage),
             new ExportedParameter(body, var_eSubPackage, parameter_eSubPackage),
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
          // 	EAttribute.name(eInitialAttribute, "nickname")
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, "nickname");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialAttribute, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var__virtual_2_);
          // 	EAttribute.name(eCurrentAttribute, "moniker")
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "moniker");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentAttribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentAttribute, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_5_, var__virtual_4_);
          // 		Trace.initial(eClass, eInitialClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_6_, var_eInitialClass);
          // 	Trace.current(eClass, eCurrentClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eClass, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_7_, var_eCurrentClass);
          // 	EClass.name(eInitialClass, "DomesticAnimal")
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new ConstantValue(body, var__virtual_8_, "DomesticAnimal");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_9_, var__virtual_8_);
          // 	EClass.name(eCurrentClass, "Pet")
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new ConstantValue(body, var__virtual_10_, "Pet");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_11_, var__virtual_10_);
          // 	EClass.eStructuralFeatures(eInitialClass, eInitialAttribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialClass, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EStructuralFeature")));
          new Equality(body, var__virtual_12_, var_eInitialAttribute);
          // 	EClass.eStructuralFeatures(eCurrentClass, eCurrentAttribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentClass, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EStructuralFeature")));
          new Equality(body, var__virtual_13_, var_eCurrentAttribute);
          // 		Trace.initial(ePackage, eInitialPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_14_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_14_, var_eInitialPackage);
          // 	Trace.current(ePackage, eCurrentPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_15_, var_eCurrentPackage);
          // 	EPackage.name(eInitialPackage, ePackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_16_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_16_, var_ePackageName);
          // 	EPackage.name(eCurrentPackage, ePackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_17_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_17_, var_ePackageName);
          // 	ePackageName == "de"
          PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
          new ConstantValue(body, var__virtual_18_, "de");
          new Equality(body, var_ePackageName, var__virtual_18_);
          // 	EPackage.eClassifiers(eInitialPackage, eInitialClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_19_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_19_, var_eInitialClass);
          // 	neg EPackage.eClassifiers(eCurrentPackage, eCurrentClass)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_eCurrentPackage, var_eCurrentClass), new MoveRenamedElementPostcondition.GeneratedPQuery.Embedded_1_EPackage_eClassifiers());
          // 		neg Trace.initial(eSubPackage, _eInitialSubPackage)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_eSubPackage, var__eInitialSubPackage), new MoveRenamedElementPostcondition.GeneratedPQuery.Embedded_2_Trace_initial());
          // 	Trace.current(eSubPackage, eCurrentSubPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSubPackage, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_20_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_20_, var_eCurrentSubPackage);
          // 	EPackage.name(eCurrentSubPackage, "shop")
          PVariable var__virtual_21_ = body.getOrCreateVariableByName(".virtual{21}");
          new ConstantValue(body, var__virtual_21_, "shop");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_22_ = body.getOrCreateVariableByName(".virtual{22}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage, var__virtual_22_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_22_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_22_, var__virtual_21_);
          // 	EPackage.eClassifiers(eCurrentSubPackage, eCurrentClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eClassifiers")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_23_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClassifier")));
          new Equality(body, var__virtual_23_, var_eCurrentClass);
          // 	EPackage.eSuperPackage(eCurrentSubPackage, eCurrentPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSubPackage, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eSuperPackage")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_24_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new Equality(body, var__virtual_24_, var_eCurrentPackage);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
