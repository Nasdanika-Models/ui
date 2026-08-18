/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Binds an event to a handler expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.EventBinding#getEvent <em>Event</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.EventBinding#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getEventBinding()
 * @model
 * @generated
 */
public interface EventBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Event name, e.g. click, input, submit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see org.nasdanika.models.ui.UiPackage#getEventBinding_Event()
	 * @model unique="false"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.EventBinding#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' attribute.
	 * @see #setHandler(String)
	 * @see org.nasdanika.models.ui.UiPackage#getEventBinding_Handler()
	 * @model unique="false"
	 * @generated
	 */
	String getHandler();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.EventBinding#getHandler <em>Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' attribute.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(String value);

} // EventBinding
