/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Usage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type describing a collection of  licensing and any other usage goverenace constraints regarding the realization of a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#getLicensingAgreement <em>Licensing Agreement</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#getServiceCost <em>Service Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceUsageType()
 * @model extendedMetaData="name='ServiceUsageType' kind='elementOnly'"
 * @generated
 */
public interface ServiceUsageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Approval Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when a permission must first be obtained prior to using a service or performing some action in a business process; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Required Indicator</em>' attribute.
	 * @see #isSetApprovalRequiredIndicator()
	 * @see #unsetApprovalRequiredIndicator()
	 * @see #setApprovalRequiredIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceUsageType_ApprovalRequiredIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='ApprovalRequiredIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isApprovalRequiredIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Required Indicator</em>' attribute.
	 * @see #isSetApprovalRequiredIndicator()
	 * @see #unsetApprovalRequiredIndicator()
	 * @see #isApprovalRequiredIndicator()
	 * @generated
	 */
	void setApprovalRequiredIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalRequiredIndicator()
	 * @see #isApprovalRequiredIndicator()
	 * @see #setApprovalRequiredIndicator(boolean)
	 * @generated
	 */
	void unsetApprovalRequiredIndicator();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Required Indicator</em>' attribute is set.
	 * @see #unsetApprovalRequiredIndicator()
	 * @see #isApprovalRequiredIndicator()
	 * @see #setApprovalRequiredIndicator(boolean)
	 * @generated
	 */
	boolean isSetApprovalRequiredIndicator();

	/**
	 * Returns the value of the '<em><b>Licensing Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when a license is required to use a service or application; False otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensing Required Indicator</em>' attribute.
	 * @see #isSetLicensingRequiredIndicator()
	 * @see #unsetLicensingRequiredIndicator()
	 * @see #setLicensingRequiredIndicator(boolean)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceUsageType_LicensingRequiredIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='LicensingRequiredIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLicensingRequiredIndicator();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensing Required Indicator</em>' attribute.
	 * @see #isSetLicensingRequiredIndicator()
	 * @see #unsetLicensingRequiredIndicator()
	 * @see #isLicensingRequiredIndicator()
	 * @generated
	 */
	void setLicensingRequiredIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLicensingRequiredIndicator()
	 * @see #isLicensingRequiredIndicator()
	 * @see #setLicensingRequiredIndicator(boolean)
	 * @generated
	 */
	void unsetLicensingRequiredIndicator();

	/**
	 * Returns whether the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Licensing Required Indicator</em>' attribute is set.
	 * @see #unsetLicensingRequiredIndicator()
	 * @see #isLicensingRequiredIndicator()
	 * @see #setLicensingRequiredIndicator(boolean)
	 * @generated
	 */
	boolean isSetLicensingRequiredIndicator();

	/**
	 * Returns the value of the '<em><b>Licensing Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of licensing for a service or application. Descriptive values could be In House, No License,  Open Source, Purchase License, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensing Agreement</em>' containment reference.
	 * @see #setLicensingAgreement(AgreementType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceUsageType_LicensingAgreement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LicensingAgreement' namespace='##targetNamespace'"
	 * @generated
	 */
	AgreementType getLicensingAgreement();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#getLicensingAgreement <em>Licensing Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensing Agreement</em>' containment reference.
	 * @see #getLicensingAgreement()
	 * @generated
	 */
	void setLicensingAgreement(AgreementType value);

	/**
	 * Returns the value of the '<em><b>Service Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Cost</em>' containment reference.
	 * @see #setServiceCost(CostType)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceUsageType_ServiceCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceCost' namespace='##targetNamespace'"
	 * @generated
	 */
	CostType getServiceCost();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#getServiceCost <em>Service Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Cost</em>' containment reference.
	 * @see #getServiceCost()
	 * @generated
	 */
	void setServiceCost(CostType value);

} // ServiceUsageType
