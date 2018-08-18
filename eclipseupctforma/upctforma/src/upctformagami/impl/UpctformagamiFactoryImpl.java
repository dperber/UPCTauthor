/**
 */
package upctformagami.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import upctformagami.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformagamiFactoryImpl extends EFactoryImpl implements UpctformagamiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpctformagamiFactory init() {
		try {
			UpctformagamiFactory theUpctformagamiFactory = (UpctformagamiFactory)EPackage.Registry.INSTANCE.getEFactory(UpctformagamiPackage.eNS_URI);
			if (theUpctformagamiFactory != null) {
				return theUpctformagamiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UpctformagamiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformagamiFactoryImpl() {
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
			case UpctformagamiPackage.GAMIFICATION: return createGamification();
			case UpctformagamiPackage.UNIT_POINT: return createUnitPoint();
			case UpctformagamiPackage.WIDGET_DEF_POINT: return createWidgetDefPoint();
			case UpctformagamiPackage.POINT: return createPoint();
			case UpctformagamiPackage.BADGE_UNIT: return createBadgeUnit();
			case UpctformagamiPackage.BADGE: return createBadge();
			case UpctformagamiPackage.IMPORT: return createImport();
			case UpctformagamiPackage.MISSION: return createMission();
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
			case UpctformagamiPackage.TYPE_RULE:
				return createTypeRuleFromString(eDataType, initialValue);
			case UpctformagamiPackage.TYPE_MISSIONS:
				return createTypeMissionsFromString(eDataType, initialValue);
			case UpctformagamiPackage.TYPE_STATE:
				return createTypeStateFromString(eDataType, initialValue);
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
			case UpctformagamiPackage.TYPE_RULE:
				return convertTypeRuleToString(eDataType, instanceValue);
			case UpctformagamiPackage.TYPE_MISSIONS:
				return convertTypeMissionsToString(eDataType, instanceValue);
			case UpctformagamiPackage.TYPE_STATE:
				return convertTypeStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gamification createGamification() {
		GamificationImpl gamification = new GamificationImpl();
		return gamification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPoint createUnitPoint() {
		UnitPointImpl unitPoint = new UnitPointImpl();
		return unitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetDefPoint createWidgetDefPoint() {
		WidgetDefPointImpl widgetDefPoint = new WidgetDefPointImpl();
		return widgetDefPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadgeUnit createBadgeUnit() {
		BadgeUnitImpl badgeUnit = new BadgeUnitImpl();
		return badgeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Badge createBadge() {
		BadgeImpl badge = new BadgeImpl();
		return badge;
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
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRule createTypeRuleFromString(EDataType eDataType, String initialValue) {
		TypeRule result = TypeRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissions createTypeMissionsFromString(EDataType eDataType, String initialValue) {
		TypeMissions result = TypeMissions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeMissionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeState createTypeStateFromString(EDataType eDataType, String initialValue) {
		TypeState result = TypeState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformagamiPackage getUpctformagamiPackage() {
		return (UpctformagamiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UpctformagamiPackage getPackage() {
		return UpctformagamiPackage.eINSTANCE;
	}

} //UpctformagamiFactoryImpl
