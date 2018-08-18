/**
 */
package upctformaevalua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.UniqueAnswer#getStatements <em>Statements</em>}</li>
 *   <li>{@link upctformaevalua.UniqueAnswer#getAnswers <em>Answers</em>}</li>
 *   <li>{@link upctformaevalua.UniqueAnswer#getCorrectanswer <em>Correctanswer</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getUniqueAnswer()
 * @model
 * @generated
 */
public interface UniqueAnswer extends Question {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference.
	 * @see #setStatements(Paragraph)
	 * @see upctformaevalua.UpctformaevaluaPackage#getUniqueAnswer_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Paragraph getStatements();

	/**
	 * Sets the value of the '{@link upctformaevalua.UniqueAnswer#getStatements <em>Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements</em>' containment reference.
	 * @see #getStatements()
	 * @generated
	 */
	void setStatements(Paragraph value);

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link upctformaevalua.Unique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see upctformaevalua.UpctformaevaluaPackage#getUniqueAnswer_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unique> getAnswers();

	/**
	 * Returns the value of the '<em><b>Correctanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correctanswer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctanswer</em>' attribute.
	 * @see #setCorrectanswer(int)
	 * @see upctformaevalua.UpctformaevaluaPackage#getUniqueAnswer_Correctanswer()
	 * @model
	 * @generated
	 */
	int getCorrectanswer();

	/**
	 * Sets the value of the '{@link upctformaevalua.UniqueAnswer#getCorrectanswer <em>Correctanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctanswer</em>' attribute.
	 * @see #getCorrectanswer()
	 * @generated
	 */
	void setCorrectanswer(int value);

} // UniqueAnswer
