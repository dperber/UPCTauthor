/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.DataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.SimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getDataType_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleType> getType();

} // DataType
