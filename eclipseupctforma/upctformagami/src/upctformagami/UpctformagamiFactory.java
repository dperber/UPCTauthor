/**
 */
package upctformagami;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see upctformagami.UpctformagamiPackage
 * @generated
 */
public interface UpctformagamiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformagamiFactory eINSTANCE = upctformagami.impl.UpctformagamiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gamification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamification</em>'.
	 * @generated
	 */
	Gamification createGamification();

	/**
	 * Returns a new object of class '<em>Unit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Point</em>'.
	 * @generated
	 */
	UnitPoint createUnitPoint();

	/**
	 * Returns a new object of class '<em>Widget Def Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Def Point</em>'.
	 * @generated
	 */
	WidgetDefPoint createWidgetDefPoint();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Badge Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Badge Unit</em>'.
	 * @generated
	 */
	BadgeUnit createBadgeUnit();

	/**
	 * Returns a new object of class '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Badge</em>'.
	 * @generated
	 */
	Badge createBadge();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UpctformagamiPackage getUpctformagamiPackage();

} //UpctformagamiFactory
