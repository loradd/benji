/**
 */
package se.mdh.idt.benji.examples.metamodels.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.bpmn2.Activity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package#getActivity_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.metamodels.bpmn2.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Activity
