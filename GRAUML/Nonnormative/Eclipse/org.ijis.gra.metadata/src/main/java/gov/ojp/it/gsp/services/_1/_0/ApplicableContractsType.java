/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Contracts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ApplicableContractsType#getContract <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicableContractsType()
 * @model extendedMetaData="name='ApplicableContracts_._type' kind='elementOnly'"
 * @generated
 */
public interface ApplicableContractsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.AgreementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal contract associated with a service, application, process, tranaction, or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicableContractsType_Contract()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Contract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AgreementType> getContract();

} // ApplicableContractsType
