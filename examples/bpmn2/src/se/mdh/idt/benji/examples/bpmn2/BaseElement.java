/**
 */
package se.mdh.idt.benji.examples.bpmn2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.bpmn2.BaseElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.bpmn2.Bpmn2Package#getBaseElement()
 * @model abstract="true"
 * @generated
 */
public interface BaseElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see se.mdh.idt.benji.examples.bpmn2.Bpmn2Package#getBaseElement_Id()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.bpmn2.BaseElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // BaseElement
