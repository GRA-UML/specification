/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Actions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceActionsType#getServiceAction <em>Service Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceActionsType()
 * @model extendedMetaData="name='ServiceActions_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceActionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Action</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.ServiceActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complex element containing Actions information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Action</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceActionsType_ServiceAction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceActionType> getServiceAction();

} // ServiceActionsType
