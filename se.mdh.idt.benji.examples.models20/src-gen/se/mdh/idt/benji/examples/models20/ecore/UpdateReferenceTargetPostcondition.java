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
 *         // Update Reference Target - Postcondition
 *         ////////////////////////////////////////////////////////////////////////////
 *         
 *         pattern UpdateReferenceTargetPostcondition(
 *         	ePackage: Trace, 
 *         	eReference: Trace, 
 *         	eReferenceOwner: Trace, 
 *         	eSourceReferenceType: Trace, 
 *         	eTargetReferenceType: Trace 
 *         ) {
 *         	
 *         	Trace.initial(eSourceReferenceType, eInitialSourceReferenceType);
 *         	Trace.current(eSourceReferenceType, eCurrentSourceReferenceType);
 *         	Class.name(eInitialSourceReferenceType, eSourceReferenceTypeName);
 *         	Class.name(eCurrentSourceReferenceType, eSourceReferenceTypeName);
 *         	eSourceReferenceTypeName == "Owner";
 *         	
 *         	Trace.initial(eTargetReferenceType, eInitialTargetReferenceType);
 *         	Trace.current(eTargetReferenceType, eCurrentTargetReferenceType);
 *         	Class.name(eInitialTargetReferenceType, eTargetReferenceTypeName);
 *         	Class.name(eCurrentTargetReferenceType, eTargetReferenceTypeName);
 *         	eTargetReferenceTypeName == "Person";
 *         	
 *         	Trace.initial(eReference, eInitialReference);
 *         	Trace.current(eReference, eCurrentReference);
 *         	Reference(eInitialReference);
 *         	Reference(eCurrentReference);
 *         	Reference.name(eInitialReference, eReferenceName);
 *         	Reference.name(eCurrentReference, eReferenceName);
 *         	eReferenceName == "owner";
 *         	Reference.type(eInitialReference, eInitialSourceReferenceType);
 *         	Reference.type(eCurrentReference, eCurrentTargetReferenceType);
 *         	
 *         	Trace.initial(eReferenceOwner, eInitialReferenceOwner);
 *         	Trace.current(eReferenceOwner, eCurrentReferenceOwner);
 *         	Class.name(eInitialReferenceOwner, eReferenceOwnerName);
 *         	Class.name(eCurrentReferenceOwner, eReferenceOwnerName);
 *         	eReferenceOwnerName == "DomesticAnimal";
 *         	Class.references(eInitialReferenceOwner, eInitialReference);
 *         	Class.references(eCurrentReferenceOwner, eCurrentReference);
 *         	
 *         	Trace.initial(ePackage, eInitialPackage);
 *         	Trace.current(ePackage, eCurrentPackage);
 *         	Package.name(eInitialPackage, ePackageName);
 *         	Package.name(eCurrentPackage, ePackageName);
 *         	ePackageName == "de";
 *         	Package.classes(eInitialPackage, eInitialSourceReferenceType);
 *         	Package.classes(eCurrentPackage, eCurrentSourceReferenceType);
 *         	Package.classes(eInitialPackage, eInitialTargetReferenceType);
 *         	Package.classes(eCurrentPackage, eCurrentTargetReferenceType);
 *         	Package.classes(eInitialPackage, eInitialReferenceOwner);
 *         	Package.classes(eCurrentPackage, eCurrentReferenceOwner);
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class UpdateReferenceTargetPostcondition extends BaseGeneratedEMFQuerySpecification<UpdateReferenceTargetPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPostcondition pattern,
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
    
    private Trace fEReference;
    
    private Trace fEReferenceOwner;
    
    private Trace fESourceReferenceType;
    
    private Trace fETargetReferenceType;
    
    private static List<String> parameterNames = makeImmutableList("ePackage", "eReference", "eReferenceOwner", "eSourceReferenceType", "eTargetReferenceType");
    
    private Match(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      this.fEPackage = pEPackage;
      this.fEReference = pEReference;
      this.fEReferenceOwner = pEReferenceOwner;
      this.fESourceReferenceType = pESourceReferenceType;
      this.fETargetReferenceType = pETargetReferenceType;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ePackage": return this.fEPackage;
          case "eReference": return this.fEReference;
          case "eReferenceOwner": return this.fEReferenceOwner;
          case "eSourceReferenceType": return this.fESourceReferenceType;
          case "eTargetReferenceType": return this.fETargetReferenceType;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEPackage;
          case 1: return this.fEReference;
          case 2: return this.fEReferenceOwner;
          case 3: return this.fESourceReferenceType;
          case 4: return this.fETargetReferenceType;
          default: return null;
      }
    }
    
    public Trace getEPackage() {
      return this.fEPackage;
    }
    
    public Trace getEReference() {
      return this.fEReference;
    }
    
    public Trace getEReferenceOwner() {
      return this.fEReferenceOwner;
    }
    
    public Trace getESourceReferenceType() {
      return this.fESourceReferenceType;
    }
    
    public Trace getETargetReferenceType() {
      return this.fETargetReferenceType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ePackage".equals(parameterName) ) {
          this.fEPackage = (Trace) newValue;
          return true;
      }
      if ("eReference".equals(parameterName) ) {
          this.fEReference = (Trace) newValue;
          return true;
      }
      if ("eReferenceOwner".equals(parameterName) ) {
          this.fEReferenceOwner = (Trace) newValue;
          return true;
      }
      if ("eSourceReferenceType".equals(parameterName) ) {
          this.fESourceReferenceType = (Trace) newValue;
          return true;
      }
      if ("eTargetReferenceType".equals(parameterName) ) {
          this.fETargetReferenceType = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setEPackage(final Trace pEPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEPackage = pEPackage;
    }
    
    public void setEReference(final Trace pEReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEReference = pEReference;
    }
    
    public void setEReferenceOwner(final Trace pEReferenceOwner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEReferenceOwner = pEReferenceOwner;
    }
    
    public void setESourceReferenceType(final Trace pESourceReferenceType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fESourceReferenceType = pESourceReferenceType;
    }
    
    public void setETargetReferenceType(final Trace pETargetReferenceType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fETargetReferenceType = pETargetReferenceType;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return UpdateReferenceTargetPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEPackage, fEReference, fEReferenceOwner, fESourceReferenceType, fETargetReferenceType};
    }
    
    @Override
    public UpdateReferenceTargetPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fEPackage, fEReference, fEReferenceOwner, fESourceReferenceType, fETargetReferenceType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ePackage\"=" + prettyPrintValue(fEPackage) + ", ");
      result.append("\"eReference\"=" + prettyPrintValue(fEReference) + ", ");
      result.append("\"eReferenceOwner\"=" + prettyPrintValue(fEReferenceOwner) + ", ");
      result.append("\"eSourceReferenceType\"=" + prettyPrintValue(fESourceReferenceType) + ", ");
      result.append("\"eTargetReferenceType\"=" + prettyPrintValue(fETargetReferenceType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEPackage, fEReference, fEReferenceOwner, fESourceReferenceType, fETargetReferenceType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof UpdateReferenceTargetPostcondition.Match)) {
          UpdateReferenceTargetPostcondition.Match other = (UpdateReferenceTargetPostcondition.Match) obj;
          return Objects.equals(fEPackage, other.fEPackage) && Objects.equals(fEReference, other.fEReference) && Objects.equals(fEReferenceOwner, other.fEReferenceOwner) && Objects.equals(fESourceReferenceType, other.fESourceReferenceType) && Objects.equals(fETargetReferenceType, other.fETargetReferenceType);
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
    public UpdateReferenceTargetPostcondition specification() {
      return UpdateReferenceTargetPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static UpdateReferenceTargetPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static UpdateReferenceTargetPostcondition.Match newMutableMatch(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return new Mutable(pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static UpdateReferenceTargetPostcondition.Match newMatch(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return new Immutable(pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType);
    }
    
    private static final class Mutable extends UpdateReferenceTargetPostcondition.Match {
      Mutable(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
        super(pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends UpdateReferenceTargetPostcondition.Match {
      Immutable(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
        super(pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPostcondition pattern,
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
   * // Update Reference Target - Postcondition
   * ////////////////////////////////////////////////////////////////////////////
   * 
   * pattern UpdateReferenceTargetPostcondition(
   * 	ePackage: Trace, 
   * 	eReference: Trace, 
   * 	eReferenceOwner: Trace, 
   * 	eSourceReferenceType: Trace, 
   * 	eTargetReferenceType: Trace 
   * ) {
   * 	
   * 	Trace.initial(eSourceReferenceType, eInitialSourceReferenceType);
   * 	Trace.current(eSourceReferenceType, eCurrentSourceReferenceType);
   * 	Class.name(eInitialSourceReferenceType, eSourceReferenceTypeName);
   * 	Class.name(eCurrentSourceReferenceType, eSourceReferenceTypeName);
   * 	eSourceReferenceTypeName == "Owner";
   * 	
   * 	Trace.initial(eTargetReferenceType, eInitialTargetReferenceType);
   * 	Trace.current(eTargetReferenceType, eCurrentTargetReferenceType);
   * 	Class.name(eInitialTargetReferenceType, eTargetReferenceTypeName);
   * 	Class.name(eCurrentTargetReferenceType, eTargetReferenceTypeName);
   * 	eTargetReferenceTypeName == "Person";
   * 	
   * 	Trace.initial(eReference, eInitialReference);
   * 	Trace.current(eReference, eCurrentReference);
   * 	Reference(eInitialReference);
   * 	Reference(eCurrentReference);
   * 	Reference.name(eInitialReference, eReferenceName);
   * 	Reference.name(eCurrentReference, eReferenceName);
   * 	eReferenceName == "owner";
   * 	Reference.type(eInitialReference, eInitialSourceReferenceType);
   * 	Reference.type(eCurrentReference, eCurrentTargetReferenceType);
   * 	
   * 	Trace.initial(eReferenceOwner, eInitialReferenceOwner);
   * 	Trace.current(eReferenceOwner, eCurrentReferenceOwner);
   * 	Class.name(eInitialReferenceOwner, eReferenceOwnerName);
   * 	Class.name(eCurrentReferenceOwner, eReferenceOwnerName);
   * 	eReferenceOwnerName == "DomesticAnimal";
   * 	Class.references(eInitialReferenceOwner, eInitialReference);
   * 	Class.references(eCurrentReferenceOwner, eCurrentReference);
   * 	
   * 	Trace.initial(ePackage, eInitialPackage);
   * 	Trace.current(ePackage, eCurrentPackage);
   * 	Package.name(eInitialPackage, ePackageName);
   * 	Package.name(eCurrentPackage, ePackageName);
   * 	ePackageName == "de";
   * 	Package.classes(eInitialPackage, eInitialSourceReferenceType);
   * 	Package.classes(eCurrentPackage, eCurrentSourceReferenceType);
   * 	Package.classes(eInitialPackage, eInitialTargetReferenceType);
   * 	Package.classes(eCurrentPackage, eCurrentTargetReferenceType);
   * 	Package.classes(eInitialPackage, eInitialReferenceOwner);
   * 	Package.classes(eCurrentPackage, eCurrentReferenceOwner);
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see UpdateReferenceTargetPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<UpdateReferenceTargetPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static UpdateReferenceTargetPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static UpdateReferenceTargetPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EPACKAGE = 0;
    
    private static final int POSITION_EREFERENCE = 1;
    
    private static final int POSITION_EREFERENCEOWNER = 2;
    
    private static final int POSITION_ESOURCEREFERENCETYPE = 3;
    
    private static final int POSITION_ETARGETREFERENCETYPE = 4;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(UpdateReferenceTargetPostcondition.Matcher.class);
    
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
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<UpdateReferenceTargetPostcondition.Match> getAllMatches(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllMatches(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<UpdateReferenceTargetPostcondition.Match> streamAllMatches(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllMatches(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<UpdateReferenceTargetPostcondition.Match> getOneArbitraryMatch(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawGetOneArbitraryMatch(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawHasMatch(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawCountMatches(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType, final Consumer<? super UpdateReferenceTargetPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEPackage the fixed value of pattern parameter ePackage, or null if not bound.
     * @param pEReference the fixed value of pattern parameter eReference, or null if not bound.
     * @param pEReferenceOwner the fixed value of pattern parameter eReferenceOwner, or null if not bound.
     * @param pESourceReferenceType the fixed value of pattern parameter eSourceReferenceType, or null if not bound.
     * @param pETargetReferenceType the fixed value of pattern parameter eTargetReferenceType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public UpdateReferenceTargetPostcondition.Match newMatch(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return UpdateReferenceTargetPostcondition.Match.newMatch(pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType);
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
    public Stream<Trace> streamAllValuesOfePackage(final UpdateReferenceTargetPostcondition.Match partialMatch) {
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
    public Stream<Trace> streamAllValuesOfePackage(final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfePackage(new Object[]{null, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfePackage(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfePackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ePackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfePackage(final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfePackage(new Object[]{null, pEReference, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeReference(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EREFERENCE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeReference() {
      return rawStreamAllValuesOfeReference(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeReference() {
      return rawStreamAllValuesOfeReference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReference.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeReference(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeReference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReference.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeReference(final Trace pEPackage, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfeReference(new Object[]{pEPackage, null, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeReference(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeReference(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeReference(final Trace pEPackage, final Trace pEReferenceOwner, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfeReference(new Object[]{pEPackage, null, pEReferenceOwner, pESourceReferenceType, pETargetReferenceType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReferenceOwner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeReferenceOwner(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EREFERENCEOWNER, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReferenceOwner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeReferenceOwner() {
      return rawStreamAllValuesOfeReferenceOwner(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReferenceOwner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeReferenceOwner() {
      return rawStreamAllValuesOfeReferenceOwner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReferenceOwner.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeReferenceOwner(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeReferenceOwner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReferenceOwner.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeReferenceOwner(final Trace pEPackage, final Trace pEReference, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfeReferenceOwner(new Object[]{pEPackage, pEReference, null, pESourceReferenceType, pETargetReferenceType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReferenceOwner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeReferenceOwner(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeReferenceOwner(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eReferenceOwner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeReferenceOwner(final Trace pEPackage, final Trace pEReference, final Trace pESourceReferenceType, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfeReferenceOwner(new Object[]{pEPackage, pEReference, null, pESourceReferenceType, pETargetReferenceType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSourceReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeSourceReferenceType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ESOURCEREFERENCETYPE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSourceReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSourceReferenceType() {
      return rawStreamAllValuesOfeSourceReferenceType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSourceReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeSourceReferenceType() {
      return rawStreamAllValuesOfeSourceReferenceType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSourceReferenceType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeSourceReferenceType(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeSourceReferenceType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSourceReferenceType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeSourceReferenceType(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfeSourceReferenceType(new Object[]{pEPackage, pEReference, pEReferenceOwner, null, pETargetReferenceType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSourceReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSourceReferenceType(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeSourceReferenceType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eSourceReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeSourceReferenceType(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pETargetReferenceType) {
      return rawStreamAllValuesOfeSourceReferenceType(new Object[]{pEPackage, pEReference, pEReferenceOwner, null, pETargetReferenceType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eTargetReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfeTargetReferenceType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ETARGETREFERENCETYPE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eTargetReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeTargetReferenceType() {
      return rawStreamAllValuesOfeTargetReferenceType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eTargetReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeTargetReferenceType() {
      return rawStreamAllValuesOfeTargetReferenceType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eTargetReferenceType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeTargetReferenceType(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeTargetReferenceType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eTargetReferenceType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfeTargetReferenceType(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType) {
      return rawStreamAllValuesOfeTargetReferenceType(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eTargetReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeTargetReferenceType(final UpdateReferenceTargetPostcondition.Match partialMatch) {
      return rawStreamAllValuesOfeTargetReferenceType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eTargetReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfeTargetReferenceType(final Trace pEPackage, final Trace pEReference, final Trace pEReferenceOwner, final Trace pESourceReferenceType) {
      return rawStreamAllValuesOfeTargetReferenceType(new Object[]{pEPackage, pEReference, pEReferenceOwner, pESourceReferenceType, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected UpdateReferenceTargetPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return UpdateReferenceTargetPostcondition.Match.newMatch((Trace) t.get(POSITION_EPACKAGE), (Trace) t.get(POSITION_EREFERENCE), (Trace) t.get(POSITION_EREFERENCEOWNER), (Trace) t.get(POSITION_ESOURCEREFERENCETYPE), (Trace) t.get(POSITION_ETARGETREFERENCETYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UpdateReferenceTargetPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return UpdateReferenceTargetPostcondition.Match.newMatch((Trace) match[POSITION_EPACKAGE], (Trace) match[POSITION_EREFERENCE], (Trace) match[POSITION_EREFERENCEOWNER], (Trace) match[POSITION_ESOURCEREFERENCETYPE], (Trace) match[POSITION_ETARGETREFERENCETYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UpdateReferenceTargetPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return UpdateReferenceTargetPostcondition.Match.newMutableMatch((Trace) match[POSITION_EPACKAGE], (Trace) match[POSITION_EREFERENCE], (Trace) match[POSITION_EREFERENCEOWNER], (Trace) match[POSITION_ESOURCEREFERENCETYPE], (Trace) match[POSITION_ETARGETREFERENCETYPE]);
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
    public static IQuerySpecification<UpdateReferenceTargetPostcondition.Matcher> querySpecification() {
      return UpdateReferenceTargetPostcondition.instance();
    }
  }
  
  private UpdateReferenceTargetPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static UpdateReferenceTargetPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected UpdateReferenceTargetPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return UpdateReferenceTargetPostcondition.Matcher.on(engine);
  }
  
  @Override
  public UpdateReferenceTargetPostcondition.Matcher instantiate() {
    return UpdateReferenceTargetPostcondition.Matcher.create();
  }
  
  @Override
  public UpdateReferenceTargetPostcondition.Match newEmptyMatch() {
    return UpdateReferenceTargetPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public UpdateReferenceTargetPostcondition.Match newMatch(final Object... parameters) {
    return UpdateReferenceTargetPostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3], (se.mdh.idt.benji.trace.Trace) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link UpdateReferenceTargetPostcondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link UpdateReferenceTargetPostcondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final UpdateReferenceTargetPostcondition INSTANCE = new UpdateReferenceTargetPostcondition();
    
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
    private static final UpdateReferenceTargetPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ePackage = new PParameter("ePackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eReference = new PParameter("eReference", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eReferenceOwner = new PParameter("eReferenceOwner", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eSourceReferenceType = new PParameter("eSourceReferenceType", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eTargetReferenceType = new PParameter("eTargetReferenceType", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ePackage, parameter_eReference, parameter_eReferenceOwner, parameter_eSourceReferenceType, parameter_eTargetReferenceType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ePackage","eReference","eReferenceOwner","eSourceReferenceType","eTargetReferenceType");
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
          PVariable var_eReference = body.getOrCreateVariableByName("eReference");
          PVariable var_eReferenceOwner = body.getOrCreateVariableByName("eReferenceOwner");
          PVariable var_eSourceReferenceType = body.getOrCreateVariableByName("eSourceReferenceType");
          PVariable var_eTargetReferenceType = body.getOrCreateVariableByName("eTargetReferenceType");
          PVariable var_eInitialSourceReferenceType = body.getOrCreateVariableByName("eInitialSourceReferenceType");
          PVariable var_eCurrentSourceReferenceType = body.getOrCreateVariableByName("eCurrentSourceReferenceType");
          PVariable var_eSourceReferenceTypeName = body.getOrCreateVariableByName("eSourceReferenceTypeName");
          PVariable var_eInitialTargetReferenceType = body.getOrCreateVariableByName("eInitialTargetReferenceType");
          PVariable var_eCurrentTargetReferenceType = body.getOrCreateVariableByName("eCurrentTargetReferenceType");
          PVariable var_eTargetReferenceTypeName = body.getOrCreateVariableByName("eTargetReferenceTypeName");
          PVariable var_eInitialReference = body.getOrCreateVariableByName("eInitialReference");
          PVariable var_eCurrentReference = body.getOrCreateVariableByName("eCurrentReference");
          PVariable var_eReferenceName = body.getOrCreateVariableByName("eReferenceName");
          PVariable var_eInitialReferenceOwner = body.getOrCreateVariableByName("eInitialReferenceOwner");
          PVariable var_eCurrentReferenceOwner = body.getOrCreateVariableByName("eCurrentReferenceOwner");
          PVariable var_eReferenceOwnerName = body.getOrCreateVariableByName("eReferenceOwnerName");
          PVariable var_eInitialPackage = body.getOrCreateVariableByName("eInitialPackage");
          PVariable var_eCurrentPackage = body.getOrCreateVariableByName("eCurrentPackage");
          PVariable var_ePackageName = body.getOrCreateVariableByName("ePackageName");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReferenceOwner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSourceReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_eTargetReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ePackage, parameter_ePackage),
             new ExportedParameter(body, var_eReference, parameter_eReference),
             new ExportedParameter(body, var_eReferenceOwner, parameter_eReferenceOwner),
             new ExportedParameter(body, var_eSourceReferenceType, parameter_eSourceReferenceType),
             new ExportedParameter(body, var_eTargetReferenceType, parameter_eTargetReferenceType)
          ));
          // 		Trace.initial(eSourceReferenceType, eInitialSourceReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSourceReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSourceReferenceType, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_eInitialSourceReferenceType);
          // 	Trace.current(eSourceReferenceType, eCurrentSourceReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSourceReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eSourceReferenceType, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_1_, var_eCurrentSourceReferenceType);
          // 	Class.name(eInitialSourceReferenceType, eSourceReferenceTypeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialSourceReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialSourceReferenceType, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_eSourceReferenceTypeName);
          // 	Class.name(eCurrentSourceReferenceType, eSourceReferenceTypeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSourceReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentSourceReferenceType, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_3_, var_eSourceReferenceTypeName);
          // 	eSourceReferenceTypeName == "Owner"
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, "Owner");
          new Equality(body, var_eSourceReferenceTypeName, var__virtual_4_);
          // 		Trace.initial(eTargetReferenceType, eInitialTargetReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eTargetReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eTargetReferenceType, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_5_, var_eInitialTargetReferenceType);
          // 	Trace.current(eTargetReferenceType, eCurrentTargetReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eTargetReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eTargetReferenceType, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_6_, var_eCurrentTargetReferenceType);
          // 	Class.name(eInitialTargetReferenceType, eTargetReferenceTypeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialTargetReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialTargetReferenceType, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_7_, var_eTargetReferenceTypeName);
          // 	Class.name(eCurrentTargetReferenceType, eTargetReferenceTypeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentTargetReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentTargetReferenceType, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_8_, var_eTargetReferenceTypeName);
          // 	eTargetReferenceTypeName == "Person"
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new ConstantValue(body, var__virtual_9_, "Person");
          new Equality(body, var_eTargetReferenceTypeName, var__virtual_9_);
          // 		Trace.initial(eReference, eInitialReference)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReference, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_10_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_10_, var_eInitialReference);
          // 	Trace.current(eReference, eCurrentReference)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReference, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_11_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_11_, var_eCurrentReference);
          // 	Reference(eInitialReference)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          // 	Reference(eCurrentReference)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          // 	Reference.name(eInitialReference, eReferenceName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReference, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_12_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_12_, var_eReferenceName);
          // 	Reference.name(eCurrentReference, eReferenceName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReference, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_13_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_13_, var_eReferenceName);
          // 	eReferenceName == "owner"
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new ConstantValue(body, var__virtual_14_, "owner");
          new Equality(body, var_eReferenceName, var__virtual_14_);
          // 	Reference.type(eInitialReference, eInitialSourceReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReference, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_15_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_15_, var_eInitialSourceReferenceType);
          // 	Reference.type(eCurrentReference, eCurrentTargetReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReference, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_16_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_16_, var_eCurrentTargetReferenceType);
          // 		Trace.initial(eReferenceOwner, eInitialReferenceOwner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReferenceOwner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReferenceOwner, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_17_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_17_, var_eInitialReferenceOwner);
          // 	Trace.current(eReferenceOwner, eCurrentReferenceOwner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReferenceOwner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eReferenceOwner, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_18_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_18_, var_eCurrentReferenceOwner);
          // 	Class.name(eInitialReferenceOwner, eReferenceOwnerName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReferenceOwner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReferenceOwner, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_19_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_19_, var_eReferenceOwnerName);
          // 	Class.name(eCurrentReferenceOwner, eReferenceOwnerName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReferenceOwner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReferenceOwner, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_20_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_20_, var_eReferenceOwnerName);
          // 	eReferenceOwnerName == "DomesticAnimal"
          PVariable var__virtual_21_ = body.getOrCreateVariableByName(".virtual{21}");
          new ConstantValue(body, var__virtual_21_, "DomesticAnimal");
          new Equality(body, var_eReferenceOwnerName, var__virtual_21_);
          // 	Class.references(eInitialReferenceOwner, eInitialReference)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReferenceOwner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_22_ = body.getOrCreateVariableByName(".virtual{22}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialReferenceOwner, var__virtual_22_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class", "references")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_22_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          new Equality(body, var__virtual_22_, var_eInitialReference);
          // 	Class.references(eCurrentReferenceOwner, eCurrentReference)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReferenceOwner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentReferenceOwner, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class", "references")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_23_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Reference")));
          new Equality(body, var__virtual_23_, var_eCurrentReference);
          // 		Trace.initial(ePackage, eInitialPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "initial")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_24_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_24_, var_eInitialPackage);
          // 	Trace.current(ePackage, eCurrentPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_25_ = body.getOrCreateVariableByName(".virtual{25}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ePackage, var__virtual_25_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_25_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_25_, var_eCurrentPackage);
          // 	Package.name(eInitialPackage, ePackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_26_ = body.getOrCreateVariableByName(".virtual{26}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_26_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_26_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_26_, var_ePackageName);
          // 	Package.name(eCurrentPackage, ePackageName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_27_ = body.getOrCreateVariableByName(".virtual{27}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage, var__virtual_27_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_27_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_27_, var_ePackageName);
          // 	ePackageName == "de"
          PVariable var__virtual_28_ = body.getOrCreateVariableByName(".virtual{28}");
          new ConstantValue(body, var__virtual_28_, "de");
          new Equality(body, var_ePackageName, var__virtual_28_);
          // 	Package.classes(eInitialPackage, eInitialSourceReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_29_ = body.getOrCreateVariableByName(".virtual{29}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_29_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package", "classes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_29_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_29_, var_eInitialSourceReferenceType);
          // 	Package.classes(eCurrentPackage, eCurrentSourceReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_30_ = body.getOrCreateVariableByName(".virtual{30}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage, var__virtual_30_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package", "classes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_30_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_30_, var_eCurrentSourceReferenceType);
          // 	Package.classes(eInitialPackage, eInitialTargetReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_31_ = body.getOrCreateVariableByName(".virtual{31}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_31_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package", "classes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_31_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_31_, var_eInitialTargetReferenceType);
          // 	Package.classes(eCurrentPackage, eCurrentTargetReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_32_ = body.getOrCreateVariableByName(".virtual{32}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage, var__virtual_32_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package", "classes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_32_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_32_, var_eCurrentTargetReferenceType);
          // 	Package.classes(eInitialPackage, eInitialReferenceOwner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_33_ = body.getOrCreateVariableByName(".virtual{33}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eInitialPackage, var__virtual_33_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package", "classes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_33_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_33_, var_eInitialReferenceOwner);
          // 	Package.classes(eCurrentPackage, eCurrentReferenceOwner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package")));
          PVariable var__virtual_34_ = body.getOrCreateVariableByName(".virtual{34}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_eCurrentPackage, var__virtual_34_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Package", "classes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_34_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/metamodels/ecore", "Class")));
          new Equality(body, var__virtual_34_, var_eCurrentReferenceOwner);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
