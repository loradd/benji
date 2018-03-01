/**
 * Generated from platform:/resource/se.mdh.idt.benji/src/se/mdh/idt/benji/trace/TracePatterns.vql
 */
package se.mdh.idt.benji.trace;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.trace.Created;
import se.mdh.idt.benji.trace.CurrentlyExisting;
import se.mdh.idt.benji.trace.Deleted;
import se.mdh.idt.benji.trace.InitiallyExisting;
import se.mdh.idt.benji.trace.Preserved;
import se.mdh.idt.benji.trace.Source;
import se.mdh.idt.benji.trace.Target;

/**
 * A pattern group formed of all public patterns defined in TracePatterns.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TracePatterns.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.trace, the group contains the definition of the following patterns: <ul>
 * <li>source</li>
 * <li>target</li>
 * <li>initiallyExisting</li>
 * <li>currentlyExisting</li>
 * <li>created</li>
 * <li>deleted</li>
 * <li>preserved</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class TracePatterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TracePatterns instance() {
    if (INSTANCE == null) {
        INSTANCE = new TracePatterns();
    }
    return INSTANCE;
  }
  
  private static TracePatterns INSTANCE;
  
  private TracePatterns() {
    querySpecifications.add(Source.instance());
    querySpecifications.add(Target.instance());
    querySpecifications.add(InitiallyExisting.instance());
    querySpecifications.add(CurrentlyExisting.instance());
    querySpecifications.add(Created.instance());
    querySpecifications.add(Deleted.instance());
    querySpecifications.add(Preserved.instance());
  }
  
  public Source getSource() {
    return Source.instance();
  }
  
  public Source.Matcher getSource(final ViatraQueryEngine engine) {
    return Source.Matcher.on(engine);
  }
  
  public Target getTarget() {
    return Target.instance();
  }
  
  public Target.Matcher getTarget(final ViatraQueryEngine engine) {
    return Target.Matcher.on(engine);
  }
  
  public InitiallyExisting getInitiallyExisting() {
    return InitiallyExisting.instance();
  }
  
  public InitiallyExisting.Matcher getInitiallyExisting(final ViatraQueryEngine engine) {
    return InitiallyExisting.Matcher.on(engine);
  }
  
  public CurrentlyExisting getCurrentlyExisting() {
    return CurrentlyExisting.instance();
  }
  
  public CurrentlyExisting.Matcher getCurrentlyExisting(final ViatraQueryEngine engine) {
    return CurrentlyExisting.Matcher.on(engine);
  }
  
  public Created getCreated() {
    return Created.instance();
  }
  
  public Created.Matcher getCreated(final ViatraQueryEngine engine) {
    return Created.Matcher.on(engine);
  }
  
  public Deleted getDeleted() {
    return Deleted.instance();
  }
  
  public Deleted.Matcher getDeleted(final ViatraQueryEngine engine) {
    return Deleted.Matcher.on(engine);
  }
  
  public Preserved getPreserved() {
    return Preserved.instance();
  }
  
  public Preserved.Matcher getPreserved(final ViatraQueryEngine engine) {
    return Preserved.Matcher.on(engine);
  }
}
