/**
 */
package gov.ojp.it.gsp.services._1._0.impl;

import gov.ojp.it.gsp.services._1._0.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class graFactoryImpl extends EFactoryImpl implements graFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static graFactory init() {
		try {
			graFactory thegraFactory = (graFactory)EPackage.Registry.INSTANCE.getEFactory(graPackage.eNS_URI);
			if (thegraFactory != null) {
				return thegraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new graFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public graFactoryImpl() {
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
			case graPackage.AGREEMENT_TYPE: return createAgreementType();
			case graPackage.AMOUNT_TYPE: return createAmountType();
			case graPackage.APPLICABLE_AGREEMENTS_TYPE: return createApplicableAgreementsType();
			case graPackage.APPLICABLE_CONTRACTS_TYPE: return createApplicableContractsType();
			case graPackage.APPLICABLE_POLICIES_TYPE: return createApplicablePoliciesType();
			case graPackage.APPLICABLE_UMBRELLA_AGREEMENTS_TYPE: return createApplicableUmbrellaAgreementsType();
			case graPackage.BUSINESS_CONTEXT_TYPE: return createBusinessContextType();
			case graPackage.CLASSIFICATIONS_TYPE: return createClassificationsType();
			case graPackage.COST_TYPE: return createCostType();
			case graPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case graPackage.DOMAIN_DESCRIPTION_TYPE: return createDomainDescriptionType();
			case graPackage.ENDORSEMENTS_TYPE: return createEndorsementsType();
			case graPackage.ENTITY_TYPE: return createEntityType();
			case graPackage.EXCHANGE_PARTNER_TYPES_TYPE: return createExchangePartnerTypesType();
			case graPackage.IEPD_REFERENCES_TYPE: return createIEPDReferencesType();
			case graPackage.IEPD_REFERENCE_TYPE: return createIEPDReferenceType();
			case graPackage.ORGANIZATION_TYPE: return createOrganizationType();
			case graPackage.PERFORMANCE_METRICS_TYPE: return createPerformanceMetricsType();
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE: return createPersonContactInformationType();
			case graPackage.RELATED_ORGANIZATION_INFORMATION_TYPE: return createRelatedOrganizationInformationType();
			case graPackage.SERVICE_ACTIONS_TYPE: return createServiceActionsType();
			case graPackage.SERVICE_ACTION_TYPE: return createServiceActionType();
			case graPackage.SERVICE_CAPABILITIES_TYPE: return createServiceCapabilitiesType();
			case graPackage.SERVICE_DEPENDENCIES_TYPE: return createServiceDependenciesType();
			case graPackage.SERVICE_DESCRIPTION_KEYWORDS_TYPE: return createServiceDescriptionKeywordsType();
			case graPackage.SERVICE_DESCRIPTION_TYPE: return createServiceDescriptionType();
			case graPackage.SERVICE_IDENTIFICATION_TYPE: return createServiceIdentificationType();
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE: return createServiceInteractionProfilesType();
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE: return createServiceInteractionProfileType();
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE: return createServiceInterfaceSpecificationType();
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE: return createServiceLevelAgreementsType();
			case graPackage.SERVICE_METADATA_TYPE: return createServiceMetadataType();
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE: return createServicePolicyAndContractsType();
			case graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE: return createServiceRealWorldEffectsType();
			case graPackage.SERVICE_USAGE_TYPE: return createServiceUsageType();
			case graPackage.SPONSORS_TYPE: return createSponsorsType();
			case graPackage.URI_DETAILS_TYPE: return createURIDetailsType();
			case graPackage.URI_DETAIL_TYPE: return createURIDetailType();
			case graPackage.USAGE_UNIT_AMOUNT_TYPE: return createUsageUnitAmountType();
			case graPackage.VERSION_INFORMATION_TYPE: return createVersionInformationType();
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
			case graPackage.SUMMARY_TEXT_TYPE:
				return createSummaryTextTypeFromString(eDataType, initialValue);
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
			case graPackage.SUMMARY_TEXT_TYPE:
				return convertSummaryTextTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType createAgreementType() {
		AgreementTypeImpl agreementType = new AgreementTypeImpl();
		return agreementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType createAmountType() {
		AmountTypeImpl amountType = new AmountTypeImpl();
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableAgreementsType createApplicableAgreementsType() {
		ApplicableAgreementsTypeImpl applicableAgreementsType = new ApplicableAgreementsTypeImpl();
		return applicableAgreementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableContractsType createApplicableContractsType() {
		ApplicableContractsTypeImpl applicableContractsType = new ApplicableContractsTypeImpl();
		return applicableContractsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicablePoliciesType createApplicablePoliciesType() {
		ApplicablePoliciesTypeImpl applicablePoliciesType = new ApplicablePoliciesTypeImpl();
		return applicablePoliciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableUmbrellaAgreementsType createApplicableUmbrellaAgreementsType() {
		ApplicableUmbrellaAgreementsTypeImpl applicableUmbrellaAgreementsType = new ApplicableUmbrellaAgreementsTypeImpl();
		return applicableUmbrellaAgreementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessContextType createBusinessContextType() {
		BusinessContextTypeImpl businessContextType = new BusinessContextTypeImpl();
		return businessContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationsType createClassificationsType() {
		ClassificationsTypeImpl classificationsType = new ClassificationsTypeImpl();
		return classificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType createCostType() {
		CostTypeImpl costType = new CostTypeImpl();
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDescriptionType createDomainDescriptionType() {
		DomainDescriptionTypeImpl domainDescriptionType = new DomainDescriptionTypeImpl();
		return domainDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndorsementsType createEndorsementsType() {
		EndorsementsTypeImpl endorsementsType = new EndorsementsTypeImpl();
		return endorsementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePartnerTypesType createExchangePartnerTypesType() {
		ExchangePartnerTypesTypeImpl exchangePartnerTypesType = new ExchangePartnerTypesTypeImpl();
		return exchangePartnerTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEPDReferencesType createIEPDReferencesType() {
		IEPDReferencesTypeImpl iepdReferencesType = new IEPDReferencesTypeImpl();
		return iepdReferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEPDReferenceType createIEPDReferenceType() {
		IEPDReferenceTypeImpl iepdReferenceType = new IEPDReferenceTypeImpl();
		return iepdReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType createOrganizationType() {
		OrganizationTypeImpl organizationType = new OrganizationTypeImpl();
		return organizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceMetricsType createPerformanceMetricsType() {
		PerformanceMetricsTypeImpl performanceMetricsType = new PerformanceMetricsTypeImpl();
		return performanceMetricsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonContactInformationType createPersonContactInformationType() {
		PersonContactInformationTypeImpl personContactInformationType = new PersonContactInformationTypeImpl();
		return personContactInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedOrganizationInformationType createRelatedOrganizationInformationType() {
		RelatedOrganizationInformationTypeImpl relatedOrganizationInformationType = new RelatedOrganizationInformationTypeImpl();
		return relatedOrganizationInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceActionsType createServiceActionsType() {
		ServiceActionsTypeImpl serviceActionsType = new ServiceActionsTypeImpl();
		return serviceActionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceActionType createServiceActionType() {
		ServiceActionTypeImpl serviceActionType = new ServiceActionTypeImpl();
		return serviceActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCapabilitiesType createServiceCapabilitiesType() {
		ServiceCapabilitiesTypeImpl serviceCapabilitiesType = new ServiceCapabilitiesTypeImpl();
		return serviceCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDependenciesType createServiceDependenciesType() {
		ServiceDependenciesTypeImpl serviceDependenciesType = new ServiceDependenciesTypeImpl();
		return serviceDependenciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionKeywordsType createServiceDescriptionKeywordsType() {
		ServiceDescriptionKeywordsTypeImpl serviceDescriptionKeywordsType = new ServiceDescriptionKeywordsTypeImpl();
		return serviceDescriptionKeywordsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionType createServiceDescriptionType() {
		ServiceDescriptionTypeImpl serviceDescriptionType = new ServiceDescriptionTypeImpl();
		return serviceDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIdentificationType createServiceIdentificationType() {
		ServiceIdentificationTypeImpl serviceIdentificationType = new ServiceIdentificationTypeImpl();
		return serviceIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInteractionProfilesType createServiceInteractionProfilesType() {
		ServiceInteractionProfilesTypeImpl serviceInteractionProfilesType = new ServiceInteractionProfilesTypeImpl();
		return serviceInteractionProfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInteractionProfileType createServiceInteractionProfileType() {
		ServiceInteractionProfileTypeImpl serviceInteractionProfileType = new ServiceInteractionProfileTypeImpl();
		return serviceInteractionProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceSpecificationType createServiceInterfaceSpecificationType() {
		ServiceInterfaceSpecificationTypeImpl serviceInterfaceSpecificationType = new ServiceInterfaceSpecificationTypeImpl();
		return serviceInterfaceSpecificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelAgreementsType createServiceLevelAgreementsType() {
		ServiceLevelAgreementsTypeImpl serviceLevelAgreementsType = new ServiceLevelAgreementsTypeImpl();
		return serviceLevelAgreementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMetadataType createServiceMetadataType() {
		ServiceMetadataTypeImpl serviceMetadataType = new ServiceMetadataTypeImpl();
		return serviceMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePolicyAndContractsType createServicePolicyAndContractsType() {
		ServicePolicyAndContractsTypeImpl servicePolicyAndContractsType = new ServicePolicyAndContractsTypeImpl();
		return servicePolicyAndContractsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRealWorldEffectsType createServiceRealWorldEffectsType() {
		ServiceRealWorldEffectsTypeImpl serviceRealWorldEffectsType = new ServiceRealWorldEffectsTypeImpl();
		return serviceRealWorldEffectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUsageType createServiceUsageType() {
		ServiceUsageTypeImpl serviceUsageType = new ServiceUsageTypeImpl();
		return serviceUsageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SponsorsType createSponsorsType() {
		SponsorsTypeImpl sponsorsType = new SponsorsTypeImpl();
		return sponsorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URIDetailsType createURIDetailsType() {
		URIDetailsTypeImpl uriDetailsType = new URIDetailsTypeImpl();
		return uriDetailsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URIDetailType createURIDetailType() {
		URIDetailTypeImpl uriDetailType = new URIDetailTypeImpl();
		return uriDetailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageUnitAmountType createUsageUnitAmountType() {
		UsageUnitAmountTypeImpl usageUnitAmountType = new UsageUnitAmountTypeImpl();
		return usageUnitAmountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInformationType createVersionInformationType() {
		VersionInformationTypeImpl versionInformationType = new VersionInformationTypeImpl();
		return versionInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSummaryTextTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSummaryTextTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public graPackage getgraPackage() {
		return (graPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static graPackage getPackage() {
		return graPackage.eINSTANCE;
	}

} //graFactoryImpl
