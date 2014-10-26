<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:graa="http://ijis.org/GRA/Annotations" exclude-result-prefixes="graa">
	
	<xsl:template name="bind-get" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/">
		<xsl:for-each select="current-group()">
			<xsl:element name="mime:content">
				<xsl:choose>
					<xsl:when test="message/@messageLocationCode = 'header'">
						<xsl:attribute name="type">text/xml</xsl:attribute>
					</xsl:when>
					<xsl:otherwise>
						<xsl:attribute name="type">application/xml</xsl:attribute>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:element>
		</xsl:for-each>
	</xsl:template>
	
	
	<xsl:template name="bind-parameter-soap" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/">
		<xsl:param name="tns"/>
		
		<xsl:variable name="isDocumentStyle" select="not(../@operationKindCode) or (../@operationKindCode='doc')"/>
		
		<!--  note that our message names are in form $operationName.$parameterName;
						our part names extend message names with name of element/type -->
		<xsl:variable name="operationName"><xsl:value-of select="../@name"/></xsl:variable>
		<xsl:variable name="thisUse" select="@use"/>
		<!-- get all parameters for the same operation 'use'  -->
		<xsl:variable name="allParameters" select="../parameter[(@use = $thisUse)]"/>
		<!-- get the body parts -->
		<xsl:variable name="parameters" select="$allParameters[ (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))]"/>
		<!-- select one of the parts as message name -->
		<xsl:variable name="parameterName"><xsl:value-of select="concat($operationName,'.',$parameters[1]/@name)"/></xsl:variable>
		<!-- find and process each soap header part -->
		<xsl:for-each select="$allParameters[ message/@messageLocationCode = 'header']/message">
			<xsl:choose>
				<xsl:when test="$isDocumentStyle">
					<!-- for doc style, part is an element reference -->
					<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@elementName)"/></xsl:variable>
					<soap:header use="literal" message="{concat($tns, ':',$parameterName)}" part="{$partName}"/>
				</xsl:when>
				<xsl:otherwise>
					<!-- for rpc style, part is a type reference -->
					<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@name)"/></xsl:variable>
					<soap:header use="literal" message="{concat($tns, ':',$parameterName)}" part="{$partName}"/>
				</xsl:otherwise>
			</xsl:choose>	
		</xsl:for-each>	
		<xsl:element name="soap:body">
			<xsl:attribute name="use">literal</xsl:attribute>
			<!-- need parts if more than one, but document-literal can only have one -->
			<xsl:if test="count($allParameters)&gt;1">
				<xsl:choose>
					<xsl:when test="$isDocumentStyle">
						<!-- for doc style, parts will be element references -->
						<xsl:for-each select="$parameters[1]/message">
							<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@elementName)"/></xsl:variable>
							<xsl:attribute name="parts" select="$partName"/>
						</xsl:for-each>
					</xsl:when>
					<xsl:otherwise>
						<!-- for rpc style, parts will be type references -->
						<xsl:variable name="partNameValue"><xsl:value-of select="''"/></xsl:variable>
						<xsl:for-each select="$parameters/message">
							<xsl:variable name="partNameValue"><xsl:value-of select="concat($partNameValue,' ',@name)"/></xsl:variable>
							<xsl:attribute name="parts" select="$partNameValue"/>
						</xsl:for-each>
					</xsl:otherwise>
				</xsl:choose>	
			</xsl:if>
		</xsl:element>
	</xsl:template>
	
</xsl:stylesheet>