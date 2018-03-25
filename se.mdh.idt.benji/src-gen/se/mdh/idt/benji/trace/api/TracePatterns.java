/**
 * Generated from platform:/resource/se.mdh.idt.benji/src/se/mdh/idt/benji/trace/api/TracePatterns.vql
 */
package se.mdh.idt.benji.trace.api;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.trace.api.Current;
import se.mdh.idt.benji.trace.api.Initial;

/**
 * A pattern group formed of all public patterns defined in TracePatterns.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TracePatterns.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.trace.api, the group contains the definition of the following patterns: <ul>
 * <li>initial</li>
 * <li>current</li>
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
    querySpecifications.add(Initial.instance());
    querySpecifications.add(Current.instance());
  }
  
  public Initial getInitial() {
    return Initial.instance();
  }
  
  public Initial.Matcher getInitial(final ViatraQueryEngine engine) {
    return Initial.Matcher.on(engine);
  }
  
  public Current getCurrent() {
    return Current.instance();
  }
  
  public Current.Matcher getCurrent(final ViatraQueryEngine engine) {
    return Current.Matcher.on(engine);
  }
}
