/**
 */
package se.mdh.idt.benji.examples.metamodels.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.metamodels.bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(FlowNode)
	 * @see se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package#getSequenceFlow_SourceRef()
	 * @see se.mdh.idt.benji.examples.metamodels.bpmn2.FlowNode#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	FlowNode getSourceRef();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.metamodels.bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.metamodels.bpmn2.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(FlowNode)
	 * @see se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package#getSequenceFlow_TargetRef()
	 * @see se.mdh.idt.benji.examples.metamodels.bpmn2.FlowNode#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	FlowNode getTargetRef();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.metamodels.bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(FlowNode value);

} // SequenceFlow
