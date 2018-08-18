/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.CompositeArgument#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getCompositeArgument()
 * @model
 * @generated
 */
public interface CompositeArgument extends Argument {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.SimpleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getCompositeArgument_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleElement> getArguments();

} // CompositeArgument
