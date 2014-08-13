/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interaction Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType#getServiceInteractionProfile <em>Service Interaction Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInteractionProfilesType()
 * @model extendedMetaData="name='ServiceInteractionProfiles_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceInteractionProfilesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Interaction Profile</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of information about the Service Interaction Profile Implemented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interaction Profile</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceInteractionProfilesType_ServiceInteractionProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceInteractionProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceInteractionProfileType> getServiceInteractionProfile();

} // ServiceInteractionProfilesType
