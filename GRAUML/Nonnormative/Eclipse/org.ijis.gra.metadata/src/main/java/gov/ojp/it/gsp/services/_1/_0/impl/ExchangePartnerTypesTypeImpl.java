/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Partner Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ExchangePartnerTypesTypeImpl#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExchangePartnerTypesTypeImpl extends MinimalEObjectImpl.Container implements ExchangePartnerTypesType {
	/**
	 * The default value of the '{@link #getExchangePartnerTypeDescriptionText() <em>Exchange Partner Type Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePartnerTypeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangePartnerTypeDescriptionText() <em>Exchange Partner Type Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePartnerTypeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected String exchangePartnerTypeDescriptionText = EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangePartnerTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.EXCHANGE_PARTNER_TYPES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangePartnerTypeDescriptionText() {
		return exchangePartnerTypeDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangePartnerTypeDescriptionText(String newExchangePartnerTypeDescriptionText) {
		String oldExchangePartnerTypeDescriptionText = exchangePartnerTypeDescriptionText;
		exchangePartnerTypeDescriptionText = newExchangePartnerTypeDescriptionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT, oldExchangePartnerTypeDescriptionText, exchangePartnerTypeDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				return getExchangePartnerTypeDescriptionText();
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
			case graPackage.EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				setExchangePartnerTypeDescriptionText((String)newValue);
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
			case graPackage.EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				setExchangePartnerTypeDescriptionText(EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT);
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
			case graPackage.EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT:
				return EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT == null ? exchangePartnerTypeDescriptionText != null : !EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT_EDEFAULT.equals(exchangePartnerTypeDescriptionText);
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
		result.append(" (exchangePartnerTypeDescriptionText: ");
		result.append(exchangePartnerTypeDescriptionText);
		result.append(')');
		return result.toString();
	}

} //ExchangePartnerTypesTypeImpl
