<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:uml='http://www.omg.org/spec/UML/20110701' 
	xmlns:umleclipse='http://www.eclipse.org/uml2/4.0.0/UML'
	xmlns:fn="http://www.w3.org/2005/xpath-functions"
	 xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0" 
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:xmi="http://www.omg.org/spec/XMI/20110701" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        exclude-result-prefixes="fn umleclipse ecore"
    >
    <!-- convert eclipse uml file to omg xmi form -->
	<xsl:output method="xml" encoding="UTF-8"/>
	<!-- remove unneeded references to eclipse libraries, profiles, metamodels -->
     <xsl:template match="@href[fn:contains(.,'pathmap://UML_LIBRARIES/')
     			and not(fn:contains(.,'pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#'))
     			]">
             	<xsl:attribute name="href" select="fn:replace(fn:replace(.,'pathmap://UML_LIBRARIES/',''),'.uml#','.xmi#')"/>
     </xsl:template>
     <xsl:template match="@href[fn:contains(.,'pathmap://UML_PROFILES/')]">
             	<xsl:attribute name="href" select="fn:replace(fn:replace(.,'pathmap://UML_PROFILES/',''),'.uml#','.xmi#')"/>
     </xsl:template>
     <!-- 
     <xsl:template match="@href[fn:contains(.,'pathmap://UML_METAMODELS/UML.metamodel.uml#')]">
             	<xsl:attribute name="href" select="fn:replace(fn:replace(.,'pathmap://UML_METAMODELS/',''),'.uml#','.xmi#')"/>
     </xsl:template>
      -->
      <!-- change eclipse refs to omg references -->
     <xsl:template match="@href[fn:contains(.,'pathmap://UML_METAMODELS/UML.metamodel.uml#')]">
             	<xsl:attribute name="href" select="fn:replace(.,'pathmap://UML_METAMODELS/UML.metamodel.uml#','http://www.omg.org/spec/UML/20110701/UML.xmi#')"/>
     </xsl:template>
     <xsl:template match="@href[fn:contains(.,'pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#')]">
             	<xsl:attribute name="href" select="fn:replace(.,'pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#','http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi#')"/>
     </xsl:template>
     
     <!-- change suffix from .uml to .xmi -->
     <xsl:template match="@href[fn:contains(.,'.uml#') 
     	and not(fn:contains(.,'pathmap://UML_LIBRARIES/'))
     	and not(fn:contains(.,'pathmap://UML_PROFILES/'))
     	and not(fn:contains(.,'pathmap://UML_METAMODELS/'))
     	]">
             	<xsl:attribute name="href" select="fn:replace(.,'.uml#','.xmi#')"/>
     </xsl:template>
	<!-- remove implementation-specific annotations -->
     <xsl:template match="eAnnotations">
     </xsl:template>
     <!-- remove magic draw and other unused profiles -->
     <xsl:template match="profileApplication[fn:contains(appliedProfile/@href,'pathmap://UML_PROFILES/StandardL2.profile.uml#')]">
     </xsl:template>
     <xsl:template match="profileApplication[fn:contains(appliedProfile/@href,'UML_Standard_Profile.MagicDraw_Profile.')]">
     </xsl:template>
     <xsl:template match="packageImport[fn:contains(importedPackage/@href,'pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#')]">
     </xsl:template>
     <xsl:template match="packageImport[fn:contains(importedPackage/@href,'pathmap://UML_LIBRARIES/JavaPrimitiveTypes.library.uml#')]">
     </xsl:template>
     <!-- make sure omg xmi and uml namespaces used -->
        <xsl:template match="xmi:XMI">
        	<xmi:XMI>
                	<xsl:namespace name="xmi" select="'http://www.omg.org/spec/XMI/20110701'"/>
                	<xsl:namespace name="uml" select="'http://www.omg.org/spec/UML/20110701'"/>
                        <xsl:apply-templates select="@*|node()" />
        	</xmi:XMI>
        </xsl:template>
        <!-- convert eclipse uml prefix to omg prefix -->
        <xsl:template match="umleclipse:Model">
        	<uml:Model>
                	<xsl:namespace name="xmi" select="'http://www.omg.org/spec/XMI/20110701'"/>
                	<xsl:namespace name="uml" select="'http://www.omg.org/spec/UML/20110701'"/>
                        <xsl:apply-templates select="@*|node()" />
        	</uml:Model>
        </xsl:template>
        <xsl:template match="umleclipse:Profile">
        	<uml:Profile>
                	<xsl:namespace name="xmi" select="'http://www.omg.org/spec/XMI/20110701'"/>
                	<xsl:namespace name="uml" select="'http://www.omg.org/spec/UML/20110701'"/>
                        <xsl:apply-templates select="@*|node()" />
        	</uml:Profile>
        </xsl:template>
     
   <!-- elements to be copied -->     
        <xsl:template match="@*|node()">
                <xsl:copy copy-namespaces="no">
                        <xsl:apply-templates select="@*|node()" />
                </xsl:copy>
        </xsl:template>
<!-- top-level -->        
        <xsl:template match="/">
                <xsl:apply-templates select="*" />
        </xsl:template>
</xsl:stylesheet>