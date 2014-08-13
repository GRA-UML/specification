/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.AgreementType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.AgreementTypeImpl#getAgreementDescriptionText <em>Agreement Description Text</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.AgreementTypeImpl#getAgreementURI <em>Agreement URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgreementTypeImpl extends MinimalEObjectImpl.Container implements AgreementType {
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
	 * The cached value of the '{@link #getAgreementDescriptionText() <em>Agreement Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected String agreementDescriptionText = AGREEMENT_DESCRIPTION_TEXT_EDEFAULT;

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
	 * The cached value of the '{@link #getAgreementURI() <em>Agreement URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementURI()
	 * @generated
	 * @ordered
	 */
	protected String agreementURI = AGREEMENT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.AGREEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgreementDescriptionText() {
		return agreementDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementDescriptionText(String newAgreementDescriptionText) {
		String oldAgreementDescriptionText = agreementDescriptionText;
		agreementDescriptionText = newAgreementDescriptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT, oldAgreementDescriptionText, agreementDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgreementURI() {
		return agreementURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementURI(String newAgreementURI) {
		String oldAgreementURI = agreementURI;
		agreementURI = newAgreementURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.AGREEMENT_TYPE__AGREEMENT_URI, oldAgreementURI, agreementURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT:
				return getAgreementDescriptionText();
			case graPackage.AGREEMENT_TYPE__AGREEMENT_URI:
				return getAgreementURI();
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
			case graPackage.AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT:
				setAgreementDescriptionText((String)newValue);
				return;
			case graPackage.AGREEMENT_TYPE__AGREEMENT_URI:
				setAgreementURI((String)newValue);
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
			case graPackage.AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT:
				setAgreementDescriptionText(AGREEMENT_DESCRIPTION_TEXT_EDEFAULT);
				return;
			case graPackage.AGREEMENT_TYPE__AGREEMENT_URI:
				setAgreementURI(AGREEMENT_URI_EDEFAULT);
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
			case graPackage.AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT:
				return AGREEMENT_DESCRIPTION_TEXT_EDEFAULT == null ? agreementDescriptionText != null : !AGREEMENT_DESCRIPTION_TEXT_EDEFAULT.equals(agreementDescriptionText);
			case graPackage.AGREEMENT_TYPE__AGREEMENT_URI:
				return AGREEMENT_URI_EDEFAULT == null ? agreementURI != null : !AGREEMENT_URI_EDEFAULT.equals(agreementURI);
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
		result.append(" (agreementDescriptionText: ");
		result.append(agreementDescriptionText);
		result.append(", agreementURI: ");
		result.append(agreementURI);
		result.append(')');
		return result.toString();
	}

} //AgreementTypeImpl
