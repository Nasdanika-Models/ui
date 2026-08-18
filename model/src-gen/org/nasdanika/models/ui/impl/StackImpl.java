/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.Orientation;
import org.nasdanika.models.ui.Stack;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.StackImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.StackImpl#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackImpl extends LayoutImpl implements Stack {
	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.VERTICAL;

	/**
	 * The default value of the '{@link #getGap() <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGap()
	 * @generated
	 * @ordered
	 */
	protected static final String GAP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orientation getOrientation() {
		return (Orientation)eDynamicGet(UiPackage.STACK__ORIENTATION, UiPackage.Literals.STACK__ORIENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(Orientation newOrientation) {
		eDynamicSet(UiPackage.STACK__ORIENTATION, UiPackage.Literals.STACK__ORIENTATION, newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGap() {
		return (String)eDynamicGet(UiPackage.STACK__GAP, UiPackage.Literals.STACK__GAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGap(String newGap) {
		eDynamicSet(UiPackage.STACK__GAP, UiPackage.Literals.STACK__GAP, newGap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.STACK__ORIENTATION:
				return getOrientation();
			case UiPackage.STACK__GAP:
				return getGap();
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
			case UiPackage.STACK__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case UiPackage.STACK__GAP:
				setGap((String)newValue);
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
			case UiPackage.STACK__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case UiPackage.STACK__GAP:
				setGap(GAP_EDEFAULT);
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
			case UiPackage.STACK__ORIENTATION:
				return getOrientation() != ORIENTATION_EDEFAULT;
			case UiPackage.STACK__GAP:
				return GAP_EDEFAULT == null ? getGap() != null : !GAP_EDEFAULT.equals(getGap());
		}
		return super.eIsSet(featureID);
	}

} //StackImpl
