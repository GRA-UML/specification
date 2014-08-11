<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:graa="http://ijis.org/GRA/Annotations">
	<xsl:function name="graa:ReturnSIRValue">
		<xsl:param name="placeholder"/>
		<xsl:param name="interfaceXpathValue"/>
		<xsl:param name="baseXpathValue"/>
		<xsl:choose>
			<xsl:when test="string-length($interfaceXpathValue) > 0">
				<xsl:value-of select="$interfaceXpathValue"/>
			</xsl:when>
			<xsl:when test="string-length($baseXpathValue) > 0">
				<xsl:value-of select="$baseXpathValue"/>
			</xsl:when>
			<xsl:otherwise> false </xsl:otherwise>
		</xsl:choose>
	</xsl:function>

	<xsl:function name="graa:ReturnSIR">
		<xsl:param name="placeholder"/>
		<xsl:param name="interfaceXpathValue"/>
		<xsl:param name="baseXpathValue"/>
		<xsl:choose>
			<xsl:when test="string-length($interfaceXpathValue) > 0">
				<xsl:value-of select="graa:ReturnSIRText($placeholder,$interfaceXpathValue)"/>
			</xsl:when>
			<xsl:when test="string-length($baseXpathValue) > 0">
				<xsl:value-of select="graa:ReturnSIRText($placeholder,$baseXpathValue)"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="graa:ReturnSIRText($placeholder,'false')"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:function>

	<xsl:function name="graa:ReturnSIRText">
		<xsl:param name="placeholder"/>
		<xsl:param name="valueFlag"/>
		<xsl:choose>
			<xsl:when test="$valueFlag = 'true'">
				<xsl:choose>
					<xsl:when test="$placeholder = '_arg_sir_00'">
						<xsl:text>Static IP Address</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_01'">
						<xsl:text>Application specific roles</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_02'">
						<xsl:text>GFIPM</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_03'">
						<xsl:text>SSL Certificate Authentication</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_04'">
						<xsl:text>W3C XML Signature</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_05'">
						<xsl:text>W3C XML Signature</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_06'">
						<xsl:text>OASIS Security Profile 1.1</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_07'">
						<xsl:text>WS-Addressing</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_08'">
						<xsl:text>Implicitly provide by response</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_09'">
						<xsl:text>WS-Coordination</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_10'">
						<xsl:text>WS-Metadataexchange</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_11'">
						<xsl:text>WSDL 1.1</xsl:text>
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_12'">
						<xsl:text>To be determined.</xsl:text>
					</xsl:when>
				</xsl:choose>
			</xsl:when>
			<xsl:otherwise>
				<xsl:text>N/A</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:function>
</xsl:stylesheet>