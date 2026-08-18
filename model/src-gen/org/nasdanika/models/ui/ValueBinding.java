/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Binds a property or attribute of the element to an expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.ValueBinding#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.ValueBinding#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.ValueBinding#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getValueBinding()
 * @model
 * @generated
 */
public interface ValueBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Property or attribute name, e.g. value, checked, class, src.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.nasdanika.models.ui.UiPackage#getValueBinding_Target()
	 * @model unique="false"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.ValueBinding#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.nasdanika.models.ui.UiPackage#getValueBinding_Expression()
	 * @model unique="false"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.ValueBinding#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.BindingMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.models.ui.BindingMode
	 * @see #setMode(BindingMode)
	 * @see org.nasdanika.models.ui.UiPackage#getValueBinding_Mode()
	 * @model unique="false"
	 * @generated
	 */
	BindingMode getMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.ValueBinding#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.models.ui.BindingMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(BindingMode value);

} // ValueBinding
