/**
 */
package gov.ojp.it.gsp.services._1._0;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amount Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an amount of money.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.AmountType#getValue <em>Value</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.AmountType#getCurrencyText <em>Currency Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getAmountType()
 * @model extendedMetaData="name='AmountType' kind='simple'"
 * @generated
 */
public interface AmountType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getAmountType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.AmountType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Text</b></em>' attribute.
	 * The default value is <code>"USD"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit of money or exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency Text</em>' attribute.
	 * @see #isSetCurrencyText()
	 * @see #unsetCurrencyText()
	 * @see #setCurrencyText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getAmountType_CurrencyText()
	 * @model default="USD" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='currencyText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.AmountType#getCurrencyText <em>Currency Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Text</em>' attribute.
	 * @see #isSetCurrencyText()
	 * @see #unsetCurrencyText()
	 * @see #getCurrencyText()
	 * @generated
	 */
	void setCurrencyText(String value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.AmountType#getCurrencyText <em>Currency Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrencyText()
	 * @see #getCurrencyText()
	 * @see #setCurrencyText(String)
	 * @generated
	 */
	void unsetCurrencyText();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.AmountType#getCurrencyText <em>Currency Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currency Text</em>' attribute is set.
	 * @see #unsetCurrencyText()
	 * @see #getCurrencyText()
	 * @see #setCurrencyText(String)
	 * @generated
	 */
	boolean isSetCurrencyText();

} // AmountType
