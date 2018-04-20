package se.mdh.idt.benji.trace.api

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import se.mdh.idt.benji.trace.Trace
import se.mdh.idt.benji.trace.TraceFactory

import static org.eclipse.emf.ecore.EcorePackage.Literals.*

class TraceActions {
	
	// create (eClass)
	def static EObject create (EClass eClass) {
		EcoreUtil.create(eClass)
	}
	
	// delete (eObject)
	def static void delete (EObject element) {
		switch element {
			Trace : delete (element.<EObject>current)
			EObject : EcoreUtil.delete(element, true)
		}
	}
	
	// get (element, feature)
	def static Object get (EObject element, EStructuralFeature feature) {
		switch element {
			Trace : get(element.<EObject>current, feature)
			EObject : element.eGet(feature)
		}
	}
	
	// set (element, attribute, value)
	def static void set (EObject element, EAttribute attribute, Object value) {
		switch element {
			Trace : set (element.<EObject>current, attribute, value)
			EObject : element.eSet(attribute, value)
		}	
	}
	
	// set (element, reference, value)
	def static void set (EObject element, EReference reference, EObject value) {
		switch element {
			Trace : set (element.<EObject>current, reference, value)
			EObject : switch value {
				Trace : set (element, reference, value.<EObject>current)
				EObject : element.eSet(reference, value)
			}
		}
	}	
	
	// insert (element, attribute, value)
	def static void insert (EObject element, EAttribute attribute, Object value) {
		switch element {
			Trace : insert (element.<EObject>current, attribute, value)
			EObject : (element.eGet(attribute) as EList<Object>).add(value)
		}
	}
	
	// insert (element, reference, value)
	def static void insert (EObject element, EReference reference, EObject value) {
		switch element {
			Trace : insert (element.<EObject>current, reference, value)
			EObject : switch value {
				Trace : insert (element, reference, value.<EObject>current)
				EObject : (element.eGet(reference) as EList<EObject>).add(value)
			}
		}
	}
	
	// remove (element, attribute, value)
	def static void remove (EObject element, EAttribute attribute, Object value) {
		switch element {
			Trace : remove (element.<EObject>current, attribute, value)
			EObject : (element.eGet(attribute) as EList<Object>).remove(value)
		}
	}
	
	// remove (element, reference, value)
	def static void remove (EObject element, EReference reference, EObject value) {
		switch element {
			Trace : remove (element.<EObject>current, reference, value)
			EObject : switch value {
				Trace : remove (element, reference, value.<EObject>current)
				EObject : (element.eGet(reference) as EList<EObject>).remove(value)
			}
		}
	}
	
	def static void main(String[] args) {
		val ePackage = TraceFactory.eINSTANCE.createTrace => [
			initial = create (EPACKAGE)
			current = create (EPACKAGE)		
		]
		
		val eClass = create (ECLASS)
		set (eClass, ENAMED_ELEMENT__NAME, "TheClass")
		insert (ePackage, EPACKAGE__ECLASSIFIERS, eClass)
		print (get (ePackage, EPACKAGE__ECLASSIFIERS) )
		
	}
			
}