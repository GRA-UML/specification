/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.DomainDescriptionType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.DomainDescriptionTypeImpl#getDomainNameText <em>Domain Name Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainDescriptionTypeImpl extends MinimalEObjectImpl.Container implements DomainDescriptionType {
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
	 * The cached value of the '{@link #getDomainNameText() <em>Domain Name Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNameText()
	 * @generated
	 * @ordered
	 */
	protected String domainNameText = DOMAIN_NAME_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.DOMAIN_DESCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainNameText() {
		return domainNameText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainNameText(String newDomainNameText) {
		String oldDomainNameText = domainNameText;
		domainNameText = newDomainNameText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT, oldDomainNameText, domainNameText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT:
				return getDomainNameText();
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
			case graPackage.DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT:
				setDomainNameText((String)newValue);
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
			case graPackage.DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT:
				setDomainNameText(DOMAIN_NAME_TEXT_EDEFAULT);
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
			case graPackage.DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT:
				return DOMAIN_NAME_TEXT_EDEFAULT == null ? domainNameText != null : !DOMAIN_NAME_TEXT_EDEFAULT.equals(domainNameText);
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
		result.append(" (domainNameText: ");
		result.append(domainNameText);
		result.append(')');
		return result.toString();
	}

} //DomainDescriptionTypeImpl
