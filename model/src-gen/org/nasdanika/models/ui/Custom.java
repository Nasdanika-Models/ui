/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extension point: an element with a unique kind. Maps to a web-components
 * custom element name; at generation time the kind participates in
 * capability-framework service resolution, so new element kinds are added
 * by registering capabilities, not by changing the metamodel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Custom#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getCustom()
 * @model
 * @generated
 */
public interface Custom extends Container {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.nasdanika.models.ui.UiPackage#getCustom_Kind()
	 * @model unique="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Custom#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // Custom
