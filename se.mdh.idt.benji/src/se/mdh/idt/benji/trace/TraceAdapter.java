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
	
	// referenced trace
	private final TraceLink traceLink; 
	
	// constructor
	public TraceAdapter (ResourceSet resourceSet, EObject eObject) {
		Resource traceResource = resourceSet.getResource(URI.createURI(TraceBuilder.TRACE_URI), true);  
		TraceModel traceModel = (TraceModel) EcoreUtil2.getObjectByType(traceResource.getContents(), TracePackage.Literals.TRACE_MODEL); 
		this.traceLink = TraceFactory.eINSTANCE.createTraceLink();
		this.traceLink.setSource(null);
		this.traceLink.setTarget(eObject);
		traceModel.getTraceLinks().add(this.traceLink); 
	}
	
}
