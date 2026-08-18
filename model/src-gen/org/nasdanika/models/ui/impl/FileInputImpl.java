/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.FileInput;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.FileInputImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.FileInputImpl#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileInputImpl extends InputImpl implements FileInput {
	/**
	 * The default value of the '{@link #getAccept() <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.FILE_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccept() {
		return (String)eDynamicGet(UiPackage.FILE_INPUT__ACCEPT, UiPackage.Literals.FILE_INPUT__ACCEPT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccept(String newAccept) {
		eDynamicSet(UiPackage.FILE_INPUT__ACCEPT, UiPackage.Literals.FILE_INPUT__ACCEPT, newAccept);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiple() {
		return (Boolean)eDynamicGet(UiPackage.FILE_INPUT__MULTIPLE, UiPackage.Literals.FILE_INPUT__MULTIPLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiple(boolean newMultiple) {
		eDynamicSet(UiPackage.FILE_INPUT__MULTIPLE, UiPackage.Literals.FILE_INPUT__MULTIPLE, newMultiple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.FILE_INPUT__ACCEPT:
				return getAccept();
			case UiPackage.FILE_INPUT__MULTIPLE:
				return isMultiple();
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
			case UiPackage.FILE_INPUT__ACCEPT:
				setAccept((String)newValue);
				return;
			case UiPackage.FILE_INPUT__MULTIPLE:
				setMultiple((Boolean)newValue);
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
			case UiPackage.FILE_INPUT__ACCEPT:
				setAccept(ACCEPT_EDEFAULT);
				return;
			case UiPackage.FILE_INPUT__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
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
			case UiPackage.FILE_INPUT__ACCEPT:
				return ACCEPT_EDEFAULT == null ? getAccept() != null : !ACCEPT_EDEFAULT.equals(getAccept());
			case UiPackage.FILE_INPUT__MULTIPLE:
				return isMultiple() != MULTIPLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FileInputImpl
