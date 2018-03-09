package se.mdh.idt.benji.util

import java.util.UUID
import org.eclipse.emf.common.notify.impl.AdapterImpl
import org.eclipse.emf.ecore.EObject

/**
 * @author Lorenzo Addazi
 **/
class EObjectID {

	// retrieve identifier
	def static String get (EObject eObject) {
		try { eObject.eAdapters.filter(EObjectID.Adapter).head.identifier } catch (Exception e) { null } 
	}
	
	// set identifier
	def static void set (EObject eObject, String identifier) {
		try { eObject.eAdapters += new EObjectID.Adapter => [it.identifier = identifier] } catch (Exception e) { /* No-op */ }
		
	}
	
	// unset identifier
	def static void remove (EObject eObject) {
		try { eObject.eAdapters.removeIf[eAdapter | eAdapter instanceof EObjectID.Adapter] } catch (Exception e) { /* No-Op */}
	}
	
	// identifier adapter
	static class Adapter extends AdapterImpl {
		public var identifier = UUID::randomUUID.toString
	} 
	
}