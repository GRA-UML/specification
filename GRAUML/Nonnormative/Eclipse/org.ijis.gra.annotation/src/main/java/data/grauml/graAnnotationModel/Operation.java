/**
 */
package data.grauml.graAnnotationModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing a service action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Operation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Operation#getMessageExchangePattern <em>Message Exchange Pattern</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Operation#isIsAsynchronous <em>Is Asynchronous</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Operation#getActionName <em>Action Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Operation#getActionPurpose <em>Action Purpose</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Operation#getActionProvenance <em>Action Provenance</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters of an operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOperation_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link data.grauml.graAnnotationModel.ExchangePattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the GRA message exchange pattern associated with the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Exchange Pattern</em>' attribute.
	 * @see data.grauml.graAnnotationModel.ExchangePattern
	 * @see #setMessageExchangePattern(ExchangePattern)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOperation_MessageExchangePattern()
	 * @model ordered="false"
	 * @generated
	 */
	ExchangePattern getMessageExchangePattern();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Operation#getMessageExchangePattern <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange Pattern</em>' attribute.
	 * @see data.grauml.graAnnotationModel.ExchangePattern
	 * @see #getMessageExchangePattern()
	 * @generated
	 */
	void setMessageExchangePattern(ExchangePattern value);

	/**
	 * Returns the value of the '<em><b>Is Asynchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the operation is asynchronous, false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Asynchronous</em>' attribute.
	 * @see #setIsAsynchronous(boolean)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOperation_IsAsynchronous()
	 * @model dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isIsAsynchronous();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Operation#isIsAsynchronous <em>Is Asynchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Asynchronous</em>' attribute.
	 * @see #isIsAsynchronous()
	 * @generated
	 */
	void setIsAsynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOperation_ActionName()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Operation#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

	/**
	 * Returns the value of the '<em><b>Action Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the purpose performed by this service action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Purpose</em>' attribute.
	 * @see #setActionPurpose(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOperation_ActionPurpose()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getActionPurpose();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Operation#getActionPurpose <em>Action Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Purpose</em>' attribute.
	 * @see #getActionPurpose()
	 * @generated
	 */
	void setActionPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Action Provenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of provenance information for this action. Used to populate the Action Model section of SDD document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Provenance</em>' attribute.
	 * @see #setActionProvenance(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getOperation_ActionProvenance()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getActionProvenance();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Operation#getActionProvenance <em>Action Provenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Provenance</em>' attribute.
	 * @see #getActionProvenance()
	 * @generated
	 */
	void setActionProvenance(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='realizesElement() and (realizedElement().oclIsKindOf(Operation) or realizedElement().oclIsKindOf(Reception))'"
	 * @generated
	 */
	boolean realizesOperationOrReception(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='stringValueOf(\"ActionPurpose\") = realizedElement().docComment()'"
	 * @generated
	 */
	boolean purposeDerivation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Operation
