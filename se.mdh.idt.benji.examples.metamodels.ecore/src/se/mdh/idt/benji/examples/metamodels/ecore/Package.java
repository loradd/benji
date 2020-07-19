/**
 */
package se.mdh.idt.benji.examples.metamodels.ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Package#getUri <em>Uri</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.metamodels.ecore.Package#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getPackage_Uri()
	 * @model unique="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.metamodels.ecore.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.metamodels.ecore.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.metamodels.ecore.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<se.mdh.idt.benji.examples.metamodels.ecore.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage#getPackage_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDataType> getDataTypes();

} // Package
