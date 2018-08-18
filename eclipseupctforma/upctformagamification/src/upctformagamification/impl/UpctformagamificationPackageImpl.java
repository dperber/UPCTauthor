/**
 */
package upctformagamification.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import upctforma.UpctformaPackage;

import upctforma.impl.UpctformaPackageImpl;

import upctformagamification.Badge;
import upctformagamification.BadgeUnit;
import upctformagamification.Gamification;
import upctformagamification.Import;
import upctformagamification.Point;
import upctformagamification.TypeRule;
import upctformagamification.UnitGamification;
import upctformagamification.UpctformagamificationFactory;
import upctformagamification.UpctformagamificationPackage;
import upctformagamification.WidgetGamification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformagamificationPackageImpl extends EPackageImpl implements UpctformagamificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitGamificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetGamificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgeEClass = null;

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
	private EEnum typeRuleEEnum = null;

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
	 * @see upctformagamification.UpctformagamificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UpctformagamificationPackageImpl() {
		super(eNS_URI, UpctformagamificationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UpctformagamificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UpctformagamificationPackage init() {
		if (isInited) return (UpctformagamificationPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformagamificationPackage.eNS_URI);

		// Obtain or create and register package
		UpctformagamificationPackageImpl theUpctformagamificationPackage = (UpctformagamificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UpctformagamificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UpctformagamificationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UpctformaPackageImpl theUpctformaPackage = (UpctformaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UpctformaPackage.eNS_URI) instanceof UpctformaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UpctformaPackage.eNS_URI) : UpctformaPackage.eINSTANCE);

		// Create package meta-data objects
		theUpctformagamificationPackage.createPackageContents();
		theUpctformaPackage.createPackageContents();

		// Initialize created meta-data
		theUpctformagamificationPackage.initializePackageContents();
		theUpctformaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUpctformagamificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UpctformagamificationPackage.eNS_URI, theUpctformagamificationPackage);
		return theUpctformagamificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamification() {
		return gamificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamification_Units() {
		return (EReference)gamificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamification_Widgets() {
		return (EReference)gamificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamification_Badges() {
		return (EReference)gamificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamification_Imports() {
		return (EReference)gamificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitGamification() {
		return unitGamificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamification_Unitref() {
		return (EReference)unitGamificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamification_Pointsunit() {
		return (EReference)unitGamificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamification_Defbadges() {
		return (EReference)unitGamificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetGamification() {
		return widgetGamificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetGamification_Widgetref() {
		return (EReference)widgetGamificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetGamification_Pointswidget() {
		return (EReference)widgetGamificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Type() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Points() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Attempt() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Endingdate() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadgeUnit() {
		return badgeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadgeUnit_Type() {
		return (EAttribute)badgeUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBadgeUnit_Badge() {
		return (EReference)badgeUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadge() {
		return badgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadge_Name() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadge_Description() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadge_Url() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(2);
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
	public EEnum getTypeRule() {
		return typeRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformagamificationFactory getUpctformagamificationFactory() {
		return (UpctformagamificationFactory)getEFactoryInstance();
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
		gamificationEClass = createEClass(GAMIFICATION);
		createEReference(gamificationEClass, GAMIFICATION__UNITS);
		createEReference(gamificationEClass, GAMIFICATION__WIDGETS);
		createEReference(gamificationEClass, GAMIFICATION__BADGES);
		createEReference(gamificationEClass, GAMIFICATION__IMPORTS);

		unitGamificationEClass = createEClass(UNIT_GAMIFICATION);
		createEReference(unitGamificationEClass, UNIT_GAMIFICATION__UNITREF);
		createEReference(unitGamificationEClass, UNIT_GAMIFICATION__POINTSUNIT);
		createEReference(unitGamificationEClass, UNIT_GAMIFICATION__DEFBADGES);

		widgetGamificationEClass = createEClass(WIDGET_GAMIFICATION);
		createEReference(widgetGamificationEClass, WIDGET_GAMIFICATION__WIDGETREF);
		createEReference(widgetGamificationEClass, WIDGET_GAMIFICATION__POINTSWIDGET);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__TYPE);
		createEAttribute(pointEClass, POINT__POINTS);
		createEAttribute(pointEClass, POINT__ATTEMPT);
		createEAttribute(pointEClass, POINT__ENDINGDATE);

		badgeUnitEClass = createEClass(BADGE_UNIT);
		createEAttribute(badgeUnitEClass, BADGE_UNIT__TYPE);
		createEReference(badgeUnitEClass, BADGE_UNIT__BADGE);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__NAME);
		createEAttribute(badgeEClass, BADGE__DESCRIPTION);
		createEAttribute(badgeEClass, BADGE__URL);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		// Create enums
		typeRuleEEnum = createEEnum(TYPE_RULE);
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

		// Obtain other dependent packages
		UpctformaPackage theUpctformaPackage = (UpctformaPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gamificationEClass, Gamification.class, "Gamification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamification_Units(), this.getUnitGamification(), null, "units", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Widgets(), this.getWidgetGamification(), null, "widgets", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Badges(), this.getBadge(), null, "badges", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Imports(), this.getImport(), null, "imports", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitGamificationEClass, UnitGamification.class, "UnitGamification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitGamification_Unitref(), theUpctformaPackage.getUnit(), null, "unitref", null, 0, 1, UnitGamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitGamification_Pointsunit(), this.getPoint(), null, "pointsunit", null, 0, -1, UnitGamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitGamification_Defbadges(), this.getBadgeUnit(), null, "defbadges", null, 0, -1, UnitGamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetGamificationEClass, WidgetGamification.class, "WidgetGamification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetGamification_Widgetref(), theUpctformaPackage.getWidgetDef(), null, "widgetref", null, 0, -1, WidgetGamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetGamification_Pointswidget(), this.getPoint(), null, "pointswidget", null, 0, -1, WidgetGamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Type(), this.getTypeRule(), "type", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Attempt(), ecorePackage.getEInt(), "attempt", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Endingdate(), ecorePackage.getEDate(), "endingdate", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeUnitEClass, BadgeUnit.class, "BadgeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadgeUnit_Type(), this.getTypeRule(), "type", null, 0, 1, BadgeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadgeUnit_Badge(), this.getBadge(), null, "badge", null, 0, 1, BadgeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_Description(), ecorePackage.getEString(), "description", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_Url(), ecorePackage.getEString(), "url", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeRuleEEnum, TypeRule.class, "TypeRule");
		addEEnumLiteral(typeRuleEEnum, TypeRule.COMPLETED);
		addEEnumLiteral(typeRuleEEnum, TypeRule.LOGIN_DAILY);

		// Create resource
		createResource(eNS_URI);
	}

} //UpctformagamificationPackageImpl
