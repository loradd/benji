package se.mdh.idt.benji.trace.api;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import se.mdh.idt.benji.trace.Trace;

@SuppressWarnings("all")
public class TraceUtils {
  public static <T extends EObject> void delete(final EObject element) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      EcoreUtil.delete(((Trace)element).<EObject>current(), true);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        EcoreUtil.delete(element, true);
      }
    }
  }
  
  public static <T extends EObject> void operator_add(final EList<T> list, final EObject element) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      EObject _current = ((Trace)element).<EObject>current();
      TraceUtils.<T>operator_add(list, _current);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        try {
          list.add(((T) element));
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
  
  public static <T extends EObject> void operator_remove(final EList<T> list, final EObject element) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      EObject _current = ((Trace)element).<EObject>current();
      TraceUtils.<T>operator_remove(list, _current);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        try {
          list.remove(((T) element));
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
}
