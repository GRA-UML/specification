<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:graa="http://ijis.org/GRA/Annotations" exclude-result-prefixes="graa">
	
	<xsl:function name="graa:ReturnSIR">
		<xsl:param name="placeholder"/>
		<xsl:param name="defaultValue"/>
		<xsl:param name="interfaceXpathValue"/>
		<xsl:param name="baseXpathValue"/>
		<xsl:choose>
			<xsl:when test="string-length($interfaceXpathValue) > 0">
				<xsl:copy-of select="graa:ReturnSIRPolicy($placeholder,$interfaceXpathValue)"/>
			</xsl:when>
			<xsl:when test="string-length($baseXpathValue) > 0">
				<xsl:copy-of select="graa:ReturnSIRPolicy($placeholder,$baseXpathValue)"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:copy-of select="graa:ReturnSIRPolicy($placeholder,$defaultValue)"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:function>

	<xsl:function name="graa:ReturnSIRPolicy">
		<xsl:param name="placeholder"/>
		<xsl:param name="valueFlag"/>
		<xsl:choose>
			<xsl:when test="$valueFlag = 'true'">
				<xsl:choose>
					<xsl:when test="$placeholder = 'Security'">
						<xsl:copy-of select="document('../wsdl parts/wss.xml')"/>
					</xsl:when>
					<xsl:when test="$placeholder = 'Addressing'">
						<xsl:copy-of select="document('../wsdl parts/wsa.xml')"/>
					</xsl:when>
					<xsl:when test="$placeholder = 'Reliability'">
						<xsl:copy-of select="document('../wsdl parts/wsrm.xml')"/>
					</xsl:when>
				</xsl:choose>
			</xsl:when>
		</xsl:choose>
	</xsl:function>
	
</xsl:stylesheet>