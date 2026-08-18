/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.Input;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.InputImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.InputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.InputImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.InputImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.InputImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.InputImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InputImpl extends ElementImpl implements Input {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return (String)eDynamicGet(UiPackage.INPUT__LABEL, UiPackage.Literals.INPUT__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		eDynamicSet(UiPackage.INPUT__LABEL, UiPackage.Literals.INPUT__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(UiPackage.INPUT__VALUE, UiPackage.Literals.INPUT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(UiPackage.INPUT__VALUE, UiPackage.Literals.INPUT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceholder() {
		return (String)eDynamicGet(UiPackage.INPUT__PLACEHOLDER, UiPackage.Literals.INPUT__PLACEHOLDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceholder(String newPlaceholder) {
		eDynamicSet(UiPackage.INPUT__PLACEHOLDER, UiPackage.Literals.INPUT__PLACEHOLDER, newPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return (Boolean)eDynamicGet(UiPackage.INPUT__REQUIRED, UiPackage.Literals.INPUT__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		eDynamicSet(UiPackage.INPUT__REQUIRED, UiPackage.Literals.INPUT__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(UiPackage.INPUT__DISABLED, UiPackage.Literals.INPUT__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(UiPackage.INPUT__DISABLED, UiPackage.Literals.INPUT__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return (Boolean)eDynamicGet(UiPackage.INPUT__READ_ONLY, UiPackage.Literals.INPUT__READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		eDynamicSet(UiPackage.INPUT__READ_ONLY, UiPackage.Literals.INPUT__READ_ONLY, newReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.INPUT__LABEL:
				return getLabel();
			case UiPackage.INPUT__VALUE:
				return getValue();
			case UiPackage.INPUT__PLACEHOLDER:
				return getPlaceholder();
			case UiPackage.INPUT__REQUIRED:
				return isRequired();
			case UiPackage.INPUT__DISABLED:
				return isDisabled();
			case UiPackage.INPUT__READ_ONLY:
				return isReadOnly();
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
			case UiPackage.INPUT__LABEL:
				setLabel((String)newValue);
				return;
			case UiPackage.INPUT__VALUE:
				setValue((String)newValue);
				return;
			case UiPackage.INPUT__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case UiPackage.INPUT__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case UiPackage.INPUT__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case UiPackage.INPUT__READ_ONLY:
				setReadOnly((Boolean)newValue);
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
			case UiPackage.INPUT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case UiPackage.INPUT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case UiPackage.INPUT__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case UiPackage.INPUT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case UiPackage.INPUT__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case UiPackage.INPUT__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
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
			case UiPackage.INPUT__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case UiPackage.INPUT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case UiPackage.INPUT__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? getPlaceholder() != null : !PLACEHOLDER_EDEFAULT.equals(getPlaceholder());
			case UiPackage.INPUT__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case UiPackage.INPUT__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case UiPackage.INPUT__READ_ONLY:
				return isReadOnly() != READ_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
