/**
 */
package upctformagamification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see upctformagamification.UpctformagamificationPackage
 * @generated
 */
public interface UpctformagamificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformagamificationFactory eINSTANCE = upctformagamification.impl.UpctformagamificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gamification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamification</em>'.
	 * @generated
	 */
	Gamification createGamification();

	/**
	 * Returns a new object of class '<em>Unit Gamification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Gamification</em>'.
	 * @generated
	 */
	UnitGamification createUnitGamification();

	/**
	 * Returns a new object of class '<em>Widget Gamification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Gamification</em>'.
	 * @generated
	 */
	WidgetGamification createWidgetGamification();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UpctformagamificationPackage getUpctformagamificationPackage();

} //UpctformagamificationFactory
