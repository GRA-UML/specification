/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a <wsdl:portType>. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.WsdlInterface#getBindingCode <em>Binding Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlInterface()
 * @model
 * @generated
 */
public interface WsdlInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Binding Code</b></em>' attribute.
	 * The literals are from the enumeration {@link data.grauml.graWsdl.BindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies technology implementation for a <wsdl:binding>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Code</em>' attribute.
	 * @see data.grauml.graWsdl.BindingType
	 * @see #setBindingCode(BindingType)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlInterface_BindingCode()
	 * @model ordered="false"
	 * @generated
	 */
	BindingType getBindingCode();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlInterface#getBindingCode <em>Binding Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Code</em>' attribute.
	 * @see data.grauml.graWsdl.BindingType
	 * @see #getBindingCode()
	 * @generated
	 */
	void setBindingCode(BindingType value);

} // WsdlInterface
