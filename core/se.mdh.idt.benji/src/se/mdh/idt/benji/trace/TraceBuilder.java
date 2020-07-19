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
	private final Set<Resource> editables = new HashSet<Resource>(); 
	
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
		URI editableModelURI = URI.createFileURI(modelAbsolutePath); 
		Resource editableModelResource = resourceSet.getResource(editableModelURI, true);
		URI referenceModelURI = editableModelURI.trimFileExtension().appendFileExtension("tmp");
		Resource referenceModelResource = resourceSet.createResource(referenceModelURI); 
		Collection<EObject> referenceModelContents = copier.copyAll(editableModelResource.getContents()); 
		referenceModelResource.getContents().addAll(referenceModelContents);
		editables.add(editableModelResource); 
		return editableModelResource; 
	}
	
	// build
	public ResourceSet build() throws ViatraQueryException {
		this.copier.copyReferences(); 
		// attach trace adapters
		for (Entry<EObject, EObject> entry : this.copier.entrySet()) {
			EObject initial = entry.getValue(); 
			EObject current = entry.getKey(); 
			current.eAdapters().add(new TraceAdapter(resourceSet, initial, current)); 
		}
		// attach trace monitor
		TraceMonitor traceMonitor = new TraceMonitor(resourceSet); 
		this.editables.forEach(target -> target.eAdapters().add(traceMonitor));
		return resourceSet; 
	}

}