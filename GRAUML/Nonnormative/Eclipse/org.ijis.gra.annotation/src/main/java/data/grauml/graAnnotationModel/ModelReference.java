/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model references are generated from Realizations during phase-1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ModelReference#getName <em>Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ModelReference#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ModelReference#getElementId <em>Element Id</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ModelReference#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ModelReference#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModelReference()
 * @model
 * @generated
 */
public interface ModelReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the realized element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModelReference_Name()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ModelReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The documentation of the realized element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModelReference_Documentation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ModelReference#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the realized element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModelReference_ElementId()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ModelReference#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Link</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URIs of diagrams associated with the realized element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagram Link</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModelReference_DiagramLink()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	EList<String> getDiagramLink();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model resource containing the realized element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(Model)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModelReference_Model()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ModelReference#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='TODO: define derivation from realization'"
	 * @generated
	 */
	boolean derivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ModelReference
