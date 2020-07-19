/**
 */
package se.mdh.idt.benji.examples.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.bpmn2.FlowNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.bpmn2.Bpmn2Package#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see se.mdh.idt.benji.examples.bpmn2.Bpmn2Package#getFlowNode_Outgoing()
	 * @see se.mdh.idt.benji.examples.bpmn2.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see se.mdh.idt.benji.examples.bpmn2.Bpmn2Package#getFlowNode_Incoming()
	 * @see se.mdh.idt.benji.examples.bpmn2.SequenceFlow#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

} // FlowNode
