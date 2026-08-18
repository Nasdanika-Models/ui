/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Image#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Image#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends Element {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.ui.UiPackage#getImage_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Image#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' attribute.
	 * @see #setAlternative(String)
	 * @see org.nasdanika.models.ui.UiPackage#getImage_Alternative()
	 * @model unique="false"
	 * @generated
	 */
	String getAlternative();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Image#getAlternative <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' attribute.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(String value);

} // Image
