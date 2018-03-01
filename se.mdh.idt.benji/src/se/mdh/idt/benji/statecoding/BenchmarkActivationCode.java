package se.mdh.idt.benji.statecoding;

import static se.mdh.idt.benji.util.EObjectExtensions.getIdentifier;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

/**
 * @author Lorenzo Addazi 
 **/
public class BenchmarkActivationCode implements Comparable<BenchmarkActivationCode> {
	
	private final IPatternMatch match; 
	private final String matchDescription;  
	
	public BenchmarkActivationCode(IPatternMatch match) {
		this.match = match;
		this.matchDescription = createMatchDescription(match);
	} 
	
	public IPatternMatch getMatch() {
		return this.match; 
	}
	
	private String createMatchDescription(IPatternMatch match) {
		String patternName = match.specification().getFullyQualifiedName(); 
		List<String> parameterNames = match.parameterNames(); 
		List<Object> parameterValues = parameterNames.stream()
			.map(parameterName -> match.get(parameterName))
			.collect(Collectors.toList()); 
		List<String> parameterIdentifiers = parameterValues.stream()
			.map(parameterValue -> parameterValue instanceof EObject ? 
					// eObjectIdentifierProvider.getIdentifier((EObject)parameterValue) : parameterValue.toString())
					getIdentifier((EObject)parameterValue) : parameterValue.toString())
			.collect(Collectors.toList()); 
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(patternName + "[" + String.join("|", parameterIdentifiers) + "]"); 
		return stringBuilder.toString().intern();		
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