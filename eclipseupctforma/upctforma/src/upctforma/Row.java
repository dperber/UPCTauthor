/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Row#getColumns <em>Columns</em>}</li>
 *   <li>{@link upctforma.Row#getUsetemplate <em>Usetemplate</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getRow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkNumberArgumentParameter checkRowManualNoUseTemplate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkNumberArgumentParameter='if ((self.oclContainer().oclIsTypeOf(Section)) and (self.usetemplate.typetemplate.oclIsUndefined() = false)) then self.getParameters(self) = self.getArguments(self) else true endif' checkRowManualNoUseTemplate=' if self.oclContainer().oclIsTypeOf(Section) then if (self.columns->size() > 0) then self.usetemplate->size() = 0 else self.usetemplate->size() > 0 endif else true endif'"
 * @generated
 */
public interface Row extends Composite {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getRow_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Usetemplate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usetemplate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usetemplate</em>' containment reference.
	 * @see #setUsetemplate(UseTemplate)
	 * @see upctforma.UpctformaPackage#getRow_Usetemplate()
	 * @model containment="true"
	 * @generated
	 */
	UseTemplate getUsetemplate();

	/**
	 * Sets the value of the '{@link upctforma.Row#getUsetemplate <em>Usetemplate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usetemplate</em>' containment reference.
	 * @see #getUsetemplate()
	 * @generated
	 */
	void setUsetemplate(UseTemplate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elemRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t(if elem.oclIsTypeOf(Text) then\n\t\t\t\t\t\'Text\'\n\t\t\t\telse \n\t\t\t\t\tif elem.oclIsTypeOf(Image) then\n\t\t\t\t\t\t\'Image\'\n\t\t\t\t\telse\n\t\t\t\t\t\t\'Video\'\n\t\t\t\t\tendif\n\t\t\t\tendif)'"
	 * @generated
	 */
	String getArgumentType(SimpleElement elem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" objectRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='object.usetemplate.arguments->iterate(elem : Argument; ctype:Sequence(String) =Sequence{} |\n\t\t\t\tif elem.oclIsKindOf(SimpleElement) then\n\t\t\t\t\tctype->including(getArgumentType(elem.oclAsType(SimpleElement)))\n\t\t\t\telse\n\t\t\t\t\telem.oclAsType(Widget).widgetarguments->iterate(e : Argument; ctype:Sequence(String) = ctype |\n\t\t\t\t\t\tif e.oclIsKindOf(SimpleElement) then\n\t\t\t\t\t\t\tctype->including(getArgumentType(e.oclAsType(SimpleElement)))\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tctype->including(\'Variable\')\n\t\t\t\t\t\tendif\t\n\t\t\t\t\t)\n\t\t\t\tendif\n\t\t\t)'"
	 * @generated
	 */
	EList<String> getArguments(Row object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" eRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t(if e =TypeSimpleElement::Text then\t\t\n\t\t\t\t\t\t\'Text\'\n\t\t\t\telse \n\t\t\t\t\tif e =TypeSimpleElement::Image then\n\t\t\t\t\t\t\'Image\'\n\t\t\t\t\telse\n\t\t\t\t\t\t\'Video\'\n\t\t\t\t\tendif\n\t\t\t\tendif)'"
	 * @generated
	 */
	String getParameterType(TypeSimpleElement e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" objectRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='object.usetemplate.typetemplate.rows.columns.elements->iterate (elem: ContentElement; ctype:Sequence(String) =Sequence{} |\n\t\t\t\tif (elem.oclIsTypeOf(Fixed)) then\n\t\t\t\t\tif (elem.oclAsType(Fixed).type.oclIsTypeOf(WidgetType)) then\n\t\t\t\t\t\telem.oclAsType(Fixed).type.oclAsType(WidgetType).parameters->iterate(e : Parameter; ctype:Sequence(String) = ctype |\n\t\t\t\t\t\t\tif (e.oclIsTypeOf(Fixed)) then\n\t\t\t\t\t\t\t\tctype->including(getParameterType(e.oclAsType(Fixed).type.oclAsType(SimpleType).type))\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tctype->including(\'Variable\')\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t)\n\t\t\t\t\telse\n\t\t\t\t\t\tctype->including(getParameterType(elem.oclAsType(Fixed).type.oclAsType(SimpleType).type))\n\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\telse \n\t\t\t\t\tctype\n\t\t\t\tendif\t\n\t\t\t)'"
	 * @generated
	 */
	EList<String> getParameters(Row object);

} // Row
