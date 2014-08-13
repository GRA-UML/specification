/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interaction Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfileTypeImpl#getSIPName <em>SIP Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfileTypeImpl#getSIPVersion <em>SIP Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInteractionProfileTypeImpl extends MinimalEObjectImpl.Container implements ServiceInteractionProfileType {
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
	 * The cached value of the '{@link #getSIPName() <em>SIP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIPName()
	 * @generated
	 * @ordered
	 */
	protected String sIPName = SIP_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSIPVersion() <em>SIP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIPVersion()
	 * @generated
	 * @ordered
	 */
	protected String sIPVersion = SIP_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInteractionProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_INTERACTION_PROFILE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSIPName() {
		return sIPName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIPName(String newSIPName) {
		String oldSIPName = sIPName;
		sIPName = newSIPName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME, oldSIPName, sIPName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSIPVersion() {
		return sIPVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIPVersion(String newSIPVersion) {
		String oldSIPVersion = sIPVersion;
		sIPVersion = newSIPVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION, oldSIPVersion, sIPVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME:
				return getSIPName();
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION:
				return getSIPVersion();
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
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME:
				setSIPName((String)newValue);
				return;
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION:
				setSIPVersion((String)newValue);
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
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME:
				setSIPName(SIP_NAME_EDEFAULT);
				return;
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION:
				setSIPVersion(SIP_VERSION_EDEFAULT);
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
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME:
				return SIP_NAME_EDEFAULT == null ? sIPName != null : !SIP_NAME_EDEFAULT.equals(sIPName);
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION:
				return SIP_VERSION_EDEFAULT == null ? sIPVersion != null : !SIP_VERSION_EDEFAULT.equals(sIPVersion);
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
		result.append(" (sIPName: ");
		result.append(sIPName);
		result.append(", sIPVersion: ");
		result.append(sIPVersion);
		result.append(')');
		return result.toString();
	}

} //ServiceInteractionProfileTypeImpl
