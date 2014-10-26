<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:graa="http://ijis.org/GRA/Annotations" exclude-result-prefixes="graa">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<xsl:result-document href="metadata.xml">
			<ServiceMetadata xmlns="http://it.ojp.gov/gsp/services/1.0.0">
				<xsl:namespace name="gra-meta">http://it.ojp.gov/gsp/services/1.0.0</xsl:namespace>
				<xsl:attribute name="xsi:schemaLocation">http://it.ojp.gov/gsp/services/1.0.0 ./Metadata.xsd</xsl:attribute>
				<xsl:for-each select="graa:ServiceDescription">
					<xsl:element name="ServiceIdentification">
							<xsl:element name="ServiceFullNameText"><xsl:value-of select="@name"/></xsl:element>
							<xsl:element name="ServiceID"><xsl:value-of select="@serviceId"/></xsl:element>
							<xsl:element name="ServiceURI"><xsl:value-of select="@serviceUri"/></xsl:element>
							<xsl:element name="ServiceNameAbbreviationText"><xsl:value-of select="@serviceNameAbbreviationText"/></xsl:element>
					</xsl:element>
					<xsl:element name="ServiceDescription">
							<xsl:element name="ServicePurposeText"><xsl:value-of select="servicePurpose/@documentation"/></xsl:element>
							<xsl:element name="ServiceScopeDescriptionText"><xsl:value-of select="serviceScopeDescription/@documentation"/></xsl:element>
							<xsl:element name="ServiceDescriptionSummaryText"><xsl:value-of select="@serviceDescriptionSummaryText"/></xsl:element>
							<xsl:element name="ServiceDescriptionText"><xsl:value-of select="@documentation"/></xsl:element>
							<xsl:element name="ServiceDescriptionKeywordText"><xsl:value-of select="serviceDescriptionKeywordText"/></xsl:element>
							<xsl:element name="ServiceCapabilities">
								<xsl:if test="not(serviceCapability/@documentation)">
									<xsl:element name="CapabilityDescriptionText"></xsl:element>
								</xsl:if>
								<xsl:for-each select="serviceCapability">
									<xsl:element name="CapabilityDescriptionText"><xsl:value-of select="@documentation"/></xsl:element>
								</xsl:for-each>
							</xsl:element>
						<xsl:element name="ServiceRealWorldEffects">
							<xsl:if test="not(realWorldEffect/@name)">
								<xsl:element name="RealWorldEffectDescriptionText"></xsl:element>
							</xsl:if>
								<xsl:for-each select="realWorldEffect">
									<xsl:element name="RealWorldEffectDescriptionText"><xsl:value-of select="@name"/></xsl:element>
								</xsl:for-each>
							</xsl:element>					
							<xsl:element name="SecurityClassificationText"><xsl:value-of select="serviceSecurityClassification/@name"/></xsl:element>
							<xsl:element name="ServiceDependencies">		
								<xsl:for-each select="serviceDependency">
									<xsl:element name="ServiceDependency">
										<xsl:element name="ServiceFullNameText"><xsl:value-of select="@name"/></xsl:element>
										<xsl:element name="ServiceID"><xsl:value-of select="@serviceId"/></xsl:element>
										<xsl:element name="ServiceURI"><xsl:value-of select="@serviceUri"/></xsl:element>
										<xsl:element name="ServiceNameAbbreviationText"><xsl:value-of select="@serviceNameAbbreviationText"/></xsl:element>
									</xsl:element>						
								</xsl:for-each>
							</xsl:element>										
							<xsl:element name="IEPDReferences">
								<xsl:if test="not(iepdReference)">
									<xsl:call-template name="iepdSection">
										<xsl:with-param name="iepdName"><xsl:value-of select="@name"/></xsl:with-param>
										<xsl:with-param name="iepdUri"><xsl:value-of select="@iepdurl"/></xsl:with-param>
									</xsl:call-template>
								</xsl:if>
								<xsl:for-each select="iepdReference">
									<xsl:call-template name="iepdSection">
										<xsl:with-param name="iepdName"><xsl:value-of select="@name"/></xsl:with-param>
										<xsl:with-param name="iepdUri"><xsl:value-of select="@iepdurl"/></xsl:with-param>
									</xsl:call-template>
								</xsl:for-each>
							</xsl:element>		
					</xsl:element>
					<xsl:element name="VersionInformation">					
						<xsl:element name="MajorVersion"><xsl:value-of select="(@majorVersion, 0)[1]"/></xsl:element>
						<xsl:element name="MinorVersion"><xsl:value-of select="(@minorVersion, 0)[1]"/></xsl:element>	
						<xsl:element name="RevisionVersion"><xsl:value-of select="(@revisionVersion, 0)[1]"/></xsl:element>
						<xsl:element name="CreationDate"><xsl:value-of select="format-date(xs:date((@creationDate, '0001-01-01')[1]),'[Y0001]-[M01]-[D01]')"/></xsl:element>
						<xsl:element name="ActivationDate"><xsl:value-of select="format-date(xs:date((@activationDate, '0001-01-01')[1]),'[Y0001]-[M01]-[D01]')"/></xsl:element>
						<xsl:element name="LastRevisionDate"><xsl:value-of select="format-date(xs:date((@lastRevisionDate, '0001-01-01')[1]),'[Y0001]-[M01]-[D01]')"/></xsl:element>
						<xsl:element name="NextRevisionDate"><xsl:value-of select="format-date(xs:date((@nextRevisionDate, '0001-01-01')[1]),'[Y0001]-[M01]-[D01]')"/></xsl:element>
						<xsl:element name="ExpirationDate"><xsl:value-of select="format-date(xs:date((@expirationDate, '0001-01-01')[1]),'[Y0001]-[M01]-[D01]')"/></xsl:element>
						<xsl:element name="LifecycleStatus"><xsl:value-of select="(@lifecycleStatus, '')"/></xsl:element>
						<xsl:element name="AlertsAndNotifications"><xsl:value-of select="@alertAndNotificationUri"/></xsl:element>
					</xsl:element>
					<xsl:element name="RelatedOrganizationInformation">		
						<xsl:if test="not(relatedOrganization)">
							<xsl:element name="Organization">
								<xsl:element name="OrganizationName"/>
								<xsl:element name="OrganizationRoleDescriptionText"/>
							</xsl:element>
						</xsl:if>
						<xsl:for-each select="relatedOrganization">
							<xsl:element name="Organization">
								<xsl:element name="OrganizationName"><xsl:value-of select="@name"/></xsl:element>
								<xsl:element name="OrganizationAcronym"><xsl:value-of select="@organizationAcronym"/></xsl:element>
								<xsl:element name="OrganizationFullAddressText"><xsl:value-of select="@organizationFullAddressText"/></xsl:element>
								<xsl:element name="OrganizationWebSiteURL"><xsl:value-of select="@organizationWebSiteUrl"/></xsl:element>
								<xsl:element name="OrganizationRoleDescriptionText"><xsl:value-of select="@organizationRoleDescriptionText"/></xsl:element>
								<xsl:element name="OrganizationRoleDetailedDescriptionText"><xsl:value-of select="@organizationRoleDetailedDescriptionText"/></xsl:element>
								<xsl:for-each select="organizationPointOfContact">
									<xsl:element name="OrganizationPointOfContact">
										<xsl:element name="ContactPersonName"><xsl:value-of select="@name"/></xsl:element>
										<xsl:element name="ContactPersonEmailID"><xsl:value-of select="@contactPersonEmailId"/></xsl:element>
										<xsl:element name="ContactPersonPhoneNumberID"><xsl:value-of select="@contactPersonPhoneNumberId"/></xsl:element>
										<xsl:element name="ContactPersonAddress"><xsl:value-of select="@contactPersonAddress"/></xsl:element>
									</xsl:element>
								</xsl:for-each>
							</xsl:element>
						</xsl:for-each>
					</xsl:element>		
					<xsl:element name="BusinessContext">					
						<xsl:element name="DomainDescription">
							<xsl:element name="DomainNameText"><xsl:value-of select="@domainDescription"/></xsl:element>
						</xsl:element>	
						<xsl:element name="Classifications">
								<xsl:element name="Classification"><xsl:value-of select="classification"/></xsl:element>						
						</xsl:element>	
						<xsl:element name="ExchangePartnerTypes">
							<xsl:element name="ExchangePartnerTypeDescriptionText">
								<xsl:for-each select="exchangePartner">
									<xsl:if test="position() &gt; 1">,</xsl:if>
									<xsl:value-of select="@name"/>
								</xsl:for-each>
							</xsl:element>		
						</xsl:element>
						<xsl:element name="Endorsements">
							<xsl:if test="not(endorsements)">
								<xsl:element name="Endorser"></xsl:element>
							</xsl:if>
							<xsl:for-each select="endorsements">
								<xsl:element name="Endorser"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:element>
						<xsl:element name="Sponsors">
							<xsl:if test="not(sponsor)">
								<xsl:element name="Sponsor"></xsl:element>
							</xsl:if>
							<xsl:for-each select="sponsor">
								<xsl:element name="Sponsor"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:element>
					</xsl:element>
					<xsl:for-each select="serviceInterface">
						<xsl:element name="ServiceInterface">
							<xsl:element name="URIDetails">
								<xsl:element name="URIDetail">
									<xsl:element name="URIAddress">
										<xsl:value-of select='concat("./schemas/sip/", @serviceInterfaceNameAbbreviationText, ".wsdl")' />
									</xsl:element>
									<xsl:element name="URIDescription"><xsl:value-of select="@documentation"/></xsl:element>
								</xsl:element>							
							</xsl:element>						
							<xsl:element name="ServiceActions">
								<xsl:for-each select="service">
									<xsl:for-each select="port">
										<xsl:for-each select="interface">
											<xsl:for-each select="operation">
												<xsl:element name="ServiceAction">
													<xsl:element name="ActionName"><xsl:value-of select="@actionName"/></xsl:element>
													<xsl:element name="ActionPurpose"><xsl:value-of select="@actionPurpose"/></xsl:element>
													<xsl:element name="MessageExchangePattern"><xsl:value-of select="@messageExchangePattern"/></xsl:element>
												</xsl:element>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:element>						
							<xsl:for-each select="serviceInteractionProfile">
								<xsl:element name="ServiceInteractionProfiles">
									<xsl:element name="ServiceInteractionProfile">
										<xsl:element name="SIPName"><xsl:value-of select="@sipName"/></xsl:element>
										<xsl:element name="SIPVersion"><xsl:value-of select="@sipVersion"/></xsl:element>
									</xsl:element>
								</xsl:element>
							</xsl:for-each>
							<xsl:element name="SecurityImplementedIndicator"><xsl:value-of select="(@securityImplementedIndicator, 'false')[1]"/></xsl:element>
							<xsl:element name="SecurityDescriptionText"><xsl:value-of select="@securityDescriptionText"/></xsl:element>
						</xsl:element>
					</xsl:for-each>
						<xsl:element name="ServiceLevelAgreements">
							<xsl:element name="ServicePolicyAndContracts">
								<xsl:element name="ApplicablePoliciesIndicator"><xsl:value-of select="(serviceLevelAgreement/@applicablePoliciesIndicator, 'false')[1]"/></xsl:element>
								<xsl:for-each select="serviceLevelAgreement/applicablePolicy">
									<xsl:element name="ApplicablePolicies">
										<xsl:element name="PolicyText"><xsl:value-of select="serviceLevelAgreement/@documentation"/></xsl:element>								
									</xsl:element>
								</xsl:for-each>								
								<xsl:element name="ApplicableContractsIndicator"><xsl:value-of select="(serviceLevelAgreement/@applicableContractsIndicator, 'false')[1]"/></xsl:element>
								<xsl:if test="serviceLevelAgreement/applicableContract">
									<xsl:element name="ApplicableContracts">
										<xsl:for-each select="serviceLevelAgreement/applicableContract">										
											<xsl:element name="Contract">
												<xsl:choose>
													<xsl:when test="@documentation">
														<xsl:element name="AgreementDescriptionText"><xsl:value-of select="serviceLevelAgreement/@documentation"/></xsl:element>
													</xsl:when>
													<xsl:otherwise>
														<xsl:element name="AgreementURI"><xsl:value-of select="serviceLevelAgreement/@agreementUri"/></xsl:element>		
													</xsl:otherwise>
												</xsl:choose>									
											</xsl:element>	
										</xsl:for-each>								
									</xsl:element>
								</xsl:if>							
								<xsl:element name="ApplicableAgreementsIndicator"><xsl:value-of select="(serviceLevelAgreement/@applicableAgreementsIndicator, 'false')[1]"/></xsl:element>							
								<xsl:if test="serviceLevelAgreement/agreement">
									<xsl:element name="ApplicableAgreements">
										<xsl:for-each select="serviceLevelAgreement/agreement">
											<xsl:element name="Agreement">
												<xsl:choose>
													<xsl:when test="serviceLevelAgreement/@documentation">
														<xsl:element name="AgreementDescriptionText"><xsl:value-of select="serviceLevelAgreement/@documentation"/></xsl:element>
													</xsl:when>
													<xsl:otherwise>
														<xsl:element name="AgreementURI"><xsl:value-of select="serviceLevelAgreement/@agreementUri"/></xsl:element>		
													</xsl:otherwise>
												</xsl:choose>														
											</xsl:element>								
										</xsl:for-each>											
									</xsl:element>	
								</xsl:if>							
								<xsl:element name="ApplicableUmbrellaAgreementsIndicator"><xsl:value-of select="(serviceLevelAgreement/@applicableUmbrellaAgreementsIndicator, 'false')[1]"/></xsl:element>
								<xsl:if test="serviceLevelAgreement/umbrellaAgreement">
									<xsl:element name="ApplicableUmbrellaAgreements">
										<xsl:for-each select="serviceLevelAgreement/umbrellaAgreement">
											<xsl:element name="UmbrellaAgreement">
												<xsl:choose>
													<xsl:when test="serviceLevelAgreement/@documentation">
														<xsl:element name="AgreementDescriptionText"><xsl:value-of select="serviceLevelAgreement/@documentation"/></xsl:element>
													</xsl:when>
													<xsl:otherwise>
														<xsl:element name="AgreementURI"><xsl:value-of select="serviceLevelAgreement/@agreementUri"/></xsl:element>		
													</xsl:otherwise>
												</xsl:choose>										
											</xsl:element>									
										</xsl:for-each>
									</xsl:element>
								</xsl:if>
							</xsl:element>
							<xsl:element name="PerformanceMetrics">
								<xsl:element name="ServiceResponseTime"><xsl:value-of select="(serviceLevelAgreement/@serviceResponseTime, 'P0Y0M1DT1H')[1]"/></xsl:element>
								<xsl:element name="ServiceAverageThroughput"><xsl:value-of select="serviceLevelAgreement/@serviceAverageThroughput"/></xsl:element>
								<xsl:element name="ServiceMaximumThroughput"><xsl:value-of select="serviceLevelAgreement/@serviceMaximumThroughput"/></xsl:element>
								<xsl:element name="ServiceAvailability"><xsl:value-of select="serviceLevelAgreement/@serviceAvailability"/></xsl:element>		
								</xsl:element>
							<xsl:element name="ServiceUsageDetails">
								<xsl:element name="ApprovalRequiredIndicator"><xsl:value-of select="(serviceLevelAgreement/@approvalRequiredIndicator, 'false')[1]"/></xsl:element>	
								<xsl:element name="LicensingRequiredIndicator"><xsl:value-of select="(serviceLevelAgreement/@licensingRequiredIndicator, 'false')[1]"/></xsl:element>
								<xsl:if test="serviceLevelAgreement/licensingAgreement">
									<xsl:element name="LicensingAgreement">
										<xsl:choose>
											<xsl:when test="serviceLevelAgreement/@documentation">
												<xsl:element name="AgreementDescriptionText"><xsl:value-of select="serviceLevelAgreement/@documentation"/></xsl:element>
											</xsl:when>
											<xsl:otherwise>
												<xsl:element name="AgreementURI"><xsl:value-of select="serviceLevelAgreement/@agreementUri"/></xsl:element>		
											</xsl:otherwise>
										</xsl:choose>	
									</xsl:element>
								</xsl:if>							
								<xsl:if test="serviceLevelAgreement/@usageCostAmount or serviceLevelAgreement/@usageUnitCostAmount or serviceLevelAgreement/@creationCostAmount">
									<xsl:element name="ServiceCost">
										<xsl:if test="serviceLevelAgreement/@usageCostAmount">
											<xsl:element name="UsageCostAmount"><xsl:value-of select="serviceLevelAgreement/@usageCostAmount"/></xsl:element>										
										</xsl:if>
										<xsl:if test="serviceLevelAgreement/@usageUnitCostAmount">
											<xsl:element name="UsageUnitCostAmount"><xsl:value-of select="serviceLevelAgreement/@usageUnitCostAmount"/></xsl:element>	
										</xsl:if>
										<xsl:if test="serviceLevelAgreement/@creationCostAmount">
											<xsl:element name="CreationCostAmount"><xsl:value-of select="serviceLevelAgreement/@creationCostAmount"/></xsl:element>	
										</xsl:if>
									</xsl:element>
								</xsl:if>							
							</xsl:element>												
						</xsl:element>
				</xsl:for-each>
			</ServiceMetadata>
		</xsl:result-document>
	</xsl:template>
	
	<xsl:template name="iepdSection">
		<xsl:param name="iepdName"/>
		<xsl:param name="iepdUri"/>
		<xsl:element name="IEPDReference" xmlns="http://it.ojp.gov/gsp/services/1.0.0">
			<xsl:element name="IEPDName"><xsl:value-of select="$iepdName"/></xsl:element>
			<xsl:element name="IEPDURL"><xsl:value-of select="$iepdUri"/></xsl:element>
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>