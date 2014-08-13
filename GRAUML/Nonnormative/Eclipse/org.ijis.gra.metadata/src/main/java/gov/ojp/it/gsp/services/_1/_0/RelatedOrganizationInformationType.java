/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Organization Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getRelatedOrganizationInformationType()
 * @model extendedMetaData="name='RelatedOrganizationInformation_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedOrganizationInformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A body of people grouped together for a common purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getRelatedOrganizationInformationType_Organization()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getOrganization();

} // RelatedOrganizationInformationType
