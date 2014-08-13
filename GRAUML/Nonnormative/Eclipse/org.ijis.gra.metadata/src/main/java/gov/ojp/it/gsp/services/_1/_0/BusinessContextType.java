/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing the collection of details describing the business context in which the service operates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getExchangePartnerTypes <em>Exchange Partner Types</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getEndorsements <em>Endorsements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getSponsors <em>Sponsors</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getBusinessContextType()
 * @model extendedMetaData="name='BusinessContextType' kind='elementOnly'"
 * @generated
 */
public interface BusinessContextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A primary domain or line of business (LoB) that a service covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Description</em>' containment reference.
	 * @see #setDomainDescription(DomainDescriptionType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getBusinessContextType_DomainDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DomainDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainDescriptionType getDomainDescription();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getDomainDescription <em>Domain Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Description</em>' containment reference.
	 * @see #getDomainDescription()
	 * @generated
	 */
	void setDomainDescription(DomainDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Classifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of classifications defining the relationship between a service and an applicable enterprise architecture and business reference model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifications</em>' containment reference.
	 * @see #setClassifications(ClassificationsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getBusinessContextType_Classifications()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Classifications' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationsType getClassifications();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getClassifications <em>Classifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifications</em>' containment reference.
	 * @see #getClassifications()
	 * @generated
	 */
	void setClassifications(ClassificationsType value);

	/**
	 * Returns the value of the '<em><b>Exchange Partner Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of the types/categories of organizations that would commonly use a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Partner Types</em>' containment reference.
	 * @see #setExchangePartnerTypes(ExchangePartnerTypesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getBusinessContextType_ExchangePartnerTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExchangePartnerTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExchangePartnerTypesType getExchangePartnerTypes();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getExchangePartnerTypes <em>Exchange Partner Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Partner Types</em>' containment reference.
	 * @see #getExchangePartnerTypes()
	 * @generated
	 */
	void setExchangePartnerTypes(ExchangePartnerTypesType value);

	/**
	 * Returns the value of the '<em><b>Endorsements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of names and acronyms of professional or governmental organizations or people that endorse this service as an official business exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorsements</em>' containment reference.
	 * @see #setEndorsements(EndorsementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getBusinessContextType_Endorsements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Endorsements' namespace='##targetNamespace'"
	 * @generated
	 */
	EndorsementsType getEndorsements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getEndorsements <em>Endorsements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorsements</em>' containment reference.
	 * @see #getEndorsements()
	 * @generated
	 */
	void setEndorsements(EndorsementsType value);

	/**
	 * Returns the value of the '<em><b>Sponsors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of professional or governmental organization(s) or person that sponsored, contributed, or participated in the development of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sponsors</em>' containment reference.
	 * @see #setSponsors(SponsorsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getBusinessContextType_Sponsors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sponsors' namespace='##targetNamespace'"
	 * @generated
	 */
	SponsorsType getSponsors();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getSponsors <em>Sponsors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sponsors</em>' containment reference.
	 * @see #getSponsors()
	 * @generated
	 */
	void setSponsors(SponsorsType value);

} // BusinessContextType
