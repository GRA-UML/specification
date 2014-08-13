/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.Description;
import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.SchemaReference;
import data.grauml.graAnnotationModel.Service;
import data.grauml.graAnnotationModel.ServiceInteractionProfile;
import data.grauml.graAnnotationModel.ServiceInterfaceSpecification;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getSecurityDescriptionText <em>Security Description Text</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getServiceInteractionProfile <em>Service Interaction Profile</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getService <em>Service</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getUriAddress <em>Uri Address</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getMessageDefinitionMechanism <em>Message Definition Mechanism</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getServiceInterfaceDescriptionUri <em>Service Interface Description Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getServiceTesting <em>Service Testing</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getSchemaReference <em>Schema Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl#getServiceInterfaceNameAbbreviationText <em>Service Interface Name Abbreviation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInterfaceSpecificationImpl extends GraServiceAnnotationBaseImpl implements ServiceInterfaceSpecification {
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
	 * The cached value of the '{@link #isSecurityImplementedIndicator() <em>Security Implemented Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurityImplementedIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean securityImplementedIndicator = SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT;

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
	 * The cached value of the '{@link #getSecurityDescriptionText() <em>Security Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected String securityDescriptionText = SECURITY_DESCRIPTION_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceInteractionProfile() <em>Service Interaction Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInteractionProfile()
	 * @generated
	 * @ordered
	 */
	protected ServiceInteractionProfile serviceInteractionProfile;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The default value of the '{@link #getUriAddress() <em>Uri Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriAddress() <em>Uri Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriAddress()
	 * @generated
	 * @ordered
	 */
	protected String uriAddress = URI_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageDefinitionMechanism() <em>Message Definition Mechanism</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDefinitionMechanism()
	 * @generated
	 * @ordered
	 */
	protected EList<Description> messageDefinitionMechanism;

	/**
	 * The default value of the '{@link #getServiceInterfaceDescriptionUri() <em>Service Interface Description Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceDescriptionUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INTERFACE_DESCRIPTION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInterfaceDescriptionUri() <em>Service Interface Description Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceDescriptionUri()
	 * @generated
	 * @ordered
	 */
	protected String serviceInterfaceDescriptionUri = SERVICE_INTERFACE_DESCRIPTION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceTesting() <em>Service Testing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTesting()
	 * @generated
	 * @ordered
	 */
	protected Description serviceTesting;

	/**
	 * The cached value of the '{@link #getSchemaReference() <em>Schema Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaReference()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaReference> schemaReference;

	/**
	 * The default value of the '{@link #getServiceInterfaceNameAbbreviationText() <em>Service Interface Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceNameAbbreviationText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInterfaceNameAbbreviationText() <em>Service Interface Name Abbreviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceNameAbbreviationText()
	 * @generated
	 * @ordered
	 */
	protected String serviceInterfaceNameAbbreviationText = SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.SERVICE_INTERFACE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecurityImplementedIndicator() {
		return securityImplementedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityImplementedIndicator(boolean newSecurityImplementedIndicator) {
		boolean oldSecurityImplementedIndicator = securityImplementedIndicator;
		securityImplementedIndicator = newSecurityImplementedIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR, oldSecurityImplementedIndicator, securityImplementedIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityDescriptionText() {
		return securityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityDescriptionText(String newSecurityDescriptionText) {
		String oldSecurityDescriptionText = securityDescriptionText;
		securityDescriptionText = newSecurityDescriptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT, oldSecurityDescriptionText, securityDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInteractionProfile getServiceInteractionProfile() {
		return serviceInteractionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInteractionProfile(ServiceInteractionProfile newServiceInteractionProfile, NotificationChain msgs) {
		ServiceInteractionProfile oldServiceInteractionProfile = serviceInteractionProfile;
		serviceInteractionProfile = newServiceInteractionProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE, oldServiceInteractionProfile, newServiceInteractionProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInteractionProfile(ServiceInteractionProfile newServiceInteractionProfile) {
		if (newServiceInteractionProfile != serviceInteractionProfile) {
			NotificationChain msgs = null;
			if (serviceInteractionProfile != null)
				msgs = ((InternalEObject)serviceInteractionProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE, null, msgs);
			if (newServiceInteractionProfile != null)
				msgs = ((InternalEObject)newServiceInteractionProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE, null, msgs);
			msgs = basicSetServiceInteractionProfile(newServiceInteractionProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE, newServiceInteractionProfile, newServiceInteractionProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriAddress() {
		return uriAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriAddress(String newUriAddress) {
		String oldUriAddress = uriAddress;
		uriAddress = newUriAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS, oldUriAddress, uriAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description> getMessageDefinitionMechanism() {
		if (messageDefinitionMechanism == null) {
			messageDefinitionMechanism = new EObjectContainmentEList<Description>(Description.class, this, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM);
		}
		return messageDefinitionMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInterfaceDescriptionUri() {
		return serviceInterfaceDescriptionUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInterfaceDescriptionUri(String newServiceInterfaceDescriptionUri) {
		String oldServiceInterfaceDescriptionUri = serviceInterfaceDescriptionUri;
		serviceInterfaceDescriptionUri = newServiceInterfaceDescriptionUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI, oldServiceInterfaceDescriptionUri, serviceInterfaceDescriptionUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getServiceTesting() {
		return serviceTesting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceTesting(Description newServiceTesting, NotificationChain msgs) {
		Description oldServiceTesting = serviceTesting;
		serviceTesting = newServiceTesting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING, oldServiceTesting, newServiceTesting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTesting(Description newServiceTesting) {
		if (newServiceTesting != serviceTesting) {
			NotificationChain msgs = null;
			if (serviceTesting != null)
				msgs = ((InternalEObject)serviceTesting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING, null, msgs);
			if (newServiceTesting != null)
				msgs = ((InternalEObject)newServiceTesting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING, null, msgs);
			msgs = basicSetServiceTesting(newServiceTesting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING, newServiceTesting, newServiceTesting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemaReference> getSchemaReference() {
		if (schemaReference == null) {
			schemaReference = new EObjectContainmentEList<SchemaReference>(SchemaReference.class, this, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE);
		}
		return schemaReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInterfaceNameAbbreviationText() {
		return serviceInterfaceNameAbbreviationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInterfaceNameAbbreviationText(String newServiceInterfaceNameAbbreviationText) {
		String oldServiceInterfaceNameAbbreviationText = serviceInterfaceNameAbbreviationText;
		serviceInterfaceNameAbbreviationText = newServiceInterfaceNameAbbreviationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT, oldServiceInterfaceNameAbbreviationText, serviceInterfaceNameAbbreviationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE:
				return basicSetServiceInteractionProfile(null, msgs);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM:
				return ((InternalEList<?>)getMessageDefinitionMechanism()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING:
				return basicSetServiceTesting(null, msgs);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE:
				return ((InternalEList<?>)getSchemaReference()).basicRemove(otherEnd, msgs);
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
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR:
				return isSecurityImplementedIndicator();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT:
				return getSecurityDescriptionText();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE:
				return getServiceInteractionProfile();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE:
				return getService();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS:
				return getUriAddress();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM:
				return getMessageDefinitionMechanism();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI:
				return getServiceInterfaceDescriptionUri();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE:
				return getTargetNamespace();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__PREFIX:
				return getPrefix();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING:
				return getServiceTesting();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE:
				return getSchemaReference();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT:
				return getServiceInterfaceNameAbbreviationText();
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
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR:
				setSecurityImplementedIndicator((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT:
				setSecurityDescriptionText((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE:
				setServiceInteractionProfile((ServiceInteractionProfile)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS:
				setUriAddress((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM:
				getMessageDefinitionMechanism().clear();
				getMessageDefinitionMechanism().addAll((Collection<? extends Description>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI:
				setServiceInterfaceDescriptionUri((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__PREFIX:
				setPrefix((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING:
				setServiceTesting((Description)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE:
				getSchemaReference().clear();
				getSchemaReference().addAll((Collection<? extends SchemaReference>)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT:
				setServiceInterfaceNameAbbreviationText((String)newValue);
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
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR:
				setSecurityImplementedIndicator(SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT:
				setSecurityDescriptionText(SECURITY_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE:
				setServiceInteractionProfile((ServiceInteractionProfile)null);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE:
				getService().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS:
				setUriAddress(URI_ADDRESS_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM:
				getMessageDefinitionMechanism().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI:
				setServiceInterfaceDescriptionUri(SERVICE_INTERFACE_DESCRIPTION_URI_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING:
				setServiceTesting((Description)null);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE:
				getSchemaReference().clear();
				return;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT:
				setServiceInterfaceNameAbbreviationText(SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT_EDEFAULT);
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
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR:
				return securityImplementedIndicator != SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT:
				return SECURITY_DESCRIPTION_TEXT_EDEFAULT == null ? securityDescriptionText != null : !SECURITY_DESCRIPTION_TEXT_EDEFAULT.equals(securityDescriptionText);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE:
				return serviceInteractionProfile != null;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE:
				return service != null && !service.isEmpty();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS:
				return URI_ADDRESS_EDEFAULT == null ? uriAddress != null : !URI_ADDRESS_EDEFAULT.equals(uriAddress);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM:
				return messageDefinitionMechanism != null && !messageDefinitionMechanism.isEmpty();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI:
				return SERVICE_INTERFACE_DESCRIPTION_URI_EDEFAULT == null ? serviceInterfaceDescriptionUri != null : !SERVICE_INTERFACE_DESCRIPTION_URI_EDEFAULT.equals(serviceInterfaceDescriptionUri);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING:
				return serviceTesting != null;
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE:
				return schemaReference != null && !schemaReference.isEmpty();
			case GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT:
				return SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT_EDEFAULT == null ? serviceInterfaceNameAbbreviationText != null : !SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT_EDEFAULT.equals(serviceInterfaceNameAbbreviationText);
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
		result.append(" (securityImplementedIndicator: ");
		result.append(securityImplementedIndicator);
		result.append(", securityDescriptionText: ");
		result.append(securityDescriptionText);
		result.append(", uriAddress: ");
		result.append(uriAddress);
		result.append(", serviceInterfaceDescriptionUri: ");
		result.append(serviceInterfaceDescriptionUri);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", serviceInterfaceNameAbbreviationText: ");
		result.append(serviceInterfaceNameAbbreviationText);
		result.append(')');
		return result.toString();
	}

} //ServiceInterfaceSpecificationImpl
