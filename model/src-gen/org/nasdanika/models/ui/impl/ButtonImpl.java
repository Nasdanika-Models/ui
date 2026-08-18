/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.Button;
import org.nasdanika.models.ui.Element;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.ButtonImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ButtonImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.ButtonImpl#getCommandFor <em>Command For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends ElementImpl implements Button {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eDynamicGet(UiPackage.BUTTON__TEXT, UiPackage.Literals.BUTTON__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eDynamicSet(UiPackage.BUTTON__TEXT, UiPackage.Literals.BUTTON__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommand() {
		return (String)eDynamicGet(UiPackage.BUTTON__COMMAND, UiPackage.Literals.BUTTON__COMMAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(String newCommand) {
		eDynamicSet(UiPackage.BUTTON__COMMAND, UiPackage.Literals.BUTTON__COMMAND, newCommand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getCommandFor() {
		return (Element)eDynamicGet(UiPackage.BUTTON__COMMAND_FOR, UiPackage.Literals.BUTTON__COMMAND_FOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetCommandFor() {
		return (Element)eDynamicGet(UiPackage.BUTTON__COMMAND_FOR, UiPackage.Literals.BUTTON__COMMAND_FOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandFor(Element newCommandFor) {
		eDynamicSet(UiPackage.BUTTON__COMMAND_FOR, UiPackage.Literals.BUTTON__COMMAND_FOR, newCommandFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.BUTTON__TEXT:
				return getText();
			case UiPackage.BUTTON__COMMAND:
				return getCommand();
			case UiPackage.BUTTON__COMMAND_FOR:
				if (resolve) return getCommandFor();
				return basicGetCommandFor();
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
			case UiPackage.BUTTON__TEXT:
				setText((String)newValue);
				return;
			case UiPackage.BUTTON__COMMAND:
				setCommand((String)newValue);
				return;
			case UiPackage.BUTTON__COMMAND_FOR:
				setCommandFor((Element)newValue);
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
			case UiPackage.BUTTON__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case UiPackage.BUTTON__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case UiPackage.BUTTON__COMMAND_FOR:
				setCommandFor((Element)null);
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
			case UiPackage.BUTTON__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case UiPackage.BUTTON__COMMAND:
				return COMMAND_EDEFAULT == null ? getCommand() != null : !COMMAND_EDEFAULT.equals(getCommand());
			case UiPackage.BUTTON__COMMAND_FOR:
				return basicGetCommandFor() != null;
		}
		return super.eIsSet(featureID);
	}

} //ButtonImpl
