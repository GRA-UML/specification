/**
 */
package data.grauml.graAnnotationModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exchange Pattern</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Represents a GRA Exchange Pattern.
 * This type should define the message exchange patterns leveraged by the service actions.
 * The GRA recognizes the following message exchange patterns:
 * The FIRE-AND-FORGET pattern calls for the sender of a message (which could be the service consumer or service) to send the message and not expect a reply message back from the recipient. This pattern is useful for one-way transmission of information, such as notification that an event has occurred.
 * The REQUEST-REPLY pattern calls for the sender of a message to send the message and expect a reply from the recipient.
 * These two patterns are considered “primitive” patterns, in that they are the fundamental building blocks of more complex information exchange scenarios. For instance, the complex PUBLISH-SUBSCRIBE pattern involves an initial request-reply exchange in which the subscriber subscribes to a service, followed by the service using the fire-and-forget pattern to notify subscribers of an event.
 * Within the service interface description, the behavioral model should describe message exchanges in terms of these two primitive exchange patterns. Each action can specify a different message exchange pattern.
 * <!-- end-model-doc -->
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getExchangePattern()
 * @model
 * @generated
 */
public enum ExchangePattern implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"), /**
	 * The '<em><b>Enquiry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENQUIRY_VALUE
	 * @generated
	 * @ordered
	 */
	ENQUIRY(1, "enquiry", "enquiry"),

	/**
	 * The '<em><b>Subscription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(2, "subscription", "subscription"),

	/**
	 * The '<em><b>Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION(3, "notification", "notification"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(4, "update", "update"),

	/**
	 * The '<em><b>Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(5, "message", "message");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a temporary workaround for some EMF issues.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Enquiry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enquiry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENQUIRY
	 * @model name="enquiry"
	 * @generated
	 * @ordered
	 */
	public static final int ENQUIRY_VALUE = 1;

	/**
	 * The '<em><b>Subscription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subscription</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION
	 * @model name="subscription"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 2;

	/**
	 * The '<em><b>Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION
	 * @model name="notification"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_VALUE = 3;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model name="update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 4;

	/**
	 * The '<em><b>Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE
	 * @model name="message"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Exchange Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExchangePattern[] VALUES_ARRAY =
		new ExchangePattern[] {
			UNKNOWN,
			ENQUIRY,
			SUBSCRIPTION,
			NOTIFICATION,
			UPDATE,
			MESSAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Exchange Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExchangePattern> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exchange Pattern</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangePattern get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExchangePattern result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exchange Pattern</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangePattern getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExchangePattern result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exchange Pattern</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangePattern get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case ENQUIRY_VALUE: return ENQUIRY;
			case SUBSCRIPTION_VALUE: return SUBSCRIPTION;
			case NOTIFICATION_VALUE: return NOTIFICATION;
			case UPDATE_VALUE: return UPDATE;
			case MESSAGE_VALUE: return MESSAGE;
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
	private ExchangePattern(int value, String name, String literal) {
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
	
} //ExchangePattern
