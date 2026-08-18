/**
 */
package org.nasdanika.models.ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.RadioGroup#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getRadioGroup()
 * @model
 * @generated
 */
public interface RadioGroup extends Input {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.nasdanika.models.ui.UiPackage#getRadioGroup_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // RadioGroup
