/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.InteractionRequirements;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isServiceConsumerAuthentication <em>Service Consumer Authentication</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isServiceConsumerAuthorization <em>Service Consumer Authorization</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isIdentityAndAttributeAssertionTransmission <em>Identity And Attribute Assertion Transmission</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isServiceAuthentication <em>Service Authentication</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isMessageNonrepudiation <em>Message Nonrepudiation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isMessageIntegrity <em>Message Integrity</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isMessageConfidentiality <em>Message Confidentiality</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isMessageAddressing <em>Message Addressing</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isReliability <em>Reliability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isTransactionSupport <em>Transaction Support</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isServiceMetadataAvailability <em>Service Metadata Availability</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isInterfaceDescriptionRequirements <em>Interface Description Requirements</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isLogging <em>Logging</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#isServiceResponsiveness <em>Service Responsiveness</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl#getExtendedRequirement <em>Extended Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionRequirementsImpl extends MinimalEObjectImpl.Container implements InteractionRequirements {
	/**
	 * The default value of the '{@link #isServiceConsumerAuthentication() <em>Service Consumer Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceConsumerAuthentication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_CONSUMER_AUTHENTICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceConsumerAuthentication() <em>Service Consumer Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceConsumerAuthentication()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceConsumerAuthentication = SERVICE_CONSUMER_AUTHENTICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isServiceConsumerAuthorization() <em>Service Consumer Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceConsumerAuthorization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_CONSUMER_AUTHORIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceConsumerAuthorization() <em>Service Consumer Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceConsumerAuthorization()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceConsumerAuthorization = SERVICE_CONSUMER_AUTHORIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdentityAndAttributeAssertionTransmission() <em>Identity And Attribute Assertion Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentityAndAttributeAssertionTransmission()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdentityAndAttributeAssertionTransmission() <em>Identity And Attribute Assertion Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentityAndAttributeAssertionTransmission()
	 * @generated
	 * @ordered
	 */
	protected boolean identityAndAttributeAssertionTransmission = IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isServiceAuthentication() <em>Service Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceAuthentication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_AUTHENTICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceAuthentication() <em>Service Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceAuthentication()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceAuthentication = SERVICE_AUTHENTICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isMessageNonrepudiation() <em>Message Nonrepudiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageNonrepudiation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_NONREPUDIATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMessageNonrepudiation() <em>Message Nonrepudiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageNonrepudiation()
	 * @generated
	 * @ordered
	 */
	protected boolean messageNonrepudiation = MESSAGE_NONREPUDIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isMessageIntegrity() <em>Message Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_INTEGRITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMessageIntegrity() <em>Message Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageIntegrity()
	 * @generated
	 * @ordered
	 */
	protected boolean messageIntegrity = MESSAGE_INTEGRITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isMessageConfidentiality() <em>Message Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_CONFIDENTIALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMessageConfidentiality() <em>Message Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected boolean messageConfidentiality = MESSAGE_CONFIDENTIALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isMessageAddressing() <em>Message Addressing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageAddressing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_ADDRESSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMessageAddressing() <em>Message Addressing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageAddressing()
	 * @generated
	 * @ordered
	 */
	protected boolean messageAddressing = MESSAGE_ADDRESSING_EDEFAULT;

	/**
	 * The default value of the '{@link #isReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReliability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELIABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReliability()
	 * @generated
	 * @ordered
	 */
	protected boolean reliability = RELIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransactionSupport() <em>Transaction Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransactionSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSACTION_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransactionSupport() <em>Transaction Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransactionSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean transactionSupport = TRANSACTION_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isServiceMetadataAvailability() <em>Service Metadata Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceMetadataAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_METADATA_AVAILABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceMetadataAvailability() <em>Service Metadata Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceMetadataAvailability()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceMetadataAvailability = SERVICE_METADATA_AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterfaceDescriptionRequirements() <em>Interface Description Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterfaceDescriptionRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_DESCRIPTION_REQUIREMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterfaceDescriptionRequirements() <em>Interface Description Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterfaceDescriptionRequirements()
	 * @generated
	 * @ordered
	 */
	protected boolean interfaceDescriptionRequirements = INTERFACE_DESCRIPTION_REQUIREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogging() <em>Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOGGING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogging() <em>Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogging()
	 * @generated
	 * @ordered
	 */
	protected boolean logging = LOGGING_EDEFAULT;

	/**
	 * The default value of the '{@link #isServiceResponsiveness() <em>Service Responsiveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceResponsiveness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_RESPONSIVENESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceResponsiveness() <em>Service Responsiveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceResponsiveness()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceResponsiveness = SERVICE_RESPONSIVENESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedRequirement() <em>Extended Requirement</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extendedRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.INTERACTION_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServiceConsumerAuthentication() {
		return serviceConsumerAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConsumerAuthentication(boolean newServiceConsumerAuthentication) {
		boolean oldServiceConsumerAuthentication = serviceConsumerAuthentication;
		serviceConsumerAuthentication = newServiceConsumerAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION, oldServiceConsumerAuthentication, serviceConsumerAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServiceConsumerAuthorization() {
		return serviceConsumerAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConsumerAuthorization(boolean newServiceConsumerAuthorization) {
		boolean oldServiceConsumerAuthorization = serviceConsumerAuthorization;
		serviceConsumerAuthorization = newServiceConsumerAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION, oldServiceConsumerAuthorization, serviceConsumerAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdentityAndAttributeAssertionTransmission() {
		return identityAndAttributeAssertionTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityAndAttributeAssertionTransmission(boolean newIdentityAndAttributeAssertionTransmission) {
		boolean oldIdentityAndAttributeAssertionTransmission = identityAndAttributeAssertionTransmission;
		identityAndAttributeAssertionTransmission = newIdentityAndAttributeAssertionTransmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION, oldIdentityAndAttributeAssertionTransmission, identityAndAttributeAssertionTransmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServiceAuthentication() {
		return serviceAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAuthentication(boolean newServiceAuthentication) {
		boolean oldServiceAuthentication = serviceAuthentication;
		serviceAuthentication = newServiceAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION, oldServiceAuthentication, serviceAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageNonrepudiation() {
		return messageNonrepudiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageNonrepudiation(boolean newMessageNonrepudiation) {
		boolean oldMessageNonrepudiation = messageNonrepudiation;
		messageNonrepudiation = newMessageNonrepudiation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION, oldMessageNonrepudiation, messageNonrepudiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageIntegrity() {
		return messageIntegrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageIntegrity(boolean newMessageIntegrity) {
		boolean oldMessageIntegrity = messageIntegrity;
		messageIntegrity = newMessageIntegrity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY, oldMessageIntegrity, messageIntegrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageConfidentiality() {
		return messageConfidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageConfidentiality(boolean newMessageConfidentiality) {
		boolean oldMessageConfidentiality = messageConfidentiality;
		messageConfidentiality = newMessageConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY, oldMessageConfidentiality, messageConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageAddressing() {
		return messageAddressing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageAddressing(boolean newMessageAddressing) {
		boolean oldMessageAddressing = messageAddressing;
		messageAddressing = newMessageAddressing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING, oldMessageAddressing, messageAddressing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(boolean newReliability) {
		boolean oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__RELIABILITY, oldReliability, reliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransactionSupport() {
		return transactionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionSupport(boolean newTransactionSupport) {
		boolean oldTransactionSupport = transactionSupport;
		transactionSupport = newTransactionSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT, oldTransactionSupport, transactionSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServiceMetadataAvailability() {
		return serviceMetadataAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceMetadataAvailability(boolean newServiceMetadataAvailability) {
		boolean oldServiceMetadataAvailability = serviceMetadataAvailability;
		serviceMetadataAvailability = newServiceMetadataAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY, oldServiceMetadataAvailability, serviceMetadataAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterfaceDescriptionRequirements() {
		return interfaceDescriptionRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDescriptionRequirements(boolean newInterfaceDescriptionRequirements) {
		boolean oldInterfaceDescriptionRequirements = interfaceDescriptionRequirements;
		interfaceDescriptionRequirements = newInterfaceDescriptionRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS, oldInterfaceDescriptionRequirements, interfaceDescriptionRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogging() {
		return logging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogging(boolean newLogging) {
		boolean oldLogging = logging;
		logging = newLogging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__LOGGING, oldLogging, logging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServiceResponsiveness() {
		return serviceResponsiveness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceResponsiveness(boolean newServiceResponsiveness) {
		boolean oldServiceResponsiveness = serviceResponsiveness;
		serviceResponsiveness = newServiceResponsiveness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS, oldServiceResponsiveness, serviceResponsiveness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtendedRequirement() {
		if (extendedRequirement == null) {
			extendedRequirement = new EDataTypeUniqueEList<String>(String.class, this, GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT);
		}
		return extendedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION:
				return isServiceConsumerAuthentication();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION:
				return isServiceConsumerAuthorization();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION:
				return isIdentityAndAttributeAssertionTransmission();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION:
				return isServiceAuthentication();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION:
				return isMessageNonrepudiation();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY:
				return isMessageIntegrity();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY:
				return isMessageConfidentiality();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING:
				return isMessageAddressing();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__RELIABILITY:
				return isReliability();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT:
				return isTransactionSupport();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY:
				return isServiceMetadataAvailability();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS:
				return isInterfaceDescriptionRequirements();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__LOGGING:
				return isLogging();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS:
				return isServiceResponsiveness();
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT:
				return getExtendedRequirement();
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
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION:
				setServiceConsumerAuthentication((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION:
				setServiceConsumerAuthorization((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION:
				setIdentityAndAttributeAssertionTransmission((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION:
				setServiceAuthentication((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION:
				setMessageNonrepudiation((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY:
				setMessageIntegrity((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY:
				setMessageConfidentiality((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING:
				setMessageAddressing((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__RELIABILITY:
				setReliability((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT:
				setTransactionSupport((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY:
				setServiceMetadataAvailability((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS:
				setInterfaceDescriptionRequirements((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__LOGGING:
				setLogging((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS:
				setServiceResponsiveness((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT:
				getExtendedRequirement().clear();
				getExtendedRequirement().addAll((Collection<? extends String>)newValue);
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
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION:
				setServiceConsumerAuthentication(SERVICE_CONSUMER_AUTHENTICATION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION:
				setServiceConsumerAuthorization(SERVICE_CONSUMER_AUTHORIZATION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION:
				setIdentityAndAttributeAssertionTransmission(IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION:
				setServiceAuthentication(SERVICE_AUTHENTICATION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION:
				setMessageNonrepudiation(MESSAGE_NONREPUDIATION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY:
				setMessageIntegrity(MESSAGE_INTEGRITY_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY:
				setMessageConfidentiality(MESSAGE_CONFIDENTIALITY_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING:
				setMessageAddressing(MESSAGE_ADDRESSING_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__RELIABILITY:
				setReliability(RELIABILITY_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT:
				setTransactionSupport(TRANSACTION_SUPPORT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY:
				setServiceMetadataAvailability(SERVICE_METADATA_AVAILABILITY_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS:
				setInterfaceDescriptionRequirements(INTERFACE_DESCRIPTION_REQUIREMENTS_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__LOGGING:
				setLogging(LOGGING_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS:
				setServiceResponsiveness(SERVICE_RESPONSIVENESS_EDEFAULT);
				return;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT:
				getExtendedRequirement().clear();
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
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION:
				return serviceConsumerAuthentication != SERVICE_CONSUMER_AUTHENTICATION_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION:
				return serviceConsumerAuthorization != SERVICE_CONSUMER_AUTHORIZATION_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION:
				return identityAndAttributeAssertionTransmission != IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION:
				return serviceAuthentication != SERVICE_AUTHENTICATION_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION:
				return messageNonrepudiation != MESSAGE_NONREPUDIATION_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY:
				return messageIntegrity != MESSAGE_INTEGRITY_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY:
				return messageConfidentiality != MESSAGE_CONFIDENTIALITY_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING:
				return messageAddressing != MESSAGE_ADDRESSING_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__RELIABILITY:
				return reliability != RELIABILITY_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT:
				return transactionSupport != TRANSACTION_SUPPORT_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY:
				return serviceMetadataAvailability != SERVICE_METADATA_AVAILABILITY_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS:
				return interfaceDescriptionRequirements != INTERFACE_DESCRIPTION_REQUIREMENTS_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__LOGGING:
				return logging != LOGGING_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS:
				return serviceResponsiveness != SERVICE_RESPONSIVENESS_EDEFAULT;
			case GraAnnotationModelPackage.INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT:
				return extendedRequirement != null && !extendedRequirement.isEmpty();
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
		result.append(" (serviceConsumerAuthentication: ");
		result.append(serviceConsumerAuthentication);
		result.append(", serviceConsumerAuthorization: ");
		result.append(serviceConsumerAuthorization);
		result.append(", identityAndAttributeAssertionTransmission: ");
		result.append(identityAndAttributeAssertionTransmission);
		result.append(", serviceAuthentication: ");
		result.append(serviceAuthentication);
		result.append(", messageNonrepudiation: ");
		result.append(messageNonrepudiation);
		result.append(", messageIntegrity: ");
		result.append(messageIntegrity);
		result.append(", messageConfidentiality: ");
		result.append(messageConfidentiality);
		result.append(", messageAddressing: ");
		result.append(messageAddressing);
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", transactionSupport: ");
		result.append(transactionSupport);
		result.append(", serviceMetadataAvailability: ");
		result.append(serviceMetadataAvailability);
		result.append(", interfaceDescriptionRequirements: ");
		result.append(interfaceDescriptionRequirements);
		result.append(", logging: ");
		result.append(logging);
		result.append(", serviceResponsiveness: ");
		result.append(serviceResponsiveness);
		result.append(", extendedRequirement: ");
		result.append(extendedRequirement);
		result.append(')');
		return result.toString();
	}

} //InteractionRequirementsImpl
