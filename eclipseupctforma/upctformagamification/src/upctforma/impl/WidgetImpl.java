/**
 */
package upctforma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upctforma.UpctformaPackage;
import upctforma.Widget;
import upctforma.WidgetDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.WidgetImpl#getTypewidget <em>Typewidget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetImpl extends ColumnElementImpl implements Widget {
	/**
	 * The cached value of the '{@link #getTypewidget() <em>Typewidget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypewidget()
	 * @generated
	 * @ordered
	 */
	protected WidgetDef typewidget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetDef getTypewidget() {
		if (typewidget != null && typewidget.eIsProxy()) {
			InternalEObject oldTypewidget = (InternalEObject)typewidget;
			typewidget = (WidgetDef)eResolveProxy(oldTypewidget);
			if (typewidget != oldTypewidget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformaPackage.WIDGET__TYPEWIDGET, oldTypewidget, typewidget));
			}
		}
		return typewidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetDef basicGetTypewidget() {
		return typewidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypewidget(WidgetDef newTypewidget) {
		WidgetDef oldTypewidget = typewidget;
		typewidget = newTypewidget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.WIDGET__TYPEWIDGET, oldTypewidget, typewidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.WIDGET__TYPEWIDGET:
				if (resolve) return getTypewidget();
				return basicGetTypewidget();
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
			case UpctformaPackage.WIDGET__TYPEWIDGET:
				setTypewidget((WidgetDef)newValue);
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
			case UpctformaPackage.WIDGET__TYPEWIDGET:
				setTypewidget((WidgetDef)null);
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
			case UpctformaPackage.WIDGET__TYPEWIDGET:
				return typewidget != null;
		}
		return super.eIsSet(featureID);
	}

} //WidgetImpl
