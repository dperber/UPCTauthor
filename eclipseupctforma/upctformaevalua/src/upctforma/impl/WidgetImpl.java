/**
 */
package upctforma.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import upctforma.ContentElement;
import upctforma.NameElement;
import upctforma.UpctformaPackage;
import upctforma.Widget;
import upctforma.WidgetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link upctforma.impl.WidgetImpl#getWidgettype <em>Widgettype</em>}</li>
 *   <li>{@link upctforma.impl.WidgetImpl#getWidgetelements <em>Widgetelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetImpl extends ContentElementImpl implements Widget {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgettype() <em>Widgettype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgettype()
	 * @generated
	 * @ordered
	 */
	protected WidgetType widgettype;

	/**
	 * The cached value of the '{@link #getWidgetelements() <em>Widgetelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentElement> widgetelements;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetType getWidgettype() {
		if (widgettype != null && widgettype.eIsProxy()) {
			InternalEObject oldWidgettype = (InternalEObject)widgettype;
			widgettype = (WidgetType)eResolveProxy(oldWidgettype);
			if (widgettype != oldWidgettype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformaPackage.WIDGET__WIDGETTYPE, oldWidgettype, widgettype));
			}
		}
		return widgettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetType basicGetWidgettype() {
		return widgettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgettype(WidgetType newWidgettype) {
		WidgetType oldWidgettype = widgettype;
		widgettype = newWidgettype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.WIDGET__WIDGETTYPE, oldWidgettype, widgettype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentElement> getWidgetelements() {
		if (widgetelements == null) {
			widgetelements = new EObjectContainmentEList<ContentElement>(ContentElement.class, this, UpctformaPackage.WIDGET__WIDGETELEMENTS);
		}
		return widgetelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				return ((InternalEList<?>)getWidgetelements()).basicRemove(otherEnd, msgs);
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
			case UpctformaPackage.WIDGET__NAME:
				return getName();
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				if (resolve) return getWidgettype();
				return basicGetWidgettype();
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				return getWidgetelements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformaPackage.WIDGET__NAME:
				setName((String)newValue);
				return;
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				setWidgettype((WidgetType)newValue);
				return;
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				getWidgetelements().clear();
				getWidgetelements().addAll((Collection<? extends ContentElement>)newValue);
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
			case UpctformaPackage.WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				setWidgettype((WidgetType)null);
				return;
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				getWidgetelements().clear();
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
			case UpctformaPackage.WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				return widgettype != null;
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				return widgetelements != null && !widgetelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NameElement.class) {
			switch (derivedFeatureID) {
				case UpctformaPackage.WIDGET__NAME: return UpctformaPackage.NAME_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NameElement.class) {
			switch (baseFeatureID) {
				case UpctformaPackage.NAME_ELEMENT__NAME: return UpctformaPackage.WIDGET__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
