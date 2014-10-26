<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:graa="http://ijis.org/GRA/Annotations" exclude-result-prefixes="graa">
	<xsl:include href="gra_ssp_util_sir.xslt"/>
	<xsl:template name="gra_ssp_util_sir_table">
		<table xmlns="http://www.w3.org/1999/xhtml" class="MsoNormalTable" style="margin-left:70pt; border-collapse:collapse;border:none">
			<tr style="height:.3in">
				<td class="tDataTable tDataTableHeader" style="width:125pt;">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Requirements</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableHeader" style="width:45pt;">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Mandatory</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableHeader" style="width:150pt;">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Specification</xsl:text>
					</span>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable tDataTableRowAlt">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Service Consumer Authentication</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_00',requirement/@serviceConsumerAuthentication,//graa:ServiceDescription[1]/requirement[1]/@serviceConsumerAuthentication)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_00',requirement/@serviceConsumerAuthentication,//graa:ServiceDescription[1]/requirement[1]/@serviceConsumerAuthentication)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Service Consumer Authorization</xsl:text>
					</span>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_01',requirement/@serviceConsumerAuthorization,//graa:ServiceDescription[1]/requirement[1]/@serviceConsumerAuthorization)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_01',requirement/@serviceConsumerAuthorization,//graa:ServiceDescription[1]/requirement[1]/@serviceConsumerAuthorization)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable tDataTableRowAlt">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Identity and Attribute Assertion Transmission</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_02',requirement/@identityAndAttributeAssertionTransmission,//graa:ServiceDescription[1]/requirement[1]/@identityAndAttributeAssertionTransmission)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_02',requirement/@identityAndAttributeAssertionTransmission,//graa:ServiceDescription[1]/requirement[1]/@identityAndAttributeAssertionTransmission)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Service Authentication</xsl:text>
					</span>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_03',requirement/@serviceAuthentication,//graa:ServiceDescription[1]/requirement[1]/@serviceAuthentication)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_03',requirement/@serviceAuthentication,//graa:ServiceDescription[1]/requirement[1]/@serviceAuthentication)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable tDataTableRowAlt">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Message Nonrepudiation</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_04',requirement/@messageNonrepudiation,//graa:ServiceDescription[1]/requirement[1]/@messageNonrepudiation)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_04',requirement/@messageNonrepudiation,//graa:ServiceDescription[1]/requirement[1]/@messageNonrepudiation)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Message Integrity</xsl:text>
					</span>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_05',requirement/@messageIntegrity,//graa:ServiceDescription[1]/requirement[1]/@messageIntegrity)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_05',requirement/@messageIntegrity,//graa:ServiceDescription[1]/requirement[1]/@messageIntegrity)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable tDataTableRowAlt">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Message Confidentiality</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_06',requirement/@messageConfidentiality,//graa:ServiceDescription[1]/requirement[1]/@messageConfidentiality)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_06',requirement/@messageConfidentiality,//graa:ServiceDescription[1]/requirement[1]/@messageConfidentiality)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Message Addressing</xsl:text>
					</span>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_07',requirement/@messageAddressing,//graa:ServiceDescription[1]/requirement[1]/@messageAddressing)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_07',requirement/@messageAddressing,//graa:ServiceDescription[1]/requirement[1]/@messageAddressing)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable tDataTableRowAlt">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Reliability</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_08',requirement/@reliability,//graa:ServiceDescription[1]/requirement[1]/@reliability)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_08',requirement/@reliability,//graa:ServiceDescription[1]/requirement[1]/@reliability)"/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Transaction Support</xsl:text>
					</span>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_09',requirement/@transactionSupport,//graa:ServiceDescription[1]/requirement[1]/@transactionSupport)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_09',requirement/@transactionSupport,//graa:ServiceDescription[1]/requirement[1]/@transactionSupport)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable tDataTableRowAlt">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Service Metadata Availability</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_10',requirement/@serviceMetadataAvailability,//graa:ServiceDescription[1]/requirement[1]/@serviceMetadataAvailability)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_10',requirement/@serviceMetadataAvailability,//graa:ServiceDescription[1]/requirement[1]/@serviceMetadataAvailability)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Interface Description Requirements</xsl:text>
					</span>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_11',requirement/@interfaceDescriptionRequirements,//graa:ServiceDescription[1]/requirement[1]/@interfaceDescriptionRequirements)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_11',requirement/@interfaceDescriptionRequirements,//graa:ServiceDescription[1]/requirement[1]/@interfaceDescriptionRequirements)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="tDataTable tDataTableRowAlt">
					<span class="FontType tDataTableTextTitle">
						<xsl:text>Service Responsiveness</xsl:text>
					</span>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIRValue('_arg_sir_12',requirement/@serviceResponsiveness,//graa:ServiceDescription[1]/requirement[1]/@serviceResponsiveness)"
							/>
						</span>
					</i>
				</td>
				<td class="tDataTable tDataTableRowAlt">
					<i>
						<span class="FontType tDataTableText">
							<xsl:value-of
								select="graa:ReturnSIR('_arg_sir_12',requirement/@serviceResponsiveness,//graa:ServiceDescription[1]/requirement[1]/@serviceResponsiveness)"
							/>
						</span>
					</i>
				</td>
			</tr>
			<tr style="height:.3in">
				<td class="FontType tDataTableCaption" colspan="3">
					<xsl:text>Table </xsl:text>
					<xsl:value-of select="position()"/>
					<xsl:text> : Service Interaction Requirements</xsl:text>
				</td>
			</tr>
		</table>
	</xsl:template>
</xsl:stylesheet>