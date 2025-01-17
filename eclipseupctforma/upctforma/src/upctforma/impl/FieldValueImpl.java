/**
 */
package upctforma.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upctforma.ContentElement;
import upctforma.FieldValue;
import upctforma.UpctformaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.FieldValueImpl#getFieldvalue <em>Fieldvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldValueImpl extends NameElementImpl implements FieldValue {
	/**
	 * The cached value of the '{@link #getFieldvalue() <em>Fieldvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldvalue()
	 * @generated
	 * @ordered
	 */
	protected ContentElement fieldvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.FIELD_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentElement getFieldvalue() {
		return fieldvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldvalue(ContentElement newFieldvalue, NotificationChain msgs) {
		ContentElement oldFieldvalue = fieldvalue;
		fieldvalue = newFieldvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UpctformaPackage.FIELD_VALUE__FIELDVALUE, oldFieldvalue, newFieldvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldvalue(ContentElement newFieldvalue) {
		if (newFieldvalue != fieldvalue) {
			NotificationChain msgs = null;
			if (fieldvalue != null)
				msgs = ((InternalEObject)fieldvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.FIELD_VALUE__FIELDVALUE, null, msgs);
			if (newFieldvalue != null)
				msgs = ((InternalEObject)newFieldvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.FIELD_VALUE__FIELDVALUE, null, msgs);
			msgs = basicSetFieldvalue(newFieldvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.FIELD_VALUE__FIELDVALUE, newFieldvalue, newFieldvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.FIELD_VALUE__FIELDVALUE:
				return basicSetFieldvalue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.FIELD_VALUE__FIELDVALUE:
				return getFieldvalue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformaPackage.FIELD_VALUE__FIELDVALUE:
				setFieldvalue((ContentElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UpctformaPackage.FIELD_VALUE__FIELDVALUE:
				setFieldvalue((ContentElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UpctformaPackage.FIELD_VALUE__FIELDVALUE:
				return fieldvalue != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldValueImpl
