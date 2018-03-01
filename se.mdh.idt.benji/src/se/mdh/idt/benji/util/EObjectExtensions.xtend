package se.mdh.idt.benji.util

import java.util.UUID
import org.eclipse.emf.common.notify.impl.AdapterImpl
import org.eclipse.emf.ecore.EObject

/**
 * @author Lorenzo Addazi
 **/
class EObjectExtensions {

	def static String getIdentifier(EObject eObject) {
		try { eObject.eAdapters.filter(EObjectIdentifier).head.identifier } catch (Exception e) { null } 
	}
	
	def static void setIdentifier(EObject eObject, String identifier) {
		try { eObject.eAdapters += new EObjectIdentifier => [it.identifier = identifier] } catch (Exception e) { /* No-op */ }
		
	}
	
	def static void removeIdentifier(EObject eObject) {
		try { eObject.eAdapters.removeIf[eAdapter | eAdapter instanceof EObjectIdentifier] } catch (Exception e) { /* No-Op */}
	}
	
	static class EObjectIdentifier extends AdapterImpl {
		public var identifier = UUID::randomUUID.toString
	} 
	
}