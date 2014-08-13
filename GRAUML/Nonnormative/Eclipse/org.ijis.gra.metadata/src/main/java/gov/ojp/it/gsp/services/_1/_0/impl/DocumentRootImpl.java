/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.AgreementType;
import gov.ojp.it.gsp.services._1._0.AmountType;
import gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType;
import gov.ojp.it.gsp.services._1._0.ApplicableContractsType;
import gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType;
import gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType;
import gov.ojp.it.gsp.services._1._0.BusinessContextType;
import gov.ojp.it.gsp.services._1._0.ClassificationsType;
import gov.ojp.it.gsp.services._1._0.DocumentRoot;
import gov.ojp.it.gsp.services._1._0.DomainDescriptionType;
import gov.ojp.it.gsp.services._1._0.EndorsementsType;
import gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType;
import gov.ojp.it.gsp.services._1._0.IEPDReferenceType;
import gov.ojp.it.gsp.services._1._0.IEPDReferencesType;
import gov.ojp.it.gsp.services._1._0.OrganizationType;
import gov.ojp.it.gsp.services._1._0.PerformanceMetricsType;
import gov.ojp.it.gsp.services._1._0.PersonContactInformationType;
import gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType;
import gov.ojp.it.gsp.services._1._0.ServiceActionType;
import gov.ojp.it.gsp.services._1._0.ServiceActionsType;
import gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType;
import gov.ojp.it.gsp.services._1._0.ServiceDependenciesType;
import gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType;
import gov.ojp.it.gsp.services._1._0.ServiceDescriptionType;
import gov.ojp.it.gsp.services._1._0.ServiceIdentificationType;
import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType;
import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType;
import gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType;
import gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType;
import gov.ojp.it.gsp.services._1._0.ServiceMetadataType;
import gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType;
import gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType;
import gov.ojp.it.gsp.services._1._0.ServiceUsageType;
import gov.ojp.it.gsp.services._1._0.SponsorsType;
import gov.ojp.it.gsp.services._1._0.URIDetailType;
import gov.ojp.it.gsp.services._1._0.URIDetailsType;
import gov.ojp.it.gsp.services._1._0.VersionInformationType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getActionName <em>Action Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getActionPurpose <em>Action Purpose</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getAgreement <em>Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getAgreementDescriptionText <em>Agreement Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getAgreementURI <em>Agreement URI</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getAlertsAndNotifications <em>Alerts And Notifications</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getApplicableAgreements <em>Applicable Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getApplicableContracts <em>Applicable Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getApplicablePolicies <em>Applicable Policies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getBusinessContext <em>Business Context</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getCapabilityDescriptionText <em>Capability Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getContactPersonAddress <em>Contact Person Address</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getContactPersonEmailID <em>Contact Person Email ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getContactPersonName <em>Contact Person Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getCreationCostAmount <em>Creation Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getDomainNameText <em>Domain Name Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getEndorsements <em>Endorsements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getExchangePartnerTypes <em>Exchange Partner Types</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getIEPDName <em>IEPD Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getIEPDReference <em>IEPD Reference</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getIEPDReferences <em>IEPD References</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getIEPDURL <em>IEPDURL</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getLicensingAgreement <em>Licensing Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getMessageExchangePattern <em>Message Exchange Pattern</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getNextRevisionDate <em>Next Revision Date</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganizationAcronym <em>Organization Acronym</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganizationFullAddressText <em>Organization Full Address Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getPerformanceMetrics <em>Performance Metrics</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getPolicyText <em>Policy Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getRealWorldEffectDescriptionText <em>Real World Effect Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getRelatedOrganizationInformation <em>Related Organization Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getRevisionVersion <em>Revision Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getSecurityClassificationText <em>Security Classification Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getSecurityDescriptionText <em>Security Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceAction <em>Service Action</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceActions <em>Service Actions</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceAvailability <em>Service Availability</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceAverageThroughput <em>Service Average Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceCapabilities <em>Service Capabilities</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceDependency <em>Service Dependency</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceDescription <em>Service Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceDescriptionKeywords <em>Service Description Keywords</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceDescriptionText <em>Service Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceFullNameText <em>Service Full Name Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceInteractionProfile <em>Service Interaction Profile</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceInteractionProfiles <em>Service Interaction Profiles</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceLevelAgreements <em>Service Level Agreements</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceMetadata <em>Service Metadata</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServicePurposeText <em>Service Purpose Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceRealWorldEffects <em>Service Real World Effects</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceResponseTime <em>Service Response Time</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getServiceUsageDetails <em>Service Usage Details</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getSIPName <em>SIP Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getSIPVersion <em>SIP Version</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getSponsors <em>Sponsors</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getUmbrellaAgreement <em>Umbrella Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getURIAddress <em>URI Address</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getURIDescription <em>URI Description</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getURIDetail <em>URI Detail</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getURIDetails <em>URI Details</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getUsageCostAmount <em>Usage Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getVersionInformation <em>Version Information</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getCurrencyText <em>Currency Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl#getUnitMeasureText <em>Unit Measure Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActionPurpose() <em>Action Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_PURPOSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActivationDate() <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTIVATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAgreementDescriptionText() <em>Agreement Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAgreementURI() <em>Agreement URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementURI()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlertsAndNotifications() <em>Alerts And Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsAndNotifications()
	 * @generated
	 * @ordered
	 */
	protected static final String ALERTS_AND_NOTIFICATIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isApplicableAgreementsIndicator() <em>Applicable Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableAgreementsIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isApplicableContractsIndicator() <em>Applicable Contracts Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableContractsIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isApplicablePoliciesIndicator() <em>Applicable Policies Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicablePoliciesIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_POLICIES_INDICATOR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isApplicableUmbrellaAgreementsIndicator() <em>Applicable Umbrella Agreements Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableUmbrellaAgreementsIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isApprovalRequiredIndicator() <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPROVAL_REQUIRED_INDICATOR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCapabilityDescriptionText() <em>Capability Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITY_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactPersonAddress() <em>Contact Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactPersonEmailID() <em>Contact Person Email ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonEmailID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_EMAIL_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactPersonName() <em>Contact Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactPersonPhoneNumberID() <em>Contact Person Phone Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonPhoneNumberID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDomainNameText() <em>Domain Name Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameText()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndorser() <em>Endorser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorser()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDORSER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExchangePartnerTypeDescriptionText() <em>Exchange Partner Type Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePartnerTypeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIEPDName() <em>IEPD Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEPDName()
	 * @generated
	 * @ordered
	 */
	protected static final String IEPD_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIEPDURL() <em>IEPDURL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEPDURL()
	 * @generated
	 * @ordered
	 */
	protected static final String IEPDURL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastRevisionDate() <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_REVISION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isLicensingRequiredIndicator() <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LICENSING_REQUIRED_INDICATOR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getLifecycleStatus() <em>Lifecycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String LIFECYCLE_STATUS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAJOR_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMessageExchangePattern() <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EXCHANGE_PATTERN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINOR_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNextRevisionDate() <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar NEXT_REVISION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganizationAcronym() <em>Organization Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_ACRONYM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganizationFullAddressText() <em>Organization Full Address Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationFullAddressText()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganizationRoleDescriptionText() <em>Organization Role Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRoleDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganizationRoleDetailedDescriptionText() <em>Organization Role Detailed Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRoleDetailedDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganizationWebSiteURL() <em>Organization Web Site URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationWebSiteURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_WEB_SITE_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPolicyText() <em>Policy Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyText()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRealWorldEffectDescriptionText() <em>Real World Effect Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealWorldEffectDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String REAL_WORLD_EFFECT_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRevisionVersion() <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REVISION_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSecurityClassificationText() <em>Security Classification Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityClassificationText()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_CLASSIFICATION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSecurityDescriptionText() <em>Security Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isSecurityImplementedIndicator() <em>Security Implemented Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurityImplementedIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getServiceAvailability() <em>Service Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_AVAILABILITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceAverageThroughput() <em>Service Average Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAverageThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_AVERAGE_THROUGHPUT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceDescriptionKeywordText() <em>Service Description Keyword Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionKeywordText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DESCRIPTION_KEYWORD_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceDescriptionSummaryText() <em>Service Description Summary Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionSummaryText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceDescriptionText() <em>Service Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceFullNameText() <em>Service Full Name Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFullNameText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_FULL_NAME_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceMaximumThroughput() <em>Service Maximum Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceMaximumThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceNameAbbreviationText() <em>Service Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameAbbreviationText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServicePurposeText() <em>Service Purpose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePurposeText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PURPOSE_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceResponseTime() <em>Service Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Duration SERVICE_RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceScopeDescriptionText() <em>Service Scope Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceScopeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSIPName() <em>SIP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIPName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIP_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSIPVersion() <em>SIP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIPVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SIP_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSponsor() <em>Sponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsor()
	 * @generated
	 * @ordered
	 */
	protected static final String SPONSOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getURIAddress() <em>URI Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getURIDescription() <em>URI Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCurrencyText() <em>Currency Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyText()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyText() <em>Currency Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyText()
	 * @generated
	 * @ordered
	 */
	protected String currencyText = CURRENCY_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitMeasureText() <em>Unit Measure Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMeasureText()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_MEASURE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitMeasureText() <em>Unit Measure Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMeasureText()
	 * @generated
	 * @ordered
	 */
	protected String unitMeasureText = UNIT_MEASURE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, graPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, graPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, graPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionName() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ACTION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionName(String newActionName) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ACTION_NAME, newActionName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionPurpose() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ACTION_PURPOSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionPurpose(String newActionPurpose) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ACTION_PURPOSE, newActionPurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getActivationDate() {
		return (XMLGregorianCalendar)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ACTIVATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationDate(XMLGregorianCalendar newActivationDate) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ACTIVATION_DATE, newActivationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType getAgreement() {
		return (AgreementType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__AGREEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgreement(AgreementType newAgreement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__AGREEMENT, newAgreement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreement(AgreementType newAgreement) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__AGREEMENT, newAgreement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgreementDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementDescriptionText(String newAgreementDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT, newAgreementDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgreementURI() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__AGREEMENT_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementURI(String newAgreementURI) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__AGREEMENT_URI, newAgreementURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlertsAndNotifications() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlertsAndNotifications(String newAlertsAndNotifications) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS, newAlertsAndNotifications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableAgreementsType getApplicableAgreements() {
		return (ApplicableAgreementsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableAgreements(ApplicableAgreementsType newApplicableAgreements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS, newApplicableAgreements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableAgreements(ApplicableAgreementsType newApplicableAgreements) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS, newApplicableAgreements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicableAgreementsIndicator() {
		return (Boolean)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableAgreementsIndicator(boolean newApplicableAgreementsIndicator) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR, newApplicableAgreementsIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableContractsType getApplicableContracts() {
		return (ApplicableContractsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_CONTRACTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableContracts(ApplicableContractsType newApplicableContracts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_CONTRACTS, newApplicableContracts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableContracts(ApplicableContractsType newApplicableContracts) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_CONTRACTS, newApplicableContracts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicableContractsIndicator() {
		return (Boolean)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableContractsIndicator(boolean newApplicableContractsIndicator) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR, newApplicableContractsIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicablePoliciesType getApplicablePolicies() {
		return (ApplicablePoliciesType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_POLICIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicablePolicies(ApplicablePoliciesType newApplicablePolicies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_POLICIES, newApplicablePolicies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicablePolicies(ApplicablePoliciesType newApplicablePolicies) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_POLICIES, newApplicablePolicies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicablePoliciesIndicator() {
		return (Boolean)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicablePoliciesIndicator(boolean newApplicablePoliciesIndicator) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR, newApplicablePoliciesIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableUmbrellaAgreementsType getApplicableUmbrellaAgreements() {
		return (ApplicableUmbrellaAgreementsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType newApplicableUmbrellaAgreements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS, newApplicableUmbrellaAgreements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableUmbrellaAgreements(ApplicableUmbrellaAgreementsType newApplicableUmbrellaAgreements) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS, newApplicableUmbrellaAgreements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicableUmbrellaAgreementsIndicator() {
		return (Boolean)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableUmbrellaAgreementsIndicator(boolean newApplicableUmbrellaAgreementsIndicator) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR, newApplicableUmbrellaAgreementsIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApprovalRequiredIndicator() {
		return (Boolean)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalRequiredIndicator(boolean newApprovalRequiredIndicator) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR, newApprovalRequiredIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessContextType getBusinessContext() {
		return (BusinessContextType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__BUSINESS_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessContext(BusinessContextType newBusinessContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__BUSINESS_CONTEXT, newBusinessContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessContext(BusinessContextType newBusinessContext) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__BUSINESS_CONTEXT, newBusinessContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapabilityDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityDescriptionText(String newCapabilityDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT, newCapabilityDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassification() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(String newClassification) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CLASSIFICATION, newClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationsType getClassifications() {
		return (ClassificationsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CLASSIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifications(ClassificationsType newClassifications, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__CLASSIFICATIONS, newClassifications, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifications(ClassificationsType newClassifications) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CLASSIFICATIONS, newClassifications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonAddress() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonAddress(String newContactPersonAddress) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS, newContactPersonAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonEmailID() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonEmailID(String newContactPersonEmailID) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID, newContactPersonEmailID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonName() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonName(String newContactPersonName) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_NAME, newContactPersonName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactPersonPhoneNumberID() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactPersonPhoneNumberID(String newContactPersonPhoneNumberID) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID, newContactPersonPhoneNumberID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType getContract() {
		return (AgreementType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CONTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(AgreementType newContract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__CONTRACT, newContract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(AgreementType newContract) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CONTRACT, newContract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType getCreationCostAmount() {
		return (AmountType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CREATION_COST_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationCostAmount(AmountType newCreationCostAmount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__CREATION_COST_AMOUNT, newCreationCostAmount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationCostAmount(AmountType newCreationCostAmount) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CREATION_COST_AMOUNT, newCreationCostAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return (XMLGregorianCalendar)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDescriptionType getDomainDescription() {
		return (DomainDescriptionType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__DOMAIN_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainDescription(DomainDescriptionType newDomainDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__DOMAIN_DESCRIPTION, newDomainDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDescription(DomainDescriptionType newDomainDescription) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__DOMAIN_DESCRIPTION, newDomainDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainNameText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__DOMAIN_NAME_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainNameText(String newDomainNameText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__DOMAIN_NAME_TEXT, newDomainNameText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndorsementsType getEndorsements() {
		return (EndorsementsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ENDORSEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndorsements(EndorsementsType newEndorsements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__ENDORSEMENTS, newEndorsements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndorsements(EndorsementsType newEndorsements) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ENDORSEMENTS, newEndorsements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndorser() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ENDORSER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndorser(String newEndorser) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ENDORSER, newEndorser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangePartnerTypeDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePartnerTypeDescriptionText(String newExchangePartnerTypeDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT, newExchangePartnerTypeDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePartnerTypesType getExchangePartnerTypes() {
		return (ExchangePartnerTypesType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangePartnerTypes(ExchangePartnerTypesType newExchangePartnerTypes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES, newExchangePartnerTypes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePartnerTypes(ExchangePartnerTypesType newExchangePartnerTypes) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES, newExchangePartnerTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getExpirationDate() {
		return (XMLGregorianCalendar)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__EXPIRATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(XMLGregorianCalendar newExpirationDate) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__EXPIRATION_DATE, newExpirationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIEPDName() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__IEPD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEPDName(String newIEPDName) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__IEPD_NAME, newIEPDName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEPDReferenceType getIEPDReference() {
		return (IEPDReferenceType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__IEPD_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIEPDReference(IEPDReferenceType newIEPDReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__IEPD_REFERENCE, newIEPDReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEPDReference(IEPDReferenceType newIEPDReference) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__IEPD_REFERENCE, newIEPDReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEPDReferencesType getIEPDReferences() {
		return (IEPDReferencesType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__IEPD_REFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIEPDReferences(IEPDReferencesType newIEPDReferences, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__IEPD_REFERENCES, newIEPDReferences, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEPDReferences(IEPDReferencesType newIEPDReferences) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__IEPD_REFERENCES, newIEPDReferences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIEPDURL() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__IEPDURL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEPDURL(String newIEPDURL) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__IEPDURL, newIEPDURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastRevisionDate() {
		return (XMLGregorianCalendar)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__LAST_REVISION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionDate(XMLGregorianCalendar newLastRevisionDate) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__LAST_REVISION_DATE, newLastRevisionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType getLicensingAgreement() {
		return (AgreementType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__LICENSING_AGREEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicensingAgreement(AgreementType newLicensingAgreement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__LICENSING_AGREEMENT, newLicensingAgreement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensingAgreement(AgreementType newLicensingAgreement) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__LICENSING_AGREEMENT, newLicensingAgreement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLicensingRequiredIndicator() {
		return (Boolean)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensingRequiredIndicator(boolean newLicensingRequiredIndicator) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR, newLicensingRequiredIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLifecycleStatus() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__LIFECYCLE_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycleStatus(String newLifecycleStatus) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__LIFECYCLE_STATUS, newLifecycleStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMajorVersion() {
		return (BigInteger)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__MAJOR_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorVersion(BigInteger newMajorVersion) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__MAJOR_VERSION, newMajorVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageExchangePattern() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchangePattern(String newMessageExchangePattern) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN, newMessageExchangePattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinorVersion() {
		return (BigInteger)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__MINOR_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorVersion(BigInteger newMinorVersion) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__MINOR_VERSION, newMinorVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getNextRevisionDate() {
		return (XMLGregorianCalendar)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__NEXT_REVISION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextRevisionDate(XMLGregorianCalendar newNextRevisionDate) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__NEXT_REVISION_DATE, newNextRevisionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType getOrganization() {
		return (OrganizationType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(OrganizationType newOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(OrganizationType newOrganization) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationAcronym() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_ACRONYM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationAcronym(String newOrganizationAcronym) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_ACRONYM, newOrganizationAcronym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationFullAddressText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationFullAddressText(String newOrganizationFullAddressText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT, newOrganizationFullAddressText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationName() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationName(String newOrganizationName) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_NAME, newOrganizationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonContactInformationType getOrganizationPointOfContact() {
		return (PersonContactInformationType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationPointOfContact(PersonContactInformationType newOrganizationPointOfContact, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT, newOrganizationPointOfContact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationPointOfContact(PersonContactInformationType newOrganizationPointOfContact) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT, newOrganizationPointOfContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationRoleDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationRoleDescriptionText(String newOrganizationRoleDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT, newOrganizationRoleDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationRoleDetailedDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationRoleDetailedDescriptionText(String newOrganizationRoleDetailedDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT, newOrganizationRoleDetailedDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationWebSiteURL() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationWebSiteURL(String newOrganizationWebSiteURL) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL, newOrganizationWebSiteURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceMetricsType getPerformanceMetrics() {
		return (PerformanceMetricsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_METRICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceMetrics(PerformanceMetricsType newPerformanceMetrics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_METRICS, newPerformanceMetrics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceMetrics(PerformanceMetricsType newPerformanceMetrics) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_METRICS, newPerformanceMetrics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__POLICY_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyText(String newPolicyText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__POLICY_TEXT, newPolicyText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealWorldEffectDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealWorldEffectDescriptionText(String newRealWorldEffectDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT, newRealWorldEffectDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedOrganizationInformationType getRelatedOrganizationInformation() {
		return (RelatedOrganizationInformationType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedOrganizationInformation(RelatedOrganizationInformationType newRelatedOrganizationInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION, newRelatedOrganizationInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedOrganizationInformation(RelatedOrganizationInformationType newRelatedOrganizationInformation) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION, newRelatedOrganizationInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRevisionVersion() {
		return (BigInteger)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__REVISION_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionVersion(BigInteger newRevisionVersion) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__REVISION_VERSION, newRevisionVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityClassificationText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityClassificationText(String newSecurityClassificationText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT, newSecurityClassificationText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityDescriptionText(String newSecurityDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT, newSecurityDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecurityImplementedIndicator() {
		return (Boolean)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityImplementedIndicator(boolean newSecurityImplementedIndicator) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR, newSecurityImplementedIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceActionType getServiceAction() {
		return (ServiceActionType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceAction(ServiceActionType newServiceAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ACTION, newServiceAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAction(ServiceActionType newServiceAction) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ACTION, newServiceAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceActionsType getServiceActions() {
		return (ServiceActionsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceActions(ServiceActionsType newServiceActions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ACTIONS, newServiceActions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceActions(ServiceActionsType newServiceActions) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ACTIONS, newServiceActions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceAvailability() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_AVAILABILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAvailability(String newServiceAvailability) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_AVAILABILITY, newServiceAvailability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceAverageThroughput() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAverageThroughput(String newServiceAverageThroughput) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT, newServiceAverageThroughput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCapabilitiesType getServiceCapabilities() {
		return (ServiceCapabilitiesType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCapabilities(ServiceCapabilitiesType newServiceCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_CAPABILITIES, newServiceCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCapabilities(ServiceCapabilitiesType newServiceCapabilities) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_CAPABILITIES, newServiceCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDependenciesType getServiceDependencies() {
		return (ServiceDependenciesType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DEPENDENCIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDependencies(ServiceDependenciesType newServiceDependencies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DEPENDENCIES, newServiceDependencies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDependencies(ServiceDependenciesType newServiceDependencies) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DEPENDENCIES, newServiceDependencies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIdentificationType getServiceDependency() {
		return (ServiceIdentificationType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DEPENDENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDependency(ServiceIdentificationType newServiceDependency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DEPENDENCY, newServiceDependency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDependency(ServiceIdentificationType newServiceDependency) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DEPENDENCY, newServiceDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionType getServiceDescription() {
		return (ServiceDescriptionType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDescription(ServiceDescriptionType newServiceDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION, newServiceDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescription(ServiceDescriptionType newServiceDescription) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION, newServiceDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionKeywordsType getServiceDescriptionKeywords() {
		return (ServiceDescriptionKeywordsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDescriptionKeywords(ServiceDescriptionKeywordsType newServiceDescriptionKeywords, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS, newServiceDescriptionKeywords, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionKeywords(ServiceDescriptionKeywordsType newServiceDescriptionKeywords) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS, newServiceDescriptionKeywords);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDescriptionKeywordText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionKeywordText(String newServiceDescriptionKeywordText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT, newServiceDescriptionKeywordText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDescriptionSummaryText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionSummaryText(String newServiceDescriptionSummaryText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT, newServiceDescriptionSummaryText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionText(String newServiceDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT, newServiceDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceFullNameText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFullNameText(String newServiceFullNameText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT, newServiceFullNameText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceID() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceID(String newServiceID) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_ID, newServiceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIdentificationType getServiceIdentification() {
		return (ServiceIdentificationType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_IDENTIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceIdentification(ServiceIdentificationType newServiceIdentification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_IDENTIFICATION, newServiceIdentification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceIdentification(ServiceIdentificationType newServiceIdentification) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_IDENTIFICATION, newServiceIdentification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInteractionProfileType getServiceInteractionProfile() {
		return (ServiceInteractionProfileType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInteractionProfile(ServiceInteractionProfileType newServiceInteractionProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE, newServiceInteractionProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInteractionProfile(ServiceInteractionProfileType newServiceInteractionProfile) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE, newServiceInteractionProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInteractionProfilesType getServiceInteractionProfiles() {
		return (ServiceInteractionProfilesType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInteractionProfiles(ServiceInteractionProfilesType newServiceInteractionProfiles, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES, newServiceInteractionProfiles, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInteractionProfiles(ServiceInteractionProfilesType newServiceInteractionProfiles) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES, newServiceInteractionProfiles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceSpecificationType getServiceInterface() {
		return (ServiceInterfaceSpecificationType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInterface(ServiceInterfaceSpecificationType newServiceInterface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERFACE, newServiceInterface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInterface(ServiceInterfaceSpecificationType newServiceInterface) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_INTERFACE, newServiceInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelAgreementsType getServiceLevelAgreements() {
		return (ServiceLevelAgreementsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLevelAgreements(ServiceLevelAgreementsType newServiceLevelAgreements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS, newServiceLevelAgreements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLevelAgreements(ServiceLevelAgreementsType newServiceLevelAgreements) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS, newServiceLevelAgreements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceMaximumThroughput() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceMaximumThroughput(String newServiceMaximumThroughput) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT, newServiceMaximumThroughput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMetadataType getServiceMetadata() {
		return (ServiceMetadataType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceMetadata(ServiceMetadataType newServiceMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_METADATA, newServiceMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceMetadata(ServiceMetadataType newServiceMetadata) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_METADATA, newServiceMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNameAbbreviationText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNameAbbreviationText(String newServiceNameAbbreviationText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT, newServiceNameAbbreviationText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePolicyAndContractsType getServicePolicyAndContracts() {
		return (ServicePolicyAndContractsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicePolicyAndContracts(ServicePolicyAndContractsType newServicePolicyAndContracts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS, newServicePolicyAndContracts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePolicyAndContracts(ServicePolicyAndContractsType newServicePolicyAndContracts) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS, newServicePolicyAndContracts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicePurposeText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePurposeText(String newServicePurposeText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT, newServicePurposeText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRealWorldEffectsType getServiceRealWorldEffects() {
		return (ServiceRealWorldEffectsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceRealWorldEffects(ServiceRealWorldEffectsType newServiceRealWorldEffects, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS, newServiceRealWorldEffects, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRealWorldEffects(ServiceRealWorldEffectsType newServiceRealWorldEffects) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS, newServiceRealWorldEffects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getServiceResponseTime() {
		return (Duration)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_RESPONSE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceResponseTime(Duration newServiceResponseTime) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_RESPONSE_TIME, newServiceResponseTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceScopeDescriptionText() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceScopeDescriptionText(String newServiceScopeDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT, newServiceScopeDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURI() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURI(String newServiceURI) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_URI, newServiceURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUsageType getServiceUsageDetails() {
		return (ServiceUsageType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceUsageDetails(ServiceUsageType newServiceUsageDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS, newServiceUsageDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUsageDetails(ServiceUsageType newServiceUsageDetails) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS, newServiceUsageDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSIPName() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SIP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIPName(String newSIPName) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SIP_NAME, newSIPName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSIPVersion() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SIP_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIPVersion(String newSIPVersion) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SIP_VERSION, newSIPVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSponsor() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SPONSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSponsor(String newSponsor) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SPONSOR, newSponsor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SponsorsType getSponsors() {
		return (SponsorsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__SPONSORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSponsors(SponsorsType newSponsors, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__SPONSORS, newSponsors, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSponsors(SponsorsType newSponsors) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__SPONSORS, newSponsors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType getUmbrellaAgreement() {
		return (AgreementType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__UMBRELLA_AGREEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmbrellaAgreement(AgreementType newUmbrellaAgreement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__UMBRELLA_AGREEMENT, newUmbrellaAgreement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmbrellaAgreement(AgreementType newUmbrellaAgreement) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__UMBRELLA_AGREEMENT, newUmbrellaAgreement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURIAddress() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__URI_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIAddress(String newURIAddress) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__URI_ADDRESS, newURIAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURIDescription() {
		return (String)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__URI_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIDescription(String newURIDescription) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__URI_DESCRIPTION, newURIDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URIDetailType getURIDetail() {
		return (URIDetailType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__URI_DETAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURIDetail(URIDetailType newURIDetail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__URI_DETAIL, newURIDetail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIDetail(URIDetailType newURIDetail) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__URI_DETAIL, newURIDetail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URIDetailsType getURIDetails() {
		return (URIDetailsType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__URI_DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURIDetails(URIDetailsType newURIDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__URI_DETAILS, newURIDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIDetails(URIDetailsType newURIDetails) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__URI_DETAILS, newURIDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType getUsageCostAmount() {
		return (AmountType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__USAGE_COST_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageCostAmount(AmountType newUsageCostAmount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__USAGE_COST_AMOUNT, newUsageCostAmount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageCostAmount(AmountType newUsageCostAmount) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__USAGE_COST_AMOUNT, newUsageCostAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType getUsageUnitCostAmount() {
		return (AmountType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageUnitCostAmount(AmountType newUsageUnitCostAmount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT, newUsageUnitCostAmount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageUnitCostAmount(AmountType newUsageUnitCostAmount) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT, newUsageUnitCostAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInformationType getVersionInformation() {
		return (VersionInformationType)getMixed().get(graPackage.Literals.DOCUMENT_ROOT__VERSION_INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionInformation(VersionInformationType newVersionInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(graPackage.Literals.DOCUMENT_ROOT__VERSION_INFORMATION, newVersionInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionInformation(VersionInformationType newVersionInformation) {
		((FeatureMap.Internal)getMixed()).set(graPackage.Literals.DOCUMENT_ROOT__VERSION_INFORMATION, newVersionInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyText() {
		return currencyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyText(String newCurrencyText) {
		String oldCurrencyText = currencyText;
		currencyText = newCurrencyText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.DOCUMENT_ROOT__CURRENCY_TEXT, oldCurrencyText, currencyText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitMeasureText() {
		return unitMeasureText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitMeasureText(String newUnitMeasureText) {
		String oldUnitMeasureText = unitMeasureText;
		unitMeasureText = newUnitMeasureText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.DOCUMENT_ROOT__UNIT_MEASURE_TEXT, oldUnitMeasureText, unitMeasureText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case graPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case graPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case graPackage.DOCUMENT_ROOT__AGREEMENT:
				return basicSetAgreement(null, msgs);
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS:
				return basicSetApplicableAgreements(null, msgs);
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS:
				return basicSetApplicableContracts(null, msgs);
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES:
				return basicSetApplicablePolicies(null, msgs);
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS:
				return basicSetApplicableUmbrellaAgreements(null, msgs);
			case graPackage.DOCUMENT_ROOT__BUSINESS_CONTEXT:
				return basicSetBusinessContext(null, msgs);
			case graPackage.DOCUMENT_ROOT__CLASSIFICATIONS:
				return basicSetClassifications(null, msgs);
			case graPackage.DOCUMENT_ROOT__CONTRACT:
				return basicSetContract(null, msgs);
			case graPackage.DOCUMENT_ROOT__CREATION_COST_AMOUNT:
				return basicSetCreationCostAmount(null, msgs);
			case graPackage.DOCUMENT_ROOT__DOMAIN_DESCRIPTION:
				return basicSetDomainDescription(null, msgs);
			case graPackage.DOCUMENT_ROOT__ENDORSEMENTS:
				return basicSetEndorsements(null, msgs);
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES:
				return basicSetExchangePartnerTypes(null, msgs);
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCE:
				return basicSetIEPDReference(null, msgs);
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCES:
				return basicSetIEPDReferences(null, msgs);
			case graPackage.DOCUMENT_ROOT__LICENSING_AGREEMENT:
				return basicSetLicensingAgreement(null, msgs);
			case graPackage.DOCUMENT_ROOT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT:
				return basicSetOrganizationPointOfContact(null, msgs);
			case graPackage.DOCUMENT_ROOT__PERFORMANCE_METRICS:
				return basicSetPerformanceMetrics(null, msgs);
			case graPackage.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION:
				return basicSetRelatedOrganizationInformation(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTION:
				return basicSetServiceAction(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTIONS:
				return basicSetServiceActions(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_CAPABILITIES:
				return basicSetServiceCapabilities(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCIES:
				return basicSetServiceDependencies(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCY:
				return basicSetServiceDependency(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION:
				return basicSetServiceDescription(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS:
				return basicSetServiceDescriptionKeywords(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				return basicSetServiceIdentification(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE:
				return basicSetServiceInteractionProfile(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES:
				return basicSetServiceInteractionProfiles(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERFACE:
				return basicSetServiceInterface(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS:
				return basicSetServiceLevelAgreements(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_METADATA:
				return basicSetServiceMetadata(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS:
				return basicSetServicePolicyAndContracts(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS:
				return basicSetServiceRealWorldEffects(null, msgs);
			case graPackage.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS:
				return basicSetServiceUsageDetails(null, msgs);
			case graPackage.DOCUMENT_ROOT__SPONSORS:
				return basicSetSponsors(null, msgs);
			case graPackage.DOCUMENT_ROOT__UMBRELLA_AGREEMENT:
				return basicSetUmbrellaAgreement(null, msgs);
			case graPackage.DOCUMENT_ROOT__URI_DETAIL:
				return basicSetURIDetail(null, msgs);
			case graPackage.DOCUMENT_ROOT__URI_DETAILS:
				return basicSetURIDetails(null, msgs);
			case graPackage.DOCUMENT_ROOT__USAGE_COST_AMOUNT:
				return basicSetUsageCostAmount(null, msgs);
			case graPackage.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT:
				return basicSetUsageUnitCostAmount(null, msgs);
			case graPackage.DOCUMENT_ROOT__VERSION_INFORMATION:
				return basicSetVersionInformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case graPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case graPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case graPackage.DOCUMENT_ROOT__ACTION_NAME:
				return getActionName();
			case graPackage.DOCUMENT_ROOT__ACTION_PURPOSE:
				return getActionPurpose();
			case graPackage.DOCUMENT_ROOT__ACTIVATION_DATE:
				return getActivationDate();
			case graPackage.DOCUMENT_ROOT__AGREEMENT:
				return getAgreement();
			case graPackage.DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT:
				return getAgreementDescriptionText();
			case graPackage.DOCUMENT_ROOT__AGREEMENT_URI:
				return getAgreementURI();
			case graPackage.DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS:
				return getAlertsAndNotifications();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS:
				return getApplicableAgreements();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR:
				return isApplicableAgreementsIndicator();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS:
				return getApplicableContracts();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR:
				return isApplicableContractsIndicator();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES:
				return getApplicablePolicies();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR:
				return isApplicablePoliciesIndicator();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS:
				return getApplicableUmbrellaAgreements();
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				return isApplicableUmbrellaAgreementsIndicator();
			case graPackage.DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR:
				return isApprovalRequiredIndicator();
			case graPackage.DOCUMENT_ROOT__BUSINESS_CONTEXT:
				return getBusinessContext();
			case graPackage.DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT:
				return getCapabilityDescriptionText();
			case graPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return getClassification();
			case graPackage.DOCUMENT_ROOT__CLASSIFICATIONS:
				return getClassifications();
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS:
				return getContactPersonAddress();
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID:
				return getContactPersonEmailID();
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_NAME:
				return getContactPersonName();
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID:
				return getContactPersonPhoneNumberID();
			case graPackage.DOCUMENT_ROOT__CONTRACT:
				return getContract();
			case graPackage.DOCUMENT_ROOT__CREATION_COST_AMOUNT:
				return getCreationCostAmount();
			case graPackage.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate();
			case graPackage.DOCUMENT_ROOT__DOMAIN_DESCRIPTION:
				return getDomainDescription();
			case graPackage.DOCUMENT_ROOT__DOMAIN_NAME_TEXT:
				return getDomainNameText();
			case graPackage.DOCUMENT_ROOT__ENDORSEMENTS:
				return getEndorsements();
			case graPackage.DOCUMENT_ROOT__ENDORSER:
				return getEndorser();
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				return getExchangePartnerTypeDescriptionText();
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES:
				return getExchangePartnerTypes();
			case graPackage.DOCUMENT_ROOT__EXPIRATION_DATE:
				return getExpirationDate();
			case graPackage.DOCUMENT_ROOT__IEPD_NAME:
				return getIEPDName();
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCE:
				return getIEPDReference();
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCES:
				return getIEPDReferences();
			case graPackage.DOCUMENT_ROOT__IEPDURL:
				return getIEPDURL();
			case graPackage.DOCUMENT_ROOT__LAST_REVISION_DATE:
				return getLastRevisionDate();
			case graPackage.DOCUMENT_ROOT__LICENSING_AGREEMENT:
				return getLicensingAgreement();
			case graPackage.DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR:
				return isLicensingRequiredIndicator();
			case graPackage.DOCUMENT_ROOT__LIFECYCLE_STATUS:
				return getLifecycleStatus();
			case graPackage.DOCUMENT_ROOT__MAJOR_VERSION:
				return getMajorVersion();
			case graPackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN:
				return getMessageExchangePattern();
			case graPackage.DOCUMENT_ROOT__MINOR_VERSION:
				return getMinorVersion();
			case graPackage.DOCUMENT_ROOT__NEXT_REVISION_DATE:
				return getNextRevisionDate();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ACRONYM:
				return getOrganizationAcronym();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT:
				return getOrganizationFullAddressText();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_NAME:
				return getOrganizationName();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT:
				return getOrganizationPointOfContact();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				return getOrganizationRoleDescriptionText();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				return getOrganizationRoleDetailedDescriptionText();
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL:
				return getOrganizationWebSiteURL();
			case graPackage.DOCUMENT_ROOT__PERFORMANCE_METRICS:
				return getPerformanceMetrics();
			case graPackage.DOCUMENT_ROOT__POLICY_TEXT:
				return getPolicyText();
			case graPackage.DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				return getRealWorldEffectDescriptionText();
			case graPackage.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION:
				return getRelatedOrganizationInformation();
			case graPackage.DOCUMENT_ROOT__REVISION_VERSION:
				return getRevisionVersion();
			case graPackage.DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT:
				return getSecurityClassificationText();
			case graPackage.DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT:
				return getSecurityDescriptionText();
			case graPackage.DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR:
				return isSecurityImplementedIndicator();
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTION:
				return getServiceAction();
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTIONS:
				return getServiceActions();
			case graPackage.DOCUMENT_ROOT__SERVICE_AVAILABILITY:
				return getServiceAvailability();
			case graPackage.DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT:
				return getServiceAverageThroughput();
			case graPackage.DOCUMENT_ROOT__SERVICE_CAPABILITIES:
				return getServiceCapabilities();
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCY:
				return getServiceDependency();
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION:
				return getServiceDescription();
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS:
				return getServiceDescriptionKeywords();
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				return getServiceDescriptionKeywordText();
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				return getServiceDescriptionSummaryText();
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT:
				return getServiceDescriptionText();
			case graPackage.DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT:
				return getServiceFullNameText();
			case graPackage.DOCUMENT_ROOT__SERVICE_ID:
				return getServiceID();
			case graPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				return getServiceIdentification();
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE:
				return getServiceInteractionProfile();
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES:
				return getServiceInteractionProfiles();
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERFACE:
				return getServiceInterface();
			case graPackage.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS:
				return getServiceLevelAgreements();
			case graPackage.DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT:
				return getServiceMaximumThroughput();
			case graPackage.DOCUMENT_ROOT__SERVICE_METADATA:
				return getServiceMetadata();
			case graPackage.DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT:
				return getServiceNameAbbreviationText();
			case graPackage.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS:
				return getServicePolicyAndContracts();
			case graPackage.DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT:
				return getServicePurposeText();
			case graPackage.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS:
				return getServiceRealWorldEffects();
			case graPackage.DOCUMENT_ROOT__SERVICE_RESPONSE_TIME:
				return getServiceResponseTime();
			case graPackage.DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT:
				return getServiceScopeDescriptionText();
			case graPackage.DOCUMENT_ROOT__SERVICE_URI:
				return getServiceURI();
			case graPackage.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS:
				return getServiceUsageDetails();
			case graPackage.DOCUMENT_ROOT__SIP_NAME:
				return getSIPName();
			case graPackage.DOCUMENT_ROOT__SIP_VERSION:
				return getSIPVersion();
			case graPackage.DOCUMENT_ROOT__SPONSOR:
				return getSponsor();
			case graPackage.DOCUMENT_ROOT__SPONSORS:
				return getSponsors();
			case graPackage.DOCUMENT_ROOT__UMBRELLA_AGREEMENT:
				return getUmbrellaAgreement();
			case graPackage.DOCUMENT_ROOT__URI_ADDRESS:
				return getURIAddress();
			case graPackage.DOCUMENT_ROOT__URI_DESCRIPTION:
				return getURIDescription();
			case graPackage.DOCUMENT_ROOT__URI_DETAIL:
				return getURIDetail();
			case graPackage.DOCUMENT_ROOT__URI_DETAILS:
				return getURIDetails();
			case graPackage.DOCUMENT_ROOT__USAGE_COST_AMOUNT:
				return getUsageCostAmount();
			case graPackage.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT:
				return getUsageUnitCostAmount();
			case graPackage.DOCUMENT_ROOT__VERSION_INFORMATION:
				return getVersionInformation();
			case graPackage.DOCUMENT_ROOT__CURRENCY_TEXT:
				return getCurrencyText();
			case graPackage.DOCUMENT_ROOT__UNIT_MEASURE_TEXT:
				return getUnitMeasureText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case graPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case graPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case graPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ACTION_NAME:
				setActionName((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ACTION_PURPOSE:
				setActionPurpose((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ACTIVATION_DATE:
				setActivationDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__AGREEMENT:
				setAgreement((AgreementType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT:
				setAgreementDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__AGREEMENT_URI:
				setAgreementURI((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS:
				setAlertsAndNotifications((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS:
				setApplicableAgreements((ApplicableAgreementsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR:
				setApplicableAgreementsIndicator((Boolean)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS:
				setApplicableContracts((ApplicableContractsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR:
				setApplicableContractsIndicator((Boolean)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES:
				setApplicablePolicies((ApplicablePoliciesType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR:
				setApplicablePoliciesIndicator((Boolean)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS:
				setApplicableUmbrellaAgreements((ApplicableUmbrellaAgreementsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				setApplicableUmbrellaAgreementsIndicator((Boolean)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR:
				setApprovalRequiredIndicator((Boolean)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__BUSINESS_CONTEXT:
				setBusinessContext((BusinessContextType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT:
				setCapabilityDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CLASSIFICATIONS:
				setClassifications((ClassificationsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS:
				setContactPersonAddress((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID:
				setContactPersonEmailID((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_NAME:
				setContactPersonName((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID:
				setContactPersonPhoneNumberID((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CONTRACT:
				setContract((AgreementType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CREATION_COST_AMOUNT:
				setCreationCostAmount((AmountType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__DOMAIN_DESCRIPTION:
				setDomainDescription((DomainDescriptionType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__DOMAIN_NAME_TEXT:
				setDomainNameText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ENDORSEMENTS:
				setEndorsements((EndorsementsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ENDORSER:
				setEndorser((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				setExchangePartnerTypeDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES:
				setExchangePartnerTypes((ExchangePartnerTypesType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__EXPIRATION_DATE:
				setExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__IEPD_NAME:
				setIEPDName((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCE:
				setIEPDReference((IEPDReferenceType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCES:
				setIEPDReferences((IEPDReferencesType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__IEPDURL:
				setIEPDURL((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__LAST_REVISION_DATE:
				setLastRevisionDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__LICENSING_AGREEMENT:
				setLicensingAgreement((AgreementType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR:
				setLicensingRequiredIndicator((Boolean)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__LIFECYCLE_STATUS:
				setLifecycleStatus((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__MAJOR_VERSION:
				setMajorVersion((BigInteger)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN:
				setMessageExchangePattern((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__MINOR_VERSION:
				setMinorVersion((BigInteger)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__NEXT_REVISION_DATE:
				setNextRevisionDate((XMLGregorianCalendar)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ACRONYM:
				setOrganizationAcronym((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT:
				setOrganizationFullAddressText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_NAME:
				setOrganizationName((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT:
				setOrganizationPointOfContact((PersonContactInformationType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				setOrganizationRoleDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				setOrganizationRoleDetailedDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL:
				setOrganizationWebSiteURL((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__PERFORMANCE_METRICS:
				setPerformanceMetrics((PerformanceMetricsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__POLICY_TEXT:
				setPolicyText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				setRealWorldEffectDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION:
				setRelatedOrganizationInformation((RelatedOrganizationInformationType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__REVISION_VERSION:
				setRevisionVersion((BigInteger)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT:
				setSecurityClassificationText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT:
				setSecurityDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR:
				setSecurityImplementedIndicator((Boolean)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTION:
				setServiceAction((ServiceActionType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTIONS:
				setServiceActions((ServiceActionsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_AVAILABILITY:
				setServiceAvailability((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT:
				setServiceAverageThroughput((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_CAPABILITIES:
				setServiceCapabilities((ServiceCapabilitiesType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCIES:
				setServiceDependencies((ServiceDependenciesType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCY:
				setServiceDependency((ServiceIdentificationType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS:
				setServiceDescriptionKeywords((ServiceDescriptionKeywordsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				setServiceDescriptionKeywordText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				setServiceDescriptionSummaryText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT:
				setServiceDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT:
				setServiceFullNameText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_ID:
				setServiceID((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE:
				setServiceInteractionProfile((ServiceInteractionProfileType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES:
				setServiceInteractionProfiles((ServiceInteractionProfilesType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERFACE:
				setServiceInterface((ServiceInterfaceSpecificationType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS:
				setServiceLevelAgreements((ServiceLevelAgreementsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT:
				setServiceMaximumThroughput((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_METADATA:
				setServiceMetadata((ServiceMetadataType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT:
				setServiceNameAbbreviationText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS:
				setServicePolicyAndContracts((ServicePolicyAndContractsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT:
				setServicePurposeText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS:
				setServiceRealWorldEffects((ServiceRealWorldEffectsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_RESPONSE_TIME:
				setServiceResponseTime((Duration)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT:
				setServiceScopeDescriptionText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_URI:
				setServiceURI((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS:
				setServiceUsageDetails((ServiceUsageType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SIP_NAME:
				setSIPName((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SIP_VERSION:
				setSIPVersion((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SPONSOR:
				setSponsor((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__SPONSORS:
				setSponsors((SponsorsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__UMBRELLA_AGREEMENT:
				setUmbrellaAgreement((AgreementType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__URI_ADDRESS:
				setURIAddress((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__URI_DESCRIPTION:
				setURIDescription((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__URI_DETAIL:
				setURIDetail((URIDetailType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__URI_DETAILS:
				setURIDetails((URIDetailsType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__USAGE_COST_AMOUNT:
				setUsageCostAmount((AmountType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT:
				setUsageUnitCostAmount((AmountType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__VERSION_INFORMATION:
				setVersionInformation((VersionInformationType)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__CURRENCY_TEXT:
				setCurrencyText((String)newValue);
				return;
			case graPackage.DOCUMENT_ROOT__UNIT_MEASURE_TEXT:
				setUnitMeasureText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case graPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case graPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case graPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case graPackage.DOCUMENT_ROOT__ACTION_NAME:
				setActionName(ACTION_NAME_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ACTION_PURPOSE:
				setActionPurpose(ACTION_PURPOSE_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ACTIVATION_DATE:
				setActivationDate(ACTIVATION_DATE_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__AGREEMENT:
				setAgreement((AgreementType)null);
				return;
			case graPackage.DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT:
				setAgreementDescriptionText(AGREEMENT_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__AGREEMENT_URI:
				setAgreementURI(AGREEMENT_URI_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS:
				setAlertsAndNotifications(ALERTS_AND_NOTIFICATIONS_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS:
				setApplicableAgreements((ApplicableAgreementsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR:
				setApplicableAgreementsIndicator(APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS:
				setApplicableContracts((ApplicableContractsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR:
				setApplicableContractsIndicator(APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES:
				setApplicablePolicies((ApplicablePoliciesType)null);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR:
				setApplicablePoliciesIndicator(APPLICABLE_POLICIES_INDICATOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS:
				setApplicableUmbrellaAgreements((ApplicableUmbrellaAgreementsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				setApplicableUmbrellaAgreementsIndicator(APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR:
				setApprovalRequiredIndicator(APPROVAL_REQUIRED_INDICATOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__BUSINESS_CONTEXT:
				setBusinessContext((BusinessContextType)null);
				return;
			case graPackage.DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT:
				setCapabilityDescriptionText(CAPABILITY_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__CLASSIFICATIONS:
				setClassifications((ClassificationsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS:
				setContactPersonAddress(CONTACT_PERSON_ADDRESS_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID:
				setContactPersonEmailID(CONTACT_PERSON_EMAIL_ID_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_NAME:
				setContactPersonName(CONTACT_PERSON_NAME_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID:
				setContactPersonPhoneNumberID(CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__CONTRACT:
				setContract((AgreementType)null);
				return;
			case graPackage.DOCUMENT_ROOT__CREATION_COST_AMOUNT:
				setCreationCostAmount((AmountType)null);
				return;
			case graPackage.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__DOMAIN_DESCRIPTION:
				setDomainDescription((DomainDescriptionType)null);
				return;
			case graPackage.DOCUMENT_ROOT__DOMAIN_NAME_TEXT:
				setDomainNameText(DOMAIN_NAME_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ENDORSEMENTS:
				setEndorsements((EndorsementsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__ENDORSER:
				setEndorser(ENDORSER_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				setExchangePartnerTypeDescriptionText(EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES:
				setExchangePartnerTypes((ExchangePartnerTypesType)null);
				return;
			case graPackage.DOCUMENT_ROOT__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__IEPD_NAME:
				setIEPDName(IEPD_NAME_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCE:
				setIEPDReference((IEPDReferenceType)null);
				return;
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCES:
				setIEPDReferences((IEPDReferencesType)null);
				return;
			case graPackage.DOCUMENT_ROOT__IEPDURL:
				setIEPDURL(IEPDURL_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__LAST_REVISION_DATE:
				setLastRevisionDate(LAST_REVISION_DATE_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__LICENSING_AGREEMENT:
				setLicensingAgreement((AgreementType)null);
				return;
			case graPackage.DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR:
				setLicensingRequiredIndicator(LICENSING_REQUIRED_INDICATOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__LIFECYCLE_STATUS:
				setLifecycleStatus(LIFECYCLE_STATUS_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__MAJOR_VERSION:
				setMajorVersion(MAJOR_VERSION_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN:
				setMessageExchangePattern(MESSAGE_EXCHANGE_PATTERN_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__MINOR_VERSION:
				setMinorVersion(MINOR_VERSION_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__NEXT_REVISION_DATE:
				setNextRevisionDate(NEXT_REVISION_DATE_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)null);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ACRONYM:
				setOrganizationAcronym(ORGANIZATION_ACRONYM_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT:
				setOrganizationFullAddressText(ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_NAME:
				setOrganizationName(ORGANIZATION_NAME_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT:
				setOrganizationPointOfContact((PersonContactInformationType)null);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				setOrganizationRoleDescriptionText(ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				setOrganizationRoleDetailedDescriptionText(ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL:
				setOrganizationWebSiteURL(ORGANIZATION_WEB_SITE_URL_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__PERFORMANCE_METRICS:
				setPerformanceMetrics((PerformanceMetricsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__POLICY_TEXT:
				setPolicyText(POLICY_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				setRealWorldEffectDescriptionText(REAL_WORLD_EFFECT_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION:
				setRelatedOrganizationInformation((RelatedOrganizationInformationType)null);
				return;
			case graPackage.DOCUMENT_ROOT__REVISION_VERSION:
				setRevisionVersion(REVISION_VERSION_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT:
				setSecurityClassificationText(SECURITY_CLASSIFICATION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT:
				setSecurityDescriptionText(SECURITY_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR:
				setSecurityImplementedIndicator(SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTION:
				setServiceAction((ServiceActionType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTIONS:
				setServiceActions((ServiceActionsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_AVAILABILITY:
				setServiceAvailability(SERVICE_AVAILABILITY_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT:
				setServiceAverageThroughput(SERVICE_AVERAGE_THROUGHPUT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_CAPABILITIES:
				setServiceCapabilities((ServiceCapabilitiesType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCIES:
				setServiceDependencies((ServiceDependenciesType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCY:
				setServiceDependency((ServiceIdentificationType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION:
				setServiceDescription((ServiceDescriptionType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS:
				setServiceDescriptionKeywords((ServiceDescriptionKeywordsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				setServiceDescriptionKeywordText(SERVICE_DESCRIPTION_KEYWORD_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				setServiceDescriptionSummaryText(SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT:
				setServiceDescriptionText(SERVICE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT:
				setServiceFullNameText(SERVICE_FULL_NAME_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_ID:
				setServiceID(SERVICE_ID_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE:
				setServiceInteractionProfile((ServiceInteractionProfileType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES:
				setServiceInteractionProfiles((ServiceInteractionProfilesType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERFACE:
				setServiceInterface((ServiceInterfaceSpecificationType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS:
				setServiceLevelAgreements((ServiceLevelAgreementsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT:
				setServiceMaximumThroughput(SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_METADATA:
				setServiceMetadata((ServiceMetadataType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT:
				setServiceNameAbbreviationText(SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS:
				setServicePolicyAndContracts((ServicePolicyAndContractsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT:
				setServicePurposeText(SERVICE_PURPOSE_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS:
				setServiceRealWorldEffects((ServiceRealWorldEffectsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_RESPONSE_TIME:
				setServiceResponseTime(SERVICE_RESPONSE_TIME_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT:
				setServiceScopeDescriptionText(SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_URI:
				setServiceURI(SERVICE_URI_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS:
				setServiceUsageDetails((ServiceUsageType)null);
				return;
			case graPackage.DOCUMENT_ROOT__SIP_NAME:
				setSIPName(SIP_NAME_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SIP_VERSION:
				setSIPVersion(SIP_VERSION_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SPONSOR:
				setSponsor(SPONSOR_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__SPONSORS:
				setSponsors((SponsorsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__UMBRELLA_AGREEMENT:
				setUmbrellaAgreement((AgreementType)null);
				return;
			case graPackage.DOCUMENT_ROOT__URI_ADDRESS:
				setURIAddress(URI_ADDRESS_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__URI_DESCRIPTION:
				setURIDescription(URI_DESCRIPTION_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__URI_DETAIL:
				setURIDetail((URIDetailType)null);
				return;
			case graPackage.DOCUMENT_ROOT__URI_DETAILS:
				setURIDetails((URIDetailsType)null);
				return;
			case graPackage.DOCUMENT_ROOT__USAGE_COST_AMOUNT:
				setUsageCostAmount((AmountType)null);
				return;
			case graPackage.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT:
				setUsageUnitCostAmount((AmountType)null);
				return;
			case graPackage.DOCUMENT_ROOT__VERSION_INFORMATION:
				setVersionInformation((VersionInformationType)null);
				return;
			case graPackage.DOCUMENT_ROOT__CURRENCY_TEXT:
				setCurrencyText(CURRENCY_TEXT_EDEFAULT);
				return;
			case graPackage.DOCUMENT_ROOT__UNIT_MEASURE_TEXT:
				setUnitMeasureText(UNIT_MEASURE_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case graPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case graPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case graPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case graPackage.DOCUMENT_ROOT__ACTION_NAME:
				return ACTION_NAME_EDEFAULT == null ? getActionName() != null : !ACTION_NAME_EDEFAULT.equals(getActionName());
			case graPackage.DOCUMENT_ROOT__ACTION_PURPOSE:
				return ACTION_PURPOSE_EDEFAULT == null ? getActionPurpose() != null : !ACTION_PURPOSE_EDEFAULT.equals(getActionPurpose());
			case graPackage.DOCUMENT_ROOT__ACTIVATION_DATE:
				return ACTIVATION_DATE_EDEFAULT == null ? getActivationDate() != null : !ACTIVATION_DATE_EDEFAULT.equals(getActivationDate());
			case graPackage.DOCUMENT_ROOT__AGREEMENT:
				return getAgreement() != null;
			case graPackage.DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT:
				return AGREEMENT_DESCRIPTION_TEXT_EDEFAULT == null ? getAgreementDescriptionText() != null : !AGREEMENT_DESCRIPTION_TEXT_EDEFAULT.equals(getAgreementDescriptionText());
			case graPackage.DOCUMENT_ROOT__AGREEMENT_URI:
				return AGREEMENT_URI_EDEFAULT == null ? getAgreementURI() != null : !AGREEMENT_URI_EDEFAULT.equals(getAgreementURI());
			case graPackage.DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS:
				return ALERTS_AND_NOTIFICATIONS_EDEFAULT == null ? getAlertsAndNotifications() != null : !ALERTS_AND_NOTIFICATIONS_EDEFAULT.equals(getAlertsAndNotifications());
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS:
				return getApplicableAgreements() != null;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR:
				return isApplicableAgreementsIndicator() != APPLICABLE_AGREEMENTS_INDICATOR_EDEFAULT;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS:
				return getApplicableContracts() != null;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR:
				return isApplicableContractsIndicator() != APPLICABLE_CONTRACTS_INDICATOR_EDEFAULT;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES:
				return getApplicablePolicies() != null;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR:
				return isApplicablePoliciesIndicator() != APPLICABLE_POLICIES_INDICATOR_EDEFAULT;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS:
				return getApplicableUmbrellaAgreements() != null;
			case graPackage.DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR:
				return isApplicableUmbrellaAgreementsIndicator() != APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_EDEFAULT;
			case graPackage.DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR:
				return isApprovalRequiredIndicator() != APPROVAL_REQUIRED_INDICATOR_EDEFAULT;
			case graPackage.DOCUMENT_ROOT__BUSINESS_CONTEXT:
				return getBusinessContext() != null;
			case graPackage.DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT:
				return CAPABILITY_DESCRIPTION_TEXT_EDEFAULT == null ? getCapabilityDescriptionText() != null : !CAPABILITY_DESCRIPTION_TEXT_EDEFAULT.equals(getCapabilityDescriptionText());
			case graPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? getClassification() != null : !CLASSIFICATION_EDEFAULT.equals(getClassification());
			case graPackage.DOCUMENT_ROOT__CLASSIFICATIONS:
				return getClassifications() != null;
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS:
				return CONTACT_PERSON_ADDRESS_EDEFAULT == null ? getContactPersonAddress() != null : !CONTACT_PERSON_ADDRESS_EDEFAULT.equals(getContactPersonAddress());
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID:
				return CONTACT_PERSON_EMAIL_ID_EDEFAULT == null ? getContactPersonEmailID() != null : !CONTACT_PERSON_EMAIL_ID_EDEFAULT.equals(getContactPersonEmailID());
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_NAME:
				return CONTACT_PERSON_NAME_EDEFAULT == null ? getContactPersonName() != null : !CONTACT_PERSON_NAME_EDEFAULT.equals(getContactPersonName());
			case graPackage.DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID:
				return CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT == null ? getContactPersonPhoneNumberID() != null : !CONTACT_PERSON_PHONE_NUMBER_ID_EDEFAULT.equals(getContactPersonPhoneNumberID());
			case graPackage.DOCUMENT_ROOT__CONTRACT:
				return getContract() != null;
			case graPackage.DOCUMENT_ROOT__CREATION_COST_AMOUNT:
				return getCreationCostAmount() != null;
			case graPackage.DOCUMENT_ROOT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case graPackage.DOCUMENT_ROOT__DOMAIN_DESCRIPTION:
				return getDomainDescription() != null;
			case graPackage.DOCUMENT_ROOT__DOMAIN_NAME_TEXT:
				return DOMAIN_NAME_TEXT_EDEFAULT == null ? getDomainNameText() != null : !DOMAIN_NAME_TEXT_EDEFAULT.equals(getDomainNameText());
			case graPackage.DOCUMENT_ROOT__ENDORSEMENTS:
				return getEndorsements() != null;
			case graPackage.DOCUMENT_ROOT__ENDORSER:
				return ENDORSER_EDEFAULT == null ? getEndorser() != null : !ENDORSER_EDEFAULT.equals(getEndorser());
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				return EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT == null ? getExchangePartnerTypeDescriptionText() != null : !EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT.equals(getExchangePartnerTypeDescriptionText());
			case graPackage.DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES:
				return getExchangePartnerTypes() != null;
			case graPackage.DOCUMENT_ROOT__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? getExpirationDate() != null : !EXPIRATION_DATE_EDEFAULT.equals(getExpirationDate());
			case graPackage.DOCUMENT_ROOT__IEPD_NAME:
				return IEPD_NAME_EDEFAULT == null ? getIEPDName() != null : !IEPD_NAME_EDEFAULT.equals(getIEPDName());
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCE:
				return getIEPDReference() != null;
			case graPackage.DOCUMENT_ROOT__IEPD_REFERENCES:
				return getIEPDReferences() != null;
			case graPackage.DOCUMENT_ROOT__IEPDURL:
				return IEPDURL_EDEFAULT == null ? getIEPDURL() != null : !IEPDURL_EDEFAULT.equals(getIEPDURL());
			case graPackage.DOCUMENT_ROOT__LAST_REVISION_DATE:
				return LAST_REVISION_DATE_EDEFAULT == null ? getLastRevisionDate() != null : !LAST_REVISION_DATE_EDEFAULT.equals(getLastRevisionDate());
			case graPackage.DOCUMENT_ROOT__LICENSING_AGREEMENT:
				return getLicensingAgreement() != null;
			case graPackage.DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR:
				return isLicensingRequiredIndicator() != LICENSING_REQUIRED_INDICATOR_EDEFAULT;
			case graPackage.DOCUMENT_ROOT__LIFECYCLE_STATUS:
				return LIFECYCLE_STATUS_EDEFAULT == null ? getLifecycleStatus() != null : !LIFECYCLE_STATUS_EDEFAULT.equals(getLifecycleStatus());
			case graPackage.DOCUMENT_ROOT__MAJOR_VERSION:
				return MAJOR_VERSION_EDEFAULT == null ? getMajorVersion() != null : !MAJOR_VERSION_EDEFAULT.equals(getMajorVersion());
			case graPackage.DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN:
				return MESSAGE_EXCHANGE_PATTERN_EDEFAULT == null ? getMessageExchangePattern() != null : !MESSAGE_EXCHANGE_PATTERN_EDEFAULT.equals(getMessageExchangePattern());
			case graPackage.DOCUMENT_ROOT__MINOR_VERSION:
				return MINOR_VERSION_EDEFAULT == null ? getMinorVersion() != null : !MINOR_VERSION_EDEFAULT.equals(getMinorVersion());
			case graPackage.DOCUMENT_ROOT__NEXT_REVISION_DATE:
				return NEXT_REVISION_DATE_EDEFAULT == null ? getNextRevisionDate() != null : !NEXT_REVISION_DATE_EDEFAULT.equals(getNextRevisionDate());
			case graPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization() != null;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ACRONYM:
				return ORGANIZATION_ACRONYM_EDEFAULT == null ? getOrganizationAcronym() != null : !ORGANIZATION_ACRONYM_EDEFAULT.equals(getOrganizationAcronym());
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT:
				return ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT == null ? getOrganizationFullAddressText() != null : !ORGANIZATION_FULL_ADDRESS_TEXT_EDEFAULT.equals(getOrganizationFullAddressText());
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_NAME:
				return ORGANIZATION_NAME_EDEFAULT == null ? getOrganizationName() != null : !ORGANIZATION_NAME_EDEFAULT.equals(getOrganizationName());
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT:
				return getOrganizationPointOfContact() != null;
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT:
				return ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT == null ? getOrganizationRoleDescriptionText() != null : !ORGANIZATION_ROLE_DESCRIPTION_TEXT_EDEFAULT.equals(getOrganizationRoleDescriptionText());
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT:
				return ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT == null ? getOrganizationRoleDetailedDescriptionText() != null : !ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT_EDEFAULT.equals(getOrganizationRoleDetailedDescriptionText());
			case graPackage.DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL:
				return ORGANIZATION_WEB_SITE_URL_EDEFAULT == null ? getOrganizationWebSiteURL() != null : !ORGANIZATION_WEB_SITE_URL_EDEFAULT.equals(getOrganizationWebSiteURL());
			case graPackage.DOCUMENT_ROOT__PERFORMANCE_METRICS:
				return getPerformanceMetrics() != null;
			case graPackage.DOCUMENT_ROOT__POLICY_TEXT:
				return POLICY_TEXT_EDEFAULT == null ? getPolicyText() != null : !POLICY_TEXT_EDEFAULT.equals(getPolicyText());
			case graPackage.DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT:
				return REAL_WORLD_EFFECT_DESCRIPTION_TEXT_EDEFAULT == null ? getRealWorldEffectDescriptionText() != null : !REAL_WORLD_EFFECT_DESCRIPTION_TEXT_EDEFAULT.equals(getRealWorldEffectDescriptionText());
			case graPackage.DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION:
				return getRelatedOrganizationInformation() != null;
			case graPackage.DOCUMENT_ROOT__REVISION_VERSION:
				return REVISION_VERSION_EDEFAULT == null ? getRevisionVersion() != null : !REVISION_VERSION_EDEFAULT.equals(getRevisionVersion());
			case graPackage.DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT:
				return SECURITY_CLASSIFICATION_TEXT_EDEFAULT == null ? getSecurityClassificationText() != null : !SECURITY_CLASSIFICATION_TEXT_EDEFAULT.equals(getSecurityClassificationText());
			case graPackage.DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT:
				return SECURITY_DESCRIPTION_TEXT_EDEFAULT == null ? getSecurityDescriptionText() != null : !SECURITY_DESCRIPTION_TEXT_EDEFAULT.equals(getSecurityDescriptionText());
			case graPackage.DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR:
				return isSecurityImplementedIndicator() != SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT;
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTION:
				return getServiceAction() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_ACTIONS:
				return getServiceActions() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_AVAILABILITY:
				return SERVICE_AVAILABILITY_EDEFAULT == null ? getServiceAvailability() != null : !SERVICE_AVAILABILITY_EDEFAULT.equals(getServiceAvailability());
			case graPackage.DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT:
				return SERVICE_AVERAGE_THROUGHPUT_EDEFAULT == null ? getServiceAverageThroughput() != null : !SERVICE_AVERAGE_THROUGHPUT_EDEFAULT.equals(getServiceAverageThroughput());
			case graPackage.DOCUMENT_ROOT__SERVICE_CAPABILITIES:
				return getServiceCapabilities() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCIES:
				return getServiceDependencies() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_DEPENDENCY:
				return getServiceDependency() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION:
				return getServiceDescription() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS:
				return getServiceDescriptionKeywords() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				return SERVICE_DESCRIPTION_KEYWORD_TEXT_EDEFAULT == null ? getServiceDescriptionKeywordText() != null : !SERVICE_DESCRIPTION_KEYWORD_TEXT_EDEFAULT.equals(getServiceDescriptionKeywordText());
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				return SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT == null ? getServiceDescriptionSummaryText() != null : !SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT.equals(getServiceDescriptionSummaryText());
			case graPackage.DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT:
				return SERVICE_DESCRIPTION_TEXT_EDEFAULT == null ? getServiceDescriptionText() != null : !SERVICE_DESCRIPTION_TEXT_EDEFAULT.equals(getServiceDescriptionText());
			case graPackage.DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT:
				return SERVICE_FULL_NAME_TEXT_EDEFAULT == null ? getServiceFullNameText() != null : !SERVICE_FULL_NAME_TEXT_EDEFAULT.equals(getServiceFullNameText());
			case graPackage.DOCUMENT_ROOT__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? getServiceID() != null : !SERVICE_ID_EDEFAULT.equals(getServiceID());
			case graPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				return getServiceIdentification() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE:
				return getServiceInteractionProfile() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES:
				return getServiceInteractionProfiles() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_INTERFACE:
				return getServiceInterface() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS:
				return getServiceLevelAgreements() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT:
				return SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT == null ? getServiceMaximumThroughput() != null : !SERVICE_MAXIMUM_THROUGHPUT_EDEFAULT.equals(getServiceMaximumThroughput());
			case graPackage.DOCUMENT_ROOT__SERVICE_METADATA:
				return getServiceMetadata() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT:
				return SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT == null ? getServiceNameAbbreviationText() != null : !SERVICE_NAME_ABBREVIATION_TEXT_EDEFAULT.equals(getServiceNameAbbreviationText());
			case graPackage.DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS:
				return getServicePolicyAndContracts() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT:
				return SERVICE_PURPOSE_TEXT_EDEFAULT == null ? getServicePurposeText() != null : !SERVICE_PURPOSE_TEXT_EDEFAULT.equals(getServicePurposeText());
			case graPackage.DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS:
				return getServiceRealWorldEffects() != null;
			case graPackage.DOCUMENT_ROOT__SERVICE_RESPONSE_TIME:
				return SERVICE_RESPONSE_TIME_EDEFAULT == null ? getServiceResponseTime() != null : !SERVICE_RESPONSE_TIME_EDEFAULT.equals(getServiceResponseTime());
			case graPackage.DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT:
				return SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT == null ? getServiceScopeDescriptionText() != null : !SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT.equals(getServiceScopeDescriptionText());
			case graPackage.DOCUMENT_ROOT__SERVICE_URI:
				return SERVICE_URI_EDEFAULT == null ? getServiceURI() != null : !SERVICE_URI_EDEFAULT.equals(getServiceURI());
			case graPackage.DOCUMENT_ROOT__SERVICE_USAGE_DETAILS:
				return getServiceUsageDetails() != null;
			case graPackage.DOCUMENT_ROOT__SIP_NAME:
				return SIP_NAME_EDEFAULT == null ? getSIPName() != null : !SIP_NAME_EDEFAULT.equals(getSIPName());
			case graPackage.DOCUMENT_ROOT__SIP_VERSION:
				return SIP_VERSION_EDEFAULT == null ? getSIPVersion() != null : !SIP_VERSION_EDEFAULT.equals(getSIPVersion());
			case graPackage.DOCUMENT_ROOT__SPONSOR:
				return SPONSOR_EDEFAULT == null ? getSponsor() != null : !SPONSOR_EDEFAULT.equals(getSponsor());
			case graPackage.DOCUMENT_ROOT__SPONSORS:
				return getSponsors() != null;
			case graPackage.DOCUMENT_ROOT__UMBRELLA_AGREEMENT:
				return getUmbrellaAgreement() != null;
			case graPackage.DOCUMENT_ROOT__URI_ADDRESS:
				return URI_ADDRESS_EDEFAULT == null ? getURIAddress() != null : !URI_ADDRESS_EDEFAULT.equals(getURIAddress());
			case graPackage.DOCUMENT_ROOT__URI_DESCRIPTION:
				return URI_DESCRIPTION_EDEFAULT == null ? getURIDescription() != null : !URI_DESCRIPTION_EDEFAULT.equals(getURIDescription());
			case graPackage.DOCUMENT_ROOT__URI_DETAIL:
				return getURIDetail() != null;
			case graPackage.DOCUMENT_ROOT__URI_DETAILS:
				return getURIDetails() != null;
			case graPackage.DOCUMENT_ROOT__USAGE_COST_AMOUNT:
				return getUsageCostAmount() != null;
			case graPackage.DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT:
				return getUsageUnitCostAmount() != null;
			case graPackage.DOCUMENT_ROOT__VERSION_INFORMATION:
				return getVersionInformation() != null;
			case graPackage.DOCUMENT_ROOT__CURRENCY_TEXT:
				return CURRENCY_TEXT_EDEFAULT == null ? currencyText != null : !CURRENCY_TEXT_EDEFAULT.equals(currencyText);
			case graPackage.DOCUMENT_ROOT__UNIT_MEASURE_TEXT:
				return UNIT_MEASURE_TEXT_EDEFAULT == null ? unitMeasureText != null : !UNIT_MEASURE_TEXT_EDEFAULT.equals(unitMeasureText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", currencyText: ");
		result.append(currencyText);
		result.append(", unitMeasureText: ");
		result.append(unitMeasureText);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
