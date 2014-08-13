/**
 */
package gov.ojp.it.gsp.services._1._0;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see gov.ojp.it.gsp.services._1._0.graFactory
 * @model kind="package"
 * @generated
 */
public interface graPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.ojp.gov/gsp/services/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	graPackage eINSTANCE = gov.ojp.it.gsp.services._1._0.impl.graPackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.AgreementTypeImpl <em>Agreement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.AgreementTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getAgreementType()
	 * @generated
	 */
	int AGREEMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Agreement Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Agreement URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE__AGREEMENT_URI = 1;

	/**
	 * The number of structural features of the '<em>Agreement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agreement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.AmountTypeImpl <em>Amount Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.AmountTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getAmountType()
	 * @generated
	 */
	int AMOUNT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Currency Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_TYPE__CURRENCY_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Amount Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Amount Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicableAgreementsTypeImpl <em>Applicable Agreements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicableAgreementsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicableAgreementsType()
	 * @generated
	 */
	int APPLICABLE_AGREEMENTS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_AGREEMENTS_TYPE__AGREEMENT = 0;

	/**
	 * The number of structural features of the '<em>Applicable Agreements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_AGREEMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Applicable Agreements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_AGREEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicableContractsTypeImpl <em>Applicable Contracts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicableContractsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicableContractsType()
	 * @generated
	 */
	int APPLICABLE_CONTRACTS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_CONTRACTS_TYPE__CONTRACT = 0;

	/**
	 * The number of structural features of the '<em>Applicable Contracts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_CONTRACTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Applicable Contracts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_CONTRACTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicablePoliciesTypeImpl <em>Applicable Policies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicablePoliciesTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicablePoliciesType()
	 * @generated
	 */
	int APPLICABLE_POLICIES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Policy Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_POLICIES_TYPE__POLICY_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Applicable Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_POLICIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Applicable Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_POLICIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicableUmbrellaAgreementsTypeImpl <em>Applicable Umbrella Agreements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicableUmbrellaAgreementsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicableUmbrellaAgreementsType()
	 * @generated
	 */
	int APPLICABLE_UMBRELLA_AGREEMENTS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Umbrella Agreement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_UMBRELLA_AGREEMENTS_TYPE__UMBRELLA_AGREEMENT = 0;

	/**
	 * The number of structural features of the '<em>Applicable Umbrella Agreements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_UMBRELLA_AGREEMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Applicable Umbrella Agreements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABLE_UMBRELLA_AGREEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl <em>Business Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getBusinessContextType()
	 * @generated
	 */
	int BUSINESS_CONTEXT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Classifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Exchange Partner Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Endorsements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONTEXT_TYPE__ENDORSEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Sponsors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONTEXT_TYPE__SPONSORS = 4;

	/**
	 * The number of structural features of the '<em>Business Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONTEXT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Business Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONTEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ClassificationsTypeImpl <em>Classifications Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ClassificationsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getClassificationsType()
	 * @generated
	 */
	int CLASSIFICATIONS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATIONS_TYPE__CLASSIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Classifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.CostTypeImpl <em>Cost Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.CostTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getCostType()
	 * @generated
	 */
	int COST_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Usage Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__USAGE_COST_AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Usage Unit Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__USAGE_UNIT_COST_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Creation Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__CREATION_COST_AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Action Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTION_PURPOSE = 4;

	/**
	 * The feature id for the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTIVATION_DATE = 5;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AGREEMENT = 6;

	/**
	 * The feature id for the '<em><b>Agreement Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Agreement URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AGREEMENT_URI = 8;

	/**
	 * The feature id for the '<em><b>Alerts And Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS = 9;

	/**
	 * The feature id for the '<em><b>Applicable Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_AGREEMENTS = 10;

	/**
	 * The feature id for the '<em><b>Applicable Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR = 11;

	/**
	 * The feature id for the '<em><b>Applicable Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_CONTRACTS = 12;

	/**
	 * The feature id for the '<em><b>Applicable Contracts Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR = 13;

	/**
	 * The feature id for the '<em><b>Applicable Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_POLICIES = 14;

	/**
	 * The feature id for the '<em><b>Applicable Policies Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR = 15;

	/**
	 * The feature id for the '<em><b>Applicable Umbrella Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS = 16;

	/**
	 * The feature id for the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR = 17;

	/**
	 * The feature id for the '<em><b>Approval Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR = 18;

	/**
	 * The feature id for the '<em><b>Business Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_CONTEXT = 19;

	/**
	 * The feature id for the '<em><b>Capability Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT = 20;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Classifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFICATIONS = 22;

	/**
	 * The feature id for the '<em><b>Contact Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS = 23;

	/**
	 * The feature id for the '<em><b>Contact Person Email ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID = 24;

	/**
	 * The feature id for the '<em><b>Contact Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_PERSON_NAME = 25;

	/**
	 * The feature id for the '<em><b>Contact Person Phone Number ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID = 26;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTRACT = 27;

	/**
	 * The feature id for the '<em><b>Creation Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATION_COST_AMOUNT = 28;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATION_DATE = 29;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN_DESCRIPTION = 30;

	/**
	 * The feature id for the '<em><b>Domain Name Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN_NAME_TEXT = 31;

	/**
	 * The feature id for the '<em><b>Endorsements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDORSEMENTS = 32;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDORSER = 33;

	/**
	 * The feature id for the '<em><b>Exchange Partner Type Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT = 34;

	/**
	 * The feature id for the '<em><b>Exchange Partner Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES = 35;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPIRATION_DATE = 36;

	/**
	 * The feature id for the '<em><b>IEPD Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IEPD_NAME = 37;

	/**
	 * The feature id for the '<em><b>IEPD Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IEPD_REFERENCE = 38;

	/**
	 * The feature id for the '<em><b>IEPD References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IEPD_REFERENCES = 39;

	/**
	 * The feature id for the '<em><b>IEPDURL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IEPDURL = 40;

	/**
	 * The feature id for the '<em><b>Last Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_REVISION_DATE = 41;

	/**
	 * The feature id for the '<em><b>Licensing Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LICENSING_AGREEMENT = 42;

	/**
	 * The feature id for the '<em><b>Licensing Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR = 43;

	/**
	 * The feature id for the '<em><b>Lifecycle Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIFECYCLE_STATUS = 44;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAJOR_VERSION = 45;

	/**
	 * The feature id for the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN = 46;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MINOR_VERSION = 47;

	/**
	 * The feature id for the '<em><b>Next Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEXT_REVISION_DATE = 48;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION = 49;

	/**
	 * The feature id for the '<em><b>Organization Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_ACRONYM = 50;

	/**
	 * The feature id for the '<em><b>Organization Full Address Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT = 51;

	/**
	 * The feature id for the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_NAME = 52;

	/**
	 * The feature id for the '<em><b>Organization Point Of Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT = 53;

	/**
	 * The feature id for the '<em><b>Organization Role Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT = 54;

	/**
	 * The feature id for the '<em><b>Organization Role Detailed Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT = 55;

	/**
	 * The feature id for the '<em><b>Organization Web Site URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL = 56;

	/**
	 * The feature id for the '<em><b>Performance Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERFORMANCE_METRICS = 57;

	/**
	 * The feature id for the '<em><b>Policy Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLICY_TEXT = 58;

	/**
	 * The feature id for the '<em><b>Real World Effect Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT = 59;

	/**
	 * The feature id for the '<em><b>Related Organization Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION = 60;

	/**
	 * The feature id for the '<em><b>Revision Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REVISION_VERSION = 61;

	/**
	 * The feature id for the '<em><b>Security Classification Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT = 62;

	/**
	 * The feature id for the '<em><b>Security Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT = 63;

	/**
	 * The feature id for the '<em><b>Security Implemented Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR = 64;

	/**
	 * The feature id for the '<em><b>Service Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_ACTION = 65;

	/**
	 * The feature id for the '<em><b>Service Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_ACTIONS = 66;

	/**
	 * The feature id for the '<em><b>Service Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_AVAILABILITY = 67;

	/**
	 * The feature id for the '<em><b>Service Average Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT = 68;

	/**
	 * The feature id for the '<em><b>Service Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_CAPABILITIES = 69;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DEPENDENCIES = 70;

	/**
	 * The feature id for the '<em><b>Service Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DEPENDENCY = 71;

	/**
	 * The feature id for the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DESCRIPTION = 72;

	/**
	 * The feature id for the '<em><b>Service Description Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS = 73;

	/**
	 * The feature id for the '<em><b>Service Description Keyword Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT = 74;

	/**
	 * The feature id for the '<em><b>Service Description Summary Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT = 75;

	/**
	 * The feature id for the '<em><b>Service Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT = 76;

	/**
	 * The feature id for the '<em><b>Service Full Name Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT = 77;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_ID = 78;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_IDENTIFICATION = 79;

	/**
	 * The feature id for the '<em><b>Service Interaction Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE = 80;

	/**
	 * The feature id for the '<em><b>Service Interaction Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES = 81;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_INTERFACE = 82;

	/**
	 * The feature id for the '<em><b>Service Level Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS = 83;

	/**
	 * The feature id for the '<em><b>Service Maximum Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT = 84;

	/**
	 * The feature id for the '<em><b>Service Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_METADATA = 85;

	/**
	 * The feature id for the '<em><b>Service Name Abbreviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT = 86;

	/**
	 * The feature id for the '<em><b>Service Policy And Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS = 87;

	/**
	 * The feature id for the '<em><b>Service Purpose Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT = 88;

	/**
	 * The feature id for the '<em><b>Service Real World Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS = 89;

	/**
	 * The feature id for the '<em><b>Service Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_RESPONSE_TIME = 90;

	/**
	 * The feature id for the '<em><b>Service Scope Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT = 91;

	/**
	 * The feature id for the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_URI = 92;

	/**
	 * The feature id for the '<em><b>Service Usage Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_USAGE_DETAILS = 93;

	/**
	 * The feature id for the '<em><b>SIP Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIP_NAME = 94;

	/**
	 * The feature id for the '<em><b>SIP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIP_VERSION = 95;

	/**
	 * The feature id for the '<em><b>Sponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPONSOR = 96;

	/**
	 * The feature id for the '<em><b>Sponsors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPONSORS = 97;

	/**
	 * The feature id for the '<em><b>Umbrella Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UMBRELLA_AGREEMENT = 98;

	/**
	 * The feature id for the '<em><b>URI Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URI_ADDRESS = 99;

	/**
	 * The feature id for the '<em><b>URI Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URI_DESCRIPTION = 100;

	/**
	 * The feature id for the '<em><b>URI Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URI_DETAIL = 101;

	/**
	 * The feature id for the '<em><b>URI Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URI_DETAILS = 102;

	/**
	 * The feature id for the '<em><b>Usage Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USAGE_COST_AMOUNT = 103;

	/**
	 * The feature id for the '<em><b>Usage Unit Cost Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT = 104;

	/**
	 * The feature id for the '<em><b>Version Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERSION_INFORMATION = 105;

	/**
	 * The feature id for the '<em><b>Currency Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_TEXT = 106;

	/**
	 * The feature id for the '<em><b>Unit Measure Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIT_MEASURE_TEXT = 107;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 108;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.DomainDescriptionTypeImpl <em>Domain Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.DomainDescriptionTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getDomainDescriptionType()
	 * @generated
	 */
	int DOMAIN_DESCRIPTION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Domain Name Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Domain Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.EndorsementsTypeImpl <em>Endorsements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.EndorsementsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getEndorsementsType()
	 * @generated
	 */
	int ENDORSEMENTS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENTS_TYPE__ENDORSER = 0;

	/**
	 * The number of structural features of the '<em>Endorsements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Endorsements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.EntityTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PERSON = 1;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ExchangePartnerTypesTypeImpl <em>Exchange Partner Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ExchangePartnerTypesTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getExchangePartnerTypesType()
	 * @generated
	 */
	int EXCHANGE_PARTNER_TYPES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Exchange Partner Type Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Exchange Partner Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PARTNER_TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exchange Partner Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_PARTNER_TYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.IEPDReferencesTypeImpl <em>IEPD References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.IEPDReferencesTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getIEPDReferencesType()
	 * @generated
	 */
	int IEPD_REFERENCES_TYPE = 14;

	/**
	 * The feature id for the '<em><b>IEPD Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCES_TYPE__IEPD_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>IEPD References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IEPD References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.IEPDReferenceTypeImpl <em>IEPD Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.IEPDReferenceTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getIEPDReferenceType()
	 * @generated
	 */
	int IEPD_REFERENCE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>IEPD Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE_TYPE__IEPD_NAME = 0;

	/**
	 * The feature id for the '<em><b>IEPDURL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE_TYPE__IEPDURL = 1;

	/**
	 * The number of structural features of the '<em>IEPD Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IEPD Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPD_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANIZATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Organization Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANIZATION_ACRONYM = 1;

	/**
	 * The feature id for the '<em><b>Organization Full Address Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Organization Web Site URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL = 3;

	/**
	 * The feature id for the '<em><b>Organization Role Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Organization Role Detailed Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Organization Point Of Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT = 6;

	/**
	 * The number of structural features of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl <em>Performance Metrics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getPerformanceMetricsType()
	 * @generated
	 */
	int PERFORMANCE_METRICS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Service Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Service Average Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT = 1;

	/**
	 * The feature id for the '<em><b>Service Maximum Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT = 2;

	/**
	 * The feature id for the '<em><b>Service Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY = 3;

	/**
	 * The number of structural features of the '<em>Performance Metrics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Performance Metrics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl <em>Person Contact Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getPersonContactInformationType()
	 * @generated
	 */
	int PERSON_CONTACT_INFORMATION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Contact Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME = 0;

	/**
	 * The feature id for the '<em><b>Contact Person Email ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID = 1;

	/**
	 * The feature id for the '<em><b>Contact Person Phone Number ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID = 2;

	/**
	 * The feature id for the '<em><b>Contact Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS = 3;

	/**
	 * The number of structural features of the '<em>Person Contact Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTACT_INFORMATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person Contact Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_CONTACT_INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.RelatedOrganizationInformationTypeImpl <em>Related Organization Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.RelatedOrganizationInformationTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getRelatedOrganizationInformationType()
	 * @generated
	 */
	int RELATED_ORGANIZATION_INFORMATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ORGANIZATION_INFORMATION_TYPE__ORGANIZATION = 0;

	/**
	 * The number of structural features of the '<em>Related Organization Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ORGANIZATION_INFORMATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Related Organization Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ORGANIZATION_INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceActionsTypeImpl <em>Service Actions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceActionsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceActionsType()
	 * @generated
	 */
	int SERVICE_ACTIONS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Service Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS_TYPE__SERVICE_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Service Actions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Actions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceActionTypeImpl <em>Service Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceActionTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceActionType()
	 * @generated
	 */
	int SERVICE_ACTION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTION_TYPE__ACTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Action Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTION_TYPE__ACTION_PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Service Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceCapabilitiesTypeImpl <em>Service Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceCapabilitiesTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceCapabilitiesType()
	 * @generated
	 */
	int SERVICE_CAPABILITIES_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Capability Description Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Service Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CAPABILITIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDependenciesTypeImpl <em>Service Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceDependenciesTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceDependenciesType()
	 * @generated
	 */
	int SERVICE_DEPENDENCIES_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Service Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Service Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionKeywordsTypeImpl <em>Service Description Keywords Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionKeywordsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceDescriptionKeywordsType()
	 * @generated
	 */
	int SERVICE_DESCRIPTION_KEYWORDS_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Service Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_KEYWORDS_TYPE__SERVICE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Service Description Keywords Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_KEYWORDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Description Keywords Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_KEYWORDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl <em>Service Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceDescriptionType()
	 * @generated
	 */
	int SERVICE_DESCRIPTION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Service Purpose Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Service Scope Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Service Description Summary Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Service Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Service Description Keyword Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Service Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES = 5;

	/**
	 * The feature id for the '<em><b>Service Real World Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS = 6;

	/**
	 * The feature id for the '<em><b>Security Classification Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__ANY = 8;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES = 9;

	/**
	 * The feature id for the '<em><b>IEPD References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES = 10;

	/**
	 * The number of structural features of the '<em>Service Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Service Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl <em>Service Identification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceIdentificationType()
	 * @generated
	 */
	int SERVICE_IDENTIFICATION_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Service Full Name Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__SERVICE_ID = 1;

	/**
	 * The feature id for the '<em><b>Service URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__SERVICE_URI = 2;

	/**
	 * The feature id for the '<em><b>Service Name Abbreviation Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT = 3;

	/**
	 * The number of structural features of the '<em>Service Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IDENTIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfilesTypeImpl <em>Service Interaction Profiles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfilesTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceInteractionProfilesType()
	 * @generated
	 */
	int SERVICE_INTERACTION_PROFILES_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Service Interaction Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE = 0;

	/**
	 * The number of structural features of the '<em>Service Interaction Profiles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Interaction Profiles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfileTypeImpl <em>Service Interaction Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfileTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceInteractionProfileType()
	 * @generated
	 */
	int SERVICE_INTERACTION_PROFILE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>SIP Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME = 0;

	/**
	 * The feature id for the '<em><b>SIP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Service Interaction Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Interaction Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERACTION_PROFILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl <em>Service Interface Specification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceInterfaceSpecificationType()
	 * @generated
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>URI Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Service Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Service Interaction Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES = 2;

	/**
	 * The feature id for the '<em><b>Security Implemented Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR = 3;

	/**
	 * The feature id for the '<em><b>Security Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT = 4;

	/**
	 * The number of structural features of the '<em>Service Interface Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Interface Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_SPECIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceLevelAgreementsTypeImpl <em>Service Level Agreements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceLevelAgreementsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceLevelAgreementsType()
	 * @generated
	 */
	int SERVICE_LEVEL_AGREEMENTS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Service Policy And Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS = 0;

	/**
	 * The feature id for the '<em><b>Performance Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS = 1;

	/**
	 * The feature id for the '<em><b>Service Usage Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS = 2;

	/**
	 * The number of structural features of the '<em>Service Level Agreements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENTS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Level Agreements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl <em>Service Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceMetadataType()
	 * @generated
	 */
	int SERVICE_METADATA_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Service Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Version Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE__VERSION_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Related Organization Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Business Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE__BUSINESS_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE__SERVICE_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Service Level Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS = 6;

	/**
	 * The number of structural features of the '<em>Service Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Service Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl <em>Service Policy And Contracts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServicePolicyAndContractsType()
	 * @generated
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Applicable Policies Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Applicable Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES = 1;

	/**
	 * The feature id for the '<em><b>Applicable Contracts Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Applicable Contracts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS = 3;

	/**
	 * The feature id for the '<em><b>Applicable Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR = 4;

	/**
	 * The feature id for the '<em><b>Applicable Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR = 6;

	/**
	 * The feature id for the '<em><b>Applicable Umbrella Agreements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS = 7;

	/**
	 * The number of structural features of the '<em>Service Policy And Contracts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Service Policy And Contracts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_POLICY_AND_CONTRACTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceRealWorldEffectsTypeImpl <em>Service Real World Effects Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceRealWorldEffectsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceRealWorldEffectsType()
	 * @generated
	 */
	int SERVICE_REAL_WORLD_EFFECTS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Real World Effect Description Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Service Real World Effects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REAL_WORLD_EFFECTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Real World Effects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REAL_WORLD_EFFECTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl <em>Service Usage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceUsageType()
	 * @generated
	 */
	int SERVICE_USAGE_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Approval Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Licensing Required Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR = 1;

	/**
	 * The feature id for the '<em><b>Licensing Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_USAGE_TYPE__LICENSING_AGREEMENT = 2;

	/**
	 * The feature id for the '<em><b>Service Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_USAGE_TYPE__SERVICE_COST = 3;

	/**
	 * The number of structural features of the '<em>Service Usage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_USAGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Usage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_USAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.SponsorsTypeImpl <em>Sponsors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.SponsorsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getSponsorsType()
	 * @generated
	 */
	int SPONSORS_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Sponsor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSORS_TYPE__SPONSOR = 0;

	/**
	 * The number of structural features of the '<em>Sponsors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSORS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sponsors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPONSORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.URIDetailsTypeImpl <em>URI Details Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.URIDetailsTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getURIDetailsType()
	 * @generated
	 */
	int URI_DETAILS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>URI Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DETAILS_TYPE__URI_DETAIL = 0;

	/**
	 * The number of structural features of the '<em>URI Details Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DETAILS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>URI Details Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DETAILS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.URIDetailTypeImpl <em>URI Detail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.URIDetailTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getURIDetailType()
	 * @generated
	 */
	int URI_DETAIL_TYPE = 37;

	/**
	 * The feature id for the '<em><b>URI Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DETAIL_TYPE__URI_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>URI Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DETAIL_TYPE__URI_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>URI Detail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DETAIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>URI Detail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DETAIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.UsageUnitAmountTypeImpl <em>Usage Unit Amount Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.UsageUnitAmountTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getUsageUnitAmountType()
	 * @generated
	 */
	int USAGE_UNIT_AMOUNT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_UNIT_AMOUNT_TYPE__VALUE = AMOUNT_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Currency Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_UNIT_AMOUNT_TYPE__CURRENCY_TEXT = AMOUNT_TYPE__CURRENCY_TEXT;

	/**
	 * The feature id for the '<em><b>Unit Measure Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT = AMOUNT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usage Unit Amount Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_UNIT_AMOUNT_TYPE_FEATURE_COUNT = AMOUNT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Usage Unit Amount Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_UNIT_AMOUNT_TYPE_OPERATION_COUNT = AMOUNT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl <em>Version Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getVersionInformationType()
	 * @generated
	 */
	int VERSION_INFORMATION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__MAJOR_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__MINOR_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Revision Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__REVISION_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__ACTIVATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Last Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__LAST_REVISION_DATE = 5;

	/**
	 * The feature id for the '<em><b>Next Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE = 6;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__EXPIRATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Lifecycle Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS = 8;

	/**
	 * The feature id for the '<em><b>Alerts And Notifications</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS = 9;

	/**
	 * The number of structural features of the '<em>Version Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Version Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Summary Text Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getSummaryTextType()
	 * @generated
	 */
	int SUMMARY_TEXT_TYPE = 40;


	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.AgreementType <em>Agreement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.AgreementType
	 * @generated
	 */
	EClass getAgreementType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementDescriptionText <em>Agreement Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementDescriptionText()
	 * @see #getAgreementType()
	 * @generated
	 */
	EAttribute getAgreementType_AgreementDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementURI <em>Agreement URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement URI</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.AgreementType#getAgreementURI()
	 * @see #getAgreementType()
	 * @generated
	 */
	EAttribute getAgreementType_AgreementURI();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.AmountType <em>Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.AmountType
	 * @generated
	 */
	EClass getAmountType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.AmountType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.AmountType#getValue()
	 * @see #getAmountType()
	 * @generated
	 */
	EAttribute getAmountType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.AmountType#getCurrencyText <em>Currency Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.AmountType#getCurrencyText()
	 * @see #getAmountType()
	 * @generated
	 */
	EAttribute getAmountType_CurrencyText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType <em>Applicable Agreements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicable Agreements Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType
	 * @generated
	 */
	EClass getApplicableAgreementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agreement</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableAgreementsType#getAgreement()
	 * @see #getApplicableAgreementsType()
	 * @generated
	 */
	EReference getApplicableAgreementsType_Agreement();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ApplicableContractsType <em>Applicable Contracts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicable Contracts Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableContractsType
	 * @generated
	 */
	EClass getApplicableContractsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ApplicableContractsType#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contract</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableContractsType#getContract()
	 * @see #getApplicableContractsType()
	 * @generated
	 */
	EReference getApplicableContractsType_Contract();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType <em>Applicable Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicable Policies Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType
	 * @generated
	 */
	EClass getApplicablePoliciesType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType#getPolicyText <em>Policy Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicablePoliciesType#getPolicyText()
	 * @see #getApplicablePoliciesType()
	 * @generated
	 */
	EAttribute getApplicablePoliciesType_PolicyText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType <em>Applicable Umbrella Agreements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicable Umbrella Agreements Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType
	 * @generated
	 */
	EClass getApplicableUmbrellaAgreementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType#getUmbrellaAgreement <em>Umbrella Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Umbrella Agreement</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ApplicableUmbrellaAgreementsType#getUmbrellaAgreement()
	 * @see #getApplicableUmbrellaAgreementsType()
	 * @generated
	 */
	EReference getApplicableUmbrellaAgreementsType_UmbrellaAgreement();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType <em>Business Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Context Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.BusinessContextType
	 * @generated
	 */
	EClass getBusinessContextType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Description</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.BusinessContextType#getDomainDescription()
	 * @see #getBusinessContextType()
	 * @generated
	 */
	EReference getBusinessContextType_DomainDescription();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getClassifications <em>Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifications</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.BusinessContextType#getClassifications()
	 * @see #getBusinessContextType()
	 * @generated
	 */
	EReference getBusinessContextType_Classifications();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getExchangePartnerTypes <em>Exchange Partner Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exchange Partner Types</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.BusinessContextType#getExchangePartnerTypes()
	 * @see #getBusinessContextType()
	 * @generated
	 */
	EReference getBusinessContextType_ExchangePartnerTypes();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getEndorsements <em>Endorsements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endorsements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.BusinessContextType#getEndorsements()
	 * @see #getBusinessContextType()
	 * @generated
	 */
	EReference getBusinessContextType_Endorsements();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.BusinessContextType#getSponsors <em>Sponsors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sponsors</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.BusinessContextType#getSponsors()
	 * @see #getBusinessContextType()
	 * @generated
	 */
	EReference getBusinessContextType_Sponsors();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ClassificationsType <em>Classifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifications Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ClassificationsType
	 * @generated
	 */
	EClass getClassificationsType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ClassificationsType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ClassificationsType#getClassification()
	 * @see #getClassificationsType()
	 * @generated
	 */
	EAttribute getClassificationsType_Classification();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.CostType
	 * @generated
	 */
	EClass getCostType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.CostType#getUsageCostAmount <em>Usage Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Cost Amount</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.CostType#getUsageCostAmount()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_UsageCostAmount();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.CostType#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Unit Cost Amount</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.CostType#getUsageUnitCostAmount()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_UsageUnitCostAmount();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.CostType#getCreationCostAmount <em>Creation Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Cost Amount</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.CostType#getCreationCostAmount()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_CreationCostAmount();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ActionName();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionPurpose <em>Action Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Purpose</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getActionPurpose()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ActionPurpose();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getActivationDate <em>Activation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getActivationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ActivationDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agreement</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementDescriptionText <em>Agreement Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AgreementDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementURI <em>Agreement URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement URI</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getAgreementURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AgreementURI();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getAlertsAndNotifications <em>Alerts And Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alerts And Notifications</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getAlertsAndNotifications()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AlertsAndNotifications();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableAgreements <em>Applicable Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Agreements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableAgreements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApplicableAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Agreements Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableAgreementsIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplicableAgreementsIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableContracts <em>Applicable Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Contracts</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableContracts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApplicableContracts();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Contracts Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableContractsIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplicableContractsIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicablePolicies <em>Applicable Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Policies</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicablePolicies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApplicablePolicies();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Policies Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicablePoliciesIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplicablePoliciesIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Umbrella Agreements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getApplicableUmbrellaAgreements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApplicableUmbrellaAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Umbrella Agreements Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#isApplicableUmbrellaAgreementsIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApplicableUmbrellaAgreementsIndicator();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Required Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#isApprovalRequiredIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ApprovalRequiredIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getBusinessContext <em>Business Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Context</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getBusinessContext()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessContext();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCapabilityDescriptionText <em>Capability Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getCapabilityDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CapabilityDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassifications <em>Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifications</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getClassifications()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Classifications();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonAddress <em>Contact Person Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Address</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactPersonAddress();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonEmailID <em>Contact Person Email ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Email ID</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonEmailID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactPersonEmailID();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonName <em>Contact Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactPersonName();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Phone Number ID</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getContactPersonPhoneNumberID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContactPersonPhoneNumberID();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contract</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getContract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Contract();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationCostAmount <em>Creation Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Cost Amount</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationCostAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreationCostAmount();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getCreationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Description</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DomainDescription();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainNameText <em>Domain Name Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getDomainNameText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DomainNameText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorsements <em>Endorsements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endorsements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorsements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Endorsements();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorser <em>Endorser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endorser</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getEndorser()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Endorser();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Partner Type Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypeDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExchangePartnerTypeDescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypes <em>Exchange Partner Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exchange Partner Types</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getExchangePartnerTypes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExchangePartnerTypes();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getExpirationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDName <em>IEPD Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IEPD Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IEPDName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReference <em>IEPD Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IEPD Reference</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IEPDReference();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReferences <em>IEPD References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IEPD References</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDReferences()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IEPDReferences();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDURL <em>IEPDURL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IEPDURL</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getIEPDURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IEPDURL();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLastRevisionDate <em>Last Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Revision Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getLastRevisionDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LastRevisionDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLicensingAgreement <em>Licensing Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licensing Agreement</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getLicensingAgreement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LicensingAgreement();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licensing Required Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#isLicensingRequiredIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LicensingRequiredIndicator();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getLifecycleStatus <em>Lifecycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle Status</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getLifecycleStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LifecycleStatus();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMajorVersion <em>Major Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getMajorVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MajorVersion();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMessageExchangePattern <em>Message Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange Pattern</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getMessageExchangePattern()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MessageExchangePattern();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getMinorVersion <em>Minor Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getMinorVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinorVersion();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getNextRevisionDate <em>Next Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Revision Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getNextRevisionDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NextRevisionDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Organization();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationAcronym <em>Organization Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Acronym</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationAcronym()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrganizationAcronym();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationFullAddressText <em>Organization Full Address Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Full Address Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationFullAddressText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrganizationFullAddressText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationName <em>Organization Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrganizationName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Point Of Contact</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationPointOfContact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganizationPointOfContact();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Role Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrganizationRoleDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Role Detailed Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationRoleDetailedDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrganizationRoleDetailedDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Web Site URL</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getOrganizationWebSiteURL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrganizationWebSiteURL();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getPerformanceMetrics <em>Performance Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance Metrics</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getPerformanceMetrics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PerformanceMetrics();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getPolicyText <em>Policy Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getPolicyText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PolicyText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRealWorldEffectDescriptionText <em>Real World Effect Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real World Effect Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getRealWorldEffectDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RealWorldEffectDescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRelatedOrganizationInformation <em>Related Organization Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Organization Information</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getRelatedOrganizationInformation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelatedOrganizationInformation();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getRevisionVersion <em>Revision Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getRevisionVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RevisionVersion();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityClassificationText <em>Security Classification Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Classification Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityClassificationText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SecurityClassificationText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityDescriptionText <em>Security Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getSecurityDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SecurityDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Implemented Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#isSecurityImplementedIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SecurityImplementedIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAction <em>Service Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Action</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceAction();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceActions <em>Service Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Actions</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceActions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceActions();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAvailability <em>Service Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Availability</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAvailability()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceAvailability();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAverageThroughput <em>Service Average Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Average Throughput</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceAverageThroughput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceAverageThroughput();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceCapabilities <em>Service Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Capabilities</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Dependencies</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependencies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Dependency</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDependency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceDependency();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Description</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceDescription();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywords <em>Service Description Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Description Keywords</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywords()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceDescriptionKeywords();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Keyword Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionKeywordText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceDescriptionKeywordText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Summary Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionSummaryText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceDescriptionSummaryText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionText <em>Service Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceFullNameText <em>Service Full Name Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Full Name Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceFullNameText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceFullNameText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceID();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceIdentification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfile <em>Service Interaction Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Interaction Profile</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceInteractionProfile();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfiles <em>Service Interaction Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Interaction Profiles</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInteractionProfiles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceInteractionProfiles();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Interface</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceInterface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceInterface();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceLevelAgreements <em>Service Level Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Level Agreements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceLevelAgreements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceLevelAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Maximum Throughput</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMaximumThroughput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceMaximumThroughput();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMetadata <em>Service Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Metadata</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceMetadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name Abbreviation Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceNameAbbreviationText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceNameAbbreviationText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Policy And Contracts</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePolicyAndContracts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServicePolicyAndContracts();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePurposeText <em>Service Purpose Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Purpose Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServicePurposeText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServicePurposeText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceRealWorldEffects <em>Service Real World Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Real World Effects</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceRealWorldEffects()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceRealWorldEffects();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceResponseTime <em>Service Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Response Time</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceResponseTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Scope Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceScopeDescriptionText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceScopeDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceURI <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URI</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceURI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ServiceURI();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceUsageDetails <em>Service Usage Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Usage Details</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getServiceUsageDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceUsageDetails();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPName <em>SIP Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIP Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SIPName();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPVersion <em>SIP Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIP Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getSIPVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SIPVersion();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsor <em>Sponsor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sponsor</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Sponsor();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsors <em>Sponsors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sponsors</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getSponsors()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sponsors();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUmbrellaAgreement <em>Umbrella Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Umbrella Agreement</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getUmbrellaAgreement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UmbrellaAgreement();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIAddress <em>URI Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI Address</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_URIAddress();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDescription <em>URI Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI Description</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_URIDescription();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetail <em>URI Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>URI Detail</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_URIDetail();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetails <em>URI Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>URI Details</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getURIDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_URIDetails();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageCostAmount <em>Usage Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Cost Amount</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageCostAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UsageCostAmount();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageUnitCostAmount <em>Usage Unit Cost Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Unit Cost Amount</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getUsageUnitCostAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UsageUnitCostAmount();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getVersionInformation <em>Version Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Information</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getVersionInformation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_VersionInformation();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getCurrencyText <em>Currency Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getCurrencyText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrencyText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DocumentRoot#getUnitMeasureText <em>Unit Measure Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Measure Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DocumentRoot#getUnitMeasureText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnitMeasureText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.DomainDescriptionType <em>Domain Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Description Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DomainDescriptionType
	 * @generated
	 */
	EClass getDomainDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.DomainDescriptionType#getDomainNameText <em>Domain Name Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.DomainDescriptionType#getDomainNameText()
	 * @see #getDomainDescriptionType()
	 * @generated
	 */
	EAttribute getDomainDescriptionType_DomainNameText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.EndorsementsType <em>Endorsements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endorsements Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.EndorsementsType
	 * @generated
	 */
	EClass getEndorsementsType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.EndorsementsType#getEndorser <em>Endorser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endorser</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.EndorsementsType#getEndorser()
	 * @see #getEndorsementsType()
	 * @generated
	 */
	EAttribute getEndorsementsType_Endorser();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.EntityType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.EntityType#getOrganization()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.EntityType#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.EntityType#getPerson()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Person();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType <em>Exchange Partner Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Partner Types Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType
	 * @generated
	 */
	EClass getExchangePartnerTypesType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType#getExchangePartnerTypeDescriptionText <em>Exchange Partner Type Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Partner Type Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ExchangePartnerTypesType#getExchangePartnerTypeDescriptionText()
	 * @see #getExchangePartnerTypesType()
	 * @generated
	 */
	EAttribute getExchangePartnerTypesType_ExchangePartnerTypeDescriptionText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.IEPDReferencesType <em>IEPD References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEPD References Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.IEPDReferencesType
	 * @generated
	 */
	EClass getIEPDReferencesType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.IEPDReferencesType#getIEPDReference <em>IEPD Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IEPD Reference</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.IEPDReferencesType#getIEPDReference()
	 * @see #getIEPDReferencesType()
	 * @generated
	 */
	EReference getIEPDReferencesType_IEPDReference();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.IEPDReferenceType <em>IEPD Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEPD Reference Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.IEPDReferenceType
	 * @generated
	 */
	EClass getIEPDReferenceType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.IEPDReferenceType#getIEPDName <em>IEPD Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>IEPD Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.IEPDReferenceType#getIEPDName()
	 * @see #getIEPDReferenceType()
	 * @generated
	 */
	EAttribute getIEPDReferenceType_IEPDName();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.IEPDReferenceType#getIEPDURL <em>IEPDURL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>IEPDURL</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.IEPDReferenceType#getIEPDURL()
	 * @see #getIEPDReferenceType()
	 * @generated
	 */
	EAttribute getIEPDReferenceType_IEPDURL();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType
	 * @generated
	 */
	EClass getOrganizationType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationName <em>Organization Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationName()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_OrganizationName();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationAcronym <em>Organization Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Acronym</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationAcronym()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_OrganizationAcronym();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationFullAddressText <em>Organization Full Address Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Full Address Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationFullAddressText()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_OrganizationFullAddressText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationWebSiteURL <em>Organization Web Site URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Web Site URL</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationWebSiteURL()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_OrganizationWebSiteURL();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDescriptionText <em>Organization Role Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Role Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDescriptionText()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_OrganizationRoleDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDetailedDescriptionText <em>Organization Role Detailed Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Role Detailed Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationRoleDetailedDescriptionText()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_OrganizationRoleDetailedDescriptionText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationPointOfContact <em>Organization Point Of Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Point Of Contact</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.OrganizationType#getOrganizationPointOfContact()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_OrganizationPointOfContact();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType <em>Performance Metrics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Metrics Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PerformanceMetricsType
	 * @generated
	 */
	EClass getPerformanceMetricsType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceResponseTime <em>Service Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Response Time</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceResponseTime()
	 * @see #getPerformanceMetricsType()
	 * @generated
	 */
	EAttribute getPerformanceMetricsType_ServiceResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAverageThroughput <em>Service Average Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Average Throughput</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAverageThroughput()
	 * @see #getPerformanceMetricsType()
	 * @generated
	 */
	EAttribute getPerformanceMetricsType_ServiceAverageThroughput();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceMaximumThroughput <em>Service Maximum Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Maximum Throughput</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceMaximumThroughput()
	 * @see #getPerformanceMetricsType()
	 * @generated
	 */
	EAttribute getPerformanceMetricsType_ServiceMaximumThroughput();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAvailability <em>Service Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Availability</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PerformanceMetricsType#getServiceAvailability()
	 * @see #getPerformanceMetricsType()
	 * @generated
	 */
	EAttribute getPerformanceMetricsType_ServiceAvailability();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType <em>Person Contact Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Contact Information Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PersonContactInformationType
	 * @generated
	 */
	EClass getPersonContactInformationType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonName <em>Contact Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonName()
	 * @see #getPersonContactInformationType()
	 * @generated
	 */
	EAttribute getPersonContactInformationType_ContactPersonName();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonEmailID <em>Contact Person Email ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Email ID</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonEmailID()
	 * @see #getPersonContactInformationType()
	 * @generated
	 */
	EAttribute getPersonContactInformationType_ContactPersonEmailID();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonPhoneNumberID <em>Contact Person Phone Number ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Phone Number ID</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonPhoneNumberID()
	 * @see #getPersonContactInformationType()
	 * @generated
	 */
	EAttribute getPersonContactInformationType_ContactPersonPhoneNumberID();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonAddress <em>Contact Person Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Person Address</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.PersonContactInformationType#getContactPersonAddress()
	 * @see #getPersonContactInformationType()
	 * @generated
	 */
	EAttribute getPersonContactInformationType_ContactPersonAddress();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType <em>Related Organization Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Organization Information Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType
	 * @generated
	 */
	EClass getRelatedOrganizationInformationType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.RelatedOrganizationInformationType#getOrganization()
	 * @see #getRelatedOrganizationInformationType()
	 * @generated
	 */
	EReference getRelatedOrganizationInformationType_Organization();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceActionsType <em>Service Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Actions Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionsType
	 * @generated
	 */
	EClass getServiceActionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceActionsType#getServiceAction <em>Service Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Action</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionsType#getServiceAction()
	 * @see #getServiceActionsType()
	 * @generated
	 */
	EReference getServiceActionsType_ServiceAction();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType <em>Service Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Action Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionType
	 * @generated
	 */
	EClass getServiceActionType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionName()
	 * @see #getServiceActionType()
	 * @generated
	 */
	EAttribute getServiceActionType_ActionName();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionPurpose <em>Action Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Purpose</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionType#getActionPurpose()
	 * @see #getServiceActionType()
	 * @generated
	 */
	EAttribute getServiceActionType_ActionPurpose();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceActionType#getMessageExchangePattern <em>Message Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange Pattern</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceActionType#getMessageExchangePattern()
	 * @see #getServiceActionType()
	 * @generated
	 */
	EAttribute getServiceActionType_MessageExchangePattern();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType <em>Service Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Capabilities Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType
	 * @generated
	 */
	EClass getServiceCapabilitiesType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType#getCapabilityDescriptionText <em>Capability Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Capability Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceCapabilitiesType#getCapabilityDescriptionText()
	 * @see #getServiceCapabilitiesType()
	 * @generated
	 */
	EAttribute getServiceCapabilitiesType_CapabilityDescriptionText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceDependenciesType <em>Service Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Dependencies Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDependenciesType
	 * @generated
	 */
	EClass getServiceDependenciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceDependenciesType#getServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Dependency</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDependenciesType#getServiceDependency()
	 * @see #getServiceDependenciesType()
	 * @generated
	 */
	EReference getServiceDependenciesType_ServiceDependency();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType <em>Service Description Keywords Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description Keywords Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType
	 * @generated
	 */
	EClass getServiceDescriptionKeywordsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType#getServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Dependency</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionKeywordsType#getServiceDependency()
	 * @see #getServiceDescriptionKeywordsType()
	 * @generated
	 */
	EReference getServiceDescriptionKeywordsType_ServiceDependency();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType <em>Service Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType
	 * @generated
	 */
	EClass getServiceDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServicePurposeText <em>Service Purpose Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Purpose Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServicePurposeText()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_ServicePurposeText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceScopeDescriptionText <em>Service Scope Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Scope Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceScopeDescriptionText()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_ServiceScopeDescriptionText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionSummaryText <em>Service Description Summary Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Summary Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionSummaryText()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_ServiceDescriptionSummaryText();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionText <em>Service Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionText()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_ServiceDescriptionText();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionKeywordText <em>Service Description Keyword Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Description Keyword Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDescriptionKeywordText()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_ServiceDescriptionKeywordText();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceCapabilities <em>Service Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Capabilities</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceCapabilities()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EReference getServiceDescriptionType_ServiceCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceRealWorldEffects <em>Service Real World Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Real World Effects</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceRealWorldEffects()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EReference getServiceDescriptionType_ServiceRealWorldEffects();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getSecurityClassificationText <em>Security Classification Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Classification Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getSecurityClassificationText()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_SecurityClassificationText();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getAny()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EAttribute getServiceDescriptionType_Any();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Dependencies</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getServiceDependencies()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EReference getServiceDescriptionType_ServiceDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getIEPDReferences <em>IEPD References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IEPD References</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceDescriptionType#getIEPDReferences()
	 * @see #getServiceDescriptionType()
	 * @generated
	 */
	EReference getServiceDescriptionType_IEPDReferences();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType <em>Service Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Identification Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceIdentificationType
	 * @generated
	 */
	EClass getServiceIdentificationType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceFullNameText <em>Service Full Name Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Full Name Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceFullNameText()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EAttribute getServiceIdentificationType_ServiceFullNameText();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service ID</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceID()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EAttribute getServiceIdentificationType_ServiceID();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceURI <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service URI</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceURI()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EAttribute getServiceIdentificationType_ServiceURI();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceNameAbbreviationText <em>Service Name Abbreviation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Name Abbreviation Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceIdentificationType#getServiceNameAbbreviationText()
	 * @see #getServiceIdentificationType()
	 * @generated
	 */
	EAttribute getServiceIdentificationType_ServiceNameAbbreviationText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType <em>Service Interaction Profiles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interaction Profiles Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType
	 * @generated
	 */
	EClass getServiceInteractionProfilesType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType#getServiceInteractionProfile <em>Service Interaction Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Interaction Profile</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInteractionProfilesType#getServiceInteractionProfile()
	 * @see #getServiceInteractionProfilesType()
	 * @generated
	 */
	EReference getServiceInteractionProfilesType_ServiceInteractionProfile();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType <em>Service Interaction Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interaction Profile Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType
	 * @generated
	 */
	EClass getServiceInteractionProfileType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPName <em>SIP Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIP Name</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPName()
	 * @see #getServiceInteractionProfileType()
	 * @generated
	 */
	EAttribute getServiceInteractionProfileType_SIPName();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPVersion <em>SIP Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIP Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInteractionProfileType#getSIPVersion()
	 * @see #getServiceInteractionProfileType()
	 * @generated
	 */
	EAttribute getServiceInteractionProfileType_SIPVersion();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType <em>Service Interface Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface Specification Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType
	 * @generated
	 */
	EClass getServiceInterfaceSpecificationType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getURIDetails <em>URI Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>URI Details</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getURIDetails()
	 * @see #getServiceInterfaceSpecificationType()
	 * @generated
	 */
	EReference getServiceInterfaceSpecificationType_URIDetails();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getServiceActions <em>Service Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Actions</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getServiceActions()
	 * @see #getServiceInterfaceSpecificationType()
	 * @generated
	 */
	EReference getServiceInterfaceSpecificationType_ServiceActions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getServiceInteractionProfiles <em>Service Interaction Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Interaction Profiles</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getServiceInteractionProfiles()
	 * @see #getServiceInterfaceSpecificationType()
	 * @generated
	 */
	EReference getServiceInterfaceSpecificationType_ServiceInteractionProfiles();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#isSecurityImplementedIndicator <em>Security Implemented Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Implemented Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#isSecurityImplementedIndicator()
	 * @see #getServiceInterfaceSpecificationType()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecificationType_SecurityImplementedIndicator();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getSecurityDescriptionText <em>Security Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceInterfaceSpecificationType#getSecurityDescriptionText()
	 * @see #getServiceInterfaceSpecificationType()
	 * @generated
	 */
	EAttribute getServiceInterfaceSpecificationType_SecurityDescriptionText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType <em>Service Level Agreements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Agreements Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType
	 * @generated
	 */
	EClass getServiceLevelAgreementsType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServicePolicyAndContracts <em>Service Policy And Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Policy And Contracts</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServicePolicyAndContracts()
	 * @see #getServiceLevelAgreementsType()
	 * @generated
	 */
	EReference getServiceLevelAgreementsType_ServicePolicyAndContracts();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getPerformanceMetrics <em>Performance Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance Metrics</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getPerformanceMetrics()
	 * @see #getServiceLevelAgreementsType()
	 * @generated
	 */
	EReference getServiceLevelAgreementsType_PerformanceMetrics();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServiceUsageDetails <em>Service Usage Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Usage Details</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceLevelAgreementsType#getServiceUsageDetails()
	 * @see #getServiceLevelAgreementsType()
	 * @generated
	 */
	EReference getServiceLevelAgreementsType_ServiceUsageDetails();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType <em>Service Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Metadata Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType
	 * @generated
	 */
	EClass getServiceMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceIdentification <em>Service Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Identification</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceIdentification()
	 * @see #getServiceMetadataType()
	 * @generated
	 */
	EReference getServiceMetadataType_ServiceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Description</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceDescription()
	 * @see #getServiceMetadataType()
	 * @generated
	 */
	EReference getServiceMetadataType_ServiceDescription();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getVersionInformation <em>Version Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Information</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getVersionInformation()
	 * @see #getServiceMetadataType()
	 * @generated
	 */
	EReference getServiceMetadataType_VersionInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getRelatedOrganizationInformation <em>Related Organization Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Organization Information</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getRelatedOrganizationInformation()
	 * @see #getServiceMetadataType()
	 * @generated
	 */
	EReference getServiceMetadataType_RelatedOrganizationInformation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getBusinessContext <em>Business Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Context</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getBusinessContext()
	 * @see #getServiceMetadataType()
	 * @generated
	 */
	EReference getServiceMetadataType_BusinessContext();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Interface</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceInterface()
	 * @see #getServiceMetadataType()
	 * @generated
	 */
	EReference getServiceMetadataType_ServiceInterface();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceLevelAgreements <em>Service Level Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Level Agreements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceMetadataType#getServiceLevelAgreements()
	 * @see #getServiceMetadataType()
	 * @generated
	 */
	EReference getServiceMetadataType_ServiceLevelAgreements();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType <em>Service Policy And Contracts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Policy And Contracts Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType
	 * @generated
	 */
	EClass getServicePolicyAndContractsType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicablePoliciesIndicator <em>Applicable Policies Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Policies Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicablePoliciesIndicator()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EAttribute getServicePolicyAndContractsType_ApplicablePoliciesIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicablePolicies <em>Applicable Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Policies</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicablePolicies()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EReference getServicePolicyAndContractsType_ApplicablePolicies();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableContractsIndicator <em>Applicable Contracts Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Contracts Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableContractsIndicator()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EAttribute getServicePolicyAndContractsType_ApplicableContractsIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableContracts <em>Applicable Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Contracts</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableContracts()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EReference getServicePolicyAndContractsType_ApplicableContracts();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableAgreementsIndicator <em>Applicable Agreements Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Agreements Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableAgreementsIndicator()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EAttribute getServicePolicyAndContractsType_ApplicableAgreementsIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableAgreements <em>Applicable Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Agreements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableAgreements()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EReference getServicePolicyAndContractsType_ApplicableAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableUmbrellaAgreementsIndicator <em>Applicable Umbrella Agreements Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable Umbrella Agreements Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#isApplicableUmbrellaAgreementsIndicator()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EAttribute getServicePolicyAndContractsType_ApplicableUmbrellaAgreementsIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableUmbrellaAgreements <em>Applicable Umbrella Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Umbrella Agreements</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServicePolicyAndContractsType#getApplicableUmbrellaAgreements()
	 * @see #getServicePolicyAndContractsType()
	 * @generated
	 */
	EReference getServicePolicyAndContractsType_ApplicableUmbrellaAgreements();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType <em>Service Real World Effects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Real World Effects Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType
	 * @generated
	 */
	EClass getServiceRealWorldEffectsType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType#getRealWorldEffectDescriptionText <em>Real World Effect Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Real World Effect Description Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceRealWorldEffectsType#getRealWorldEffectDescriptionText()
	 * @see #getServiceRealWorldEffectsType()
	 * @generated
	 */
	EAttribute getServiceRealWorldEffectsType_RealWorldEffectDescriptionText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType <em>Service Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Usage Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceUsageType
	 * @generated
	 */
	EClass getServiceUsageType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isApprovalRequiredIndicator <em>Approval Required Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Required Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceUsageType#isApprovalRequiredIndicator()
	 * @see #getServiceUsageType()
	 * @generated
	 */
	EAttribute getServiceUsageType_ApprovalRequiredIndicator();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#isLicensingRequiredIndicator <em>Licensing Required Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licensing Required Indicator</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceUsageType#isLicensingRequiredIndicator()
	 * @see #getServiceUsageType()
	 * @generated
	 */
	EAttribute getServiceUsageType_LicensingRequiredIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#getLicensingAgreement <em>Licensing Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Licensing Agreement</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceUsageType#getLicensingAgreement()
	 * @see #getServiceUsageType()
	 * @generated
	 */
	EReference getServiceUsageType_LicensingAgreement();

	/**
	 * Returns the meta object for the containment reference '{@link gov.ojp.it.gsp.services._1._0.ServiceUsageType#getServiceCost <em>Service Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Cost</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.ServiceUsageType#getServiceCost()
	 * @see #getServiceUsageType()
	 * @generated
	 */
	EReference getServiceUsageType_ServiceCost();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.SponsorsType <em>Sponsors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sponsors Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.SponsorsType
	 * @generated
	 */
	EClass getSponsorsType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.SponsorsType#getSponsor <em>Sponsor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sponsor</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.SponsorsType#getSponsor()
	 * @see #getSponsorsType()
	 * @generated
	 */
	EAttribute getSponsorsType_Sponsor();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.URIDetailsType <em>URI Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URI Details Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.URIDetailsType
	 * @generated
	 */
	EClass getURIDetailsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.ojp.it.gsp.services._1._0.URIDetailsType#getURIDetail <em>URI Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>URI Detail</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.URIDetailsType#getURIDetail()
	 * @see #getURIDetailsType()
	 * @generated
	 */
	EReference getURIDetailsType_URIDetail();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.URIDetailType <em>URI Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URI Detail Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.URIDetailType
	 * @generated
	 */
	EClass getURIDetailType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.URIDetailType#getURIAddress <em>URI Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI Address</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.URIDetailType#getURIAddress()
	 * @see #getURIDetailType()
	 * @generated
	 */
	EAttribute getURIDetailType_URIAddress();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.URIDetailType#getURIDescription <em>URI Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI Description</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.URIDetailType#getURIDescription()
	 * @see #getURIDetailType()
	 * @generated
	 */
	EAttribute getURIDetailType_URIDescription();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.UsageUnitAmountType <em>Usage Unit Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Unit Amount Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.UsageUnitAmountType
	 * @generated
	 */
	EClass getUsageUnitAmountType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.UsageUnitAmountType#getUnitMeasureText <em>Unit Measure Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Measure Text</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.UsageUnitAmountType#getUnitMeasureText()
	 * @see #getUsageUnitAmountType()
	 * @generated
	 */
	EAttribute getUsageUnitAmountType_UnitMeasureText();

	/**
	 * Returns the meta object for class '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType <em>Version Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Information Type</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType
	 * @generated
	 */
	EClass getVersionInformationType();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getMajorVersion <em>Major Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getMajorVersion()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_MajorVersion();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getMinorVersion <em>Minor Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getMinorVersion()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_MinorVersion();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getRevisionVersion <em>Revision Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Version</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getRevisionVersion()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_RevisionVersion();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getCreationDate()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getActivationDate <em>Activation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getActivationDate()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_ActivationDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getLastRevisionDate <em>Last Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Revision Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getLastRevisionDate()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_LastRevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getNextRevisionDate <em>Next Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Revision Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getNextRevisionDate()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_NextRevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getExpirationDate()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getLifecycleStatus <em>Lifecycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle Status</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getLifecycleStatus()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_LifecycleStatus();

	/**
	 * Returns the meta object for the attribute list '{@link gov.ojp.it.gsp.services._1._0.VersionInformationType#getAlertsAndNotifications <em>Alerts And Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alerts And Notifications</em>'.
	 * @see gov.ojp.it.gsp.services._1._0.VersionInformationType#getAlertsAndNotifications()
	 * @see #getVersionInformationType()
	 * @generated
	 */
	EAttribute getVersionInformationType_AlertsAndNotifications();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Summary Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Summary Text Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SummaryTextType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='160'"
	 * @generated
	 */
	EDataType getSummaryTextType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	graFactory getgraFactory();

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
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.AgreementTypeImpl <em>Agreement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.AgreementTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getAgreementType()
		 * @generated
		 */
		EClass AGREEMENT_TYPE = eINSTANCE.getAgreementType();

		/**
		 * The meta object literal for the '<em><b>Agreement Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TYPE__AGREEMENT_DESCRIPTION_TEXT = eINSTANCE.getAgreementType_AgreementDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Agreement URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TYPE__AGREEMENT_URI = eINSTANCE.getAgreementType_AgreementURI();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.AmountTypeImpl <em>Amount Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.AmountTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getAmountType()
		 * @generated
		 */
		EClass AMOUNT_TYPE = eINSTANCE.getAmountType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT_TYPE__VALUE = eINSTANCE.getAmountType_Value();

		/**
		 * The meta object literal for the '<em><b>Currency Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT_TYPE__CURRENCY_TEXT = eINSTANCE.getAmountType_CurrencyText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicableAgreementsTypeImpl <em>Applicable Agreements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicableAgreementsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicableAgreementsType()
		 * @generated
		 */
		EClass APPLICABLE_AGREEMENTS_TYPE = eINSTANCE.getApplicableAgreementsType();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICABLE_AGREEMENTS_TYPE__AGREEMENT = eINSTANCE.getApplicableAgreementsType_Agreement();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicableContractsTypeImpl <em>Applicable Contracts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicableContractsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicableContractsType()
		 * @generated
		 */
		EClass APPLICABLE_CONTRACTS_TYPE = eINSTANCE.getApplicableContractsType();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICABLE_CONTRACTS_TYPE__CONTRACT = eINSTANCE.getApplicableContractsType_Contract();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicablePoliciesTypeImpl <em>Applicable Policies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicablePoliciesTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicablePoliciesType()
		 * @generated
		 */
		EClass APPLICABLE_POLICIES_TYPE = eINSTANCE.getApplicablePoliciesType();

		/**
		 * The meta object literal for the '<em><b>Policy Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICABLE_POLICIES_TYPE__POLICY_TEXT = eINSTANCE.getApplicablePoliciesType_PolicyText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ApplicableUmbrellaAgreementsTypeImpl <em>Applicable Umbrella Agreements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ApplicableUmbrellaAgreementsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getApplicableUmbrellaAgreementsType()
		 * @generated
		 */
		EClass APPLICABLE_UMBRELLA_AGREEMENTS_TYPE = eINSTANCE.getApplicableUmbrellaAgreementsType();

		/**
		 * The meta object literal for the '<em><b>Umbrella Agreement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICABLE_UMBRELLA_AGREEMENTS_TYPE__UMBRELLA_AGREEMENT = eINSTANCE.getApplicableUmbrellaAgreementsType_UmbrellaAgreement();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl <em>Business Context Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.BusinessContextTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getBusinessContextType()
		 * @generated
		 */
		EClass BUSINESS_CONTEXT_TYPE = eINSTANCE.getBusinessContextType();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONTEXT_TYPE__DOMAIN_DESCRIPTION = eINSTANCE.getBusinessContextType_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Classifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONTEXT_TYPE__CLASSIFICATIONS = eINSTANCE.getBusinessContextType_Classifications();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONTEXT_TYPE__EXCHANGE_PARTNER_TYPES = eINSTANCE.getBusinessContextType_ExchangePartnerTypes();

		/**
		 * The meta object literal for the '<em><b>Endorsements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONTEXT_TYPE__ENDORSEMENTS = eINSTANCE.getBusinessContextType_Endorsements();

		/**
		 * The meta object literal for the '<em><b>Sponsors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONTEXT_TYPE__SPONSORS = eINSTANCE.getBusinessContextType_Sponsors();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ClassificationsTypeImpl <em>Classifications Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ClassificationsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getClassificationsType()
		 * @generated
		 */
		EClass CLASSIFICATIONS_TYPE = eINSTANCE.getClassificationsType();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATIONS_TYPE__CLASSIFICATION = eINSTANCE.getClassificationsType_Classification();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.CostTypeImpl <em>Cost Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.CostTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getCostType()
		 * @generated
		 */
		EClass COST_TYPE = eINSTANCE.getCostType();

		/**
		 * The meta object literal for the '<em><b>Usage Cost Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__USAGE_COST_AMOUNT = eINSTANCE.getCostType_UsageCostAmount();

		/**
		 * The meta object literal for the '<em><b>Usage Unit Cost Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__USAGE_UNIT_COST_AMOUNT = eINSTANCE.getCostType_UsageUnitCostAmount();

		/**
		 * The meta object literal for the '<em><b>Creation Cost Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__CREATION_COST_AMOUNT = eINSTANCE.getCostType_CreationCostAmount();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.DocumentRootImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACTION_NAME = eINSTANCE.getDocumentRoot_ActionName();

		/**
		 * The meta object literal for the '<em><b>Action Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACTION_PURPOSE = eINSTANCE.getDocumentRoot_ActionPurpose();

		/**
		 * The meta object literal for the '<em><b>Activation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACTIVATION_DATE = eINSTANCE.getDocumentRoot_ActivationDate();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AGREEMENT = eINSTANCE.getDocumentRoot_Agreement();

		/**
		 * The meta object literal for the '<em><b>Agreement Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AGREEMENT_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_AgreementDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Agreement URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AGREEMENT_URI = eINSTANCE.getDocumentRoot_AgreementURI();

		/**
		 * The meta object literal for the '<em><b>Alerts And Notifications</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ALERTS_AND_NOTIFICATIONS = eINSTANCE.getDocumentRoot_AlertsAndNotifications();

		/**
		 * The meta object literal for the '<em><b>Applicable Agreements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICABLE_AGREEMENTS = eINSTANCE.getDocumentRoot_ApplicableAgreements();

		/**
		 * The meta object literal for the '<em><b>Applicable Agreements Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__APPLICABLE_AGREEMENTS_INDICATOR = eINSTANCE.getDocumentRoot_ApplicableAgreementsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Contracts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICABLE_CONTRACTS = eINSTANCE.getDocumentRoot_ApplicableContracts();

		/**
		 * The meta object literal for the '<em><b>Applicable Contracts Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__APPLICABLE_CONTRACTS_INDICATOR = eINSTANCE.getDocumentRoot_ApplicableContractsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICABLE_POLICIES = eINSTANCE.getDocumentRoot_ApplicablePolicies();

		/**
		 * The meta object literal for the '<em><b>Applicable Policies Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__APPLICABLE_POLICIES_INDICATOR = eINSTANCE.getDocumentRoot_ApplicablePoliciesIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Umbrella Agreements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS = eINSTANCE.getDocumentRoot_ApplicableUmbrellaAgreements();

		/**
		 * The meta object literal for the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR = eINSTANCE.getDocumentRoot_ApplicableUmbrellaAgreementsIndicator();

		/**
		 * The meta object literal for the '<em><b>Approval Required Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__APPROVAL_REQUIRED_INDICATOR = eINSTANCE.getDocumentRoot_ApprovalRequiredIndicator();

		/**
		 * The meta object literal for the '<em><b>Business Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUSINESS_CONTEXT = eINSTANCE.getDocumentRoot_BusinessContext();

		/**
		 * The meta object literal for the '<em><b>Capability Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CAPABILITY_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_CapabilityDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CLASSIFICATION = eINSTANCE.getDocumentRoot_Classification();

		/**
		 * The meta object literal for the '<em><b>Classifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFICATIONS = eINSTANCE.getDocumentRoot_Classifications();

		/**
		 * The meta object literal for the '<em><b>Contact Person Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_PERSON_ADDRESS = eINSTANCE.getDocumentRoot_ContactPersonAddress();

		/**
		 * The meta object literal for the '<em><b>Contact Person Email ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_PERSON_EMAIL_ID = eINSTANCE.getDocumentRoot_ContactPersonEmailID();

		/**
		 * The meta object literal for the '<em><b>Contact Person Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_PERSON_NAME = eINSTANCE.getDocumentRoot_ContactPersonName();

		/**
		 * The meta object literal for the '<em><b>Contact Person Phone Number ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT_PERSON_PHONE_NUMBER_ID = eINSTANCE.getDocumentRoot_ContactPersonPhoneNumberID();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTRACT = eINSTANCE.getDocumentRoot_Contract();

		/**
		 * The meta object literal for the '<em><b>Creation Cost Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATION_COST_AMOUNT = eINSTANCE.getDocumentRoot_CreationCostAmount();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CREATION_DATE = eINSTANCE.getDocumentRoot_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOMAIN_DESCRIPTION = eINSTANCE.getDocumentRoot_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Domain Name Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DOMAIN_NAME_TEXT = eINSTANCE.getDocumentRoot_DomainNameText();

		/**
		 * The meta object literal for the '<em><b>Endorsements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDORSEMENTS = eINSTANCE.getDocumentRoot_Endorsements();

		/**
		 * The meta object literal for the '<em><b>Endorser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENDORSER = eINSTANCE.getDocumentRoot_Endorser();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner Type Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_ExchangePartnerTypeDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCHANGE_PARTNER_TYPES = eINSTANCE.getDocumentRoot_ExchangePartnerTypes();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EXPIRATION_DATE = eINSTANCE.getDocumentRoot_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>IEPD Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IEPD_NAME = eINSTANCE.getDocumentRoot_IEPDName();

		/**
		 * The meta object literal for the '<em><b>IEPD Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IEPD_REFERENCE = eINSTANCE.getDocumentRoot_IEPDReference();

		/**
		 * The meta object literal for the '<em><b>IEPD References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IEPD_REFERENCES = eINSTANCE.getDocumentRoot_IEPDReferences();

		/**
		 * The meta object literal for the '<em><b>IEPDURL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IEPDURL = eINSTANCE.getDocumentRoot_IEPDURL();

		/**
		 * The meta object literal for the '<em><b>Last Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LAST_REVISION_DATE = eINSTANCE.getDocumentRoot_LastRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Licensing Agreement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LICENSING_AGREEMENT = eINSTANCE.getDocumentRoot_LicensingAgreement();

		/**
		 * The meta object literal for the '<em><b>Licensing Required Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LICENSING_REQUIRED_INDICATOR = eINSTANCE.getDocumentRoot_LicensingRequiredIndicator();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LIFECYCLE_STATUS = eINSTANCE.getDocumentRoot_LifecycleStatus();

		/**
		 * The meta object literal for the '<em><b>Major Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAJOR_VERSION = eINSTANCE.getDocumentRoot_MajorVersion();

		/**
		 * The meta object literal for the '<em><b>Message Exchange Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MESSAGE_EXCHANGE_PATTERN = eINSTANCE.getDocumentRoot_MessageExchangePattern();

		/**
		 * The meta object literal for the '<em><b>Minor Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MINOR_VERSION = eINSTANCE.getDocumentRoot_MinorVersion();

		/**
		 * The meta object literal for the '<em><b>Next Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NEXT_REVISION_DATE = eINSTANCE.getDocumentRoot_NextRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION = eINSTANCE.getDocumentRoot_Organization();

		/**
		 * The meta object literal for the '<em><b>Organization Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANIZATION_ACRONYM = eINSTANCE.getDocumentRoot_OrganizationAcronym();

		/**
		 * The meta object literal for the '<em><b>Organization Full Address Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANIZATION_FULL_ADDRESS_TEXT = eINSTANCE.getDocumentRoot_OrganizationFullAddressText();

		/**
		 * The meta object literal for the '<em><b>Organization Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANIZATION_NAME = eINSTANCE.getDocumentRoot_OrganizationName();

		/**
		 * The meta object literal for the '<em><b>Organization Point Of Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION_POINT_OF_CONTACT = eINSTANCE.getDocumentRoot_OrganizationPointOfContact();

		/**
		 * The meta object literal for the '<em><b>Organization Role Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANIZATION_ROLE_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_OrganizationRoleDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Organization Role Detailed Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_OrganizationRoleDetailedDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Organization Web Site URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANIZATION_WEB_SITE_URL = eINSTANCE.getDocumentRoot_OrganizationWebSiteURL();

		/**
		 * The meta object literal for the '<em><b>Performance Metrics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERFORMANCE_METRICS = eINSTANCE.getDocumentRoot_PerformanceMetrics();

		/**
		 * The meta object literal for the '<em><b>Policy Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POLICY_TEXT = eINSTANCE.getDocumentRoot_PolicyText();

		/**
		 * The meta object literal for the '<em><b>Real World Effect Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REAL_WORLD_EFFECT_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_RealWorldEffectDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Related Organization Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATED_ORGANIZATION_INFORMATION = eINSTANCE.getDocumentRoot_RelatedOrganizationInformation();

		/**
		 * The meta object literal for the '<em><b>Revision Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REVISION_VERSION = eINSTANCE.getDocumentRoot_RevisionVersion();

		/**
		 * The meta object literal for the '<em><b>Security Classification Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SECURITY_CLASSIFICATION_TEXT = eINSTANCE.getDocumentRoot_SecurityClassificationText();

		/**
		 * The meta object literal for the '<em><b>Security Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SECURITY_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_SecurityDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Security Implemented Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SECURITY_IMPLEMENTED_INDICATOR = eINSTANCE.getDocumentRoot_SecurityImplementedIndicator();

		/**
		 * The meta object literal for the '<em><b>Service Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_ACTION = eINSTANCE.getDocumentRoot_ServiceAction();

		/**
		 * The meta object literal for the '<em><b>Service Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_ACTIONS = eINSTANCE.getDocumentRoot_ServiceActions();

		/**
		 * The meta object literal for the '<em><b>Service Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_AVAILABILITY = eINSTANCE.getDocumentRoot_ServiceAvailability();

		/**
		 * The meta object literal for the '<em><b>Service Average Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_AVERAGE_THROUGHPUT = eINSTANCE.getDocumentRoot_ServiceAverageThroughput();

		/**
		 * The meta object literal for the '<em><b>Service Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_CAPABILITIES = eINSTANCE.getDocumentRoot_ServiceCapabilities();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_DEPENDENCIES = eINSTANCE.getDocumentRoot_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Service Dependency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_DEPENDENCY = eINSTANCE.getDocumentRoot_ServiceDependency();

		/**
		 * The meta object literal for the '<em><b>Service Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_DESCRIPTION = eINSTANCE.getDocumentRoot_ServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Service Description Keywords</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORDS = eINSTANCE.getDocumentRoot_ServiceDescriptionKeywords();

		/**
		 * The meta object literal for the '<em><b>Service Description Keyword Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_DESCRIPTION_KEYWORD_TEXT = eINSTANCE.getDocumentRoot_ServiceDescriptionKeywordText();

		/**
		 * The meta object literal for the '<em><b>Service Description Summary Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_DESCRIPTION_SUMMARY_TEXT = eINSTANCE.getDocumentRoot_ServiceDescriptionSummaryText();

		/**
		 * The meta object literal for the '<em><b>Service Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_ServiceDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Service Full Name Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_FULL_NAME_TEXT = eINSTANCE.getDocumentRoot_ServiceFullNameText();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_ID = eINSTANCE.getDocumentRoot_ServiceID();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_IDENTIFICATION = eINSTANCE.getDocumentRoot_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service Interaction Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILE = eINSTANCE.getDocumentRoot_ServiceInteractionProfile();

		/**
		 * The meta object literal for the '<em><b>Service Interaction Profiles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_INTERACTION_PROFILES = eINSTANCE.getDocumentRoot_ServiceInteractionProfiles();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_INTERFACE = eINSTANCE.getDocumentRoot_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Service Level Agreements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_LEVEL_AGREEMENTS = eINSTANCE.getDocumentRoot_ServiceLevelAgreements();

		/**
		 * The meta object literal for the '<em><b>Service Maximum Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_MAXIMUM_THROUGHPUT = eINSTANCE.getDocumentRoot_ServiceMaximumThroughput();

		/**
		 * The meta object literal for the '<em><b>Service Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_METADATA = eINSTANCE.getDocumentRoot_ServiceMetadata();

		/**
		 * The meta object literal for the '<em><b>Service Name Abbreviation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_NAME_ABBREVIATION_TEXT = eINSTANCE.getDocumentRoot_ServiceNameAbbreviationText();

		/**
		 * The meta object literal for the '<em><b>Service Policy And Contracts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_POLICY_AND_CONTRACTS = eINSTANCE.getDocumentRoot_ServicePolicyAndContracts();

		/**
		 * The meta object literal for the '<em><b>Service Purpose Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_PURPOSE_TEXT = eINSTANCE.getDocumentRoot_ServicePurposeText();

		/**
		 * The meta object literal for the '<em><b>Service Real World Effects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_REAL_WORLD_EFFECTS = eINSTANCE.getDocumentRoot_ServiceRealWorldEffects();

		/**
		 * The meta object literal for the '<em><b>Service Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_RESPONSE_TIME = eINSTANCE.getDocumentRoot_ServiceResponseTime();

		/**
		 * The meta object literal for the '<em><b>Service Scope Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_SCOPE_DESCRIPTION_TEXT = eINSTANCE.getDocumentRoot_ServiceScopeDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Service URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SERVICE_URI = eINSTANCE.getDocumentRoot_ServiceURI();

		/**
		 * The meta object literal for the '<em><b>Service Usage Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_USAGE_DETAILS = eINSTANCE.getDocumentRoot_ServiceUsageDetails();

		/**
		 * The meta object literal for the '<em><b>SIP Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SIP_NAME = eINSTANCE.getDocumentRoot_SIPName();

		/**
		 * The meta object literal for the '<em><b>SIP Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SIP_VERSION = eINSTANCE.getDocumentRoot_SIPVersion();

		/**
		 * The meta object literal for the '<em><b>Sponsor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPONSOR = eINSTANCE.getDocumentRoot_Sponsor();

		/**
		 * The meta object literal for the '<em><b>Sponsors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPONSORS = eINSTANCE.getDocumentRoot_Sponsors();

		/**
		 * The meta object literal for the '<em><b>Umbrella Agreement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UMBRELLA_AGREEMENT = eINSTANCE.getDocumentRoot_UmbrellaAgreement();

		/**
		 * The meta object literal for the '<em><b>URI Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__URI_ADDRESS = eINSTANCE.getDocumentRoot_URIAddress();

		/**
		 * The meta object literal for the '<em><b>URI Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__URI_DESCRIPTION = eINSTANCE.getDocumentRoot_URIDescription();

		/**
		 * The meta object literal for the '<em><b>URI Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__URI_DETAIL = eINSTANCE.getDocumentRoot_URIDetail();

		/**
		 * The meta object literal for the '<em><b>URI Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__URI_DETAILS = eINSTANCE.getDocumentRoot_URIDetails();

		/**
		 * The meta object literal for the '<em><b>Usage Cost Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USAGE_COST_AMOUNT = eINSTANCE.getDocumentRoot_UsageCostAmount();

		/**
		 * The meta object literal for the '<em><b>Usage Unit Cost Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USAGE_UNIT_COST_AMOUNT = eINSTANCE.getDocumentRoot_UsageUnitCostAmount();

		/**
		 * The meta object literal for the '<em><b>Version Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VERSION_INFORMATION = eINSTANCE.getDocumentRoot_VersionInformation();

		/**
		 * The meta object literal for the '<em><b>Currency Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CURRENCY_TEXT = eINSTANCE.getDocumentRoot_CurrencyText();

		/**
		 * The meta object literal for the '<em><b>Unit Measure Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UNIT_MEASURE_TEXT = eINSTANCE.getDocumentRoot_UnitMeasureText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.DomainDescriptionTypeImpl <em>Domain Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.DomainDescriptionTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getDomainDescriptionType()
		 * @generated
		 */
		EClass DOMAIN_DESCRIPTION_TYPE = eINSTANCE.getDomainDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Domain Name Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_DESCRIPTION_TYPE__DOMAIN_NAME_TEXT = eINSTANCE.getDomainDescriptionType_DomainNameText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.EndorsementsTypeImpl <em>Endorsements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.EndorsementsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getEndorsementsType()
		 * @generated
		 */
		EClass ENDORSEMENTS_TYPE = eINSTANCE.getEndorsementsType();

		/**
		 * The meta object literal for the '<em><b>Endorser</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDORSEMENTS_TYPE__ENDORSER = eINSTANCE.getEndorsementsType_Endorser();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.EntityTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__ORGANIZATION = eINSTANCE.getEntityType_Organization();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PERSON = eINSTANCE.getEntityType_Person();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ExchangePartnerTypesTypeImpl <em>Exchange Partner Types Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ExchangePartnerTypesTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getExchangePartnerTypesType()
		 * @generated
		 */
		EClass EXCHANGE_PARTNER_TYPES_TYPE = eINSTANCE.getExchangePartnerTypesType();

		/**
		 * The meta object literal for the '<em><b>Exchange Partner Type Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_PARTNER_TYPES_TYPE__EXCHANGE_PARTNER_TYPE_DESCRIPTION_TEXT = eINSTANCE.getExchangePartnerTypesType_ExchangePartnerTypeDescriptionText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.IEPDReferencesTypeImpl <em>IEPD References Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.IEPDReferencesTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getIEPDReferencesType()
		 * @generated
		 */
		EClass IEPD_REFERENCES_TYPE = eINSTANCE.getIEPDReferencesType();

		/**
		 * The meta object literal for the '<em><b>IEPD Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEPD_REFERENCES_TYPE__IEPD_REFERENCE = eINSTANCE.getIEPDReferencesType_IEPDReference();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.IEPDReferenceTypeImpl <em>IEPD Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.IEPDReferenceTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getIEPDReferenceType()
		 * @generated
		 */
		EClass IEPD_REFERENCE_TYPE = eINSTANCE.getIEPDReferenceType();

		/**
		 * The meta object literal for the '<em><b>IEPD Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEPD_REFERENCE_TYPE__IEPD_NAME = eINSTANCE.getIEPDReferenceType_IEPDName();

		/**
		 * The meta object literal for the '<em><b>IEPDURL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEPD_REFERENCE_TYPE__IEPDURL = eINSTANCE.getIEPDReferenceType_IEPDURL();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.OrganizationTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getOrganizationType()
		 * @generated
		 */
		EClass ORGANIZATION_TYPE = eINSTANCE.getOrganizationType();

		/**
		 * The meta object literal for the '<em><b>Organization Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__ORGANIZATION_NAME = eINSTANCE.getOrganizationType_OrganizationName();

		/**
		 * The meta object literal for the '<em><b>Organization Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__ORGANIZATION_ACRONYM = eINSTANCE.getOrganizationType_OrganizationAcronym();

		/**
		 * The meta object literal for the '<em><b>Organization Full Address Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__ORGANIZATION_FULL_ADDRESS_TEXT = eINSTANCE.getOrganizationType_OrganizationFullAddressText();

		/**
		 * The meta object literal for the '<em><b>Organization Web Site URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__ORGANIZATION_WEB_SITE_URL = eINSTANCE.getOrganizationType_OrganizationWebSiteURL();

		/**
		 * The meta object literal for the '<em><b>Organization Role Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__ORGANIZATION_ROLE_DESCRIPTION_TEXT = eINSTANCE.getOrganizationType_OrganizationRoleDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Organization Role Detailed Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__ORGANIZATION_ROLE_DETAILED_DESCRIPTION_TEXT = eINSTANCE.getOrganizationType_OrganizationRoleDetailedDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Organization Point Of Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__ORGANIZATION_POINT_OF_CONTACT = eINSTANCE.getOrganizationType_OrganizationPointOfContact();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl <em>Performance Metrics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.PerformanceMetricsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getPerformanceMetricsType()
		 * @generated
		 */
		EClass PERFORMANCE_METRICS_TYPE = eINSTANCE.getPerformanceMetricsType();

		/**
		 * The meta object literal for the '<em><b>Service Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRICS_TYPE__SERVICE_RESPONSE_TIME = eINSTANCE.getPerformanceMetricsType_ServiceResponseTime();

		/**
		 * The meta object literal for the '<em><b>Service Average Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRICS_TYPE__SERVICE_AVERAGE_THROUGHPUT = eINSTANCE.getPerformanceMetricsType_ServiceAverageThroughput();

		/**
		 * The meta object literal for the '<em><b>Service Maximum Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRICS_TYPE__SERVICE_MAXIMUM_THROUGHPUT = eINSTANCE.getPerformanceMetricsType_ServiceMaximumThroughput();

		/**
		 * The meta object literal for the '<em><b>Service Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRICS_TYPE__SERVICE_AVAILABILITY = eINSTANCE.getPerformanceMetricsType_ServiceAvailability();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl <em>Person Contact Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.PersonContactInformationTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getPersonContactInformationType()
		 * @generated
		 */
		EClass PERSON_CONTACT_INFORMATION_TYPE = eINSTANCE.getPersonContactInformationType();

		/**
		 * The meta object literal for the '<em><b>Contact Person Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_NAME = eINSTANCE.getPersonContactInformationType_ContactPersonName();

		/**
		 * The meta object literal for the '<em><b>Contact Person Email ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_EMAIL_ID = eINSTANCE.getPersonContactInformationType_ContactPersonEmailID();

		/**
		 * The meta object literal for the '<em><b>Contact Person Phone Number ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PHONE_NUMBER_ID = eINSTANCE.getPersonContactInformationType_ContactPersonPhoneNumberID();

		/**
		 * The meta object literal for the '<em><b>Contact Person Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_CONTACT_INFORMATION_TYPE__CONTACT_PERSON_ADDRESS = eINSTANCE.getPersonContactInformationType_ContactPersonAddress();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.RelatedOrganizationInformationTypeImpl <em>Related Organization Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.RelatedOrganizationInformationTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getRelatedOrganizationInformationType()
		 * @generated
		 */
		EClass RELATED_ORGANIZATION_INFORMATION_TYPE = eINSTANCE.getRelatedOrganizationInformationType();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ORGANIZATION_INFORMATION_TYPE__ORGANIZATION = eINSTANCE.getRelatedOrganizationInformationType_Organization();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceActionsTypeImpl <em>Service Actions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceActionsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceActionsType()
		 * @generated
		 */
		EClass SERVICE_ACTIONS_TYPE = eINSTANCE.getServiceActionsType();

		/**
		 * The meta object literal for the '<em><b>Service Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ACTIONS_TYPE__SERVICE_ACTION = eINSTANCE.getServiceActionsType_ServiceAction();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceActionTypeImpl <em>Service Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceActionTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceActionType()
		 * @generated
		 */
		EClass SERVICE_ACTION_TYPE = eINSTANCE.getServiceActionType();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ACTION_TYPE__ACTION_NAME = eINSTANCE.getServiceActionType_ActionName();

		/**
		 * The meta object literal for the '<em><b>Action Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ACTION_TYPE__ACTION_PURPOSE = eINSTANCE.getServiceActionType_ActionPurpose();

		/**
		 * The meta object literal for the '<em><b>Message Exchange Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ACTION_TYPE__MESSAGE_EXCHANGE_PATTERN = eINSTANCE.getServiceActionType_MessageExchangePattern();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceCapabilitiesTypeImpl <em>Service Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceCapabilitiesTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceCapabilitiesType()
		 * @generated
		 */
		EClass SERVICE_CAPABILITIES_TYPE = eINSTANCE.getServiceCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Capability Description Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CAPABILITIES_TYPE__CAPABILITY_DESCRIPTION_TEXT = eINSTANCE.getServiceCapabilitiesType_CapabilityDescriptionText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDependenciesTypeImpl <em>Service Dependencies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceDependenciesTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceDependenciesType()
		 * @generated
		 */
		EClass SERVICE_DEPENDENCIES_TYPE = eINSTANCE.getServiceDependenciesType();

		/**
		 * The meta object literal for the '<em><b>Service Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEPENDENCIES_TYPE__SERVICE_DEPENDENCY = eINSTANCE.getServiceDependenciesType_ServiceDependency();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionKeywordsTypeImpl <em>Service Description Keywords Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionKeywordsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceDescriptionKeywordsType()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION_KEYWORDS_TYPE = eINSTANCE.getServiceDescriptionKeywordsType();

		/**
		 * The meta object literal for the '<em><b>Service Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION_KEYWORDS_TYPE__SERVICE_DEPENDENCY = eINSTANCE.getServiceDescriptionKeywordsType_ServiceDependency();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl <em>Service Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceDescriptionTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceDescriptionType()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION_TYPE = eINSTANCE.getServiceDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Service Purpose Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__SERVICE_PURPOSE_TEXT = eINSTANCE.getServiceDescriptionType_ServicePurposeText();

		/**
		 * The meta object literal for the '<em><b>Service Scope Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__SERVICE_SCOPE_DESCRIPTION_TEXT = eINSTANCE.getServiceDescriptionType_ServiceScopeDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Service Description Summary Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_SUMMARY_TEXT = eINSTANCE.getServiceDescriptionType_ServiceDescriptionSummaryText();

		/**
		 * The meta object literal for the '<em><b>Service Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_TEXT = eINSTANCE.getServiceDescriptionType_ServiceDescriptionText();

		/**
		 * The meta object literal for the '<em><b>Service Description Keyword Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__SERVICE_DESCRIPTION_KEYWORD_TEXT = eINSTANCE.getServiceDescriptionType_ServiceDescriptionKeywordText();

		/**
		 * The meta object literal for the '<em><b>Service Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION_TYPE__SERVICE_CAPABILITIES = eINSTANCE.getServiceDescriptionType_ServiceCapabilities();

		/**
		 * The meta object literal for the '<em><b>Service Real World Effects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION_TYPE__SERVICE_REAL_WORLD_EFFECTS = eINSTANCE.getServiceDescriptionType_ServiceRealWorldEffects();

		/**
		 * The meta object literal for the '<em><b>Security Classification Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__SECURITY_CLASSIFICATION_TEXT = eINSTANCE.getServiceDescriptionType_SecurityClassificationText();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_TYPE__ANY = eINSTANCE.getServiceDescriptionType_Any();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION_TYPE__SERVICE_DEPENDENCIES = eINSTANCE.getServiceDescriptionType_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>IEPD References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION_TYPE__IEPD_REFERENCES = eINSTANCE.getServiceDescriptionType_IEPDReferences();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl <em>Service Identification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceIdentificationTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceIdentificationType()
		 * @generated
		 */
		EClass SERVICE_IDENTIFICATION_TYPE = eINSTANCE.getServiceIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Service Full Name Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_TYPE__SERVICE_FULL_NAME_TEXT = eINSTANCE.getServiceIdentificationType_ServiceFullNameText();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_TYPE__SERVICE_ID = eINSTANCE.getServiceIdentificationType_ServiceID();

		/**
		 * The meta object literal for the '<em><b>Service URI</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_TYPE__SERVICE_URI = eINSTANCE.getServiceIdentificationType_ServiceURI();

		/**
		 * The meta object literal for the '<em><b>Service Name Abbreviation Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IDENTIFICATION_TYPE__SERVICE_NAME_ABBREVIATION_TEXT = eINSTANCE.getServiceIdentificationType_ServiceNameAbbreviationText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfilesTypeImpl <em>Service Interaction Profiles Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfilesTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceInteractionProfilesType()
		 * @generated
		 */
		EClass SERVICE_INTERACTION_PROFILES_TYPE = eINSTANCE.getServiceInteractionProfilesType();

		/**
		 * The meta object literal for the '<em><b>Service Interaction Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERACTION_PROFILES_TYPE__SERVICE_INTERACTION_PROFILE = eINSTANCE.getServiceInteractionProfilesType_ServiceInteractionProfile();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfileTypeImpl <em>Service Interaction Profile Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceInteractionProfileTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceInteractionProfileType()
		 * @generated
		 */
		EClass SERVICE_INTERACTION_PROFILE_TYPE = eINSTANCE.getServiceInteractionProfileType();

		/**
		 * The meta object literal for the '<em><b>SIP Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERACTION_PROFILE_TYPE__SIP_NAME = eINSTANCE.getServiceInteractionProfileType_SIPName();

		/**
		 * The meta object literal for the '<em><b>SIP Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERACTION_PROFILE_TYPE__SIP_VERSION = eINSTANCE.getServiceInteractionProfileType_SIPVersion();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl <em>Service Interface Specification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceInterfaceSpecificationTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceInterfaceSpecificationType()
		 * @generated
		 */
		EClass SERVICE_INTERFACE_SPECIFICATION_TYPE = eINSTANCE.getServiceInterfaceSpecificationType();

		/**
		 * The meta object literal for the '<em><b>URI Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION_TYPE__URI_DETAILS = eINSTANCE.getServiceInterfaceSpecificationType_URIDetails();

		/**
		 * The meta object literal for the '<em><b>Service Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_ACTIONS = eINSTANCE.getServiceInterfaceSpecificationType_ServiceActions();

		/**
		 * The meta object literal for the '<em><b>Service Interaction Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE_SPECIFICATION_TYPE__SERVICE_INTERACTION_PROFILES = eINSTANCE.getServiceInterfaceSpecificationType_ServiceInteractionProfiles();

		/**
		 * The meta object literal for the '<em><b>Security Implemented Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_IMPLEMENTED_INDICATOR = eINSTANCE.getServiceInterfaceSpecificationType_SecurityImplementedIndicator();

		/**
		 * The meta object literal for the '<em><b>Security Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_SPECIFICATION_TYPE__SECURITY_DESCRIPTION_TEXT = eINSTANCE.getServiceInterfaceSpecificationType_SecurityDescriptionText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceLevelAgreementsTypeImpl <em>Service Level Agreements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceLevelAgreementsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceLevelAgreementsType()
		 * @generated
		 */
		EClass SERVICE_LEVEL_AGREEMENTS_TYPE = eINSTANCE.getServiceLevelAgreementsType();

		/**
		 * The meta object literal for the '<em><b>Service Policy And Contracts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_POLICY_AND_CONTRACTS = eINSTANCE.getServiceLevelAgreementsType_ServicePolicyAndContracts();

		/**
		 * The meta object literal for the '<em><b>Performance Metrics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENTS_TYPE__PERFORMANCE_METRICS = eINSTANCE.getServiceLevelAgreementsType_PerformanceMetrics();

		/**
		 * The meta object literal for the '<em><b>Service Usage Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENTS_TYPE__SERVICE_USAGE_DETAILS = eINSTANCE.getServiceLevelAgreementsType_ServiceUsageDetails();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl <em>Service Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceMetadataTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceMetadataType()
		 * @generated
		 */
		EClass SERVICE_METADATA_TYPE = eINSTANCE.getServiceMetadataType();

		/**
		 * The meta object literal for the '<em><b>Service Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METADATA_TYPE__SERVICE_IDENTIFICATION = eINSTANCE.getServiceMetadataType_ServiceIdentification();

		/**
		 * The meta object literal for the '<em><b>Service Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METADATA_TYPE__SERVICE_DESCRIPTION = eINSTANCE.getServiceMetadataType_ServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Version Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METADATA_TYPE__VERSION_INFORMATION = eINSTANCE.getServiceMetadataType_VersionInformation();

		/**
		 * The meta object literal for the '<em><b>Related Organization Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METADATA_TYPE__RELATED_ORGANIZATION_INFORMATION = eINSTANCE.getServiceMetadataType_RelatedOrganizationInformation();

		/**
		 * The meta object literal for the '<em><b>Business Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METADATA_TYPE__BUSINESS_CONTEXT = eINSTANCE.getServiceMetadataType_BusinessContext();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METADATA_TYPE__SERVICE_INTERFACE = eINSTANCE.getServiceMetadataType_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Service Level Agreements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METADATA_TYPE__SERVICE_LEVEL_AGREEMENTS = eINSTANCE.getServiceMetadataType_ServiceLevelAgreements();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl <em>Service Policy And Contracts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServicePolicyAndContractsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServicePolicyAndContractsType()
		 * @generated
		 */
		EClass SERVICE_POLICY_AND_CONTRACTS_TYPE = eINSTANCE.getServicePolicyAndContractsType();

		/**
		 * The meta object literal for the '<em><b>Applicable Policies Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES_INDICATOR = eINSTANCE.getServicePolicyAndContractsType_ApplicablePoliciesIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_POLICIES = eINSTANCE.getServicePolicyAndContractsType_ApplicablePolicies();

		/**
		 * The meta object literal for the '<em><b>Applicable Contracts Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS_INDICATOR = eINSTANCE.getServicePolicyAndContractsType_ApplicableContractsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Contracts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_CONTRACTS = eINSTANCE.getServicePolicyAndContractsType_ApplicableContracts();

		/**
		 * The meta object literal for the '<em><b>Applicable Agreements Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS_INDICATOR = eINSTANCE.getServicePolicyAndContractsType_ApplicableAgreementsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Agreements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_AGREEMENTS = eINSTANCE.getServicePolicyAndContractsType_ApplicableAgreements();

		/**
		 * The meta object literal for the '<em><b>Applicable Umbrella Agreements Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS_INDICATOR = eINSTANCE.getServicePolicyAndContractsType_ApplicableUmbrellaAgreementsIndicator();

		/**
		 * The meta object literal for the '<em><b>Applicable Umbrella Agreements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_POLICY_AND_CONTRACTS_TYPE__APPLICABLE_UMBRELLA_AGREEMENTS = eINSTANCE.getServicePolicyAndContractsType_ApplicableUmbrellaAgreements();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceRealWorldEffectsTypeImpl <em>Service Real World Effects Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceRealWorldEffectsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceRealWorldEffectsType()
		 * @generated
		 */
		EClass SERVICE_REAL_WORLD_EFFECTS_TYPE = eINSTANCE.getServiceRealWorldEffectsType();

		/**
		 * The meta object literal for the '<em><b>Real World Effect Description Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REAL_WORLD_EFFECTS_TYPE__REAL_WORLD_EFFECT_DESCRIPTION_TEXT = eINSTANCE.getServiceRealWorldEffectsType_RealWorldEffectDescriptionText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl <em>Service Usage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.ServiceUsageTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getServiceUsageType()
		 * @generated
		 */
		EClass SERVICE_USAGE_TYPE = eINSTANCE.getServiceUsageType();

		/**
		 * The meta object literal for the '<em><b>Approval Required Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_USAGE_TYPE__APPROVAL_REQUIRED_INDICATOR = eINSTANCE.getServiceUsageType_ApprovalRequiredIndicator();

		/**
		 * The meta object literal for the '<em><b>Licensing Required Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_USAGE_TYPE__LICENSING_REQUIRED_INDICATOR = eINSTANCE.getServiceUsageType_LicensingRequiredIndicator();

		/**
		 * The meta object literal for the '<em><b>Licensing Agreement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_USAGE_TYPE__LICENSING_AGREEMENT = eINSTANCE.getServiceUsageType_LicensingAgreement();

		/**
		 * The meta object literal for the '<em><b>Service Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_USAGE_TYPE__SERVICE_COST = eINSTANCE.getServiceUsageType_ServiceCost();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.SponsorsTypeImpl <em>Sponsors Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.SponsorsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getSponsorsType()
		 * @generated
		 */
		EClass SPONSORS_TYPE = eINSTANCE.getSponsorsType();

		/**
		 * The meta object literal for the '<em><b>Sponsor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPONSORS_TYPE__SPONSOR = eINSTANCE.getSponsorsType_Sponsor();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.URIDetailsTypeImpl <em>URI Details Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.URIDetailsTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getURIDetailsType()
		 * @generated
		 */
		EClass URI_DETAILS_TYPE = eINSTANCE.getURIDetailsType();

		/**
		 * The meta object literal for the '<em><b>URI Detail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URI_DETAILS_TYPE__URI_DETAIL = eINSTANCE.getURIDetailsType_URIDetail();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.URIDetailTypeImpl <em>URI Detail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.URIDetailTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getURIDetailType()
		 * @generated
		 */
		EClass URI_DETAIL_TYPE = eINSTANCE.getURIDetailType();

		/**
		 * The meta object literal for the '<em><b>URI Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_DETAIL_TYPE__URI_ADDRESS = eINSTANCE.getURIDetailType_URIAddress();

		/**
		 * The meta object literal for the '<em><b>URI Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_DETAIL_TYPE__URI_DESCRIPTION = eINSTANCE.getURIDetailType_URIDescription();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.UsageUnitAmountTypeImpl <em>Usage Unit Amount Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.UsageUnitAmountTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getUsageUnitAmountType()
		 * @generated
		 */
		EClass USAGE_UNIT_AMOUNT_TYPE = eINSTANCE.getUsageUnitAmountType();

		/**
		 * The meta object literal for the '<em><b>Unit Measure Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_UNIT_AMOUNT_TYPE__UNIT_MEASURE_TEXT = eINSTANCE.getUsageUnitAmountType_UnitMeasureText();

		/**
		 * The meta object literal for the '{@link gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl <em>Version Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.ojp.it.gsp.services._1._0.impl.VersionInformationTypeImpl
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getVersionInformationType()
		 * @generated
		 */
		EClass VERSION_INFORMATION_TYPE = eINSTANCE.getVersionInformationType();

		/**
		 * The meta object literal for the '<em><b>Major Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__MAJOR_VERSION = eINSTANCE.getVersionInformationType_MajorVersion();

		/**
		 * The meta object literal for the '<em><b>Minor Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__MINOR_VERSION = eINSTANCE.getVersionInformationType_MinorVersion();

		/**
		 * The meta object literal for the '<em><b>Revision Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__REVISION_VERSION = eINSTANCE.getVersionInformationType_RevisionVersion();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__CREATION_DATE = eINSTANCE.getVersionInformationType_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Activation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__ACTIVATION_DATE = eINSTANCE.getVersionInformationType_ActivationDate();

		/**
		 * The meta object literal for the '<em><b>Last Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__LAST_REVISION_DATE = eINSTANCE.getVersionInformationType_LastRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Next Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__NEXT_REVISION_DATE = eINSTANCE.getVersionInformationType_NextRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__EXPIRATION_DATE = eINSTANCE.getVersionInformationType_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__LIFECYCLE_STATUS = eINSTANCE.getVersionInformationType_LifecycleStatus();

		/**
		 * The meta object literal for the '<em><b>Alerts And Notifications</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFORMATION_TYPE__ALERTS_AND_NOTIFICATIONS = eINSTANCE.getVersionInformationType_AlertsAndNotifications();

		/**
		 * The meta object literal for the '<em>Summary Text Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.ojp.it.gsp.services._1._0.impl.graPackageImpl#getSummaryTextType()
		 * @generated
		 */
		EDataType SUMMARY_TEXT_TYPE = eINSTANCE.getSummaryTextType();

	}

} //graPackage
