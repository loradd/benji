/**
 */
package se.mdh.idt.benji.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.trace.TraceModel#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.trace.TracePackage#getTraceModel()
 * @model
 * @generated
 */
public interface TraceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.trace.Trace}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.trace.Trace#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see se.mdh.idt.benji.trace.TracePackage#getTraceModel_Traces()
	 * @see se.mdh.idt.benji.trace.Trace#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();

} // TraceModel
