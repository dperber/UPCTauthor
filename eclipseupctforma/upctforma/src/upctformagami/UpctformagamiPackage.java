/**
 */
package upctformagami;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see upctformagami.UpctformagamiFactory
 * @model kind="package"
 * @generated
 */
public interface UpctformagamiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "upctformagami";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpcd.upct.es/upctformagami";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "upctformagami";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformagamiPackage eINSTANCE = upctformagami.impl.UpctformagamiPackageImpl.init();

	/**
	 * The meta object id for the '{@link upctformagami.impl.GamificationImpl <em>Gamification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.GamificationImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getGamification()
	 * @generated
	 */
	int GAMIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION__WIDGETS = 1;

	/**
	 * The feature id for the '<em><b>Badges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION__BADGES = 2;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION__UNITS = 3;

	/**
	 * The number of structural features of the '<em>Gamification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Gamification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.UnitPointImpl <em>Unit Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.UnitPointImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getUnitPoint()
	 * @generated
	 */
	int UNIT_POINT = 1;

	/**
	 * The feature id for the '<em><b>Unitref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__UNITREF = 0;

	/**
	 * The feature id for the '<em><b>Defbadges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__DEFBADGES = 1;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__MISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Pointsunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__POINTSUNIT = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__STATE = 4;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__URL = 5;

	/**
	 * The feature id for the '<em><b>Evalref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__EVALREF = 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT__IMAGE = 7;

	/**
	 * The number of structural features of the '<em>Unit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Unit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.WidgetDefPointImpl <em>Widget Def Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.WidgetDefPointImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getWidgetDefPoint()
	 * @generated
	 */
	int WIDGET_DEF_POINT = 2;

	/**
	 * The feature id for the '<em><b>Pointswidgetdef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF_POINT__POINTSWIDGETDEF = 0;

	/**
	 * The feature id for the '<em><b>Unitref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF_POINT__UNITREF = 1;

	/**
	 * The number of structural features of the '<em>Widget Def Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Widget Def Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DEF_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.PointImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__POINTS = 1;

	/**
	 * The feature id for the '<em><b>Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ATTEMPT = 2;

	/**
	 * The feature id for the '<em><b>Initial Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__INITIAL_SCORE = 3;

	/**
	 * The feature id for the '<em><b>Final Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__FINAL_SCORE = 4;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.BadgeUnitImpl <em>Badge Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.BadgeUnitImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getBadgeUnit()
	 * @generated
	 */
	int BADGE_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_UNIT__BADGE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_UNIT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Badge Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Badge Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.BadgeImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__URL = 2;

	/**
	 * The number of structural features of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.ImportImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 6;

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
	 * The meta object id for the '{@link upctformagami.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.MissionImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Nextunit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NEXTUNIT = 1;

	/**
	 * The feature id for the '<em><b>Initial Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__INITIAL_SCORE = 2;

	/**
	 * The feature id for the '<em><b>Final Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__FINAL_SCORE = 3;

	/**
	 * The feature id for the '<em><b>Nexteval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NEXTEVAL = 4;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.TypeRule <em>Type Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.TypeRule
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeRule()
	 * @generated
	 */
	int TYPE_RULE = 8;

	/**
	 * The meta object id for the '{@link upctformagami.TypeMissions <em>Type Missions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.TypeMissions
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeMissions()
	 * @generated
	 */
	int TYPE_MISSIONS = 9;

	/**
	 * The meta object id for the '{@link upctformagami.TypeState <em>Type State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.TypeState
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeState()
	 * @generated
	 */
	int TYPE_STATE = 10;


	/**
	 * Returns the meta object for class '{@link upctformagami.Gamification <em>Gamification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamification</em>'.
	 * @see upctformagami.Gamification
	 * @generated
	 */
	EClass getGamification();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.Gamification#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see upctformagami.Gamification#getImports()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.Gamification#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see upctformagami.Gamification#getWidgets()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Widgets();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.Gamification#getBadges <em>Badges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Badges</em>'.
	 * @see upctformagami.Gamification#getBadges()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Badges();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.Gamification#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see upctformagami.Gamification#getUnits()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Units();

	/**
	 * Returns the meta object for class '{@link upctformagami.UnitPoint <em>Unit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Point</em>'.
	 * @see upctformagami.UnitPoint
	 * @generated
	 */
	EClass getUnitPoint();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.UnitPoint#getUnitref <em>Unitref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unitref</em>'.
	 * @see upctformagami.UnitPoint#getUnitref()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EReference getUnitPoint_Unitref();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.UnitPoint#getDefbadges <em>Defbadges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defbadges</em>'.
	 * @see upctformagami.UnitPoint#getDefbadges()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EReference getUnitPoint_Defbadges();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.UnitPoint#getMissions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missions</em>'.
	 * @see upctformagami.UnitPoint#getMissions()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EReference getUnitPoint_Missions();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.UnitPoint#getPointsunit <em>Pointsunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointsunit</em>'.
	 * @see upctformagami.UnitPoint#getPointsunit()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EReference getUnitPoint_Pointsunit();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.UnitPoint#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see upctformagami.UnitPoint#getState()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EAttribute getUnitPoint_State();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.UnitPoint#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see upctformagami.UnitPoint#getURL()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EAttribute getUnitPoint_URL();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.UnitPoint#getEvalref <em>Evalref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evalref</em>'.
	 * @see upctformagami.UnitPoint#getEvalref()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EReference getUnitPoint_Evalref();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.UnitPoint#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see upctformagami.UnitPoint#getImage()
	 * @see #getUnitPoint()
	 * @generated
	 */
	EAttribute getUnitPoint_Image();

	/**
	 * Returns the meta object for class '{@link upctformagami.WidgetDefPoint <em>Widget Def Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Def Point</em>'.
	 * @see upctformagami.WidgetDefPoint
	 * @generated
	 */
	EClass getWidgetDefPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.WidgetDefPoint#getPointswidgetdef <em>Pointswidgetdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointswidgetdef</em>'.
	 * @see upctformagami.WidgetDefPoint#getPointswidgetdef()
	 * @see #getWidgetDefPoint()
	 * @generated
	 */
	EReference getWidgetDefPoint_Pointswidgetdef();

	/**
	 * Returns the meta object for the reference list '{@link upctformagami.WidgetDefPoint#getUnitref <em>Unitref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unitref</em>'.
	 * @see upctformagami.WidgetDefPoint#getUnitref()
	 * @see #getWidgetDefPoint()
	 * @generated
	 */
	EReference getWidgetDefPoint_Unitref();

	/**
	 * Returns the meta object for class '{@link upctformagami.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see upctformagami.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Point#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformagami.Point#getType()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Type();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Point#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see upctformagami.Point#getPoints()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Points();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Point#getAttempt <em>Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempt</em>'.
	 * @see upctformagami.Point#getAttempt()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Attempt();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Point#getInitialScore <em>Initial Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Score</em>'.
	 * @see upctformagami.Point#getInitialScore()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_InitialScore();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Point#getFinalScore <em>Final Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Score</em>'.
	 * @see upctformagami.Point#getFinalScore()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_FinalScore();

	/**
	 * Returns the meta object for class '{@link upctformagami.BadgeUnit <em>Badge Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Unit</em>'.
	 * @see upctformagami.BadgeUnit
	 * @generated
	 */
	EClass getBadgeUnit();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.BadgeUnit#getBadge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Badge</em>'.
	 * @see upctformagami.BadgeUnit#getBadge()
	 * @see #getBadgeUnit()
	 * @generated
	 */
	EReference getBadgeUnit_Badge();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.BadgeUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformagami.BadgeUnit#getType()
	 * @see #getBadgeUnit()
	 * @generated
	 */
	EAttribute getBadgeUnit_Type();

	/**
	 * Returns the meta object for class '{@link upctformagami.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge</em>'.
	 * @see upctformagami.Badge
	 * @generated
	 */
	EClass getBadge();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Badge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see upctformagami.Badge#getName()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Name();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Badge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see upctformagami.Badge#getDescription()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Description();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Badge#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see upctformagami.Badge#getUrl()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Url();

	/**
	 * Returns the meta object for class '{@link upctformagami.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see upctformagami.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see upctformagami.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link upctformagami.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see upctformagami.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Mission#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformagami.Mission#getType()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Type();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.Mission#getNextunit <em>Nextunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nextunit</em>'.
	 * @see upctformagami.Mission#getNextunit()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Nextunit();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Mission#getInitialScore <em>Initial Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Score</em>'.
	 * @see upctformagami.Mission#getInitialScore()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_InitialScore();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.Mission#getFinalScore <em>Final Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Score</em>'.
	 * @see upctformagami.Mission#getFinalScore()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_FinalScore();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.Mission#getNexteval <em>Nexteval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nexteval</em>'.
	 * @see upctformagami.Mission#getNexteval()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Nexteval();

	/**
	 * Returns the meta object for enum '{@link upctformagami.TypeRule <em>Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Rule</em>'.
	 * @see upctformagami.TypeRule
	 * @generated
	 */
	EEnum getTypeRule();

	/**
	 * Returns the meta object for enum '{@link upctformagami.TypeMissions <em>Type Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Missions</em>'.
	 * @see upctformagami.TypeMissions
	 * @generated
	 */
	EEnum getTypeMissions();

	/**
	 * Returns the meta object for enum '{@link upctformagami.TypeState <em>Type State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type State</em>'.
	 * @see upctformagami.TypeState
	 * @generated
	 */
	EEnum getTypeState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UpctformagamiFactory getUpctformagamiFactory();

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
		 * The meta object literal for the '{@link upctformagami.impl.GamificationImpl <em>Gamification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.GamificationImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getGamification()
		 * @generated
		 */
		EClass GAMIFICATION = eINSTANCE.getGamification();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFICATION__IMPORTS = eINSTANCE.getGamification_Imports();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFICATION__WIDGETS = eINSTANCE.getGamification_Widgets();

		/**
		 * The meta object literal for the '<em><b>Badges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFICATION__BADGES = eINSTANCE.getGamification_Badges();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFICATION__UNITS = eINSTANCE.getGamification_Units();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.UnitPointImpl <em>Unit Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.UnitPointImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getUnitPoint()
		 * @generated
		 */
		EClass UNIT_POINT = eINSTANCE.getUnitPoint();

		/**
		 * The meta object literal for the '<em><b>Unitref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_POINT__UNITREF = eINSTANCE.getUnitPoint_Unitref();

		/**
		 * The meta object literal for the '<em><b>Defbadges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_POINT__DEFBADGES = eINSTANCE.getUnitPoint_Defbadges();

		/**
		 * The meta object literal for the '<em><b>Missions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_POINT__MISSIONS = eINSTANCE.getUnitPoint_Missions();

		/**
		 * The meta object literal for the '<em><b>Pointsunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_POINT__POINTSUNIT = eINSTANCE.getUnitPoint_Pointsunit();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_POINT__STATE = eINSTANCE.getUnitPoint_State();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_POINT__URL = eINSTANCE.getUnitPoint_URL();

		/**
		 * The meta object literal for the '<em><b>Evalref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_POINT__EVALREF = eINSTANCE.getUnitPoint_Evalref();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_POINT__IMAGE = eINSTANCE.getUnitPoint_Image();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.WidgetDefPointImpl <em>Widget Def Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.WidgetDefPointImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getWidgetDefPoint()
		 * @generated
		 */
		EClass WIDGET_DEF_POINT = eINSTANCE.getWidgetDefPoint();

		/**
		 * The meta object literal for the '<em><b>Pointswidgetdef</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_DEF_POINT__POINTSWIDGETDEF = eINSTANCE.getWidgetDefPoint_Pointswidgetdef();

		/**
		 * The meta object literal for the '<em><b>Unitref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_DEF_POINT__UNITREF = eINSTANCE.getWidgetDefPoint_Unitref();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.PointImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__TYPE = eINSTANCE.getPoint_Type();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__POINTS = eINSTANCE.getPoint_Points();

		/**
		 * The meta object literal for the '<em><b>Attempt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__ATTEMPT = eINSTANCE.getPoint_Attempt();

		/**
		 * The meta object literal for the '<em><b>Initial Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__INITIAL_SCORE = eINSTANCE.getPoint_InitialScore();

		/**
		 * The meta object literal for the '<em><b>Final Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__FINAL_SCORE = eINSTANCE.getPoint_FinalScore();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.BadgeUnitImpl <em>Badge Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.BadgeUnitImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getBadgeUnit()
		 * @generated
		 */
		EClass BADGE_UNIT = eINSTANCE.getBadgeUnit();

		/**
		 * The meta object literal for the '<em><b>Badge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BADGE_UNIT__BADGE = eINSTANCE.getBadgeUnit_Badge();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE_UNIT__TYPE = eINSTANCE.getBadgeUnit_Type();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.BadgeImpl <em>Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.BadgeImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getBadge()
		 * @generated
		 */
		EClass BADGE = eINSTANCE.getBadge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__NAME = eINSTANCE.getBadge_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__DESCRIPTION = eINSTANCE.getBadge_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__URL = eINSTANCE.getBadge_Url();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.ImportImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getImport()
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
		 * The meta object literal for the '{@link upctformagami.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.MissionImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__TYPE = eINSTANCE.getMission_Type();

		/**
		 * The meta object literal for the '<em><b>Nextunit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__NEXTUNIT = eINSTANCE.getMission_Nextunit();

		/**
		 * The meta object literal for the '<em><b>Initial Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__INITIAL_SCORE = eINSTANCE.getMission_InitialScore();

		/**
		 * The meta object literal for the '<em><b>Final Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__FINAL_SCORE = eINSTANCE.getMission_FinalScore();

		/**
		 * The meta object literal for the '<em><b>Nexteval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__NEXTEVAL = eINSTANCE.getMission_Nexteval();

		/**
		 * The meta object literal for the '{@link upctformagami.TypeRule <em>Type Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.TypeRule
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeRule()
		 * @generated
		 */
		EEnum TYPE_RULE = eINSTANCE.getTypeRule();

		/**
		 * The meta object literal for the '{@link upctformagami.TypeMissions <em>Type Missions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.TypeMissions
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeMissions()
		 * @generated
		 */
		EEnum TYPE_MISSIONS = eINSTANCE.getTypeMissions();

		/**
		 * The meta object literal for the '{@link upctformagami.TypeState <em>Type State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.TypeState
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeState()
		 * @generated
		 */
		EEnum TYPE_STATE = eINSTANCE.getTypeState();

	}

} //UpctformagamiPackage
