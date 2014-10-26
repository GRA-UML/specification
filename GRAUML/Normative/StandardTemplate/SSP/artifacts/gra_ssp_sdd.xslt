<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:graa="http://ijis.org/GRA/Annotations">
	<xsl:include href="./various%20artifacts/other/xslt%20utilities/gra_ssp_util_return.xslt"/>	
	<xsl:include href="./various%20artifacts/other/xslt%20utilities/gra_ssp_util_sir_table.xslt"/>
	<xsl:include href="./various%20artifacts/other/xslt%20utilities/gra_ssp_css.xslt"/>
	
	<xsl:template match="/">
		<!--<!DOCTYPE html>-->
		<xsl:variable name="versionInfo" select="concat((graa:ServiceDescription/@majorVersion, 0)[1],'.',(graa:ServiceDescription/@minorVersion, 0)[1],'.0')"/>	
		<xsl:variable name="fileLocation" select="concat(graa:ServiceDescription/@serviceNameAbbreviationText, '_SDD_v_', $versionInfo, '.xhtml')"/>	
		<xsl:result-document href="{lower-case($fileLocation)}">
		<html xmlns="http://www.w3.org/1999/xhtml">
			<head>
				<xsl:call-template name="css"/>
			</head>
			<body lang="EN-US">
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
								<xsl:text>Service</xsl:text>
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
											<xsl:value-of select="graa:ReturnValue('$_arg_PreparedFor_',//graa:ServiceDescription[1]/relatedOrganization[1]/@name)"/>
										</b>
									</p>
									<p class="FontType CoverPageRight">
										<b>
											<xsl:value-of select="graa:ReturnValue('$_arg_Prepared-By',//graa:ServiceDescription[1]/relatedOrganization[1]/@name)"/>
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
				<br style="page-break-after:always"/>
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
								<xsl:text>2.  &#160; &#160; Service Overview</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846684">
							<span class="FontType TableOfContents">
								<xsl:text>2.1 &#160; &#160; Purpose</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846685">
							<span class="FontType TableOfContents">
								<xsl:text>2.2 &#160; &#160; Scope</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846686">
							<span class="FontType TableOfContents">
								<xsl:text>2.3 &#160; &#160; Capabilities</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846687">
							<span class="FontType TableOfContents">
								<xsl:text>2.4 &#160; &#160; Real-World Effects</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846688">
							<span class="FontType TableOfContents">
								<xsl:text>2.5 &#160; &#160; Summary</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846689">
							<span class="FontType TableOfContents">
								<xsl:text>2.6 &#160; &#160; Description</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846690">
							<span class="FontType TableOfContents">
								<xsl:text>2.7 &#160; &#160; Security Classification</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846691">
							<span class="FontType TableOfContents">
								<xsl:text>2.8 &#160; &#160; Service Specification Package Version</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846692">
							<span class="FontType TableOfContents">
								<xsl:text>3.  &#160; &#160; Business Scenarios</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846693">
							<span class="FontType TableOfContents">
								<xsl:text>4.  &#160; &#160; Service Interoperability Requirements</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846694">
							<span class="FontType TableOfContents">
								<xsl:text>4.1 &#160; &#160; Service Interaction Requirements</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846695">
							<span class="FontType TableOfContents">
								<xsl:text>4.2 &#160; &#160; Service Assumptions</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846696">
							<span class="FontType TableOfContents">
								<xsl:text>4.3 &#160; &#160; Service Dependencies</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846697">
							<span class="FontType TableOfContents">
								<xsl:text>4.4 &#160; &#160; Execution Context</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846698">
							<span class="FontType TableOfContents">
								<xsl:text>4.5 &#160; &#160; Policies and Contracts</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846699">
							<span class="FontType TableOfContents">
								<xsl:text>4.6 &#160; &#160; Security</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846700">
							<span class="FontType TableOfContents">
								<xsl:text>4.7 &#160; &#160; Privacy</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846701">
							<span class="FontType TableOfContents">
								<xsl:text>4.8 &#160; &#160; Other Requirements</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846702">
							<span class="FontType TableOfContents">
								<xsl:text>5.  &#160; &#160; Additional Information</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846703">
							<span class="FontType TableOfContents">
								<xsl:text>6.  &#160; &#160; Service Model</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846704">
							<span class="FontType TableOfContents">
								<xsl:text>6.1 &#160; &#160; Information Model</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846705">
							<span class="FontType TableOfContents">
								<xsl:text>6.1.1 &#160; &#160; IEPD Reference</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846706">
							<span class="FontType TableOfContents">
								<xsl:text>6.1.2 &#160; &#160; Data Inputs</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846707">
							<span class="FontType TableOfContents">
								<xsl:text>6.1.3 &#160; &#160; Data Outputs</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846708">
							<span class="FontType TableOfContents">
								<xsl:text>6.1.4 &#160; &#160; Data Provenance</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846709">
							<span class="FontType TableOfContents">
								<xsl:text>6.2  &#160; &#160; Behavior Model</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846710">
							<span class="FontType TableOfContents">
								<xsl:text>6.2.1 &#160; &#160; Action Model</xsl:text>
							</span>
						</a>
					</p>
					<p>
						<a href="#_Toc387846711">
							<span class="FontType TableOfContents">
								<xsl:text>6.2.2 &#160; &#160; Process Model</xsl:text>
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
								><xsl:text> This Service Description Document describes information about all aspects of the </xsl:text><xsl:value-of
								select="graa:ReturnValue('$_arg_ServiceName_',//graa:ServiceDescription[1]/@name)"/> (<xsl:value-of
								select="graa:ReturnValue('$_arg_ServiceAbbreviation_',/graa:ServiceDescription[1]/@serviceNameAbbreviationText)"/>)
							<xsl:text>service which are not directly tied to the physical implementation.</xsl:text></span>
					</p>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text>In the context of the GRA and Service-Oriented Architecture $soa in general, a service is the means by
							which one partner gains access to one or more capabilities offered by another partner.  Capabilities generate real-world effects that
							can be as simple as sharing information or can involve performing a function as part of a complex process or changing the state of other
							related processes.  Government organizations have numerous capabilities and a multitude of partner organizations, both inside and
							outside of their traditional communities.  There are significant benefits for these organizations to share information and have access
							to each other's capabilities.  Achieving interoperability among these organizations requires alignment of business and technical
							requirements and capabilities.  In addition, it is critical to have a consistent way of specifying these requirements and capabilities
							and sharing them across organizational boundaries.  The GRA was developed to facilitate interoperability and to assist in meeting other
							key requirements common in a complex government information sharing environment.  In order to achieve interoperability, a consistent
							approach must be defined to identify, describe, and package services and their interactions in many different technical environments,
							across multiple government lines of business, at all levels of government, and with partner organizations.</xsl:text>
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
								<xsl:text>2. &#160; &#160; Service Overview</xsl:text>
							</span>
						</a>
					</h1>
					<h2>
						<a id="_Toc387846684">
							<span class="FontType Heading2">
								<xsl:text>2.1 &#160; &#160; Purpose</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text> The purpose of this service is to support the establishment and operation of automated </xsl:text>
							<xsl:value-of select="graa:ReturnValue('$_arg_ServiceName_',//graa:ServiceDescription[1]/@name)"/> (<xsl:value-of
								select="graa:ReturnValue('$_arg_ServiceAbbreviation_',/graa:ServiceDescription[1]/@serviceNameAbbreviationText)"/>)
							<xsl:text> service capabilities.  This document describes the basic functions comprising the information sharing process.  This service specification
							enables interoperable information exchange between system implementations.</xsl:text>
						</span>
					</p>

					<h2>
						<a id="_Toc387846685">
							<span class="FontType Heading2">
								<xsl:text>2.2 &#160; &#160; Scope</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_Scope_',/graa:ServiceDescription[1]/serviceScopeDescription[1]/@documentation)"/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846686">
							<span class="FontType Heading2">
								<xsl:text>2.3 &#160; &#160; Capabilities</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:for-each select="//graa:ServiceDescription[1]/serviceCapability">
								<li class="Bullet">
									<xsl:value-of disable-output-escaping="yes" select="graa:ReturnValue('$_arg_Capabilities_',@documentation)"/>
								</li>
							</xsl:for-each>
						</span>
					</p>

					<h2>
						<a id="_Toc387846687">
							<span class="FontType Heading2">
								<xsl:text>2.4 &#160; &#160; Real-World Effects</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:for-each select="/graa:ServiceDescription[1]/realWorldEffect">
								<li class="Bullet">
									<xsl:value-of disable-output-escaping="yes" select="graa:ReturnValue('$_arg_RealWorldEffects_',@name)"/>
								</li>
								<xsl:if test="provider/@name">
									<div style="margin-left:5em;">
										<b>Provider: </b><xsl:value-of select="provider/@name"/>
										<xsl:for-each select="provider/generalization">
											<xsl:value-of select="concat(' a kind of ', @name)"/>
										</xsl:for-each>
									</div>
									<div style="margin-left:7em;">
										<xsl:value-of select="provider/@documentation"/>
									</div>
								</xsl:if>
								<xsl:if test="consumer/@name">
									<div style="margin-left:5em;">
										<b>Consumer: </b><xsl:value-of select="consumer/@name"/>
										<xsl:for-each select="consumer/generalization">
											<xsl:value-of select="concat(' a kind of ', @name)"/>
										</xsl:for-each>
									</div>
									<div style="margin-left:7em;">
										<xsl:value-of select="consumer/@documentation"/>
									</div>
								</xsl:if>
								<xsl:if test="provider/@name or consumer/@name">
									<br/>
								</xsl:if>
							</xsl:for-each>
						</span>
					</p>
					<h2>
						<a id="_Toc387846688">
							<span class="FontType Heading2">
								<xsl:text>2.5 &#160; &#160; Summary</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_ServiceSummary_',//graa:ServiceDescription[1]/@serviceDescriptionSummaryText)"/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846689">
							<span class="FontType Heading2">
								<xsl:text>2.6 &#160; &#160; Description</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_Description_',/graa:ServiceDescription[1]/servicePurpose[1]/@documentation)"/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846690">
							<span class="FontType Heading2">
								<xsl:text>2.7 &#160; &#160; Security Classification</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_SecurityClassification_',/graa:ServiceDescription[1]/serviceSecurityClassification[1]/@name, 'The highest level of security classification for the information exchanged by this service is Sensitive but Unclassified (SBU).  As a result the service can be assigned a security classification of SBU.')"
							/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846691">
							<span class="FontType Heading2">
								<xsl:text>2.8 &#160; &#160; Service Specification Package Version</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text>This service specification is built based on version</xsl:text>
							<xsl:value-of
								select="graa:ReturnValue('$_arg_SSPVersion_',//graa:ServiceDescription[1]/serviceInterface[serviceInteractionProfile/@sipVersion != ''][1]/serviceInteractionProfile/@sipVersion)"/>
							<xsl:text> of the GRA Service Speciatication Package (SSP)</xsl:text>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846692">
							<span class="FontType Heading1">
								<xsl:text>3. &#160; &#160; Business Scenarios</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_BusinessScenarios_',//graa:ServiceDescription[1]/businessScenarios[1], 'The Business Scenarios section is intended to provide additional high-level, details about the service, which may be supported by industry standard modeling notation where appropriate.  Again, care should be taken to be as clear and precise as possible and to define real scenarios that would be relevant to a significant number of organizations.  This section presents the conceptual model for the actions supported by the service. Refer to Section 6: Service Model for additional information.')"
							/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846693">
							<span class="FontType Heading1">
								<xsl:text>4. &#160; &#160; Service Interoperability Requirements</xsl:text>
							</span>
						</a>
					</h1>
					<h2>
						<a id="_Toc387846694">
							<span class="FontType Heading2">
								<xsl:text>4.1 &#160; &#160; Service Interaction Requirements</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text>The table below outlines the service interaction requirements and the associated standards that are
							being used to support this service interface.</xsl:text>
						</span>
					</p>

					<xsl:for-each select="//graa:ServiceDescription[1]/serviceInterface">
						<br/>
						<span class="FontType Heading3">
							<xsl:value-of select="graa:ReturnValue('$_arg_Description_',@name)"/>
						</span>
						<br/>
						<br/>
						<xsl:call-template name="gra_ssp_util_sir_table"/>
					</xsl:for-each>
					<h2>
						<a id="_Toc387846695">
							<span class="FontType Heading2">
								<xsl:text>4.2 &#160; &#160; Service Assumptions</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_ServiceAssumptions_',/graa:ServiceDescription[1]/serviceAssumption[1]/@documentation, 'N/A')"/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846696">
							<span class="FontType Heading2">
								<xsl:text>4.3 &#160; &#160; Service Dependencies</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_ServiceDependencies_',/graa:ServiceDescription[1]/serviceDependency[1]/@documentation, 'N/A')"/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846697">
							<span class="FontType Heading2">
								<xsl:text>4.4 &#160; &#160; Execution Context</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_ExecutionContext_',/graa:ServiceDescription[1]/executionContext[1]/@documentation, 'Service descriptions should include all information pertinent to the production or consumption of the service, including expected infrastructure functions and other dependencies.  No information directly pertaining to implementation platform or technology should be included in the service description.')"
							/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846698">
							<span class="FontType Heading2">
								<xsl:text>4.5 &#160; &#160; Policies and Contracts</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_PoliciesContracts_',/graa:ServiceDescription[1]/serviceLevelAgreement[1]/agreement[1]/@documentation, 'Service policies and contracts express rules that govern the interaction between a service consumer and a service.  A policy is an assertion by either a consumer or a service provider of that participant’s requirements for willingness to interact.  Policies state conditions, obligations, and constraints.  A contract is an agreement by the parties involved. Consumers of this service will be acting on behalf of a user.  Each user must be an authorized user and the message sent to this service from the consumer must provide information so the service can determine whether the user is an authorized user.  Participating entities will use memoranda of understanding (MOUs), nondisclosure agreements (NDAs), service-level agreements (SLAs), or other types of agency agreements as appropriate to document applicable policy requirements.  Global has developed GRA “Information Sharing Enterprise Service-Level Agreement” and “Information Sharing Enterprise Statement of Participation, Version 1.1” policy document templates that are available for developing policies.')"
							/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846699">
							<span class="FontType Heading2">
								<xsl:text>4.6 &#160; &#160; Security</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_Security_',/graa:ServiceDescription[1]/security[1]/@documentation, 'The service must adhere to the rules of the CJIS Security Policies regarding the Advanced Encryption Standard (AES) level of encryption. The use of Virtual Private Networks (VPNs) or Secure Sockets Layer (SSL) for transport-level security in addition to these requirements is optional.')"
							/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846700">
							<span class="FontType Heading2">
								<xsl:text>4.7 &#160; &#160; Privacy</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_Privacy_',//graa:ServiceDescription[1]/privacy[1]/@documentation, 'The MOUs between participating entities will further define specific privacy requirements.  Global has developed a document,  “Implementing Privacy Policy in Justice Information Sharing: A Technical Framework”   This document is intended to provide guidelines for supporting the electronic expression of privacy policy and how to convert privacy policy so that it is understandable to computers and software.')"
							/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846701">
							<span class="FontType Heading2">
								<xsl:text>4.8 &#160; &#160; Other Requirements</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_OtherRequirements_',//graa:ServiceDescription[1]/otherRequirement[1]/@documentation, 'N/A')"/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846702">
							<span class="FontType Heading1">
								<xsl:text>5. &#160; &#160; Additional Information</xsl:text>
							</span>
						</a>
					</h1>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_AdditionalInformation_',/graa:ServiceDescription[1]/additionalInformation[1]/@documentation, 'N/A')"/>
						</span>
					</p>

					<br style="page-break-before:always"/>
					<h1>
						<a id="_Toc387846703">
							<span class="FontType Heading1">
								<xsl:text>6. &#160; &#160; Service Model</xsl:text>
							</span>
						</a>
					</h1>
					<h2>
						<a id="_Toc387846704">
							<span class="FontType Heading2">
								<xsl:text>6.1 &#160; &#160; Information Model</xsl:text>
							</span>
						</a>
					</h2>

					<h2>
						<a id="_Toc387846705">
							<span class="FontType Heading3">
								<xsl:text>6.1.1 &#160; &#160; IEPD Reference</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text>This uses the Information Exchange Package Documentation (IEPD) for all messages exchanged by the
							service. The IEPD is included in its entirety in the artifacts/service model/information model folder of the Service Specification
							Package.</xsl:text>
						</span>
					</p>

					<h2>
						<a id="_Toc387846706">
							<span class="FontType Heading3">
								<xsl:text>6.1.2 &#160; &#160; Data Inputs</xsl:text>
							</span>
						</a>
					</h2>
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
							<td class="tDataTable tDataTableHeader" style="width:157.5pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Input</xsl:text>
								</span>
							</td>
						</tr>
						<xsl:for-each select="//graa:ServiceDescription[1]/serviceInterface">
							<xsl:for-each select="service">
								<xsl:for-each select="port">
									<xsl:for-each select="interface[1]/operation">
										<xsl:for-each select="parameter">
											<xsl:if test="@use = 'in'">
												<tr style="height:.3in">
													<td class="tDataTable">
														<span class="FontType tDataTableTextTitle">
															<xsl:value-of select="../../@name"/>
														</span>
													</td>
													<td class="tDataTable">
														<i>
															<span class="FontType tDataTableText">
																<xsl:value-of select="../@name"/>
															</span>
														</i>
													</td>
													<td class="tDataTable">
														<i>
															<span class="FontType tDataTableText">
																<xsl:value-of select="message/@name"/>
															</span>
														</i>
													</td>
												</tr>
											</xsl:if>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
						</xsl:for-each>
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="3">
								<xsl:text>Table </xsl:text>
								<xsl:value-of select="count(//graa:ServiceDescription[1]/serviceInterface) + 1"/>
								<xsl:text> : Data Inputs</xsl:text>
							</td>
						</tr>
					</table>

					<h2>
						<a id="_Toc387846707">
							<span class="FontType Heading3">
								<xsl:text>6.1.3 &#160; &#160; Data Outputs</xsl:text>
							</span>
						</a>
					</h2>
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
							<td class="tDataTable tDataTableHeader" style="width:157.5pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Output</xsl:text>
								</span>
							</td>
						</tr>
						<xsl:for-each select="//graa:ServiceDescription[1]/serviceInterface">
							<xsl:for-each select="service">
								<xsl:for-each select="port">
									<xsl:for-each select="interface[1]/operation">
										<xsl:for-each select="parameter">
											<xsl:if test="@use = 'out'">
												<tr style="height:.3in">

													<!--<xsl:attribute name="class">
												  <xsl:choose>
													<xsl:when test="position() mod 2 = 0">
													  <xsl:text>tDataTable tDataTableRowAlt</xsl:text>
													</xsl:when>
													<xsl:otherwise>
													  <xsl:text>tDataTable</xsl:text>
													</xsl:otherwise>
												  </xsl:choose>
												</xsl:attribute>-->

													<td class="tDataTable">
														<span class="FontType tDataTableTextTitle">
															<xsl:value-of select="../../@name"/>
														</span>
													</td>
													<td class="tDataTable">
														<i>
															<span class="FontType tDataTableText">
																<xsl:value-of select="../@name"/>
															</span>
														</i>
													</td>
													<td class="tDataTable">
														<i>
															<span class="FontType tDataTableText">
																<xsl:value-of select="message/@name"/>
															</span>
														</i>
													</td>
												</tr>
											</xsl:if>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
						</xsl:for-each>
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="3">
								<xsl:text>Table </xsl:text>
								<xsl:value-of select="count(//graa:ServiceDescription[1]/serviceInterface) + 2"/>
								<xsl:text> : Data Outputs</xsl:text>
							</td>
						</tr>
					</table>

					<h2>
						<a id="_Toc387846708">
							<span class="FontType Heading3">
								<xsl:text>6.1.4 &#160; &#160; Data Provenance</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_DataProvenance_',//graa:ServiceDescription[1]/dataProvenance[1], 'Provenance is defined as the agency, office, or person of origin of records, i.e., the entity that created, received, or accumulated and used the records in the conduct of their business activities.  All applicable provenance information or restrictions are provided below.  Also, additional artifacts related to this sections content can be provided in the service model folders of the service package. [Service Abbreviation] SSP [Service Version]\artifacts\service model\information model')"
							/>
						</span>
					</p>

					<h2>
						<a id="_Toc387846709">
							<span class="FontType Heading2">
								<xsl:text>6.2  &#160; &#160; Behavior Model</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:text>The behavior model, which consists of two components—action model and process model, describes the
							behavior of the service.</xsl:text>
						</span>
					</p>
					<h2>
						<a id="_Toc387846710">
							<span class="FontType Heading3">
								<xsl:text>6.2.1 &#160; &#160; Action Model</xsl:text>
							</span>
						</a>
					</h2>
					<table class="MsoNormalTable" width="575" style="margin-left:70pt; border-collapse:collapse;border:none">
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
						</tr>
						<xsl:for-each select="//graa:ServiceDescription[1]/serviceInterface">
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
										</tr>
										<xsl:if test="@actionProvenance">
											<tr style="height:.3in">
												<td class="tDataTable tDataTableRowAlt" colspan="2">
													<span class="FontType tDataTableText">
														<b>Action Provenance: </b><xsl:value-of select="@actionProvenance"/>
													</span>
												</td>
											</tr>
										</xsl:if>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
						</xsl:for-each>
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="3">
								<xsl:text>Table </xsl:text>
								<xsl:value-of select="count(//graa:ServiceDescription[1]/serviceInterface) + 3"/>
								<xsl:text> : Action Model</xsl:text>
							</td>
						</tr>
					</table>

					<h2>
						<a id="_Toc387846711">
							<span class="FontType Heading3">
								<xsl:text>6.2.2 &#160; &#160; Process Model</xsl:text>
							</span>
						</a>
					</h2>
					<p class="MsoNormalText">
						<span class="FontType NormalText">
							<xsl:value-of disable-output-escaping="yes"
								select="graa:ReturnValue('$_arg_ProcessModel_',//graa:ServiceDescription[1]/processModel[1], 'Process models define how consumers may invoke the services actions together or in a sequence to accomplish some larger business process.  The section should not describe the process of interaction among multiple services within a business process.  All processing model profile artifacts used to describe the service should be made available in the behavior model folder of the respective service package folder. &lt;br/> &lt;br/>  Additional artifacts related to this sections content can be provided in the service model folders of the service package. &lt;br/> &lt;br/>  &lt;li> [Service Abbreviation] SSP [Service Version]\artifacts\service model\behavior model &lt;/li> &lt;br/>  If such artifacts are provided,  they should be referenced in this section. A description of the artifact and a link to it should be provided as part of the reference.')"
							/>
						</span>
					</p>
					<br style="page-break-after:always"/>
					<br style="page-break-before:always"/>
					<h2>
						<a id="_Toc387846712">
							<span class="FontType Heading1">
								<xsl:text>Appendix A &#160; &#160; References</xsl:text>
							</span>
						</a>
					</h2>

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
								<xsl:value-of select="count(//graa:ServiceDescription[1]/serviceInterface) + 4"/>
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
								<xsl:value-of select="count(//graa:ServiceDescription[1]/serviceInterface) + 5"/>
								<xsl:text>: Document Revision History</xsl:text>
							</td>
						</tr>
					</table>
				</div>
			</body>
		</html>
		</xsl:result-document>
	</xsl:template>
</xsl:stylesheet>
