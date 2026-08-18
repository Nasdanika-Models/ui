/**
 */
package org.nasdanika.models.ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Informed by OpenUI customizable select.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Select#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Select#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Input {
	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see org.nasdanika.models.ui.UiPackage#getSelect_Multiple()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Select#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.nasdanika.models.ui.UiPackage#getSelect_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // Select
