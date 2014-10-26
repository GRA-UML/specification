/**
 */
package data.grauml.graWsdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * WSDL DOC or RPC Biding. Note for GRA "doc" should always be used.
 * <!-- end-model-doc -->
 * @see data.grauml.graWsdl.GraWsdlPackage#getOperationKind()
 * @model
 * @generated
 */
public enum OperationKind implements Enumerator {
	/**
	 * The '<em><b>Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_VALUE
	 * @generated
	 * @ordered
	 */
	DOC(0, "doc", "doc"),

	/**
	 * The '<em><b>Rpc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPC_VALUE
	 * @generated
	 * @ordered
	 */
	RPC(1, "rpc", "rpc");

	/**
	 * The '<em><b>Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a soap:operation style of "document".
	 * <!-- end-model-doc -->
	 * @see #DOC
	 * @model name="doc"
	 * @generated
	 * @ordered
	 */
	public static final int DOC_VALUE = 0;

	/**
	 * The '<em><b>Rpc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a soap:operation style of "rpc".
	 * <!-- end-model-doc -->
	 * @see #RPC
	 * @model name="rpc"
	 * @generated
	 * @ordered
	 */
	public static final int RPC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Operation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationKind[] VALUES_ARRAY =
		new OperationKind[] {
			DOC,
			RPC,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationKind get(int value) {
		switch (value) {
			case DOC_VALUE: return DOC;
			case RPC_VALUE: return RPC;
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
	private OperationKind(int value, String name, String literal) {
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
	
} //OperationKind
