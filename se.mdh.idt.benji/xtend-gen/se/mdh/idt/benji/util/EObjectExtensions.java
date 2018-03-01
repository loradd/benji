package se.mdh.idt.benji.util;

import com.google.common.collect.Iterables;
import java.util.UUID;
import java.util.function.Predicate;
import org.eclipse.emf.common.notify.Adapter;
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
public class EObjectExtensions {
  public static class EObjectIdentifier extends AdapterImpl {
    public String identifier = UUID.randomUUID().toString();
  }
  
  public static String getIdentifier(final EObject eObject) {
    String _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = IterableExtensions.<EObjectExtensions.EObjectIdentifier>head(Iterables.<EObjectExtensions.EObjectIdentifier>filter(eObject.eAdapters(), EObjectExtensions.EObjectIdentifier.class)).identifier;
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
  
  public static void setIdentifier(final EObject eObject, final String identifier) {
    try {
      EList<Adapter> _eAdapters = eObject.eAdapters();
      EObjectExtensions.EObjectIdentifier _eObjectIdentifier = new EObjectExtensions.EObjectIdentifier();
      final Procedure1<EObjectExtensions.EObjectIdentifier> _function = (EObjectExtensions.EObjectIdentifier it) -> {
        it.identifier = identifier;
      };
      EObjectExtensions.EObjectIdentifier _doubleArrow = ObjectExtensions.<EObjectExtensions.EObjectIdentifier>operator_doubleArrow(_eObjectIdentifier, _function);
      _eAdapters.add(_doubleArrow);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static void removeIdentifier(final EObject eObject) {
    try {
      final Predicate<Adapter> _function = (Adapter eAdapter) -> {
        return (eAdapter instanceof EObjectExtensions.EObjectIdentifier);
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
