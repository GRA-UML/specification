/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing an agreement, formal or informal, associated with a service, application or thing, tangible or otherwise.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementDescriptionText <em>Agreement Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementURI <em>Agreement URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getAgreementType()
 * @model extendedMetaData="name='AgreementType' kind='elementOnly'"
 * @generated
 */
public interface AgreementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Agreement Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text description of an agreement, formal or informal, associated with a service, application or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement Description Text</em>' attribute.
	 * @see #setAgreementDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getAgreementType_AgreementDescriptionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AgreementDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAgreementDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementDescriptionText <em>Agreement Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Description Text</em>' attribute.
	 * @see #getAgreementDescriptionText()
	 * @generated
	 */
	void setAgreementDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Agreement URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A locator referencing an agreement, formal or informal, associated with a service, application or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement URI</em>' attribute.
	 * @see #setAgreementURI(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getAgreementType_AgreementURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='AgreementURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAgreementURI();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementURI <em>Agreement URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement URI</em>' attribute.
	 * @see #getAgreementURI()
	 * @generated
	 */
	void setAgreementURI(String value);

} // AgreementType
