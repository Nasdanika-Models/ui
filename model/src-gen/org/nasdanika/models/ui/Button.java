/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Button with optional declarative command per the OpenUI Invoker Commands
 * direction: command names an action, commandFor targets the element it
 * operates on (show a modal, toggle a popover).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Button#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Button#getCommand <em>Command</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Button#getCommandFor <em>Command For</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Element {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.ui.UiPackage#getButton_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Button#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see org.nasdanika.models.ui.UiPackage#getButton_Command()
	 * @model unique="false"
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Button#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Command For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command For</em>' reference.
	 * @see #setCommandFor(Element)
	 * @see org.nasdanika.models.ui.UiPackage#getButton_CommandFor()
	 * @model
	 * @generated
	 */
	Element getCommandFor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Button#getCommandFor <em>Command For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command For</em>' reference.
	 * @see #getCommandFor()
	 * @generated
	 */
	void setCommandFor(Element value);

} // Button
