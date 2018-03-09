package se.mdh.idt.benji.util;

import com.google.common.collect.Iterables;
import java.util.UUID;
import java.util.function.Predicate;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * @author Lorenzo Addazi
 */
@SuppressWarnings("all")
public class EObjectID {
  public static class Adapter extends AdapterImpl {
    public String identifier = UUID.randomUUID().toString();
  }
  
  public static String get(final EObject eObject) {
    String _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = IterableExtensions.<EObjectID.Adapter>head(Iterables.<EObjectID.Adapter>filter(eObject.eAdapters(), EObjectID.Adapter.class)).identifier;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        _xtrycatchfinallyexpression = null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public static void set(final EObject eObject, final String identifier) {
    try {
      EList<org.eclipse.emf.common.notify.Adapter> _eAdapters = eObject.eAdapters();
      EObjectID.Adapter _adapter = new EObjectID.Adapter();
      final Procedure1<EObjectID.Adapter> _function = (EObjectID.Adapter it) -> {
        it.identifier = identifier;
      };
      EObjectID.Adapter _doubleArrow = ObjectExtensions.<EObjectID.Adapter>operator_doubleArrow(_adapter, _function);
      _eAdapters.add(_doubleArrow);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static void remove(final EObject eObject) {
    try {
      final Predicate<org.eclipse.emf.common.notify.Adapter> _function = (org.eclipse.emf.common.notify.Adapter eAdapter) -> {
        return (eAdapter instanceof EObjectID.Adapter);
      };
      eObject.eAdapters().removeIf(_function);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
