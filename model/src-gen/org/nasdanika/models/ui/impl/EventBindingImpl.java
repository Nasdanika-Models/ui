/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.EventBinding;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.EventBindingImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.EventBindingImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventBindingImpl extends BindingImpl implements EventBinding {
	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHandler() <em>Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.EVENT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEvent() {
		return (String)eDynamicGet(UiPackage.EVENT_BINDING__EVENT, UiPackage.Literals.EVENT_BINDING__EVENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(String newEvent) {
		eDynamicSet(UiPackage.EVENT_BINDING__EVENT, UiPackage.Literals.EVENT_BINDING__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandler() {
		return (String)eDynamicGet(UiPackage.EVENT_BINDING__HANDLER, UiPackage.Literals.EVENT_BINDING__HANDLER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandler(String newHandler) {
		eDynamicSet(UiPackage.EVENT_BINDING__HANDLER, UiPackage.Literals.EVENT_BINDING__HANDLER, newHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.EVENT_BINDING__EVENT:
				return getEvent();
			case UiPackage.EVENT_BINDING__HANDLER:
				return getHandler();
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
			case UiPackage.EVENT_BINDING__EVENT:
				setEvent((String)newValue);
				return;
			case UiPackage.EVENT_BINDING__HANDLER:
				setHandler((String)newValue);
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
			case UiPackage.EVENT_BINDING__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case UiPackage.EVENT_BINDING__HANDLER:
				setHandler(HANDLER_EDEFAULT);
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
			case UiPackage.EVENT_BINDING__EVENT:
				return EVENT_EDEFAULT == null ? getEvent() != null : !EVENT_EDEFAULT.equals(getEvent());
			case UiPackage.EVENT_BINDING__HANDLER:
				return HANDLER_EDEFAULT == null ? getHandler() != null : !HANDLER_EDEFAULT.equals(getHandler());
		}
		return super.eIsSet(featureID);
	}

} //EventBindingImpl
