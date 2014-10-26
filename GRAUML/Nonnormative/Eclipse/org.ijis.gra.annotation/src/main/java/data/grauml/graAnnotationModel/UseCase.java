/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 *   <body>
 *     <p>
 * A UseCase annotation represents one or more &quot;real world effects&quot; of a ServiceDescription. &#160;In the annotation model, a UseCase instance may realize a UseCase or a Package in the logical model. &#160;In the former case, Phase-1 will generate a single UseCase instance<span lang="EN-US">. In the latter case, Phase-1 will generate a UseCase instance for each UML&#160;UseCase contained in the realized Package. &#160;In all cases the generated UseCases' </span>Provider and Consumer properties are derived from Associations stereotyped <span lang="EN-US">«Provider» and «Consumer» between the logical UseCases and the logical Actors that correspond to Participants in the generated annotation model.</span>
 *     </p>
 * 
 *     <p>
 * &#160;
 *     </p>
 * 
 *     <p>
 * &#160;
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.UseCase#getProvider <em>Provider</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.UseCase#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants that provide services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getUseCase_Provider()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getProvider();

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants that consume services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getUseCase_Consumer()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getConsumer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='TODO: define derivation.'"
	 * @generated
	 */
	boolean derivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // UseCase
