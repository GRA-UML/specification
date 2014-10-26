/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.Description;
import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.IepdReference;
import data.grauml.graAnnotationModel.Organization;
import data.grauml.graAnnotationModel.Participant;
import data.grauml.graAnnotationModel.SecurityClassification;
import data.grauml.graAnnotationModel.ServiceCapability;
import data.grauml.graAnnotationModel.ServiceDescription;
import data.grauml.graAnnotationModel.ServiceIdentification;
import data.grauml.graAnnotationModel.ServiceInteraction;
import data.grauml.graAnnotationModel.ServiceInterfaceSpecification;
import data.grauml.graAnnotationModel.ServiceLevelAgreement;
import data.grauml.graAnnotationModel.UseCase;
import data.grauml.graAnnotationModel.util.GraAnnotationModelValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getExchangePartner <em>Exchange Partner</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServicePurpose <em>Service Purpose</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceScopeDescription <em>Service Scope Description</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceCapability <em>Service Capability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceDependency <em>Service Dependency</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getIepdReference <em>Iepd Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceSecurityClassification <em>Service Security Classification</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceLevelAgreement <em>Service Level Agreement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getRelatedOrganization <em>Related Organization</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getEndorsements <em>Endorsements</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getRealWorldEffect <em>Real World Effect</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceInteraction <em>Service Interaction</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getTransformationUri <em>Transformation Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getRevisionVersion <em>Revision Version</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getNextRevisionDate <em>Next Revision Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getAlertAndNotificationUri <em>Alert And Notification Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceDescriptionUri <em>Service Description Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getPrivacy <em>Privacy</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getServiceAssumption <em>Service Assumption</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getOtherRequirement <em>Other Requirement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getDataProvenance <em>Data Provenance</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDescriptionImpl extends ServiceIdentificationImpl implements ServiceDescription {
	/**
	 * The cached value of the '{@link #getExchangePartner() <em>Exchange Partner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePartner()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> exchangePartner;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classification;

	/**
	 * The cached value of the '{@link #getSponsor() <em>Sponsor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sponsor;

	/**
	 * The cached value of the '{@link #getServicePurpose() <em>Service Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePurpose()
	 * @generated
	 * @ordered
	 */
	protected Description servicePurpose;

	/**
	 * The cached value of the '{@link #getServiceScopeDescription() <em>Service Scope Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceScopeDescription()
	 * @generated
	 * @ordered
	 */
	protected Description serviceScopeDescription;

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
	 * The cached value of the '{@link #getServiceDescriptionSummaryText() <em>Service Description Summary Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionSummaryText()
	 * @generated
	 * @ordered
	 */
	protected String serviceDescriptionSummaryText = SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceDescriptionKeywordText() <em>Service Description Keyword Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionKeywordText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceDescriptionKeywordText;

	/**
	 * The cached value of the '{@link #getServiceCapability() <em>Service Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCapability> serviceCapability;

	/**
	 * The cached value of the '{@link #getServiceDependency() <em>Service Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceIdentification> serviceDependency;

	/**
	 * The cached value of the '{@link #getIepdReference() <em>Iepd Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIepdReference()
	 * @generated
	 * @ordered
	 */
	protected EList<IepdReference> iepdReference;

	/**
	 * The cached value of the '{@link #getServiceSecurityClassification() <em>Service Security Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSecurityClassification()
	 * @generated
	 * @ordered
	 */
	protected SecurityClassification serviceSecurityClassification;

	/**
	 * The cached value of the '{@link #getServiceLevelAgreement() <em>Service Level Agreement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelAgreement()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevelAgreement> serviceLevelAgreement;

	/**
	 * The cached value of the '{@link #getRelatedOrganization() <em>Related Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> relatedOrganization;

	/**
	 * The cached value of the '{@link #getServiceInterface() <em>Service Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterfaceSpecification> serviceInterface;

	/**
	 * The default value of the '{@link #getDomainDescription() <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainDescription() <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDescription()
	 * @generated
	 * @ordered
	 */
	protected String domainDescription = DOMAIN_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndorsements() <em>Endorsements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorsements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> endorsements;

	/**
	 * The cached value of the '{@link #getRealWorldEffect() <em>Real World Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealWorldEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> realWorldEffect;

	/**
	 * The cached value of the '{@link #getServiceInteraction() <em>Service Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInteraction> serviceInteraction;

	/**
	 * The default value of the '{@link #getTransformationUri() <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationUri() <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationUri()
	 * @generated
	 * @ordered
	 */
	protected String transformationUri = TRANSFORMATION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int MAJOR_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected int majorVersion = MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int MINOR_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected int minorVersion = MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionVersion() <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisionVersion() <em>Revision Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionVersion()
	 * @generated
	 * @ordered
	 */
	protected int revisionVersion = REVISION_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationDate() <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationDate() <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDate()
	 * @generated
	 * @ordered
	 */
	protected String activationDate = ACTIVATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRevisionDate() <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRevisionDate() <em>Last Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected String lastRevisionDate = LAST_REVISION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextRevisionDate() <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextRevisionDate() <em>Next Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected String nextRevisionDate = NEXT_REVISION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected String expirationDate = EXPIRATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getLifecycleStatus() <em>Lifecycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStatus()
	 * @generated
	 * @ordered
	 */
	protected String lifecycleStatus = LIFECYCLE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlertAndNotificationUri() <em>Alert And Notification Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertAndNotificationUri()
	 * @generated
	 * @ordered
	 */
	protected static final String ALERT_AND_NOTIFICATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlertAndNotificationUri() <em>Alert And Notification Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertAndNotificationUri()
	 * @generated
	 * @ordered
	 */
	protected String alertAndNotificationUri = ALERT_AND_NOTIFICATION_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Description> additionalInformation;

	/**
	 * The default value of the '{@link #getServiceDescriptionUri() <em>Service Description Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DESCRIPTION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDescriptionUri() <em>Service Description Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionUri()
	 * @generated
	 * @ordered
	 */
	protected String serviceDescriptionUri = SERVICE_DESCRIPTION_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutionContext() <em>Execution Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionContext()
	 * @generated
	 * @ordered
	 */
	protected Description executionContext;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Description security;

	/**
	 * The cached value of the '{@link #getPrivacy() <em>Privacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacy()
	 * @generated
	 * @ordered
	 */
	protected Description privacy;

	/**
	 * The cached value of the '{@link #getServiceAssumption() <em>Service Assumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAssumption()
	 * @generated
	 * @ordered
	 */
	protected Description serviceAssumption;

	/**
	 * The cached value of the '{@link #getOtherRequirement() <em>Other Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRequirement()
	 * @generated
	 * @ordered
	 */
	protected Description otherRequirement;

	/**
	 * The cached value of the '{@link #getDataProvenance() <em>Data Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProvenance()
	 * @generated
	 * @ordered
	 */
	protected Description dataProvenance;

	/**
	 * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModel()
	 * @generated
	 * @ordered
	 */
	protected Description processModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.SERVICE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getExchangePartner() {
		if (exchangePartner == null) {
			exchangePartner = new EObjectContainmentEList<Participant>(Participant.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXCHANGE_PARTNER);
		}
		return exchangePartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassification() {
		if (classification == null) {
			classification = new EDataTypeUniqueEList<String>(String.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSponsor() {
		if (sponsor == null) {
			sponsor = new EDataTypeUniqueEList<String>(String.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SPONSOR);
		}
		return sponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getServicePurpose() {
		return servicePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicePurpose(Description newServicePurpose, NotificationChain msgs) {
		Description oldServicePurpose = servicePurpose;
		servicePurpose = newServicePurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE, oldServicePurpose, newServicePurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePurpose(Description newServicePurpose) {
		if (newServicePurpose != servicePurpose) {
			NotificationChain msgs = null;
			if (servicePurpose != null)
				msgs = ((InternalEObject)servicePurpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE, null, msgs);
			if (newServicePurpose != null)
				msgs = ((InternalEObject)newServicePurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE, null, msgs);
			msgs = basicSetServicePurpose(newServicePurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE, newServicePurpose, newServicePurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getServiceScopeDescription() {
		return serviceScopeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceScopeDescription(Description newServiceScopeDescription, NotificationChain msgs) {
		Description oldServiceScopeDescription = serviceScopeDescription;
		serviceScopeDescription = newServiceScopeDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION, oldServiceScopeDescription, newServiceScopeDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceScopeDescription(Description newServiceScopeDescription) {
		if (newServiceScopeDescription != serviceScopeDescription) {
			NotificationChain msgs = null;
			if (serviceScopeDescription != null)
				msgs = ((InternalEObject)serviceScopeDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION, null, msgs);
			if (newServiceScopeDescription != null)
				msgs = ((InternalEObject)newServiceScopeDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION, null, msgs);
			msgs = basicSetServiceScopeDescription(newServiceScopeDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION, newServiceScopeDescription, newServiceScopeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDescriptionSummaryText() {
		return serviceDescriptionSummaryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionSummaryText(String newServiceDescriptionSummaryText) {
		String oldServiceDescriptionSummaryText = serviceDescriptionSummaryText;
		serviceDescriptionSummaryText = newServiceDescriptionSummaryText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT, oldServiceDescriptionSummaryText, serviceDescriptionSummaryText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceDescriptionKeywordText() {
		if (serviceDescriptionKeywordText == null) {
			serviceDescriptionKeywordText = new EDataTypeUniqueEList<String>(String.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT);
		}
		return serviceDescriptionKeywordText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceCapability> getServiceCapability() {
		if (serviceCapability == null) {
			serviceCapability = new EObjectContainmentEList<ServiceCapability>(ServiceCapability.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_CAPABILITY);
		}
		return serviceCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceIdentification> getServiceDependency() {
		if (serviceDependency == null) {
			serviceDependency = new EObjectContainmentEList<ServiceIdentification>(ServiceIdentification.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DEPENDENCY);
		}
		return serviceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IepdReference> getIepdReference() {
		if (iepdReference == null) {
			iepdReference = new EObjectContainmentEList<IepdReference>(IepdReference.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__IEPD_REFERENCE);
		}
		return iepdReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassification getServiceSecurityClassification() {
		return serviceSecurityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSecurityClassification(SecurityClassification newServiceSecurityClassification, NotificationChain msgs) {
		SecurityClassification oldServiceSecurityClassification = serviceSecurityClassification;
		serviceSecurityClassification = newServiceSecurityClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION, oldServiceSecurityClassification, newServiceSecurityClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSecurityClassification(SecurityClassification newServiceSecurityClassification) {
		if (newServiceSecurityClassification != serviceSecurityClassification) {
			NotificationChain msgs = null;
			if (serviceSecurityClassification != null)
				msgs = ((InternalEObject)serviceSecurityClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION, null, msgs);
			if (newServiceSecurityClassification != null)
				msgs = ((InternalEObject)newServiceSecurityClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION, null, msgs);
			msgs = basicSetServiceSecurityClassification(newServiceSecurityClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION, newServiceSecurityClassification, newServiceSecurityClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevelAgreement> getServiceLevelAgreement() {
		if (serviceLevelAgreement == null) {
			serviceLevelAgreement = new EObjectContainmentEList<ServiceLevelAgreement>(ServiceLevelAgreement.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT);
		}
		return serviceLevelAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getRelatedOrganization() {
		if (relatedOrganization == null) {
			relatedOrganization = new EObjectContainmentEList<Organization>(Organization.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__RELATED_ORGANIZATION);
		}
		return relatedOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterfaceSpecification> getServiceInterface() {
		if (serviceInterface == null) {
			serviceInterface = new EObjectContainmentEList<ServiceInterfaceSpecification>(ServiceInterfaceSpecification.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERFACE);
		}
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainDescription() {
		return domainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDescription(String newDomainDescription) {
		String oldDomainDescription = domainDescription;
		domainDescription = newDomainDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION, oldDomainDescription, domainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEndorsements() {
		if (endorsements == null) {
			endorsements = new EDataTypeUniqueEList<String>(String.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__ENDORSEMENTS);
		}
		return endorsements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getRealWorldEffect() {
		if (realWorldEffect == null) {
			realWorldEffect = new EObjectContainmentEList<UseCase>(UseCase.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__REAL_WORLD_EFFECT);
		}
		return realWorldEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInteraction> getServiceInteraction() {
		if (serviceInteraction == null) {
			serviceInteraction = new EObjectContainmentEList<ServiceInteraction>(ServiceInteraction.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERACTION);
		}
		return serviceInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationUri() {
		return transformationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationUri(String newTransformationUri) {
		String oldTransformationUri = transformationUri;
		transformationUri = newTransformationUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__TRANSFORMATION_URI, oldTransformationUri, transformationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMajorVersion() {
		return majorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorVersion(int newMajorVersion) {
		int oldMajorVersion = majorVersion;
		majorVersion = newMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__MAJOR_VERSION, oldMajorVersion, majorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinorVersion() {
		return minorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorVersion(int newMinorVersion) {
		int oldMinorVersion = minorVersion;
		minorVersion = newMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__MINOR_VERSION, oldMinorVersion, minorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevisionVersion() {
		return revisionVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionVersion(int newRevisionVersion) {
		int oldRevisionVersion = revisionVersion;
		revisionVersion = newRevisionVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__REVISION_VERSION, oldRevisionVersion, revisionVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(String newCreationDate) {
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivationDate() {
		return activationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationDate(String newActivationDate) {
		String oldActivationDate = activationDate;
		activationDate = newActivationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__ACTIVATION_DATE, oldActivationDate, activationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastRevisionDate() {
		return lastRevisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionDate(String newLastRevisionDate) {
		String oldLastRevisionDate = lastRevisionDate;
		lastRevisionDate = newLastRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__LAST_REVISION_DATE, oldLastRevisionDate, lastRevisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextRevisionDate() {
		return nextRevisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextRevisionDate(String newNextRevisionDate) {
		String oldNextRevisionDate = nextRevisionDate;
		nextRevisionDate = newNextRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__NEXT_REVISION_DATE, oldNextRevisionDate, nextRevisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(String newExpirationDate) {
		String oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLifecycleStatus() {
		return lifecycleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycleStatus(String newLifecycleStatus) {
		String oldLifecycleStatus = lifecycleStatus;
		lifecycleStatus = newLifecycleStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__LIFECYCLE_STATUS, oldLifecycleStatus, lifecycleStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlertAndNotificationUri() {
		return alertAndNotificationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlertAndNotificationUri(String newAlertAndNotificationUri) {
		String oldAlertAndNotificationUri = alertAndNotificationUri;
		alertAndNotificationUri = newAlertAndNotificationUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI, oldAlertAndNotificationUri, alertAndNotificationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description> getAdditionalInformation() {
		if (additionalInformation == null) {
			additionalInformation = new EObjectContainmentEList<Description>(Description.class, this, GraAnnotationModelPackage.SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION);
		}
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDescriptionUri() {
		return serviceDescriptionUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionUri(String newServiceDescriptionUri) {
		String oldServiceDescriptionUri = serviceDescriptionUri;
		serviceDescriptionUri = newServiceDescriptionUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI, oldServiceDescriptionUri, serviceDescriptionUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getExecutionContext() {
		return executionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionContext(Description newExecutionContext, NotificationChain msgs) {
		Description oldExecutionContext = executionContext;
		executionContext = newExecutionContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT, oldExecutionContext, newExecutionContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionContext(Description newExecutionContext) {
		if (newExecutionContext != executionContext) {
			NotificationChain msgs = null;
			if (executionContext != null)
				msgs = ((InternalEObject)executionContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT, null, msgs);
			if (newExecutionContext != null)
				msgs = ((InternalEObject)newExecutionContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT, null, msgs);
			msgs = basicSetExecutionContext(newExecutionContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT, newExecutionContext, newExecutionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(Description newSecurity, NotificationChain msgs) {
		Description oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY, oldSecurity, newSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(Description newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getPrivacy() {
		return privacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrivacy(Description newPrivacy, NotificationChain msgs) {
		Description oldPrivacy = privacy;
		privacy = newPrivacy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY, oldPrivacy, newPrivacy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacy(Description newPrivacy) {
		if (newPrivacy != privacy) {
			NotificationChain msgs = null;
			if (privacy != null)
				msgs = ((InternalEObject)privacy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY, null, msgs);
			if (newPrivacy != null)
				msgs = ((InternalEObject)newPrivacy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY, null, msgs);
			msgs = basicSetPrivacy(newPrivacy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY, newPrivacy, newPrivacy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getServiceAssumption() {
		return serviceAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceAssumption(Description newServiceAssumption, NotificationChain msgs) {
		Description oldServiceAssumption = serviceAssumption;
		serviceAssumption = newServiceAssumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION, oldServiceAssumption, newServiceAssumption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAssumption(Description newServiceAssumption) {
		if (newServiceAssumption != serviceAssumption) {
			NotificationChain msgs = null;
			if (serviceAssumption != null)
				msgs = ((InternalEObject)serviceAssumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION, null, msgs);
			if (newServiceAssumption != null)
				msgs = ((InternalEObject)newServiceAssumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION, null, msgs);
			msgs = basicSetServiceAssumption(newServiceAssumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION, newServiceAssumption, newServiceAssumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getOtherRequirement() {
		return otherRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherRequirement(Description newOtherRequirement, NotificationChain msgs) {
		Description oldOtherRequirement = otherRequirement;
		otherRequirement = newOtherRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT, oldOtherRequirement, newOtherRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherRequirement(Description newOtherRequirement) {
		if (newOtherRequirement != otherRequirement) {
			NotificationChain msgs = null;
			if (otherRequirement != null)
				msgs = ((InternalEObject)otherRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT, null, msgs);
			if (newOtherRequirement != null)
				msgs = ((InternalEObject)newOtherRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT, null, msgs);
			msgs = basicSetOtherRequirement(newOtherRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT, newOtherRequirement, newOtherRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDataProvenance() {
		return dataProvenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProvenance(Description newDataProvenance, NotificationChain msgs) {
		Description oldDataProvenance = dataProvenance;
		dataProvenance = newDataProvenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE, oldDataProvenance, newDataProvenance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProvenance(Description newDataProvenance) {
		if (newDataProvenance != dataProvenance) {
			NotificationChain msgs = null;
			if (dataProvenance != null)
				msgs = ((InternalEObject)dataProvenance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE, null, msgs);
			if (newDataProvenance != null)
				msgs = ((InternalEObject)newDataProvenance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE, null, msgs);
			msgs = basicSetDataProvenance(newDataProvenance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE, newDataProvenance, newDataProvenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getProcessModel() {
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessModel(Description newProcessModel, NotificationChain msgs) {
		Description oldProcessModel = processModel;
		processModel = newProcessModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL, oldProcessModel, newProcessModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessModel(Description newProcessModel) {
		if (newProcessModel != processModel) {
			NotificationChain msgs = null;
			if (processModel != null)
				msgs = ((InternalEObject)processModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL, null, msgs);
			if (newProcessModel != null)
				msgs = ((InternalEObject)newProcessModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL, null, msgs);
			msgs = basicSetProcessModel(newProcessModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL, newProcessModel, newProcessModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean realizesCollaborationAndUsesIepd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 GraAnnotationModelValidator.DIAGNOSTIC_SOURCE,
						 GraAnnotationModelValidator.SERVICE_DESCRIPTION__REALIZES_COLLABORATION_AND_USES_IEPD,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "realizesCollaborationAndUsesIepd", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exchangePartnerDerivation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 GraAnnotationModelValidator.DIAGNOSTIC_SOURCE,
						 GraAnnotationModelValidator.SERVICE_DESCRIPTION__EXCHANGE_PARTNER_DERIVATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "exchangePartnerDerivation", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXCHANGE_PARTNER:
				return ((InternalEList<?>)getExchangePartner()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE:
				return basicSetServicePurpose(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION:
				return basicSetServiceScopeDescription(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_CAPABILITY:
				return ((InternalEList<?>)getServiceCapability()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DEPENDENCY:
				return ((InternalEList<?>)getServiceDependency()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__IEPD_REFERENCE:
				return ((InternalEList<?>)getIepdReference()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION:
				return basicSetServiceSecurityClassification(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT:
				return ((InternalEList<?>)getServiceLevelAgreement()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__RELATED_ORGANIZATION:
				return ((InternalEList<?>)getRelatedOrganization()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERFACE:
				return ((InternalEList<?>)getServiceInterface()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REAL_WORLD_EFFECT:
				return ((InternalEList<?>)getRealWorldEffect()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERACTION:
				return ((InternalEList<?>)getServiceInteraction()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION:
				return ((InternalEList<?>)getAdditionalInformation()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT:
				return basicSetExecutionContext(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY:
				return basicSetSecurity(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY:
				return basicSetPrivacy(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION:
				return basicSetServiceAssumption(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT:
				return basicSetOtherRequirement(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE:
				return basicSetDataProvenance(null, msgs);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL:
				return basicSetProcessModel(null, msgs);
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
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXCHANGE_PARTNER:
				return getExchangePartner();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CLASSIFICATION:
				return getClassification();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SPONSOR:
				return getSponsor();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE:
				return getServicePurpose();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION:
				return getServiceScopeDescription();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				return getServiceDescriptionSummaryText();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				return getServiceDescriptionKeywordText();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_CAPABILITY:
				return getServiceCapability();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DEPENDENCY:
				return getServiceDependency();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__IEPD_REFERENCE:
				return getIepdReference();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION:
				return getServiceSecurityClassification();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT:
				return getServiceLevelAgreement();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__RELATED_ORGANIZATION:
				return getRelatedOrganization();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERFACE:
				return getServiceInterface();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION:
				return getDomainDescription();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ENDORSEMENTS:
				return getEndorsements();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REAL_WORLD_EFFECT:
				return getRealWorldEffect();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERACTION:
				return getServiceInteraction();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__TRANSFORMATION_URI:
				return getTransformationUri();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MAJOR_VERSION:
				return getMajorVersion();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MINOR_VERSION:
				return getMinorVersion();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REVISION_VERSION:
				return getRevisionVersion();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CREATION_DATE:
				return getCreationDate();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ACTIVATION_DATE:
				return getActivationDate();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LAST_REVISION_DATE:
				return getLastRevisionDate();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__NEXT_REVISION_DATE:
				return getNextRevisionDate();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXPIRATION_DATE:
				return getExpirationDate();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LIFECYCLE_STATUS:
				return getLifecycleStatus();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI:
				return getAlertAndNotificationUri();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI:
				return getServiceDescriptionUri();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT:
				return getExecutionContext();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY:
				return getSecurity();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY:
				return getPrivacy();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION:
				return getServiceAssumption();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT:
				return getOtherRequirement();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE:
				return getDataProvenance();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL:
				return getProcessModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXCHANGE_PARTNER:
				getExchangePartner().clear();
				getExchangePartner().addAll((Collection<? extends Participant>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends String>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SPONSOR:
				getSponsor().clear();
				getSponsor().addAll((Collection<? extends String>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE:
				setServicePurpose((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION:
				setServiceScopeDescription((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				setServiceDescriptionSummaryText((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				getServiceDescriptionKeywordText().clear();
				getServiceDescriptionKeywordText().addAll((Collection<? extends String>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_CAPABILITY:
				getServiceCapability().clear();
				getServiceCapability().addAll((Collection<? extends ServiceCapability>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DEPENDENCY:
				getServiceDependency().clear();
				getServiceDependency().addAll((Collection<? extends ServiceIdentification>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__IEPD_REFERENCE:
				getIepdReference().clear();
				getIepdReference().addAll((Collection<? extends IepdReference>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION:
				setServiceSecurityClassification((SecurityClassification)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT:
				getServiceLevelAgreement().clear();
				getServiceLevelAgreement().addAll((Collection<? extends ServiceLevelAgreement>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__RELATED_ORGANIZATION:
				getRelatedOrganization().clear();
				getRelatedOrganization().addAll((Collection<? extends Organization>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERFACE:
				getServiceInterface().clear();
				getServiceInterface().addAll((Collection<? extends ServiceInterfaceSpecification>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION:
				setDomainDescription((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ENDORSEMENTS:
				getEndorsements().clear();
				getEndorsements().addAll((Collection<? extends String>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REAL_WORLD_EFFECT:
				getRealWorldEffect().clear();
				getRealWorldEffect().addAll((Collection<? extends UseCase>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERACTION:
				getServiceInteraction().clear();
				getServiceInteraction().addAll((Collection<? extends ServiceInteraction>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__TRANSFORMATION_URI:
				setTransformationUri((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MAJOR_VERSION:
				setMajorVersion((Integer)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MINOR_VERSION:
				setMinorVersion((Integer)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REVISION_VERSION:
				setRevisionVersion((Integer)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CREATION_DATE:
				setCreationDate((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ACTIVATION_DATE:
				setActivationDate((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LAST_REVISION_DATE:
				setLastRevisionDate((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__NEXT_REVISION_DATE:
				setNextRevisionDate((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXPIRATION_DATE:
				setExpirationDate((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LIFECYCLE_STATUS:
				setLifecycleStatus((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI:
				setAlertAndNotificationUri((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION:
				getAdditionalInformation().clear();
				getAdditionalInformation().addAll((Collection<? extends Description>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI:
				setServiceDescriptionUri((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT:
				setExecutionContext((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY:
				setSecurity((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY:
				setPrivacy((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION:
				setServiceAssumption((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT:
				setOtherRequirement((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE:
				setDataProvenance((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL:
				setProcessModel((Description)newValue);
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
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXCHANGE_PARTNER:
				getExchangePartner().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CLASSIFICATION:
				getClassification().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SPONSOR:
				getSponsor().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE:
				setServicePurpose((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION:
				setServiceScopeDescription((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				setServiceDescriptionSummaryText(SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				getServiceDescriptionKeywordText().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_CAPABILITY:
				getServiceCapability().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DEPENDENCY:
				getServiceDependency().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__IEPD_REFERENCE:
				getIepdReference().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION:
				setServiceSecurityClassification((SecurityClassification)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT:
				getServiceLevelAgreement().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__RELATED_ORGANIZATION:
				getRelatedOrganization().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERFACE:
				getServiceInterface().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION:
				setDomainDescription(DOMAIN_DESCRIPTION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ENDORSEMENTS:
				getEndorsements().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REAL_WORLD_EFFECT:
				getRealWorldEffect().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERACTION:
				getServiceInteraction().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__TRANSFORMATION_URI:
				setTransformationUri(TRANSFORMATION_URI_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MAJOR_VERSION:
				setMajorVersion(MAJOR_VERSION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MINOR_VERSION:
				setMinorVersion(MINOR_VERSION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REVISION_VERSION:
				setRevisionVersion(REVISION_VERSION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ACTIVATION_DATE:
				setActivationDate(ACTIVATION_DATE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LAST_REVISION_DATE:
				setLastRevisionDate(LAST_REVISION_DATE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__NEXT_REVISION_DATE:
				setNextRevisionDate(NEXT_REVISION_DATE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LIFECYCLE_STATUS:
				setLifecycleStatus(LIFECYCLE_STATUS_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI:
				setAlertAndNotificationUri(ALERT_AND_NOTIFICATION_URI_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION:
				getAdditionalInformation().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI:
				setServiceDescriptionUri(SERVICE_DESCRIPTION_URI_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT:
				setExecutionContext((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY:
				setSecurity((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY:
				setPrivacy((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION:
				setServiceAssumption((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT:
				setOtherRequirement((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE:
				setDataProvenance((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL:
				setProcessModel((Description)null);
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
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXCHANGE_PARTNER:
				return exchangePartner != null && !exchangePartner.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SPONSOR:
				return sponsor != null && !sponsor.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_PURPOSE:
				return servicePurpose != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION:
				return serviceScopeDescription != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				return SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT == null ? serviceDescriptionSummaryText != null : !SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT.equals(serviceDescriptionSummaryText);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				return serviceDescriptionKeywordText != null && !serviceDescriptionKeywordText.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_CAPABILITY:
				return serviceCapability != null && !serviceCapability.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DEPENDENCY:
				return serviceDependency != null && !serviceDependency.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__IEPD_REFERENCE:
				return iepdReference != null && !iepdReference.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION:
				return serviceSecurityClassification != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT:
				return serviceLevelAgreement != null && !serviceLevelAgreement.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__RELATED_ORGANIZATION:
				return relatedOrganization != null && !relatedOrganization.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERFACE:
				return serviceInterface != null && !serviceInterface.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION:
				return DOMAIN_DESCRIPTION_EDEFAULT == null ? domainDescription != null : !DOMAIN_DESCRIPTION_EDEFAULT.equals(domainDescription);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ENDORSEMENTS:
				return endorsements != null && !endorsements.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REAL_WORLD_EFFECT:
				return realWorldEffect != null && !realWorldEffect.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_INTERACTION:
				return serviceInteraction != null && !serviceInteraction.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__TRANSFORMATION_URI:
				return TRANSFORMATION_URI_EDEFAULT == null ? transformationUri != null : !TRANSFORMATION_URI_EDEFAULT.equals(transformationUri);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MAJOR_VERSION:
				return majorVersion != MAJOR_VERSION_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__MINOR_VERSION:
				return minorVersion != MINOR_VERSION_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__REVISION_VERSION:
				return revisionVersion != REVISION_VERSION_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ACTIVATION_DATE:
				return ACTIVATION_DATE_EDEFAULT == null ? activationDate != null : !ACTIVATION_DATE_EDEFAULT.equals(activationDate);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LAST_REVISION_DATE:
				return LAST_REVISION_DATE_EDEFAULT == null ? lastRevisionDate != null : !LAST_REVISION_DATE_EDEFAULT.equals(lastRevisionDate);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__NEXT_REVISION_DATE:
				return NEXT_REVISION_DATE_EDEFAULT == null ? nextRevisionDate != null : !NEXT_REVISION_DATE_EDEFAULT.equals(nextRevisionDate);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__LIFECYCLE_STATUS:
				return LIFECYCLE_STATUS_EDEFAULT == null ? lifecycleStatus != null : !LIFECYCLE_STATUS_EDEFAULT.equals(lifecycleStatus);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI:
				return ALERT_AND_NOTIFICATION_URI_EDEFAULT == null ? alertAndNotificationUri != null : !ALERT_AND_NOTIFICATION_URI_EDEFAULT.equals(alertAndNotificationUri);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION:
				return additionalInformation != null && !additionalInformation.isEmpty();
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI:
				return SERVICE_DESCRIPTION_URI_EDEFAULT == null ? serviceDescriptionUri != null : !SERVICE_DESCRIPTION_URI_EDEFAULT.equals(serviceDescriptionUri);
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__EXECUTION_CONTEXT:
				return executionContext != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SECURITY:
				return security != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PRIVACY:
				return privacy != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__SERVICE_ASSUMPTION:
				return serviceAssumption != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__OTHER_REQUIREMENT:
				return otherRequirement != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__DATA_PROVENANCE:
				return dataProvenance != null;
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION__PROCESS_MODEL:
				return processModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION___REALIZES_COLLABORATION_AND_USES_IEPD__DIAGNOSTICCHAIN_MAP:
				return realizesCollaborationAndUsesIepd((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case GraAnnotationModelPackage.SERVICE_DESCRIPTION___EXCHANGE_PARTNER_DERIVATION__DIAGNOSTICCHAIN_MAP:
				return exchangePartnerDerivation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (classification: ");
		result.append(classification);
		result.append(", sponsor: ");
		result.append(sponsor);
		result.append(", serviceDescriptionSummaryText: ");
		result.append(serviceDescriptionSummaryText);
		result.append(", serviceDescriptionKeywordText: ");
		result.append(serviceDescriptionKeywordText);
		result.append(", domainDescription: ");
		result.append(domainDescription);
		result.append(", endorsements: ");
		result.append(endorsements);
		result.append(", transformationUri: ");
		result.append(transformationUri);
		result.append(", majorVersion: ");
		result.append(majorVersion);
		result.append(", minorVersion: ");
		result.append(minorVersion);
		result.append(", revisionVersion: ");
		result.append(revisionVersion);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", activationDate: ");
		result.append(activationDate);
		result.append(", lastRevisionDate: ");
		result.append(lastRevisionDate);
		result.append(", nextRevisionDate: ");
		result.append(nextRevisionDate);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(", lifecycleStatus: ");
		result.append(lifecycleStatus);
		result.append(", alertAndNotificationUri: ");
		result.append(alertAndNotificationUri);
		result.append(", serviceDescriptionUri: ");
		result.append(serviceDescriptionUri);
		result.append(')');
		return result.toString();
	}

} //ServiceDescriptionImpl
