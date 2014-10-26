/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WSDL Extension of the technology-independent element. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.WsdlParameter#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlParameter()
 * @model
 * @generated
 */
public interface WsdlParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the <mime:content> type within a <wsdl:binding> <wsdl:operation> parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlParameter_MimeType()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlParameter#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // WsdlParameter
