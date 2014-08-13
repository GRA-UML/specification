/**
 */
package gov.ojp.it.gsp.services._1._0;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionName <em>Action Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionPurpose <em>Action Purpose</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreement <em>Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementDescriptionText <em>Agreement Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementURI <em>Agreement URI</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAlertsAndNotifications <em>Alerts And Notifications</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableAgreements <em>Applicable Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableContracts <em>Applicable Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicablePolicies <em>Applicable Policies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getBusinessContext <em>Business Context</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCapabilityDescriptionText <em>Capability Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonAddress <em>Contact Person Address</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonEmailID <em>Contact Person Email ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonName <em>Contact Person Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContract <em>Contract</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationCostAmount <em>Creation Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainNameText <em>Domain Name Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorsements <em>Endorsements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypes <em>Exchange Partner Types</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDName <em>IEPD Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReference <em>IEPD Reference</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReferences <em>IEPD References</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDURL <em>IEPDURL</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLicensingAgreement <em>Licensing Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMessageExchangePattern <em>Message Exchange Pattern</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getNextRevisionDate <em>Next Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationAcronym <em>Organization Acronym</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationFullAddressText <em>Organization Full Address Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getPerformanceMetrics <em>Performance Metrics</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getPolicyText <em>Policy Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRealWorldEffectDescriptionText <em>Real World Effect Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRelatedOrganizationInformation <em>Related Organization Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRevisionVersion <em>Revision Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityClassificationText <em>Security Classification Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityDescriptionText <em>Security Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAction <em>Service Action</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceActions <em>Service Actions</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAvailability <em>Service Availability</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAverageThroughput <em>Service Average Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceCapabilities <em>Service Capabilities</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependency <em>Service Dependency</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywords <em>Service Description Keywords</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionText <em>Service Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceFullNameText <em>Service Full Name Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfile <em>Service Interaction Profile</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfiles <em>Service Interaction Profiles</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceLevelAgreements <em>Service Level Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMetadata <em>Service Metadata</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePurposeText <em>Service Purpose Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceRealWorldEffects <em>Service Real World Effects</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceResponseTime <em>Service Response Time</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceUsageDetails <em>Service Usage Details</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPName <em>SIP Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPVersion <em>SIP Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsors <em>Sponsors</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUmbrellaAgreement <em>Umbrella Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIAddress <em>URI Address</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDescription <em>URI Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetail <em>URI Detail</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetails <em>URI Details</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageCostAmount <em>Usage Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getVersionInformation <em>Version Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCurrencyText <em>Currency Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUnitMeasureText <em>Unit Measure Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service action performed within this service interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ActionName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActionName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

	/**
	 * Returns the value of the '<em><b>Action Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the Service Action purpose performed by this service interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Purpose</em>' attribute.
	 * @see #setActionPurpose(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ActionPurpose()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActionPurpose' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActionPurpose();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionPurpose <em>Action Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Purpose</em>' attribute.
	 * @see #getActionPurpose()
	 * @generated
	 */
	void setActionPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date when a service was or will be first available in production. Do NOT confuse with the date you submitted this service to a registry. The format is YYYY-MM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Date</em>' attribute.
	 * @see #setActivationDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ActivationDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActivationDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActivationDate <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Date</em>' attribute.
	 * @see #getActivationDate()
	 * @generated
	 */
	void setActivationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description or reference to an applicable Agreement or MOU governing the use, administration, or implementation of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement</em>' containment reference.
	 * @see #setAgreement(AgreementType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Agreement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Agreement' namespace='##targetNamespace'"
	 * @generated
	 */
	AgreementType getAgreement();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreement <em>Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement</em>' containment reference.
	 * @see #getAgreement()
	 * @generated
	 */
	void setAgreement(AgreementType value);

	/**
	 * Returns the value of the '<em><b>Agreement Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text description of an agreement, formal or informal, associated with a service, application or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement Description Text</em>' attribute.
	 * @see #setAgreementDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_AgreementDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AgreementDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAgreementDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementDescriptionText <em>Agreement Description Text</em>}' attribute.
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
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_AgreementURI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AgreementURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAgreementURI();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementURI <em>Agreement URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement URI</em>' attribute.
	 * @see #getAgreementURI()
	 * @generated
	 */
	void setAgreementURI(String value);

	/**
	 * Returns the value of the '<em><b>Alerts And Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL to sign up for alerts and notifications for a specific service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alerts And Notifications</em>' attribute.
	 * @see #setAlertsAndNotifications(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_AlertsAndNotifications()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AlertsAndNotifications' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlertsAndNotifications();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAlertsAndNotifications <em>Alerts And Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alerts And Notifications</em>' attribute.
	 * @see #getAlertsAndNotifications()
	 * @generated
	 */
	void setAlertsAndNotifications(String value);

	/**
	 * Returns the value of the '<em><b>Applicable Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of applicable Agreements or MOUs governing the use, administration, or implementation of a service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Agreements</em>' containment reference.
	 * @see #setApplicableAgreements(ApplicableAgreementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicableAgreements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicableAgreements' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicableAgreementsType getApplicableAgreements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableAgreements <em>Applicable Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Agreements</em>' containment reference.
	 * @see #getApplicableAgreements()
	 * @generated
	 */
	void setApplicableAgreements(ApplicableAgreementsType value);

	/**
	 * Returns the value of the '<em><b>Applicable Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable agreements or Memoranda Of Understanding (MOUs) relating to the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Agreements Indicator</em>' attribute.
	 * @see #setApplicableAgreementsIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicableAgreementsIndicator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicableAgreementsIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicableAgreementsIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Agreements Indicator</em>' attribute.
	 * @see #isApplicableAgreementsIndicator()
	 * @generated
	 */
	void setApplicableAgreementsIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicable Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of any formal contracts associated with a service, application or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Contracts</em>' containment reference.
	 * @see #setApplicableContracts(ApplicableContractsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicableContracts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicableContracts' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicableContractsType getApplicableContracts();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableContracts <em>Applicable Contracts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Contracts</em>' containment reference.
	 * @see #getApplicableContracts()
	 * @generated
	 */
	void setApplicableContracts(ApplicableContractsType value);

	/**
	 * Returns the value of the '<em><b>Applicable Contracts Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable contracts relating to the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Contracts Indicator</em>' attribute.
	 * @see #setApplicableContractsIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicableContractsIndicator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicableContractsIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicableContractsIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Contracts Indicator</em>' attribute.
	 * @see #isApplicableContractsIndicator()
	 * @generated
	 */
	void setApplicableContractsIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicable Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of all policies that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Policies</em>' containment reference.
	 * @see #setApplicablePolicies(ApplicablePoliciesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicablePolicies()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicablePolicies' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicablePoliciesType getApplicablePolicies();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicablePolicies <em>Applicable Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Policies</em>' containment reference.
	 * @see #getApplicablePolicies()
	 * @generated
	 */
	void setApplicablePolicies(ApplicablePoliciesType value);

	/**
	 * Returns the value of the '<em><b>Applicable Policies Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable policies governing the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Policies Indicator</em>' attribute.
	 * @see #setApplicablePoliciesIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicablePoliciesIndicator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicablePoliciesIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicablePoliciesIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Policies Indicator</em>' attribute.
	 * @see #isApplicablePoliciesIndicator()
	 * @generated
	 */
	void setApplicablePoliciesIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Applicable Umbrella Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of all umbrella agreements that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Umbrella Agreements</em>' containment reference.
	 * @see #setApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicableUmbrellaAgreements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicableUmbrellaAgreements' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicableUmbrellaAgreementsType getApplicableUmbrellaAgreements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Umbrella Agreements</em>' containment reference.
	 * @see #getApplicableUmbrellaAgreements()
	 * @generated
	 */
	void setApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType value);

	/**
	 * Returns the value of the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when there are any applicable umbrella agreements relating to the use, administration, or implementation of a service; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Umbrella Agreements Indicator</em>' attribute.
	 * @see #setApplicableUmbrellaAgreementsIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApplicableUmbrellaAgreementsIndicator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApplicableUmbrellaAgreementsIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApplicableUmbrellaAgreementsIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Umbrella Agreements Indicator</em>' attribute.
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @generated
	 */
	void setApplicableUmbrellaAgreementsIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Approval Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when a permission must first be obtained prior to using a service or performing some action in a business process; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Required Indicator</em>' attribute.
	 * @see #setApprovalRequiredIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ApprovalRequiredIndicator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ApprovalRequiredIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApprovalRequiredIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Required Indicator</em>' attribute.
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 */
	void setApprovalRequiredIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Business Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of details describing the business context in which the service operates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Context</em>' containment reference.
	 * @see #setBusinessContext(BusinessContextType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_BusinessContext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessContext' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessContextType getBusinessContext();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getBusinessContext <em>Business Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Context</em>' containment reference.
	 * @see #getBusinessContext()
	 * @generated
	 */
	void setBusinessContext(BusinessContextType value);

	/**
	 * Returns the value of the '<em><b>Capability Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text format description of the capability provided by a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Description Text</em>' attribute.
	 * @see #setCapabilityDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_CapabilityDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapabilityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCapabilityDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCapabilityDescriptionText <em>Capability Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Description Text</em>' attribute.
	 * @see #getCapabilityDescriptionText()
	 * @generated
	 */
	void setCapabilityDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification defining the relationship between a service and an applicable enterprise architecture and business reference model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Classification()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Classification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(String value);

	/**
	 * Returns the value of the '<em><b>Classifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of classifications defining the relationship between a service and an applicable enterprise architecture and business reference model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifications</em>' containment reference.
	 * @see #setClassifications(ClassificationsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Classifications()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Classifications' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationsType getClassifications();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassifications <em>Classifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifications</em>' containment reference.
	 * @see #getClassifications()
	 * @generated
	 */
	void setClassifications(ClassificationsType value);

	/**
	 * Returns the value of the '<em><b>Contact Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical address of a person in full text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Address</em>' attribute.
	 * @see #setContactPersonAddress(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ContactPersonAddress()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactPersonAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonAddress();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonAddress <em>Contact Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Address</em>' attribute.
	 * @see #getContactPersonAddress()
	 * @generated
	 */
	void setContactPersonAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Email ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Email of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Email ID</em>' attribute.
	 * @see #setContactPersonEmailID(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ContactPersonEmailID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactPersonEmailID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonEmailID();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonEmailID <em>Contact Person Email ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Email ID</em>' attribute.
	 * @see #getContactPersonEmailID()
	 * @generated
	 */
	void setContactPersonEmailID(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a person designated as a point of contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Name</em>' attribute.
	 * @see #setContactPersonName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ContactPersonName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactPersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonName <em>Contact Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Name</em>' attribute.
	 * @see #getContactPersonName()
	 * @generated
	 */
	void setContactPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Phone Number ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A phone number of the person designated as the point of contact for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Person Phone Number ID</em>' attribute.
	 * @see #setContactPersonPhoneNumberID(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ContactPersonPhoneNumberID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactPersonPhoneNumberID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPersonPhoneNumberID();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Phone Number ID</em>' attribute.
	 * @see #getContactPersonPhoneNumberID()
	 * @generated
	 */
	void setContactPersonPhoneNumberID(String value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal contract associated with a service, application, process, tranaction, or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(AgreementType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Contract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contract' namespace='##targetNamespace'"
	 * @generated
	 */
	AgreementType getContract();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(AgreementType value);

	/**
	 * Returns the value of the '<em><b>Creation Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cost create a thing, such as an application or service  This includes the full cost to design, manage, develop, test, implement and maintain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Cost Amount</em>' containment reference.
	 * @see #setCreationCostAmount(AmountType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_CreationCostAmount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreationCostAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	AmountType getCreationCostAmount();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationCostAmount <em>Creation Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Cost Amount</em>' containment reference.
	 * @see #getCreationCostAmount()
	 * @generated
	 */
	void setCreationCostAmount(AmountType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date designation when a service was first created. Do NOT to be confuse with the date a service is submitted to a registry. The format is YYYY-MM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_CreationDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Domain Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A primary domain or line of business (LoB) that a service covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Description</em>' containment reference.
	 * @see #setDomainDescription(DomainDescriptionType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_DomainDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DomainDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainDescriptionType getDomainDescription();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainDescription <em>Domain Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Description</em>' containment reference.
	 * @see #getDomainDescription()
	 * @generated
	 */
	void setDomainDescription(DomainDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Domain Name Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a primary domain or line of business (LoB) that a service covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Name Text</em>' attribute.
	 * @see #setDomainNameText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_DomainNameText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DomainNameText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomainNameText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainNameText <em>Domain Name Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name Text</em>' attribute.
	 * @see #getDomainNameText()
	 * @generated
	 */
	void setDomainNameText(String value);

	/**
	 * Returns the value of the '<em><b>Endorsements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of names and acronyms of professional or governmental organizations or people that endorse this service as an official business exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorsements</em>' containment reference.
	 * @see #setEndorsements(EndorsementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Endorsements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Endorsements' namespace='##targetNamespace'"
	 * @generated
	 */
	EndorsementsType getEndorsements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorsements <em>Endorsements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorsements</em>' containment reference.
	 * @see #getEndorsements()
	 * @generated
	 */
	void setEndorsements(EndorsementsType value);

	/**
	 * Returns the value of the '<em><b>Endorser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of professional or governmental organizations that endorse this service as an official business exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorser</em>' attribute.
	 * @see #setEndorser(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Endorser()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Endorser' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndorser();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorser <em>Endorser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorser</em>' attribute.
	 * @see #getEndorser()
	 * @generated
	 */
	void setEndorser(String value);

	/**
	 * Returns the value of the '<em><b>Exchange Partner Type Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text description for the type/category of organization that would commonly use a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Partner Type Description Text</em>' attribute.
	 * @see #setExchangePartnerTypeDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ExchangePartnerTypeDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExchangePartnerTypeDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExchangePartnerTypeDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Partner Type Description Text</em>' attribute.
	 * @see #getExchangePartnerTypeDescriptionText()
	 * @generated
	 */
	void setExchangePartnerTypeDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Exchange Partner Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of the types/categories of organizations that would commonly use a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Partner Types</em>' containment reference.
	 * @see #setExchangePartnerTypes(ExchangePartnerTypesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ExchangePartnerTypes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExchangePartnerTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExchangePartnerTypesType getExchangePartnerTypes();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypes <em>Exchange Partner Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Partner Types</em>' containment reference.
	 * @see #getExchangePartnerTypes()
	 * @generated
	 */
	void setExchangePartnerTypes(ExchangePartnerTypesType value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year and month (YYYY-MM) this service is expected to be no longer available (if applicable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ExpirationDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpirationDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>IEPD Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable identification of the IEPD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPD Name</em>' attribute.
	 * @see #setIEPDName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_IEPDName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IEPDName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIEPDName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDName <em>IEPD Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEPD Name</em>' attribute.
	 * @see #getIEPDName()
	 * @generated
	 */
	void setIEPDName(String value);

	/**
	 * Returns the value of the '<em><b>IEPD Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set or reference information identifying an Information Exchange Package Document which the service uses in its data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPD Reference</em>' containment reference.
	 * @see #setIEPDReference(IEPDReferenceType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_IEPDReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IEPDReference' namespace='##targetNamespace'"
	 * @generated
	 */
	IEPDReferenceType getIEPDReference();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReference <em>IEPD Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEPD Reference</em>' containment reference.
	 * @see #getIEPDReference()
	 * @generated
	 */
	void setIEPDReference(IEPDReferenceType value);

	/**
	 * Returns the value of the '<em><b>IEPD References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of reference information identifying all Information Exchange Package Documents which the service uses in its data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPD References</em>' containment reference.
	 * @see #setIEPDReferences(IEPDReferencesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_IEPDReferences()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IEPDReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	IEPDReferencesType getIEPDReferences();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReferences <em>IEPD References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEPD References</em>' containment reference.
	 * @see #getIEPDReferences()
	 * @generated
	 */
	void setIEPDReferences(IEPDReferencesType value);

	/**
	 * Returns the value of the '<em><b>IEPDURL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL where the IEPD is posted and available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEPDURL</em>' attribute.
	 * @see #setIEPDURL(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_IEPDURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IEPDURL' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIEPDURL();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDURL <em>IEPDURL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEPDURL</em>' attribute.
	 * @see #getIEPDURL()
	 * @generated
	 */
	void setIEPDURL(String value);

	/**
	 * Returns the value of the '<em><b>Last Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date with the year and month specifying when this service information was last revised. Do NOT confuse with the date the service itself was last revised with generating new service documentation. The format is YYYY-MM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Revision Date</em>' attribute.
	 * @see #setLastRevisionDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_LastRevisionDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LastRevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastRevisionDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLastRevisionDate <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Date</em>' attribute.
	 * @see #getLastRevisionDate()
	 * @generated
	 */
	void setLastRevisionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Licensing Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of licensing for a service or application. Descriptive values could be In House, No License,  Open Source, Purchase License, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensing Agreement</em>' containment reference.
	 * @see #setLicensingAgreement(AgreementType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_LicensingAgreement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LicensingAgreement' namespace='##targetNamespace'"
	 * @generated
	 */
	AgreementType getLicensingAgreement();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLicensingAgreement <em>Licensing Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensing Agreement</em>' containment reference.
	 * @see #getLicensingAgreement()
	 * @generated
	 */
	void setLicensingAgreement(AgreementType value);

	/**
	 * Returns the value of the '<em><b>Licensing Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when a license is required to use a service or application; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensing Required Indicator</em>' attribute.
	 * @see #setLicensingRequiredIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_LicensingRequiredIndicator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LicensingRequiredIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLicensingRequiredIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensing Required Indicator</em>' attribute.
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 */
	void setLicensingRequiredIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A word indicating the current stage of the service within the development lifecycle.  Valid values are; In Design, In Development, Release Candidate, Operational/Production, Deprecated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle Status</em>' attribute.
	 * @see #setLifecycleStatus(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_LifecycleStatus()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LifecycleStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLifecycleStatus();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLifecycleStatus <em>Lifecycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Status</em>' attribute.
	 * @see #getLifecycleStatus()
	 * @generated
	 */
	void setLifecycleStatus(String value);

	/**
	 * Returns the value of the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value identifying the primary version number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Version</em>' attribute.
	 * @see #setMajorVersion(BigInteger)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_MajorVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MajorVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMajorVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version</em>' attribute.
	 * @see #getMajorVersion()
	 * @generated
	 */
	void setMajorVersion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A category of transaction this service is designed and used for: query/response, message, publish/subscribe, document, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Exchange Pattern</em>' attribute.
	 * @see #setMessageExchangePattern(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_MessageExchangePattern()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageExchangePattern' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessageExchangePattern();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMessageExchangePattern <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange Pattern</em>' attribute.
	 * @see #getMessageExchangePattern()
	 * @generated
	 */
	void setMessageExchangePattern(String value);

	/**
	 * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value designating a minor version number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Version</em>' attribute.
	 * @see #setMinorVersion(BigInteger)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_MinorVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MinorVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinorVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version</em>' attribute.
	 * @see #getMinorVersion()
	 * @generated
	 */
	void setMinorVersion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Next Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year and month (YYYY-MM) a service is expected to be revised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Revision Date</em>' attribute.
	 * @see #setNextRevisionDate(XMLGregorianCalendar)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_NextRevisionDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NextRevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getNextRevisionDate();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getNextRevisionDate <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Revision Date</em>' attribute.
	 * @see #getNextRevisionDate()
	 * @generated
	 */
	void setNextRevisionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A body of people grouped together for a common purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Organization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationType getOrganization();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationType value);

	/**
	 * Returns the value of the '<em><b>Organization Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An acronym for the agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Acronym</em>' attribute.
	 * @see #setOrganizationAcronym(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_OrganizationAcronym()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationAcronym' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationAcronym();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationAcronym <em>Organization Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Acronym</em>' attribute.
	 * @see #getOrganizationAcronym()
	 * @generated
	 */
	void setOrganizationAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Organization Full Address Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical address of an agency in full text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Full Address Text</em>' attribute.
	 * @see #setOrganizationFullAddressText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_OrganizationFullAddressText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationFullAddressText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationFullAddressText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationFullAddressText <em>Organization Full Address Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Full Address Text</em>' attribute.
	 * @see #getOrganizationFullAddressText()
	 * @generated
	 */
	void setOrganizationFullAddressText(String value);

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A full name of the agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute.
	 * @see #setOrganizationName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_OrganizationName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationName <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Name</em>' attribute.
	 * @see #getOrganizationName()
	 * @generated
	 */
	void setOrganizationName(String value);

	/**
	 * Returns the value of the '<em><b>Organization Point Of Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person designated as the point of contact for an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Point Of Contact</em>' containment reference.
	 * @see #setOrganizationPointOfContact(PersonContactInformationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_OrganizationPointOfContact()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationPointOfContact' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonContactInformationType getOrganizationPointOfContact();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Point Of Contact</em>' containment reference.
	 * @see #getOrganizationPointOfContact()
	 * @generated
	 */
	void setOrganizationPointOfContact(PersonContactInformationType value);

	/**
	 * Returns the value of the '<em><b>Organization Role Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organizations role defined in free form text. Examples could be creator, provider, owner, maintainer, authorities source, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Role Description Text</em>' attribute.
	 * @see #setOrganizationRoleDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_OrganizationRoleDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationRoleDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationRoleDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Role Description Text</em>' attribute.
	 * @see #getOrganizationRoleDescriptionText()
	 * @generated
	 */
	void setOrganizationRoleDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Organization Role Detailed Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A very detailed textual explanation of the role and responsibilities of an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Role Detailed Description Text</em>' attribute.
	 * @see #setOrganizationRoleDetailedDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_OrganizationRoleDetailedDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationRoleDetailedDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationRoleDetailedDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Role Detailed Description Text</em>' attribute.
	 * @see #getOrganizationRoleDetailedDescriptionText()
	 * @generated
	 */
	void setOrganizationRoleDetailedDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Organization Web Site URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internet address of the agency's web site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Web Site URL</em>' attribute.
	 * @see #setOrganizationWebSiteURL(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_OrganizationWebSiteURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationWebSiteURL' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationWebSiteURL();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Web Site URL</em>' attribute.
	 * @see #getOrganizationWebSiteURL()
	 * @generated
	 */
	void setOrganizationWebSiteURL(String value);

	/**
	 * Returns the value of the '<em><b>Performance Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of performance amd quality of service (QoS) characteristics that a service is either expected or required to meet once implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performance Metrics</em>' containment reference.
	 * @see #setPerformanceMetrics(PerformanceMetricsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_PerformanceMetrics()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PerformanceMetrics' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceMetricsType getPerformanceMetrics();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getPerformanceMetrics <em>Performance Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Metrics</em>' containment reference.
	 * @see #getPerformanceMetrics()
	 * @generated
	 */
	void setPerformanceMetrics(PerformanceMetricsType value);

	/**
	 * Returns the value of the '<em><b>Policy Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a policy document that in some way, constrains, governs, or controls the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Text</em>' attribute.
	 * @see #setPolicyText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_PolicyText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPolicyText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getPolicyText <em>Policy Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Text</em>' attribute.
	 * @see #getPolicyText()
	 * @generated
	 */
	void setPolicyText(String value);

	/**
	 * Returns the value of the '<em><b>Real World Effect Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text description of a real world effect provided by a Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real World Effect Description Text</em>' attribute.
	 * @see #setRealWorldEffectDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_RealWorldEffectDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RealWorldEffectDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRealWorldEffectDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRealWorldEffectDescriptionText <em>Real World Effect Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real World Effect Description Text</em>' attribute.
	 * @see #getRealWorldEffectDescriptionText()
	 * @generated
	 */
	void setRealWorldEffectDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Related Organization Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of organizations that are somehow related to the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Organization Information</em>' containment reference.
	 * @see #setRelatedOrganizationInformation(RelatedOrganizationInformationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_RelatedOrganizationInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelatedOrganizationInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedOrganizationInformationType getRelatedOrganizationInformation();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRelatedOrganizationInformation <em>Related Organization Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Organization Information</em>' containment reference.
	 * @see #getRelatedOrganizationInformation()
	 * @generated
	 */
	void setRelatedOrganizationInformation(RelatedOrganizationInformationType value);

	/**
	 * Returns the value of the '<em><b>Revision Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value designating a minor version revision number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Version</em>' attribute.
	 * @see #setRevisionVersion(BigInteger)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_RevisionVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RevisionVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRevisionVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRevisionVersion <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Version</em>' attribute.
	 * @see #getRevisionVersion()
	 * @generated
	 */
	void setRevisionVersion(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Security Classification Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any applicable classification of the security level of the information exchanged by the service, such as SBU, Secret, etc. If there is no strict classification this field can contain a brief statement regarding the security of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Classification Text</em>' attribute.
	 * @see #setSecurityClassificationText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_SecurityClassificationText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecurityClassificationText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityClassificationText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityClassificationText <em>Security Classification Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Classification Text</em>' attribute.
	 * @see #getSecurityClassificationText()
	 * @generated
	 */
	void setSecurityClassificationText(String value);

	/**
	 * Returns the value of the '<em><b>Security Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text description that identifies the security which was implemented to protect this service interface (GFIPM, Trusted Broker, etc)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Description Text</em>' attribute.
	 * @see #setSecurityDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_SecurityDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecurityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityDescriptionText <em>Security Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Description Text</em>' attribute.
	 * @see #getSecurityDescriptionText()
	 * @generated
	 */
	void setSecurityDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Security Implemented Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when security has been implemented to access this service.False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Implemented Indicator</em>' attribute.
	 * @see #setSecurityImplementedIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_SecurityImplementedIndicator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecurityImplementedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSecurityImplementedIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Implemented Indicator</em>' attribute.
	 * @see #isSecurityImplementedIndicator()
	 * @generated
	 */
	void setSecurityImplementedIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complex element containing Actions information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Action</em>' containment reference.
	 * @see #setServiceAction(ServiceActionType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceAction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceAction' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceActionType getServiceAction();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAction <em>Service Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Action</em>' containment reference.
	 * @see #getServiceAction()
	 * @generated
	 */
	void setServiceAction(ServiceActionType value);

	/**
	 * Returns the value of the '<em><b>Service Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of service actions related to a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Actions</em>' containment reference.
	 * @see #setServiceActions(ServiceActionsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceActions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceActions' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceActionsType getServiceActions();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceActions <em>Service Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Actions</em>' containment reference.
	 * @see #getServiceActions()
	 * @generated
	 */
	void setServiceActions(ServiceActionsType value);

	/**
	 * Returns the value of the '<em><b>Service Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description or measurement of the expected availbility that a service is usable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Availability</em>' attribute.
	 * @see #setServiceAvailability(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceAvailability()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceAvailability();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAvailability <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Availability</em>' attribute.
	 * @see #getServiceAvailability()
	 * @generated
	 */
	void setServiceAvailability(String value);

	/**
	 * Returns the value of the '<em><b>Service Average Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of how often a service is expected to be, or actually used, averaged over a period of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Average Throughput</em>' attribute.
	 * @see #setServiceAverageThroughput(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceAverageThroughput()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceAverageThroughput' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceAverageThroughput();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAverageThroughput <em>Service Average Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Average Throughput</em>' attribute.
	 * @see #getServiceAverageThroughput()
	 * @generated
	 */
	void setServiceAverageThroughput(String value);

	/**
	 * Returns the value of the '<em><b>Service Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration of the capabilities provided by a service. The capabilities will be described in a free text format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Capabilities</em>' containment reference.
	 * @see #setServiceCapabilities(ServiceCapabilitiesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCapabilitiesType getServiceCapabilities();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceCapabilities <em>Service Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Capabilities</em>' containment reference.
	 * @see #getServiceCapabilities()
	 * @generated
	 */
	void setServiceCapabilities(ServiceCapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of all services upon which a service directly depends to deliver its real world effects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' containment reference.
	 * @see #setServiceDependencies(ServiceDependenciesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceDependencies()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDependenciesType getServiceDependencies();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependencies <em>Service Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Dependencies</em>' containment reference.
	 * @see #getServiceDependencies()
	 * @generated
	 */
	void setServiceDependencies(ServiceDependenciesType value);

	/**
	 * Returns the value of the '<em><b>Service Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific service upon which a service directly depends to deliver its real world effects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Dependency</em>' containment reference.
	 * @see #setServiceDependency(ServiceIdentificationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceDependency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDependency' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceIdentificationType getServiceDependency();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependency <em>Service Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Dependency</em>' containment reference.
	 * @see #getServiceDependency()
	 * @generated
	 */
	void setServiceDependency(ServiceIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of details describing a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description</em>' containment reference.
	 * @see #setServiceDescription(ServiceDescriptionType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDescriptionType getServiceDescription();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescription <em>Service Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description</em>' containment reference.
	 * @see #getServiceDescription()
	 * @generated
	 */
	void setServiceDescription(ServiceDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Service Description Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of search terms that would not otherwise be in other metadata attributes (e.g., Child Support Warrant, Domestic Relations Warrant, Domestics).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Keywords</em>' containment reference.
	 * @see #setServiceDescriptionKeywords(ServiceDescriptionKeywordsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceDescriptionKeywords()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDescriptionKeywords' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDescriptionKeywordsType getServiceDescriptionKeywords();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywords <em>Service Description Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Keywords</em>' containment reference.
	 * @see #getServiceDescriptionKeywords()
	 * @generated
	 */
	void setServiceDescriptionKeywords(ServiceDescriptionKeywordsType value);

	/**
	 * Returns the value of the '<em><b>Service Description Keyword Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A search term that would not otherwise be in other metadata attributes (e.g., Child Support Warrant, Domestic Relations Warrant, Domestics).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Keyword Text</em>' attribute.
	 * @see #setServiceDescriptionKeywordText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceDescriptionKeywordText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDescriptionKeywordText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceDescriptionKeywordText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Keyword Text</em>' attribute.
	 * @see #getServiceDescriptionKeywordText()
	 * @generated
	 */
	void setServiceDescriptionKeywordText(String value);

	/**
	 * Returns the value of the '<em><b>Service Description Summary Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief summary of this service for short display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Summary Text</em>' attribute.
	 * @see #setServiceDescriptionSummaryText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceDescriptionSummaryText()
	 * @model unique="false" dataType="gov.ojp.it.gsp.services._1._0.SummaryTextType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDescriptionSummaryText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceDescriptionSummaryText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Summary Text</em>' attribute.
	 * @see #getServiceDescriptionSummaryText()
	 * @generated
	 */
	void setServiceDescriptionSummaryText(String value);

	/**
	 * Returns the value of the '<em><b>Service Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable narrative description of this service—may contain as much detail as you think useful to those with a potential interest in this service and its business usage/application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Description Text</em>' attribute.
	 * @see #setServiceDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionText <em>Service Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Description Text</em>' attribute.
	 * @see #getServiceDescriptionText()
	 * @generated
	 */
	void setServiceDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Service Full Name Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable identification of the service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Full Name Text</em>' attribute.
	 * @see #setServiceFullNameText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceFullNameText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceFullNameText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceFullNameText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceFullNameText <em>Service Full Name Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Full Name Text</em>' attribute.
	 * @see #getServiceFullNameText()
	 * @generated
	 */
	void setServiceFullNameText(String value);

	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of the service in a service registry and/or repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute.
	 * @see #setServiceID(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceID();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceID <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID</em>' attribute.
	 * @see #getServiceID()
	 * @generated
	 */
	void setServiceID(String value);

	/**
	 * Returns the value of the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A means of uniquely identifying a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Identification</em>' containment reference.
	 * @see #setServiceIdentification(ServiceIdentificationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceIdentification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceIdentificationType getServiceIdentification();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceIdentification <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identification</em>' containment reference.
	 * @see #getServiceIdentification()
	 * @generated
	 */
	void setServiceIdentification(ServiceIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Service Interaction Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of information about the Service Interaction Profile Implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interaction Profile</em>' containment reference.
	 * @see #setServiceInteractionProfile(ServiceInteractionProfileType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceInteractionProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceInteractionProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceInteractionProfileType getServiceInteractionProfile();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfile <em>Service Interaction Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interaction Profile</em>' containment reference.
	 * @see #getServiceInteractionProfile()
	 * @generated
	 */
	void setServiceInteractionProfile(ServiceInteractionProfileType value);

	/**
	 * Returns the value of the '<em><b>Service Interaction Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of sets of details about the Service Interaction Profile Implemented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interaction Profiles</em>' containment reference.
	 * @see #setServiceInteractionProfiles(ServiceInteractionProfilesType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceInteractionProfiles()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceInteractionProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceInteractionProfilesType getServiceInteractionProfiles();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfiles <em>Service Interaction Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interaction Profiles</em>' containment reference.
	 * @see #getServiceInteractionProfiles()
	 * @generated
	 */
	void setServiceInteractionProfiles(ServiceInteractionProfilesType value);

	/**
	 * Returns the value of the '<em><b>Service Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of details relating to the interface of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface</em>' containment reference.
	 * @see #setServiceInterface(ServiceInterfaceSpecificationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceInterface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceInterfaceSpecificationType getServiceInterface();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInterface <em>Service Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interface</em>' containment reference.
	 * @see #getServiceInterface()
	 * @generated
	 */
	void setServiceInterface(ServiceInterfaceSpecificationType value);

	/**
	 * Returns the value of the '<em><b>Service Level Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of policies, agreements, licensing and any other goverenace or performance documentation specifying constraints and any other details regarding the realization of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Level Agreements</em>' containment reference.
	 * @see #setServiceLevelAgreements(ServiceLevelAgreementsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceLevelAgreements()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceLevelAgreements' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceLevelAgreementsType getServiceLevelAgreements();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceLevelAgreements <em>Service Level Agreements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level Agreements</em>' containment reference.
	 * @see #getServiceLevelAgreements()
	 * @generated
	 */
	void setServiceLevelAgreements(ServiceLevelAgreementsType value);

	/**
	 * Returns the value of the '<em><b>Service Maximum Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the limit of how often a service is able to be accessed or used at, over a period of time during peak capacity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Maximum Throughput</em>' attribute.
	 * @see #setServiceMaximumThroughput(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceMaximumThroughput()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceMaximumThroughput' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceMaximumThroughput();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Maximum Throughput</em>' attribute.
	 * @see #getServiceMaximumThroughput()
	 * @generated
	 */
	void setServiceMaximumThroughput(String value);

	/**
	 * Returns the value of the '<em><b>Service Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of details and characteristics describing a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Metadata</em>' containment reference.
	 * @see #setServiceMetadata(ServiceMetadataType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceMetadataType getServiceMetadata();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMetadata <em>Service Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Metadata</em>' containment reference.
	 * @see #getServiceMetadata()
	 * @generated
	 */
	void setServiceMetadata(ServiceMetadataType value);

	/**
	 * Returns the value of the '<em><b>Service Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable abbreviation of the Service Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name Abbreviation Text</em>' attribute.
	 * @see #setServiceNameAbbreviationText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceNameAbbreviationText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceNameAbbreviationText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceNameAbbreviationText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name Abbreviation Text</em>' attribute.
	 * @see #getServiceNameAbbreviationText()
	 * @generated
	 */
	void setServiceNameAbbreviationText(String value);

	/**
	 * Returns the value of the '<em><b>Service Policy And Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of policies and other agreement documentation specifying constraints and any other details regarding the realization of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Policy And Contracts</em>' containment reference.
	 * @see #setServicePolicyAndContracts(ServicePolicyAndContractsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServicePolicyAndContracts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServicePolicyAndContracts' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicePolicyAndContractsType getServicePolicyAndContracts();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Policy And Contracts</em>' containment reference.
	 * @see #getServicePolicyAndContracts()
	 * @generated
	 */
	void setServicePolicyAndContracts(ServicePolicyAndContractsType value);

	/**
	 * Returns the value of the '<em><b>Service Purpose Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A purpose which the service intends or resolves, to perform or accomplish.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Purpose Text</em>' attribute.
	 * @see #setServicePurposeText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServicePurposeText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServicePurposeText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServicePurposeText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePurposeText <em>Service Purpose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Purpose Text</em>' attribute.
	 * @see #getServicePurposeText()
	 * @generated
	 */
	void setServicePurposeText(String value);

	/**
	 * Returns the value of the '<em><b>Service Real World Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of the Real World Effects Provided by the Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Real World Effects</em>' containment reference.
	 * @see #setServiceRealWorldEffects(ServiceRealWorldEffectsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceRealWorldEffects()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceRealWorldEffects' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceRealWorldEffectsType getServiceRealWorldEffects();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceRealWorldEffects <em>Service Real World Effects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Real World Effects</em>' containment reference.
	 * @see #getServiceRealWorldEffects()
	 * @generated
	 */
	void setServiceRealWorldEffects(ServiceRealWorldEffectsType value);

	/**
	 * Returns the value of the '<em><b>Service Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the average response time for a service.  The response time is calculated as the time input is provided to the service until the service completes its process or provides output for the consumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Response Time</em>' attribute.
	 * @see #setServiceResponseTime(Duration)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceResponseTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceResponseTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getServiceResponseTime();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceResponseTime <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Response Time</em>' attribute.
	 * @see #getServiceResponseTime()
	 * @generated
	 */
	void setServiceResponseTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Service Scope Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of the scope of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Scope Description Text</em>' attribute.
	 * @see #setServiceScopeDescriptionText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceScopeDescriptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceScopeDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceScopeDescriptionText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Scope Description Text</em>' attribute.
	 * @see #getServiceScopeDescriptionText()
	 * @generated
	 */
	void setServiceScopeDescriptionText(String value);

	/**
	 * Returns the value of the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fully qualified locator of the service interface potentially including version and environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service URI</em>' attribute.
	 * @see #setServiceURI(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceURI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceURI();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceURI <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URI</em>' attribute.
	 * @see #getServiceURI()
	 * @generated
	 */
	void setServiceURI(String value);

	/**
	 * Returns the value of the '<em><b>Service Usage Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of  licensing and any other usage goverenace constraints regarding the realization of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Usage Details</em>' containment reference.
	 * @see #setServiceUsageDetails(ServiceUsageType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_ServiceUsageDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceUsageDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceUsageType getServiceUsageDetails();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceUsageDetails <em>Service Usage Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Usage Details</em>' containment reference.
	 * @see #getServiceUsageDetails()
	 * @generated
	 */
	void setServiceUsageDetails(ServiceUsageType value);

	/**
	 * Returns the value of the '<em><b>SIP Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the Service Interaction Profile Implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SIP Name</em>' attribute.
	 * @see #setSIPName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_SIPName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SIPName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSIPName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPName <em>SIP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIP Name</em>' attribute.
	 * @see #getSIPName()
	 * @generated
	 */
	void setSIPName(String value);

	/**
	 * Returns the value of the '<em><b>SIP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A version of the Service Interaction Profile Implemented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SIP Version</em>' attribute.
	 * @see #setSIPVersion(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_SIPVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SIPVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSIPVersion();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPVersion <em>SIP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIP Version</em>' attribute.
	 * @see #getSIPVersion()
	 * @generated
	 */
	void setSIPVersion(String value);

	/**
	 * Returns the value of the '<em><b>Sponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of professional or governmental organization(s) or person that sponsored, contributed, or participated in the development of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sponsor</em>' attribute.
	 * @see #setSponsor(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Sponsor()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSponsor();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsor <em>Sponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sponsor</em>' attribute.
	 * @see #getSponsor()
	 * @generated
	 */
	void setSponsor(String value);

	/**
	 * Returns the value of the '<em><b>Sponsors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of professional or governmental organization(s) or person that sponsored, contributed, or participated in the development of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sponsors</em>' containment reference.
	 * @see #setSponsors(SponsorsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_Sponsors()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sponsors' namespace='##targetNamespace'"
	 * @generated
	 */
	SponsorsType getSponsors();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsors <em>Sponsors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sponsors</em>' containment reference.
	 * @see #getSponsors()
	 * @generated
	 */
	void setSponsors(SponsorsType value);

	/**
	 * Returns the value of the '<em><b>Umbrella Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An umbrella agreement that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Umbrella Agreement</em>' containment reference.
	 * @see #setUmbrellaAgreement(AgreementType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_UmbrellaAgreement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UmbrellaAgreement' namespace='##targetNamespace'"
	 * @generated
	 */
	AgreementType getUmbrellaAgreement();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUmbrellaAgreement <em>Umbrella Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umbrella Agreement</em>' containment reference.
	 * @see #getUmbrellaAgreement()
	 * @generated
	 */
	void setUmbrellaAgreement(AgreementType value);

	/**
	 * Returns the value of the '<em><b>URI Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fully qualified locator of the service interface potentially including version and environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Address</em>' attribute.
	 * @see #setURIAddress(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_URIAddress()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='URIAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getURIAddress();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIAddress <em>URI Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Address</em>' attribute.
	 * @see #getURIAddress()
	 * @generated
	 */
	void setURIAddress(String value);

	/**
	 * Returns the value of the '<em><b>URI Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the URI. This would provide better understanding of what is actually at the URI address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Description</em>' attribute.
	 * @see #setURIDescription(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_URIDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='URIDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getURIDescription();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDescription <em>URI Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Description</em>' attribute.
	 * @see #getURIDescription()
	 * @generated
	 */
	void setURIDescription(String value);

	/**
	 * Returns the value of the '<em><b>URI Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection containing URIs information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Detail</em>' containment reference.
	 * @see #setURIDetail(URIDetailType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_URIDetail()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='URIDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	URIDetailType getURIDetail();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetail <em>URI Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Detail</em>' containment reference.
	 * @see #getURIDetail()
	 * @generated
	 */
	void setURIDetail(URIDetailType value);

	/**
	 * Returns the value of the '<em><b>URI Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection URI details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI Details</em>' containment reference.
	 * @see #setURIDetails(URIDetailsType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_URIDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='URIDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	URIDetailsType getURIDetails();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetails <em>URI Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Details</em>' containment reference.
	 * @see #getURIDetails()
	 * @generated
	 */
	void setURIDetails(URIDetailsType value);

	/**
	 * Returns the value of the '<em><b>Usage Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total cost to use something, such as a service, etc. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Cost Amount</em>' containment reference.
	 * @see #setUsageCostAmount(AmountType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_UsageCostAmount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UsageCostAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	AmountType getUsageCostAmount();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageCostAmount <em>Usage Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Cost Amount</em>' containment reference.
	 * @see #getUsageCostAmount()
	 * @generated
	 */
	void setUsageCostAmount(AmountType value);

	/**
	 * Returns the value of the '<em><b>Usage Unit Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cost associated with a service(e.g. transaction, unlimited transactions, minutes of use).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Unit Cost Amount</em>' containment reference.
	 * @see #setUsageUnitCostAmount(AmountType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_UsageUnitCostAmount()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UsageUnitCostAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	AmountType getUsageUnitCostAmount();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Unit Cost Amount</em>' containment reference.
	 * @see #getUsageUnitCostAmount()
	 * @generated
	 */
	void setUsageUnitCostAmount(AmountType value);

	/**
	 * Returns the value of the '<em><b>Version Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured representation of a version for something, such as a service, document, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Information</em>' containment reference.
	 * @see #setVersionInformation(VersionInformationType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_VersionInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VersionInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionInformationType getVersionInformation();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getVersionInformation <em>Version Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Information</em>' containment reference.
	 * @see #getVersionInformation()
	 * @generated
	 */
	void setVersionInformation(VersionInformationType value);

	/**
	 * Returns the value of the '<em><b>Currency Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit of money or exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency Text</em>' attribute.
	 * @see #setCurrencyText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_CurrencyText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='currencyText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCurrencyText <em>Currency Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Text</em>' attribute.
	 * @see #getCurrencyText()
	 * @generated
	 */
	void setCurrencyText(String value);

	/**
	 * Returns the value of the '<em><b>Unit Measure Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit of measure in time or quanta.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Measure Text</em>' attribute.
	 * @see #setUnitMeasureText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getDocumentRoot_UnitMeasureText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unitMeasureText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitMeasureText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUnitMeasureText <em>Unit Measure Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Measure Text</em>' attribute.
	 * @see #getUnitMeasureText()
	 * @generated
	 */
	void setUnitMeasureText(String value);

} // DocumentRoot
