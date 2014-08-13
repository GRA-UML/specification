/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.ServiceActionType;
import gov.ojp.it.gsp.services._1._0.graPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceActionTypeImpl#getActionName <em>Action Name</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceActionTypeImpl#getActionPurpose <em>Action Purpose</em>}</li>
 *   <li>{@link gov.ojp.it.gsp.services._1._0.impl.ServiceActionTypeImpl#getMessageExchangePattern <em>Message Exchange Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceActionTypeImpl extends MinimalEObjectImpl.Container implements ServiceActionType {
	/**
	 * The default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected String actionName = ACTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionPurpose() <em>Action Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionPurpose() <em>Action Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPurpose()
	 * @generated
	 * @ordered
	 */
	protected String actionPurpose = ACTION_PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageExchangePattern() <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EXCHANGE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageExchangePattern() <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangePattern()
	 * @generated
	 * @ordered
	 */
	protected String messageExchangePattern = MESSAGE_EXCHANGE_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceActionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return graPackage.Literals.SERVICE_ACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionName(String newActionName) {
		String oldActionName = actionName;
		actionName = newActionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_ACTION_TYPE__ACTION_NAME, oldActionName, actionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionPurpose() {
		return actionPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionPurpose(String newActionPurpose) {
		String oldActionPurpose = actionPurpose;
		actionPurpose = newActionPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_ACTION_TYPE__ACTION_PURPOSE, oldActionPurpose, actionPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageExchangePattern() {
		return messageExchangePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchangePattern(String newMessageExchangePattern) {
		String oldMessageExchangePattern = messageExchangePattern;
		messageExchangePattern = newMessageExchangePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, graPackage.SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN, oldMessageExchangePattern, messageExchangePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case graPackage.SERVICE_ACTION_TYPE__ACTION_NAME:
				return getActionName();
			case graPackage.SERVICE_ACTION_TYPE__ACTION_PURPOSE:
				return getActionPurpose();
			case graPackage.SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN:
				return getMessageExchangePattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case graPackage.SERVICE_ACTION_TYPE__ACTION_NAME:
				setActionName((String)newValue);
				return;
			case graPackage.SERVICE_ACTION_TYPE__ACTION_PURPOSE:
				setActionPurpose((String)newValue);
				return;
			case graPackage.SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN:
				setMessageExchangePattern((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case graPackage.SERVICE_ACTION_TYPE__ACTION_NAME:
				setActionName(ACTION_NAME_EDEFAULT);
				return;
			case graPackage.SERVICE_ACTION_TYPE__ACTION_PURPOSE:
				setActionPurpose(ACTION_PURPOSE_EDEFAULT);
				return;
			case graPackage.SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN:
				setMessageExchangePattern(MESSAGE_EXCHANGE_PATTERN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case graPackage.SERVICE_ACTION_TYPE__ACTION_NAME:
				return ACTION_NAME_EDEFAULT == null ? actionName != null : !ACTION_NAME_EDEFAULT.equals(actionName);
			case graPackage.SERVICE_ACTION_TYPE__ACTION_PURPOSE:
				return ACTION_PURPOSE_EDEFAULT == null ? actionPurpose != null : !ACTION_PURPOSE_EDEFAULT.equals(actionPurpose);
			case graPackage.SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN:
				return MESSAGE_EXCHANGE_PATTERN_EDEFAULT == null ? messageExchangePattern != null : !MESSAGE_EXCHANGE_PATTERN_EDEFAULT.equals(messageExchangePattern);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (actionName: ");
		result.append(actionName);
		result.append(", actionPurpose: ");
		result.append(actionPurpose);
		result.append(", messageExchangePattern: ");
		result.append(messageExchangePattern);
		result.append(')');
		return result.toString();
	}

} //ServiceActionTypeImpl
