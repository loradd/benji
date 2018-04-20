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
	
	// constructor (current)
	public TraceAdapter (ResourceSet resourceSet, EObject current) {
		this (resourceSet, null, current);  
	}
	
	// constructor (initial, current)
	public TraceAdapter (ResourceSet resourceSet, EObject initial, EObject current) {
		Resource traceResource = resourceSet.getResource(URI.createURI(TraceBuilder.TRACE_URI), true);
		TraceModel traceModel = (TraceModel) EcoreUtil2.getObjectByType(traceResource.getContents(), TracePackage.Literals.TRACE_MODEL); 
		Trace trace = TraceFactory.eINSTANCE.createTrace(); 
		trace.setInitial(initial);
		trace.setCurrent(current);
		traceModel.getTraces().add(trace);
	}
	
}
