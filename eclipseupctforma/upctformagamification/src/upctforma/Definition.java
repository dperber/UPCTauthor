/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Definition#getTemplates <em>Templates</em>}</li>
 *   <li>{@link upctforma.Definition#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link upctforma.Definition#getImports <em>Imports</em>}</li>
 *   <li>{@link upctforma.Definition#getUnit <em>Unit</em>}</li>
 *   <li>{@link upctforma.Definition#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends NameElement {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.TemplateDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getDefinition_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateDef> getTemplates();

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.WidgetDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getDefinition_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetDef> getWidgets();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getDefinition_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Unit)
	 * @see upctforma.UpctformaPackage#getDefinition_Unit()
	 * @model containment="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link upctforma.Definition#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getDefinition_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // Definition
