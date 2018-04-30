package se.mdh.idt.benji.benchmark.statecoding;

import static se.mdh.idt.benji.trace.TraceBuilder.TRACE_URI;
import static se.mdh.idt.benji.trace.TracePackage.Literals.TRACE_MODEL;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.xtext.EcoreUtil2;

import se.mdh.idt.benji.trace.Trace;
import se.mdh.idt.benji.trace.TraceModel;
/**
 * @author Lorenzo Addazi 
 **/
public class BenchmarkStateCoder implements IStateCoder {
	
	private TraceModel traceModel;
	
	@Override
	public void init(Notifier notifier) {
		if (notifier instanceof ResourceSet) {
			ResourceSet resourceSet = (ResourceSet) notifier; 
			Resource traceResource = resourceSet.getResource(URI.createURI(TRACE_URI), true); 
			this.traceModel = (TraceModel) EcoreUtil2.getObjectByType(traceResource.getContents(), TRACE_MODEL);
		}
	}
	
	@Override
	public Object createActivationCode(IPatternMatch match) {
		return new BenchmarkActivationCode(match); 
	}
	
	@Override
	public Object createStateCode() {
		return createDescription(traceModel); 
	}
	
	// activation code
	public class BenchmarkActivationCode implements Comparable<BenchmarkActivationCode> {
		
		private final IPatternMatch match; 
		private final String matchDescription;  
		
		public BenchmarkActivationCode(IPatternMatch match) {
			this.match = match;
			this.matchDescription = createDescription(match); 
		} 
		
		public IPatternMatch getMatch() {
			return this.match; 
		}
		
		@Override
		public String toString() {
			return this.matchDescription;  
	    }
		
		@Override
		public boolean equals(Object obj) {
			return this.toString().equals(obj.toString()); 
		}
		
		@Override
		public int compareTo(BenchmarkActivationCode activationCode) {
			return this.toString().compareTo(activationCode.toString()); 
		}
		
	}
	
	// create description from pattern match
	@SuppressWarnings("unchecked")
	private static String createDescription(IPatternMatch match) {
		String patternName = match.specification().getFullyQualifiedName(); 
		List<String> parameterNames = match.parameterNames(); 
		List<Object> parameterValues = parameterNames.stream()
			.map(parameterName -> match.get(parameterName))
			.collect(Collectors.toList()); 
		List<String> parameterDescriptions = parameterValues.stream()
			.map(parameterValue -> parameterValue instanceof Trace ? 
				createDescription(((Trace)parameterValue).getCurrent()) : parameterValue.toString())
			.collect(Collectors.toList()); 
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(patternName + "[" + String.join("|", parameterDescriptions) + "]"); 
		return stringBuilder.toString().intern();		
	}
	
	// create description from trace model
	private static String createDescription(TraceModel traceModel) {
		StringBuilder traceModelDescription = new StringBuilder();
		List<Trace> traces = traceModel.getTraces(); 
		List<String> traceDescriptions = traces.stream()
			.filter(trace -> trace.getCurrent() != null)
			.filter(trace -> trace.getCurrent().eResource() != null)
			.map(trace -> createDescription(trace))
			.sorted().collect(Collectors.toList());
		traceModelDescription.append(String.join(",", traceDescriptions)); 
		return traceModelDescription.toString(); 
	}
	
	// create description from trace
	private static String createDescription(Trace trace) {
		StringBuilder traceDescription = new StringBuilder();
		EObject current = trace.getCurrent();  
		String currentDescription = createDescription(current); 
		traceDescription.append(currentDescription); 
		return traceDescription.toString(); 
	}
	
	// create description from eObject
	private static String createDescription(EObject eObject) {
		StringBuilder eObjectDescription = new StringBuilder();
		String eObjectSignature = createSignature(eObject); 
		eObjectDescription.append(eObjectSignature); 
		eObjectDescription.append(":["); 
		List<EReference> eReferences = eObject.eClass().getEAllReferences();
		List<String> eReferenceDescriptions = eReferences.stream()
			.filter(eReference -> eReference.isChangeable() && eObject.eIsSet(eReference))
			.map(eReference -> createDescription(eObject, eReference))
			.sorted().collect(Collectors.toList());
		eObjectDescription.append(String.join(",", eReferenceDescriptions));  
		eObjectDescription.append("]");
		return eObjectDescription.toString();  
	}
	
	// create description from eObject.eReference
	private static String createDescription(EObject eObject, EReference eReference) {
		StringBuilder eReferenceDescription = new StringBuilder();
		String eReferenceName = eReference.getName(); 
		eReferenceDescription.append(eReferenceName); 
		eReferenceDescription.append(":["); 
		if (eReference.isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> eReferenceValues = (EList<EObject>)eObject.eGet(eReference);
			List<String> eReferenceValueSignatures = eReferenceValues.stream()
				.map(eReferenceValue -> createSignature(eReferenceValue))
				.sorted().collect(Collectors.toList()); 
			eReferenceDescription.append(String.join(",", eReferenceValueSignatures)); 
		} else {
			EObject eReferenceValue = (EObject)eObject.eGet(eReference); 
			String eReferenceValueSignature = createSignature(eReferenceValue);  
			eReferenceDescription.append(eReferenceValueSignature);  
		}
		eReferenceDescription.append("]"); 
		return eReferenceDescription.toString(); 
	}
	
	// create description from eObject.eAttribute
	private static String createDescription(EObject eObject, EAttribute eAttribute) {
		StringBuilder eAttributeDescription = new StringBuilder();
		String eAttributeName = eAttribute.getName(); 
		eAttributeDescription.append(eAttributeName); 
		eAttributeDescription.append(":["); 
		if (eAttribute.isMany()) {
			@SuppressWarnings("unchecked")
			List<Object> eAttributeValues = (EList<Object>) eObject.eGet(eAttribute); 
			List<String> eAttributeValuesToString = eAttributeValues.stream()
				.map(eAttributeValue -> eAttributeValue.toString())
				.sorted().collect(Collectors.toList());
			eAttributeDescription.append(String.join(",", eAttributeValuesToString)); 
		} else {
			Object eAttributeValue = eObject.eGet(eAttribute);
			String eAttributeValueToString = eAttributeValue.toString(); 
			eAttributeDescription.append(eAttributeValueToString); 
		}
		eAttributeDescription.append("]");
		return eAttributeDescription.toString(); 
	}
	
	// create signature from eObject
	private static String createSignature(EObject eObject) {
		StringBuilder eObjectSignature = new StringBuilder();
		String eClassName = eObject.eClass().getName(); 
		eObjectSignature.append(eClassName); 
		eObjectSignature.append(":["); 
		List<EAttribute> eAttributes = eObject.eClass().getEAllAttributes(); 
		List<String> eAttributeDescriptions = eAttributes.stream()
			.filter(eAttribute -> eAttribute.isChangeable() && eObject.eIsSet(eAttribute))
			.map(eAttribute -> createDescription(eObject, eAttribute))
			.sorted().collect(Collectors.toList());
		eObjectSignature.append(String.join(",", eAttributeDescriptions)); 
		eObjectSignature.append("]"); 
		return eObjectSignature.toString(); 
	}	
	
}