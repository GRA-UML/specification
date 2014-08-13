/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.ExchangePattern;
import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.Operation;
import data.grauml.graAnnotationModel.Parameter;
import data.grauml.graAnnotationModel.util.GraAnnotationModelValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OperationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OperationImpl#getMessageExchangePattern <em>Message Exchange Pattern</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OperationImpl#isIsAsynchronous <em>Is Asynchronous</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OperationImpl#getActionName <em>Action Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OperationImpl#getActionPurpose <em>Action Purpose</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.OperationImpl#getActionProvenance <em>Action Provenance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends GraServiceAnnotationBaseImpl implements Operation {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getMessageExchangePattern() <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangePattern()
	 * @generated
	 * @ordered
	 */
	protected static final ExchangePattern MESSAGE_EXCHANGE_PATTERN_EDEFAULT = ExchangePattern.UNKNOWN;

	/**
	 * The cached value of the '{@link #getMessageExchangePattern() <em>Message Exchange Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangePattern()
	 * @generated
	 * @ordered
	 */
	protected ExchangePattern messageExchangePattern = MESSAGE_EXCHANGE_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAsynchronous() <em>Is Asynchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAsynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAsynchronous() <em>Is Asynchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAsynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean isAsynchronous = IS_ASYNCHRONOUS_EDEFAULT;

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
	 * The default value of the '{@link #getActionProvenance() <em>Action Provenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionProvenance()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_PROVENANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionProvenance() <em>Action Provenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionProvenance()
	 * @generated
	 * @ordered
	 */
	protected String actionProvenance = ACTION_PROVENANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, GraAnnotationModelPackage.OPERATION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePattern getMessageExchangePattern() {
		return messageExchangePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchangePattern(ExchangePattern newMessageExchangePattern) {
		ExchangePattern oldMessageExchangePattern = messageExchangePattern;
		messageExchangePattern = newMessageExchangePattern == null ? MESSAGE_EXCHANGE_PATTERN_EDEFAULT : newMessageExchangePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.OPERATION__MESSAGE_EXCHANGE_PATTERN, oldMessageExchangePattern, messageExchangePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAsynchronous() {
		return isAsynchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAsynchronous(boolean newIsAsynchronous) {
		boolean oldIsAsynchronous = isAsynchronous;
		isAsynchronous = newIsAsynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.OPERATION__IS_ASYNCHRONOUS, oldIsAsynchronous, isAsynchronous));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.OPERATION__ACTION_NAME, oldActionName, actionName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.OPERATION__ACTION_PURPOSE, oldActionPurpose, actionPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionProvenance() {
		return actionProvenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionProvenance(String newActionProvenance) {
		String oldActionProvenance = actionProvenance;
		actionProvenance = newActionProvenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.OPERATION__ACTION_PROVENANCE, oldActionProvenance, actionProvenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean realizesOperationOrReception(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 GraAnnotationModelValidator.DIAGNOSTIC_SOURCE,
						 GraAnnotationModelValidator.OPERATION__REALIZES_OPERATION_OR_RECEPTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "realizesOperationOrReception", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean purposeDerivation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 GraAnnotationModelValidator.DIAGNOSTIC_SOURCE,
						 GraAnnotationModelValidator.OPERATION__PURPOSE_DERIVATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "purposeDerivation", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraAnnotationModelPackage.OPERATION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.OPERATION__PARAMETER:
				return getParameter();
			case GraAnnotationModelPackage.OPERATION__MESSAGE_EXCHANGE_PATTERN:
				return getMessageExchangePattern();
			case GraAnnotationModelPackage.OPERATION__IS_ASYNCHRONOUS:
				return isIsAsynchronous();
			case GraAnnotationModelPackage.OPERATION__ACTION_NAME:
				return getActionName();
			case GraAnnotationModelPackage.OPERATION__ACTION_PURPOSE:
				return getActionPurpose();
			case GraAnnotationModelPackage.OPERATION__ACTION_PROVENANCE:
				return getActionProvenance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraAnnotationModelPackage.OPERATION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case GraAnnotationModelPackage.OPERATION__MESSAGE_EXCHANGE_PATTERN:
				setMessageExchangePattern((ExchangePattern)newValue);
				return;
			case GraAnnotationModelPackage.OPERATION__IS_ASYNCHRONOUS:
				setIsAsynchronous((Boolean)newValue);
				return;
			case GraAnnotationModelPackage.OPERATION__ACTION_NAME:
				setActionName((String)newValue);
				return;
			case GraAnnotationModelPackage.OPERATION__ACTION_PURPOSE:
				setActionPurpose((String)newValue);
				return;
			case GraAnnotationModelPackage.OPERATION__ACTION_PROVENANCE:
				setActionProvenance((String)newValue);
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
			case GraAnnotationModelPackage.OPERATION__PARAMETER:
				getParameter().clear();
				return;
			case GraAnnotationModelPackage.OPERATION__MESSAGE_EXCHANGE_PATTERN:
				setMessageExchangePattern(MESSAGE_EXCHANGE_PATTERN_EDEFAULT);
				return;
			case GraAnnotationModelPackage.OPERATION__IS_ASYNCHRONOUS:
				setIsAsynchronous(IS_ASYNCHRONOUS_EDEFAULT);
				return;
			case GraAnnotationModelPackage.OPERATION__ACTION_NAME:
				setActionName(ACTION_NAME_EDEFAULT);
				return;
			case GraAnnotationModelPackage.OPERATION__ACTION_PURPOSE:
				setActionPurpose(ACTION_PURPOSE_EDEFAULT);
				return;
			case GraAnnotationModelPackage.OPERATION__ACTION_PROVENANCE:
				setActionProvenance(ACTION_PROVENANCE_EDEFAULT);
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
			case GraAnnotationModelPackage.OPERATION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case GraAnnotationModelPackage.OPERATION__MESSAGE_EXCHANGE_PATTERN:
				return messageExchangePattern != MESSAGE_EXCHANGE_PATTERN_EDEFAULT;
			case GraAnnotationModelPackage.OPERATION__IS_ASYNCHRONOUS:
				return isAsynchronous != IS_ASYNCHRONOUS_EDEFAULT;
			case GraAnnotationModelPackage.OPERATION__ACTION_NAME:
				return ACTION_NAME_EDEFAULT == null ? actionName != null : !ACTION_NAME_EDEFAULT.equals(actionName);
			case GraAnnotationModelPackage.OPERATION__ACTION_PURPOSE:
				return ACTION_PURPOSE_EDEFAULT == null ? actionPurpose != null : !ACTION_PURPOSE_EDEFAULT.equals(actionPurpose);
			case GraAnnotationModelPackage.OPERATION__ACTION_PROVENANCE:
				return ACTION_PROVENANCE_EDEFAULT == null ? actionProvenance != null : !ACTION_PROVENANCE_EDEFAULT.equals(actionProvenance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraAnnotationModelPackage.OPERATION___REALIZES_OPERATION_OR_RECEPTION__DIAGNOSTICCHAIN_MAP:
				return realizesOperationOrReception((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case GraAnnotationModelPackage.OPERATION___PURPOSE_DERIVATION__DIAGNOSTICCHAIN_MAP:
				return purposeDerivation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (messageExchangePattern: ");
		result.append(messageExchangePattern);
		result.append(", isAsynchronous: ");
		result.append(isAsynchronous);
		result.append(", actionName: ");
		result.append(actionName);
		result.append(", actionPurpose: ");
		result.append(actionPurpose);
		result.append(", actionProvenance: ");
		result.append(actionProvenance);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
