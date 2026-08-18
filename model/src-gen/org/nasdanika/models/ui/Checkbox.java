/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Checkbox#isChecked <em>Checked</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getCheckbox()
 * @model
 * @generated
 */
public interface Checkbox extends Input {
	/**
	 * Returns the value of the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked</em>' attribute.
	 * @see #setChecked(boolean)
	 * @see org.nasdanika.models.ui.UiPackage#getCheckbox_Checked()
	 * @model unique="false"
	 * @generated
	 */
	boolean isChecked();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Checkbox#isChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked</em>' attribute.
	 * @see #isChecked()
	 * @generated
	 */
	void setChecked(boolean value);

} // Checkbox
