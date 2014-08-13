<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:graa="http://ijis.org/GRA/Annotations">

	<xsl:variable name="placeholdermode" select="'Non-Template'"/>

	<xsl:function name="graa:ReturnValue">
		<xsl:param name="placeholder"/>
		<xsl:param name="xpath"/>
		<xsl:param name="defaultValue"/>
		<xsl:choose>
			<xsl:when test="string-length($xpath) > 0">
				<xsl:value-of select="$xpath"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:choose>
					<xsl:when test="$defaultValue">
						<xsl:value-of select="$defaultValue"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:choose>
							<xsl:when test="$placeholdermode !=  'Template'">
								<xsl:text>[Not Defined]</xsl:text>
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="$placeholder"/>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:function>

	<xsl:function name="graa:ReturnValue">
		<xsl:param name="placeholder"/>
		<xsl:param name="xpath"/>
		<xsl:value-of select="graa:ReturnValue($placeholder,$xpath,'')"/>
	</xsl:function>
</xsl:stylesheet>
