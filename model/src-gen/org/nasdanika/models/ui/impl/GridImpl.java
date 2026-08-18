/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.Grid;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.GridImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.GridImpl#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridImpl extends LayoutImpl implements Grid {
	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COLUMNS_EDEFAULT = null;

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
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getColumns() {
		return (Integer)eDynamicGet(UiPackage.GRID__COLUMNS, UiPackage.Literals.GRID__COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumns(Integer newColumns) {
		eDynamicSet(UiPackage.GRID__COLUMNS, UiPackage.Literals.GRID__COLUMNS, newColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGap() {
		return (String)eDynamicGet(UiPackage.GRID__GAP, UiPackage.Literals.GRID__GAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGap(String newGap) {
		eDynamicSet(UiPackage.GRID__GAP, UiPackage.Literals.GRID__GAP, newGap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.GRID__COLUMNS:
				return getColumns();
			case UiPackage.GRID__GAP:
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
			case UiPackage.GRID__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case UiPackage.GRID__GAP:
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
			case UiPackage.GRID__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case UiPackage.GRID__GAP:
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
			case UiPackage.GRID__COLUMNS:
				return COLUMNS_EDEFAULT == null ? getColumns() != null : !COLUMNS_EDEFAULT.equals(getColumns());
			case UiPackage.GRID__GAP:
				return GAP_EDEFAULT == null ? getGap() != null : !GAP_EDEFAULT.equals(getGap());
		}
		return super.eIsSet(featureID);
	}

} //GridImpl
