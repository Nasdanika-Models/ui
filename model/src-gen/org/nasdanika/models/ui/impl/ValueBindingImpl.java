/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.BindingMode;
import org.nasdanika.models.ui.UiPackage;
import org.nasdanika.models.ui.ValueBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.ValueBindingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ValueBindingImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ValueBindingImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueBindingImpl extends BindingImpl implements ValueBinding {
	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final BindingMode MODE_EDEFAULT = BindingMode.ONE_WAY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.VALUE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return (String)eDynamicGet(UiPackage.VALUE_BINDING__TARGET, UiPackage.Literals.VALUE_BINDING__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		eDynamicSet(UiPackage.VALUE_BINDING__TARGET, UiPackage.Literals.VALUE_BINDING__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return (String)eDynamicGet(UiPackage.VALUE_BINDING__EXPRESSION, UiPackage.Literals.VALUE_BINDING__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		eDynamicSet(UiPackage.VALUE_BINDING__EXPRESSION, UiPackage.Literals.VALUE_BINDING__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingMode getMode() {
		return (BindingMode)eDynamicGet(UiPackage.VALUE_BINDING__MODE, UiPackage.Literals.VALUE_BINDING__MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(BindingMode newMode) {
		eDynamicSet(UiPackage.VALUE_BINDING__MODE, UiPackage.Literals.VALUE_BINDING__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.VALUE_BINDING__TARGET:
				return getTarget();
			case UiPackage.VALUE_BINDING__EXPRESSION:
				return getExpression();
			case UiPackage.VALUE_BINDING__MODE:
				return getMode();
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
			case UiPackage.VALUE_BINDING__TARGET:
				setTarget((String)newValue);
				return;
			case UiPackage.VALUE_BINDING__EXPRESSION:
				setExpression((String)newValue);
				return;
			case UiPackage.VALUE_BINDING__MODE:
				setMode((BindingMode)newValue);
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
			case UiPackage.VALUE_BINDING__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case UiPackage.VALUE_BINDING__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case UiPackage.VALUE_BINDING__MODE:
				setMode(MODE_EDEFAULT);
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
			case UiPackage.VALUE_BINDING__TARGET:
				return TARGET_EDEFAULT == null ? getTarget() != null : !TARGET_EDEFAULT.equals(getTarget());
			case UiPackage.VALUE_BINDING__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? getExpression() != null : !EXPRESSION_EDEFAULT.equals(getExpression());
			case UiPackage.VALUE_BINDING__MODE:
				return getMode() != MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ValueBindingImpl
