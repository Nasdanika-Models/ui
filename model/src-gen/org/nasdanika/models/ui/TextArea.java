/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.TextArea#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends Input {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(Integer)
	 * @see org.nasdanika.models.ui.UiPackage#getTextArea_Rows()
	 * @model unique="false"
	 * @generated
	 */
	Integer getRows();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.TextArea#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(Integer value);

} // TextArea
