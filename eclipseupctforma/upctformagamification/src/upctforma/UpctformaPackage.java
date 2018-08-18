/**
 */
package upctforma;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see upctforma.UpctformaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface UpctformaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "upctforma";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpcd.upct.es/upctforma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "upctforma";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformaPackage eINSTANCE = upctforma.impl.UpctformaPackageImpl.init();

	/**
	 * The meta object id for the '{@link upctforma.impl.ColumnElementImpl <em>Column Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ColumnElementImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getColumnElement()
	 * @generated
	 */
	int COLUMN_ELEMENT = 9;

	/**
	 * The number of structural features of the '<em>Column Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Column Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.CompositeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 6;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = COLUMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = COLUMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ColumnImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ELEMENTS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.NameElementImpl <em>Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.NameElementImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getNameElement()
	 * @generated
	 */
	int NAME_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.TemplateDefImpl <em>Template Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.TemplateDefImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getTemplateDef()
	 * @generated
	 */
	int TEMPLATE_DEF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__ROWS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.SimpleImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 10;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = COLUMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = COLUMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ImageImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.WidgetImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 4;

	/**
	 * The feature id for the '<em><b>Typewidget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TYPEWIDGET = COLUMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = COLUMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = COLUMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.TextImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 5;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PARAGRAPHS = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.VideoImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URL = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.DefinitionImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TEMPLATES = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__WIDGETS = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IMPORTS = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__UNIT = NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TYPES = NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.WidgetDefImpl <em>Widget Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.WidgetDefImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getWidgetDef()
	 * @generated
	 */
	int WIDGET_DEF = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF__PARAMETERS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Widget Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ParameterImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 12;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = COLUMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = COLUMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.RowImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 13;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLUMNS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usetemplate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__USETEMPLATE = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Argument Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_ARGUMENT_TYPE__SIMPLE = COMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_ARGUMENTS__ROW = COMPOSITE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_PARAMETER_TYPE__TYPESIMPLEELEMENT = COMPOSITE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_PARAMETERS__ROW = COMPOSITE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link upctforma.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.UnitImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SECTIONS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__AUTHOR = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.SectionImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ROWS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__IMAGE = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ImportImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 16;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ParagraphImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 17;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ArgumentImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 18;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.CompositeArgumentImpl <em>Composite Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.CompositeArgumentImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getCompositeArgument()
	 * @generated
	 */
	int COMPOSITE_ARGUMENT = 26;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ARGUMENT__ARGUMENTS = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.TabImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 19;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ARGUMENTS = COMPOSITE_ARGUMENT__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = COMPOSITE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = COMPOSITE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.AnimationImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 20;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__ARGUMENTS = COMPOSITE_ARGUMENT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__WIDTH = COMPOSITE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__IMAGE = COMPOSITE_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = COMPOSITE_ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = COMPOSITE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.DragAndDropImpl <em>Drag And Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.DragAndDropImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getDragAndDrop()
	 * @generated
	 */
	int DRAG_AND_DROP = 21;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAG_AND_DROP__ARGUMENTS = COMPOSITE_ARGUMENT__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Drag And Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAG_AND_DROP_FEATURE_COUNT = COMPOSITE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drag And Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAG_AND_DROP_OPERATION_COUNT = COMPOSITE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.UseTemplateImpl <em>Use Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.UseTemplateImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getUseTemplate()
	 * @generated
	 */
	int USE_TEMPLATE = 22;

	/**
	 * The feature id for the '<em><b>Typetemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE__TYPETEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE__ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Use Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Use Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.TypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAME_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.SimpleTypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.DataTypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.FixedImpl <em>Fixed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.FixedImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getFixed()
	 * @generated
	 */
	int FIXED = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__TYPE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.VariableImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.TypeSimpleElement <em>Type Simple Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.TypeSimpleElement
	 * @see upctforma.impl.UpctformaPackageImpl#getTypeSimpleElement()
	 * @generated
	 */
	int TYPE_SIMPLE_ELEMENT = 29;


	/**
	 * Returns the meta object for class '{@link upctforma.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see upctforma.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Column#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see upctforma.Column#getElements()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Elements();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Column#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see upctforma.Column#getWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Width();

	/**
	 * Returns the meta object for class '{@link upctforma.TemplateDef <em>Template Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Def</em>'.
	 * @see upctforma.TemplateDef
	 * @generated
	 */
	EClass getTemplateDef();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.TemplateDef#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see upctforma.TemplateDef#getRows()
	 * @see #getTemplateDef()
	 * @generated
	 */
	EReference getTemplateDef_Rows();

	/**
	 * Returns the meta object for class '{@link upctforma.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see upctforma.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Image#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see upctforma.Image#getUrl()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Url();

	/**
	 * Returns the meta object for class '{@link upctforma.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Element</em>'.
	 * @see upctforma.NameElement
	 * @generated
	 */
	EClass getNameElement();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.NameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see upctforma.NameElement#getName()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Name();

	/**
	 * Returns the meta object for class '{@link upctforma.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see upctforma.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the reference '{@link upctforma.Widget#getTypewidget <em>Typewidget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typewidget</em>'.
	 * @see upctforma.Widget#getTypewidget()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Typewidget();

	/**
	 * Returns the meta object for class '{@link upctforma.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see upctforma.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Text#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see upctforma.Text#getParagraphs()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Paragraphs();

	/**
	 * Returns the meta object for class '{@link upctforma.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see upctforma.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link upctforma.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see upctforma.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Video#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see upctforma.Video#getUrl()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Url();

	/**
	 * Returns the meta object for class '{@link upctforma.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see upctforma.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Definition#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see upctforma.Definition#getTemplates()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Definition#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see upctforma.Definition#getWidgets()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Widgets();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Definition#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see upctforma.Definition#getImports()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link upctforma.Definition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see upctforma.Definition#getUnit()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Definition#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see upctforma.Definition#getTypes()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Types();

	/**
	 * Returns the meta object for class '{@link upctforma.ColumnElement <em>Column Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Element</em>'.
	 * @see upctforma.ColumnElement
	 * @generated
	 */
	EClass getColumnElement();

	/**
	 * Returns the meta object for class '{@link upctforma.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see upctforma.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for class '{@link upctforma.WidgetDef <em>Widget Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Def</em>'.
	 * @see upctforma.WidgetDef
	 * @generated
	 */
	EClass getWidgetDef();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.WidgetDef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see upctforma.WidgetDef#getParameters()
	 * @see #getWidgetDef()
	 * @generated
	 */
	EReference getWidgetDef_Parameters();

	/**
	 * Returns the meta object for class '{@link upctforma.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see upctforma.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link upctforma.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see upctforma.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Row#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see upctforma.Row#getColumns()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link upctforma.Row#getUsetemplate <em>Usetemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usetemplate</em>'.
	 * @see upctforma.Row#getUsetemplate()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Usetemplate();

	/**
	 * Returns the meta object for the '{@link upctforma.Row#getArgumentType(upctforma.Simple) <em>Get Argument Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Argument Type</em>' operation.
	 * @see upctforma.Row#getArgumentType(upctforma.Simple)
	 * @generated
	 */
	EOperation getRow__GetArgumentType__Simple();

	/**
	 * Returns the meta object for the '{@link upctforma.Row#getArguments(upctforma.Row) <em>Get Arguments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arguments</em>' operation.
	 * @see upctforma.Row#getArguments(upctforma.Row)
	 * @generated
	 */
	EOperation getRow__GetArguments__Row();

	/**
	 * Returns the meta object for the '{@link upctforma.Row#getParameterType(upctforma.TypeSimpleElement) <em>Get Parameter Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter Type</em>' operation.
	 * @see upctforma.Row#getParameterType(upctforma.TypeSimpleElement)
	 * @generated
	 */
	EOperation getRow__GetParameterType__TypeSimpleElement();

	/**
	 * Returns the meta object for the '{@link upctforma.Row#getParameters(upctforma.Row) <em>Get Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameters</em>' operation.
	 * @see upctforma.Row#getParameters(upctforma.Row)
	 * @generated
	 */
	EOperation getRow__GetParameters__Row();

	/**
	 * Returns the meta object for class '{@link upctforma.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see upctforma.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Unit#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see upctforma.Unit#getSections()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Sections();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Unit#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see upctforma.Unit#getAuthor()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Author();

	/**
	 * Returns the meta object for class '{@link upctforma.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see upctforma.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Section#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see upctforma.Section#getRows()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Rows();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Section#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see upctforma.Section#getImage()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Image();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see upctforma.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Title();

	/**
	 * Returns the meta object for class '{@link upctforma.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see upctforma.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see upctforma.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link upctforma.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see upctforma.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see upctforma.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for class '{@link upctforma.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see upctforma.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link upctforma.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see upctforma.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for class '{@link upctforma.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see upctforma.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Animation#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see upctforma.Animation#getWidth()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Width();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Animation#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see upctforma.Animation#getImage()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Image();

	/**
	 * Returns the meta object for class '{@link upctforma.DragAndDrop <em>Drag And Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drag And Drop</em>'.
	 * @see upctforma.DragAndDrop
	 * @generated
	 */
	EClass getDragAndDrop();

	/**
	 * Returns the meta object for class '{@link upctforma.UseTemplate <em>Use Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Template</em>'.
	 * @see upctforma.UseTemplate
	 * @generated
	 */
	EClass getUseTemplate();

	/**
	 * Returns the meta object for the reference '{@link upctforma.UseTemplate#getTypetemplate <em>Typetemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typetemplate</em>'.
	 * @see upctforma.UseTemplate#getTypetemplate()
	 * @see #getUseTemplate()
	 * @generated
	 */
	EReference getUseTemplate_Typetemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.UseTemplate#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see upctforma.UseTemplate#getArguments()
	 * @see #getUseTemplate()
	 * @generated
	 */
	EReference getUseTemplate_Arguments();

	/**
	 * Returns the meta object for class '{@link upctforma.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see upctforma.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link upctforma.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see upctforma.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.SimpleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctforma.SimpleType#getType()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Type();

	/**
	 * Returns the meta object for class '{@link upctforma.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see upctforma.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.DataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see upctforma.DataType#getType()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Type();

	/**
	 * Returns the meta object for class '{@link upctforma.CompositeArgument <em>Composite Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Argument</em>'.
	 * @see upctforma.CompositeArgument
	 * @generated
	 */
	EClass getCompositeArgument();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.CompositeArgument#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see upctforma.CompositeArgument#getArguments()
	 * @see #getCompositeArgument()
	 * @generated
	 */
	EReference getCompositeArgument_Arguments();

	/**
	 * Returns the meta object for class '{@link upctforma.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed</em>'.
	 * @see upctforma.Fixed
	 * @generated
	 */
	EClass getFixed();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Fixed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctforma.Fixed#getType()
	 * @see #getFixed()
	 * @generated
	 */
	EAttribute getFixed_Type();

	/**
	 * Returns the meta object for class '{@link upctforma.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see upctforma.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link upctforma.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see upctforma.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for enum '{@link upctforma.TypeSimpleElement <em>Type Simple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Simple Element</em>'.
	 * @see upctforma.TypeSimpleElement
	 * @generated
	 */
	EEnum getTypeSimpleElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UpctformaFactory getUpctformaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link upctforma.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ColumnImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__ELEMENTS = eINSTANCE.getColumn_Elements();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__WIDTH = eINSTANCE.getColumn_Width();

		/**
		 * The meta object literal for the '{@link upctforma.impl.TemplateDefImpl <em>Template Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.TemplateDefImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getTemplateDef()
		 * @generated
		 */
		EClass TEMPLATE_DEF = eINSTANCE.getTemplateDef();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEF__ROWS = eINSTANCE.getTemplateDef_Rows();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ImageImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

		/**
		 * The meta object literal for the '{@link upctforma.impl.NameElementImpl <em>Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.NameElementImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getNameElement()
		 * @generated
		 */
		EClass NAME_ELEMENT = eINSTANCE.getNameElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__NAME = eINSTANCE.getNameElement_Name();

		/**
		 * The meta object literal for the '{@link upctforma.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.WidgetImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Typewidget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__TYPEWIDGET = eINSTANCE.getWidget_Typewidget();

		/**
		 * The meta object literal for the '{@link upctforma.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.TextImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__PARAGRAPHS = eINSTANCE.getText_Paragraphs();

		/**
		 * The meta object literal for the '{@link upctforma.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.CompositeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link upctforma.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.VideoImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__URL = eINSTANCE.getVideo_Url();

		/**
		 * The meta object literal for the '{@link upctforma.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.DefinitionImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__TEMPLATES = eINSTANCE.getDefinition_Templates();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__WIDGETS = eINSTANCE.getDefinition_Widgets();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__IMPORTS = eINSTANCE.getDefinition_Imports();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__UNIT = eINSTANCE.getDefinition_Unit();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__TYPES = eINSTANCE.getDefinition_Types();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ColumnElementImpl <em>Column Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ColumnElementImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getColumnElement()
		 * @generated
		 */
		EClass COLUMN_ELEMENT = eINSTANCE.getColumnElement();

		/**
		 * The meta object literal for the '{@link upctforma.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.SimpleImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '{@link upctforma.impl.WidgetDefImpl <em>Widget Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.WidgetDefImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getWidgetDef()
		 * @generated
		 */
		EClass WIDGET_DEF = eINSTANCE.getWidgetDef();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_DEF__PARAMETERS = eINSTANCE.getWidgetDef_Parameters();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ParameterImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link upctforma.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.RowImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__COLUMNS = eINSTANCE.getRow_Columns();

		/**
		 * The meta object literal for the '<em><b>Usetemplate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__USETEMPLATE = eINSTANCE.getRow_Usetemplate();

		/**
		 * The meta object literal for the '<em><b>Get Argument Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW___GET_ARGUMENT_TYPE__SIMPLE = eINSTANCE.getRow__GetArgumentType__Simple();

		/**
		 * The meta object literal for the '<em><b>Get Arguments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW___GET_ARGUMENTS__ROW = eINSTANCE.getRow__GetArguments__Row();

		/**
		 * The meta object literal for the '<em><b>Get Parameter Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW___GET_PARAMETER_TYPE__TYPESIMPLEELEMENT = eINSTANCE.getRow__GetParameterType__TypeSimpleElement();

		/**
		 * The meta object literal for the '<em><b>Get Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW___GET_PARAMETERS__ROW = eINSTANCE.getRow__GetParameters__Row();

		/**
		 * The meta object literal for the '{@link upctforma.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.UnitImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__SECTIONS = eINSTANCE.getUnit_Sections();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__AUTHOR = eINSTANCE.getUnit_Author();

		/**
		 * The meta object literal for the '{@link upctforma.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.SectionImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__ROWS = eINSTANCE.getSection_Rows();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__IMAGE = eINSTANCE.getSection_Image();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ImportImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ParagraphImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ArgumentImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link upctforma.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.TabImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '{@link upctforma.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.AnimationImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__WIDTH = eINSTANCE.getAnimation_Width();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__IMAGE = eINSTANCE.getAnimation_Image();

		/**
		 * The meta object literal for the '{@link upctforma.impl.DragAndDropImpl <em>Drag And Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.DragAndDropImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getDragAndDrop()
		 * @generated
		 */
		EClass DRAG_AND_DROP = eINSTANCE.getDragAndDrop();

		/**
		 * The meta object literal for the '{@link upctforma.impl.UseTemplateImpl <em>Use Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.UseTemplateImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getUseTemplate()
		 * @generated
		 */
		EClass USE_TEMPLATE = eINSTANCE.getUseTemplate();

		/**
		 * The meta object literal for the '<em><b>Typetemplate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_TEMPLATE__TYPETEMPLATE = eINSTANCE.getUseTemplate_Typetemplate();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_TEMPLATE__ARGUMENTS = eINSTANCE.getUseTemplate_Arguments();

		/**
		 * The meta object literal for the '{@link upctforma.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.TypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link upctforma.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.SimpleTypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__TYPE = eINSTANCE.getSimpleType_Type();

		/**
		 * The meta object literal for the '{@link upctforma.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.DataTypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__TYPE = eINSTANCE.getDataType_Type();

		/**
		 * The meta object literal for the '{@link upctforma.impl.CompositeArgumentImpl <em>Composite Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.CompositeArgumentImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getCompositeArgument()
		 * @generated
		 */
		EClass COMPOSITE_ARGUMENT = eINSTANCE.getCompositeArgument();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ARGUMENT__ARGUMENTS = eINSTANCE.getCompositeArgument_Arguments();

		/**
		 * The meta object literal for the '{@link upctforma.impl.FixedImpl <em>Fixed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.FixedImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getFixed()
		 * @generated
		 */
		EClass FIXED = eINSTANCE.getFixed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED__TYPE = eINSTANCE.getFixed_Type();

		/**
		 * The meta object literal for the '{@link upctforma.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.VariableImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link upctforma.TypeSimpleElement <em>Type Simple Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.TypeSimpleElement
		 * @see upctforma.impl.UpctformaPackageImpl#getTypeSimpleElement()
		 * @generated
		 */
		EEnum TYPE_SIMPLE_ELEMENT = eINSTANCE.getTypeSimpleElement();

	}

} //UpctformaPackage
