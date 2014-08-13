/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Policies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType#getPolicyText <em>Policy Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicablePoliciesType()
 * @model extendedMetaData="name='ApplicablePolicies_._type' kind='elementOnly'"
 * @generated
 */
public interface ApplicablePoliciesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a policy document that in some way, constrains, governs, or controls the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Text</em>' attribute.
	 * @see #setPolicyText(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicablePoliciesType_PolicyText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='PolicyText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPolicyText();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType#getPolicyText <em>Policy Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Text</em>' attribute.
	 * @see #getPolicyText()
	 * @generated
	 */
	void setPolicyText(String value);

} // ApplicablePoliciesType
