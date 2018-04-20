package se.mdh.idt.benji.trace.api

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import se.mdh.idt.benji.trace.Trace

import static extension org.eclipse.emf.ecore.util.EcoreUtil.delete

class TraceUtils {
	
	// delete
	def static <T extends EObject> void delete (EObject element) {
		switch element {
			Trace : element.<EObject>current.delete(true)
			EObject : element.delete(true)
		}
	}
	
	// insert (+=)
	def static <T extends EObject> void += (EList<T> list, EObject element) {
		switch element {
			Trace : list += element.<EObject>current
			EObject : try (list.add(element as T)) catch (Exception e) {}
		}
	}
	
	// remove (-=)
	def static <T extends EObject> void -= (EList<T> list, EObject element) {
		switch element {
			Trace : list -= element.<EObject>current
			EObject : try (list.remove(element as T)) catch (Exception e) {}
		}
	}
	 
}