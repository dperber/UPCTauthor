/**
 */
package upctformagamification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.BadgeUnit#getType <em>Type</em>}</li>
 *   <li>{@link upctformagamification.BadgeUnit#getBadge <em>Badge</em>}</li>
 * </ul>
 *
 * @see upctformagamification.UpctformagamificationPackage#getBadgeUnit()
 * @model
 * @generated
 */
public interface BadgeUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformagamification.TypeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctformagamification.TypeRule
	 * @see #setType(TypeRule)
	 * @see upctformagamification.UpctformagamificationPackage#getBadgeUnit_Type()
	 * @model
	 * @generated
	 */
	TypeRule getType();

	/**
	 * Sets the value of the '{@link upctformagamification.BadgeUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctformagamification.TypeRule
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRule value);

	/**
	 * Returns the value of the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Badge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badge</em>' reference.
	 * @see #setBadge(Badge)
	 * @see upctformagamification.UpctformagamificationPackage#getBadgeUnit_Badge()
	 * @model
	 * @generated
	 */
	Badge getBadge();

	/**
	 * Sets the value of the '{@link upctformagamification.BadgeUnit#getBadge <em>Badge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Badge</em>' reference.
	 * @see #getBadge()
	 * @generated
	 */
	void setBadge(Badge value);

} // BadgeUnit
