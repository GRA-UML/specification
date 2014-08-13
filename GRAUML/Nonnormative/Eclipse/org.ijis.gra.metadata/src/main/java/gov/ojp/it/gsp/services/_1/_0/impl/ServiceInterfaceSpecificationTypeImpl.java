/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceActionsType;
import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType;
import gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType;
import gov.ojp.it.gsp.services._1._0.URIDetailsType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface Specification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl#getURIDetails <em>URI Details</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl#getServiceActions <em>Service Actions</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl#getServiceInteractionProfiles <em>Service Interaction Profiles</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl#getSecurityDescriptionText <em>Security Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInterfaceSpecificationTypeImpl extends MinimalEObjectImpl.Container implements ServiceInterfaceSpecificationType {
	/**
	 * The cached value of the '{@link #getURIDetails() <em>URI Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIDetails()
	 * @generated
	 * @ordered
	 */
	protected URIDetailsType uRIDetails;

	/**
	 * The cached value of the '{@link #getServiceActions() <em>Service Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceActionsType> serviceActions;

	/**
	 * The cached value of the '{@link #getServiceInteractionProfiles() <em>Service Interaction Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInteractionProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInteractionProfilesType> serviceInteractionProfiles;

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
	 * This is true if the Security Implemented Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityImplementedIndicatorESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceSpecificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_INTERFACE_SPECIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URIDetailsType getURIDetails() {
		return uRIDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURIDetails(URIDetailsType newURIDetails, NotificationChain msgs) {
		URIDetailsType oldURIDetails = uRIDetails;
		uRIDetails = newURIDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS, oldURIDetails, newURIDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIDetails(URIDetailsType newURIDetails) {
		if (newURIDetails != uRIDetails) {
			NotificationChain msgs = null;
			if (uRIDetails != null)
				msgs = ((InternalEObject)uRIDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS, null, msgs);
			if (newURIDetails != null)
				msgs = ((InternalEObject)newURIDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS, null, msgs);
			msgs = basicSetURIDetails(newURIDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS, newURIDetails, newURIDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceActionsType> getServiceActions() {
		if (serviceActions == null) {
			serviceActions = new EObjectContainmentEList<ServiceActionsType>(ServiceActionsType.class, this, graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS);
		}
		return serviceActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInteractionProfilesType> getServiceInteractionProfiles() {
		if (serviceInteractionProfiles == null) {
			serviceInteractionProfiles = new EObjectContainmentEList<ServiceInteractionProfilesType>(ServiceInteractionProfilesType.class, this, graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES);
		}
		return serviceInteractionProfiles;
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
		boolean oldSecurityImplementedIndicatorESet = securityImplementedIndicatorESet;
		securityImplementedIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR, oldSecurityImplementedIndicator, securityImplementedIndicator, !oldSecurityImplementedIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurityImplementedIndicator() {
		boolean oldSecurityImplementedIndicator = securityImplementedIndicator;
		boolean oldSecurityImplementedIndicatorESet = securityImplementedIndicatorESet;
		securityImplementedIndicator = SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT;
		securityImplementedIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR, oldSecurityImplementedIndicator, SECURITY_IMPLEMENTED_INDICATOR_EDEFAULT, oldSecurityImplementedIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurityImplementedIndicator() {
		return securityImplementedIndicatorESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT, oldSecurityDescriptionText, securityDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS:
				return basicSetURIDetails(null, msgs);
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS:
				return ((InternalEList<?>)getServiceActions()).basicRemove(otherEnd, msgs);
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES:
				return ((InternalEList<?>)getServiceInteractionProfiles()).basicRemove(otherEnd, msgs);
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
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS:
				return getURIDetails();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS:
				return getServiceActions();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES:
				return getServiceInteractionProfiles();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR:
				return isSecurityImplementedIndicator();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT:
				return getSecurityDescriptionText();
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
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS:
				setURIDetails((URIDetailsType)newValue);
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS:
				getServiceActions().clear();
				getServiceActions().addAll((Collection<? extends ServiceActionsType>)newValue);
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES:
				getServiceInteractionProfiles().clear();
				getServiceInteractionProfiles().addAll((Collection<? extends ServiceInteractionProfilesType>)newValue);
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR:
				setSecurityImplementedIndicator((Boolean)newValue);
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT:
				setSecurityDescriptionText((String)newValue);
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
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS:
				setURIDetails((URIDetailsType)null);
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS:
				getServiceActions().clear();
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES:
				getServiceInteractionProfiles().clear();
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR:
				unsetSecurityImplementedIndicator();
				return;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT:
				setSecurityDescriptionText(SECURITY_DESCRIPTION_TEXT_EDEFAULT);
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
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS:
				return uRIDetails != null;
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS:
				return serviceActions != null && !serviceActions.isEmpty();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES:
				return serviceInteractionProfiles != null && !serviceInteractionProfiles.isEmpty();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR:
				return isSetSecurityImplementedIndicator();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT:
				return SECURITY_DESCRIPTION_TEXT_EDEFAULT == null ? securityDescriptionText != null : !SECURITY_DESCRIPTION_TEXT_EDEFAULT.equals(securityDescriptionText);
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
		if (securityImplementedIndicatorESet) result.append(securityImplementedIndicator); else result.append("<unset>");
		result.append(", securityDescriptionText: ");
		result.append(securityDescriptionText);
		result.append(')');
		return result.toString();
	}

} //ServiceInterfaceSpecificationTypeImpl
