/**
 */
package data.grauml.graWsdl.impl;

import data.grauml.graWsdl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraWsdlFactoryImpl extends EFactoryImpl implements GraWsdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraWsdlFactory init() {
		try {
			GraWsdlFactory theGraWsdlFactory = (GraWsdlFactory)EPackage.Registry.INSTANCE.getEFactory(GraWsdlPackage.eNS_URI);
			if (theGraWsdlFactory != null) {
				return theGraWsdlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraWsdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraWsdlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraWsdlPackage.WSDL_SERVICE_INTERFACE: return createWsdlServiceInterface();
			case GraWsdlPackage.WSDL_SERVICE: return createWsdlService();
			case GraWsdlPackage.WSDL_PORT: return createWsdlPort();
			case GraWsdlPackage.WSDL_INTERFACE: return createWsdlInterface();
			case GraWsdlPackage.WSDL_OPERATION: return createWsdlOperation();
			case GraWsdlPackage.WSDL_MESSAGE: return createWsdlMessage();
			case GraWsdlPackage.WSDL_PARAMETER: return createWsdlParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GraWsdlPackage.BINDING_TYPE:
				return createBindingTypeFromString(eDataType, initialValue);
			case GraWsdlPackage.OPERATION_KIND:
				return createOperationKindFromString(eDataType, initialValue);
			case GraWsdlPackage.MESSAGE_LOCATION:
				return createMessageLocationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GraWsdlPackage.BINDING_TYPE:
				return convertBindingTypeToString(eDataType, instanceValue);
			case GraWsdlPackage.OPERATION_KIND:
				return convertOperationKindToString(eDataType, instanceValue);
			case GraWsdlPackage.MESSAGE_LOCATION:
				return convertMessageLocationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlServiceInterface createWsdlServiceInterface() {
		WsdlServiceInterfaceImpl wsdlServiceInterface = new WsdlServiceInterfaceImpl();
		return wsdlServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlService createWsdlService() {
		WsdlServiceImpl wsdlService = new WsdlServiceImpl();
		return wsdlService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlPort createWsdlPort() {
		WsdlPortImpl wsdlPort = new WsdlPortImpl();
		return wsdlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlInterface createWsdlInterface() {
		WsdlInterfaceImpl wsdlInterface = new WsdlInterfaceImpl();
		return wsdlInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlOperation createWsdlOperation() {
		WsdlOperationImpl wsdlOperation = new WsdlOperationImpl();
		return wsdlOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlMessage createWsdlMessage() {
		WsdlMessageImpl wsdlMessage = new WsdlMessageImpl();
		return wsdlMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlParameter createWsdlParameter() {
		WsdlParameterImpl wsdlParameter = new WsdlParameterImpl();
		return wsdlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingType createBindingTypeFromString(EDataType eDataType, String initialValue) {
		BindingType result = BindingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind createOperationKindFromString(EDataType eDataType, String initialValue) {
		OperationKind result = OperationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageLocation createMessageLocationFromString(EDataType eDataType, String initialValue) {
		MessageLocation result = MessageLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraWsdlPackage getGraWsdlPackage() {
		return (GraWsdlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraWsdlPackage getPackage() {
		return GraWsdlPackage.eINSTANCE;
	}

} //GraWsdlFactoryImpl
