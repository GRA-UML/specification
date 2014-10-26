<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy"
	xmlns:graa="http://ijis.org/GRA/Annotations" exclude-result-prefixes="graa">
	
	<xsl:include href="./gra_ssp_wsdl_sir.xslt"/>
	
	<xsl:variable name="policyAddressing">
		<xsl:copy-of	select="graa:ReturnSIR('Addressing','true',requirement/@messageAddressing,
			/graa:ServiceDescription[1]/requirement[1]/@messageAddressing)" />
	</xsl:variable>
	<xsl:variable name="policyReliability">
		<xsl:copy-of select="graa:ReturnSIR('Reliability','false',requirement/@reliability,
			/graa:ServiceDescription[1]/requirement[1]/@reliability)" />
	</xsl:variable>
	<xsl:variable name="policyNonRepudiation">
		<xsl:copy-of select="graa:ReturnSIR('Security','false',requirement/@messageNonrepudiation,
			/graa:ServiceDescription[1]/requirement[1]/@messageNonrepudiation)" />
	</xsl:variable>
	<xsl:variable name="policyIntegrity">
		<xsl:copy-of select="graa:ReturnSIR('Security','false', requirement/@messageIntegrity,
			/graa:ServiceDescription[1]/requirement[1]/@messageIntegrity)" />
	</xsl:variable>
	<xsl:variable name="policyConfidentiality">
		<xsl:copy-of select="graa:ReturnSIR('Security','false',requirement/@messageConfidentiality,
			/graa:ServiceDescription[1]/requirement[1]/@messageConfidentiality)" />
	</xsl:variable>
	
	<xsl:template name="wsdl-policy">
		<xsl:if test="$policyAddressing != ''">
			<xsl:copy-of select="$policyAddressing"/>
		</xsl:if>					
		<xsl:if test="$policyReliability != ''">
			<xsl:copy-of select="$policyReliability"/>
		</xsl:if>
		<xsl:choose>
			<xsl:when test="$policyNonRepudiation != ''">
				<xsl:copy-of select="$policyNonRepudiation"/>
			</xsl:when>
			<xsl:when test="$policyIntegrity != ''">
				<xsl:copy-of select="$policyIntegrity"/>
			</xsl:when>
			<xsl:when test="$policyConfidentiality != ''">
				<xsl:copy-of select="$policyConfidentiality"/>
			</xsl:when>
		</xsl:choose>
		<xsl:choose>
			<xsl:when test="$policyConfidentiality != ''">
				<xsl:choose>
					<xsl:when test="$policyAddressing != ''">
						<xsl:copy-of select="document('../wsdl parts/wss-wsa-arg-se.xml')"/>				
					</xsl:when>
					<xsl:otherwise>
						<xsl:copy-of select="document('../wss-arg-se.xml')"/>				
					</xsl:otherwise>
				</xsl:choose>
			</xsl:when>
			<xsl:when test="$policyNonRepudiation != '' or $policyIntegrity != ''">
				<xsl:choose>
					<xsl:when test="$policyAddressing != ''">
						<xsl:copy-of select="document('../wsdl parts/wss-wsa-arg-s.xml')"></xsl:copy-of>
					</xsl:when>
					<xsl:otherwise>
						<xsl:copy-of select="document('../wsdl parts/wss-arg-s.xml')"></xsl:copy-of>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="bind-parameter-policy">
		<xsl:choose>
			<xsl:when test="$policyConfidentiality != ''">
				<xsl:choose>
					<xsl:when test="$policyAddressing != ''">
						<xsl:element name="wsp:PolicyReference">
							<xsl:attribute name="URI">#wss-wsa-arg-se_policy</xsl:attribute>
						</xsl:element>	
					</xsl:when>
					<xsl:otherwise>
						<xsl:element name="wsp:PolicyReference">
							<xsl:attribute name="URI">#wss-arg-se_policy</xsl:attribute>
						</xsl:element>			
					</xsl:otherwise>
				</xsl:choose>
			</xsl:when>
			<xsl:when test="$policyNonRepudiation != '' or $policyIntegrity != ''">
				<xsl:choose>
					<xsl:when test="$policyAddressing != ''">
						<xsl:element name="wsp:PolicyReference">
							<xsl:attribute name="URI">#wss-wsa-arg-s_policy</xsl:attribute>
						</xsl:element>
					</xsl:when>
					<xsl:otherwise>
						<xsl:element name="wsp:PolicyReference">
							<xsl:attribute name="URI">#wss-arg-s_policy</xsl:attribute>
						</xsl:element>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="bind-interface-policy">
		<xsl:if test="$policyAddressing != ''">
			<xsl:element name="wsp:PolicyReference">
				<xsl:attribute name="URI">#wsa_policy</xsl:attribute>
			</xsl:element>
		</xsl:if>					
		<xsl:if test="$policyReliability != ''">
			<xsl:element name="wsp:PolicyReference">
				<xsl:attribute name="URI">#wsrm_policy</xsl:attribute>
			</xsl:element>
		</xsl:if>		
		<xsl:if test="$policyNonRepudiation != '' or $policyIntegrity != '' or $policyConfidentiality != ''">
			<xsl:element name="wsp:PolicyReference">
				<xsl:attribute name="URI">#wss_policy</xsl:attribute>
			</xsl:element>
		</xsl:if>
	</xsl:template>
	
	
	
</xsl:stylesheet>