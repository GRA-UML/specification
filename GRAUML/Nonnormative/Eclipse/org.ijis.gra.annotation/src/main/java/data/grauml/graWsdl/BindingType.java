/**
 */
package data.grauml.graWsdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Binding type as per WSD specification.
 * <!-- end-model-doc -->
 * @see data.grauml.graWsdl.GraWsdlPackage#getBindingType()
 * @model
 * @generated
 */
public enum BindingType implements Enumerator {
	/**
	 * The '<em><b>Soap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOAP_VALUE
	 * @generated
	 * @ordered
	 */
	SOAP(0, "soap", "soap"),

	/**
	 * The '<em><b>Soap12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOAP12_VALUE
	 * @generated
	 * @ordered
	 */
	SOAP12(1, "soap12", "soap12"),

	/**
	 * The '<em><b>Http Get</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_GET_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_GET(2, "httpGet", "httpGet"),

	/**
	 * The '<em><b>Http Put</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_PUT_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_PUT(3, "httpPut", "httpPut");

	/**
	 * The '<em><b>Soap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a soap binding.
	 * <!-- end-model-doc -->
	 * @see #SOAP
	 * @model name="soap"
	 * @generated
	 * @ordered
	 */
	public static final int SOAP_VALUE = 0;

	/**
	 * The '<em><b>Soap12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a wsdl soap 1.2 binding.
	 * <!-- end-model-doc -->
	 * @see #SOAP12
	 * @model name="soap12"
	 * @generated
	 * @ordered
	 */
	public static final int SOAP12_VALUE = 1;

	/**
	 * The '<em><b>Http Get</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a wsdl http get binding.
	 * <!-- end-model-doc -->
	 * @see #HTTP_GET
	 * @model name="httpGet"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_GET_VALUE = 2;

	/**
	 * The '<em><b>Http Put</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a wsdl http post binding.
	 * <!-- end-model-doc -->
	 * @see #HTTP_PUT
	 * @model name="httpPut"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_PUT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Binding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BindingType[] VALUES_ARRAY =
		new BindingType[] {
			SOAP,
			SOAP12,
			HTTP_GET,
			HTTP_PUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Binding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingType get(int value) {
		switch (value) {
			case SOAP_VALUE: return SOAP;
			case SOAP12_VALUE: return SOAP12;
			case HTTP_GET_VALUE: return HTTP_GET;
			case HTTP_PUT_VALUE: return HTTP_PUT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BindingType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BindingType
