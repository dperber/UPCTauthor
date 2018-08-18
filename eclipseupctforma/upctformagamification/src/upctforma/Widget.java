/**
 */
package upctforma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Widget#getTypewidget <em>Typewidget</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends ColumnElement {
	/**
	 * Returns the value of the '<em><b>Typewidget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typewidget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typewidget</em>' reference.
	 * @see #setTypewidget(WidgetDef)
	 * @see upctforma.UpctformaPackage#getWidget_Typewidget()
	 * @model required="true"
	 * @generated
	 */
	WidgetDef getTypewidget();

	/**
	 * Sets the value of the '{@link upctforma.Widget#getTypewidget <em>Typewidget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typewidget</em>' reference.
	 * @see #getTypewidget()
	 * @generated
	 */
	void setTypewidget(WidgetDef value);

} // Widget
