/**
 */
package org.nasdanika.models.ui;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Root ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.UiDomain#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.UiDomain#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getUiDomain()
 * @model
 * @generated
 */
public interface UiDomain extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.nasdanika.models.ui.UiPackage#getUiDomain_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.ui.UiPackage#getUiDomain_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // UiDomain
