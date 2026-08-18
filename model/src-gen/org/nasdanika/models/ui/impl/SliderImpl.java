/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.Slider;
import org.nasdanika.models.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.impl.SliderImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.SliderImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.impl.SliderImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SliderImpl extends InputImpl implements Slider {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.SLIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMin() {
		return (Double)eDynamicGet(UiPackage.SLIDER__MIN, UiPackage.Literals.SLIDER__MIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(double newMin) {
		eDynamicSet(UiPackage.SLIDER__MIN, UiPackage.Literals.SLIDER__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMax() {
		return (Double)eDynamicGet(UiPackage.SLIDER__MAX, UiPackage.Literals.SLIDER__MAX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(double newMax) {
		eDynamicSet(UiPackage.SLIDER__MAX, UiPackage.Literals.SLIDER__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStep() {
		return (Double)eDynamicGet(UiPackage.SLIDER__STEP, UiPackage.Literals.SLIDER__STEP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStep(double newStep) {
		eDynamicSet(UiPackage.SLIDER__STEP, UiPackage.Literals.SLIDER__STEP, newStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.SLIDER__MIN:
				return getMin();
			case UiPackage.SLIDER__MAX:
				return getMax();
			case UiPackage.SLIDER__STEP:
				return getStep();
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
			case UiPackage.SLIDER__MIN:
				setMin((Double)newValue);
				return;
			case UiPackage.SLIDER__MAX:
				setMax((Double)newValue);
				return;
			case UiPackage.SLIDER__STEP:
				setStep((Double)newValue);
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
			case UiPackage.SLIDER__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case UiPackage.SLIDER__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case UiPackage.SLIDER__STEP:
				setStep(STEP_EDEFAULT);
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
			case UiPackage.SLIDER__MIN:
				return getMin() != MIN_EDEFAULT;
			case UiPackage.SLIDER__MAX:
				return getMax() != MAX_EDEFAULT;
			case UiPackage.SLIDER__STEP:
				return getStep() != STEP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SliderImpl
