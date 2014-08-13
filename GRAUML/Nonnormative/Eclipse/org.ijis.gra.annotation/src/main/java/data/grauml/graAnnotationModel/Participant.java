/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A participant in a service interaction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Participant#getParticipatingOrganization <em>Participating Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Participating Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization acting as a participant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participating Organization</em>' reference.
	 * @see #setParticipatingOrganization(Organization)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getParticipant_ParticipatingOrganization()
	 * @model ordered="false"
	 * @generated
	 */
	Organization getParticipatingOrganization();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Participant#getParticipatingOrganization <em>Participating Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participating Organization</em>' reference.
	 * @see #getParticipatingOrganization()
	 * @generated
	 */
	void setParticipatingOrganization(Organization value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='realizesElement() and realizedElement().oclIsKindOf(Actor)'"
	 * @generated
	 */
	boolean realizesActor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Participant
