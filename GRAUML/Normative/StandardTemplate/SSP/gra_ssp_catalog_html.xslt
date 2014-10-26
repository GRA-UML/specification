<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:graa="http://ijis.org/GRA/Annotations"
	exclude-result-prefixes="graa">
	<xsl:output method="html" indent="yes"/>	
	<xsl:include href="./artifacts/various%20artifacts/other/xslt%20utilities/gra_ssp_css.xslt"/>
	<xsl:template match="/graa:ServiceDescription">
		<xsl:variable name="versionInfo" select="concat((@majorVersion, 0)[1],'.',(@minorVersion, 0)[1],'.0')"/>

		<xsl:result-document href="catalog.html">

			<html xmlns="http://www.w3.org/1999/xhtml" xmlns:rddl="http://www.rddl.org/" xml:lang="en">
				<head>
					<title>Service Specification Catalog Template</title>
					<link href="http://www.rddl.org/xrd.css" type="text/css" rel="stylesheet"/>					
					<xsl:call-template name="css"/>
				</head>
				<body>
					<h1><xsl:value-of select="concat(@name, '  (', @serviceNameAbbreviationText, ')  ', $versionInfo)"/> 
					<br/>Service Specification</h1>
					<h3>Summary</h3>
					<p class="MsoNormalText">
						<span class="FontType NormalText">					
							<xsl:value-of select="@serviceDescriptionSummaryText"/>
						</span>
					</p>
					<p/>
					<h3>Description</h3>
					<p class="MsoNormalText">
						<span class="FontType NormalText">	
							<xsl:value-of select="@documentation"/>
						</span>
					</p>
					<h3>Details</h3>
					<table class="MsoNormalTable" style="margin-left:70pt; ">
						<tr style="height:.3in">
							<td class="tDataTable tDataTableHeader" style="width:75pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Key</xsl:text>
								</span>
							</td>
							<td class="tDataTable tDataTableHeader" style="width:50pt;">
								<span class="FontType tDataTableTextTitle">
									<xsl:text>Value</xsl:text>
								</span>
							</td>
						</tr>						
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">Service Name</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="@serviceNameAbbreviationText"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTable">
								<span class="FontType tDataTableTextTitle">Service URI</span>
							</td>
							<td class="tDataTable tDataTable">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="@serviceUri"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">Version Info</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="$versionInfo"/></span>
								</i>
							</td>
						</tr>						
						<tr style="height:.3in">
							<td class="tDataTable tDataTable">
								<span class="FontType tDataTableTextTitle">IEPD Name</span>
							</td>
							<td class="tDataTable tDataTable">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="iepdReference/@name"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">IEPD URI</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="iepdReference/@iepdurl"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="2">
								<xsl:text>Table 1: Service Details</xsl:text>
							</td>
						</tr>
					</table>
					<h2>Catalog Files</h2>
					<div class="resource" style="width:7.0in;">
						<ul>
							<li>
								<a href="catalog.html">Catalog</a>
							</li>
							<li>
								<a href="metadata.xml">Metadata</a>
							</li>
						</ul>
					</div>
					<h2>Service Description Documentation</h2>
					<div class="resource" style="width:7.0in;">
						<ul>
							<li>
								<a>
									<xsl:attribute name="href" select='concat("./artifacts/", @serviceNameAbbreviationText, "_SDD_v_", $versionInfo, ".xhtml")'/>
									<xsl:text>Service Description Document</xsl:text>
								</a>
							</li>
						</ul>
					</div>
					<h2>Service Interface Documentation</h2>
					<div class="resource" style="width:7.0in;">
						<ul>							
							<xsl:for-each select="serviceInterface">		
								<li>
									<a>
										<xsl:attribute name="href" select='concat("./artifacts/", upper-case(@serviceInterfaceNameAbbreviationText), "_SIDD_v_", $versionInfo, ".xhtml")'/>
										<xsl:text>Service Interface Description Document</xsl:text>
									</a>
								</li>
							</xsl:for-each>
						</ul>
					</div>
					<br/>
					<h2>Schema and Sample Files</h2>
					<h3>Web Service</h3>
					<div class="resource" style="width:7.0in;">
						<ul>
							<xsl:for-each select="serviceInterface">		
								<li>
									<a>
									<xsl:attribute name="href" select='concat("./schemas/sip/", @serviceInterfaceNameAbbreviationText, ".wsdl")' />
									<xsl:value-of select="@name"/><xsl:text> Web Service Definition</xsl:text>
									</a>
								</li>
							</xsl:for-each>
						</ul>
					</div>
					<h3>Information</h3>
					<div class="resource" style="width:7.0in;">
						<ul>
							<li>
								<a>
									<xsl:attribute name="href" select='concat("./artifacts/service model/information model/", iepdReference[1]/@name, "/catalog.xml")'/>
									<xsl:text>IEPD Catalog</xsl:text>									
								</a>
							</li>
						</ul>
					</div>					
					<h2>Organization and Point of Contact</h2>
					<table class="MsoNormalTable" style="margin-left:70pt; ">
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">Organization Name</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="relatedOrganization/@name"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTable">
								<span class="FontType tDataTableTextTitle">Organization Acronym</span>
							</td>
							<td class="tDataTable tDataTable">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="relatedOrganization/@organizationAcronym"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">Point Of Contact</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="relatedOrganization/organizationPointOfContact/@name"/></span>
								</i>
							</td>
						</tr>						
						<tr style="height:.3in">
							<td class="tDataTable tDataTable">
								<span class="FontType tDataTableTextTitle">POC Email Address</span>
							</td>
							<td class="tDataTable tDataTable">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="relatedOrganization/organizationPointOfContact/@contactPersonEmailId"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="tDataTable tDataTableRowAlt">
								<span class="FontType tDataTableTextTitle">POC Address</span>
							</td>
							<td class="tDataTable tDataTableRowAlt">
								<i>
									<span class="FontType tDataTableText"><xsl:value-of select="relatedOrganization/organizationPointOfContact/@contactPersonAddress"/></span>
								</i>
							</td>
						</tr>
						<tr style="height:.3in">
							<td class="FontType tDataTableCaption" colspan="2">
								<xsl:text>Table 2: Organization Information</xsl:text>
							</td>
						</tr>
					</table>					
				</body>
			</html>

		</xsl:result-document>
	</xsl:template>
</xsl:stylesheet>
