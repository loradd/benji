package se.mdh.idt.benji.trace;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class TraceMonitor extends EContentAdapter {
	
	// resource set
	private final ResourceSet resourceSet; 
	
	// constructor
	public TraceMonitor (ResourceSet resourceSet) {
		this.resourceSet = resourceSet; 
	}
	
	@Override
	protected void setTarget(EObject target) {
		super.setTarget(target);
		attachTraceAdapter(target); 
	}
	
	// check trace adapter
	private boolean hasTraceAdapter (EObject target) {
		return target.eAdapters().stream()
			.anyMatch(eAdapter -> eAdapter instanceof TraceAdapter); 
	}
	
	// attach trace adapter
	private void attachTraceAdapter (EObject target) {
		if (!hasTraceAdapter(target))
			target.eAdapters().add(new TraceAdapter(this.resourceSet, target)); 
	}
	
}