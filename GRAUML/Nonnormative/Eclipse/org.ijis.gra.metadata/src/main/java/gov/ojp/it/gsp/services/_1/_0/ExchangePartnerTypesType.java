/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Partner Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getExchangePartnerTypesType()
 * @model extendedMetaData="name='ExchangePartnerTypes_._type' kind='elementOnly'"
 * @generated
 */
public interface ExchangePartnerTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exchange Partner Type Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text description for the type/category of organization that would commonly use a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Partner Type Description Text</em>' attribute.
	 * @see #setExchangePartnerTypeDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getExchangePartnerTypesType_ExchangePartnerTypeDescriptionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ExchangePartnerTypeDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExchangePartnerTypeDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Partner Type Description Text</em>' attribute.
	 * @see #getExchangePartnerTypeDescriptionText()
	 * @generated
	 */
	void setExchangePartnerTypeDescriptionText(String value);

} // ExchangePartnerTypesType
