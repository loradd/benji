/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.models20/src/se/mdh/idt/benji/examples/models20/ecore/Queries.vql
 */
package se.mdh.idt.benji.examples.models20.ecore;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveElementPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveElementPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveRenamedElementPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveRenamedElementPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.RenameElementPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.RenameElementPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPrecondition;

/**
 * A pattern group formed of all public patterns defined in Queries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.models20.ecore, the group contains the definition of the following patterns: <ul>
 * <li>MoveElementPrecondition</li>
 * <li>MoveElementPostcondition</li>
 * <li>RenameElementPrecondition</li>
 * <li>RenameElementPostcondition</li>
 * <li>MoveRenamedElementPrecondition</li>
 * <li>MoveRenamedElementPostcondition</li>
 * <li>ExchangeLocationOfElementsPrecondition</li>
 * <li>ExchangeLocationOfElementsPostcondition</li>
 * <li>UpdateReferenceTargetPrecondition</li>
 * <li>UpdateReferenceTargetPostcondition</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() {
    querySpecifications.add(MoveElementPrecondition.instance());
    querySpecifications.add(MoveElementPostcondition.instance());
    querySpecifications.add(RenameElementPrecondition.instance());
    querySpecifications.add(RenameElementPostcondition.instance());
    querySpecifications.add(MoveRenamedElementPrecondition.instance());
    querySpecifications.add(MoveRenamedElementPostcondition.instance());
    querySpecifications.add(ExchangeLocationOfElementsPrecondition.instance());
    querySpecifications.add(ExchangeLocationOfElementsPostcondition.instance());
    querySpecifications.add(UpdateReferenceTargetPrecondition.instance());
    querySpecifications.add(UpdateReferenceTargetPostcondition.instance());
  }
  
  public MoveElementPrecondition getMoveElementPrecondition() {
    return MoveElementPrecondition.instance();
  }
  
  public MoveElementPrecondition.Matcher getMoveElementPrecondition(final ViatraQueryEngine engine) {
    return MoveElementPrecondition.Matcher.on(engine);
  }
  
  public MoveElementPostcondition getMoveElementPostcondition() {
    return MoveElementPostcondition.instance();
  }
  
  public MoveElementPostcondition.Matcher getMoveElementPostcondition(final ViatraQueryEngine engine) {
    return MoveElementPostcondition.Matcher.on(engine);
  }
  
  public RenameElementPrecondition getRenameElementPrecondition() {
    return RenameElementPrecondition.instance();
  }
  
  public RenameElementPrecondition.Matcher getRenameElementPrecondition(final ViatraQueryEngine engine) {
    return RenameElementPrecondition.Matcher.on(engine);
  }
  
  public RenameElementPostcondition getRenameElementPostcondition() {
    return RenameElementPostcondition.instance();
  }
  
  public RenameElementPostcondition.Matcher getRenameElementPostcondition(final ViatraQueryEngine engine) {
    return RenameElementPostcondition.Matcher.on(engine);
  }
  
  public MoveRenamedElementPrecondition getMoveRenamedElementPrecondition() {
    return MoveRenamedElementPrecondition.instance();
  }
  
  public MoveRenamedElementPrecondition.Matcher getMoveRenamedElementPrecondition(final ViatraQueryEngine engine) {
    return MoveRenamedElementPrecondition.Matcher.on(engine);
  }
  
  public MoveRenamedElementPostcondition getMoveRenamedElementPostcondition() {
    return MoveRenamedElementPostcondition.instance();
  }
  
  public MoveRenamedElementPostcondition.Matcher getMoveRenamedElementPostcondition(final ViatraQueryEngine engine) {
    return MoveRenamedElementPostcondition.Matcher.on(engine);
  }
  
  public ExchangeLocationOfElementsPrecondition getExchangeLocationOfElementsPrecondition() {
    return ExchangeLocationOfElementsPrecondition.instance();
  }
  
  public ExchangeLocationOfElementsPrecondition.Matcher getExchangeLocationOfElementsPrecondition(final ViatraQueryEngine engine) {
    return ExchangeLocationOfElementsPrecondition.Matcher.on(engine);
  }
  
  public ExchangeLocationOfElementsPostcondition getExchangeLocationOfElementsPostcondition() {
    return ExchangeLocationOfElementsPostcondition.instance();
  }
  
  public ExchangeLocationOfElementsPostcondition.Matcher getExchangeLocationOfElementsPostcondition(final ViatraQueryEngine engine) {
    return ExchangeLocationOfElementsPostcondition.Matcher.on(engine);
  }
  
  public UpdateReferenceTargetPrecondition getUpdateReferenceTargetPrecondition() {
    return UpdateReferenceTargetPrecondition.instance();
  }
  
  public UpdateReferenceTargetPrecondition.Matcher getUpdateReferenceTargetPrecondition(final ViatraQueryEngine engine) {
    return UpdateReferenceTargetPrecondition.Matcher.on(engine);
  }
  
  public UpdateReferenceTargetPostcondition getUpdateReferenceTargetPostcondition() {
    return UpdateReferenceTargetPostcondition.instance();
  }
  
  public UpdateReferenceTargetPostcondition.Matcher getUpdateReferenceTargetPostcondition(final ViatraQueryEngine engine) {
    return UpdateReferenceTargetPostcondition.Matcher.on(engine);
  }
}
