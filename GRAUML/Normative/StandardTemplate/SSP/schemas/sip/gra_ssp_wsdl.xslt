<xsl:stylesheet version="2.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" 
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
	xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" 
	xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy"
	xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/"	
	xmlns:graa="http://ijis.org/GRA/Annotations" exclude-result-prefixes="graa">
	<xsl:output method="xml" omit-xml-declaration="yes" indent="yes" />
	
	<xsl:variable name="tns">
		<xsl:value-of select="concat('gra-',lower-case(/graa:ServiceDescription/@serviceNameAbbreviationText))"/>
	</xsl:variable>	
	
	<xsl:include href="../../artifacts/various%20artifacts/other/xslt%20utilities/gra_ssp_wsdl_util.xslt"/>
	<xsl:include href="../../artifacts/various%20artifacts/other/xslt%20utilities/gra_ssp_wsdl_policy.xslt"/>
	<xsl:include href="../../artifacts/various%20artifacts/other/xslt%20utilities/gra_ssp_wsdl_binding.xslt"/>

	<xsl:template match="/">
		<xsl:for-each select="/graa:ServiceDescription/serviceInterface">
			<xsl:result-document href="{lower-case(@serviceInterfaceNameAbbreviationText)}.wsdl">
				
			<!--wsdl:definitions-->
				<xsl:element name="wsdl:definitions">
					<xsl:namespace name="wsdl">http://schemas.xmlsoap.org/wsdl/</xsl:namespace>
					<xsl:namespace name="xsd">http://www.w3.org/2001/XMLSchema</xsl:namespace>
					<xsl:namespace name="soap">http://schemas.xmlsoap.org/wsdl/soap/</xsl:namespace>
					<xsl:namespace name="http">http://schemas.xmlsoap.org/wsdl/http/</xsl:namespace>
					<xsl:namespace name="mime">http://schemas.xmlsoap.org/wsdl/mime/</xsl:namespace>
					<xsl:namespace name="wsp">http://schemas.xmlsoap.org/ws/2004/09/policy</xsl:namespace>
					<xsl:namespace name="wsaw">http://www.w3.org/2006/05/addressing/wsdl</xsl:namespace>
					<xsl:namespace name="wsu">http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd</xsl:namespace>
					<xsl:namespace name="{$tns}">
						<xsl:value-of disable-output-escaping="yes" select="/graa:ServiceDescription/@serviceUri"/>
					</xsl:namespace>
					<xsl:attribute name="targetNamespace">
						<xsl:value-of disable-output-escaping="yes" select="/graa:ServiceDescription/@serviceUri"/>
					</xsl:attribute>
					<xsl:for-each select="schemaReference">
						<xsl:namespace name="{@prefix}">
							<xsl:value-of select="@namespace"/>
						</xsl:namespace>
					</xsl:for-each>					
					<xsl:element name="wsdl:documentation">
						<xsl:value-of select="/graa:ServiceDescription/@serviceDescriptionSummaryText"/>
					</xsl:element>					
					<xsl:call-template name="wsdl-policy"/>
					
				<!--wsdl:types-->
					<xsl:element name="wsdl:types">
						<xsl:element name="xsd:schema">
							<xsl:for-each select="schemaReference">
								<xsl:element name="xsd:import">
									<xsl:attribute name="namespace">
										<xsl:value-of select="@namespace"/>
									</xsl:attribute>
									<xsl:attribute name="schemaLocation">
										<xsl:value-of select="concat('../../',@schemaLocation)"/>
									</xsl:attribute>
								</xsl:element>
							</xsl:for-each>
						</xsl:element>
					</xsl:element>

				<!--wsdl:message-->
					<xsl:for-each select="service/port/interface/operation">
						<xsl:variable name="operationName"><xsl:value-of select="@name"/></xsl:variable>
						<xsl:variable name="isDocumentStyle" select="not(@operationKindCode) or (@operationKindCode='doc')"/>
						<xsl:variable name="allinParameters" select="parameter[(@use = 'in')]"/>
						<xsl:variable name="inParameters" select="$allinParameters[ (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))]"/>
						<!-- arbitrarily choose first inParameter as name of the in message with all its parts -->					
						<xsl:for-each select="$inParameters[1]">
							<xsl:variable name="parameterName"><xsl:value-of select="concat($operationName,'.',@name)"/></xsl:variable>
							<wsdl:message name="{$parameterName}">
									<xsl:choose>
										<xsl:when test="$isDocumentStyle">
											<!-- this is 'doc' style, part is an element -->
											<xsl:for-each select="$allinParameters/message">
												<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@elementName)"/></xsl:variable>
												<wsdl:part name="{$partName}" element="{concat(@elementPrefix,':',@elementName)}">
													<xsl:call-template name="doc"/>
												</wsdl:part>
											</xsl:for-each>	
										</xsl:when>
										<xsl:otherwise>
											<!-- this is 'rpc' style, part is a type reference -->
											<xsl:for-each select="$allinParameters/message">
												<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@name)"/></xsl:variable>
												<wsdl:part name="{$partName}" type="{concat(@prefix,':',@name)}">
													<xsl:call-template name="doc"/>
												</wsdl:part>
											</xsl:for-each>	
										</xsl:otherwise>
									</xsl:choose>
								</wsdl:message>
							</xsl:for-each>
						<!-- determine all modeled out parameter, filter to get body parts-->	
						<xsl:variable name="alloutParameters" select="parameter[(@use = 'out')]"/>
						<xsl:variable name="outParameters" select="$alloutParameters[ (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))]"/>
						<!-- arbitrarily choose first outParameter to name the out message with all its parts -->					
						<xsl:for-each select="$outParameters[1]">
							<xsl:variable name="parameterName"><xsl:value-of select="concat($operationName,'.',@name)"/></xsl:variable>
							<wsdl:message name="{$parameterName}">
									<xsl:choose>
										<xsl:when test="$isDocumentStyle">
											<xsl:for-each select="$alloutParameters/message">
											<!-- this is 'doc' style, part is an element; process each part of message -->
												<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@elementName)"/></xsl:variable>
												<!-- part references element -->
												<wsdl:part name="{$partName}" element="{concat(@elementPrefix,':',@elementName)}">
													<xsl:call-template name="doc"/>
												</wsdl:part>
											</xsl:for-each>	
										</xsl:when>
										<xsl:otherwise>
											<!-- this is 'rpc' style, part is a type reference; process each part of message -->
											<xsl:for-each select="$alloutParameters/message">
												<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@name)"/></xsl:variable>
												<!--  part references types -->
												<wsdl:part name="{$partName}" type="{concat(@prefix,':',@name)}">
													<xsl:call-template name="doc"/>
												</wsdl:part>
											</xsl:for-each>	
										</xsl:otherwise>
									</xsl:choose>
								</wsdl:message>
							</xsl:for-each>
							<!-- process each exception message; message name is operation/exception name -->
						<xsl:for-each select="parameter[(@use = 'exception')and (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))]">
							<xsl:variable name="parameterName"><xsl:value-of select="concat($operationName,'.',@name)"/></xsl:variable>
							<wsdl:message name="{$parameterName}">
								<xsl:for-each select="message">
									<xsl:choose>
										<xsl:when test="$isDocumentStyle">
											<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@elementName)"/></xsl:variable>
											<wsdl:part name="{$partName}" element="{concat(@elementPrefix,':',@elementName)}">
												<xsl:call-template name="doc"/>
											</wsdl:part>
										</xsl:when>
										<xsl:otherwise>
									<xsl:variable name="partName"><xsl:value-of select="concat($parameterName,'.',@name)"/></xsl:variable>
											<wsdl:part name="{$partName}" type="{concat(@prefix,':',@name)}">
												<xsl:call-template name="doc"/>
											</wsdl:part>
										</xsl:otherwise>
									</xsl:choose>	
								</xsl:for-each>	
							</wsdl:message>
						</xsl:for-each>						
					</xsl:for-each>

				<!--wsdl:portType-->
					<xsl:for-each select="service">
						<xsl:for-each select="port">
							<wsdl:portType name="{@name}">
								<xsl:call-template name="doc"/>
								<xsl:for-each select="interface">
									<xsl:for-each select="operation">
										<xsl:variable name="operationName"><xsl:value-of select="@name"/></xsl:variable>
										<wsdl:operation name="{$operationName}">
											<xsl:call-template name="doc"/>
											 <!-- the in message -->
											<xsl:for-each select="parameter[(@use = 'in')and (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))][1]">
												<xsl:variable name="parameterName"><xsl:value-of select="concat($operationName,'.',@name)"/></xsl:variable>
												<xsl:variable name="wsdlMessageName"><xsl:value-of select="concat($tns, ':',$parameterName)"/></xsl:variable>
												<wsdl:input name="{$parameterName}" message="{$wsdlMessageName}"/>
											</xsl:for-each>
											 <!-- the out message -->
											<xsl:for-each select="parameter[(@use = 'out')and (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))][1]">
												<xsl:variable name="parameterName"><xsl:value-of select="concat($operationName,'.',@name)"/></xsl:variable>
												<xsl:variable name="wsdlMessageName"><xsl:value-of select="concat($tns, ':',$parameterName)"/></xsl:variable>
												<wsdl:output name="{$parameterName}" message="{$wsdlMessageName}"/>
											</xsl:for-each>
											 <!-- each fault message -->
											<xsl:for-each select="parameter[(@use = 'exception')and (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))]">
												<xsl:variable name="parameterName"><xsl:value-of select="concat($operationName,'.',@name)"/></xsl:variable>
												<xsl:variable name="wsdlMessageName"><xsl:value-of select="concat($tns, ':',$parameterName)"/></xsl:variable>
												<wsdl:fault name="{$parameterName}" message="{$wsdlMessageName}"/>
											</xsl:for-each>
										</wsdl:operation>	
									</xsl:for-each>
								</xsl:for-each>
							</wsdl:portType>	
						</xsl:for-each>
					</xsl:for-each>
					
				<!--wsdl:binding-->
					<xsl:for-each select="service">
						<xsl:for-each select="port">
							<xsl:element name="wsdl:binding">
								<xsl:attribute name="name"><xsl:value-of select="@name"/>Binding</xsl:attribute>
								<xsl:attribute name="type">
									<xsl:value-of select="concat($tns, ':', @name)"/>
								</xsl:attribute>
								<xsl:choose>
									<xsl:when test="interface/@bindingCode = 'httpGet'">
										<xsl:element name="http:binding">
											<xsl:attribute name="verb">GET</xsl:attribute>
										</xsl:element>
										<xsl:for-each select="interface">
											<xsl:for-each select="operation">
												<xsl:element name="wsdl:operation">
													<xsl:attribute name="name">
														<xsl:value-of select="@name"/>
													</xsl:attribute>
													<xsl:element name="http:operation">
														<xsl:attribute name="location">
															<xsl:value-of select="@actionName"/>
														</xsl:attribute>
													</xsl:element>
													<xsl:for-each-group group-by="@use" select="parameter">
														<xsl:sort select="current-grouping-key()"/>
														<xsl:if test="@use = 'in'">
															<xsl:element name="wsdl:input">
																<xsl:call-template name="bind-get"/>
															</xsl:element>
														</xsl:if>
														<xsl:if test="@use = 'out'">
															<xsl:element name="wsdl:output">
																<xsl:call-template name="bind-get"/>
															</xsl:element>
														</xsl:if>
													</xsl:for-each-group>
												</xsl:element>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:when>
									<xsl:otherwise>
										<xsl:element name="soap:binding">
											<xsl:attribute name="style">document</xsl:attribute>
											<xsl:attribute name="transport">http://schemas.xmlsoap.org/soap/http</xsl:attribute>
										</xsl:element>
										<xsl:call-template name="bind-interface-policy"/>
										<xsl:for-each select="interface/operation">
											<xsl:element name="wsdl:operation">
												<xsl:attribute name="name">
													<xsl:value-of select="@name"/>
												</xsl:attribute>
												<xsl:element name="soap:operation">
													<xsl:attribute name="soapAction">
														<xsl:value-of select="@actionName"/>
													</xsl:attribute>
													<xsl:attribute name="style">document</xsl:attribute>
												</xsl:element>												
												<xsl:for-each select="parameter[(@use = 'in') and (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))][1]">
													<xsl:element name="wsdl:input">
														<xsl:call-template name="bind-parameter-policy"/>
														<xsl:call-template name="bind-parameter-soap">
															<xsl:with-param name="tns"><xsl:value-of select="$tns"/></xsl:with-param>
														</xsl:call-template>
													</xsl:element>
												</xsl:for-each>												
												<xsl:for-each select="parameter[(@use = 'out') and (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))][1]">
													<xsl:element name="wsdl:output">
														<xsl:call-template name="bind-parameter-policy"/>
														<xsl:call-template name="bind-parameter-soap">
															<xsl:with-param name="tns"><xsl:value-of select="$tns"/></xsl:with-param>
														</xsl:call-template>
													</xsl:element>
												</xsl:for-each>												
												<xsl:for-each select="parameter[(@use = 'exception') and (not(message/@messageLocationCode) or (message/@messageLocationCode != 'header'))][1]">
													<xsl:element name="wsdl:fault">
														<xsl:attribute name="name">
															<xsl:value-of select="concat(../@name, '.', @name)"></xsl:value-of>
														</xsl:attribute>
													</xsl:element>
												</xsl:for-each>
											</xsl:element>
										</xsl:for-each>
									</xsl:otherwise>
								</xsl:choose>
							</xsl:element>
						</xsl:for-each>
					</xsl:for-each>
					
				<!--wsdl:service-->
					<xsl:element name="wsdl:service">
						<xsl:attribute name="name">
							<xsl:value-of select="replace(@name, ' ', '')"/>Service</xsl:attribute>
						<xsl:call-template name="doc"/>
						<xsl:for-each select="service/port">
							<xsl:element name="wsdl:port">
								<xsl:attribute name="name">
									<xsl:value-of select="@name"/>
								</xsl:attribute>
								<xsl:attribute name="binding">
									<xsl:value-of select="concat($tns, ':', @name, 'Binding')"/>
								</xsl:attribute>
								<xsl:choose>
									<xsl:when test="interface/@bindingCode = 'httpGet'">
										<xsl:element name="http:address">
											<xsl:attribute name="location">
												<xsl:value-of select="@addressUri"/>
											</xsl:attribute>
										</xsl:element>
									</xsl:when>
									<xsl:otherwise>
										<xsl:element name="soap:address">
											<xsl:attribute name="location">
												<xsl:value-of select="@addressUri"/>
											</xsl:attribute>
										</xsl:element>
									</xsl:otherwise>
								</xsl:choose>	
							</xsl:element>
						</xsl:for-each>
					</xsl:element>
				</xsl:element>
			</xsl:result-document>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>