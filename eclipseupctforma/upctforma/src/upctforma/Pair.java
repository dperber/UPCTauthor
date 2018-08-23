/**
 */
package upctforma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Pair#getPairtype <em>Pairtype</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends NameElement {
	/**
	 * Returns the value of the '<em><b>Pairtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pairtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pairtype</em>' reference.
	 * @see #setPairtype(Type)
	 * @see upctforma.UpctformaPackage#getPair_Pairtype()
	 * @model
	 * @generated
	 */
	Type getPairtype();

	/**
	 * Sets the value of the '{@link upctforma.Pair#getPairtype <em>Pairtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pairtype</em>' reference.
	 * @see #getPairtype()
	 * @generated
	 */
	void setPairtype(Type value);

} // Pair
