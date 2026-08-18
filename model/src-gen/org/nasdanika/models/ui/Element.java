/**
 */
package org.nasdanika.models.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.nasdanika.models.governance.Governed;

import org.nasdanika.models.nxcore.ModelElement;

import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base UI element. Attributes are rendered onto the target markup (unlike
 * properties, which are annotations). Aspect supertypes give every element
 * work and governance; lifecycle and roles pending classpath:
 * 
 * abstract class Element extends ModelElement, Workable, GovernedElement,
 *     org.nasdanika.models.lifecycle.Staged, org.nasdanika.models.role.Undergoer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.Element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Element#getStyleClasses <em>Style Classes</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Element#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.Element#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.UiPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends ModelElement, Workable, Governed {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' map.
	 * @see org.nasdanika.models.ui.UiPackage#getElement_Attributes()
	 * @model mapType="org.nasdanika.models.nxcore.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getAttributes();

	/**
	 * Returns the value of the '<em><b>Style Classes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Classes</em>' attribute list.
	 * @see org.nasdanika.models.ui.UiPackage#getElement_StyleClasses()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStyleClasses();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Inline style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.nasdanika.models.ui.UiPackage#getElement_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.Element#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.nasdanika.models.ui.UiPackage#getElement_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

} // Element
