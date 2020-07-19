/**
 */
package se.mdh.idt.benji.examples.metamodels.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Class#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Class#getSuper <em>Super</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Class#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(Boolean)
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getClass_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAbstract();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.metamodels.ecore.Class#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.metamodels.ecore.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference list.
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getClass_Super()
	 * @model
	 * @generated
	 */
	EList<Class> getSuper();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.metamodels.ecore.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.metamodels.ecore.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getClass_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

} // Class
