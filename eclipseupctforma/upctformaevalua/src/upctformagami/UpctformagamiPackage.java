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
	 * The meta object id for the '{@link upctformagami.impl.UnitGamifyImpl <em>Unit Gamify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.UnitGamifyImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getUnitGamify()
	 * @generated
	 */
	int UNIT_GAMIFY = 1;

	/**
	 * The feature id for the '<em><b>Unitref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__UNITREF = 0;

	/**
	 * The feature id for the '<em><b>Defbadges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__DEFBADGES = 1;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__MISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Pointsunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__POINTSUNIT = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__STATE = 4;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__URL = 5;

	/**
	 * The feature id for the '<em><b>Evalref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__EVALREF = 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY__IMAGE = 7;

	/**
	 * The number of structural features of the '<em>Unit Gamify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Unit Gamify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.WidgetGamifyImpl <em>Widget Gamify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.WidgetGamifyImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getWidgetGamify()
	 * @generated
	 */
	int WIDGET_GAMIFY = 2;

	/**
	 * The feature id for the '<em><b>Pointswidgetdef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFY__POINTSWIDGETDEF = 0;

	/**
	 * The feature id for the '<em><b>Unitref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFY__UNITREF = 1;

	/**
	 * The feature id for the '<em><b>Widgetref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFY__WIDGETREF = 2;

	/**
	 * The number of structural features of the '<em>Widget Gamify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Widget Gamify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.PointAchievementImpl <em>Point Achievement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.PointAchievementImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getPointAchievement()
	 * @generated
	 */
	int POINT_ACHIEVEMENT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ACHIEVEMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ACHIEVEMENT__POINTS = 1;

	/**
	 * The feature id for the '<em><b>Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ACHIEVEMENT__ATTEMPT = 2;

	/**
	 * The feature id for the '<em><b>Pointrange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ACHIEVEMENT__POINTRANGE = 3;

	/**
	 * The number of structural features of the '<em>Point Achievement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ACHIEVEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Point Achievement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ACHIEVEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.UnitBadgeImpl <em>Unit Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.UnitBadgeImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getUnitBadge()
	 * @generated
	 */
	int UNIT_BADGE = 4;

	/**
	 * The feature id for the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BADGE__BADGE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BADGE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Unit Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BADGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BADGE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Nexteval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NEXTEVAL = 2;

	/**
	 * The feature id for the '<em><b>Missionrange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__MISSIONRANGE = 3;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.impl.ScoreRangeImpl <em>Score Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.impl.ScoreRangeImpl
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getScoreRange()
	 * @generated
	 */
	int SCORE_RANGE = 8;

	/**
	 * The feature id for the '<em><b>Initial Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_RANGE__INITIAL_SCORE = 0;

	/**
	 * The feature id for the '<em><b>Final Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_RANGE__FINAL_SCORE = 1;

	/**
	 * The number of structural features of the '<em>Score Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Score Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagami.TypeRule <em>Type Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.TypeRule
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeRule()
	 * @generated
	 */
	int TYPE_RULE = 9;

	/**
	 * The meta object id for the '{@link upctformagami.TypeMissions <em>Type Missions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.TypeMissions
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeMissions()
	 * @generated
	 */
	int TYPE_MISSIONS = 10;

	/**
	 * The meta object id for the '{@link upctformagami.TypeState <em>Type State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagami.TypeState
	 * @see upctformagami.impl.UpctformagamiPackageImpl#getTypeState()
	 * @generated
	 */
	int TYPE_STATE = 11;


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
	 * Returns the meta object for class '{@link upctformagami.UnitGamify <em>Unit Gamify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Gamify</em>'.
	 * @see upctformagami.UnitGamify
	 * @generated
	 */
	EClass getUnitGamify();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.UnitGamify#getUnitref <em>Unitref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unitref</em>'.
	 * @see upctformagami.UnitGamify#getUnitref()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EReference getUnitGamify_Unitref();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.UnitGamify#getDefbadges <em>Defbadges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defbadges</em>'.
	 * @see upctformagami.UnitGamify#getDefbadges()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EReference getUnitGamify_Defbadges();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.UnitGamify#getMissions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missions</em>'.
	 * @see upctformagami.UnitGamify#getMissions()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EReference getUnitGamify_Missions();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.UnitGamify#getPointsunit <em>Pointsunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointsunit</em>'.
	 * @see upctformagami.UnitGamify#getPointsunit()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EReference getUnitGamify_Pointsunit();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.UnitGamify#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see upctformagami.UnitGamify#getState()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EAttribute getUnitGamify_State();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.UnitGamify#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see upctformagami.UnitGamify#getURL()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EAttribute getUnitGamify_URL();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.UnitGamify#getEvalref <em>Evalref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evalref</em>'.
	 * @see upctformagami.UnitGamify#getEvalref()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EReference getUnitGamify_Evalref();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.UnitGamify#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see upctformagami.UnitGamify#getImage()
	 * @see #getUnitGamify()
	 * @generated
	 */
	EAttribute getUnitGamify_Image();

	/**
	 * Returns the meta object for class '{@link upctformagami.WidgetGamify <em>Widget Gamify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Gamify</em>'.
	 * @see upctformagami.WidgetGamify
	 * @generated
	 */
	EClass getWidgetGamify();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.WidgetGamify#getPointswidgetdef <em>Pointswidgetdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointswidgetdef</em>'.
	 * @see upctformagami.WidgetGamify#getPointswidgetdef()
	 * @see #getWidgetGamify()
	 * @generated
	 */
	EReference getWidgetGamify_Pointswidgetdef();

	/**
	 * Returns the meta object for the reference list '{@link upctformagami.WidgetGamify#getUnitref <em>Unitref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unitref</em>'.
	 * @see upctformagami.WidgetGamify#getUnitref()
	 * @see #getWidgetGamify()
	 * @generated
	 */
	EReference getWidgetGamify_Unitref();

	/**
	 * Returns the meta object for the reference list '{@link upctformagami.WidgetGamify#getWidgetref <em>Widgetref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgetref</em>'.
	 * @see upctformagami.WidgetGamify#getWidgetref()
	 * @see #getWidgetGamify()
	 * @generated
	 */
	EReference getWidgetGamify_Widgetref();

	/**
	 * Returns the meta object for class '{@link upctformagami.PointAchievement <em>Point Achievement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Achievement</em>'.
	 * @see upctformagami.PointAchievement
	 * @generated
	 */
	EClass getPointAchievement();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.PointAchievement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformagami.PointAchievement#getType()
	 * @see #getPointAchievement()
	 * @generated
	 */
	EAttribute getPointAchievement_Type();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.PointAchievement#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see upctformagami.PointAchievement#getPoints()
	 * @see #getPointAchievement()
	 * @generated
	 */
	EAttribute getPointAchievement_Points();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.PointAchievement#getAttempt <em>Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempt</em>'.
	 * @see upctformagami.PointAchievement#getAttempt()
	 * @see #getPointAchievement()
	 * @generated
	 */
	EAttribute getPointAchievement_Attempt();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagami.PointAchievement#getPointrange <em>Pointrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointrange</em>'.
	 * @see upctformagami.PointAchievement#getPointrange()
	 * @see #getPointAchievement()
	 * @generated
	 */
	EReference getPointAchievement_Pointrange();

	/**
	 * Returns the meta object for class '{@link upctformagami.UnitBadge <em>Unit Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Badge</em>'.
	 * @see upctformagami.UnitBadge
	 * @generated
	 */
	EClass getUnitBadge();

	/**
	 * Returns the meta object for the reference '{@link upctformagami.UnitBadge#getBadge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Badge</em>'.
	 * @see upctformagami.UnitBadge#getBadge()
	 * @see #getUnitBadge()
	 * @generated
	 */
	EReference getUnitBadge_Badge();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.UnitBadge#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformagami.UnitBadge#getType()
	 * @see #getUnitBadge()
	 * @generated
	 */
	EAttribute getUnitBadge_Type();

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
	 * Returns the meta object for the containment reference list '{@link upctformagami.Mission#getMissionrange <em>Missionrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missionrange</em>'.
	 * @see upctformagami.Mission#getMissionrange()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Missionrange();

	/**
	 * Returns the meta object for class '{@link upctformagami.ScoreRange <em>Score Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score Range</em>'.
	 * @see upctformagami.ScoreRange
	 * @generated
	 */
	EClass getScoreRange();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.ScoreRange#getInitialScore <em>Initial Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Score</em>'.
	 * @see upctformagami.ScoreRange#getInitialScore()
	 * @see #getScoreRange()
	 * @generated
	 */
	EAttribute getScoreRange_InitialScore();

	/**
	 * Returns the meta object for the attribute '{@link upctformagami.ScoreRange#getFinalScore <em>Final Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Score</em>'.
	 * @see upctformagami.ScoreRange#getFinalScore()
	 * @see #getScoreRange()
	 * @generated
	 */
	EAttribute getScoreRange_FinalScore();

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
		 * The meta object literal for the '{@link upctformagami.impl.UnitGamifyImpl <em>Unit Gamify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.UnitGamifyImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getUnitGamify()
		 * @generated
		 */
		EClass UNIT_GAMIFY = eINSTANCE.getUnitGamify();

		/**
		 * The meta object literal for the '<em><b>Unitref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFY__UNITREF = eINSTANCE.getUnitGamify_Unitref();

		/**
		 * The meta object literal for the '<em><b>Defbadges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFY__DEFBADGES = eINSTANCE.getUnitGamify_Defbadges();

		/**
		 * The meta object literal for the '<em><b>Missions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFY__MISSIONS = eINSTANCE.getUnitGamify_Missions();

		/**
		 * The meta object literal for the '<em><b>Pointsunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFY__POINTSUNIT = eINSTANCE.getUnitGamify_Pointsunit();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_GAMIFY__STATE = eINSTANCE.getUnitGamify_State();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_GAMIFY__URL = eINSTANCE.getUnitGamify_URL();

		/**
		 * The meta object literal for the '<em><b>Evalref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFY__EVALREF = eINSTANCE.getUnitGamify_Evalref();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_GAMIFY__IMAGE = eINSTANCE.getUnitGamify_Image();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.WidgetGamifyImpl <em>Widget Gamify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.WidgetGamifyImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getWidgetGamify()
		 * @generated
		 */
		EClass WIDGET_GAMIFY = eINSTANCE.getWidgetGamify();

		/**
		 * The meta object literal for the '<em><b>Pointswidgetdef</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_GAMIFY__POINTSWIDGETDEF = eINSTANCE.getWidgetGamify_Pointswidgetdef();

		/**
		 * The meta object literal for the '<em><b>Unitref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_GAMIFY__UNITREF = eINSTANCE.getWidgetGamify_Unitref();

		/**
		 * The meta object literal for the '<em><b>Widgetref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_GAMIFY__WIDGETREF = eINSTANCE.getWidgetGamify_Widgetref();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.PointAchievementImpl <em>Point Achievement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.PointAchievementImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getPointAchievement()
		 * @generated
		 */
		EClass POINT_ACHIEVEMENT = eINSTANCE.getPointAchievement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_ACHIEVEMENT__TYPE = eINSTANCE.getPointAchievement_Type();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_ACHIEVEMENT__POINTS = eINSTANCE.getPointAchievement_Points();

		/**
		 * The meta object literal for the '<em><b>Attempt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_ACHIEVEMENT__ATTEMPT = eINSTANCE.getPointAchievement_Attempt();

		/**
		 * The meta object literal for the '<em><b>Pointrange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_ACHIEVEMENT__POINTRANGE = eINSTANCE.getPointAchievement_Pointrange();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.UnitBadgeImpl <em>Unit Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.UnitBadgeImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getUnitBadge()
		 * @generated
		 */
		EClass UNIT_BADGE = eINSTANCE.getUnitBadge();

		/**
		 * The meta object literal for the '<em><b>Badge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_BADGE__BADGE = eINSTANCE.getUnitBadge_Badge();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_BADGE__TYPE = eINSTANCE.getUnitBadge_Type();

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
		 * The meta object literal for the '<em><b>Nexteval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__NEXTEVAL = eINSTANCE.getMission_Nexteval();

		/**
		 * The meta object literal for the '<em><b>Missionrange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__MISSIONRANGE = eINSTANCE.getMission_Missionrange();

		/**
		 * The meta object literal for the '{@link upctformagami.impl.ScoreRangeImpl <em>Score Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagami.impl.ScoreRangeImpl
		 * @see upctformagami.impl.UpctformagamiPackageImpl#getScoreRange()
		 * @generated
		 */
		EClass SCORE_RANGE = eINSTANCE.getScoreRange();

		/**
		 * The meta object literal for the '<em><b>Initial Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_RANGE__INITIAL_SCORE = eINSTANCE.getScoreRange_InitialScore();

		/**
		 * The meta object literal for the '<em><b>Final Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_RANGE__FINAL_SCORE = eINSTANCE.getScoreRange_FinalScore();

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
