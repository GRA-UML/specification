/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.IEPDReferencesType;
import gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType;
import gov.ojp.it.gsp.services._1._0.ServiceDependenciesType;
import gov.ojp.it.gsp.services._1._0.ServiceDescriptionType;
import gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServicePurposeText <em>Service Purpose Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServiceDescriptionText <em>Service Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServiceCapabilities <em>Service Capabilities</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServiceRealWorldEffects <em>Service Real World Effects</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getSecurityClassificationText <em>Security Classification Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl#getIEPDReferences <em>IEPD References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDescriptionTypeImpl extends MinimalEObjectImpl.Container implements ServiceDescriptionType {
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
	 * The cached value of the '{@link #getServicePurposeText() <em>Service Purpose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePurposeText()
	 * @generated
	 * @ordered
	 */
	protected String servicePurposeText = SERVICE_PURPOSE_TEXT_EDEFAULT;

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
	 * The cached value of the '{@link #getServiceScopeDescriptionText() <em>Service Scope Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceScopeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected String serviceScopeDescriptionText = SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT;

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
	 * The default value of the '{@link #getServiceDescriptionText() <em>Service Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDescriptionText() <em>Service Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected String serviceDescriptionText = SERVICE_DESCRIPTION_TEXT_EDEFAULT;

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
	 * The cached value of the '{@link #getServiceCapabilities() <em>Service Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCapabilities()
	 * @generated
	 * @ordered
	 */
	protected ServiceCapabilitiesType serviceCapabilities;

	/**
	 * The cached value of the '{@link #getServiceRealWorldEffects() <em>Service Real World Effects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRealWorldEffects()
	 * @generated
	 * @ordered
	 */
	protected ServiceRealWorldEffectsType serviceRealWorldEffects;

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
	 * The cached value of the '{@link #getSecurityClassificationText() <em>Security Classification Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityClassificationText()
	 * @generated
	 * @ordered
	 */
	protected String securityClassificationText = SECURITY_CLASSIFICATION_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The cached value of the '{@link #getServiceDependencies() <em>Service Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected ServiceDependenciesType serviceDependencies;

	/**
	 * The cached value of the '{@link #getIEPDReferences() <em>IEPD References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEPDReferences()
	 * @generated
	 * @ordered
	 */
	protected IEPDReferencesType iEPDReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_DESCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicePurposeText() {
		return servicePurposeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePurposeText(String newServicePurposeText) {
		String oldServicePurposeText = servicePurposeText;
		servicePurposeText = newServicePurposeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT, oldServicePurposeText, servicePurposeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceScopeDescriptionText() {
		return serviceScopeDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceScopeDescriptionText(String newServiceScopeDescriptionText) {
		String oldServiceScopeDescriptionText = serviceScopeDescriptionText;
		serviceScopeDescriptionText = newServiceScopeDescriptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT, oldServiceScopeDescriptionText, serviceScopeDescriptionText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT, oldServiceDescriptionSummaryText, serviceDescriptionSummaryText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDescriptionText() {
		return serviceDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDescriptionText(String newServiceDescriptionText) {
		String oldServiceDescriptionText = serviceDescriptionText;
		serviceDescriptionText = newServiceDescriptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT, oldServiceDescriptionText, serviceDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceDescriptionKeywordText() {
		if (serviceDescriptionKeywordText == null) {
			serviceDescriptionKeywordText = new EDataTypeEList<String>(String.class, this, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT);
		}
		return serviceDescriptionKeywordText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCapabilitiesType getServiceCapabilities() {
		return serviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCapabilities(ServiceCapabilitiesType newServiceCapabilities, NotificationChain msgs) {
		ServiceCapabilitiesType oldServiceCapabilities = serviceCapabilities;
		serviceCapabilities = newServiceCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES, oldServiceCapabilities, newServiceCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCapabilities(ServiceCapabilitiesType newServiceCapabilities) {
		if (newServiceCapabilities != serviceCapabilities) {
			NotificationChain msgs = null;
			if (serviceCapabilities != null)
				msgs = ((InternalEObject)serviceCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES, null, msgs);
			if (newServiceCapabilities != null)
				msgs = ((InternalEObject)newServiceCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES, null, msgs);
			msgs = basicSetServiceCapabilities(newServiceCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES, newServiceCapabilities, newServiceCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRealWorldEffectsType getServiceRealWorldEffects() {
		return serviceRealWorldEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceRealWorldEffects(ServiceRealWorldEffectsType newServiceRealWorldEffects, NotificationChain msgs) {
		ServiceRealWorldEffectsType oldServiceRealWorldEffects = serviceRealWorldEffects;
		serviceRealWorldEffects = newServiceRealWorldEffects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS, oldServiceRealWorldEffects, newServiceRealWorldEffects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRealWorldEffects(ServiceRealWorldEffectsType newServiceRealWorldEffects) {
		if (newServiceRealWorldEffects != serviceRealWorldEffects) {
			NotificationChain msgs = null;
			if (serviceRealWorldEffects != null)
				msgs = ((InternalEObject)serviceRealWorldEffects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS, null, msgs);
			if (newServiceRealWorldEffects != null)
				msgs = ((InternalEObject)newServiceRealWorldEffects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS, null, msgs);
			msgs = basicSetServiceRealWorldEffects(newServiceRealWorldEffects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS, newServiceRealWorldEffects, newServiceRealWorldEffects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityClassificationText() {
		return securityClassificationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityClassificationText(String newSecurityClassificationText) {
		String oldSecurityClassificationText = securityClassificationText;
		securityClassificationText = newSecurityClassificationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT, oldSecurityClassificationText, securityClassificationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, graPackage.SERVICE_DESCRIPTION_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDependenciesType getServiceDependencies() {
		return serviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDependencies(ServiceDependenciesType newServiceDependencies, NotificationChain msgs) {
		ServiceDependenciesType oldServiceDependencies = serviceDependencies;
		serviceDependencies = newServiceDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES, oldServiceDependencies, newServiceDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDependencies(ServiceDependenciesType newServiceDependencies) {
		if (newServiceDependencies != serviceDependencies) {
			NotificationChain msgs = null;
			if (serviceDependencies != null)
				msgs = ((InternalEObject)serviceDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES, null, msgs);
			if (newServiceDependencies != null)
				msgs = ((InternalEObject)newServiceDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES, null, msgs);
			msgs = basicSetServiceDependencies(newServiceDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES, newServiceDependencies, newServiceDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEPDReferencesType getIEPDReferences() {
		return iEPDReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIEPDReferences(IEPDReferencesType newIEPDReferences, NotificationChain msgs) {
		IEPDReferencesType oldIEPDReferences = iEPDReferences;
		iEPDReferences = newIEPDReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES, oldIEPDReferences, newIEPDReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEPDReferences(IEPDReferencesType newIEPDReferences) {
		if (newIEPDReferences != iEPDReferences) {
			NotificationChain msgs = null;
			if (iEPDReferences != null)
				msgs = ((InternalEObject)iEPDReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES, null, msgs);
			if (newIEPDReferences != null)
				msgs = ((InternalEObject)newIEPDReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES, null, msgs);
			msgs = basicSetIEPDReferences(newIEPDReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES, newIEPDReferences, newIEPDReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES:
				return basicSetServiceCapabilities(null, msgs);
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS:
				return basicSetServiceRealWorldEffects(null, msgs);
			case graPackage.SERVICE_DESCRIPTION_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES:
				return basicSetServiceDependencies(null, msgs);
			case graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES:
				return basicSetIEPDReferences(null, msgs);
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
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT:
				return getServicePurposeText();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT:
				return getServiceScopeDescriptionText();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				return getServiceDescriptionSummaryText();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT:
				return getServiceDescriptionText();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				return getServiceDescriptionKeywordText();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES:
				return getServiceCapabilities();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS:
				return getServiceRealWorldEffects();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT:
				return getSecurityClassificationText();
			case graPackage.SERVICE_DESCRIPTION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES:
				return getIEPDReferences();
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
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT:
				setServicePurposeText((String)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT:
				setServiceScopeDescriptionText((String)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				setServiceDescriptionSummaryText((String)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT:
				setServiceDescriptionText((String)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				getServiceDescriptionKeywordText().clear();
				getServiceDescriptionKeywordText().addAll((Collection<? extends String>)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES:
				setServiceCapabilities((ServiceCapabilitiesType)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS:
				setServiceRealWorldEffects((ServiceRealWorldEffectsType)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT:
				setSecurityClassificationText((String)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES:
				setServiceDependencies((ServiceDependenciesType)newValue);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES:
				setIEPDReferences((IEPDReferencesType)newValue);
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
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT:
				setServicePurposeText(SERVICE_PURPOSE_TEXT_EDEFAULT);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT:
				setServiceScopeDescriptionText(SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				setServiceDescriptionSummaryText(SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT:
				setServiceDescriptionText(SERVICE_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				getServiceDescriptionKeywordText().clear();
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES:
				setServiceCapabilities((ServiceCapabilitiesType)null);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS:
				setServiceRealWorldEffects((ServiceRealWorldEffectsType)null);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT:
				setSecurityClassificationText(SECURITY_CLASSIFICATION_TEXT_EDEFAULT);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__ANY:
				getAny().clear();
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES:
				setServiceDependencies((ServiceDependenciesType)null);
				return;
			case graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES:
				setIEPDReferences((IEPDReferencesType)null);
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
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT:
				return SERVICE_PURPOSE_TEXT_EDEFAULT == null ? servicePurposeText != null : !SERVICE_PURPOSE_TEXT_EDEFAULT.equals(servicePurposeText);
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT:
				return SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT == null ? serviceScopeDescriptionText != null : !SERVICE_SCOPE_DESCRIPTION_TEXT_EDEFAULT.equals(serviceScopeDescriptionText);
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT:
				return SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT == null ? serviceDescriptionSummaryText != null : !SERVICE_DESCRIPTION_SUMMARY_TEXT_EDEFAULT.equals(serviceDescriptionSummaryText);
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT:
				return SERVICE_DESCRIPTION_TEXT_EDEFAULT == null ? serviceDescriptionText != null : !SERVICE_DESCRIPTION_TEXT_EDEFAULT.equals(serviceDescriptionText);
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT:
				return serviceDescriptionKeywordText != null && !serviceDescriptionKeywordText.isEmpty();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES:
				return serviceCapabilities != null;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS:
				return serviceRealWorldEffects != null;
			case graPackage.SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT:
				return SECURITY_CLASSIFICATION_TEXT_EDEFAULT == null ? securityClassificationText != null : !SECURITY_CLASSIFICATION_TEXT_EDEFAULT.equals(securityClassificationText);
			case graPackage.SERVICE_DESCRIPTION_TYPE__ANY:
				return any != null && !any.isEmpty();
			case graPackage.SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES:
				return serviceDependencies != null;
			case graPackage.SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES:
				return iEPDReferences != null;
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
		result.append(" (servicePurposeText: ");
		result.append(servicePurposeText);
		result.append(", serviceScopeDescriptionText: ");
		result.append(serviceScopeDescriptionText);
		result.append(", serviceDescriptionSummaryText: ");
		result.append(serviceDescriptionSummaryText);
		result.append(", serviceDescriptionText: ");
		result.append(serviceDescriptionText);
		result.append(", serviceDescriptionKeywordText: ");
		result.append(serviceDescriptionKeywordText);
		result.append(", securityClassificationText: ");
		result.append(securityClassificationText);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //ServiceDescriptionTypeImpl
