/**
 */
package upctformagamification;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagamification.Point#getType <em>Type</em>}</li>
 *   <li>{@link upctformagamification.Point#getPoints <em>Points</em>}</li>
 *   <li>{@link upctformagamification.Point#getAttempt <em>Attempt</em>}</li>
 *   <li>{@link upctformagamification.Point#getEndingdate <em>Endingdate</em>}</li>
 * </ul>
 *
 * @see upctformagamification.UpctformagamificationPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {
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
	 * @see upctformagamification.UpctformagamificationPackage#getPoint_Type()
	 * @model
	 * @generated
	 */
	TypeRule getType();

	/**
	 * Sets the value of the '{@link upctformagamification.Point#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctformagamification.TypeRule
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRule value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see upctformagamification.UpctformagamificationPackage#getPoint_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link upctformagamification.Point#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attempt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempt</em>' attribute.
	 * @see #setAttempt(int)
	 * @see upctformagamification.UpctformagamificationPackage#getPoint_Attempt()
	 * @model
	 * @generated
	 */
	int getAttempt();

	/**
	 * Sets the value of the '{@link upctformagamification.Point#getAttempt <em>Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempt</em>' attribute.
	 * @see #getAttempt()
	 * @generated
	 */
	void setAttempt(int value);

	/**
	 * Returns the value of the '<em><b>Endingdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endingdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endingdate</em>' attribute.
	 * @see #setEndingdate(Date)
	 * @see upctformagamification.UpctformagamificationPackage#getPoint_Endingdate()
	 * @model
	 * @generated
	 */
	Date getEndingdate();

	/**
	 * Sets the value of the '{@link upctformagamification.Point#getEndingdate <em>Endingdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endingdate</em>' attribute.
	 * @see #getEndingdate()
	 * @generated
	 */
	void setEndingdate(Date value);

} // Point
