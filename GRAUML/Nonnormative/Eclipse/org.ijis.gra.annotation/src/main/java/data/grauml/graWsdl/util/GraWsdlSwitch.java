/**
 */
package data.grauml.graWsdl.util;

import data.grauml.graAnnotationModel.GraServiceAnnotationBase;
import data.grauml.graAnnotationModel.Interface;
import data.grauml.graAnnotationModel.Message;
import data.grauml.graAnnotationModel.Operation;
import data.grauml.graAnnotationModel.Parameter;
import data.grauml.graAnnotationModel.Port;
import data.grauml.graAnnotationModel.Service;
import data.grauml.graAnnotationModel.ServiceInterfaceSpecification;

import data.grauml.graWsdl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see data.grauml.graWsdl.GraWsdlPackage
 * @generated
 */
public class GraWsdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraWsdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraWsdlSwitch() {
		if (modelPackage == null) {
			modelPackage = GraWsdlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GraWsdlPackage.WSDL_SERVICE_INTERFACE: {
				WsdlServiceInterface wsdlServiceInterface = (WsdlServiceInterface)theEObject;
				T result = caseWsdlServiceInterface(wsdlServiceInterface);
				if (result == null) result = caseServiceInterfaceSpecification(wsdlServiceInterface);
				if (result == null) result = caseGraServiceAnnotationBase(wsdlServiceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraWsdlPackage.WSDL_SERVICE: {
				WsdlService wsdlService = (WsdlService)theEObject;
				T result = caseWsdlService(wsdlService);
				if (result == null) result = caseService(wsdlService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraWsdlPackage.WSDL_PORT: {
				WsdlPort wsdlPort = (WsdlPort)theEObject;
				T result = caseWsdlPort(wsdlPort);
				if (result == null) result = casePort(wsdlPort);
				if (result == null) result = caseGraServiceAnnotationBase(wsdlPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraWsdlPackage.WSDL_INTERFACE: {
				WsdlInterface wsdlInterface = (WsdlInterface)theEObject;
				T result = caseWsdlInterface(wsdlInterface);
				if (result == null) result = caseInterface(wsdlInterface);
				if (result == null) result = caseGraServiceAnnotationBase(wsdlInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraWsdlPackage.WSDL_OPERATION: {
				WsdlOperation wsdlOperation = (WsdlOperation)theEObject;
				T result = caseWsdlOperation(wsdlOperation);
				if (result == null) result = caseOperation(wsdlOperation);
				if (result == null) result = caseGraServiceAnnotationBase(wsdlOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraWsdlPackage.WSDL_MESSAGE: {
				WsdlMessage wsdlMessage = (WsdlMessage)theEObject;
				T result = caseWsdlMessage(wsdlMessage);
				if (result == null) result = caseMessage(wsdlMessage);
				if (result == null) result = caseGraServiceAnnotationBase(wsdlMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraWsdlPackage.WSDL_PARAMETER: {
				WsdlParameter wsdlParameter = (WsdlParameter)theEObject;
				T result = caseWsdlParameter(wsdlParameter);
				if (result == null) result = caseParameter(wsdlParameter);
				if (result == null) result = caseGraServiceAnnotationBase(wsdlParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlServiceInterface(WsdlServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlService(WsdlService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlPort(WsdlPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlInterface(WsdlInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlOperation(WsdlOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlMessage(WsdlMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlParameter(WsdlParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gra Service Annotation Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gra Service Annotation Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraServiceAnnotationBase(GraServiceAnnotationBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interface Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interface Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInterfaceSpecification(ServiceInterfaceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GraWsdlSwitch
