/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A representation of the model resource associated with a ModelReference and generated as part of the generation of the ModelReference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Model#getModelUri <em>Model Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Model#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI for the model resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Uri</em>' attribute.
	 * @see #setModelUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModel_ModelUri()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getModelUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Model#getModelUri <em>Model Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Uri</em>' attribute.
	 * @see #getModelUri()
	 * @generated
	 */
	void setModelUri(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getModel_Label()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Model#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Model
