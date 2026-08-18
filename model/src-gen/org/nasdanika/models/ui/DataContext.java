/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Establishes a data scope on the owning element, e.g. Alpine x-data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.DataContext#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getDataContext()
 * @model
 * @generated
 */
public interface DataContext extends Binding {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Initial data, e.g. a JSON object expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.nasdanika.models.ui.UiPackage#getDataContext_Expression()
	 * @model unique="false"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.DataContext#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // DataContext
