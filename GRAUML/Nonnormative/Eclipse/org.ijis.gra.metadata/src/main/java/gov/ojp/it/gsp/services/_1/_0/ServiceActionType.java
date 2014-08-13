/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure representing a services action information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionName <em>Action Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionPurpose <em>Action Purpose</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getMessageExchangePattern <em>Message Exchange Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceActionType()
 * @model extendedMetaData="name='ServiceActionType' kind='elementOnly'"
 * @generated
 */
public interface ServiceActionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service action performed within this service interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceActionType_ActionName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ActionName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionName <em>Action Name</em>}' attribute.
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
	 * A description of the Service Action purpose performed by this service interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Purpose</em>' attribute.
	 * @see #setActionPurpose(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceActionType_ActionPurpose()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ActionPurpose' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActionPurpose();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionPurpose <em>Action Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Purpose</em>' attribute.
	 * @see #getActionPurpose()
	 * @generated
	 */
	void setActionPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A category of transaction this service is designed and used for: query/response, message, publish/subscribe, document, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Exchange Pattern</em>' attribute.
	 * @see #setMessageExchangePattern(String)
	 * @see gov.ojp.it.gsp.services._1._0.graPackage#getServiceActionType_MessageExchangePattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MessageExchangePattern' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessageExchangePattern();

	/**
	 * Sets the value of the '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getMessageExchangePattern <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange Pattern</em>' attribute.
	 * @see #getMessageExchangePattern()
	 * @generated
	 */
	void setMessageExchangePattern(String value);

} // ServiceActionType
