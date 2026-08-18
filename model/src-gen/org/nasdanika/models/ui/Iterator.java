/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Structural binding: repeats the owning element (typically a Fragment) per item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Iterator#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Iterator#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Iterator#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getIterator()
 * @model
 * @generated
 */
public interface Iterator extends Binding {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Expression producing the items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Items</em>' attribute.
	 * @see #setItems(String)
	 * @see org.nasdanika.models.ui.UiPackage#getIterator_Items()
	 * @model unique="false"
	 * @generated
	 */
	String getItems();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Iterator#getItems <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' attribute.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Loop variable name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.ui.UiPackage#getIterator_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Iterator#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Identity expression for keyed updates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.ui.UiPackage#getIterator_Key()
	 * @model unique="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Iterator#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // Iterator
