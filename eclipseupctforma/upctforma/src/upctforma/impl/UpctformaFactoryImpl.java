/**
 */
package upctforma.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import upctforma.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformaFactoryImpl extends EFactoryImpl implements UpctformaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpctformaFactory init() {
		try {
			UpctformaFactory theUpctformaFactory = (UpctformaFactory)EPackage.Registry.INSTANCE.getEFactory(UpctformaPackage.eNS_URI);
			if (theUpctformaFactory != null) {
				return theUpctformaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UpctformaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UpctformaPackage.COLUMN: return createColumn();
			case UpctformaPackage.TEMPLATE_DEF: return createTemplateDef();
			case UpctformaPackage.IMAGE: return createImage();
			case UpctformaPackage.NAME_ELEMENT: return createNameElement();
			case UpctformaPackage.WIDGET: return createWidget();
			case UpctformaPackage.TEXT: return createText();
			case UpctformaPackage.COMPOSITE: return createComposite();
			case UpctformaPackage.VIDEO: return createVideo();
			case UpctformaPackage.CONTENT_DEFINITION: return createContentDefinition();
			case UpctformaPackage.CONTENT_ELEMENT: return createContentElement();
			case UpctformaPackage.SIMPLE_ELEMENT: return createSimpleElement();
			case UpctformaPackage.PARAMETER: return createParameter();
			case UpctformaPackage.ROW: return createRow();
			case UpctformaPackage.UNIT: return createUnit();
			case UpctformaPackage.SECTION: return createSection();
			case UpctformaPackage.IMPORT: return createImport();
			case UpctformaPackage.PARAGRAPH: return createParagraph();
			case UpctformaPackage.ARGUMENT: return createArgument();
			case UpctformaPackage.TAB: return createTab();
			case UpctformaPackage.ANIMATION: return createAnimation();
			case UpctformaPackage.DRAG_AND_DROP: return createDragAndDrop();
			case UpctformaPackage.USE_TEMPLATE: return createUseTemplate();
			case UpctformaPackage.TYPE: return createType();
			case UpctformaPackage.SIMPLE_TYPE: return createSimpleType();
			case UpctformaPackage.AGGREGATED_TYPE: return createAggregatedType();
			case UpctformaPackage.COMPOSITE_ARGUMENT: return createCompositeArgument();
			case UpctformaPackage.FIXED: return createFixed();
			case UpctformaPackage.VARIABLE: return createVariable();
			case UpctformaPackage.WIDGET_TYPE: return createWidgetType();
			case UpctformaPackage.LIST_TYPE: return createListType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UpctformaPackage.TYPE_SIMPLE_ELEMENT:
				return createTypeSimpleElementFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UpctformaPackage.TYPE_SIMPLE_ELEMENT:
				return convertTypeSimpleElementToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateDef createTemplateDef() {
		TemplateDefImpl templateDef = new TemplateDefImpl();
		return templateDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameElement createNameElement() {
		NameElementImpl nameElement = new NameElementImpl();
		return nameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition createContentDefinition() {
		ContentDefinitionImpl contentDefinition = new ContentDefinitionImpl();
		return contentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentElement createContentElement() {
		ContentElementImpl contentElement = new ContentElementImpl();
		return contentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleElement createSimpleElement() {
		SimpleElementImpl simpleElement = new SimpleElementImpl();
		return simpleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation createAnimation() {
		AnimationImpl animation = new AnimationImpl();
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DragAndDrop createDragAndDrop() {
		DragAndDropImpl dragAndDrop = new DragAndDropImpl();
		return dragAndDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseTemplate createUseTemplate() {
		UseTemplateImpl useTemplate = new UseTemplateImpl();
		return useTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedType createAggregatedType() {
		AggregatedTypeImpl aggregatedType = new AggregatedTypeImpl();
		return aggregatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeArgument createCompositeArgument() {
		CompositeArgumentImpl compositeArgument = new CompositeArgumentImpl();
		return compositeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixed createFixed() {
		FixedImpl fixed = new FixedImpl();
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetType createWidgetType() {
		WidgetTypeImpl widgetType = new WidgetTypeImpl();
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleElement createTypeSimpleElementFromString(EDataType eDataType, String initialValue) {
		TypeSimpleElement result = TypeSimpleElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSimpleElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaPackage getUpctformaPackage() {
		return (UpctformaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UpctformaPackage getPackage() {
		return UpctformaPackage.eINSTANCE;
	}

} //UpctformaFactoryImpl
