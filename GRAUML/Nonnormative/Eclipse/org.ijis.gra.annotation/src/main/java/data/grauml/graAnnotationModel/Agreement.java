/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing an agreement, formal or informal, associated with a service, application or thing, tangible or otherwise.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Agreement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Agreement#getAgreementUri <em>Agreement Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Agreement#isAutomatedAgreementIndicator <em>Automated Agreement Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getAgreement()
 * @model
 * @generated
 */
public interface Agreement extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text description of an agreement, formal or informal, associated with a service, application or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getAgreement_Documentation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Agreement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A locator referencing an agreement, formal or informal, associated with a service, application or thing, tangible or otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement Uri</em>' attribute.
	 * @see #setAgreementUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getAgreement_AgreementUri()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getAgreementUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Agreement#getAgreementUri <em>Agreement Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Uri</em>' attribute.
	 * @see #getAgreementUri()
	 * @generated
	 */
	void setAgreementUri(String value);

	/**
	 * Returns the value of the '<em><b>Automated Agreement Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the policy or contract represented by the Agreement has an automated implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automated Agreement Indicator</em>' attribute.
	 * @see #setAutomatedAgreementIndicator(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getAgreement_AutomatedAgreementIndicator()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isAutomatedAgreementIndicator();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Agreement#isAutomatedAgreementIndicator <em>Automated Agreement Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automated Agreement Indicator</em>' attribute.
	 * @see #isAutomatedAgreementIndicator()
	 * @generated
	 */
	void setAutomatedAgreementIndicator(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='stringValueOf(\"Documentation\") = docComment()'"
	 * @generated
	 */
	boolean docDerivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Agreement
