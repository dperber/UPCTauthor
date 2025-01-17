/**
 */
package upctformagamification;

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
 * @see upctformagamification.UpctformagamificationFactory
 * @model kind="package"
 * @generated
 */
public interface UpctformagamificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "upctformagamification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpcd.upct.es/upctformagamification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "upctformagamification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformagamificationPackage eINSTANCE = upctformagamification.impl.UpctformagamificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link upctformagamification.impl.GamificationImpl <em>Gamification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.impl.GamificationImpl
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getGamification()
	 * @generated
	 */
	int GAMIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION__UNITS = 0;

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
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMIFICATION__IMPORTS = 3;

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
	 * The meta object id for the '{@link upctformagamification.impl.UnitGamificationImpl <em>Unit Gamification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.impl.UnitGamificationImpl
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getUnitGamification()
	 * @generated
	 */
	int UNIT_GAMIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Unitref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFICATION__UNITREF = 0;

	/**
	 * The feature id for the '<em><b>Pointsunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFICATION__POINTSUNIT = 1;

	/**
	 * The feature id for the '<em><b>Defbadges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFICATION__DEFBADGES = 2;

	/**
	 * The number of structural features of the '<em>Unit Gamification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit Gamification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_GAMIFICATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link upctformagamification.impl.WidgetGamificationImpl <em>Widget Gamification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.impl.WidgetGamificationImpl
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getWidgetGamification()
	 * @generated
	 */
	int WIDGET_GAMIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Widgetref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFICATION__WIDGETREF = 0;

	/**
	 * The feature id for the '<em><b>Pointswidget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFICATION__POINTSWIDGET = 1;

	/**
	 * The number of structural features of the '<em>Widget Gamification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Widget Gamification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GAMIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagamification.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.impl.PointImpl
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getPoint()
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
	 * The feature id for the '<em><b>Endingdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ENDINGDATE = 3;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformagamification.impl.BadgeUnitImpl <em>Badge Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.impl.BadgeUnitImpl
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getBadgeUnit()
	 * @generated
	 */
	int BADGE_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_UNIT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_UNIT__BADGE = 1;

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
	 * The meta object id for the '{@link upctformagamification.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.impl.BadgeImpl
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getBadge()
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
	 * The meta object id for the '{@link upctformagamification.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.impl.ImportImpl
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getImport()
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
	 * The meta object id for the '{@link upctformagamification.TypeRule <em>Type Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformagamification.TypeRule
	 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getTypeRule()
	 * @generated
	 */
	int TYPE_RULE = 7;


	/**
	 * Returns the meta object for class '{@link upctformagamification.Gamification <em>Gamification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamification</em>'.
	 * @see upctformagamification.Gamification
	 * @generated
	 */
	EClass getGamification();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagamification.Gamification#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see upctformagamification.Gamification#getUnits()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Units();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagamification.Gamification#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see upctformagamification.Gamification#getWidgets()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Widgets();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagamification.Gamification#getBadges <em>Badges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Badges</em>'.
	 * @see upctformagamification.Gamification#getBadges()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Badges();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagamification.Gamification#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see upctformagamification.Gamification#getImports()
	 * @see #getGamification()
	 * @generated
	 */
	EReference getGamification_Imports();

	/**
	 * Returns the meta object for class '{@link upctformagamification.UnitGamification <em>Unit Gamification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Gamification</em>'.
	 * @see upctformagamification.UnitGamification
	 * @generated
	 */
	EClass getUnitGamification();

	/**
	 * Returns the meta object for the reference '{@link upctformagamification.UnitGamification#getUnitref <em>Unitref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unitref</em>'.
	 * @see upctformagamification.UnitGamification#getUnitref()
	 * @see #getUnitGamification()
	 * @generated
	 */
	EReference getUnitGamification_Unitref();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagamification.UnitGamification#getPointsunit <em>Pointsunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointsunit</em>'.
	 * @see upctformagamification.UnitGamification#getPointsunit()
	 * @see #getUnitGamification()
	 * @generated
	 */
	EReference getUnitGamification_Pointsunit();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagamification.UnitGamification#getDefbadges <em>Defbadges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defbadges</em>'.
	 * @see upctformagamification.UnitGamification#getDefbadges()
	 * @see #getUnitGamification()
	 * @generated
	 */
	EReference getUnitGamification_Defbadges();

	/**
	 * Returns the meta object for class '{@link upctformagamification.WidgetGamification <em>Widget Gamification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Gamification</em>'.
	 * @see upctformagamification.WidgetGamification
	 * @generated
	 */
	EClass getWidgetGamification();

	/**
	 * Returns the meta object for the reference list '{@link upctformagamification.WidgetGamification#getWidgetref <em>Widgetref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgetref</em>'.
	 * @see upctformagamification.WidgetGamification#getWidgetref()
	 * @see #getWidgetGamification()
	 * @generated
	 */
	EReference getWidgetGamification_Widgetref();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformagamification.WidgetGamification#getPointswidget <em>Pointswidget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointswidget</em>'.
	 * @see upctformagamification.WidgetGamification#getPointswidget()
	 * @see #getWidgetGamification()
	 * @generated
	 */
	EReference getWidgetGamification_Pointswidget();

	/**
	 * Returns the meta object for class '{@link upctformagamification.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see upctformagamification.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Point#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformagamification.Point#getType()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Type();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Point#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see upctformagamification.Point#getPoints()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Points();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Point#getAttempt <em>Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempt</em>'.
	 * @see upctformagamification.Point#getAttempt()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Attempt();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Point#getEndingdate <em>Endingdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endingdate</em>'.
	 * @see upctformagamification.Point#getEndingdate()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Endingdate();

	/**
	 * Returns the meta object for class '{@link upctformagamification.BadgeUnit <em>Badge Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Unit</em>'.
	 * @see upctformagamification.BadgeUnit
	 * @generated
	 */
	EClass getBadgeUnit();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.BadgeUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformagamification.BadgeUnit#getType()
	 * @see #getBadgeUnit()
	 * @generated
	 */
	EAttribute getBadgeUnit_Type();

	/**
	 * Returns the meta object for the reference '{@link upctformagamification.BadgeUnit#getBadge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Badge</em>'.
	 * @see upctformagamification.BadgeUnit#getBadge()
	 * @see #getBadgeUnit()
	 * @generated
	 */
	EReference getBadgeUnit_Badge();

	/**
	 * Returns the meta object for class '{@link upctformagamification.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge</em>'.
	 * @see upctformagamification.Badge
	 * @generated
	 */
	EClass getBadge();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Badge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see upctformagamification.Badge#getName()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Name();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Badge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see upctformagamification.Badge#getDescription()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Description();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Badge#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see upctformagamification.Badge#getUrl()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Url();

	/**
	 * Returns the meta object for class '{@link upctformagamification.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see upctformagamification.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link upctformagamification.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see upctformagamification.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for enum '{@link upctformagamification.TypeRule <em>Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Rule</em>'.
	 * @see upctformagamification.TypeRule
	 * @generated
	 */
	EEnum getTypeRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UpctformagamificationFactory getUpctformagamificationFactory();

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
		 * The meta object literal for the '{@link upctformagamification.impl.GamificationImpl <em>Gamification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.impl.GamificationImpl
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getGamification()
		 * @generated
		 */
		EClass GAMIFICATION = eINSTANCE.getGamification();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFICATION__UNITS = eINSTANCE.getGamification_Units();

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
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMIFICATION__IMPORTS = eINSTANCE.getGamification_Imports();

		/**
		 * The meta object literal for the '{@link upctformagamification.impl.UnitGamificationImpl <em>Unit Gamification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.impl.UnitGamificationImpl
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getUnitGamification()
		 * @generated
		 */
		EClass UNIT_GAMIFICATION = eINSTANCE.getUnitGamification();

		/**
		 * The meta object literal for the '<em><b>Unitref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFICATION__UNITREF = eINSTANCE.getUnitGamification_Unitref();

		/**
		 * The meta object literal for the '<em><b>Pointsunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFICATION__POINTSUNIT = eINSTANCE.getUnitGamification_Pointsunit();

		/**
		 * The meta object literal for the '<em><b>Defbadges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_GAMIFICATION__DEFBADGES = eINSTANCE.getUnitGamification_Defbadges();

		/**
		 * The meta object literal for the '{@link upctformagamification.impl.WidgetGamificationImpl <em>Widget Gamification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.impl.WidgetGamificationImpl
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getWidgetGamification()
		 * @generated
		 */
		EClass WIDGET_GAMIFICATION = eINSTANCE.getWidgetGamification();

		/**
		 * The meta object literal for the '<em><b>Widgetref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_GAMIFICATION__WIDGETREF = eINSTANCE.getWidgetGamification_Widgetref();

		/**
		 * The meta object literal for the '<em><b>Pointswidget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_GAMIFICATION__POINTSWIDGET = eINSTANCE.getWidgetGamification_Pointswidget();

		/**
		 * The meta object literal for the '{@link upctformagamification.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.impl.PointImpl
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getPoint()
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
		 * The meta object literal for the '<em><b>Endingdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__ENDINGDATE = eINSTANCE.getPoint_Endingdate();

		/**
		 * The meta object literal for the '{@link upctformagamification.impl.BadgeUnitImpl <em>Badge Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.impl.BadgeUnitImpl
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getBadgeUnit()
		 * @generated
		 */
		EClass BADGE_UNIT = eINSTANCE.getBadgeUnit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE_UNIT__TYPE = eINSTANCE.getBadgeUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Badge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BADGE_UNIT__BADGE = eINSTANCE.getBadgeUnit_Badge();

		/**
		 * The meta object literal for the '{@link upctformagamification.impl.BadgeImpl <em>Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.impl.BadgeImpl
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getBadge()
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
		 * The meta object literal for the '{@link upctformagamification.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.impl.ImportImpl
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getImport()
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
		 * The meta object literal for the '{@link upctformagamification.TypeRule <em>Type Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformagamification.TypeRule
		 * @see upctformagamification.impl.UpctformagamificationPackageImpl#getTypeRule()
		 * @generated
		 */
		EEnum TYPE_RULE = eINSTANCE.getTypeRule();

	}

} //UpctformagamificationPackage
