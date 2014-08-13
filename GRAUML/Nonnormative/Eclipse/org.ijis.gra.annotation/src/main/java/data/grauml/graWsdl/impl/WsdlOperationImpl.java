/**
 */
package data.grauml.graWsdl.impl;

import data.grauml.graAnnotationModel.impl.OperationImpl;
import data.grauml.graWsdl.GraWsdlPackage;
import data.grauml.graWsdl.OperationKind;
import data.grauml.graWsdl.WsdlOperation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.impl.WsdlOperationImpl#getOperationKindCode <em>Operation Kind Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlOperationImpl extends OperationImpl implements WsdlOperation {
	/**
	 * The default value of the '{@link #getOperationKindCode() <em>Operation Kind Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationKindCode()
	 * @generated
	 * @ordered
	 */
	protected static final OperationKind OPERATION_KIND_CODE_EDEFAULT = OperationKind.DOC;

	/**
	 * The cached value of the '{@link #getOperationKindCode() <em>Operation Kind Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationKindCode()
	 * @generated
	 * @ordered
	 */
	protected OperationKind operationKindCode = OPERATION_KIND_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraWsdlPackage.Literals.WSDL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind getOperationKindCode() {
		return operationKindCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationKindCode(OperationKind newOperationKindCode) {
		OperationKind oldOperationKindCode = operationKindCode;
		operationKindCode = newOperationKindCode == null ? OPERATION_KIND_CODE_EDEFAULT : newOperationKindCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraWsdlPackage.WSDL_OPERATION__OPERATION_KIND_CODE, oldOperationKindCode, operationKindCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraWsdlPackage.WSDL_OPERATION__OPERATION_KIND_CODE:
				return getOperationKindCode();
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
			case GraWsdlPackage.WSDL_OPERATION__OPERATION_KIND_CODE:
				setOperationKindCode((OperationKind)newValue);
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
			case GraWsdlPackage.WSDL_OPERATION__OPERATION_KIND_CODE:
				setOperationKindCode(OPERATION_KIND_CODE_EDEFAULT);
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
			case GraWsdlPackage.WSDL_OPERATION__OPERATION_KIND_CODE:
				return operationKindCode != OPERATION_KIND_CODE_EDEFAULT;
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
		result.append(" (operationKindCode: ");
		result.append(operationKindCode);
		result.append(')');
		return result.toString();
	}

} //WsdlOperationImpl
