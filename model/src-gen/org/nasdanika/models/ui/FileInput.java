/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.FileInput#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.FileInput#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getFileInput()
 * @model
 * @generated
 */
public interface FileInput extends Input {
	/**
	 * Returns the value of the '<em><b>Accept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Accepted types, e.g. image/*, .pdf.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accept</em>' attribute.
	 * @see #setAccept(String)
	 * @see org.nasdanika.models.ui.UiPackage#getFileInput_Accept()
	 * @model unique="false"
	 * @generated
	 */
	String getAccept();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.FileInput#getAccept <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept</em>' attribute.
	 * @see #getAccept()
	 * @generated
	 */
	void setAccept(String value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see org.nasdanika.models.ui.UiPackage#getFileInput_Multiple()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.FileInput#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

} // FileInput
