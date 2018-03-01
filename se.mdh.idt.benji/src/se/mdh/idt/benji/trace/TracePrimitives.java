package se.mdh.idt.benji.trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

/**
 * @author Lorenzo Addazi
 **/
public class TracePrimitives {
	
	// trace factory
	private static final TraceFactory traceFactory = TraceFactory.eINSTANCE; 
	
	// primitives - create
	public static EObject create(EObject eContainer, EStructuralFeature eStructuralFeature, EClass eClass) {
		EObject eObject = EcoreUtil.create(eClass);
		insert(eContainer, eStructuralFeature, eObject); 
		register(eObject);
		return eObject; 
	}
	
	// primitives - insert
	@SuppressWarnings("unchecked")
	public static void insert(EObject eObject, EStructuralFeature eStructuralFeature, Object eValue) {
		((EList<Object>)eObject.eGet(eStructuralFeature)).add(eValue); 
	}
	
	// primitives - remove
	public static void remove(EObject eObject, EStructuralFeature eStructuralFeature, Object eValue) {
		EcoreUtil.remove(eObject, eStructuralFeature, eValue);
	}
	
	// primitives - set
	public static void set(EObject eObject, EStructuralFeature eStructuralFeature, Object eValue) {
		eObject.eSet(eStructuralFeature, eValue);
	}
	
	// primitives - delete
	public static void delete(EObject eObject) {
		EcoreUtil.delete(eObject, true);
	}
	
	// utilities - register
	private static void register(EObject eTarget) {
//		ResourceSet resourceSet = eTarget.eResource().getResourceSet(); 
//		Resource traceResource = resourceSet.getResource(URI.createURI(TraceBuilder.TRACE_URI), true);
//		TraceModel traceModel = (TraceModel) EcoreUtil2.getObjectByType(traceResource.getContents(), TracePackage.Literals.TRACE_MODEL);
//		TraceLink traceLink = traceFactory.createTraceLink(); 
//		traceLink.setSource(null);
//		traceLink.setTarget(eTarget);
//		traceModel.getTraceLinks().add(traceLink);
	}
	
}
