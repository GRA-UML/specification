<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:graa="http://ijis.org/GRA/Annotations" exclude-result-prefixes="graa">
			
	<xsl:template name="doc" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
		<xsl:if test="@documentation">
			<xsl:element name="wsdl:documentation">
				<xsl:value-of select="@documentation"/>
			</xsl:element>
		</xsl:if>
	</xsl:template>
	
</xsl:stylesheet>