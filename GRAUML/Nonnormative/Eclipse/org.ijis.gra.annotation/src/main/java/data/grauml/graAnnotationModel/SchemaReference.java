/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elements describing a schema used by this service interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.SchemaReference#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.SchemaReference#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.SchemaReference#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getSchemaReference()
 * @model
 * @generated
 */
public interface SchemaReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Namespace of schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getSchemaReference_Namespace()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.SchemaReference#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix used to reference Schema Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getSchemaReference_Prefix()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.SchemaReference#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of Schema, relative to SPP Catalog
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getSchemaReference_SchemaLocation()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.SchemaReference#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='TODO: derivation'"
	 * @generated
	 */
	boolean derivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SchemaReference
