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

import upctforma.Definition;
import upctforma.Import;
import upctforma.TemplateDef;
import upctforma.Type;
import upctforma.Unit;
import upctforma.UpctformaPackage;
import upctforma.WidgetDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.DefinitionImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link upctforma.impl.DefinitionImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link upctforma.impl.DefinitionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link upctforma.impl.DefinitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link upctforma.impl.DefinitionImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends NameElementImpl implements Definition {
	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateDef> templates;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetDef> widgets;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateDef> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<TemplateDef>(TemplateDef.class, this, UpctformaPackage.DEFINITION__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetDef> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<WidgetDef>(WidgetDef.class, this, UpctformaPackage.DEFINITION__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, UpctformaPackage.DEFINITION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UpctformaPackage.DEFINITION__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.DEFINITION__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.DEFINITION__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.DEFINITION__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, UpctformaPackage.DEFINITION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.DEFINITION__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case UpctformaPackage.DEFINITION__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case UpctformaPackage.DEFINITION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case UpctformaPackage.DEFINITION__UNIT:
				return basicSetUnit(null, msgs);
			case UpctformaPackage.DEFINITION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case UpctformaPackage.DEFINITION__TEMPLATES:
				return getTemplates();
			case UpctformaPackage.DEFINITION__WIDGETS:
				return getWidgets();
			case UpctformaPackage.DEFINITION__IMPORTS:
				return getImports();
			case UpctformaPackage.DEFINITION__UNIT:
				return getUnit();
			case UpctformaPackage.DEFINITION__TYPES:
				return getTypes();
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
			case UpctformaPackage.DEFINITION__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends TemplateDef>)newValue);
				return;
			case UpctformaPackage.DEFINITION__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends WidgetDef>)newValue);
				return;
			case UpctformaPackage.DEFINITION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case UpctformaPackage.DEFINITION__UNIT:
				setUnit((Unit)newValue);
				return;
			case UpctformaPackage.DEFINITION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
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
			case UpctformaPackage.DEFINITION__TEMPLATES:
				getTemplates().clear();
				return;
			case UpctformaPackage.DEFINITION__WIDGETS:
				getWidgets().clear();
				return;
			case UpctformaPackage.DEFINITION__IMPORTS:
				getImports().clear();
				return;
			case UpctformaPackage.DEFINITION__UNIT:
				setUnit((Unit)null);
				return;
			case UpctformaPackage.DEFINITION__TYPES:
				getTypes().clear();
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
			case UpctformaPackage.DEFINITION__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case UpctformaPackage.DEFINITION__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case UpctformaPackage.DEFINITION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case UpctformaPackage.DEFINITION__UNIT:
				return unit != null;
			case UpctformaPackage.DEFINITION__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionImpl
