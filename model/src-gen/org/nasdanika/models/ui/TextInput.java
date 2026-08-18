/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.TextInput#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getTextInput()
 * @model
 * @generated
 */
public interface TextInput extends Input {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.TextKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.ui.TextKind
	 * @see #setKind(TextKind)
	 * @see org.nasdanika.models.ui.UiPackage#getTextInput_Kind()
	 * @model unique="false"
	 * @generated
	 */
	TextKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.TextInput#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.ui.TextKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TextKind value);

} // TextInput
