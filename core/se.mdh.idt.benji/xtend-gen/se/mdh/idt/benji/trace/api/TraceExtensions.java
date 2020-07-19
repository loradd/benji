package se.mdh.idt.benji.trace.api;

import org.eclipse.emf.ecore.EObject;
import se.mdh.idt.benji.trace.Trace;

@SuppressWarnings("all")
public class TraceExtensions {
  public static <T extends EObject> T current(final Trace element) {
    EObject _current = element.getCurrent();
    return ((T) _current);
  }
  
  public static <T extends EObject> T initial(final Trace element) {
    EObject _initial = element.getInitial();
    return ((T) _initial);
  }
}
