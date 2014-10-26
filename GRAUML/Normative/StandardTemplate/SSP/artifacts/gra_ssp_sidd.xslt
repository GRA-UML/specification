<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:graa="http://ijis.org/GRA/Annotations">
	<xsl:include href="./various%20artifacts/other/xslt%20utilities/gra_ssp_util_return.xslt"/>	
	<xsl:include href="./various%20artifacts/other/xslt%20utilities/gra_ssp_util_sir_table.xslt"/>
	<xsl:include href="./various%20artifacts/other/xslt%20utilities/gra_ssp_css.xslt"/>

	<xsl:template match="/">
		<!--<!DOCTYPE html>-->
		<xsl:variable name="versionInfo" select="concat((graa:ServiceDescription/@majorVersion, 0)[1],'.',(graa:ServiceDescription/@minorVersion, 0)[1],'.0')"/>	
		<xsl:for-each select="/graa:ServiceDescription[1]/serviceInterface">
			<xsl:variable name="fileLocation" select="concat(@serviceInterfaceNameAbbreviationText, '_SIDD_v_', $versionInfo, '.xhtml')"/>	
		<xsl:result-document href="{lower-case($fileLocation)}">
		<html xmlns="http://www.w3.org/1999/xhtml">
			<head>				
				<xsl:call-template name="css"/>
			</head>
			<body lang="EN-US" style="float:none;">
				<div class="CoverPageSection" style="float:none;overflow:visible;">					
					<p class="MsoNormal">
						<b>
							<span class="FontType TitleMain">
								<br/><br/>
								<xsl:value-of select="graa:ReturnValue('$_arg_ServiceName_',/graa:ServiceDescription/@name)"/>
							</span>
						</b>
					</p>
					<br/>
					<p class="MsoNormal">
						<b>
							<span class="FontType TitleMain">
								<xsl:value-of select="graa:ReturnValue('$_arg_ServiceAbbreviation_',concat('(',/graa:ServiceDescription[1]/@serviceNameAbbreviationText,')'))"/>
							</span>
						</b>
					</p>
					<br/>
					<p class="MsoNormal">
						<b>
							<span class="FontType TitleSub">
								<xsl:value-of select="graa:ReturnValue('$_arg_ServiceVersion_',concat('Version ', $versionInfo))" />
							</span>
						</b>
					</p>
					<p class="MsoNormal">
						<b>
							<span class="FontType TitleMain">
								<br/><br/><br/>
								<xsl:text>GRA</xsl:text>
							</span>
						</b>
					</p>
					<br/>
					<p class="MsoNormal">
						<b>
							<span class="FontType TitleMain">
								<xsl:text>Service Interface</xsl:text>
								<br/><br/>
								<xsl:text>Description Document</xsl:text>
							</span>
						</b>
					</p>
					<br/>
					<br/>
					<p class="MsoNormal">
						<b>
							<span class="FontType TitleMain">
								<br/><br/><br/>
							</span>
						</b>
					</p>
					<br/>
					<div class="MsoNormal">
						<table class="MsoNormalTable">
							<tr>
								<td class="MsoNormalTableColLeft">
									<p class="FontType CoverPageLeft">
										<xsl:text>Delivery On:</xsl:text>
									</p>
								</td>
								<td class="MsoNormalTableColRight">
									<p class="FontType CoverPageRight">
										<b>
											<xsl:value-of select="graa:ReturnValue('$_arg_Month_',(/graa:ServiceDescription/@creationDate,string(format-date(current-date(), '[Y0001]-[M01]-[D01]')))[1])"/>
										</b>
									</p>
								</td>
							</tr>
							<tr>
								<td class="MsoNormalTableColLeft">
									<p class="FontType CoverPageLeft">
										<xsl:text>Prepared For:</xsl:text>
									</p>
									<p class="FontType CoverPageLeft">
										<xsl:text>Prepared By:</xsl:text>
									</p>
									<p class="FontType CoverPageLeft">
										<xsl:text>Sponsored By:</xsl:text>
									</p>
								</td>
								<td class="MsoNormalTableColRight">
									<p class="FontType CoverPageRight">
										<b>
											<xsl:value-of select="graa:ReturnValue('$_arg_PreparedFor_',/graa:ServiceDescription/relatedOrganization/@name)"/>
										</b>
									</p>
									<p class="FontType CoverPageRight">
										<b>
											<xsl:value-of select="graa:ReturnValue('$_arg_Prepared-By',/graa:ServiceDescription/relatedOrganization/@name)"/>
										</b>
									</p>
									<p class="FontType CoverPageRight">
										<b>
											<xsl:value-of select="graa:ReturnValue('$_arg_Sponsored-By',/graa:ServiceDescription[1]/sponsor[1])"/>
										</b>
									</p>
								</td>
							</tr>
						</table>
					</div>
				</div>

				<br/>
				<br/>
				<br/>
				<div class="ContentSection">
					<h1>
						<span class="FontType Heading1">
							<xsl:text>Table of Contents</xsl:text>
						</span>
					</h1>

					<p>
						<a href="#_Toc387846682">
							<span class="FontType TableOfContents">
								<xsl:text>1.  &#160; &#160; Introduction</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846683">
							<span class="FontType TableOfContents">
								<xsl:text>2.  &#160; &#160; Physical Model</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846692">
							<span class="FontType TableOfContents">
								<xsl:text>3.  &#160; &#160; Service Interaction Requirements</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846693">
							<span class="FontType TableOfContents">
								<xsl:text>4.  &#160; &#160; Interface Description Requirements</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846702">
							<span class="FontType TableOfContents">
								<xsl:text>5.  &#160; &#160; Message Exchange Patterns</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846703">
							<span class="FontType TableOfContents">
								<xsl:text>6.  &#160; &#160; Message Definition Mechanisms</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846704">
							<span class="FontType TableOfContents">
								<xsl:text>7.  &#160; &#160; Policy and Contracts</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846705">
							<span class="FontType TableOfContents">
								<xsl:text>7.1 &#160; &#160; Policies</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846706">
							<span class="FontType TableOfContents">
								<xsl:text>7.2 &#160; &#160; Automated Service Contracts</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846707">
							<span class="FontType TableOfContents">
								<xsl:text>7.3 &#160; &#160; Non-automated Service Contracts</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846708">
							<span class="FontType TableOfContents">
								<xsl:text>8.  &#160; &#160; Umbrella Agreements</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846709">
							<span class="FontType TableOfContents">
								<xsl:text>9. &#160; &#160; Security</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846710">
							<span class="FontType TableOfContents">
								<xsl:text>10. &#160; &#160; Privacy</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846711">
							<span class="FontType TableOfContents">
								<xsl:text>11. &#160; &#160; Service Testing</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846712">
							<span class="FontType TableOfContents">
								<xsl:text>Appendix A &#160; &#160; References</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846713">
							<span class="FontType TableOfContents">
								<xsl:text>Appendix B &#160; &#160; Glossary</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846714">
							<span class="FontType TableOfContents">
								<xsl:text>Appendix C &#160; &#160; Document History</xsl:text>
							</span>
						</a>
					</p>

					<br/>
					<br/>
					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846682">
							<span class="FontType FontType Heading1">
								<xsl:text>1. &#160; &#160; Introduction</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText"
								><xsl:text> A Service Interface Description describes the physical implementation or service interface used in a
							specific implementation of a service. This document is a Service Interface Description for the </xsl:text><xsl:value-of
								select="graa:ReturnValue('$_arg_ServiceName_',/graa:ServiceDescription[1]/@name)"/> (<xsl:value-of
								select="graa:ReturnValue('$_arg_ServiceAbbreviation_',/graa:ServiceDescription[1]/@serviceNameAbbreviationText)"
								/>)<xsl:text> Interface.</xsl:text>

							<xsl:if test="service/serviceProvider/@name">
								<p>
									<span class="FontType NormalText">
										<xsl:text>Provided by </xsl:text><xsl:value-of select="service/serviceProvider/@name"/><xsl:text>.</xsl:text>
									</span>
								</p>
							</xsl:if>
						</span>
					</p>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text> In the context of the GRA and Service-Oriented Architecture (SOA) in general, a service is the means by
							which one partner gains access to one or more capabilities offered by another partner.  Capabilities generate real-world effects that
							can be as simple as sharing information or can involve performing a function as part of a complex process or changing the state of other
							related processes.  Government organizations have numerous capabilities and a multitude of partner organizations, both inside and
							outside of their traditional communities.  There are significant benefits for these organizations to share information and have access
							to each other's capabilities.  Achieving interoperability among these organizations requires alignment of business and technical
							requirements and capabilities.  In addition, it is critical to have a consistent way of specifying these requirements and capabilities
							and sharing them across organizational boundaries.  The GRA was developed to facilitate interoperability and to assist in meeting other
							key requirements common in a complex government information sharing environment.  In order to achieve interoperability, a consistent
							approach must be defined to identify, describe, and package services and their interactions in many different technical environments,
							across multiple government lines of business, at all levels of government, and with partner organizations. </xsl:text>
						</span>
					</p>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text> The GRA defines a service interface as “the means for interacting with a service.”  It includes
							specific protocols, commands, and information exchange by which actions are initiated on the service.  A service interface is what a
							system designer or implementer (programmer) uses to design or build executable software that interacts with the service.  That is, the
							service interface represents the “how” of the interaction.  Since the service interface is the physical manifestation of the service,
							best practices call for service interfaces which can be described in an open-standard, machine-referenceable format (that is, a format
							which could be automatically processed by a computer).</xsl:text>
						</span>
					</p>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text> A Service Specification is a formal document describing the capabilities made available through the
							service; the service model that defines the semantics of the service by representing its behavioral model, information model, and
							interactions; the policies that constrain the use of the service; and the service interfaces which provide a means to interacting with
							the service.  A Service Specification is analogous to the software documentation of an Application Programming Interface $api.  It
							provides stakeholders with an understanding of the structure of the service and the rules applicable to its implementation.  It gives
							service consumers the information necessary for consuming a particular service and service providers the information necessary for
							implementing the service in a consistent and interoperable way. </xsl:text>
						</span>
					</p>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text> The main components of a Service Specification are the Service Description, one or more Service
							Interface Descriptions, and the schemas and the samples used to implement and test the service. </xsl:text>
						</span>
					</p>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text> A Service Description contains information about all aspects of the service which are not directly tied
							to the physical implementation of the service; in other words, the service interface.  A Service Interface Description is a description
							of the physical implementation; specifically, the service interface used in a specific implementation of the service.  Since a service
							can leverage multiple Service Interfaces, the Service Specification might contain more than one Service Interface Description.</xsl:text>
						</span>
					</p>

					<br/>
					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846683">
							<span class="FontType Heading1">
								<xsl:text>2. &#160; &#160; Physical Model</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_PhysicalModel_',/graa:ServiceDescription[1]/physicalModel[1], 'The Physical Model section describes the technical implementation (physical model) of the service implemented via the described service interface (e.g., Web Services definition, schema, electronic policies, and performance/quality of service metrics or other similar structures).  The physical model should sufficiently describe the set of actions implemented by the service interface and the physical endpoint(s) for accessing these actions.  This section will also include any relevant details of the Service Interaction Profile (SIP) that will govern how the service interaction requirements of the service will be met.  The physical model described in this document will also provide details regarding the message schema(s) for the information model of the service.  &lt;br/> &lt;br/> Additional artifacts related to this sections content can be provided in the artifacts folder of the service package or the schema folder of the service package.  &lt;br/> &lt;br/>  &#160;  &#160;  [Service Abbreviation] SSP [Service Version]\artifacts &lt;br/>  &#160;  &#160;  &#160;  or  &lt;br/>  &#160;  &#160;  [Service Abbreviation] SSP [Service Version]\schema')"
							/>
						</span>
					</p>

					<br/>
					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846692">
							<span class="FontType Heading1">
								<xsl:text>3. &#160; &#160; Service Interaction Requirements</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text>The table below outlines the service interaction requirements and the associated standards that are
							being used to support this service interface.</xsl:text>
						</span>
					</p>

						<br/>
						<span class="FontType Heading3">
							<xsl:value-of select="graa:ReturnValue('$_arg_Description_',@name)"/>
						</span>
						<br/>
					<br/>
					<xsl:call-template name="gra_ssp_util_sir_table"/>			
					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846693">
							<span class="FontType Heading1">
								<xsl:text>4. &#160; &#160; Service Interoperability Requirements</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_ServiceInteroperabilityRequirements_',/graa:ServiceDescription[1]/serviceInteroperabilityRequirements[1], 'The service will comply with GRA Reliable Secure Web Services, Service Interaction Profile v1.2 (GRA RS WS-SIP 1.2). &lt;br/> &lt;br/> Additional artifacts related to the Service Interoperability Requirements are provided in the service interface description artifacts folder of the service package. &lt;br/> &lt;br/>  &#160; [Service Abbreviation] SSP [Service Version]\service interface description\[n]\artifacts')"
							/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846702">
							<span class="FontType Heading1">
								<xsl:text>5. &#160; &#160; Message Exchange Patterns</xsl:text>
							</span>
						</a>
					</h1>
					<br/>
					<table class="MsoNormalTable" style="margin-left:70pt; border-collapse:collapse;border:none">
						<tr style="height:.3in">
							<td class="tDataTable tDataTableHeader" style="width:175.0pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Interface</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableHeader" style="width:67.5pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Operation</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableHeader" style="width:67.5pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Pattern</xsl:text>
								</span>
							</td>
						</tr>
							<xsl:for-each select="service">
								<xsl:for-each select="port">
									<xsl:for-each select="interface[1]/operation">
										<tr style="height:.3in">
											<td class="tDataTable">
												<span class="FontType tDataTableTextTitle">
													<xsl:value-of select="../@name"/>
												</span>
											</td>
											<td class="tDataTable">
												<i>
													<span class="FontType tDataTableText">
														<xsl:value-of select="@name"/>
													</span>
												</i>
											</td>
											<td class="tDataTable">
												<i>
													<span class="FontType tDataTableText">
														<xsl:value-of select="@messageExchangePattern"/>
													</span>
												</i>
											</td>
										</tr>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
						
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="3">
								<xsl:text>Table </xsl:text>
								<xsl:value-of select="count(/graa:ServiceDescription[1]/serviceInterface) + 1"/>
								<xsl:text> : Action Model</xsl:text>
							</td>
						</tr>
					</table>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846703">
							<span class="FontType Heading1">
								<xsl:text>6. &#160; &#160; Message Definition Mechanisms</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_MessageDefinitionMechanisms_',/graa:ServiceDescription[1]/messageDefinitionMechanisms[1], 'The service will comply with the message definition mechanisms identified in the GRA Reliable Secure Web Services Service Interaction Profile, Version 1.2 (GRA RS WS-SIP 1.2). &lt;br/> &lt;br/> Additional artifacts related to the message definition mechanism is provided in the artifacts folder of the service package. &lt;br/> &lt;br/>  &#160; [Service Abbreviation] SSP [Service Version]\artifacts')"
							/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846704">
							<span class="FontType Heading1">
								<xsl:text>7 &#160; &#160; Policy and Contracts</xsl:text>
							</span>
						</a>
					</h1>

					<h1>
						<a id="_Toc387846705">
							<span class="FontType Heading2">
								<xsl:text>7.1 &#160; &#160; Automated Service Policies</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_Policies_',/graa:ServiceDescription[1]/automatedServicePolicies[1], 'No automated polices have been identified at this time.')"
							/>
						</span>
					</p>

					<h1>
						<a id="_Toc387846706">
							<span class="FontType Heading2">
								<xsl:text>7.2 &#160; &#160; Automated Service Contracts</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_AutomatedServiceContracts_',/graa:ServiceDescription[1]/automatedServiceContracts[1], 'Web Services Description Language (WSDL) defines an automated service contract. No automated service contracts exist beyond those specified in the WSDLs.')"
							/>
						</span>
					</p>

					<h1>
						<a id="_Toc387846707">
							<span class="FontType Heading2">
								<xsl:text>7.3 &#160; &#160; Non-automated Service Plicies and Contracts</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_NonAutomatedServiceContracts_',/graa:ServiceDescription[1]/nonAutomatedServicePoliciesAndContracts[1], 'No non-automated service contracts have been identified at this time.')"
							/>
						</span>
					</p>

					<h1>
						<a id="_Toc387846708">
							<span class="FontType Heading1">
								<xsl:text>8. &#160; &#160; Umbrella Agreements</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_UmbrellaAgreements_',/graa:ServiceDescription[1]/serviceLevelAgreement[1]/umbrellaAgreement[1]/@agreementDescriptionText, 'No umbrella agreements have been identified at this time.')"
							/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846709">
							<span class="FontType Heading1">
								<xsl:text>9. &#160; &#160; Security</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_Security_',/graa:ServiceDescription[1]/security[1]/@documentation, 'The service must adhere to the rules of the CJIS Security Policies regarding the Advanced Encryption Standard (AES) level of encryption. The use of Virtual Private Networks (VPNs) or Secure Sockets Layer (SSL) for transport-level security in addition to these requirements is optional.')"
							/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846710">
							<span class="FontType Heading1">
								<xsl:text>10. &#160; &#160; Privacy</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_Privacy_',/graa:ServiceDescription[1]/privacy[1]/@documentation, 'The MOUs between participating entities will further define specific privacy requirements.  Global has developed a document,  “Implementing Privacy Policy in Justice Information Sharing: A Technical Framework”   This document is intended to provide guidelines for supporting the electronic expression of privacy policy and how to convert privacy policy so that it is understandable to computers and software.')"
							/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846711">
							<span class="FontType Heading1">
								<xsl:text>11. &#160; &#160; Service Testing</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_ServiceTesting_',/graa:ServiceDescription/serviceTesting, 'The service validation and testing will leverage the Springboard specification to validate the interoperable aspects of the service interface specification in order to assert that a participating system conforms to the underlying specification. The conformance specification and the associated test cases define a series of tests designed to exercise each interoperability aspect of the specification at least once. The validation testing is not intended to address functional aspects of the systems/services nor is the test suite designed to verify the robustness or performance of the interface software.')"
							/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846712">
							<span class="FontType Heading1">
								<xsl:text>Appendix A &#160; &#160; References</xsl:text>
							</span>
						</a>
					</h1>

					<table style="margin-left:70pt; ">
						<tr style="height:.5in">
							<td>
								<span class="FontType" style="width:100px">
									<b>
										<xsl:text>GRA</xsl:text>
									</b>
								</span>
							</td>
							<td style="width:50px"/>
							<td>
								<a href="https://it.ojp.gov/gra">
									<span class="FontType">
										<xsl:text>Global Reference Architecture (GRA) Specification, Version 1.9.1</xsl:text>
									</span>
								</a>
							</td>
						</tr>
						<tr style="height:.5in">
							<td>
								<span class="FontType" style="width:100px">
									<b>
										<xsl:text>GRA SSG</xsl:text>
									</b>
								</span>
							</td>
							<td style="width:50px"/>
							<td>
								<a href="https://it.ojp.gov/gist/43/The-Global-Reference-Architecture--GRA--Service-Specification-Guideline-V-1-0-0">
									<span class="FontType">
										<xsl:text>GRA Service Specification Guideline, Version 1.0.0</xsl:text>
									</span>
								</a>
							</td>
						</tr>
						<tr style="height:.5in">
							<td>
								<span class="FontType" style="width:100px">
									<b>
										<xsl:text>WS-SIP</xsl:text>
									</b>
								</span>
							</td>
							<td style="width:50px"/>
							<td>
								<a href="https://it.ojp.gov/gist/56/Global-Reference-Architecture--GRA--Web-Services-Service-Interaction-Profile-Version-1-3">
									<span class="FontType">
										<xsl:text>GRA Web Services Service Interaction Profile, Version 1.3</xsl:text>
									</span>
								</a>
							</td>
						</tr>
						<tr style="height:.5in">
							<td>
								<span class="FontType" style="width:100px">
									<b>
										<xsl:text>RS WS-SIP</xsl:text>
									</b>
								</span>
							</td>
							<td style="width:50px"/>
							<td>
								<a href="https://it.ojp.gov/gist/85/Global-Reference-Architecture--GRA--Reliable-Secure-Web-Services-Service-Interaction-Profile">
									<span class="FontType">
										<xsl:text>GRA Reliable Secure Web Services Service Interaction Profile, Version 1.2</xsl:text>
									</span>
								</a>
							</td>
						</tr>
						<tr style="height:.5in">
							<td>
								<span class="FontType" style="width:100px">
									<b>
										<xsl:text>WS-I BP</xsl:text>
									</b>
								</span>
							</td>
							<td style="width:50px"/>
							<td>
								<a href="http://ws-i.org/profiles/basicprofile-1.2-2010-11-09.html">
									<span class="FontType">
										<xsl:text>WS-I Basic Profile, Version 1.2, 2010-11-09</xsl:text>
									</span>
								</a>
							</td>
						</tr>
						<tr style="height:.5in">
							<td>
								<span class="FontType" style="width:100px">
									<b>
										<xsl:text>WS-I BSP</xsl:text>
									</b>
								</span>
							</td>
							<td style="width:50px"/>
							<td>
								<a href="http://www.ws-i.org/Profiles/BasicSecurityProfile-1.0.html">
									<span class="FontType">
										<xsl:text>WS-I Basic Security Profile, Working Group Draft, March 30, 2007</xsl:text>
									</span>
								</a>
							</td>
						</tr>
						<tr style="height:.5in">
							<td>
								<span class="FontType" style="width:100px">
									<b>
										<xsl:text>WS-I RSP</xsl:text>
									</b>
								</span>
							</td>
							<td style="width:50px"/>
							<td>
								<a href="http://www.ws-i.org/Profiles/ReliableSecureProfile-1.0-2010-11-09.html">
									<span class="FontType">
										<xsl:text>Reliable Secure Profile Version 1.0, 2010-11-09</xsl:text>
									</span>
								</a>
							</td>
						</tr>
					</table>

					<br style="page-break-before:always"/>
					<h2>
						<a id="_Toc387846713">
							<span class="FontType Heading1">
								<xsl:text>Appendix B &#160; &#160; Glossary</xsl:text>
							</span>
						</a>
					</h2>

					<table class="MsoNormalTable" style="margin-left:70pt; border-collapse:collapse;">
						<tr style="height:.3in">
							<td class="tDataTable tDataTableHeader" style="width:55pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Acronym</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableHeader" style="width:275pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Description</xsl:text>
								</span>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>GRA</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>Global Reference Architecture</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTable">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>GRA SSG</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTable">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>GRA Service Specification Guideline</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>NIEM</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>National Information Exchange Model</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>OASIS</xsl:text>
								</span>
							</td>
							<td class="tDataTable">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>OASIS Organization for the Advancement of Structured Information Standards</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>RS WS SIP</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>GRA Reliable Secure Web Services Service Interaction Profile</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>SOAP</xsl:text>
								</span>
							</td>
							<td class="tDataTable">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>Simple Object Access Protocol</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>W3C</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>World Wide Web Consortium</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>WS</xsl:text>
								</span>
							</td>
							<td class="tDataTable">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>Web Services</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>WS-SIP</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>GRA Web Services Service Interaction Profile</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>WSDL</xsl:text>
								</span>
							</td>
							<td class="tDataTable">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>Web Services Description Language</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>XML</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText">
										<xsl:text>eXtensible Markup Language</xsl:text>
									</span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="2">
								<xsl:text>Table </xsl:text>
								<xsl:value-of select="count(/graa:ServiceDescription[1]/serviceInterface) + 2"/>
								<xsl:text>: Acronym Descriptions</xsl:text>
							</td>
						</tr>
					</table>

					<br style="page-break-before:always"/>
					<h2>
						<a id="_Toc387846714">
							<span class="FontType Heading1">
								<xsl:text>Appendix C &#160; &#160; Document History</xsl:text>
							</span>
						</a>
					</h2>

					<table class="MsoNormalTable" style="margin-left:70pt; ">
						<tr style="height:.3in">
							<td class="tDataTable tDataTableHeader" style="width:75pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Date</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableHeader" style="width:50pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Version</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableHeader" style="width:125pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Editor</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableHeader" style="width:150pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Change</xsl:text>
								</span>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle"/>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTable">
								<span class="FontType tDataTableTextTitle"/>
							</td>
							<td class="tDataTable tDataTable">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
							<td class="tDataTable tDataTable">
								<span class="FontType tDataTableTextTitle"/>
							</td>
							<td class="tDataTable tDataTable">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle"/>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"/>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="4">
								<xsl:text>Table </xsl:text>
								<xsl:value-of select="count(/graa:ServiceDescription[1]/serviceInterface) + 3"/>
								<xsl:text>: Document Revision History</xsl:text>
							</td>
						</tr>
					</table>
				</div>
			</body>
		</html>
		</xsl:result-document>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>
