/**
 */
package data.grauml.graWsdl.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;

import data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl;

import data.grauml.graWsdl.BindingType;
import data.grauml.graWsdl.GraWsdlFactory;
import data.grauml.graWsdl.GraWsdlPackage;
import data.grauml.graWsdl.MessageLocation;
import data.grauml.graWsdl.OperationKind;
import data.grauml.graWsdl.WsdlInterface;
import data.grauml.graWsdl.WsdlMessage;
import data.grauml.graWsdl.WsdlOperation;
import data.grauml.graWsdl.WsdlParameter;
import data.grauml.graWsdl.WsdlPort;
import data.grauml.graWsdl.WsdlService;
import data.grauml.graWsdl.WsdlServiceInterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import types.TypesPackage;

import types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraWsdlPackageImpl extends EPackageImpl implements GraWsdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlServiceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageLocationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see data.grauml.graWsdl.GraWsdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraWsdlPackageImpl() {
		super(eNS_URI, GraWsdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GraWsdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraWsdlPackage init() {
		if (isInited) return (GraWsdlPackage)EPackage.Registry.INSTANCE.getEPackage(GraWsdlPackage.eNS_URI);

		// Obtain or create and register package
		GraWsdlPackageImpl theGraWsdlPackage = (GraWsdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraWsdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraWsdlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GraAnnotationModelPackageImpl theGraAnnotationModelPackage = (GraAnnotationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraAnnotationModelPackage.eNS_URI) instanceof GraAnnotationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraAnnotationModelPackage.eNS_URI) : GraAnnotationModelPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theGraWsdlPackage.createPackageContents();
		theGraAnnotationModelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theGraWsdlPackage.initializePackageContents();
		theGraAnnotationModelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraWsdlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraWsdlPackage.eNS_URI, theGraWsdlPackage);
		return theGraWsdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlServiceInterface() {
		return wsdlServiceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlService() {
		return wsdlServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlPort() {
		return wsdlPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlPort_Certificate() {
		return (EAttribute)wsdlPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlInterface() {
		return wsdlInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlInterface_BindingCode() {
		return (EAttribute)wsdlInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlOperation() {
		return wsdlOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlOperation_OperationKindCode() {
		return (EAttribute)wsdlOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlMessage() {
		return wsdlMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlMessage_MessageLocationCode() {
		return (EAttribute)wsdlMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlMessage_Encoding() {
		return (EAttribute)wsdlMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlMessage_SoapAction() {
		return (EAttribute)wsdlMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlParameter() {
		return wsdlParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlParameter_MimeType() {
		return (EAttribute)wsdlParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingType() {
		return bindingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationKind() {
		return operationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageLocation() {
		return messageLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraWsdlFactory getGraWsdlFactory() {
		return (GraWsdlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wsdlServiceInterfaceEClass = createEClass(WSDL_SERVICE_INTERFACE);

		wsdlServiceEClass = createEClass(WSDL_SERVICE);

		wsdlPortEClass = createEClass(WSDL_PORT);
		createEAttribute(wsdlPortEClass, WSDL_PORT__CERTIFICATE);

		wsdlInterfaceEClass = createEClass(WSDL_INTERFACE);
		createEAttribute(wsdlInterfaceEClass, WSDL_INTERFACE__BINDING_CODE);

		wsdlOperationEClass = createEClass(WSDL_OPERATION);
		createEAttribute(wsdlOperationEClass, WSDL_OPERATION__OPERATION_KIND_CODE);

		wsdlMessageEClass = createEClass(WSDL_MESSAGE);
		createEAttribute(wsdlMessageEClass, WSDL_MESSAGE__MESSAGE_LOCATION_CODE);
		createEAttribute(wsdlMessageEClass, WSDL_MESSAGE__ENCODING);
		createEAttribute(wsdlMessageEClass, WSDL_MESSAGE__SOAP_ACTION);

		wsdlParameterEClass = createEClass(WSDL_PARAMETER);
		createEAttribute(wsdlParameterEClass, WSDL_PARAMETER__MIME_TYPE);

		// Create enums
		bindingTypeEEnum = createEEnum(BINDING_TYPE);
		operationKindEEnum = createEEnum(OPERATION_KIND);
		messageLocationEEnum = createEEnum(MESSAGE_LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraAnnotationModelPackage theGraAnnotationModelPackage = (GraAnnotationModelPackage)EPackage.Registry.INSTANCE.getEPackage(GraAnnotationModelPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wsdlServiceInterfaceEClass.getESuperTypes().add(theGraAnnotationModelPackage.getServiceInterfaceSpecification());
		wsdlServiceEClass.getESuperTypes().add(theGraAnnotationModelPackage.getService());
		wsdlPortEClass.getESuperTypes().add(theGraAnnotationModelPackage.getPort());
		wsdlInterfaceEClass.getESuperTypes().add(theGraAnnotationModelPackage.getInterface());
		wsdlOperationEClass.getESuperTypes().add(theGraAnnotationModelPackage.getOperation());
		wsdlMessageEClass.getESuperTypes().add(theGraAnnotationModelPackage.getMessage());
		wsdlParameterEClass.getESuperTypes().add(theGraAnnotationModelPackage.getParameter());

		// Initialize classes, features, and operations; add parameters
		initEClass(wsdlServiceInterfaceEClass, WsdlServiceInterface.class, "WsdlServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsdlServiceEClass, WsdlService.class, "WsdlService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsdlPortEClass, WsdlPort.class, "WsdlPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWsdlPort_Certificate(), theTypesPackage.getString(), "certificate", null, 0, 1, WsdlPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(wsdlInterfaceEClass, WsdlInterface.class, "WsdlInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWsdlInterface_BindingCode(), this.getBindingType(), "bindingCode", null, 0, 1, WsdlInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(wsdlOperationEClass, WsdlOperation.class, "WsdlOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWsdlOperation_OperationKindCode(), this.getOperationKind(), "operationKindCode", null, 0, 1, WsdlOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(wsdlMessageEClass, WsdlMessage.class, "WsdlMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWsdlMessage_MessageLocationCode(), this.getMessageLocation(), "messageLocationCode", null, 0, 1, WsdlMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWsdlMessage_Encoding(), theTypesPackage.getString(), "encoding", null, 0, 1, WsdlMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWsdlMessage_SoapAction(), theTypesPackage.getString(), "soapAction", null, 0, 1, WsdlMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(wsdlParameterEClass, WsdlParameter.class, "WsdlParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWsdlParameter_MimeType(), theTypesPackage.getString(), "mimeType", null, 0, 1, WsdlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingTypeEEnum, BindingType.class, "BindingType");
		addEEnumLiteral(bindingTypeEEnum, BindingType.SOAP);
		addEEnumLiteral(bindingTypeEEnum, BindingType.SOAP12);
		addEEnumLiteral(bindingTypeEEnum, BindingType.HTTP_GET);
		addEEnumLiteral(bindingTypeEEnum, BindingType.HTTP_PUT);

		initEEnum(operationKindEEnum, OperationKind.class, "OperationKind");
		addEEnumLiteral(operationKindEEnum, OperationKind.DOC);
		addEEnumLiteral(operationKindEEnum, OperationKind.RPC);

		initEEnum(messageLocationEEnum, MessageLocation.class, "MessageLocation");
		addEEnumLiteral(messageLocationEEnum, MessageLocation.BODY);
		addEEnumLiteral(messageLocationEEnum, MessageLocation.HEADER);
		addEEnumLiteral(messageLocationEEnum, MessageLocation.URL);

		// Create resource
		createResource(eNS_URI);
	}

} //GraWsdlPackageImpl
