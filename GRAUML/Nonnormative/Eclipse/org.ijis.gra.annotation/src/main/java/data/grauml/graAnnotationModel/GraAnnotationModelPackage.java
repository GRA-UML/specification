/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see data.grauml.graAnnotationModel.GraAnnotationModelFactory
 * @model kind="package"
 * @generated
 */
public interface GraAnnotationModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graAnnotationModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ijis.org/GRA/Annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraAnnotationModelPackage eINSTANCE = data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl <em>Interaction Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getInteractionRequirements()
	 * @generated
	 */
	int INTERACTION_REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Service Consumer Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION = 0;

	/**
	 * The feature id for the '<em><b>Service Consumer Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION = 1;

	/**
	 * The feature id for the '<em><b>Identity And Attribute Assertion Transmission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION = 2;

	/**
	 * The feature id for the '<em><b>Service Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION = 3;

	/**
	 * The feature id for the '<em><b>Message Nonrepudiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION = 4;

	/**
	 * The feature id for the '<em><b>Message Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY = 5;

	/**
	 * The feature id for the '<em><b>Message Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY = 6;

	/**
	 * The feature id for the '<em><b>Message Addressing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING = 7;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__RELIABILITY = 8;

	/**
	 * The feature id for the '<em><b>Transaction Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT = 9;

	/**
	 * The feature id for the '<em><b>Service Metadata Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY = 10;

	/**
	 * The feature id for the '<em><b>Interface Description Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS = 11;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__LOGGING = 12;

	/**
	 * The feature id for the '<em><b>Service Responsiveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS = 13;

	/**
	 * The feature id for the '<em><b>Extended Requirement</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT = 14;

	/**
	 * The number of structural features of the '<em>Interaction Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Interaction Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl <em>Gra Service Annotation Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getGraServiceAnnotationBase()
	 * @generated
	 */
	int GRA_SERVICE_ANNOTATION_BASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE__TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE__FLAG = 5;

	/**
	 * The number of structural features of the '<em>Gra Service Annotation Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Gra Service Annotation Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ModelReferenceImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__ELEMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Diagram Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__DIAGRAM_LINK = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__MODEL = 4;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ModelImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Model Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_URI = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ParticipantImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Participating Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PARTICIPATING_ORGANIZATION = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Realizes Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT___REALIZES_ACTOR__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.OrganizationImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Organization Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_ACRONYM = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Full Address Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Organization Web Site Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_WEB_SITE_URL = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization Role Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organization Role Detailed Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization Point Of Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.PersonImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Contact Person Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTACT_PERSON_EMAIL_ID = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Person Phone Number Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTACT_PERSON_PHONE_NUMBER_ID = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTACT_PERSON_ADDRESS = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.InterfaceImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATION = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.OperationImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETER = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MESSAGE_EXCHANGE_PATTERN = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Asynchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ASYNCHRONOUS = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ACTION_NAME = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ACTION_PURPOSE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action Provenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ACTION_PROVENANCE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Realizes Operation Or Reception</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___REALIZES_OPERATION_OR_RECEPTION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Purpose Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___PURPOSE_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ParameterImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__USE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MESSAGE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Use Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___USE_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.MessageImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PREFIX = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT = 0;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Sample Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SAMPLE_DATA = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Realizes Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___REALIZES_COMPONENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.PortImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INTERFACE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ADDRESS_URI = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Realizes Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___REALIZES_PORT__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.SampleDataImpl <em>Sample Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.SampleDataImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getSampleData()
	 * @generated
	 */
	int SAMPLE_DATA = 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA__EXPECTED_OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Sample Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sample Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceInteractionImpl <em>Service Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceInteractionImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceInteraction()
	 * @generated
	 */
	int SERVICE_INTERACTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION__PARTICIPANT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Realizes Interaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION___REALIZES_INTERACTION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.UseCaseImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PROVIDER = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__CONSUMER = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE___DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.AgreementImpl <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.AgreementImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getAgreement()
	 * @generated
	 */
	int AGREEMENT = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Agreement Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__AGREEMENT_URI = 1;

	/**
	 * The feature id for the '<em><b>Automated Agreement Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR = 2;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.IepdReferenceImpl <em>Iepd Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.IepdReferenceImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getIepdReference()
	 * @generated
	 */
	int IEPD_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Iepdurl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE__IEPDURL = 1;

	/**
	 * The number of structural features of the '<em>Iepd Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Iepd Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.SecurityClassificationImpl <em>Security Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.SecurityClassificationImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getSecurityClassification()
	 * @generated
	 */
	int SECURITY_CLASSIFICATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CLASSIFICATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Security Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CLASSIFICATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CLASSIFICATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Security Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CLASSIFICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceCapabilityImpl <em>Service Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceCapabilityImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceCapability()
	 * @generated
	 */
	int SERVICE_CAPABILITY = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CAPABILITY__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Service Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CAPABILITY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CAPABILITY___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Service Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CAPABILITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceIdentificationImpl <em>Service Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceIdentificationImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceIdentification()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__SERVICE_ID = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__SERVICE_URI = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Service Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceDescription()
	 * @generated
	 */
	int SERVICE_DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__NAME = SERVICE_IDENTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__DOCUMENTATION = SERVICE_IDENTIFICATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__TEMPLATE = SERVICE_IDENTIFICATION__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__REQUIREMENT = SERVICE_IDENTIFICATION__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__MODEL_REFERENCE = SERVICE_IDENTIFICATION__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__FLAG = SERVICE_IDENTIFICATION__FLAG;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_ID = SERVICE_IDENTIFICATION__SERVICE_ID;

	/**
	 * The feature id for the '<em><b>Service Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_URI = SERVICE_IDENTIFICATION__SERVICE_URI;

	/**
	 * The feature id for the '<em><b>Service Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_NAME_ABBREVIATION_TEXT = SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT;

	/**
	 * The feature id for the '<em><b>Exchange Partner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__EXCHANGE_PARTNER = SERVICE_IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__CLASSIFICATION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sponsor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SPONSOR = SERVICE_IDENTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_PURPOSE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Scope Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Description Summary Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service Description Keyword Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Service Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_CAPABILITY = SERVICE_IDENTIFICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Service Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_DEPENDENCY = SERVICE_IDENTIFICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Iepd Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__IEPD_REFERENCE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Service Security Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Service Level Agreement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Related Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__RELATED_ORGANIZATION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_INTERFACE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Endorsements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__ENDORSEMENTS = SERVICE_IDENTIFICATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Real World Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__REAL_WORLD_EFFECT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Service Interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_INTERACTION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Transformation Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__TRANSFORMATION_URI = SERVICE_IDENTIFICATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__MAJOR_VERSION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__MINOR_VERSION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Revision Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__REVISION_VERSION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__CREATION_DATE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__ACTIVATION_DATE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Last Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__LAST_REVISION_DATE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Next Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__NEXT_REVISION_DATE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__EXPIRATION_DATE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Lifecycle Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__LIFECYCLE_STATUS = SERVICE_IDENTIFICATION_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Alert And Notification Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI = SERVICE_IDENTIFICATION_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Service Description Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI = SERVICE_IDENTIFICATION_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__EXECUTION_CONTEXT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SECURITY = SERVICE_IDENTIFICATION_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Privacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__PRIVACY = SERVICE_IDENTIFICATION_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Service Assumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_ASSUMPTION = SERVICE_IDENTIFICATION_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Other Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__OTHER_REQUIREMENT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Data Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__DATA_PROVENANCE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 36;

	/**
	 * The number of structural features of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_FEATURE_COUNT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 37;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = SERVICE_IDENTIFICATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = SERVICE_IDENTIFICATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Realizes Collaboration And Uses Iepd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___REALIZES_COLLABORATION_AND_USES_IEPD__DIAGNOSTICCHAIN_MAP = SERVICE_IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Exchange Partner Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___EXCHANGE_PARTNER_DERIVATION__DIAGNOSTICCHAIN_MAP = SERVICE_IDENTIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_OPERATION_COUNT = SERVICE_IDENTIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.DescriptionImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>External Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__EXTERNAL_DOCUMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl <em>Service Level Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceLevelAgreement()
	 * @generated
	 */
	int SERVICE_LEVEL_AGREEMENT = 23;

	/**
	 * The feature id for the '<em><b>Applicable Policies Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Applicable Contracts Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR = 1;

	/**
	 * The feature id for the '<em><b>Applicable Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR = 3;

	/**
	 * The feature id for the '<em><b>Applicable Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Umbrella Agreement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT = 5;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__AGREEMENT = 6;

	/**
	 * The feature id for the '<em><b>Applicable Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT = 7;

	/**
	 * The feature id for the '<em><b>Approval Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR = 8;

	/**
	 * The feature id for the '<em><b>Licensing Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR = 9;

	/**
	 * The feature id for the '<em><b>Licensing Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT = 10;

	/**
	 * The feature id for the '<em><b>Service Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME = 11;

	/**
	 * The feature id for the '<em><b>Service Average Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT = 12;

	/**
	 * The feature id for the '<em><b>Service Maximum Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT = 13;

	/**
	 * The feature id for the '<em><b>Service Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY = 14;

	/**
	 * The feature id for the '<em><b>Usage Cost Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT = 15;

	/**
	 * The feature id for the '<em><b>Usage Unit Cost Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT = 16;

	/**
	 * The feature id for the '<em><b>Creation Cost Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT = 17;

	/**
	 * The number of structural features of the '<em>Service Level Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT_FEATURE_COUNT = 18;

	/**
	 * The operation id for the '<em>Applicable Contracts Indicator Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT___APPLICABLE_CONTRACTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Applicable Agreements Indicator Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT___APPLICABLE_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Applicable Umbrella Agreements Indicator Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT___APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Service Level Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl <em>Service Interface Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceInterfaceSpecification()
	 * @generated
	 */
	int SERVICE_INTERFACE_SPECIFICATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__NAME = GRA_SERVICE_ANNOTATION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__DOCUMENTATION = GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__TEMPLATE = GRA_SERVICE_ANNOTATION_BASE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__REQUIREMENT = GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__MODEL_REFERENCE = GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__FLAG = GRA_SERVICE_ANNOTATION_BASE__FLAG;

	/**
	 * The feature id for the '<em><b>Security Implemented Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Interaction Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SERVICE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message Definition Mechanism</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service Interface Description Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__PREFIX = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Service Testing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Schema Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Service Interface Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Service Interface Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_FEATURE_COUNT = GRA_SERVICE_ANNOTATION_BASE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Doc Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Service Interface Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_OPERATION_COUNT = GRA_SERVICE_ANNOTATION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.ServiceInteractionProfileImpl <em>Service Interaction Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.ServiceInteractionProfileImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceInteractionProfile()
	 * @generated
	 */
	int SERVICE_INTERACTION_PROFILE = 25;

	/**
	 * The feature id for the '<em><b>Sip Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE__SIP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sip Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE__SIP_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Service Interaction Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Name Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Service Interaction Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.impl.SchemaReferenceImpl <em>Schema Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.impl.SchemaReferenceImpl
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getSchemaReference()
	 * @generated
	 */
	int SCHEMA_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_REFERENCE__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_REFERENCE__PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_REFERENCE__SCHEMA_LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Schema Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Schema Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_REFERENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.ExchangePattern <em>Exchange Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.ExchangePattern
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getExchangePattern()
	 * @generated
	 */
	int EXCHANGE_PATTERN = 27;

	/**
	 * The meta object id for the '{@link data.grauml.graAnnotationModel.ParameterUse <em>Parameter Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graAnnotationModel.ParameterUse
	 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getParameterUse()
	 * @generated
	 */
	int PARAMETER_USE = 28;


	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.InteractionRequirements <em>Interaction Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Requirements</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements
	 * @generated
	 */
	EClass getInteractionRequirements();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthentication <em>Service Consumer Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Consumer Authentication</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthentication()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_ServiceConsumerAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthorization <em>Service Consumer Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Consumer Authorization</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isServiceConsumerAuthorization()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_ServiceConsumerAuthorization();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isIdentityAndAttributeAssertionTransmission <em>Identity And Attribute Assertion Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity And Attribute Assertion Transmission</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isIdentityAndAttributeAssertionTransmission()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_IdentityAndAttributeAssertionTransmission();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceAuthentication <em>Service Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Authentication</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isServiceAuthentication()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_ServiceAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageNonrepudiation <em>Message Nonrepudiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Nonrepudiation</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isMessageNonrepudiation()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_MessageNonrepudiation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageIntegrity <em>Message Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Integrity</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isMessageIntegrity()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_MessageIntegrity();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageConfidentiality <em>Message Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Confidentiality</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isMessageConfidentiality()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_MessageConfidentiality();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isMessageAddressing <em>Message Addressing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Addressing</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isMessageAddressing()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_MessageAddressing();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isReliability()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_Reliability();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isTransactionSupport <em>Transaction Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Support</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isTransactionSupport()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_TransactionSupport();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceMetadataAvailability <em>Service Metadata Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Metadata Availability</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isServiceMetadataAvailability()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_ServiceMetadataAvailability();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isInterfaceDescriptionRequirements <em>Interface Description Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Description Requirements</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isInterfaceDescriptionRequirements()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_InterfaceDescriptionRequirements();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isLogging <em>Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logging</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isLogging()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_Logging();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.InteractionRequirements#isServiceResponsiveness <em>Service Responsiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Responsiveness</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#isServiceResponsiveness()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_ServiceResponsiveness();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.InteractionRequirements#getExtendedRequirement <em>Extended Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extended Requirement</em>'.
	 * @see data.grauml.graAnnotationModel.InteractionRequirements#getExtendedRequirement()
	 * @see #getInteractionRequirements()
	 * @generated
	 */
	EAttribute getInteractionRequirements_ExtendedRequirement();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase <em>Gra Service Annotation Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gra Service Annotation Base</em>'.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase
	 * @generated
	 */
	EClass getGraServiceAnnotationBase();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#getName()
	 * @see #getGraServiceAnnotationBase()
	 * @generated
	 */
	EAttribute getGraServiceAnnotationBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#getDocumentation()
	 * @see #getGraServiceAnnotationBase()
	 * @generated
	 */
	EAttribute getGraServiceAnnotationBase_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#getTemplate()
	 * @see #getGraServiceAnnotationBase()
	 * @generated
	 */
	EAttribute getGraServiceAnnotationBase_Template();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement</em>'.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#getRequirement()
	 * @see #getGraServiceAnnotationBase()
	 * @generated
	 */
	EReference getGraServiceAnnotationBase_Requirement();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Reference</em>'.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#getModelReference()
	 * @see #getGraServiceAnnotationBase()
	 * @generated
	 */
	EReference getGraServiceAnnotationBase_ModelReference();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flag</em>'.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#getFlag()
	 * @see #getGraServiceAnnotationBase()
	 * @generated
	 */
	EAttribute getGraServiceAnnotationBase_Flag();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#nameDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#nameDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGraServiceAnnotationBase__NameDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Doc Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Doc Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.GraServiceAnnotationBase#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGraServiceAnnotationBase__DocDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see data.grauml.graAnnotationModel.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ModelReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see data.grauml.graAnnotationModel.ModelReference#getName()
	 * @see #getModelReference()
	 * @generated
	 */
	EAttribute getModelReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ModelReference#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see data.grauml.graAnnotationModel.ModelReference#getDocumentation()
	 * @see #getModelReference()
	 * @generated
	 */
	EAttribute getModelReference_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ModelReference#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see data.grauml.graAnnotationModel.ModelReference#getElementId()
	 * @see #getModelReference()
	 * @generated
	 */
	EAttribute getModelReference_ElementId();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.ModelReference#getDiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Diagram Link</em>'.
	 * @see data.grauml.graAnnotationModel.ModelReference#getDiagramLink()
	 * @see #getModelReference()
	 * @generated
	 */
	EAttribute getModelReference_DiagramLink();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ModelReference#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see data.grauml.graAnnotationModel.ModelReference#getModel()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_Model();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ModelReference#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.ModelReference#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModelReference__Derivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see data.grauml.graAnnotationModel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Model#getModelUri <em>Model Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Uri</em>'.
	 * @see data.grauml.graAnnotationModel.Model#getModelUri()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelUri();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Model#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see data.grauml.graAnnotationModel.Model#getLabel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Label();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see data.grauml.graAnnotationModel.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link data.grauml.graAnnotationModel.Participant#getParticipatingOrganization <em>Participating Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participating Organization</em>'.
	 * @see data.grauml.graAnnotationModel.Participant#getParticipatingOrganization()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_ParticipatingOrganization();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Participant#realizesActor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Realizes Actor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizes Actor</em>' operation.
	 * @see data.grauml.graAnnotationModel.Participant#realizesActor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParticipant__RealizesActor__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see data.grauml.graAnnotationModel.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Organization#getOrganizationAcronym <em>Organization Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Acronym</em>'.
	 * @see data.grauml.graAnnotationModel.Organization#getOrganizationAcronym()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationAcronym();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Organization#getOrganizationFullAddressText <em>Organization Full Address Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Full Address Text</em>'.
	 * @see data.grauml.graAnnotationModel.Organization#getOrganizationFullAddressText()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationFullAddressText();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Organization#getOrganizationWebSiteUrl <em>Organization Web Site Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Web Site Url</em>'.
	 * @see data.grauml.graAnnotationModel.Organization#getOrganizationWebSiteUrl()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationWebSiteUrl();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Organization#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Role Description Text</em>'.
	 * @see data.grauml.graAnnotationModel.Organization#getOrganizationRoleDescriptionText()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationRoleDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Organization#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Role Detailed Description Text</em>'.
	 * @see data.grauml.graAnnotationModel.Organization#getOrganizationRoleDetailedDescriptionText()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationRoleDetailedDescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.Organization#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Point Of Contact</em>'.
	 * @see data.grauml.graAnnotationModel.Organization#getOrganizationPointOfContact()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_OrganizationPointOfContact();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see data.grauml.graAnnotationModel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Person#getContactPersonEmailId <em>Contact Person Email Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Email Id</em>'.
	 * @see data.grauml.graAnnotationModel.Person#getContactPersonEmailId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ContactPersonEmailId();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Person#getContactPersonPhoneNumberId <em>Contact Person Phone Number Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Phone Number Id</em>'.
	 * @see data.grauml.graAnnotationModel.Person#getContactPersonPhoneNumberId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ContactPersonPhoneNumberId();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Person#getContactPersonAddress <em>Contact Person Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Address</em>'.
	 * @see data.grauml.graAnnotationModel.Person#getContactPersonAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ContactPersonAddress();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see data.grauml.graAnnotationModel.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.Interface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see data.grauml.graAnnotationModel.Interface#getOperation()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operation();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see data.grauml.graAnnotationModel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.Operation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see data.grauml.graAnnotationModel.Operation#getParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Operation#getMessageExchangePattern <em>Message Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange Pattern</em>'.
	 * @see data.grauml.graAnnotationModel.Operation#getMessageExchangePattern()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_MessageExchangePattern();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Operation#isIsAsynchronous <em>Is Asynchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Asynchronous</em>'.
	 * @see data.grauml.graAnnotationModel.Operation#isIsAsynchronous()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsAsynchronous();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Operation#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see data.grauml.graAnnotationModel.Operation#getActionName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ActionName();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Operation#getActionPurpose <em>Action Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Purpose</em>'.
	 * @see data.grauml.graAnnotationModel.Operation#getActionPurpose()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ActionPurpose();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Operation#getActionProvenance <em>Action Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Provenance</em>'.
	 * @see data.grauml.graAnnotationModel.Operation#getActionProvenance()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ActionProvenance();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Operation#realizesOperationOrReception(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Realizes Operation Or Reception</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizes Operation Or Reception</em>' operation.
	 * @see data.grauml.graAnnotationModel.Operation#realizesOperationOrReception(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__RealizesOperationOrReception__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Operation#purposeDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Purpose Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Purpose Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.Operation#purposeDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__PurposeDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see data.grauml.graAnnotationModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Parameter#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see data.grauml.graAnnotationModel.Parameter#getUse()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Use();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.Parameter#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see data.grauml.graAnnotationModel.Parameter#getMessage()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Message();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Parameter#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.Parameter#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameter__Derivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Parameter#useDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Use Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Use Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.Parameter#useDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameter__UseDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see data.grauml.graAnnotationModel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Message#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see data.grauml.graAnnotationModel.Message#getPrefix()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Prefix();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see data.grauml.graAnnotationModel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.Service#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see data.grauml.graAnnotationModel.Service#getPort()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Port();

	/**
	 * Returns the meta object for the reference '{@link data.grauml.graAnnotationModel.Service#getServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Provider</em>'.
	 * @see data.grauml.graAnnotationModel.Service#getServiceProvider()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.Service#getSampleData <em>Sample Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sample Data</em>'.
	 * @see data.grauml.graAnnotationModel.Service#getSampleData()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_SampleData();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Service#realizesComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Realizes Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizes Component</em>' operation.
	 * @see data.grauml.graAnnotationModel.Service#realizesComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getService__RealizesComponent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see data.grauml.graAnnotationModel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.Port#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see data.grauml.graAnnotationModel.Port#getInterface()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Interface();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Port#getAddressUri <em>Address Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Uri</em>'.
	 * @see data.grauml.graAnnotationModel.Port#getAddressUri()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_AddressUri();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Port#realizesPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Realizes Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizes Port</em>' operation.
	 * @see data.grauml.graAnnotationModel.Port#realizesPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPort__RealizesPort__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.SampleData <em>Sample Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Data</em>'.
	 * @see data.grauml.graAnnotationModel.SampleData
	 * @generated
	 */
	EClass getSampleData();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.SampleData#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input</em>'.
	 * @see data.grauml.graAnnotationModel.SampleData#getInput()
	 * @see #getSampleData()
	 * @generated
	 */
	EAttribute getSampleData_Input();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.SampleData#getExpectedOutput <em>Expected Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Output</em>'.
	 * @see data.grauml.graAnnotationModel.SampleData#getExpectedOutput()
	 * @see #getSampleData()
	 * @generated
	 */
	EAttribute getSampleData_ExpectedOutput();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ServiceInteraction <em>Service Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interaction</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInteraction
	 * @generated
	 */
	EClass getServiceInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceInteraction#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInteraction#getParticipant()
	 * @see #getServiceInteraction()
	 * @generated
	 */
	EReference getServiceInteraction_Participant();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceInteraction#realizesInteraction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Realizes Interaction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizes Interaction</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceInteraction#realizesInteraction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceInteraction__RealizesInteraction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see data.grauml.graAnnotationModel.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.UseCase#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider</em>'.
	 * @see data.grauml.graAnnotationModel.UseCase#getProvider()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Provider();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.UseCase#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumer</em>'.
	 * @see data.grauml.graAnnotationModel.UseCase#getConsumer()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Consumer();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.UseCase#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.UseCase#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUseCase__Derivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see data.grauml.graAnnotationModel.Agreement
	 * @generated
	 */
	EClass getAgreement();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Agreement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see data.grauml.graAnnotationModel.Agreement#getDocumentation()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Agreement#getAgreementUri <em>Agreement Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Uri</em>'.
	 * @see data.grauml.graAnnotationModel.Agreement#getAgreementUri()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_AgreementUri();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Agreement#isAutomatedAgreementIndicator <em>Automated Agreement Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automated Agreement Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.Agreement#isAutomatedAgreementIndicator()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_AutomatedAgreementIndicator();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Agreement#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Doc Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Doc Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.Agreement#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAgreement__DocDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.IepdReference <em>Iepd Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iepd Reference</em>'.
	 * @see data.grauml.graAnnotationModel.IepdReference
	 * @generated
	 */
	EClass getIepdReference();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.IepdReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see data.grauml.graAnnotationModel.IepdReference#getName()
	 * @see #getIepdReference()
	 * @generated
	 */
	EAttribute getIepdReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.IepdReference#getIepdurl <em>Iepdurl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iepdurl</em>'.
	 * @see data.grauml.graAnnotationModel.IepdReference#getIepdurl()
	 * @see #getIepdReference()
	 * @generated
	 */
	EAttribute getIepdReference_Iepdurl();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.IepdReference#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.IepdReference#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIepdReference__Derivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.SecurityClassification <em>Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Classification</em>'.
	 * @see data.grauml.graAnnotationModel.SecurityClassification
	 * @generated
	 */
	EClass getSecurityClassification();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.SecurityClassification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see data.grauml.graAnnotationModel.SecurityClassification#getName()
	 * @see #getSecurityClassification()
	 * @generated
	 */
	EAttribute getSecurityClassification_Name();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.SecurityClassification#nameDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.SecurityClassification#nameDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSecurityClassification__NameDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ServiceCapability <em>Service Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Capability</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceCapability
	 * @generated
	 */
	EClass getServiceCapability();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceCapability#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceCapability#getDocumentation()
	 * @see #getServiceCapability()
	 * @generated
	 */
	EAttribute getServiceCapability_Documentation();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceCapability#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Doc Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Doc Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceCapability#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceCapability__DocDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription
	 * @generated
	 */
	EClass getServiceDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getExchangePartner <em>Exchange Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Partner</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getExchangePartner()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ExchangePartner();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.ServiceDescription#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classification</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getClassification()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Classification();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.ServiceDescription#getSponsor <em>Sponsor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sponsor</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getSponsor()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Sponsor();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getServicePurpose <em>Service Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Purpose</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServicePurpose()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServicePurpose();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceScopeDescription <em>Service Scope Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Scope Description</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceScopeDescription()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceScopeDescription();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Summary Text</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionSummaryText()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ServiceDescriptionSummaryText();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Description Keyword Text</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionKeywordText()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ServiceDescriptionKeywordText();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceCapability <em>Service Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Capability</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceCapability()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceCapability();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Dependency</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceDependency()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getIepdReference <em>Iepd Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iepd Reference</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getIepdReference()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_IepdReference();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceSecurityClassification <em>Service Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Security Classification</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceSecurityClassification()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceSecurityClassification();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceLevelAgreement <em>Service Level Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Level Agreement</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceLevelAgreement()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceLevelAgreement();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getRelatedOrganization <em>Related Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Organization</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getRelatedOrganization()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_RelatedOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Interface</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceInterface()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Description</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getDomainDescription()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_DomainDescription();

	/**
	 * Returns the meta object for the attribute list '{@link data.grauml.graAnnotationModel.ServiceDescription#getEndorsements <em>Endorsements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endorsements</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getEndorsements()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Endorsements();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getRealWorldEffect <em>Real World Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real World Effect</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getRealWorldEffect()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_RealWorldEffect();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceInteraction <em>Service Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Interaction</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceInteraction()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceInteraction();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getTransformationUri <em>Transformation Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Uri</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getTransformationUri()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_TransformationUri();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getMajorVersion <em>Major Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Version</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getMajorVersion()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_MajorVersion();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getMinorVersion <em>Minor Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Version</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getMinorVersion()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_MinorVersion();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getRevisionVersion <em>Revision Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Version</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getRevisionVersion()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_RevisionVersion();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getCreationDate()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getActivationDate <em>Activation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Date</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getActivationDate()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ActivationDate();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getLastRevisionDate <em>Last Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Revision Date</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getLastRevisionDate()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_LastRevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getNextRevisionDate <em>Next Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Revision Date</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getNextRevisionDate()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_NextRevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getExpirationDate()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getLifecycleStatus <em>Lifecycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle Status</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getLifecycleStatus()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_LifecycleStatus();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getAlertAndNotificationUri <em>Alert And Notification Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alert And Notification Uri</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getAlertAndNotificationUri()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_AlertAndNotificationUri();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceDescription#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getAdditionalInformation()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_AdditionalInformation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionUri <em>Service Description Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Uri</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceDescriptionUri()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ServiceDescriptionUri();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Context</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getExecutionContext()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ExecutionContext();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getSecurity()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Security();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getPrivacy <em>Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Privacy</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getPrivacy()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Privacy();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getServiceAssumption <em>Service Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Assumption</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getServiceAssumption()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceAssumption();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getOtherRequirement <em>Other Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Requirement</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getOtherRequirement()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_OtherRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceDescription#getDataProvenance <em>Data Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Provenance</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#getDataProvenance()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_DataProvenance();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceDescription#realizesCollaborationAndUsesIepd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Realizes Collaboration And Uses Iepd</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizes Collaboration And Uses Iepd</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#realizesCollaborationAndUsesIepd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceDescription__RealizesCollaborationAndUsesIepd__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceDescription#exchangePartnerDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exchange Partner Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exchange Partner Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceDescription#exchangePartnerDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceDescription__ExchangePartnerDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceIdentification
	 * @generated
	 */
	EClass getServiceIdentification();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceIdentification#getServiceId()
	 * @see #getServiceIdentification()
	 * @generated
	 */
	EAttribute getServiceIdentification_ServiceId();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceUri <em>Service Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Uri</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceIdentification#getServiceUri()
	 * @see #getServiceIdentification()
	 * @generated
	 */
	EAttribute getServiceIdentification_ServiceUri();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceIdentification#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name Abbreviation Text</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceIdentification#getServiceNameAbbreviationText()
	 * @see #getServiceIdentification()
	 * @generated
	 */
	EAttribute getServiceIdentification_ServiceNameAbbreviationText();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see data.grauml.graAnnotationModel.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Description#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see data.grauml.graAnnotationModel.Description#getDocumentation()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.Description#getExternalDocumentation <em>External Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Documentation</em>'.
	 * @see data.grauml.graAnnotationModel.Description#getExternalDocumentation()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_ExternalDocumentation();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.Description#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Doc Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Doc Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.Description#docDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDescription__DocDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement <em>Service Level Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Agreement</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement
	 * @generated
	 */
	EClass getServiceLevelAgreement();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Policies Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicablePoliciesIndicator()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ApplicablePoliciesIndicator();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Contracts Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableContractsIndicator()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ApplicableContractsIndicator();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Agreements Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableAgreementsIndicator()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ApplicableAgreementsIndicator();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Umbrella Agreements Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#isApplicableUmbrellaAgreementsIndicator()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ApplicableUmbrellaAgreementsIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getApplicablePolicy <em>Applicable Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Policy</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getApplicablePolicy()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EReference getServiceLevelAgreement_ApplicablePolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUmbrellaAgreement <em>Umbrella Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Umbrella Agreement</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getUmbrellaAgreement()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EReference getServiceLevelAgreement_UmbrellaAgreement();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agreement</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getAgreement()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EReference getServiceLevelAgreement_Agreement();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getApplicableContract <em>Applicable Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Contract</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getApplicableContract()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EReference getServiceLevelAgreement_ApplicableContract();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Required Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#isApprovalRequiredIndicator()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ApprovalRequiredIndicator();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licensing Required Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#isLicensingRequiredIndicator()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_LicensingRequiredIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getLicensingAgreement <em>Licensing Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licensing Agreement</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getLicensingAgreement()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EReference getServiceLevelAgreement_LicensingAgreement();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceResponseTime <em>Service Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Response Time</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceResponseTime()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ServiceResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAverageThroughput <em>Service Average Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Average Throughput</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAverageThroughput()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ServiceAverageThroughput();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Maximum Throughput</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceMaximumThroughput()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ServiceMaximumThroughput();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAvailability <em>Service Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Availability</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getServiceAvailability()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_ServiceAvailability();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageCostAmount <em>Usage Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Cost Amount</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageCostAmount()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_UsageCostAmount();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Unit Cost Amount</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getUsageUnitCostAmount()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_UsageUnitCostAmount();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#getCreationCostAmount <em>Creation Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Cost Amount</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#getCreationCostAmount()
	 * @see #getServiceLevelAgreement()
	 * @generated
	 */
	EAttribute getServiceLevelAgreement_CreationCostAmount();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#applicableContractsIndicatorDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applicable Contracts Indicator Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applicable Contracts Indicator Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#applicableContractsIndicatorDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceLevelAgreement__ApplicableContractsIndicatorDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#applicableAgreementsIndicatorDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applicable Agreements Indicator Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applicable Agreements Indicator Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#applicableAgreementsIndicatorDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceLevelAgreement__ApplicableAgreementsIndicatorDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceLevelAgreement#applicableUmbrellaAgreementsIndicatorDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applicable Umbrella Agreements Indicator Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applicable Umbrella Agreements Indicator Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceLevelAgreement#applicableUmbrellaAgreementsIndicatorDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceLevelAgreement__ApplicableUmbrellaAgreementsIndicatorDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification <em>Service Interface Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface Specification</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification
	 * @generated
	 */
	EClass getServiceInterfaceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Implemented Indicator</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#isSecurityImplementedIndicator()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecification_SecurityImplementedIndicator();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getSecurityDescriptionText <em>Security Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Description Text</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getSecurityDescriptionText()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecification_SecurityDescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInteractionProfile <em>Service Interaction Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Interaction Profile</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInteractionProfile()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EReference getServiceInterfaceSpecification_ServiceInteractionProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getService()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EReference getServiceInterfaceSpecification_Service();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getUriAddress <em>Uri Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Address</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getUriAddress()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecification_UriAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getMessageDefinitionMechanism <em>Message Definition Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Definition Mechanism</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getMessageDefinitionMechanism()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EReference getServiceInterfaceSpecification_MessageDefinitionMechanism();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceDescriptionUri <em>Service Interface Description Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Interface Description Uri</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceDescriptionUri()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecification_ServiceInterfaceDescriptionUri();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getTargetNamespace()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecification_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getPrefix()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecification_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceTesting <em>Service Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Testing</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceTesting()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EReference getServiceInterfaceSpecification_ServiceTesting();

	/**
	 * Returns the meta object for the containment reference list '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getSchemaReference <em>Schema Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Reference</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getSchemaReference()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EReference getServiceInterfaceSpecification_SchemaReference();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceNameAbbreviationText <em>Service Interface Name Abbreviation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Interface Name Abbreviation Text</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInterfaceSpecification#getServiceInterfaceNameAbbreviationText()
	 * @see #getServiceInterfaceSpecification()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecification_ServiceInterfaceNameAbbreviationText();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.ServiceInteractionProfile <em>Service Interaction Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interaction Profile</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInteractionProfile
	 * @generated
	 */
	EClass getServiceInteractionProfile();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipName <em>Sip Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sip Name</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipName()
	 * @see #getServiceInteractionProfile()
	 * @generated
	 */
	EAttribute getServiceInteractionProfile_SipName();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipVersion <em>Sip Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sip Version</em>'.
	 * @see data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipVersion()
	 * @see #getServiceInteractionProfile()
	 * @generated
	 */
	EAttribute getServiceInteractionProfile_SipVersion();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.ServiceInteractionProfile#nameDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.ServiceInteractionProfile#nameDerivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceInteractionProfile__NameDerivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link data.grauml.graAnnotationModel.SchemaReference <em>Schema Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Reference</em>'.
	 * @see data.grauml.graAnnotationModel.SchemaReference
	 * @generated
	 */
	EClass getSchemaReference();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.SchemaReference#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see data.grauml.graAnnotationModel.SchemaReference#getNamespace()
	 * @see #getSchemaReference()
	 * @generated
	 */
	EAttribute getSchemaReference_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.SchemaReference#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see data.grauml.graAnnotationModel.SchemaReference#getPrefix()
	 * @see #getSchemaReference()
	 * @generated
	 */
	EAttribute getSchemaReference_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graAnnotationModel.SchemaReference#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see data.grauml.graAnnotationModel.SchemaReference#getSchemaLocation()
	 * @see #getSchemaReference()
	 * @generated
	 */
	EAttribute getSchemaReference_SchemaLocation();

	/**
	 * Returns the meta object for the '{@link data.grauml.graAnnotationModel.SchemaReference#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derivation</em>' operation.
	 * @see data.grauml.graAnnotationModel.SchemaReference#derivation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSchemaReference__Derivation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graAnnotationModel.ExchangePattern <em>Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exchange Pattern</em>'.
	 * @see data.grauml.graAnnotationModel.ExchangePattern
	 * @generated
	 */
	EEnum getExchangePattern();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graAnnotationModel.ParameterUse <em>Parameter Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Use</em>'.
	 * @see data.grauml.graAnnotationModel.ParameterUse
	 * @generated
	 */
	EEnum getParameterUse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraAnnotationModelFactory getGraAnnotationModelFactory();

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
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl <em>Interaction Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.InteractionRequirementsImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getInteractionRequirements()
		 * @generated
		 */
		EClass INTERACTION_REQUIREMENTS = eINSTANCE.getInteractionRequirements();

		/**
		 * The meta object literal for the '<em><b>Service Consumer Authentication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHENTICATION = eINSTANCE.getInteractionRequirements_ServiceConsumerAuthentication();

		/**
		 * The meta object literal for the '<em><b>Service Consumer Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__SERVICE_CONSUMER_AUTHORIZATION = eINSTANCE.getInteractionRequirements_ServiceConsumerAuthorization();

		/**
		 * The meta object literal for the '<em><b>Identity And Attribute Assertion Transmission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__IDENTITY_AND_ATTRIBUTE_ASSERTION_TRANSMISSION = eINSTANCE.getInteractionRequirements_IdentityAndAttributeAssertionTransmission();

		/**
		 * The meta object literal for the '<em><b>Service Authentication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__SERVICE_AUTHENTICATION = eINSTANCE.getInteractionRequirements_ServiceAuthentication();

		/**
		 * The meta object literal for the '<em><b>Message Nonrepudiation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__MESSAGE_NONREPUDIATION = eINSTANCE.getInteractionRequirements_MessageNonrepudiation();

		/**
		 * The meta object literal for the '<em><b>Message Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__MESSAGE_INTEGRITY = eINSTANCE.getInteractionRequirements_MessageIntegrity();

		/**
		 * The meta object literal for the '<em><b>Message Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__MESSAGE_CONFIDENTIALITY = eINSTANCE.getInteractionRequirements_MessageConfidentiality();

		/**
		 * The meta object literal for the '<em><b>Message Addressing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__MESSAGE_ADDRESSING = eINSTANCE.getInteractionRequirements_MessageAddressing();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__RELIABILITY = eINSTANCE.getInteractionRequirements_Reliability();

		/**
		 * The meta object literal for the '<em><b>Transaction Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__TRANSACTION_SUPPORT = eINSTANCE.getInteractionRequirements_TransactionSupport();

		/**
		 * The meta object literal for the '<em><b>Service Metadata Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__SERVICE_METADATA_AVAILABILITY = eINSTANCE.getInteractionRequirements_ServiceMetadataAvailability();

		/**
		 * The meta object literal for the '<em><b>Interface Description Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__INTERFACE_DESCRIPTION_REQUIREMENTS = eINSTANCE.getInteractionRequirements_InterfaceDescriptionRequirements();

		/**
		 * The meta object literal for the '<em><b>Logging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__LOGGING = eINSTANCE.getInteractionRequirements_Logging();

		/**
		 * The meta object literal for the '<em><b>Service Responsiveness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__SERVICE_RESPONSIVENESS = eINSTANCE.getInteractionRequirements_ServiceResponsiveness();

		/**
		 * The meta object literal for the '<em><b>Extended Requirement</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_REQUIREMENTS__EXTENDED_REQUIREMENT = eINSTANCE.getInteractionRequirements_ExtendedRequirement();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl <em>Gra Service Annotation Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.GraServiceAnnotationBaseImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getGraServiceAnnotationBase()
		 * @generated
		 */
		EClass GRA_SERVICE_ANNOTATION_BASE = eINSTANCE.getGraServiceAnnotationBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRA_SERVICE_ANNOTATION_BASE__NAME = eINSTANCE.getGraServiceAnnotationBase_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRA_SERVICE_ANNOTATION_BASE__DOCUMENTATION = eINSTANCE.getGraServiceAnnotationBase_Documentation();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRA_SERVICE_ANNOTATION_BASE__TEMPLATE = eINSTANCE.getGraServiceAnnotationBase_Template();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRA_SERVICE_ANNOTATION_BASE__REQUIREMENT = eINSTANCE.getGraServiceAnnotationBase_Requirement();

		/**
		 * The meta object literal for the '<em><b>Model Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRA_SERVICE_ANNOTATION_BASE__MODEL_REFERENCE = eINSTANCE.getGraServiceAnnotationBase_ModelReference();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRA_SERVICE_ANNOTATION_BASE__FLAG = eINSTANCE.getGraServiceAnnotationBase_Flag();

		/**
		 * The meta object literal for the '<em><b>Name Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRA_SERVICE_ANNOTATION_BASE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGraServiceAnnotationBase__NameDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Doc Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRA_SERVICE_ANNOTATION_BASE___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGraServiceAnnotationBase__DocDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ModelReferenceImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFERENCE__NAME = eINSTANCE.getModelReference_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFERENCE__DOCUMENTATION = eINSTANCE.getModelReference_Documentation();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFERENCE__ELEMENT_ID = eINSTANCE.getModelReference_ElementId();

		/**
		 * The meta object literal for the '<em><b>Diagram Link</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFERENCE__DIAGRAM_LINK = eINSTANCE.getModelReference_DiagramLink();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFERENCE__MODEL = eINSTANCE.getModelReference_Model();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getModelReference__Derivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ModelImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Model Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_URI = eINSTANCE.getModel_ModelUri();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__LABEL = eINSTANCE.getModel_Label();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ParticipantImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Participating Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PARTICIPATING_ORGANIZATION = eINSTANCE.getParticipant_ParticipatingOrganization();

		/**
		 * The meta object literal for the '<em><b>Realizes Actor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTICIPANT___REALIZES_ACTOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getParticipant__RealizesActor__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.OrganizationImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Organization Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_ACRONYM = eINSTANCE.getOrganization_OrganizationAcronym();

		/**
		 * The meta object literal for the '<em><b>Organization Full Address Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_FULL_ADDRESS_TEXT = eINSTANCE.getOrganization_OrganizationFullAddressText();

		/**
		 * The meta object literal for the '<em><b>Organization Web Site Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_WEB_SITE_URL = eINSTANCE.getOrganization_OrganizationWebSiteUrl();

		/**
		 * The meta object literal for the '<em><b>Organization Role Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_ROLE_DESCRIPTION_TEXT = eINSTANCE.getOrganization_OrganizationRoleDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Organization Role Detailed Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT = eINSTANCE.getOrganization_OrganizationRoleDetailedDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Organization Point Of Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__ORGANIZATION_POINT_OF_CONTACT = eINSTANCE.getOrganization_OrganizationPointOfContact();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.PersonImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Contact Person Email Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CONTACT_PERSON_EMAIL_ID = eINSTANCE.getPerson_ContactPersonEmailId();

		/**
		 * The meta object literal for the '<em><b>Contact Person Phone Number Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CONTACT_PERSON_PHONE_NUMBER_ID = eINSTANCE.getPerson_ContactPersonPhoneNumberId();

		/**
		 * The meta object literal for the '<em><b>Contact Person Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CONTACT_PERSON_ADDRESS = eINSTANCE.getPerson_ContactPersonAddress();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.InterfaceImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERATION = eINSTANCE.getInterface_Operation();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.OperationImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETER = eINSTANCE.getOperation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Message Exchange Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__MESSAGE_EXCHANGE_PATTERN = eINSTANCE.getOperation_MessageExchangePattern();

		/**
		 * The meta object literal for the '<em><b>Is Asynchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_ASYNCHRONOUS = eINSTANCE.getOperation_IsAsynchronous();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ACTION_NAME = eINSTANCE.getOperation_ActionName();

		/**
		 * The meta object literal for the '<em><b>Action Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ACTION_PURPOSE = eINSTANCE.getOperation_ActionPurpose();

		/**
		 * The meta object literal for the '<em><b>Action Provenance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ACTION_PROVENANCE = eINSTANCE.getOperation_ActionProvenance();

		/**
		 * The meta object literal for the '<em><b>Realizes Operation Or Reception</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___REALIZES_OPERATION_OR_RECEPTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__RealizesOperationOrReception__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Purpose Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___PURPOSE_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__PurposeDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ParameterImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__USE = eINSTANCE.getParameter_Use();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__MESSAGE = eINSTANCE.getParameter_Message();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getParameter__Derivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Use Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___USE_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getParameter__UseDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.MessageImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__PREFIX = eINSTANCE.getMessage_Prefix();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORT = eINSTANCE.getService_Port();

		/**
		 * The meta object literal for the '<em><b>Service Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_PROVIDER = eINSTANCE.getService_ServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Sample Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SAMPLE_DATA = eINSTANCE.getService_SampleData();

		/**
		 * The meta object literal for the '<em><b>Realizes Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___REALIZES_COMPONENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getService__RealizesComponent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.PortImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INTERFACE = eINSTANCE.getPort_Interface();

		/**
		 * The meta object literal for the '<em><b>Address Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ADDRESS_URI = eINSTANCE.getPort_AddressUri();

		/**
		 * The meta object literal for the '<em><b>Realizes Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORT___REALIZES_PORT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPort__RealizesPort__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.SampleDataImpl <em>Sample Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.SampleDataImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getSampleData()
		 * @generated
		 */
		EClass SAMPLE_DATA = eINSTANCE.getSampleData();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_DATA__INPUT = eINSTANCE.getSampleData_Input();

		/**
		 * The meta object literal for the '<em><b>Expected Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_DATA__EXPECTED_OUTPUT = eINSTANCE.getSampleData_ExpectedOutput();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceInteractionImpl <em>Service Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceInteractionImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceInteraction()
		 * @generated
		 */
		EClass SERVICE_INTERACTION = eINSTANCE.getServiceInteraction();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERACTION__PARTICIPANT = eINSTANCE.getServiceInteraction_Participant();

		/**
		 * The meta object literal for the '<em><b>Realizes Interaction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_INTERACTION___REALIZES_INTERACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceInteraction__RealizesInteraction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.UseCaseImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__PROVIDER = eINSTANCE.getUseCase_Provider();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__CONSUMER = eINSTANCE.getUseCase_Consumer();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USE_CASE___DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUseCase__Derivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.AgreementImpl <em>Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.AgreementImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getAgreement()
		 * @generated
		 */
		EClass AGREEMENT = eINSTANCE.getAgreement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__DOCUMENTATION = eINSTANCE.getAgreement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Agreement Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__AGREEMENT_URI = eINSTANCE.getAgreement_AgreementUri();

		/**
		 * The meta object literal for the '<em><b>Automated Agreement Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR = eINSTANCE.getAgreement_AutomatedAgreementIndicator();

		/**
		 * The meta object literal for the '<em><b>Doc Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAgreement__DocDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.IepdReferenceImpl <em>Iepd Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.IepdReferenceImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getIepdReference()
		 * @generated
		 */
		EClass IEPD_REFERENCE = eINSTANCE.getIepdReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEPD_REFERENCE__NAME = eINSTANCE.getIepdReference_Name();

		/**
		 * The meta object literal for the '<em><b>Iepdurl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEPD_REFERENCE__IEPDURL = eINSTANCE.getIepdReference_Iepdurl();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEPD_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIepdReference__Derivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.SecurityClassificationImpl <em>Security Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.SecurityClassificationImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getSecurityClassification()
		 * @generated
		 */
		EClass SECURITY_CLASSIFICATION = eINSTANCE.getSecurityClassification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CLASSIFICATION__NAME = eINSTANCE.getSecurityClassification_Name();

		/**
		 * The meta object literal for the '<em><b>Name Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECURITY_CLASSIFICATION___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSecurityClassification__NameDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceCapabilityImpl <em>Service Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceCapabilityImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceCapability()
		 * @generated
		 */
		EClass SERVICE_CAPABILITY = eINSTANCE.getServiceCapability();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CAPABILITY__DOCUMENTATION = eINSTANCE.getServiceCapability_Documentation();

		/**
		 * The meta object literal for the '<em><b>Doc Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_CAPABILITY___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceCapability__DocDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceDescriptionImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceDescription()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION = eINSTANCE.getServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__EXCHANGE_PARTNER = eINSTANCE.getServiceDescription_ExchangePartner();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__CLASSIFICATION = eINSTANCE.getServiceDescription_Classification();

		/**
		 * The meta object literal for the '<em><b>Sponsor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SPONSOR = eINSTANCE.getServiceDescription_Sponsor();

		/**
		 * The meta object literal for the '<em><b>Service Purpose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_PURPOSE = eINSTANCE.getServiceDescription_ServicePurpose();

		/**
		 * The meta object literal for the '<em><b>Service Scope Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_SCOPE_DESCRIPTION = eINSTANCE.getServiceDescription_ServiceScopeDescription();

		/**
		 * The meta object literal for the '<em><b>Service Description Summary Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_SUMMARY_TEXT = eINSTANCE.getServiceDescription_ServiceDescriptionSummaryText();

		/**
		 * The meta object literal for the '<em><b>Service Description Keyword Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_KEYWORD_TEXT = eINSTANCE.getServiceDescription_ServiceDescriptionKeywordText();

		/**
		 * The meta object literal for the '<em><b>Service Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_CAPABILITY = eINSTANCE.getServiceDescription_ServiceCapability();

		/**
		 * The meta object literal for the '<em><b>Service Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_DEPENDENCY = eINSTANCE.getServiceDescription_ServiceDependency();

		/**
		 * The meta object literal for the '<em><b>Iepd Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__IEPD_REFERENCE = eINSTANCE.getServiceDescription_IepdReference();

		/**
		 * The meta object literal for the '<em><b>Service Security Classification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_SECURITY_CLASSIFICATION = eINSTANCE.getServiceDescription_ServiceSecurityClassification();

		/**
		 * The meta object literal for the '<em><b>Service Level Agreement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_LEVEL_AGREEMENT = eINSTANCE.getServiceDescription_ServiceLevelAgreement();

		/**
		 * The meta object literal for the '<em><b>Related Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__RELATED_ORGANIZATION = eINSTANCE.getServiceDescription_RelatedOrganization();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_INTERFACE = eINSTANCE.getServiceDescription_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__DOMAIN_DESCRIPTION = eINSTANCE.getServiceDescription_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Endorsements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__ENDORSEMENTS = eINSTANCE.getServiceDescription_Endorsements();

		/**
		 * The meta object literal for the '<em><b>Real World Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__REAL_WORLD_EFFECT = eINSTANCE.getServiceDescription_RealWorldEffect();

		/**
		 * The meta object literal for the '<em><b>Service Interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_INTERACTION = eINSTANCE.getServiceDescription_ServiceInteraction();

		/**
		 * The meta object literal for the '<em><b>Transformation Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__TRANSFORMATION_URI = eINSTANCE.getServiceDescription_TransformationUri();

		/**
		 * The meta object literal for the '<em><b>Major Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__MAJOR_VERSION = eINSTANCE.getServiceDescription_MajorVersion();

		/**
		 * The meta object literal for the '<em><b>Minor Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__MINOR_VERSION = eINSTANCE.getServiceDescription_MinorVersion();

		/**
		 * The meta object literal for the '<em><b>Revision Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__REVISION_VERSION = eINSTANCE.getServiceDescription_RevisionVersion();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__CREATION_DATE = eINSTANCE.getServiceDescription_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Activation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__ACTIVATION_DATE = eINSTANCE.getServiceDescription_ActivationDate();

		/**
		 * The meta object literal for the '<em><b>Last Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__LAST_REVISION_DATE = eINSTANCE.getServiceDescription_LastRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Next Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__NEXT_REVISION_DATE = eINSTANCE.getServiceDescription_NextRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__EXPIRATION_DATE = eINSTANCE.getServiceDescription_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__LIFECYCLE_STATUS = eINSTANCE.getServiceDescription_LifecycleStatus();

		/**
		 * The meta object literal for the '<em><b>Alert And Notification Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__ALERT_AND_NOTIFICATION_URI = eINSTANCE.getServiceDescription_AlertAndNotificationUri();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__ADDITIONAL_INFORMATION = eINSTANCE.getServiceDescription_AdditionalInformation();

		/**
		 * The meta object literal for the '<em><b>Service Description Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SERVICE_DESCRIPTION_URI = eINSTANCE.getServiceDescription_ServiceDescriptionUri();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__EXECUTION_CONTEXT = eINSTANCE.getServiceDescription_ExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SECURITY = eINSTANCE.getServiceDescription_Security();

		/**
		 * The meta object literal for the '<em><b>Privacy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__PRIVACY = eINSTANCE.getServiceDescription_Privacy();

		/**
		 * The meta object literal for the '<em><b>Service Assumption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_ASSUMPTION = eINSTANCE.getServiceDescription_ServiceAssumption();

		/**
		 * The meta object literal for the '<em><b>Other Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__OTHER_REQUIREMENT = eINSTANCE.getServiceDescription_OtherRequirement();

		/**
		 * The meta object literal for the '<em><b>Data Provenance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__DATA_PROVENANCE = eINSTANCE.getServiceDescription_DataProvenance();

		/**
		 * The meta object literal for the '<em><b>Realizes Collaboration And Uses Iepd</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_DESCRIPTION___REALIZES_COLLABORATION_AND_USES_IEPD__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceDescription__RealizesCollaborationAndUsesIepd__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_DESCRIPTION___EXCHANGE_PARTNER_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceDescription__ExchangePartnerDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceIdentificationImpl <em>Service Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceIdentificationImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceIdentification()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION = eINSTANCE.getServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION__SERVICE_ID = eINSTANCE.getServiceIdentification_ServiceId();

		/**
		 * The meta object literal for the '<em><b>Service Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION__SERVICE_URI = eINSTANCE.getServiceIdentification_ServiceUri();

		/**
		 * The meta object literal for the '<em><b>Service Name Abbreviation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION__SERVICE_NAME_ABBREVIATION_TEXT = eINSTANCE.getServiceIdentification_ServiceNameAbbreviationText();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.DescriptionImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__DOCUMENTATION = eINSTANCE.getDescription_Documentation();

		/**
		 * The meta object literal for the '<em><b>External Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__EXTERNAL_DOCUMENTATION = eINSTANCE.getDescription_ExternalDocumentation();

		/**
		 * The meta object literal for the '<em><b>Doc Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCRIPTION___DOC_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDescription__DocDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl <em>Service Level Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceLevelAgreementImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceLevelAgreement()
		 * @generated
		 */
		EClass SERVICE_LEVEL_AGREEMENT = eINSTANCE.getServiceLevelAgreement();

		/**
		 * The meta object literal for the '<em><b>Applicable Policies Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICIES_INDICATOR = eINSTANCE.getServiceLevelAgreement_ApplicablePoliciesIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Contracts Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACTS_INDICATOR = eINSTANCE.getServiceLevelAgreement_ApplicableContractsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Agreements Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__APPLICABLE_AGREEMENTS_INDICATOR = eINSTANCE.getServiceLevelAgreement_ApplicableAgreementsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR = eINSTANCE.getServiceLevelAgreement_ApplicableUmbrellaAgreementsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENT__APPLICABLE_POLICY = eINSTANCE.getServiceLevelAgreement_ApplicablePolicy();

		/**
		 * The meta object literal for the '<em><b>Umbrella Agreement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENT__UMBRELLA_AGREEMENT = eINSTANCE.getServiceLevelAgreement_UmbrellaAgreement();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENT__AGREEMENT = eINSTANCE.getServiceLevelAgreement_Agreement();

		/**
		 * The meta object literal for the '<em><b>Applicable Contract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENT__APPLICABLE_CONTRACT = eINSTANCE.getServiceLevelAgreement_ApplicableContract();

		/**
		 * The meta object literal for the '<em><b>Approval Required Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__APPROVAL_REQUIRED_INDICATOR = eINSTANCE.getServiceLevelAgreement_ApprovalRequiredIndicator();

		/**
		 * The meta object literal for the '<em><b>Licensing Required Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__LICENSING_REQUIRED_INDICATOR = eINSTANCE.getServiceLevelAgreement_LicensingRequiredIndicator();

		/**
		 * The meta object literal for the '<em><b>Licensing Agreement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENT__LICENSING_AGREEMENT = eINSTANCE.getServiceLevelAgreement_LicensingAgreement();

		/**
		 * The meta object literal for the '<em><b>Service Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__SERVICE_RESPONSE_TIME = eINSTANCE.getServiceLevelAgreement_ServiceResponseTime();

		/**
		 * The meta object literal for the '<em><b>Service Average Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__SERVICE_AVERAGE_THROUGHPUT = eINSTANCE.getServiceLevelAgreement_ServiceAverageThroughput();

		/**
		 * The meta object literal for the '<em><b>Service Maximum Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__SERVICE_MAXIMUM_THROUGHPUT = eINSTANCE.getServiceLevelAgreement_ServiceMaximumThroughput();

		/**
		 * The meta object literal for the '<em><b>Service Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__SERVICE_AVAILABILITY = eINSTANCE.getServiceLevelAgreement_ServiceAvailability();

		/**
		 * The meta object literal for the '<em><b>Usage Cost Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__USAGE_COST_AMOUNT = eINSTANCE.getServiceLevelAgreement_UsageCostAmount();

		/**
		 * The meta object literal for the '<em><b>Usage Unit Cost Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__USAGE_UNIT_COST_AMOUNT = eINSTANCE.getServiceLevelAgreement_UsageUnitCostAmount();

		/**
		 * The meta object literal for the '<em><b>Creation Cost Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT__CREATION_COST_AMOUNT = eINSTANCE.getServiceLevelAgreement_CreationCostAmount();

		/**
		 * The meta object literal for the '<em><b>Applicable Contracts Indicator Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_LEVEL_AGREEMENT___APPLICABLE_CONTRACTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceLevelAgreement__ApplicableContractsIndicatorDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Applicable Agreements Indicator Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_LEVEL_AGREEMENT___APPLICABLE_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceLevelAgreement__ApplicableAgreementsIndicatorDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Applicable Umbrella Agreements Indicator Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_LEVEL_AGREEMENT___APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceLevelAgreement__ApplicableUmbrellaAgreementsIndicatorDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl <em>Service Interface Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceInterfaceSpecificationImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceInterfaceSpecification()
		 * @generated
		 */
		EClass SERVICE_INTERFACE_SPECIFICATION = eINSTANCE.getServiceInterfaceSpecification();

		/**
		 * The meta object literal for the '<em><b>Security Implemented Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION__SECURITY_IMPLEMENTED_INDICATOR = eINSTANCE.getServiceInterfaceSpecification_SecurityImplementedIndicator();

		/**
		 * The meta object literal for the '<em><b>Security Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION__SECURITY_DESCRIPTION_TEXT = eINSTANCE.getServiceInterfaceSpecification_SecurityDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Service Interaction Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERACTION_PROFILE = eINSTANCE.getServiceInterfaceSpecification_ServiceInteractionProfile();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION__SERVICE = eINSTANCE.getServiceInterfaceSpecification_Service();

		/**
		 * The meta object literal for the '<em><b>Uri Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION__URI_ADDRESS = eINSTANCE.getServiceInterfaceSpecification_UriAddress();

		/**
		 * The meta object literal for the '<em><b>Message Definition Mechanism</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION__MESSAGE_DEFINITION_MECHANISM = eINSTANCE.getServiceInterfaceSpecification_MessageDefinitionMechanism();

		/**
		 * The meta object literal for the '<em><b>Service Interface Description Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_DESCRIPTION_URI = eINSTANCE.getServiceInterfaceSpecification_ServiceInterfaceDescriptionUri();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION__TARGET_NAMESPACE = eINSTANCE.getServiceInterfaceSpecification_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION__PREFIX = eINSTANCE.getServiceInterfaceSpecification_Prefix();

		/**
		 * The meta object literal for the '<em><b>Service Testing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION__SERVICE_TESTING = eINSTANCE.getServiceInterfaceSpecification_ServiceTesting();

		/**
		 * The meta object literal for the '<em><b>Schema Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION__SCHEMA_REFERENCE = eINSTANCE.getServiceInterfaceSpecification_SchemaReference();

		/**
		 * The meta object literal for the '<em><b>Service Interface Name Abbreviation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION__SERVICE_INTERFACE_NAME_ABBREVIATION_TEXT = eINSTANCE.getServiceInterfaceSpecification_ServiceInterfaceNameAbbreviationText();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.ServiceInteractionProfileImpl <em>Service Interaction Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.ServiceInteractionProfileImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getServiceInteractionProfile()
		 * @generated
		 */
		EClass SERVICE_INTERACTION_PROFILE = eINSTANCE.getServiceInteractionProfile();

		/**
		 * The meta object literal for the '<em><b>Sip Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERACTION_PROFILE__SIP_NAME = eINSTANCE.getServiceInteractionProfile_SipName();

		/**
		 * The meta object literal for the '<em><b>Sip Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERACTION_PROFILE__SIP_VERSION = eINSTANCE.getServiceInteractionProfile_SipVersion();

		/**
		 * The meta object literal for the '<em><b>Name Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_INTERACTION_PROFILE___NAME_DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceInteractionProfile__NameDerivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.impl.SchemaReferenceImpl <em>Schema Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.impl.SchemaReferenceImpl
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getSchemaReference()
		 * @generated
		 */
		EClass SCHEMA_REFERENCE = eINSTANCE.getSchemaReference();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_REFERENCE__NAMESPACE = eINSTANCE.getSchemaReference_Namespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_REFERENCE__PREFIX = eINSTANCE.getSchemaReference_Prefix();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_REFERENCE__SCHEMA_LOCATION = eINSTANCE.getSchemaReference_SchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEMA_REFERENCE___DERIVATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSchemaReference__Derivation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.ExchangePattern <em>Exchange Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.ExchangePattern
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getExchangePattern()
		 * @generated
		 */
		EEnum EXCHANGE_PATTERN = eINSTANCE.getExchangePattern();

		/**
		 * The meta object literal for the '{@link data.grauml.graAnnotationModel.ParameterUse <em>Parameter Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graAnnotationModel.ParameterUse
		 * @see data.grauml.graAnnotationModel.impl.GraAnnotationModelPackageImpl#getParameterUse()
		 * @generated
		 */
		EEnum PARAMETER_USE = eINSTANCE.getParameterUse();

	}

} //GraAnnotationModelPackage
