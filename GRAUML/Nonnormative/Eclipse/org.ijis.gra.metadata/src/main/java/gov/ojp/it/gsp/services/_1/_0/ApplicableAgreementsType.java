/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Agreements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType#getAgreement <em>Agreement</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicableAgreementsType()
 * @model extendedMetaData="name='ApplicableAgreements_._type' kind='elementOnly'"
 * @generated
 */
public interface ApplicableAgreementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Agreement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.AgreementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description or reference to an applicable Agreement or MOU governing the use, administration, or implementation of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicableAgreementsType_Agreement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Agreement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AgreementType> getAgreement();

} // ApplicableAgreementsType
