package se.mdh.idt.benji.trace.api;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import se.mdh.idt.benji.trace.Trace;
import se.mdh.idt.benji.trace.TraceFactory;

@SuppressWarnings("all")
public class TraceActions {
  public static EObject create(final EClass eClass) {
    return EcoreUtil.create(eClass);
  }
  
  public static void delete(final EObject element) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      TraceActions.delete(((Trace)element).<EObject>current());
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        EcoreUtil.delete(element, true);
      }
    }
  }
  
  public static Object get(final EObject element, final EStructuralFeature feature) {
    Object _switchResult = null;
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      _switchResult = TraceActions.get(((Trace)element).<EObject>current(), feature);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        _switchResult = element.eGet(feature);
      }
    }
    return _switchResult;
  }
  
  public static void set(final EObject element, final EAttribute attribute, final Object value) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      TraceActions.set(((Trace)element).<EObject>current(), attribute, value);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        element.eSet(attribute, value);
      }
    }
  }
  
  public static void set(final EObject element, final EReference reference, final EObject value) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      TraceActions.set(((Trace)element).<EObject>current(), reference, value);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        boolean _matched_1 = false;
        if (value instanceof Trace) {
          _matched_1=true;
          TraceActions.set(element, reference, ((Trace)value).<EObject>current());
        }
        if (!_matched_1) {
          if (value instanceof EObject) {
            _matched_1=true;
            element.eSet(reference, value);
          }
        }
      }
    }
  }
  
  public static void insert(final EObject element, final EAttribute attribute, final Object value) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      TraceActions.insert(((Trace)element).<EObject>current(), attribute, value);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        Object _eGet = element.eGet(attribute);
        ((EList<Object>) _eGet).add(value);
      }
    }
  }
  
  public static void insert(final EObject element, final EReference reference, final EObject value) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      TraceActions.insert(((Trace)element).<EObject>current(), reference, value);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        boolean _matched_1 = false;
        if (value instanceof Trace) {
          _matched_1=true;
          TraceActions.insert(element, reference, ((Trace)value).<EObject>current());
        }
        if (!_matched_1) {
          if (value instanceof EObject) {
            _matched_1=true;
            Object _eGet = element.eGet(reference);
            ((EList<EObject>) _eGet).add(value);
          }
        }
      }
    }
  }
  
  public static void remove(final EObject element, final EAttribute attribute, final Object value) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      TraceActions.remove(((Trace)element).<EObject>current(), attribute, value);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        Object _eGet = element.eGet(attribute);
        ((EList<Object>) _eGet).remove(value);
      }
    }
  }
  
  public static void remove(final EObject element, final EReference reference, final EObject value) {
    boolean _matched = false;
    if (element instanceof Trace) {
      _matched=true;
      TraceActions.remove(((Trace)element).<EObject>current(), reference, value);
    }
    if (!_matched) {
      if (element instanceof EObject) {
        _matched=true;
        boolean _matched_1 = false;
        if (value instanceof Trace) {
          _matched_1=true;
          TraceActions.remove(element, reference, ((Trace)value).<EObject>current());
        }
        if (!_matched_1) {
          if (value instanceof EObject) {
            _matched_1=true;
            Object _eGet = element.eGet(reference);
            ((EList<EObject>) _eGet).remove(value);
          }
        }
      }
    }
  }
  
  public static void main(final String[] args) {
    Trace _createTrace = TraceFactory.eINSTANCE.createTrace();
    final Procedure1<Trace> _function = (Trace it) -> {
      it.setInitial(TraceActions.create(EcorePackage.Literals.EPACKAGE));
      it.setCurrent(TraceActions.create(EcorePackage.Literals.EPACKAGE));
    };
    final Trace ePackage = ObjectExtensions.<Trace>operator_doubleArrow(_createTrace, _function);
    final EObject eClass = TraceActions.create(EcorePackage.Literals.ECLASS);
    TraceActions.set(eClass, EcorePackage.Literals.ENAMED_ELEMENT__NAME, "TheClass");
    TraceActions.insert(ePackage, EcorePackage.Literals.EPACKAGE__ECLASSIFIERS, eClass);
    InputOutput.<Object>print(TraceActions.get(ePackage, EcorePackage.Literals.EPACKAGE__ECLASSIFIERS));
  }
}
