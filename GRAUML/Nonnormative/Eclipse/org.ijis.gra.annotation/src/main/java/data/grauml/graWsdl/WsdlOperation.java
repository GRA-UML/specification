/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WSDL Extension of the technology-independent element. Represents a <wsdl:Operation> within a <wsdl:binding> or <wsdl:portType>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.WsdlOperation#getOperationKindCode <em>Operation Kind Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlOperation()
 * @model
 * @generated
 */
public interface WsdlOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Operation Kind Code</b></em>' attribute.
	 * The literals are from the enumeration {@link data.grauml.graWsdl.OperationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the style of a <soap:operation> within a <wsdl:binding><wsdl:operation> which has a <soap:binding>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Kind Code</em>' attribute.
	 * @see data.grauml.graWsdl.OperationKind
	 * @see #setOperationKindCode(OperationKind)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlOperation_OperationKindCode()
	 * @model ordered="false"
	 * @generated
	 */
	OperationKind getOperationKindCode();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlOperation#getOperationKindCode <em>Operation Kind Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Kind Code</em>' attribute.
	 * @see data.grauml.graWsdl.OperationKind
	 * @see #getOperationKindCode()
	 * @generated
	 */
	void setOperationKindCode(OperationKind value);

} // WsdlOperation
