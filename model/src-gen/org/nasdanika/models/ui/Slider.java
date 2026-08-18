/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Slider#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Slider#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Slider#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getSlider()
 * @model
 * @generated
 */
public interface Slider extends Input {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see org.nasdanika.models.ui.UiPackage#getSlider_Min()
	 * @model unique="false"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Slider#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see org.nasdanika.models.ui.UiPackage#getSlider_Max()
	 * @model unique="false"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Slider#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see org.nasdanika.models.ui.UiPackage#getSlider_Step()
	 * @model unique="false"
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Slider#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

} // Slider
