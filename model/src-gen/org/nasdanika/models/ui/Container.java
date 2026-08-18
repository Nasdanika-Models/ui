/**
 */
package org.nasdanika.models.ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Structure ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Container#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends Element {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.ui.UiPackage#getContainer_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getChildren();

} // Container
