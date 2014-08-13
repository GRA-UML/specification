/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iepd Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure describing the name and location of an IEPD. An annotation element may be related to an IEPD  by means of a Usage dependency, in which case the properties of this structure are derived from the used IEPD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.IepdReference#getName <em>Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.IepdReference#getIepdurl <em>Iepdurl</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getIepdReference()
 * @model
 * @generated
 */
public interface IepdReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable identification of the IEPD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getIepdReference_Name()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.IepdReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Iepdurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL where the IEPD is posted and available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iepdurl</em>' attribute.
	 * @see #setIepdurl(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getIepdReference_Iepdurl()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getIepdurl();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.IepdReference#getIepdurl <em>Iepdurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iepdurl</em>' attribute.
	 * @see #getIepdurl()
	 * @generated
	 */
	void setIepdurl(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='TODO: define derivation from uses relationship'"
	 * @generated
	 */
	boolean derivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IepdReference
