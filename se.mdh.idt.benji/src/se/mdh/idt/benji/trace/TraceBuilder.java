package se.mdh.idt.benji.trace;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import com.google.common.base.Function;

/**
 * @author Lorenzo Addazi 
 **/
public class TraceBuilder {
	
	// trace resource - default uri
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
		Registry resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry(); 
		Map<String, Object> extensionToFactoryMap = resourceFactoryRegistry.getExtensionToFactoryMap(); 
		Factory resourceFactory = new XMIResourceFactoryImpl();
		extensionToFactoryMap.put("*", resourceFactory); 
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
		copier.copyReferences(); 
		Resource traceResource = resourceSet.createResource(URI.createURI(TRACE_URI)); 
		TraceModel traceModel = TraceFactory.eINSTANCE.createTraceModel(); 
		traceModel.getTraceLinks().addAll(copier.entrySet().stream().map(toTraceLink).collect(Collectors.toList()));
		traceResource.getContents().add(traceModel);
		targets.forEach(target -> {
			EContentAdapter eContentAdapter = new EContentAdapter() {
				@Override
				protected void setTarget(EObject target) {
					super.setTarget(target);
					if (!target.eAdapters().stream().anyMatch(eAdapter -> eAdapter instanceof TraceAdapter)) 
						target.eAdapters().add(new TraceAdapter(resourceSet, target)); 
				}
			};
			target.eAdapters().add(eContentAdapter); 
		});
		return resourceSet; 
	}
	
	// create trace link from eObject pair
	private final Function<Entry<EObject, EObject>, TraceLink> toTraceLink = new Function<Entry<EObject, EObject>, TraceLink>() {
		
		// trace factory
		private final TraceFactory traceFactory = TraceFactory.eINSTANCE; 
		
		@Override
		public TraceLink apply(Entry<EObject, EObject> entry) {
			EObject source = entry.getValue();
			EObject target = entry.getKey();
			TraceLink traceLink = traceFactory.createTraceLink(); 
			traceLink.setSource(source);
			traceLink.setTarget(target);
			return traceLink; 
		}
		
	}; 
	
}