/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Dependencies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceDependenciesType#getServiceDependency <em>Service Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDependenciesType()
 * @model extendedMetaData="name='ServiceDependencies_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceDependenciesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific service upon which a service directly depends to deliver its real world effects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Dependency</em>' containment reference list.
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceDependenciesType_ServiceDependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceDependency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceIdentificationType> getServiceDependency();

} // ServiceDependenciesType
