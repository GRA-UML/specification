/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicable Policies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ApplicablePoliciesTypeImpl#getPolicyText <em>Policy Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicablePoliciesTypeImpl extends MinimalEObjectImpl.Container implements ApplicablePoliciesType {
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
	 * The cached value of the '{@link #getPolicyText() <em>Policy Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyText()
	 * @generated
	 * @ordered
	 */
	protected String policyText = POLICY_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicablePoliciesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.APPLICABLE_POLICIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyText() {
		return policyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyText(String newPolicyText) {
		String oldPolicyText = policyText;
		policyText = newPolicyText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.APPLICABLE_POLICIES_TYPE__POLICY_TEXT, oldPolicyText, policyText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.APPLICABLE_POLICIES_TYPE__POLICY_TEXT:
				return getPolicyText();
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
			case graPackage.APPLICABLE_POLICIES_TYPE__POLICY_TEXT:
				setPolicyText((String)newValue);
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
			case graPackage.APPLICABLE_POLICIES_TYPE__POLICY_TEXT:
				setPolicyText(POLICY_TEXT_EDEFAULT);
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
			case graPackage.APPLICABLE_POLICIES_TYPE__POLICY_TEXT:
				return POLICY_TEXT_EDEFAULT == null ? policyText != null : !POLICY_TEXT_EDEFAULT.equals(policyText);
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
		result.append(" (policyText: ");
		result.append(policyText);
		result.append(')');
		return result.toString();
	}

} //ApplicablePoliciesTypeImpl
