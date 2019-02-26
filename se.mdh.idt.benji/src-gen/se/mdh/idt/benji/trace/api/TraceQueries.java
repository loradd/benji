/**
 * Generated from platform:/resource/se.mdh.idt.benji/src/se/mdh/idt/benji/trace/api/TraceQueries.vql
 */
package se.mdh.idt.benji.trace.api;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.trace.api.Created;
import se.mdh.idt.benji.trace.api.Current;
import se.mdh.idt.benji.trace.api.Deleted;
import se.mdh.idt.benji.trace.api.Initial;
import se.mdh.idt.benji.trace.api.Preserved;

/**
 * A pattern group formed of all public patterns defined in TraceQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TraceQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.trace.api, the group contains the definition of the following patterns: <ul>
 * <li>initial</li>
 * <li>current</li>
 * <li>preserved</li>
 * <li>created</li>
 * <li>deleted</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TraceQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TraceQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new TraceQueries();
    }
    return INSTANCE;
  }
  
  private static TraceQueries INSTANCE;
  
  private TraceQueries() {
    querySpecifications.add(Initial.instance());
    querySpecifications.add(Current.instance());
    querySpecifications.add(Preserved.instance());
    querySpecifications.add(Created.instance());
    querySpecifications.add(Deleted.instance());
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
  
  public Preserved getPreserved() {
    return Preserved.instance();
  }
  
  public Preserved.Matcher getPreserved(final ViatraQueryEngine engine) {
    return Preserved.Matcher.on(engine);
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
}
