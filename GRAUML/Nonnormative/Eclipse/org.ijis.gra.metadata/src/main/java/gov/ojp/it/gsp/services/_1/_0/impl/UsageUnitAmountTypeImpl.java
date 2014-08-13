/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.UsageUnitAmountType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Unit Amount Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.UsageUnitAmountTypeImpl#getUnitMeasureText <em>Unit Measure Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageUnitAmountTypeImpl extends AmountTypeImpl implements UsageUnitAmountType {
	/**
	 * The default value of the '{@link #getUnitMeasureText() <em>Unit Measure Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMeasureText()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_MEASURE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitMeasureText() <em>Unit Measure Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMeasureText()
	 * @generated
	 * @ordered
	 */
	protected String unitMeasureText = UNIT_MEASURE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageUnitAmountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.USAGE_UNIT_AMOUNT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitMeasureText() {
		return unitMeasureText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitMeasureText(String newUnitMeasureText) {
		String oldUnitMeasureText = unitMeasureText;
		unitMeasureText = newUnitMeasureText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT, oldUnitMeasureText, unitMeasureText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT:
				return getUnitMeasureText();
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
			case graPackage.USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT:
				setUnitMeasureText((String)newValue);
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
			case graPackage.USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT:
				setUnitMeasureText(UNIT_MEASURE_TEXT_EDEFAULT);
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
			case graPackage.USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT:
				return UNIT_MEASURE_TEXT_EDEFAULT == null ? unitMeasureText != null : !UNIT_MEASURE_TEXT_EDEFAULT.equals(unitMeasureText);
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
		result.append(" (unitMeasureText: ");
		result.append(unitMeasureText);
		result.append(')');
		return result.toString();
	}

} //UsageUnitAmountTypeImpl
