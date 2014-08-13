/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing details and characteristics describing a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getVersionInformation <em>Version Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getRelatedOrganizationInformation <em>Related Organization Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getBusinessContext <em>Business Context</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceLevelAgreements <em>Service Level Agreements</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType()
 * @model extendedMetaData="name='ServiceMetadataType' kind='elementOnly'"
 * @generated
 */
public interface ServiceMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A means of uniquely identifying a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Identification</em>' containment reference.
	 * @see #setServiceIdentification(ServiceIdentificationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType_ServiceIdentification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceIdentificationType getServiceIdentification();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceIdentification <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identification</em>' containment reference.
	 * @see #getServiceIdentification()
	 * @generated
	 */
	void setServiceIdentification(ServiceIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of details describing a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description</em>' containment reference.
	 * @see #setServiceDescription(ServiceDescriptionType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType_ServiceDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDescriptionType getServiceDescription();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceDescription <em>Service Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description</em>' containment reference.
	 * @see #getServiceDescription()
	 * @generated
	 */
	void setServiceDescription(ServiceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Version Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured representation of a version for something, such as a service, document, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Information</em>' containment reference.
	 * @see #setVersionInformation(VersionInformationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType_VersionInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VersionInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionInformationType getVersionInformation();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getVersionInformation <em>Version Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Information</em>' containment reference.
	 * @see #getVersionInformation()
	 * @generated
	 */
	void setVersionInformation(VersionInformationType value);

	/**
	 * Returns the value of the '<em><b>Related Organization Information</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of organizations that are somehow related to the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Organization Information</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType_RelatedOrganizationInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelatedOrganizationInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedOrganizationInformationType> getRelatedOrganizationInformation();

	/**
	 * Returns the value of the '<em><b>Business Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of details describing the business context in which the service operates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Context</em>' containment reference.
	 * @see #setBusinessContext(BusinessContextType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType_BusinessContext()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BusinessContext' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessContextType getBusinessContext();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getBusinessContext <em>Business Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Context</em>' containment reference.
	 * @see #getBusinessContext()
	 * @generated
	 */
	void setBusinessContext(BusinessContextType value);

	/**
	 * Returns the value of the '<em><b>Service Interface</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of details relating to the interface of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType_ServiceInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceInterfaceSpecificationType> getServiceInterface();

	/**
	 * Returns the value of the '<em><b>Service Level Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of policies, agreements, licensing and any other goverenace or performance documentation specifying constraints and any other details regarding the realization of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Level Agreements</em>' containment reference.
	 * @see #setServiceLevelAgreements(ServiceLevelAgreementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceMetadataType_ServiceLevelAgreements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceLevelAgreements' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceLevelAgreementsType getServiceLevelAgreements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceLevelAgreements <em>Service Level Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level Agreements</em>' containment reference.
	 * @see #getServiceLevelAgreements()
	 * @generated
	 */
	void setServiceLevelAgreements(ServiceLevelAgreementsType value);

} // ServiceMetadataType
