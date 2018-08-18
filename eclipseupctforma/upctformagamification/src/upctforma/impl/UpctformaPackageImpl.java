/**
 */
package upctforma.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import upctforma.Animation;
import upctforma.Argument;
import upctforma.Column;
import upctforma.ColumnElement;
import upctforma.Composite;
import upctforma.CompositeArgument;
import upctforma.DataType;
import upctforma.Definition;
import upctforma.DragAndDrop;
import upctforma.Fixed;
import upctforma.Image;
import upctforma.Import;
import upctforma.NameElement;
import upctforma.Paragraph;
import upctforma.Parameter;
import upctforma.Row;
import upctforma.Section;
import upctforma.Simple;
import upctforma.SimpleType;
import upctforma.Tab;
import upctforma.TemplateDef;
import upctforma.Text;
import upctforma.Type;
import upctforma.TypeSimpleElement;
import upctforma.Unit;
import upctforma.UpctformaFactory;
import upctforma.UpctformaPackage;
import upctforma.UseTemplate;
import upctforma.Variable;
import upctforma.Video;
import upctforma.Widget;
import upctforma.WidgetDef;

import upctforma.util.UpctformaValidator;

import upctformagamification.UpctformagamificationPackage;

import upctformagamification.impl.UpctformagamificationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformaPackageImpl extends EPackageImpl implements UpctformaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dragAndDropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSimpleElementEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see upctforma.UpctformaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UpctformaPackageImpl() {
		super(eNS_URI, UpctformaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UpctformaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UpctformaPackage init() {
		if (isInited) return (UpctformaPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformaPackage.eNS_URI);

		// Obtain or create and register package
		UpctformaPackageImpl theUpctformaPackage = (UpctformaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UpctformaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UpctformaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UpctformagamificationPackageImpl theUpctformagamificationPackage = (UpctformagamificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UpctformagamificationPackage.eNS_URI) instanceof UpctformagamificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UpctformagamificationPackage.eNS_URI) : UpctformagamificationPackage.eINSTANCE);

		// Create package meta-data objects
		theUpctformaPackage.createPackageContents();
		theUpctformagamificationPackage.createPackageContents();

		// Initialize created meta-data
		theUpctformaPackage.initializePackageContents();
		theUpctformagamificationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUpctformaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UpctformaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUpctformaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UpctformaPackage.eNS_URI, theUpctformaPackage);
		return theUpctformaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Elements() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Width() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateDef() {
		return templateDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateDef_Rows() {
		return (EReference)templateDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Url() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameElement() {
		return nameElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameElement_Name() {
		return (EAttribute)nameElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Typewidget() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Paragraphs() {
		return (EReference)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Url() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Templates() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Widgets() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Imports() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Unit() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Types() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnElement() {
		return columnElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetDef() {
		return widgetDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetDef_Parameters() {
		return (EReference)widgetDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Columns() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Usetemplate() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRow__GetArgumentType__Simple() {
		return rowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRow__GetArguments__Row() {
		return rowEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRow__GetParameterType__TypeSimpleElement() {
		return rowEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRow__GetParameters__Row() {
		return rowEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Sections() {
		return (EReference)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Author() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Rows() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Image() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Title() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Text() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimation() {
		return animationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Width() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Image() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDragAndDrop() {
		return dragAndDropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseTemplate() {
		return useTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseTemplate_Typetemplate() {
		return (EReference)useTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseTemplate_Arguments() {
		return (EReference)useTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Type() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Type() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeArgument() {
		return compositeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeArgument_Arguments() {
		return (EReference)compositeArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixed() {
		return fixedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixed_Type() {
		return (EAttribute)fixedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSimpleElement() {
		return typeSimpleElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaFactory getUpctformaFactory() {
		return (UpctformaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__ELEMENTS);
		createEAttribute(columnEClass, COLUMN__WIDTH);

		templateDefEClass = createEClass(TEMPLATE_DEF);
		createEReference(templateDefEClass, TEMPLATE_DEF__ROWS);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__URL);

		nameElementEClass = createEClass(NAME_ELEMENT);
		createEAttribute(nameElementEClass, NAME_ELEMENT__NAME);

		widgetEClass = createEClass(WIDGET);
		createEReference(widgetEClass, WIDGET__TYPEWIDGET);

		textEClass = createEClass(TEXT);
		createEReference(textEClass, TEXT__PARAGRAPHS);

		compositeEClass = createEClass(COMPOSITE);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__URL);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__TEMPLATES);
		createEReference(definitionEClass, DEFINITION__WIDGETS);
		createEReference(definitionEClass, DEFINITION__IMPORTS);
		createEReference(definitionEClass, DEFINITION__UNIT);
		createEReference(definitionEClass, DEFINITION__TYPES);

		columnElementEClass = createEClass(COLUMN_ELEMENT);

		simpleEClass = createEClass(SIMPLE);

		widgetDefEClass = createEClass(WIDGET_DEF);
		createEReference(widgetDefEClass, WIDGET_DEF__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__COLUMNS);
		createEReference(rowEClass, ROW__USETEMPLATE);
		createEOperation(rowEClass, ROW___GET_ARGUMENT_TYPE__SIMPLE);
		createEOperation(rowEClass, ROW___GET_ARGUMENTS__ROW);
		createEOperation(rowEClass, ROW___GET_PARAMETER_TYPE__TYPESIMPLEELEMENT);
		createEOperation(rowEClass, ROW___GET_PARAMETERS__ROW);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__SECTIONS);
		createEAttribute(unitEClass, UNIT__AUTHOR);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__ROWS);
		createEAttribute(sectionEClass, SECTION__IMAGE);
		createEAttribute(sectionEClass, SECTION__TITLE);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__TEXT);

		argumentEClass = createEClass(ARGUMENT);

		tabEClass = createEClass(TAB);

		animationEClass = createEClass(ANIMATION);
		createEAttribute(animationEClass, ANIMATION__WIDTH);
		createEAttribute(animationEClass, ANIMATION__IMAGE);

		dragAndDropEClass = createEClass(DRAG_AND_DROP);

		useTemplateEClass = createEClass(USE_TEMPLATE);
		createEReference(useTemplateEClass, USE_TEMPLATE__TYPETEMPLATE);
		createEReference(useTemplateEClass, USE_TEMPLATE__ARGUMENTS);

		typeEClass = createEClass(TYPE);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__TYPE);

		compositeArgumentEClass = createEClass(COMPOSITE_ARGUMENT);
		createEReference(compositeArgumentEClass, COMPOSITE_ARGUMENT__ARGUMENTS);

		fixedEClass = createEClass(FIXED);
		createEAttribute(fixedEClass, FIXED__TYPE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE);

		// Create enums
		typeSimpleElementEEnum = createEEnum(TYPE_SIMPLE_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		columnEClass.getESuperTypes().add(this.getComposite());
		templateDefEClass.getESuperTypes().add(this.getNameElement());
		imageEClass.getESuperTypes().add(this.getSimple());
		widgetEClass.getESuperTypes().add(this.getColumnElement());
		textEClass.getESuperTypes().add(this.getSimple());
		compositeEClass.getESuperTypes().add(this.getColumnElement());
		videoEClass.getESuperTypes().add(this.getSimple());
		definitionEClass.getESuperTypes().add(this.getNameElement());
		simpleEClass.getESuperTypes().add(this.getColumnElement());
		simpleEClass.getESuperTypes().add(this.getArgument());
		widgetDefEClass.getESuperTypes().add(this.getNameElement());
		parameterEClass.getESuperTypes().add(this.getColumnElement());
		rowEClass.getESuperTypes().add(this.getComposite());
		unitEClass.getESuperTypes().add(this.getNameElement());
		sectionEClass.getESuperTypes().add(this.getNameElement());
		tabEClass.getESuperTypes().add(this.getCompositeArgument());
		animationEClass.getESuperTypes().add(this.getCompositeArgument());
		dragAndDropEClass.getESuperTypes().add(this.getCompositeArgument());
		typeEClass.getESuperTypes().add(this.getNameElement());
		simpleTypeEClass.getESuperTypes().add(this.getType());
		dataTypeEClass.getESuperTypes().add(this.getType());
		compositeArgumentEClass.getESuperTypes().add(this.getArgument());
		fixedEClass.getESuperTypes().add(this.getParameter());
		variableEClass.getESuperTypes().add(this.getParameter());

		// Initialize classes, features, and operations; add parameters
		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Elements(), this.getColumnElement(), null, "elements", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Width(), ecorePackage.getEString(), "width", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateDefEClass, TemplateDef.class, "TemplateDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateDef_Rows(), this.getRow(), null, "rows", null, 0, -1, TemplateDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Url(), ecorePackage.getEString(), "url", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameElementEClass, NameElement.class, "NameElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidget_Typewidget(), this.getWidgetDef(), null, "typewidget", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getText_Paragraphs(), this.getParagraph(), null, "paragraphs", null, 1, -1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Url(), ecorePackage.getEString(), "url", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_Templates(), this.getTemplateDef(), null, "templates", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_Widgets(), this.getWidgetDef(), null, "widgets", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_Imports(), this.getImport(), null, "imports", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_Unit(), this.getUnit(), null, "unit", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_Types(), this.getType(), null, "types", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnElementEClass, ColumnElement.class, "ColumnElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetDefEClass, WidgetDef.class, "WidgetDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetDef_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, WidgetDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Columns(), this.getColumn(), null, "columns", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRow_Usetemplate(), this.getUseTemplate(), null, "usetemplate", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRow__GetArgumentType__Simple(), ecorePackage.getEString(), "getArgumentType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSimple(), "elem", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRow__GetArguments__Row(), ecorePackage.getEString(), "getArguments", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRow(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRow__GetParameterType__TypeSimpleElement(), ecorePackage.getEString(), "getParameterType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeSimpleElement(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRow__GetParameters__Row(), ecorePackage.getEString(), "getParameters", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRow(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Sections(), this.getSection(), null, "sections", null, 1, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Author(), ecorePackage.getEString(), "author", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Rows(), this.getRow(), null, "rows", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Image(), ecorePackage.getEString(), "image", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Title(), ecorePackage.getEString(), "title", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Text(), ecorePackage.getEString(), "text", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(animationEClass, Animation.class, "Animation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimation_Width(), ecorePackage.getEString(), "width", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_Image(), ecorePackage.getEString(), "image", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dragAndDropEClass, DragAndDrop.class, "DragAndDrop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(useTemplateEClass, UseTemplate.class, "UseTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseTemplate_Typetemplate(), this.getTemplateDef(), null, "typetemplate", null, 0, 1, UseTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseTemplate_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, UseTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleType_Type(), this.getTypeSimpleElement(), "type", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Type(), this.getSimpleType(), null, "type", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeArgumentEClass, CompositeArgument.class, "CompositeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeArgument_Arguments(), this.getSimple(), null, "arguments", null, 0, -1, CompositeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedEClass, Fixed.class, "Fixed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixed_Type(), this.getTypeSimpleElement(), "type", null, 0, 1, Fixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Type(), this.getDataType(), null, "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeSimpleElementEEnum, TypeSimpleElement.class, "TypeSimpleElement");
		addEEnumLiteral(typeSimpleElementEEnum, TypeSimpleElement.TEXT);
		addEEnumLiteral(typeSimpleElementEEnum, TypeSimpleElement.IMAGE);
		addEEnumLiteral(typeSimpleElementEEnum, TypeSimpleElement.VIDEO);
		addEEnumLiteral(typeSimpleElementEEnum, TypeSimpleElement.UNDEFINED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkNoParameterVariable"
		   });	
		addAnnotation
		  (rowEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkNumberArgumentParameter checkRowManualNoUseTemplate"
		   });	
		addAnnotation
		  (animationEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkTypeImage"
		   });	
		addAnnotation
		  (dragAndDropEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkTypeImage"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "checkNoParameterVariable", "self.elements->forAll( e | e.oclIsKindOf(Variable)=false)"
		   });	
		addAnnotation
		  (rowEClass, 
		   source, 
		   new String[] {
			 "checkNumberArgumentParameter", "if ((self.oclContainer().oclIsTypeOf(Section)) and (self.usetemplate.typetemplate.oclIsUndefined() = false)) then self.getParameters(self) = self.getArguments(self) else true endif",
			 "checkRowManualNoUseTemplate", " if self.oclContainer().oclIsTypeOf(Section) then if (self.columns->size() > 0) then self.usetemplate->size() = 0 else self.usetemplate->size() > 0 endif else true endif"
		   });	
		addAnnotation
		  (getRow__GetArgumentType__Simple(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\t(if elem.oclIsTypeOf(Text) then\n\t\t\t\t\t\'Text\'\n\t\t\t\telse \n\t\t\t\t\tif elem.oclIsTypeOf(Image) then\n\t\t\t\t\t\t\'Image\'\n\t\t\t\t\telse\n\t\t\t\t\t\t\'Video\'\n\t\t\t\t\tendif\n\t\t\t\tendif)"
		   });	
		addAnnotation
		  (getRow__GetArguments__Row(), 
		   source, 
		   new String[] {
			 "body", "object.usetemplate.arguments->iterate(elem : Argument; ctype:Sequence(String) =Sequence{} |\n\t\t\t\tif elem.oclIsKindOf(Simple) then\n\t\t\t\t\tctype->including(getArgumentType(elem.oclAsType(Simple)))\n\t\t\t\telse\n\t\t\t\t\tctype->including(\'Variable\')\n\t\t\t\tendif\n\n\t\t\t)"
		   });	
		addAnnotation
		  (getRow__GetParameterType__TypeSimpleElement(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\t(if e =TypeSimpleElement::Text then\t\t\n\t\t\t\t\t\t\'Text\'\n\t\t\t\telse \n\t\t\t\t\tif e =TypeSimpleElement::Image then\n\t\t\t\t\t\t\'Image\'\n\t\t\t\t\telse\n\t\t\t\t\t\t\'Video\'\n\t\t\t\t\tendif\n\t\t\t\tendif)"
		   });	
		addAnnotation
		  (getRow__GetParameters__Row(), 
		   source, 
		   new String[] {
			 "body", "object.usetemplate.typetemplate.rows.columns.elements->iterate (elem: ColumnElement; ctype:Sequence(String) =Sequence{} |\n\t\t\t\tif (elem.oclIsTypeOf(Fixed)) then\n\t\t\t\t\tctype->including(getParameterType(elem.oclAsType(Fixed).type))\t\t\t\t\t\t\t\n\t\t\t\telse if (elem.oclIsTypeOf(Widget)) then\n\t\t\t\t\t\telem.oclAsType(Widget).typewidget.parameters->iterate(e : Parameter; ctype:Sequence(String) = ctype |\n\t\t\t\t\t\t\tif (e.oclIsTypeOf(Fixed)) then\n\t\t\t\t\t\t\t\tctype->including(getParameterType(e.oclAsType(Fixed).type))\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tctype->including(\'Variable\')\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t)\n\t\t\t\t\telse\n\t\t\t\t\t\tctype\n\t\t\t\t\tendif\n\t\t\t\tendif\t\n\t\t\t)"
		   });	
		addAnnotation
		  (animationEClass, 
		   source, 
		   new String[] {
			 "checkTypeImage", "self.arguments->forAll( e | e.oclIsKindOf(Image)=true)"
		   });	
		addAnnotation
		  (dragAndDropEClass, 
		   source, 
		   new String[] {
			 "checkTypeImage", "self.arguments->forAll( e | e.oclIsKindOf(Image)=true)"
		   });
	}

} //UpctformaPackageImpl
