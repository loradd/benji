/**
 * Generated from platform:/resource/se.mdh.idt.benji/src/se/mdh/idt/benji/trace/api/TracePatterns.vql
 */
package se.mdh.idt.benji.trace.api.internal;

import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.trace.api.Created;
import se.mdh.idt.benji.trace.api.Deleted;
import se.mdh.idt.benji.trace.api.Existing;
import se.mdh.idt.benji.trace.api.Preserved;
import se.mdh.idt.benji.trace.api.internal.Current;
import se.mdh.idt.benji.trace.api.internal.Initial;

/**
 * A pattern group formed of all patterns defined in TracePatterns.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package se.mdh.idt.benji.trace.api, the group contains the definition of the following patterns: <ul>
 * <li>initial</li>
 * <li>current</li>
 * <li>existing</li>
 * <li>created</li>
 * <li>deleted</li>
 * <li>preserved</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class TracePatternsAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TracePatternsAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new TracePatternsAll();
    }
    return INSTANCE;
  }
  
  private static TracePatternsAll INSTANCE;
  
  private TracePatternsAll() {
    querySpecifications.add(Initial.instance());
    querySpecifications.add(Current.instance());
    querySpecifications.add(Existing.instance());
    querySpecifications.add(Created.instance());
    querySpecifications.add(Deleted.instance());
    querySpecifications.add(Preserved.instance());
  }
}
