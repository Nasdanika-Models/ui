/**
 */
package org.nasdanika.models.ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.ui.Binding;
import org.nasdanika.models.ui.Element;
import org.nasdanika.models.ui.UiPackage;

import org.nasdanika.models.work.AbstractWork;
import org.nasdanika.models.work.WorkPackage;
import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getWork <em>Work</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getStyleClasses <em>Style Classes</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ElementImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends ModelElementImpl implements Element {
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(UiPackage.ELEMENT__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(UiPackage.ELEMENT__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(UiPackage.ELEMENT__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractWork> getWork() {
		return (EList<AbstractWork>)eDynamicGet(UiPackage.ELEMENT__WORK, WorkPackage.Literals.WORKABLE__WORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getAttributes() {
		return (EMap<String, String>)eDynamicGet(UiPackage.ELEMENT__ATTRIBUTES, UiPackage.Literals.ELEMENT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getStyleClasses() {
		return (EList<String>)eDynamicGet(UiPackage.ELEMENT__STYLE_CLASSES, UiPackage.Literals.ELEMENT__STYLE_CLASSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return (String)eDynamicGet(UiPackage.ELEMENT__STYLE, UiPackage.Literals.ELEMENT__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		eDynamicSet(UiPackage.ELEMENT__STYLE, UiPackage.Literals.ELEMENT__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Binding> getBindings() {
		return (EList<Binding>)eDynamicGet(UiPackage.ELEMENT__BINDINGS, UiPackage.Literals.ELEMENT__BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.ELEMENT__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case UiPackage.ELEMENT__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case UiPackage.ELEMENT__WAIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWaivers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.ELEMENT__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case UiPackage.ELEMENT__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case UiPackage.ELEMENT__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case UiPackage.ELEMENT__WORK:
				return ((InternalEList<?>)getWork()).basicRemove(otherEnd, msgs);
			case UiPackage.ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case UiPackage.ELEMENT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case UiPackage.ELEMENT__CONTROL_APPLICATIONS:
				return getControlApplications();
			case UiPackage.ELEMENT__RISKS:
				return getRisks();
			case UiPackage.ELEMENT__WAIVERS:
				return getWaivers();
			case UiPackage.ELEMENT__WORK:
				return getWork();
			case UiPackage.ELEMENT__ATTRIBUTES:
				if (coreType) return getAttributes();
				else return getAttributes().map();
			case UiPackage.ELEMENT__STYLE_CLASSES:
				return getStyleClasses();
			case UiPackage.ELEMENT__STYLE:
				return getStyle();
			case UiPackage.ELEMENT__BINDINGS:
				return getBindings();
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
			case UiPackage.ELEMENT__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case UiPackage.ELEMENT__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case UiPackage.ELEMENT__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case UiPackage.ELEMENT__WORK:
				getWork().clear();
				getWork().addAll((Collection<? extends AbstractWork>)newValue);
				return;
			case UiPackage.ELEMENT__ATTRIBUTES:
				((EStructuralFeature.Setting)getAttributes()).set(newValue);
				return;
			case UiPackage.ELEMENT__STYLE_CLASSES:
				getStyleClasses().clear();
				getStyleClasses().addAll((Collection<? extends String>)newValue);
				return;
			case UiPackage.ELEMENT__STYLE:
				setStyle((String)newValue);
				return;
			case UiPackage.ELEMENT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
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
			case UiPackage.ELEMENT__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case UiPackage.ELEMENT__RISKS:
				getRisks().clear();
				return;
			case UiPackage.ELEMENT__WAIVERS:
				getWaivers().clear();
				return;
			case UiPackage.ELEMENT__WORK:
				getWork().clear();
				return;
			case UiPackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case UiPackage.ELEMENT__STYLE_CLASSES:
				getStyleClasses().clear();
				return;
			case UiPackage.ELEMENT__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case UiPackage.ELEMENT__BINDINGS:
				getBindings().clear();
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
			case UiPackage.ELEMENT__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case UiPackage.ELEMENT__RISKS:
				return !getRisks().isEmpty();
			case UiPackage.ELEMENT__WAIVERS:
				return !getWaivers().isEmpty();
			case UiPackage.ELEMENT__WORK:
				return !getWork().isEmpty();
			case UiPackage.ELEMENT__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case UiPackage.ELEMENT__STYLE_CLASSES:
				return !getStyleClasses().isEmpty();
			case UiPackage.ELEMENT__STYLE:
				return STYLE_EDEFAULT == null ? getStyle() != null : !STYLE_EDEFAULT.equals(getStyle());
			case UiPackage.ELEMENT__BINDINGS:
				return !getBindings().isEmpty();
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
		if (baseClass == Governed.class) {
			switch (derivedFeatureID) {
				case UiPackage.ELEMENT__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case UiPackage.ELEMENT__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case UiPackage.ELEMENT__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (derivedFeatureID) {
				case UiPackage.ELEMENT__WORK: return WorkPackage.WORKABLE__WORK;
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
		if (baseClass == Governed.class) {
			switch (baseFeatureID) {
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return UiPackage.ELEMENT__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return UiPackage.ELEMENT__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return UiPackage.ELEMENT__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (baseFeatureID) {
				case WorkPackage.WORKABLE__WORK: return UiPackage.ELEMENT__WORK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ElementImpl
