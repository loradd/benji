/**
 */
package se.mdh.idt.benji.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.trace.Trace#getModel <em>Model</em>}</li>
 *   <li>{@link se.mdh.idt.benji.trace.Trace#getInitial <em>Initial</em>}</li>
 *   <li>{@link se.mdh.idt.benji.trace.Trace#getCurrent <em>Current</em>}</li>
 *   <li>{@link se.mdh.idt.benji.trace.Trace#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.trace.TraceModel#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(TraceModel)
	 * @see se.mdh.idt.benji.trace.TracePackage#getTrace_Model()
	 * @see se.mdh.idt.benji.trace.TraceModel#getTraces
	 * @model opposite="traces" required="true" transient="false"
	 * @generated
	 */
	TraceModel getModel();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.trace.Trace#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(TraceModel value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(EObject)
	 * @see se.mdh.idt.benji.trace.TracePackage#getTrace_Initial()
	 * @model required="true"
	 * @generated
	 */
	EObject getInitial();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.trace.Trace#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(EObject value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(EObject)
	 * @see se.mdh.idt.benji.trace.TracePackage#getTrace_Current()
	 * @model required="true"
	 * @generated
	 */
	EObject getCurrent();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.trace.Trace#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(EObject value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see se.mdh.idt.benji.trace.TracePackage#getTrace_Identifier()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.trace.Trace#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // Trace
