/**
 */
package upctformagami.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import upctforma.UpctformaPackage;

import upctforma.impl.UpctformaPackageImpl;

import upctformaevalua.UpctformaevaluaPackage;

import upctformaevalua.impl.UpctformaevaluaPackageImpl;

import upctformagami.Badge;
import upctformagami.BadgeUnit;
import upctformagami.Gamification;
import upctformagami.Import;
import upctformagami.Mission;
import upctformagami.Point;
import upctformagami.TypeMissions;
import upctformagami.TypeRule;
import upctformagami.TypeState;
import upctformagami.UnitPoint;
import upctformagami.UpctformagamiFactory;
import upctformagami.UpctformagamiPackage;
import upctformagami.WidgetDefPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformagamiPackageImpl extends EPackageImpl implements UpctformagamiPackage {
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
	private EClass unitPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetDefPointEClass = null;

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
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeMissionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeStateEEnum = null;

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
	 * @see upctformagami.UpctformagamiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UpctformagamiPackageImpl() {
		super(eNS_URI, UpctformagamiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UpctformagamiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UpctformagamiPackage init() {
		if (isInited) return (UpctformagamiPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformagamiPackage.eNS_URI);

		// Obtain or create and register package
		UpctformagamiPackageImpl theUpctformagamiPackage = (UpctformagamiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UpctformagamiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UpctformagamiPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UpctformaPackageImpl theUpctformaPackage = (UpctformaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UpctformaPackage.eNS_URI) instanceof UpctformaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UpctformaPackage.eNS_URI) : UpctformaPackage.eINSTANCE);
		UpctformaevaluaPackageImpl theUpctformaevaluaPackage = (UpctformaevaluaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UpctformaevaluaPackage.eNS_URI) instanceof UpctformaevaluaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UpctformaevaluaPackage.eNS_URI) : UpctformaevaluaPackage.eINSTANCE);

		// Create package meta-data objects
		theUpctformagamiPackage.createPackageContents();
		theUpctformaPackage.createPackageContents();
		theUpctformaevaluaPackage.createPackageContents();

		// Initialize created meta-data
		theUpctformagamiPackage.initializePackageContents();
		theUpctformaPackage.initializePackageContents();
		theUpctformaevaluaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUpctformagamiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UpctformagamiPackage.eNS_URI, theUpctformagamiPackage);
		return theUpctformagamiPackage;
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
	public EReference getGamification_Imports() {
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
	public EReference getGamification_Units() {
		return (EReference)gamificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitPoint() {
		return unitPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitPoint_Unitref() {
		return (EReference)unitPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitPoint_Defbadges() {
		return (EReference)unitPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitPoint_Missions() {
		return (EReference)unitPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitPoint_Pointsunit() {
		return (EReference)unitPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitPoint_State() {
		return (EAttribute)unitPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitPoint_URL() {
		return (EAttribute)unitPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitPoint_Evalref() {
		return (EReference)unitPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitPoint_Image() {
		return (EAttribute)unitPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetDefPoint() {
		return widgetDefPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetDefPoint_Pointswidgetdef() {
		return (EReference)widgetDefPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetDefPoint_Unitref() {
		return (EReference)widgetDefPointEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPoint_InitialScore() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_FinalScore() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(4);
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
	public EReference getBadgeUnit_Badge() {
		return (EReference)badgeUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadgeUnit_Type() {
		return (EAttribute)badgeUnitEClass.getEStructuralFeatures().get(1);
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
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_Type() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Nextunit() {
		return (EReference)missionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_InitialScore() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_FinalScore() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Nexteval() {
		return (EReference)missionEClass.getEStructuralFeatures().get(4);
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
	public EEnum getTypeMissions() {
		return typeMissionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeState() {
		return typeStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformagamiFactory getUpctformagamiFactory() {
		return (UpctformagamiFactory)getEFactoryInstance();
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
		createEReference(gamificationEClass, GAMIFICATION__IMPORTS);
		createEReference(gamificationEClass, GAMIFICATION__WIDGETS);
		createEReference(gamificationEClass, GAMIFICATION__BADGES);
		createEReference(gamificationEClass, GAMIFICATION__UNITS);

		unitPointEClass = createEClass(UNIT_POINT);
		createEReference(unitPointEClass, UNIT_POINT__UNITREF);
		createEReference(unitPointEClass, UNIT_POINT__DEFBADGES);
		createEReference(unitPointEClass, UNIT_POINT__MISSIONS);
		createEReference(unitPointEClass, UNIT_POINT__POINTSUNIT);
		createEAttribute(unitPointEClass, UNIT_POINT__STATE);
		createEAttribute(unitPointEClass, UNIT_POINT__URL);
		createEReference(unitPointEClass, UNIT_POINT__EVALREF);
		createEAttribute(unitPointEClass, UNIT_POINT__IMAGE);

		widgetDefPointEClass = createEClass(WIDGET_DEF_POINT);
		createEReference(widgetDefPointEClass, WIDGET_DEF_POINT__POINTSWIDGETDEF);
		createEReference(widgetDefPointEClass, WIDGET_DEF_POINT__UNITREF);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__TYPE);
		createEAttribute(pointEClass, POINT__POINTS);
		createEAttribute(pointEClass, POINT__ATTEMPT);
		createEAttribute(pointEClass, POINT__INITIAL_SCORE);
		createEAttribute(pointEClass, POINT__FINAL_SCORE);

		badgeUnitEClass = createEClass(BADGE_UNIT);
		createEReference(badgeUnitEClass, BADGE_UNIT__BADGE);
		createEAttribute(badgeUnitEClass, BADGE_UNIT__TYPE);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__NAME);
		createEAttribute(badgeEClass, BADGE__DESCRIPTION);
		createEAttribute(badgeEClass, BADGE__URL);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		missionEClass = createEClass(MISSION);
		createEAttribute(missionEClass, MISSION__TYPE);
		createEReference(missionEClass, MISSION__NEXTUNIT);
		createEAttribute(missionEClass, MISSION__INITIAL_SCORE);
		createEAttribute(missionEClass, MISSION__FINAL_SCORE);
		createEReference(missionEClass, MISSION__NEXTEVAL);

		// Create enums
		typeRuleEEnum = createEEnum(TYPE_RULE);
		typeMissionsEEnum = createEEnum(TYPE_MISSIONS);
		typeStateEEnum = createEEnum(TYPE_STATE);
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
		UpctformaevaluaPackage theUpctformaevaluaPackage = (UpctformaevaluaPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformaevaluaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gamificationEClass, Gamification.class, "Gamification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamification_Imports(), this.getImport(), null, "imports", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Widgets(), this.getWidgetDefPoint(), null, "widgets", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Badges(), this.getBadge(), null, "badges", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Units(), this.getUnitPoint(), null, "units", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitPointEClass, UnitPoint.class, "UnitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitPoint_Unitref(), theUpctformaPackage.getUnit(), null, "unitref", null, 0, 1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitPoint_Defbadges(), this.getBadgeUnit(), null, "defbadges", null, 0, -1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitPoint_Missions(), this.getMission(), null, "missions", null, 0, -1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitPoint_Pointsunit(), this.getPoint(), null, "pointsunit", null, 0, -1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitPoint_State(), this.getTypeState(), "state", null, 0, 1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitPoint_URL(), ecorePackage.getEString(), "URL", null, 0, 1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitPoint_Evalref(), theUpctformaevaluaPackage.getEvaluationUnit(), null, "evalref", null, 0, 1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitPoint_Image(), ecorePackage.getEString(), "image", null, 0, 1, UnitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetDefPointEClass, WidgetDefPoint.class, "WidgetDefPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetDefPoint_Pointswidgetdef(), this.getPoint(), null, "pointswidgetdef", null, 0, -1, WidgetDefPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetDefPoint_Unitref(), theUpctformaPackage.getUnit(), null, "unitref", null, 0, -1, WidgetDefPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Type(), this.getTypeRule(), "type", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Attempt(), ecorePackage.getEInt(), "attempt", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_InitialScore(), ecorePackage.getEDouble(), "InitialScore", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_FinalScore(), ecorePackage.getEDouble(), "FinalScore", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeUnitEClass, BadgeUnit.class, "BadgeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBadgeUnit_Badge(), this.getBadge(), null, "badge", null, 0, 1, BadgeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadgeUnit_Type(), this.getTypeRule(), "type", null, 0, 1, BadgeUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_Description(), ecorePackage.getEString(), "description", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_Url(), ecorePackage.getEString(), "url", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMission_Type(), this.getTypeMissions(), "type", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Nextunit(), theUpctformaPackage.getUnit(), null, "nextunit", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMission_InitialScore(), ecorePackage.getEDouble(), "InitialScore", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMission_FinalScore(), ecorePackage.getEDouble(), "FinalScore", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Nexteval(), theUpctformaevaluaPackage.getEvaluationUnit(), null, "nexteval", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeRuleEEnum, TypeRule.class, "TypeRule");
		addEEnumLiteral(typeRuleEEnum, TypeRule.COMPLETED);
		addEEnumLiteral(typeRuleEEnum, TypeRule.LOGIN_DAILY);
		addEEnumLiteral(typeRuleEEnum, TypeRule.SCORES);

		initEEnum(typeMissionsEEnum, TypeMissions.class, "TypeMissions");
		addEEnumLiteral(typeMissionsEEnum, TypeMissions.STRONG);
		addEEnumLiteral(typeMissionsEEnum, TypeMissions.WEAK);
		addEEnumLiteral(typeMissionsEEnum, TypeMissions.INHIBITOR);
		addEEnumLiteral(typeMissionsEEnum, TypeMissions.SCORES);

		initEEnum(typeStateEEnum, TypeState.class, "TypeState");
		addEEnumLiteral(typeStateEEnum, TypeState.OPEN);
		addEEnumLiteral(typeStateEEnum, TypeState.CLOSE);

		// Create resource
		createResource(eNS_URI);
	}

} //UpctformagamiPackageImpl
