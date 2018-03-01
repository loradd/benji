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
 *   <li>{@link se.mdh.idt.benji.trace.TraceModel#getTraceLinks <em>Trace Links</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.trace.TracePackage#getTraceModel()
 * @model
 * @generated
 */
public interface TraceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.trace.TraceLink}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.trace.TraceLink#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see se.mdh.idt.benji.trace.TracePackage#getTraceModel_TraceLinks()
	 * @see se.mdh.idt.benji.trace.TraceLink#getTraceModel
	 * @model opposite="traceModel" containment="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

} // TraceModel
