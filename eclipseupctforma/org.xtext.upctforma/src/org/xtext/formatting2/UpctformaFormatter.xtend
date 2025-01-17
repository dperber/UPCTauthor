/*
 * generated by Xtext 2.12.0
 */
package org.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.services.UpctformaGrammarAccess
import upctforma.ContentDefinition
import upctforma.Import
import upctforma.Row
import upctforma.TemplateDef
import upctforma.Type

class UpctformaFormatter extends AbstractFormatter2 {
	
	@Inject extension UpctformaGrammarAccess

	def dispatch void format(ContentDefinition contentDefinition, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Import _import : contentDefinition.getImports()) {
			_import.format;
		}
		for (Type type : contentDefinition.getTypes()) {
			type.format;
		}
		for (TemplateDef templateDef : contentDefinition.getTemplates()) {
			templateDef.format;
		}
		contentDefinition.getUnit.format;
	}

	def dispatch void format(TemplateDef templateDef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Row row : templateDef.getRows()) {
			row.format;
		}
	}
	
	// TODO: implement for Unit, Row, Column, UseTemplate, Widget, Text, WidgetType, Section, RecordType
}
