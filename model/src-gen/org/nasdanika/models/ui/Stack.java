/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Stack#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Stack#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getStack()
 * @model
 * @generated
 */
public interface Stack extends Layout {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.nasdanika.models.ui.Orientation
	 * @see #setOrientation(Orientation)
	 * @see org.nasdanika.models.ui.UiPackage#getStack_Orientation()
	 * @model unique="false"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Stack#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.nasdanika.models.ui.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap</em>' attribute.
	 * @see #setGap(String)
	 * @see org.nasdanika.models.ui.UiPackage#getStack_Gap()
	 * @model unique="false"
	 * @generated
	 */
	String getGap();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Stack#getGap <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap</em>' attribute.
	 * @see #getGap()
	 * @generated
	 */
	void setGap(String value);

} // Stack
