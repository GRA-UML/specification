/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing the costs associating with using something.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.CostType#getUsageCostAmount <em>Usage Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.CostType#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.CostType#getCreationCostAmount <em>Creation Cost Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getCostType()
 * @model extendedMetaData="name='CostType' kind='elementOnly'"
 * @generated
 */
public interface CostType extends EObject {
	/**
	 * Returns the value of the '<em><b>Usage Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total cost to use something, such as a service, etc. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Cost Amount</em>' containment reference.
	 * @see #setUsageCostAmount(AmountType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getCostType_UsageCostAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UsageCostAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	AmountType getUsageCostAmount();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.CostType#getUsageCostAmount <em>Usage Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Cost Amount</em>' containment reference.
	 * @see #getUsageCostAmount()
	 * @generated
	 */
	void setUsageCostAmount(AmountType value);

	/**
	 * Returns the value of the '<em><b>Usage Unit Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cost associated with a service(e.g. transaction, unlimited transactions, minutes of use).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Unit Cost Amount</em>' containment reference.
	 * @see #setUsageUnitCostAmount(AmountType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getCostType_UsageUnitCostAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UsageUnitCostAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	AmountType getUsageUnitCostAmount();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.CostType#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Unit Cost Amount</em>' containment reference.
	 * @see #getUsageUnitCostAmount()
	 * @generated
	 */
	void setUsageUnitCostAmount(AmountType value);

	/**
	 * Returns the value of the '<em><b>Creation Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cost create a thing, such as an application or service  This includes the full cost to design, manage, develop, test, implement and maintain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Cost Amount</em>' containment reference.
	 * @see #setCreationCostAmount(AmountType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getCostType_CreationCostAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CreationCostAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	AmountType getCreationCostAmount();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.CostType#getCreationCostAmount <em>Creation Cost Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Cost Amount</em>' containment reference.
	 * @see #getCreationCostAmount()
	 * @generated
	 */
	void setCreationCostAmount(AmountType value);

} // CostType
