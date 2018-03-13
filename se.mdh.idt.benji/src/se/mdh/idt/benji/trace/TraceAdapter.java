package se.mdh.idt.benji.trace;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;

/**
 * @author Lorenzo Addazi 
 **/
public class TraceAdapter extends AdapterImpl {
	
	// constructor (target)
	public TraceAdapter (ResourceSet resourceSet, EObject target) {
		this (resourceSet, null, target);  
	}
	
	// constructor (source, target)
	public TraceAdapter (ResourceSet resourceSet, EObject source, EObject target) {
		Resource traceResource = resourceSet.getResource(URI.createURI(TraceBuilder.TRACE_URI), true);
		TraceModel traceModel = (TraceModel) EcoreUtil2.getObjectByType(traceResource.getContents(), TracePackage.Literals.TRACE_MODEL); 
		TraceLink traceLink = TraceFactory.eINSTANCE.createTraceLink(); 
		traceLink.setSource(source);
		traceLink.setTarget(target);
		traceModel.getTraceLinks().add(traceLink);
	}
	
}
