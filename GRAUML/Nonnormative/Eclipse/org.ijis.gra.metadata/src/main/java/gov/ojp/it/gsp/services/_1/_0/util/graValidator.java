/**
 */
package gov.ojp.it.gsp.services._1._0.util;

import gov.ojp.it.gsp.services._1._0.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gov.ojp.it.gsp.services._1._0.graPackage
 * @generated
 */
public class graValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final graValidator INSTANCE = new graValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gov.ojp.it.gsp.services._1._0";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public graValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return graPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case graPackage.AGREEMENT_TYPE:
				return validateAgreementType((AgreementType)value, diagnostics, context);
			case graPackage.AMOUNT_TYPE:
				return validateAmountType((AmountType)value, diagnostics, context);
			case graPackage.APPLICABLE_AGREEMENTS_TYPE:
				return validateApplicableAgreementsType((ApplicableAgreementsType)value, diagnostics, context);
			case graPackage.APPLICABLE_CONTRACTS_TYPE:
				return validateApplicableContractsType((ApplicableContractsType)value, diagnostics, context);
			case graPackage.APPLICABLE_POLICIES_TYPE:
				return validateApplicablePoliciesType((ApplicablePoliciesType)value, diagnostics, context);
			case graPackage.APPLICABLE_UMBRELLA_AGREEMENTS_TYPE:
				return validateApplicableUmbrellaAgreementsType((ApplicableUmbrellaAgreementsType)value, diagnostics, context);
			case graPackage.BUSINESS_CONTEXT_TYPE:
				return validateBusinessContextType((BusinessContextType)value, diagnostics, context);
			case graPackage.CLASSIFICATIONS_TYPE:
				return validateClassificationsType((ClassificationsType)value, diagnostics, context);
			case graPackage.COST_TYPE:
				return validateCostType((CostType)value, diagnostics, context);
			case graPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case graPackage.DOMAIN_DESCRIPTION_TYPE:
				return validateDomainDescriptionType((DomainDescriptionType)value, diagnostics, context);
			case graPackage.ENDORSEMENTS_TYPE:
				return validateEndorsementsType((EndorsementsType)value, diagnostics, context);
			case graPackage.ENTITY_TYPE:
				return validateEntityType((EntityType)value, diagnostics, context);
			case graPackage.EXCHANGE_PARTNER_TYPES_TYPE:
				return validateExchangePartnerTypesType((ExchangePartnerTypesType)value, diagnostics, context);
			case graPackage.IEPD_REFERENCES_TYPE:
				return validateIEPDReferencesType((IEPDReferencesType)value, diagnostics, context);
			case graPackage.IEPD_REFERENCE_TYPE:
				return validateIEPDReferenceType((IEPDReferenceType)value, diagnostics, context);
			case graPackage.ORGANIZATION_TYPE:
				return validateOrganizationType((OrganizationType)value, diagnostics, context);
			case graPackage.PERFORMANCE_METRICS_TYPE:
				return validatePerformanceMetricsType((PerformanceMetricsType)value, diagnostics, context);
			case graPackage.PERSON_CONTACT_INFORMATION_TYPE:
				return validatePersonContactInformationType((PersonContactInformationType)value, diagnostics, context);
			case graPackage.RELATED_ORGANIZATION_INFORMATION_TYPE:
				return validateRelatedOrganizationInformationType((RelatedOrganizationInformationType)value, diagnostics, context);
			case graPackage.SERVICE_ACTIONS_TYPE:
				return validateServiceActionsType((ServiceActionsType)value, diagnostics, context);
			case graPackage.SERVICE_ACTION_TYPE:
				return validateServiceActionType((ServiceActionType)value, diagnostics, context);
			case graPackage.SERVICE_CAPABILITIES_TYPE:
				return validateServiceCapabilitiesType((ServiceCapabilitiesType)value, diagnostics, context);
			case graPackage.SERVICE_DEPENDENCIES_TYPE:
				return validateServiceDependenciesType((ServiceDependenciesType)value, diagnostics, context);
			case graPackage.SERVICE_DESCRIPTION_KEYWORDS_TYPE:
				return validateServiceDescriptionKeywordsType((ServiceDescriptionKeywordsType)value, diagnostics, context);
			case graPackage.SERVICE_DESCRIPTION_TYPE:
				return validateServiceDescriptionType((ServiceDescriptionType)value, diagnostics, context);
			case graPackage.SERVICE_IDENTIFICATION_TYPE:
				return validateServiceIdentificationType((ServiceIdentificationType)value, diagnostics, context);
			case graPackage.SERVICE_INTERACTION_PROFILES_TYPE:
				return validateServiceInteractionProfilesType((ServiceInteractionProfilesType)value, diagnostics, context);
			case graPackage.SERVICE_INTERACTION_PROFILE_TYPE:
				return validateServiceInteractionProfileType((ServiceInteractionProfileType)value, diagnostics, context);
			case graPackage.SERVICE_INTERFACE_SPECIFICATION_TYPE:
				return validateServiceInterfaceSpecificationType((ServiceInterfaceSpecificationType)value, diagnostics, context);
			case graPackage.SERVICE_LEVEL_AGREEMENTS_TYPE:
				return validateServiceLevelAgreementsType((ServiceLevelAgreementsType)value, diagnostics, context);
			case graPackage.SERVICE_METADATA_TYPE:
				return validateServiceMetadataType((ServiceMetadataType)value, diagnostics, context);
			case graPackage.SERVICE_POLICY_AND_CONTRACTS_TYPE:
				return validateServicePolicyAndContractsType((ServicePolicyAndContractsType)value, diagnostics, context);
			case graPackage.SERVICE_REAL_WORLD_EFFECTS_TYPE:
				return validateServiceRealWorldEffectsType((ServiceRealWorldEffectsType)value, diagnostics, context);
			case graPackage.SERVICE_USAGE_TYPE:
				return validateServiceUsageType((ServiceUsageType)value, diagnostics, context);
			case graPackage.SPONSORS_TYPE:
				return validateSponsorsType((SponsorsType)value, diagnostics, context);
			case graPackage.URI_DETAILS_TYPE:
				return validateURIDetailsType((URIDetailsType)value, diagnostics, context);
			case graPackage.URI_DETAIL_TYPE:
				return validateURIDetailType((URIDetailType)value, diagnostics, context);
			case graPackage.USAGE_UNIT_AMOUNT_TYPE:
				return validateUsageUnitAmountType((UsageUnitAmountType)value, diagnostics, context);
			case graPackage.VERSION_INFORMATION_TYPE:
				return validateVersionInformationType((VersionInformationType)value, diagnostics, context);
			case graPackage.SUMMARY_TEXT_TYPE:
				return validateSummaryTextType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreementType(AgreementType agreementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(agreementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAmountType(AmountType amountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(amountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicableAgreementsType(ApplicableAgreementsType applicableAgreementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicableAgreementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicableContractsType(ApplicableContractsType applicableContractsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicableContractsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicablePoliciesType(ApplicablePoliciesType applicablePoliciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicablePoliciesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicableUmbrellaAgreementsType(ApplicableUmbrellaAgreementsType applicableUmbrellaAgreementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicableUmbrellaAgreementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessContextType(BusinessContextType businessContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(businessContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationsType(ClassificationsType classificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostType(CostType costType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainDescriptionType(DomainDescriptionType domainDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndorsementsType(EndorsementsType endorsementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endorsementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityType(EntityType entityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExchangePartnerTypesType(ExchangePartnerTypesType exchangePartnerTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exchangePartnerTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIEPDReferencesType(IEPDReferencesType iepdReferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iepdReferencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIEPDReferenceType(IEPDReferenceType iepdReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iepdReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationType(OrganizationType organizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceMetricsType(PerformanceMetricsType performanceMetricsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceMetricsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonContactInformationType(PersonContactInformationType personContactInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personContactInformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedOrganizationInformationType(RelatedOrganizationInformationType relatedOrganizationInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedOrganizationInformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceActionsType(ServiceActionsType serviceActionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceActionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceActionType(ServiceActionType serviceActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceActionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCapabilitiesType(ServiceCapabilitiesType serviceCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDependenciesType(ServiceDependenciesType serviceDependenciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceDependenciesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescriptionKeywordsType(ServiceDescriptionKeywordsType serviceDescriptionKeywordsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceDescriptionKeywordsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescriptionType(ServiceDescriptionType serviceDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceIdentificationType(ServiceIdentificationType serviceIdentificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceIdentificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInteractionProfilesType(ServiceInteractionProfilesType serviceInteractionProfilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceInteractionProfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInteractionProfileType(ServiceInteractionProfileType serviceInteractionProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceInteractionProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInterfaceSpecificationType(ServiceInterfaceSpecificationType serviceInterfaceSpecificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceInterfaceSpecificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelAgreementsType(ServiceLevelAgreementsType serviceLevelAgreementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceLevelAgreementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMetadataType(ServiceMetadataType serviceMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePolicyAndContractsType(ServicePolicyAndContractsType servicePolicyAndContractsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servicePolicyAndContractsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRealWorldEffectsType(ServiceRealWorldEffectsType serviceRealWorldEffectsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRealWorldEffectsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceUsageType(ServiceUsageType serviceUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceUsageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSponsorsType(SponsorsType sponsorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sponsorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIDetailsType(URIDetailsType uriDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uriDetailsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIDetailType(URIDetailType uriDetailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uriDetailType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageUnitAmountType(UsageUnitAmountType usageUnitAmountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageUnitAmountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionInformationType(VersionInformationType versionInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionInformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryTextType(String summaryTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSummaryTextType_MaxLength(summaryTextType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Summary Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummaryTextType_MaxLength(String summaryTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = summaryTextType.length();
		boolean result = length <= 160;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(graPackage.Literals.SUMMARY_TEXT_TYPE, summaryTextType, length, 160, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //graValidator
