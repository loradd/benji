package se.mdh.idt.benji.trace.api

import org.eclipse.emf.ecore.EObject
import se.mdh.idt.benji.trace.Trace

class TraceExtensions {
	
	def static <T extends EObject> T current(Trace element) {
		element.current as T
	}
	
	def static <T extends EObject> T initial(Trace element) {
		element.initial as T
	}
	 
}