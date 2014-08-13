/**
 */
package gov.ojp.it.gsp.services._1._0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Unit Amount Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an amount of money based on a per unit basis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.UsageUnitAmountType#getUnitMeasureText <em>Unit Measure Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getUsageUnitAmountType()
 * @model extendedMetaData="name='UsageUnitAmountType' kind='simple'"
 * @generated
 */
public interface UsageUnitAmountType extends AmountType {
	/**
	 * Returns the value of the '<em><b>Unit Measure Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit of measure in time or quanta.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Measure Text</em>' attribute.
	 * @see #setUnitMeasureText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getUsageUnitAmountType_UnitMeasureText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unitMeasureText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitMeasureText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.UsageUnitAmountType#getUnitMeasureText <em>Unit Measure Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Measure Text</em>' attribute.
	 * @see #getUnitMeasureText()
	 * @generated
	 */
	void setUnitMeasureText(String value);

} // UsageUnitAmountType
