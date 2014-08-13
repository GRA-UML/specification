/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents exchanges between parties. Realizes an Interaction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInteraction#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInteraction()
 * @model
 * @generated
 */
public interface ServiceInteraction extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The participants in the interaction, each of which realizes an Actor that is involved in the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInteraction_Participant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='realizesElement() and realizedElement().oclIsKindOf(Interaction)\n-- TODO: the partipants must realize Actors involved in the interaction'"
	 * @generated
	 */
	boolean realizesInteraction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceInteraction
