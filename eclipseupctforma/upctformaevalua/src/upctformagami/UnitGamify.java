/**
 */
package upctformagami;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import upctforma.Unit;

import upctformaevalua.EvaluationUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Gamify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.UnitGamify#getUnitref <em>Unitref</em>}</li>
 *   <li>{@link upctformagami.UnitGamify#getDefbadges <em>Defbadges</em>}</li>
 *   <li>{@link upctformagami.UnitGamify#getMissions <em>Missions</em>}</li>
 *   <li>{@link upctformagami.UnitGamify#getPointsunit <em>Pointsunit</em>}</li>
 *   <li>{@link upctformagami.UnitGamify#getState <em>State</em>}</li>
 *   <li>{@link upctformagami.UnitGamify#getURL <em>URL</em>}</li>
 *   <li>{@link upctformagami.UnitGamify#getEvalref <em>Evalref</em>}</li>
 *   <li>{@link upctformagami.UnitGamify#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see upctformagami.UpctformagamiPackage#getUnitGamify()
 * @model
 * @generated
 */
public interface UnitGamify extends EObject {
	/**
	 * Returns the value of the '<em><b>Unitref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitref</em>' reference.
	 * @see #setUnitref(Unit)
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_Unitref()
	 * @model
	 * @generated
	 */
	Unit getUnitref();

	/**
	 * Sets the value of the '{@link upctformagami.UnitGamify#getUnitref <em>Unitref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitref</em>' reference.
	 * @see #getUnitref()
	 * @generated
	 */
	void setUnitref(Unit value);

	/**
	 * Returns the value of the '<em><b>Defbadges</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.UnitBadge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defbadges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defbadges</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_Defbadges()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitBadge> getDefbadges();

	/**
	 * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.Mission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_Missions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mission> getMissions();

	/**
	 * Returns the value of the '<em><b>Pointsunit</b></em>' containment reference list.
	 * The list contents are of type {@link upctformagami.PointAchievement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointsunit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointsunit</em>' containment reference list.
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_Pointsunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointAchievement> getPointsunit();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformagami.TypeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see upctformagami.TypeState
	 * @see #setState(TypeState)
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_State()
	 * @model
	 * @generated
	 */
	TypeState getState();

	/**
	 * Sets the value of the '{@link upctformagami.UnitGamify#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see upctformagami.TypeState
	 * @see #getState()
	 * @generated
	 */
	void setState(TypeState value);

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_URL()
	 * @model
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link upctformagami.UnitGamify#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * Returns the value of the '<em><b>Evalref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evalref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evalref</em>' reference.
	 * @see #setEvalref(EvaluationUnit)
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_Evalref()
	 * @model
	 * @generated
	 */
	EvaluationUnit getEvalref();

	/**
	 * Sets the value of the '{@link upctformagami.UnitGamify#getEvalref <em>Evalref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evalref</em>' reference.
	 * @see #getEvalref()
	 * @generated
	 */
	void setEvalref(EvaluationUnit value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see upctformagami.UpctformagamiPackage#getUnitGamify_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link upctformagami.UnitGamify#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

} // UnitGamify
