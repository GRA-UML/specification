<?xml version="1.0" encoding="UTF-8"?>
	<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
		xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:graa="http://ijis.org/GRA/Annotations"
		exclude-result-prefixes="graa fn" >
		<xsl:output method="xml" indent="yes"/>
		<xsl:template match="/graa:ServiceDescription">
			<xsl:variable name="versionInfo" select="concat((@majorVersion, 0)[1],'.',(@minorVersion, 0)[1],'.0')"/>				
					
			<xsl:result-document href="catalog.xml">
				<catalog xmlns="http://it.ojp.gov/gsp/services/1.0.0">
					<xsl:call-template name="commenter">
						<xsl:with-param name="commentText" select="'Catalog Files Section'"/>
					</xsl:call-template>
					<xsl:element name="catalog">
						<xsl:attribute name="href" select="'catalog.html'"/>
						<xsl:text>Catalog</xsl:text>
					</xsl:element>
					<xsl:element name="metadata">
						<xsl:attribute name="href" select="'metadata.xml'"/>
						<xsl:text>Metadata</xsl:text>						
					</xsl:element>
					<xsl:call-template name="commenter">
						<xsl:with-param name="commentText" select="concat(@name,' SDD Section')"/>
					</xsl:call-template>
					<xsl:element name="service-description">
						<xsl:attribute name="href" select='concat("./artifacts/", @serviceNameAbbreviationText, "_SDD_v_", $versionInfo, ".xhtml")'/>
						<xsl:text>Service Description Document</xsl:text>
					</xsl:element>
					<xsl:call-template name="commenter">
						<xsl:with-param name="commentText" select="concat(@name,' SIDD Section')"/>
					</xsl:call-template>
					<xsl:for-each select="serviceInterface">					
						<xsl:element name="service-interface-description">
							<xsl:attribute name="href" select='concat("./artifacts/", upper-case(@serviceInterfaceNameAbbreviationText), "_SIDD_v_", $versionInfo, ".xhtml")'/>
							<xsl:text>Service Interface Description Document</xsl:text>
						</xsl:element>
					</xsl:for-each>
					<xsl:call-template name="commenter">
						<xsl:with-param name="commentText" select="concat(@name,' WSDL and Schema Section')"/>
					</xsl:call-template>
					<xsl:for-each select="serviceInterface">					
						<xsl:element name="wsdl-schema">
							<xsl:attribute name="href" select='concat("./schemas/sip/", @serviceInterfaceNameAbbreviationText, ".wsdl")' />
							<xsl:value-of select="@name"/><xsl:text> WSDL</xsl:text>
						</xsl:element>
					</xsl:for-each>					
					<xsl:call-template name="commenter">
						<xsl:with-param name="commentText" select="concat(iepdReference[1]/@name,' Reference Section')"/>
					</xsl:call-template>					
					<xsl:element name="iepd-catalog">
						<xsl:attribute name="href" select='concat("./artifacts/service model/information model/", iepdReference[1]/@name, "/catalog.xml")'/>
						<xsl:text>IEPD Catalog</xsl:text>
					</xsl:element>					
				</catalog>
			</xsl:result-document>			
		</xsl:template>
				
		<xsl:template name="commenter">
			<xsl:param name="commentText"/>
				<xsl:value-of select="'&#xA;&#xA;'"/>
				<xsl:comment> <xsl:value-of select="$commentText"/> </xsl:comment>
				<xsl:value-of select="'&#xA;'"/>
		</xsl:template>
	</xsl:stylesheet>

