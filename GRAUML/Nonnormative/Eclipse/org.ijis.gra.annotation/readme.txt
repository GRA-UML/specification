For annotation model originating from magic draw:

Magic draw export to UML Clean XMI file (result is an xml file)
Change *.xml to *.xmi
edit xmi for xmi:type:
	change 'href="http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi#'
	to 'xmi:type="uml:PrimitiveType" href="http://www.omg.org/spec/UML/20110701/PrimitiveTypes.xmi#' 
Open *.xmi in uml editor, select top package, main menu UML Editor==>convert to==>Ecore Model
	
Open data.ecore model, save as GRAAnnotationModel.emof
Open types.ecore, save as GRAAnnotationModelTypes.emof
edit GRAAnnotationModel.emof, replace 'href="types.ecore#' with href="GRAAnnotationModelTypes.emof#
Select GRAAnnotationModel.emof, context menu==>new==>EMF Generator Model	
	Select package 'data',  'types'
In generator model editor, set ModelDirectory to src/main/java 
	change prefixes in GRAAnnotationModel.emof to graa, graw
	generate model code	

In generator model editor, export to schema for xmi
	fixup schemaLocation of http://www.omg.org/XMI to  	http://www.omg.org/spec/XMI/20110701/XMI.xsd
	change http://www.omg.org/XMI to http://www.omg.org/spec/XMI/20110701
	
	
test
	For domain model, export via eclipse xmi 2.4
	provision
	double-check schemas, annotations.xmi, wsdl, catalog, metadata
	
site:  gra-update-site
	remove 	artifacts.jar, content.jar
	in site, delete the org.ijis.gra feature, then add it back
	build all
	
svn: update gra-update-site, examples, 	org.ijis.gra.annotation, Standard Template, 
	org.ijis.gra.uml.qvt
	maybe Magicdraw

/////////////////////////////////////////////////////////
For domain model, export via eclipse xmi 2.4
