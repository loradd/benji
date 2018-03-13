package se.mdh.idt.benji.trace;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * @author Lorenzo Addazi 
 **/
public class TraceBuilder {
	
	// traces - uri
	public static final String TRACE_URI = "__traces__"; 

	// copier
	private final Copier copier = new Copier();
	// resource set
	private final ResourceSet resourceSet = new ResourceSetImpl();
	// target models
	private final Set<Resource> targets = new HashSet<Resource>(); 
	
	// constructor
	public TraceBuilder() {
		resourceSet.getPackageRegistry().put(TracePackage.eNS_URI, TracePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl()); 
		resourceSet.createResource(URI.createURI(TRACE_URI)).getContents().add(TraceFactory.eINSTANCE.createTraceModel()); 
	}
	
	// load 
	public Resource load(String modelPath) {
		File modelFile = new File(modelPath); 
		String modelAbsolutePath = modelFile.getAbsolutePath(); 
		URI targetModelURI = URI.createFileURI(modelAbsolutePath); 
		Resource targetModelResource = resourceSet.getResource(targetModelURI, true);
		URI sourceModelURI = targetModelURI.trimFileExtension().appendFileExtension("tmp");
		Resource sourceModelResource = resourceSet.createResource(sourceModelURI); 
		Collection<EObject> sourceModelContents = copier.copyAll(targetModelResource.getContents()); 
		sourceModelResource.getContents().addAll(sourceModelContents);
		targets.add(targetModelResource); 
		return targetModelResource; 
	}
	
	// build
	public ResourceSet build() throws ViatraQueryException {
		this.copier.copyReferences(); 
		// attach trace adapters
		for (Entry<EObject, EObject> entry : this.copier.entrySet()) {
			EObject source = entry.getValue(); 
			EObject target = entry.getKey(); 
			target.eAdapters().add(new TraceAdapter(resourceSet, source, target)); 
		}
		// attach trace monitor
		TraceMonitor traceMonitor = new TraceMonitor(resourceSet); 
		this.targets.forEach(target -> target.eAdapters().add(traceMonitor));
		return resourceSet; 
	}

}