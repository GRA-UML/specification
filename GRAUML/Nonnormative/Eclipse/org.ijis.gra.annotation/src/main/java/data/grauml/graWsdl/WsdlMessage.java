/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a <wsdl:message>, its contained <part>, and its usage from a <wsdl:input>, <wsdl:output>, or a <wsdl:fault> within a <wsdl:portType> <wsdl:operation> .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.WsdlMessage#getMessageLocationCode <em>Message Location Code</em>}</li>
 *   <li>{@link data.grauml.graWsdl.WsdlMessage#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link data.grauml.graWsdl.WsdlMessage#getSoapAction <em>Soap Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlMessage()
 * @model
 * @generated
 */
public interface WsdlMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Message Location Code</b></em>' attribute.
	 * The literals are from the enumeration {@link data.grauml.graWsdl.MessageLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When used in conjunction with a soap binding, indicates the location of the part within the message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Location Code</em>' attribute.
	 * @see data.grauml.graWsdl.MessageLocation
	 * @see #setMessageLocationCode(MessageLocation)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlMessage_MessageLocationCode()
	 * @model ordered="false"
	 * @generated
	 */
	MessageLocation getMessageLocationCode();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlMessage#getMessageLocationCode <em>Message Location Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Location Code</em>' attribute.
	 * @see data.grauml.graWsdl.MessageLocation
	 * @see #getMessageLocationCode()
	 * @generated
	 */
	void setMessageLocationCode(MessageLocation value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the encoding style of a wsdl binding operation parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlMessage_Encoding()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlMessage#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the content of a soapAction within a binding operation having a <soap:binding>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soap Action</em>' attribute.
	 * @see #setSoapAction(String)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlMessage_SoapAction()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getSoapAction();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlMessage#getSoapAction <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap Action</em>' attribute.
	 * @see #getSoapAction()
	 * @generated
	 */
	void setSoapAction(String value);

} // WsdlMessage
