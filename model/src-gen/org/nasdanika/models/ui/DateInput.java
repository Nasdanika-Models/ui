/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.DateInput#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getDateInput()
 * @model
 * @generated
 */
public interface DateInput extends Input {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.DateKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.ui.DateKind
	 * @see #setKind(DateKind)
	 * @see org.nasdanika.models.ui.UiPackage#getDateInput_Kind()
	 * @model unique="false"
	 * @generated
	 */
	DateKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.DateInput#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.ui.DateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DateKind value);

} // DateInput
