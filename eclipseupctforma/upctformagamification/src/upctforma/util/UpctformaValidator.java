/**
 */
package upctforma.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import upctforma.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see upctforma.UpctformaPackage
 * @generated
 */
public class UpctformaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UpctformaValidator INSTANCE = new UpctformaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "upctforma";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UpctformaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UpctformaPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case UpctformaPackage.TEMPLATE_DEF:
				return validateTemplateDef((TemplateDef)value, diagnostics, context);
			case UpctformaPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case UpctformaPackage.NAME_ELEMENT:
				return validateNameElement((NameElement)value, diagnostics, context);
			case UpctformaPackage.WIDGET:
				return validateWidget((Widget)value, diagnostics, context);
			case UpctformaPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case UpctformaPackage.COMPOSITE:
				return validateComposite((Composite)value, diagnostics, context);
			case UpctformaPackage.VIDEO:
				return validateVideo((Video)value, diagnostics, context);
			case UpctformaPackage.DEFINITION:
				return validateDefinition((Definition)value, diagnostics, context);
			case UpctformaPackage.COLUMN_ELEMENT:
				return validateColumnElement((ColumnElement)value, diagnostics, context);
			case UpctformaPackage.SIMPLE:
				return validateSimple((Simple)value, diagnostics, context);
			case UpctformaPackage.WIDGET_DEF:
				return validateWidgetDef((WidgetDef)value, diagnostics, context);
			case UpctformaPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case UpctformaPackage.ROW:
				return validateRow((Row)value, diagnostics, context);
			case UpctformaPackage.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case UpctformaPackage.SECTION:
				return validateSection((Section)value, diagnostics, context);
			case UpctformaPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case UpctformaPackage.PARAGRAPH:
				return validateParagraph((Paragraph)value, diagnostics, context);
			case UpctformaPackage.ARGUMENT:
				return validateArgument((Argument)value, diagnostics, context);
			case UpctformaPackage.TAB:
				return validateTab((Tab)value, diagnostics, context);
			case UpctformaPackage.ANIMATION:
				return validateAnimation((Animation)value, diagnostics, context);
			case UpctformaPackage.DRAG_AND_DROP:
				return validateDragAndDrop((DragAndDrop)value, diagnostics, context);
			case UpctformaPackage.USE_TEMPLATE:
				return validateUseTemplate((UseTemplate)value, diagnostics, context);
			case UpctformaPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case UpctformaPackage.SIMPLE_TYPE:
				return validateSimpleType((SimpleType)value, diagnostics, context);
			case UpctformaPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case UpctformaPackage.COMPOSITE_ARGUMENT:
				return validateCompositeArgument((CompositeArgument)value, diagnostics, context);
			case UpctformaPackage.FIXED:
				return validateFixed((Fixed)value, diagnostics, context);
			case UpctformaPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case UpctformaPackage.TYPE_SIMPLE_ELEMENT:
				return validateTypeSimpleElement((TypeSimpleElement)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_checkNoParameterVariable(column, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkNoParameterVariable constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__CHECK_NO_PARAMETER_VARIABLE__EEXPRESSION = "self.elements->forAll( e | e.oclIsKindOf(Variable)=false)";

	/**
	 * Validates the checkNoParameterVariable constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_checkNoParameterVariable(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UpctformaPackage.Literals.COLUMN,
				 column,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkNoParameterVariable",
				 COLUMN__CHECK_NO_PARAMETER_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateDef(TemplateDef templateDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameElement(NameElement nameElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidget(Widget widget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(widget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposite(Composite composite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideo(Video video, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(video, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinition(Definition definition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnElement(ColumnElement columnElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimple(Simple simple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidgetDef(WidgetDef widgetDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(widgetDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRow(Row row, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(row, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(row, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(row, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(row, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(row, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(row, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(row, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(row, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(row, diagnostics, context);
		if (result || diagnostics != null) result &= validateRow_checkNumberArgumentParameter(row, diagnostics, context);
		if (result || diagnostics != null) result &= validateRow_checkRowManualNoUseTemplate(row, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkNumberArgumentParameter constraint of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROW__CHECK_NUMBER_ARGUMENT_PARAMETER__EEXPRESSION = "if ((self.oclContainer().oclIsTypeOf(Section)) and (self.usetemplate.typetemplate.oclIsUndefined() = false)) then self.getParameters(self) = self.getArguments(self) else true endif";

	/**
	 * Validates the checkNumberArgumentParameter constraint of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRow_checkNumberArgumentParameter(Row row, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UpctformaPackage.Literals.ROW,
				 row,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkNumberArgumentParameter",
				 ROW__CHECK_NUMBER_ARGUMENT_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkRowManualNoUseTemplate constraint of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROW__CHECK_ROW_MANUAL_NO_USE_TEMPLATE__EEXPRESSION = " if self.oclContainer().oclIsTypeOf(Section) then if (self.columns->size() > 0) then self.usetemplate->size() = 0 else self.usetemplate->size() > 0 endif else true endif";

	/**
	 * Validates the checkRowManualNoUseTemplate constraint of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRow_checkRowManualNoUseTemplate(Row row, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UpctformaPackage.Literals.ROW,
				 row,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkRowManualNoUseTemplate",
				 ROW__CHECK_ROW_MANUAL_NO_USE_TEMPLATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(section, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraph(Paragraph paragraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paragraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTab(Tab tab, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tab, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnimation(Animation animation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(animation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(animation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnimation_checkTypeImage(animation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkTypeImage constraint of '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANIMATION__CHECK_TYPE_IMAGE__EEXPRESSION = "self.arguments->forAll( e | e.oclIsKindOf(Image)=true)";

	/**
	 * Validates the checkTypeImage constraint of '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnimation_checkTypeImage(Animation animation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UpctformaPackage.Literals.ANIMATION,
				 animation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkTypeImage",
				 ANIMATION__CHECK_TYPE_IMAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDragAndDrop(DragAndDrop dragAndDrop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dragAndDrop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dragAndDrop, diagnostics, context);
		if (result || diagnostics != null) result &= validateDragAndDrop_checkTypeImage(dragAndDrop, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkTypeImage constraint of '<em>Drag And Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DRAG_AND_DROP__CHECK_TYPE_IMAGE__EEXPRESSION = "self.arguments->forAll( e | e.oclIsKindOf(Image)=true)";

	/**
	 * Validates the checkTypeImage constraint of '<em>Drag And Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDragAndDrop_checkTypeImage(DragAndDrop dragAndDrop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UpctformaPackage.Literals.DRAG_AND_DROP,
				 dragAndDrop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkTypeImage",
				 DRAG_AND_DROP__CHECK_TYPE_IMAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseTemplate(UseTemplate useTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(useTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleType(SimpleType simpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeArgument(CompositeArgument compositeArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixed(Fixed fixed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeSimpleElement(TypeSimpleElement typeSimpleElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //UpctformaValidator
