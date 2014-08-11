<xsl:stylesheet version="2.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" 
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
	xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" 
	xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy"
	xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/"	
	xmlns:graa="http://ijis.org/GRA/Annotations">
	<xsl:output method="xml" omit-xml-declaration="yes" indent="yes" />
	
	<xsl:variable name="tns">
		<xsl:value-of select="concat('gra-',lower-case(//graa:ServiceDescription/@serviceNameAbbreviationText))"/>
	</xsl:variable>	
	<xsl:variable name="policyAddressing">
		<xsl:copy-of	select="graa:ReturnSIR('Addressing','true',requirement/@messageAddressing,
			//graa:ServiceDescription[1]/requirement[1]/@messageAddressing)"/>
	</xsl:variable>
	<xsl:variable name="policyReliability">
		<xsl:copy-of select="graa:ReturnSIR('Reliability','false',requirement/@reliability,
			//graa:ServiceDescription[1]/requirement[1]/@reliability)"/>
	</xsl:variable>
	<xsl:variable name="policyNonRepudiation">
		<xsl:copy-of select="graa:ReturnSIR('Security','false',requirement/@messageNonrepudiation,
			//graa:ServiceDescription[1]/requirement[1]/@messageNonrepudiation)" />
	</xsl:variable>
	<xsl:variable name="policyIntegrity">
		<xsl:copy-of select="graa:ReturnSIR('Security','false', requirement/@messageIntegrity,
			//graa:ServiceDescription[1]/requirement[1]/@messageIntegrity)"/>
	</xsl:variable>
	<xsl:variable name="policyConfidentiality">
		<xsl:copy-of select="graa:ReturnSIR('Security','false',requirement/@messageConfidentiality,
			//graa:ServiceDescription[1]/requirement[1]/@messageConfidentiality)"	/>
	</xsl:variable>
	
	<xsl:attribute-set name="message-definition">
		<xsl:attribute name="name">
			<xsl:value-of select="@name"/>
		</xsl:attribute>
		<xsl:attribute name="message">
			<xsl:value-of select="concat($tns, ':', @name)"/>
		</xsl:attribute>
	</xsl:attribute-set>
	
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
						<xsl:copy-of select="document('./policy/wss.xml')"/>
					</xsl:when>
					<xsl:when test="$placeholder = 'Addressing'">
						<xsl:copy-of select="document('./policy/wsa.xml')"/>
					</xsl:when>
					<xsl:when test="$placeholder = 'Reliability'">
						<xsl:copy-of select="document('./policy/wsrm.xml')"/>
					</xsl:when>
				</xsl:choose>
			</xsl:when>
		</xsl:choose>
	</xsl:function>
	
	<xsl:template name="doc" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
		<xsl:if test="@documentation">
			<xsl:element name="wsdl:documentation">
				<xsl:value-of select="@documentation"/>
			</xsl:element>
		</xsl:if>
	</xsl:template>
	
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
	
	<xsl:template name="bind-soap" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/">
		<xsl:for-each select="current-group()">
						
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
			
			<xsl:choose>
				<xsl:when test="message/@messageLocationCode = 'header'">
					<xsl:element name="soap:header">
						<xsl:attribute name="use">literal</xsl:attribute>
						<xsl:attribute name="message">
							<xsl:value-of select="message/@prefix"/>:<xsl:value-of select="message/@name"/>
						</xsl:attribute>
						<xsl:attribute name="part">
							<xsl:value-of select="@name"/>
						</xsl:attribute>
					</xsl:element>
				</xsl:when>
				<xsl:otherwise>
					<xsl:element name="soap:body">
						<xsl:attribute name="use">literal</xsl:attribute>
					</xsl:element>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>

	<xsl:template match="/">
		<xsl:for-each select="//graa:ServiceDescription/serviceInterface">
			<xsl:result-document href="{@name}.wsdl">
				
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
						<xsl:value-of disable-output-escaping="yes" select="//graa:ServiceDescription/@serviceUri"/>
					</xsl:namespace>

					<xsl:attribute name="targetNamespace">
						<xsl:value-of disable-output-escaping="yes" select="//graa:ServiceDescription/@serviceUri"/>
					</xsl:attribute>

					<xsl:for-each select="schemaReference">
						<xsl:namespace name="{@prefix}">
							<xsl:value-of select="@namespace"/>
						</xsl:namespace>
					</xsl:for-each>

					<xsl:element name="wsdl:documentation">
						<xsl:value-of select="//graa:ServiceDescription/@serviceDescriptionSummaryText"/>
					</xsl:element>
					
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
									<xsl:copy-of select="document('./policy/wss-wsa-arg-se.xml')"/>				
								</xsl:when>
								<xsl:otherwise>
									<xsl:copy-of select="document('./policy/wss-arg-se.xml')"/>				
								</xsl:otherwise>
							</xsl:choose>
						</xsl:when>
						<xsl:when test="$policyNonRepudiation != '' or $policyIntegrity != ''">
							<xsl:choose>
								<xsl:when test="$policyAddressing != ''">
									<xsl:copy-of select="document('./policy/wss-wsa-arg-s.xml')"></xsl:copy-of>
								</xsl:when>
								<xsl:otherwise>
									<xsl:copy-of select="document('./policy/wss-arg-s.xml')"></xsl:copy-of>
								</xsl:otherwise>
							</xsl:choose>
						</xsl:when>
					</xsl:choose>

					<xsl:element name="wsdl:types">
						<xsl:element name="xsd:schema">
							<xsl:for-each select="schemaReference">
								<xsl:element name="xsd:import">
									<xsl:attribute name="namespace">
										<xsl:value-of select="@namespace"/>
									</xsl:attribute>
									<xsl:attribute name="schemaLocation">
										<xsl:value-of select="@schemaLocation"/>
									</xsl:attribute>
								</xsl:element>
							</xsl:for-each>
						</xsl:element>
					</xsl:element>

					<xsl:for-each-group group-by="@name" select="service/port/interface/operation/parameter/message">
						<xsl:element name="wsdl:message">
							<xsl:attribute name="name">
								<xsl:value-of select="../@name"/>
							</xsl:attribute>
							<xsl:element name="wsdl:part">
								<xsl:attribute name="name">
									<xsl:value-of select="current-grouping-key()"/>
								</xsl:attribute>
								<xsl:attribute name="element">
									<xsl:value-of select="@prefix"/>:<xsl:value-of select="@name"/>
								</xsl:attribute>
								<xsl:call-template name="doc"/>
							</xsl:element>
						</xsl:element>
					</xsl:for-each-group>

					<xsl:for-each select="service">
						<xsl:for-each select="port">
							<xsl:element name="wsdl:portType">
								<xsl:attribute name="name">
									<xsl:value-of select="@name"/>
								</xsl:attribute>
								<xsl:call-template name="doc"/>
								<xsl:for-each select="interface">
									<xsl:for-each select="operation">
										<xsl:element name="wsdl:operation">
											<xsl:attribute name="name">
												<xsl:value-of select="@name"/>
											</xsl:attribute>
											<xsl:call-template name="doc"/>
											<xsl:for-each select="parameter[not(message/@messageLocationCode) or message/@messageLocationCode != 'header']">
												<xsl:if test="@use = 'in'">
													<xsl:element name="wsdl:input" use-attribute-sets="message-definition"/>
												</xsl:if>
												<xsl:if test="@use = 'out'">
													<xsl:element name="wsdl:output" use-attribute-sets="message-definition"/>
												</xsl:if>
												<xsl:if test="@use = 'exception'">
													<xsl:element name="wsdl:fault" use-attribute-sets="message-definition"/>
												</xsl:if>
											</xsl:for-each>
										</xsl:element>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:element>
						</xsl:for-each>
					</xsl:for-each>

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
												<xsl:for-each-group group-by="@use" select="parameter">
													<xsl:sort select="current-grouping-key()"/>
													<xsl:if test="@use = 'in'">
														<xsl:element name="wsdl:input">
															<xsl:call-template name="bind-soap"/>
														</xsl:element>
													</xsl:if>
													<xsl:if test="@use = 'out'">
														<xsl:element name="wsdl:output">
															<xsl:call-template name="bind-soap"/>
														</xsl:element>
													</xsl:if>
												</xsl:for-each-group>
											</xsl:element>
										</xsl:for-each>
									</xsl:otherwise>
								</xsl:choose>
							</xsl:element>
						</xsl:for-each>
					</xsl:for-each>

					<xsl:element name="wsdl:service">
						<xsl:attribute name="name">
							<xsl:value-of select="replace(@name, ' ', '')"/>Service </xsl:attribute>
						<xsl:call-template name="doc"/>
						<xsl:for-each select="service/port">
							<xsl:element name="wsdl:port">
								<xsl:attribute name="name">
									<xsl:value-of select="@name"/>
								</xsl:attribute>
								<xsl:attribute name="binding">
									<xsl:value-of select="concat($tns, ':', @name, 'Binding')"/>
								</xsl:attribute>
								<xsl:element name="soap:address">
									<xsl:attribute name="location">
										<xsl:value-of select="@addressUri"/>
									</xsl:attribute>
								</xsl:element>
							</xsl:element>
						</xsl:for-each>
					</xsl:element>

				</xsl:element>
			</xsl:result-document>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>