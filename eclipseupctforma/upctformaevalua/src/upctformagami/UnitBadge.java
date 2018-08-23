/**
 */
package upctformagami;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Badge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.UnitBadge#getBadge <em>Badge</em>}</li>
 *   <li>{@link upctformagami.UnitBadge#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getUnitBadge()
 * @model
 * @generated
 */
public interface UnitBadge extends EObject {
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
	 * @see upctformagami.UpctformagamiPackage#getUnitBadge_Badge()
	 * @model
	 * @generated
	 */
	Badge getBadge();

	/**
	 * Sets the value of the '{@link upctformagami.UnitBadge#getBadge <em>Badge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Badge</em>' reference.
	 * @see #getBadge()
	 * @generated
	 */
	void setBadge(Badge value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformagami.TypeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctformagami.TypeRule
	 * @see #setType(TypeRule)
	 * @see upctformagami.UpctformagamiPackage#getUnitBadge_Type()
	 * @model
	 * @generated
	 */
	TypeRule getType();

	/**
	 * Sets the value of the '{@link upctformagami.UnitBadge#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctformagami.TypeRule
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRule value);

} // UnitBadge
