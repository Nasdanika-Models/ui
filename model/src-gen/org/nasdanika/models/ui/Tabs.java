/**
 */
package org.nasdanika.models.ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Tabs#getTabs <em>Tabs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getTabs()
 * @model
 * @generated
 */
public interface Tabs extends Element {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.Tab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.nasdanika.models.ui.UiPackage#getTabs_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tab> getTabs();

} // Tabs
