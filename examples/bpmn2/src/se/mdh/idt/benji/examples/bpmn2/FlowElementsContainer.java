/**
 */
package se.mdh.idt.benji.examples.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.bpmn2.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.bpmn2.Bpmn2Package#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface FlowElementsContainer extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.bpmn2.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.bpmn2.Bpmn2Package#getFlowElementsContainer_FlowElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

} // FlowElementsContainer
