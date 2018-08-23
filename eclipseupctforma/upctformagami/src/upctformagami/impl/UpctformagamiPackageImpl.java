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
import upctformagami.Gamification;
import upctformagami.Import;
import upctformagami.Mission;
import upctformagami.PointAchievement;
import upctformagami.ScoreRange;
import upctformagami.TypeMissions;
import upctformagami.TypeRule;
import upctformagami.TypeState;
import upctformagami.UnitBadge;
import upctformagami.UnitGamify;
import upctformagami.UpctformagamiFactory;
import upctformagami.UpctformagamiPackage;
import upctformagami.WidgetGamify;

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
	private EClass unitGamifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetGamifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointAchievementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitBadgeEClass = null;

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
	private EClass scoreRangeEClass = null;

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
	public EClass getUnitGamify() {
		return unitGamifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamify_Unitref() {
		return (EReference)unitGamifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamify_Defbadges() {
		return (EReference)unitGamifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamify_Missions() {
		return (EReference)unitGamifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamify_Pointsunit() {
		return (EReference)unitGamifyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitGamify_State() {
		return (EAttribute)unitGamifyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitGamify_URL() {
		return (EAttribute)unitGamifyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitGamify_Evalref() {
		return (EReference)unitGamifyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitGamify_Image() {
		return (EAttribute)unitGamifyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetGamify() {
		return widgetGamifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetGamify_Pointswidgetdef() {
		return (EReference)widgetGamifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetGamify_Unitref() {
		return (EReference)widgetGamifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetGamify_Widgetref() {
		return (EReference)widgetGamifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointAchievement() {
		return pointAchievementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointAchievement_Type() {
		return (EAttribute)pointAchievementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointAchievement_Points() {
		return (EAttribute)pointAchievementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointAchievement_Attempt() {
		return (EAttribute)pointAchievementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointAchievement_Pointrange() {
		return (EReference)pointAchievementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitBadge() {
		return unitBadgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitBadge_Badge() {
		return (EReference)unitBadgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitBadge_Type() {
		return (EAttribute)unitBadgeEClass.getEStructuralFeatures().get(1);
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
	public EReference getMission_Nexteval() {
		return (EReference)missionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Missionrange() {
		return (EReference)missionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScoreRange() {
		return scoreRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreRange_InitialScore() {
		return (EAttribute)scoreRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScoreRange_FinalScore() {
		return (EAttribute)scoreRangeEClass.getEStructuralFeatures().get(1);
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

		unitGamifyEClass = createEClass(UNIT_GAMIFY);
		createEReference(unitGamifyEClass, UNIT_GAMIFY__UNITREF);
		createEReference(unitGamifyEClass, UNIT_GAMIFY__DEFBADGES);
		createEReference(unitGamifyEClass, UNIT_GAMIFY__MISSIONS);
		createEReference(unitGamifyEClass, UNIT_GAMIFY__POINTSUNIT);
		createEAttribute(unitGamifyEClass, UNIT_GAMIFY__STATE);
		createEAttribute(unitGamifyEClass, UNIT_GAMIFY__URL);
		createEReference(unitGamifyEClass, UNIT_GAMIFY__EVALREF);
		createEAttribute(unitGamifyEClass, UNIT_GAMIFY__IMAGE);

		widgetGamifyEClass = createEClass(WIDGET_GAMIFY);
		createEReference(widgetGamifyEClass, WIDGET_GAMIFY__POINTSWIDGETDEF);
		createEReference(widgetGamifyEClass, WIDGET_GAMIFY__UNITREF);
		createEReference(widgetGamifyEClass, WIDGET_GAMIFY__WIDGETREF);

		pointAchievementEClass = createEClass(POINT_ACHIEVEMENT);
		createEAttribute(pointAchievementEClass, POINT_ACHIEVEMENT__TYPE);
		createEAttribute(pointAchievementEClass, POINT_ACHIEVEMENT__POINTS);
		createEAttribute(pointAchievementEClass, POINT_ACHIEVEMENT__ATTEMPT);
		createEReference(pointAchievementEClass, POINT_ACHIEVEMENT__POINTRANGE);

		unitBadgeEClass = createEClass(UNIT_BADGE);
		createEReference(unitBadgeEClass, UNIT_BADGE__BADGE);
		createEAttribute(unitBadgeEClass, UNIT_BADGE__TYPE);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__NAME);
		createEAttribute(badgeEClass, BADGE__DESCRIPTION);
		createEAttribute(badgeEClass, BADGE__URL);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		missionEClass = createEClass(MISSION);
		createEAttribute(missionEClass, MISSION__TYPE);
		createEReference(missionEClass, MISSION__NEXTUNIT);
		createEReference(missionEClass, MISSION__NEXTEVAL);
		createEReference(missionEClass, MISSION__MISSIONRANGE);

		scoreRangeEClass = createEClass(SCORE_RANGE);
		createEAttribute(scoreRangeEClass, SCORE_RANGE__INITIAL_SCORE);
		createEAttribute(scoreRangeEClass, SCORE_RANGE__FINAL_SCORE);

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
		initEReference(getGamification_Widgets(), this.getWidgetGamify(), null, "widgets", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Badges(), this.getBadge(), null, "badges", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamification_Units(), this.getUnitGamify(), null, "units", null, 0, -1, Gamification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitGamifyEClass, UnitGamify.class, "UnitGamify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitGamify_Unitref(), theUpctformaPackage.getUnit(), null, "unitref", null, 0, 1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitGamify_Defbadges(), this.getUnitBadge(), null, "defbadges", null, 0, -1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitGamify_Missions(), this.getMission(), null, "missions", null, 0, -1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitGamify_Pointsunit(), this.getPointAchievement(), null, "pointsunit", null, 0, -1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitGamify_State(), this.getTypeState(), "state", null, 0, 1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitGamify_URL(), ecorePackage.getEString(), "URL", null, 0, 1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitGamify_Evalref(), theUpctformaevaluaPackage.getEvaluationUnit(), null, "evalref", null, 0, 1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitGamify_Image(), ecorePackage.getEString(), "image", null, 0, 1, UnitGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetGamifyEClass, WidgetGamify.class, "WidgetGamify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetGamify_Pointswidgetdef(), this.getPointAchievement(), null, "pointswidgetdef", null, 0, -1, WidgetGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetGamify_Unitref(), theUpctformaPackage.getUnit(), null, "unitref", null, 0, -1, WidgetGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetGamify_Widgetref(), theUpctformaPackage.getWidgetType(), null, "widgetref", null, 0, -1, WidgetGamify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointAchievementEClass, PointAchievement.class, "PointAchievement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointAchievement_Type(), this.getTypeRule(), "type", null, 0, 1, PointAchievement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointAchievement_Points(), ecorePackage.getEInt(), "points", null, 0, 1, PointAchievement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointAchievement_Attempt(), ecorePackage.getEInt(), "attempt", null, 0, 1, PointAchievement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointAchievement_Pointrange(), this.getScoreRange(), null, "pointrange", null, 0, -1, PointAchievement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitBadgeEClass, UnitBadge.class, "UnitBadge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitBadge_Badge(), this.getBadge(), null, "badge", null, 0, 1, UnitBadge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitBadge_Type(), this.getTypeRule(), "type", null, 0, 1, UnitBadge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_Description(), ecorePackage.getEString(), "description", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_Url(), ecorePackage.getEString(), "url", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMission_Type(), this.getTypeMissions(), "type", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Nextunit(), theUpctformaPackage.getUnit(), null, "nextunit", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Nexteval(), theUpctformaevaluaPackage.getEvaluationUnit(), null, "nexteval", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Missionrange(), this.getScoreRange(), null, "missionrange", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreRangeEClass, ScoreRange.class, "ScoreRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScoreRange_InitialScore(), ecorePackage.getEDouble(), "InitialScore", null, 0, 1, ScoreRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScoreRange_FinalScore(), ecorePackage.getEDouble(), "FinalScore", null, 0, 1, ScoreRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
