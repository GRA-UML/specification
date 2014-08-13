/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Umbrella Agreements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType#getUmbrellaAgreement <em>Umbrella Agreement</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicableUmbrellaAgreementsType()
 * @model extendedMetaData="name='ApplicableUmbrellaAgreements_._type' kind='elementOnly'"
 * @generated
 */
public interface ApplicableUmbrellaAgreementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Umbrella Agreement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.AgreementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An umbrella agreement that in some way constrain, govern, or control the usage of a service, application, process. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Umbrella Agreement</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getApplicableUmbrellaAgreementsType_UmbrellaAgreement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UmbrellaAgreement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AgreementType> getUmbrellaAgreement();

} // ApplicableUmbrellaAgreementsType
