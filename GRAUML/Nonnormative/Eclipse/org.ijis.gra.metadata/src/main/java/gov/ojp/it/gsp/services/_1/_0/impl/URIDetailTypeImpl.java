/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.URIDetailType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URI Detail Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.URIDetailTypeImpl#getURIAddress <em>URI Address</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.URIDetailTypeImpl#getURIDescription <em>URI Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URIDetailTypeImpl extends MinimalEObjectImpl.Container implements URIDetailType {
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
	 * The cached value of the '{@link #getURIAddress() <em>URI Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIAddress()
	 * @generated
	 * @ordered
	 */
	protected String uRIAddress = URI_ADDRESS_EDEFAULT;

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
	 * The cached value of the '{@link #getURIDescription() <em>URI Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURIDescription()
	 * @generated
	 * @ordered
	 */
	protected String uRIDescription = URI_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URIDetailTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.URI_DETAIL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURIAddress() {
		return uRIAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIAddress(String newURIAddress) {
		String oldURIAddress = uRIAddress;
		uRIAddress = newURIAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.URI_DETAIL_TYPE__URI_ADDRESS, oldURIAddress, uRIAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURIDescription() {
		return uRIDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURIDescription(String newURIDescription) {
		String oldURIDescription = uRIDescription;
		uRIDescription = newURIDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.URI_DETAIL_TYPE__URI_DESCRIPTION, oldURIDescription, uRIDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.URI_DETAIL_TYPE__URI_ADDRESS:
				return getURIAddress();
			case graPackage.URI_DETAIL_TYPE__URI_DESCRIPTION:
				return getURIDescription();
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
			case graPackage.URI_DETAIL_TYPE__URI_ADDRESS:
				setURIAddress((String)newValue);
				return;
			case graPackage.URI_DETAIL_TYPE__URI_DESCRIPTION:
				setURIDescription((String)newValue);
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
			case graPackage.URI_DETAIL_TYPE__URI_ADDRESS:
				setURIAddress(URI_ADDRESS_EDEFAULT);
				return;
			case graPackage.URI_DETAIL_TYPE__URI_DESCRIPTION:
				setURIDescription(URI_DESCRIPTION_EDEFAULT);
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
			case graPackage.URI_DETAIL_TYPE__URI_ADDRESS:
				return URI_ADDRESS_EDEFAULT == null ? uRIAddress != null : !URI_ADDRESS_EDEFAULT.equals(uRIAddress);
			case graPackage.URI_DETAIL_TYPE__URI_DESCRIPTION:
				return URI_DESCRIPTION_EDEFAULT == null ? uRIDescription != null : !URI_DESCRIPTION_EDEFAULT.equals(uRIDescription);
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
		result.append(" (uRIAddress: ");
		result.append(uRIAddress);
		result.append(", uRIDescription: ");
		result.append(uRIDescription);
		result.append(')');
		return result.toString();
	}

} //URIDetailTypeImpl
