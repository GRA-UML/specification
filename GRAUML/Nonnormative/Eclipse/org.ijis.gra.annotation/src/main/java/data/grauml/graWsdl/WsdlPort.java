/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a <wsdl:port> and <wsdl:binding>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.WsdlPort#getCertificate <em>Certificate</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlPort()
 * @model
 * @generated
 */
public interface WsdlPort extends Port {
	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data for a certificate in support of security
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate</em>' attribute.
	 * @see #setCertificate(String)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlPort_Certificate()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getCertificate();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlPort#getCertificate <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' attribute.
	 * @see #getCertificate()
	 * @generated
	 */
	void setCertificate(String value);

} // WsdlPort
