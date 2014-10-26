/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a service
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Service#getPort <em>Port</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Service#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Service#getSampleData <em>Sample Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port specification for the ports owned by the service component realizing this Service. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getService_Port()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider of the service. Derived from a Realization between the service's realized Component and the participant's realized Actor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Provider</em>' containment reference.
	 * @see #setServiceProvider(Participant)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getService_ServiceProvider()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Participant getServiceProvider();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Service#getServiceProvider <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider</em>' containment reference.
	 * @see #getServiceProvider()
	 * @generated
	 */
	void setServiceProvider(Participant value);

	/**
	 * Returns the value of the '<em><b>Sample Data</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.SampleData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sample data associated with service testing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample Data</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getService_SampleData()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SampleData> getSampleData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='realizesElement() and realizedElement().oclIsKindOf(Component)'"
	 * @generated
	 */
	boolean realizesComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Service
