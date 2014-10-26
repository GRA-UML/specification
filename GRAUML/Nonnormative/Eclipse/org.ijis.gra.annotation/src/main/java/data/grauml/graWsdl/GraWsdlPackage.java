/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see data.grauml.graWsdl.GraWsdlFactory
 * @model kind="package"
 * @generated
 */
public interface GraWsdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graWsdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:/ijis.org/GRA/WSDLAnnotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraWsdlPackage eINSTANCE = data.grauml.graWsdl.impl.GraWsdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlServiceInterfaceImpl <em>Wsdl Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlServiceInterfaceImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlServiceInterface()
	 * @generated
	 */
	int WSDL_SERVICE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__NAME = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__DOCUMENTATION = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__TEMPLATE = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__REQUIREMENT = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__MODEL_REFERENCE = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__FLAG = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__DIAGNOSTICS = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Security Implemented Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SECURITY_IMPLEMENTED_INDICATOR = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR;

	/**
	 * The feature id for the '<em><b>Security Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SECURITY_DESCRIPTION_TEXT = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT;

	/**
	 * The feature id for the '<em><b>Service Interaction Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SERVICE_INTERACTION_PROFILE = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SERVICE = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE;

	/**
	 * The feature id for the '<em><b>Uri Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__URI_ADDRESS = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS;

	/**
	 * The feature id for the '<em><b>Message Definition Mechanism</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__MESSAGE_DEFINITION_MECHANISM = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM;

	/**
	 * The feature id for the '<em><b>Service Interface Description Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SERVICE_INTERFACE_DESCRIPTION_URI = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__TARGET_NAMESPACE = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__PREFIX = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__PREFIX;

	/**
	 * The feature id for the '<em><b>Service Testing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SERVICE_TESTING = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING;

	/**
	 * The feature id for the '<em><b>Schema Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SCHEMA_REFERENCE = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE;

	/**
	 * The feature id for the '<em><b>Service Interface Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT;

	/**
	 * The feature id for the '<em><b>Physical Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE__PHYSICAL_MODEL = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION__PHYSICAL_MODEL;

	/**
	 * The number of structural features of the '<em>Wsdl Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE_FEATURE_COUNT = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wsdl Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_INTERFACE_OPERATION_COUNT = GraAnnotationModelPackage.SERVICE_INTERFACE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlServiceImpl <em>Wsdl Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlServiceImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlService()
	 * @generated
	 */
	int WSDL_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE__PORT = GraAnnotationModelPackage.SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE__SERVICE_PROVIDER = GraAnnotationModelPackage.SERVICE__SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Sample Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE__SAMPLE_DATA = GraAnnotationModelPackage.SERVICE__SAMPLE_DATA;

	/**
	 * The number of structural features of the '<em>Wsdl Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_FEATURE_COUNT = GraAnnotationModelPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Realizes Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE___REALIZES_COMPONENT__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.SERVICE___REALIZES_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wsdl Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SERVICE_OPERATION_COUNT = GraAnnotationModelPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlPortImpl <em>Wsdl Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlPortImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlPort()
	 * @generated
	 */
	int WSDL_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__NAME = GraAnnotationModelPackage.PORT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__DOCUMENTATION = GraAnnotationModelPackage.PORT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__TEMPLATE = GraAnnotationModelPackage.PORT__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__REQUIREMENT = GraAnnotationModelPackage.PORT__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__MODEL_REFERENCE = GraAnnotationModelPackage.PORT__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__FLAG = GraAnnotationModelPackage.PORT__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__DIAGNOSTICS = GraAnnotationModelPackage.PORT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__INTERFACE = GraAnnotationModelPackage.PORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Address Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__ADDRESS_URI = GraAnnotationModelPackage.PORT__ADDRESS_URI;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT__CERTIFICATE = GraAnnotationModelPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT_FEATURE_COUNT = GraAnnotationModelPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.PORT___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.PORT___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Realizes Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT___REALIZES_PORT__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.PORT___REALIZES_PORT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wsdl Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PORT_OPERATION_COUNT = GraAnnotationModelPackage.PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlInterfaceImpl <em>Wsdl Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlInterfaceImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlInterface()
	 * @generated
	 */
	int WSDL_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__NAME = GraAnnotationModelPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__DOCUMENTATION = GraAnnotationModelPackage.INTERFACE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__TEMPLATE = GraAnnotationModelPackage.INTERFACE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__REQUIREMENT = GraAnnotationModelPackage.INTERFACE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__MODEL_REFERENCE = GraAnnotationModelPackage.INTERFACE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__FLAG = GraAnnotationModelPackage.INTERFACE__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__DIAGNOSTICS = GraAnnotationModelPackage.INTERFACE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__OPERATION = GraAnnotationModelPackage.INTERFACE__OPERATION;

	/**
	 * The feature id for the '<em><b>Binding Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__BINDING_CODE = GraAnnotationModelPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE_FEATURE_COUNT = GraAnnotationModelPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.INTERFACE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.INTERFACE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wsdl Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE_OPERATION_COUNT = GraAnnotationModelPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlOperationImpl <em>Wsdl Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlOperationImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlOperation()
	 * @generated
	 */
	int WSDL_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__NAME = GraAnnotationModelPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__DOCUMENTATION = GraAnnotationModelPackage.OPERATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__TEMPLATE = GraAnnotationModelPackage.OPERATION__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__REQUIREMENT = GraAnnotationModelPackage.OPERATION__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__MODEL_REFERENCE = GraAnnotationModelPackage.OPERATION__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__FLAG = GraAnnotationModelPackage.OPERATION__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__DIAGNOSTICS = GraAnnotationModelPackage.OPERATION__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__PARAMETER = GraAnnotationModelPackage.OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__MESSAGE_EXCHANGE_PATTERN = GraAnnotationModelPackage.OPERATION__MESSAGE_EXCHANGE_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Asynchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__IS_ASYNCHRONOUS = GraAnnotationModelPackage.OPERATION__IS_ASYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__ACTION_NAME = GraAnnotationModelPackage.OPERATION__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Action Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__ACTION_PURPOSE = GraAnnotationModelPackage.OPERATION__ACTION_PURPOSE;

	/**
	 * The feature id for the '<em><b>Action Provenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__ACTION_PROVENANCE = GraAnnotationModelPackage.OPERATION__ACTION_PROVENANCE;

	/**
	 * The feature id for the '<em><b>Operation Kind Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__OPERATION_KIND_CODE = GraAnnotationModelPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION_FEATURE_COUNT = GraAnnotationModelPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.OPERATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.OPERATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Realizes Operation Or Reception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION___REALIZES_OPERATION_OR_RECEPTION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.OPERATION___REALIZES_OPERATION_OR_RECEPTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Purpose Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION___PURPOSE_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.OPERATION___PURPOSE_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wsdl Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION_OPERATION_COUNT = GraAnnotationModelPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlMessageImpl <em>Wsdl Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlMessageImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlMessage()
	 * @generated
	 */
	int WSDL_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__NAME = GraAnnotationModelPackage.MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__DOCUMENTATION = GraAnnotationModelPackage.MESSAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__TEMPLATE = GraAnnotationModelPackage.MESSAGE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__REQUIREMENT = GraAnnotationModelPackage.MESSAGE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__MODEL_REFERENCE = GraAnnotationModelPackage.MESSAGE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__FLAG = GraAnnotationModelPackage.MESSAGE__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__DIAGNOSTICS = GraAnnotationModelPackage.MESSAGE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__PREFIX = GraAnnotationModelPackage.MESSAGE__PREFIX;

	/**
	 * The feature id for the '<em><b>Element Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__ELEMENT_PREFIX = GraAnnotationModelPackage.MESSAGE__ELEMENT_PREFIX;

	/**
	 * The feature id for the '<em><b>Element Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__ELEMENT_MODEL_REFERENCE = GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__ELEMENT_NAME = GraAnnotationModelPackage.MESSAGE__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Message Location Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__MESSAGE_LOCATION_CODE = GraAnnotationModelPackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__ENCODING = GraAnnotationModelPackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__SOAP_ACTION = GraAnnotationModelPackage.MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wsdl Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE_FEATURE_COUNT = GraAnnotationModelPackage.MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.MESSAGE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.MESSAGE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wsdl Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE_OPERATION_COUNT = GraAnnotationModelPackage.MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlParameterImpl <em>Wsdl Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlParameterImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlParameter()
	 * @generated
	 */
	int WSDL_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__NAME = GraAnnotationModelPackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__DOCUMENTATION = GraAnnotationModelPackage.PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__TEMPLATE = GraAnnotationModelPackage.PARAMETER__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__REQUIREMENT = GraAnnotationModelPackage.PARAMETER__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__MODEL_REFERENCE = GraAnnotationModelPackage.PARAMETER__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__FLAG = GraAnnotationModelPackage.PARAMETER__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__DIAGNOSTICS = GraAnnotationModelPackage.PARAMETER__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__USE = GraAnnotationModelPackage.PARAMETER__USE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__MESSAGE = GraAnnotationModelPackage.PARAMETER__MESSAGE;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__MIME_TYPE = GraAnnotationModelPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER_FEATURE_COUNT = GraAnnotationModelPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.PARAMETER___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.PARAMETER___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER___DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.PARAMETER___DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Use Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER___USE_DERIVATION__DIAGNOSTICCHAIN_MAP = GraAnnotationModelPackage.PARAMETER___USE_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wsdl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER_OPERATION_COUNT = GraAnnotationModelPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.BindingType <em>Binding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.BindingType
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getBindingType()
	 * @generated
	 */
	int BINDING_TYPE = 7;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.OperationKind <em>Operation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.OperationKind
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getOperationKind()
	 * @generated
	 */
	int OPERATION_KIND = 8;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.MessageLocation <em>Message Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.MessageLocation
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getMessageLocation()
	 * @generated
	 */
	int MESSAGE_LOCATION = 9;


	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlServiceInterface <em>Wsdl Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Service Interface</em>'.
	 * @see data.grauml.graWsdl.WsdlServiceInterface
	 * @generated
	 */
	EClass getWsdlServiceInterface();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlService <em>Wsdl Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Service</em>'.
	 * @see data.grauml.graWsdl.WsdlService
	 * @generated
	 */
	EClass getWsdlService();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlPort <em>Wsdl Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Port</em>'.
	 * @see data.grauml.graWsdl.WsdlPort
	 * @generated
	 */
	EClass getWsdlPort();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlPort#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate</em>'.
	 * @see data.grauml.graWsdl.WsdlPort#getCertificate()
	 * @see #getWsdlPort()
	 * @generated
	 */
	EAttribute getWsdlPort_Certificate();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlInterface <em>Wsdl Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Interface</em>'.
	 * @see data.grauml.graWsdl.WsdlInterface
	 * @generated
	 */
	EClass getWsdlInterface();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlInterface#getBindingCode <em>Binding Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Code</em>'.
	 * @see data.grauml.graWsdl.WsdlInterface#getBindingCode()
	 * @see #getWsdlInterface()
	 * @generated
	 */
	EAttribute getWsdlInterface_BindingCode();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlOperation <em>Wsdl Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Operation</em>'.
	 * @see data.grauml.graWsdl.WsdlOperation
	 * @generated
	 */
	EClass getWsdlOperation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlOperation#getOperationKindCode <em>Operation Kind Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Kind Code</em>'.
	 * @see data.grauml.graWsdl.WsdlOperation#getOperationKindCode()
	 * @see #getWsdlOperation()
	 * @generated
	 */
	EAttribute getWsdlOperation_OperationKindCode();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlMessage <em>Wsdl Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Message</em>'.
	 * @see data.grauml.graWsdl.WsdlMessage
	 * @generated
	 */
	EClass getWsdlMessage();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlMessage#getMessageLocationCode <em>Message Location Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Location Code</em>'.
	 * @see data.grauml.graWsdl.WsdlMessage#getMessageLocationCode()
	 * @see #getWsdlMessage()
	 * @generated
	 */
	EAttribute getWsdlMessage_MessageLocationCode();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlMessage#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see data.grauml.graWsdl.WsdlMessage#getEncoding()
	 * @see #getWsdlMessage()
	 * @generated
	 */
	EAttribute getWsdlMessage_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlMessage#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see data.grauml.graWsdl.WsdlMessage#getSoapAction()
	 * @see #getWsdlMessage()
	 * @generated
	 */
	EAttribute getWsdlMessage_SoapAction();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlParameter <em>Wsdl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Parameter</em>'.
	 * @see data.grauml.graWsdl.WsdlParameter
	 * @generated
	 */
	EClass getWsdlParameter();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlParameter#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see data.grauml.graWsdl.WsdlParameter#getMimeType()
	 * @see #getWsdlParameter()
	 * @generated
	 */
	EAttribute getWsdlParameter_MimeType();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graWsdl.BindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Type</em>'.
	 * @see data.grauml.graWsdl.BindingType
	 * @generated
	 */
	EEnum getBindingType();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graWsdl.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Kind</em>'.
	 * @see data.grauml.graWsdl.OperationKind
	 * @generated
	 */
	EEnum getOperationKind();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graWsdl.MessageLocation <em>Message Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Location</em>'.
	 * @see data.grauml.graWsdl.MessageLocation
	 * @generated
	 */
	EEnum getMessageLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraWsdlFactory getGraWsdlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlServiceInterfaceImpl <em>Wsdl Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlServiceInterfaceImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlServiceInterface()
		 * @generated
		 */
		EClass WSDL_SERVICE_INTERFACE = eINSTANCE.getWsdlServiceInterface();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlServiceImpl <em>Wsdl Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlServiceImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlService()
		 * @generated
		 */
		EClass WSDL_SERVICE = eINSTANCE.getWsdlService();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlPortImpl <em>Wsdl Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlPortImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlPort()
		 * @generated
		 */
		EClass WSDL_PORT = eINSTANCE.getWsdlPort();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_PORT__CERTIFICATE = eINSTANCE.getWsdlPort_Certificate();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlInterfaceImpl <em>Wsdl Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlInterfaceImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlInterface()
		 * @generated
		 */
		EClass WSDL_INTERFACE = eINSTANCE.getWsdlInterface();

		/**
		 * The meta object literal for the '<em><b>Binding Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_INTERFACE__BINDING_CODE = eINSTANCE.getWsdlInterface_BindingCode();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlOperationImpl <em>Wsdl Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlOperationImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlOperation()
		 * @generated
		 */
		EClass WSDL_OPERATION = eINSTANCE.getWsdlOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Kind Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_OPERATION__OPERATION_KIND_CODE = eINSTANCE.getWsdlOperation_OperationKindCode();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlMessageImpl <em>Wsdl Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlMessageImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlMessage()
		 * @generated
		 */
		EClass WSDL_MESSAGE = eINSTANCE.getWsdlMessage();

		/**
		 * The meta object literal for the '<em><b>Message Location Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_MESSAGE__MESSAGE_LOCATION_CODE = eINSTANCE.getWsdlMessage_MessageLocationCode();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_MESSAGE__ENCODING = eINSTANCE.getWsdlMessage_Encoding();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_MESSAGE__SOAP_ACTION = eINSTANCE.getWsdlMessage_SoapAction();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlParameterImpl <em>Wsdl Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlParameterImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlParameter()
		 * @generated
		 */
		EClass WSDL_PARAMETER = eINSTANCE.getWsdlParameter();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_PARAMETER__MIME_TYPE = eINSTANCE.getWsdlParameter_MimeType();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.BindingType <em>Binding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.BindingType
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getBindingType()
		 * @generated
		 */
		EEnum BINDING_TYPE = eINSTANCE.getBindingType();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.OperationKind <em>Operation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.OperationKind
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getOperationKind()
		 * @generated
		 */
		EEnum OPERATION_KIND = eINSTANCE.getOperationKind();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.MessageLocation <em>Message Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.MessageLocation
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getMessageLocation()
		 * @generated
		 */
		EEnum MESSAGE_LOCATION = eINSTANCE.getMessageLocation();

	}

} //GraWsdlPackage
