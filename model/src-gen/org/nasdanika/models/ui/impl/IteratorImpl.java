/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.Iterator;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.IteratorImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.IteratorImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.IteratorImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IteratorImpl extends BindingImpl implements Iterator {
	/**
	 * The default value of the '{@link #getItems() <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEMS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.ITERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItems() {
		return (String)eDynamicGet(UiPackage.ITERATOR__ITEMS, UiPackage.Literals.ITERATOR__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItems(String newItems) {
		eDynamicSet(UiPackage.ITERATOR__ITEMS, UiPackage.Literals.ITERATOR__ITEMS, newItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariable() {
		return (String)eDynamicGet(UiPackage.ITERATOR__VARIABLE, UiPackage.Literals.ITERATOR__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(String newVariable) {
		eDynamicSet(UiPackage.ITERATOR__VARIABLE, UiPackage.Literals.ITERATOR__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return (String)eDynamicGet(UiPackage.ITERATOR__KEY, UiPackage.Literals.ITERATOR__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		eDynamicSet(UiPackage.ITERATOR__KEY, UiPackage.Literals.ITERATOR__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.ITERATOR__ITEMS:
				return getItems();
			case UiPackage.ITERATOR__VARIABLE:
				return getVariable();
			case UiPackage.ITERATOR__KEY:
				return getKey();
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
			case UiPackage.ITERATOR__ITEMS:
				setItems((String)newValue);
				return;
			case UiPackage.ITERATOR__VARIABLE:
				setVariable((String)newValue);
				return;
			case UiPackage.ITERATOR__KEY:
				setKey((String)newValue);
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
			case UiPackage.ITERATOR__ITEMS:
				setItems(ITEMS_EDEFAULT);
				return;
			case UiPackage.ITERATOR__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case UiPackage.ITERATOR__KEY:
				setKey(KEY_EDEFAULT);
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
			case UiPackage.ITERATOR__ITEMS:
				return ITEMS_EDEFAULT == null ? getItems() != null : !ITEMS_EDEFAULT.equals(getItems());
			case UiPackage.ITERATOR__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case UiPackage.ITERATOR__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
		}
		return super.eIsSet(featureID);
	}

} //IteratorImpl
