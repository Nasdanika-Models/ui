/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.ui.Component;
import org.nasdanika.models.ui.Include;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.IncludeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.IncludeImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl extends ElementImpl implements Include {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		return (Component)eDynamicGet(UiPackage.INCLUDE__COMPONENT, UiPackage.Literals.INCLUDE__COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return (Component)eDynamicGet(UiPackage.INCLUDE__COMPONENT, UiPackage.Literals.INCLUDE__COMPONENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		eDynamicSet(UiPackage.INCLUDE__COMPONENT, UiPackage.Literals.INCLUDE__COMPONENT, newComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getArguments() {
		return (EMap<String, String>)eDynamicGet(UiPackage.INCLUDE__ARGUMENTS, UiPackage.Literals.INCLUDE__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.INCLUDE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case UiPackage.INCLUDE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case UiPackage.INCLUDE__ARGUMENTS:
				if (coreType) return getArguments();
				else return getArguments().map();
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
			case UiPackage.INCLUDE__COMPONENT:
				setComponent((Component)newValue);
				return;
			case UiPackage.INCLUDE__ARGUMENTS:
				((EStructuralFeature.Setting)getArguments()).set(newValue);
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
			case UiPackage.INCLUDE__COMPONENT:
				setComponent((Component)null);
				return;
			case UiPackage.INCLUDE__ARGUMENTS:
				getArguments().clear();
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
			case UiPackage.INCLUDE__COMPONENT:
				return basicGetComponent() != null;
			case UiPackage.INCLUDE__ARGUMENTS:
				return !getArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IncludeImpl
