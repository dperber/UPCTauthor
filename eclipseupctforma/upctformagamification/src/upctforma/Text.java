/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Text#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Simple {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getText_Paragraphs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

} // Text
