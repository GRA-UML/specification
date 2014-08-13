/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEPD Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure describing the name and location of an IEPD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.IEPDReferenceType#getIEPDName <em>IEPD Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.IEPDReferenceType#getIEPDURL <em>IEPDURL</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getIEPDReferenceType()
 * @model extendedMetaData="name='IEPDReferenceType' kind='elementOnly'"
 * @generated
 */
public interface IEPDReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>IEPD Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable identification of the IEPD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPD Name</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getIEPDReferenceType_IEPDName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='IEPDName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIEPDName();

	/**
	 * Returns the value of the '<em><b>IEPDURL</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL where the IEPD is posted and available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPDURL</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getIEPDReferenceType_IEPDURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='IEPDURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIEPDURL();

} // IEPDReferenceType
