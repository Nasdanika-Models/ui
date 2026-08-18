/**
 */
package org.nasdanika.models.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Grid#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Grid#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends Layout {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(Integer)
	 * @see org.nasdanika.models.ui.UiPackage#getGrid_Columns()
	 * @model unique="false"
	 * @generated
	 */
	Integer getColumns();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Grid#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(Integer value);

	/**
	 * Returns the value of the '<em><b>Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap</em>' attribute.
	 * @see #setGap(String)
	 * @see org.nasdanika.models.ui.UiPackage#getGrid_Gap()
	 * @model unique="false"
	 * @generated
	 */
	String getGap();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Grid#getGap <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap</em>' attribute.
	 * @see #getGap()
	 * @generated
	 */
	void setGap(String value);

} // Grid
