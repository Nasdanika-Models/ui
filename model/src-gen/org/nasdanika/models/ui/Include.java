/**
 */
package org.nasdanika.models.ui;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Uses a Component, locally defined or federated from another published model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Include#getComponent <em>Component</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Include#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends Element {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see org.nasdanika.models.ui.UiPackage#getInclude_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Include#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Arguments to the component's data scope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' map.
	 * @see org.nasdanika.models.ui.UiPackage#getInclude_Arguments()
	 * @model mapType="org.nasdanika.models.nxcore.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getArguments();

} // Include
