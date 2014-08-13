/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.AmountType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amount Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.AmountTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.AmountTypeImpl#getCurrencyText <em>Currency Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AmountTypeImpl extends MinimalEObjectImpl.Container implements AmountType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyText() <em>Currency Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyText()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_TEXT_EDEFAULT = "USD";

	/**
	 * The cached value of the '{@link #getCurrencyText() <em>Currency Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyText()
	 * @generated
	 * @ordered
	 */
	protected String currencyText = CURRENCY_TEXT_EDEFAULT;

	/**
	 * This is true if the Currency Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currencyTextESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.AMOUNT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigDecimal newValue) {
		BigDecimal oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.AMOUNT_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyText() {
		return currencyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyText(String newCurrencyText) {
		String oldCurrencyText = currencyText;
		currencyText = newCurrencyText;
		boolean oldCurrencyTextESet = currencyTextESet;
		currencyTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.AMOUNT_TYPE__CURRENCY_TEXT, oldCurrencyText, currencyText, !oldCurrencyTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrencyText() {
		String oldCurrencyText = currencyText;
		boolean oldCurrencyTextESet = currencyTextESet;
		currencyText = CURRENCY_TEXT_EDEFAULT;
		currencyTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, graPackage.AMOUNT_TYPE__CURRENCY_TEXT, oldCurrencyText, CURRENCY_TEXT_EDEFAULT, oldCurrencyTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrencyText() {
		return currencyTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.AMOUNT_TYPE__VALUE:
				return getValue();
			case graPackage.AMOUNT_TYPE__CURRENCY_TEXT:
				return getCurrencyText();
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
			case graPackage.AMOUNT_TYPE__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case graPackage.AMOUNT_TYPE__CURRENCY_TEXT:
				setCurrencyText((String)newValue);
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
			case graPackage.AMOUNT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case graPackage.AMOUNT_TYPE__CURRENCY_TEXT:
				unsetCurrencyText();
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
			case graPackage.AMOUNT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case graPackage.AMOUNT_TYPE__CURRENCY_TEXT:
				return isSetCurrencyText();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", currencyText: ");
		if (currencyTextESet) result.append(currencyText); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AmountTypeImpl
