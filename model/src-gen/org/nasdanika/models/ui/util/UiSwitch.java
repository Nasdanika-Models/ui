/**
 */
package org.nasdanika.models.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.governance.Governed;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

import org.nasdanika.models.ui.*;

import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.ui.UiPackage
 * @generated
 */
public class UiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSwitch() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UiPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseWorkable(element);
				if (result == null) result = caseStringIdentity(element);
				if (result == null) result = caseDocumented(element);
				if (result == null) result = caseMarked(element);
				if (result == null) result = caseGoverned(element);
				if (result == null) result = caseModelElement(element);
				if (result == null) result = caseReferrable(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseModelElement(binding);
				if (result == null) result = caseStringIdentity(binding);
				if (result == null) result = caseDocumented(binding);
				if (result == null) result = caseMarked(binding);
				if (result == null) result = caseReferrable(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.VALUE_BINDING: {
				ValueBinding valueBinding = (ValueBinding)theEObject;
				T result = caseValueBinding(valueBinding);
				if (result == null) result = caseBinding(valueBinding);
				if (result == null) result = caseModelElement(valueBinding);
				if (result == null) result = caseStringIdentity(valueBinding);
				if (result == null) result = caseDocumented(valueBinding);
				if (result == null) result = caseMarked(valueBinding);
				if (result == null) result = caseReferrable(valueBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.EVENT_BINDING: {
				EventBinding eventBinding = (EventBinding)theEObject;
				T result = caseEventBinding(eventBinding);
				if (result == null) result = caseBinding(eventBinding);
				if (result == null) result = caseModelElement(eventBinding);
				if (result == null) result = caseStringIdentity(eventBinding);
				if (result == null) result = caseDocumented(eventBinding);
				if (result == null) result = caseMarked(eventBinding);
				if (result == null) result = caseReferrable(eventBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.ITERATOR: {
				Iterator iterator = (Iterator)theEObject;
				T result = caseIterator(iterator);
				if (result == null) result = caseBinding(iterator);
				if (result == null) result = caseModelElement(iterator);
				if (result == null) result = caseStringIdentity(iterator);
				if (result == null) result = caseDocumented(iterator);
				if (result == null) result = caseMarked(iterator);
				if (result == null) result = caseReferrable(iterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseBinding(conditional);
				if (result == null) result = caseModelElement(conditional);
				if (result == null) result = caseStringIdentity(conditional);
				if (result == null) result = caseDocumented(conditional);
				if (result == null) result = caseMarked(conditional);
				if (result == null) result = caseReferrable(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.DATA_CONTEXT: {
				DataContext dataContext = (DataContext)theEObject;
				T result = caseDataContext(dataContext);
				if (result == null) result = caseBinding(dataContext);
				if (result == null) result = caseModelElement(dataContext);
				if (result == null) result = caseStringIdentity(dataContext);
				if (result == null) result = caseDocumented(dataContext);
				if (result == null) result = caseMarked(dataContext);
				if (result == null) result = caseReferrable(dataContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseElement(container);
				if (result == null) result = caseWorkable(container);
				if (result == null) result = caseStringIdentity(container);
				if (result == null) result = caseDocumented(container);
				if (result == null) result = caseMarked(container);
				if (result == null) result = caseGoverned(container);
				if (result == null) result = caseModelElement(container);
				if (result == null) result = caseReferrable(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.FRAGMENT: {
				Fragment fragment = (Fragment)theEObject;
				T result = caseFragment(fragment);
				if (result == null) result = caseContainer(fragment);
				if (result == null) result = caseElement(fragment);
				if (result == null) result = caseWorkable(fragment);
				if (result == null) result = caseStringIdentity(fragment);
				if (result == null) result = caseDocumented(fragment);
				if (result == null) result = caseMarked(fragment);
				if (result == null) result = caseGoverned(fragment);
				if (result == null) result = caseModelElement(fragment);
				if (result == null) result = caseReferrable(fragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.CUSTOM: {
				Custom custom = (Custom)theEObject;
				T result = caseCustom(custom);
				if (result == null) result = caseContainer(custom);
				if (result == null) result = caseElement(custom);
				if (result == null) result = caseWorkable(custom);
				if (result == null) result = caseStringIdentity(custom);
				if (result == null) result = caseDocumented(custom);
				if (result == null) result = caseMarked(custom);
				if (result == null) result = caseGoverned(custom);
				if (result == null) result = caseModelElement(custom);
				if (result == null) result = caseReferrable(custom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseElement(slot);
				if (result == null) result = caseWorkable(slot);
				if (result == null) result = caseStringIdentity(slot);
				if (result == null) result = caseDocumented(slot);
				if (result == null) result = caseMarked(slot);
				if (result == null) result = caseGoverned(slot);
				if (result == null) result = caseModelElement(slot);
				if (result == null) result = caseReferrable(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseContainer(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = caseWorkable(component);
				if (result == null) result = caseStringIdentity(component);
				if (result == null) result = caseDocumented(component);
				if (result == null) result = caseMarked(component);
				if (result == null) result = caseGoverned(component);
				if (result == null) result = caseModelElement(component);
				if (result == null) result = caseReferrable(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = caseElement(include);
				if (result == null) result = caseWorkable(include);
				if (result == null) result = caseStringIdentity(include);
				if (result == null) result = caseDocumented(include);
				if (result == null) result = caseMarked(include);
				if (result == null) result = caseGoverned(include);
				if (result == null) result = caseModelElement(include);
				if (result == null) result = caseReferrable(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = caseContainer(layout);
				if (result == null) result = caseElement(layout);
				if (result == null) result = caseWorkable(layout);
				if (result == null) result = caseStringIdentity(layout);
				if (result == null) result = caseDocumented(layout);
				if (result == null) result = caseMarked(layout);
				if (result == null) result = caseGoverned(layout);
				if (result == null) result = caseModelElement(layout);
				if (result == null) result = caseReferrable(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.STACK: {
				Stack stack = (Stack)theEObject;
				T result = caseStack(stack);
				if (result == null) result = caseLayout(stack);
				if (result == null) result = caseContainer(stack);
				if (result == null) result = caseElement(stack);
				if (result == null) result = caseWorkable(stack);
				if (result == null) result = caseStringIdentity(stack);
				if (result == null) result = caseDocumented(stack);
				if (result == null) result = caseMarked(stack);
				if (result == null) result = caseGoverned(stack);
				if (result == null) result = caseModelElement(stack);
				if (result == null) result = caseReferrable(stack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.GRID: {
				Grid grid = (Grid)theEObject;
				T result = caseGrid(grid);
				if (result == null) result = caseLayout(grid);
				if (result == null) result = caseContainer(grid);
				if (result == null) result = caseElement(grid);
				if (result == null) result = caseWorkable(grid);
				if (result == null) result = caseStringIdentity(grid);
				if (result == null) result = caseDocumented(grid);
				if (result == null) result = caseMarked(grid);
				if (result == null) result = caseGoverned(grid);
				if (result == null) result = caseModelElement(grid);
				if (result == null) result = caseReferrable(grid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.TABS: {
				Tabs tabs = (Tabs)theEObject;
				T result = caseTabs(tabs);
				if (result == null) result = caseElement(tabs);
				if (result == null) result = caseWorkable(tabs);
				if (result == null) result = caseStringIdentity(tabs);
				if (result == null) result = caseDocumented(tabs);
				if (result == null) result = caseMarked(tabs);
				if (result == null) result = caseGoverned(tabs);
				if (result == null) result = caseModelElement(tabs);
				if (result == null) result = caseReferrable(tabs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.TAB: {
				Tab tab = (Tab)theEObject;
				T result = caseTab(tab);
				if (result == null) result = caseContainer(tab);
				if (result == null) result = caseElement(tab);
				if (result == null) result = caseWorkable(tab);
				if (result == null) result = caseStringIdentity(tab);
				if (result == null) result = caseDocumented(tab);
				if (result == null) result = caseMarked(tab);
				if (result == null) result = caseGoverned(tab);
				if (result == null) result = caseModelElement(tab);
				if (result == null) result = caseReferrable(tab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseElement(text);
				if (result == null) result = caseWorkable(text);
				if (result == null) result = caseStringIdentity(text);
				if (result == null) result = caseDocumented(text);
				if (result == null) result = caseMarked(text);
				if (result == null) result = caseGoverned(text);
				if (result == null) result = caseModelElement(text);
				if (result == null) result = caseReferrable(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseElement(image);
				if (result == null) result = caseWorkable(image);
				if (result == null) result = caseStringIdentity(image);
				if (result == null) result = caseDocumented(image);
				if (result == null) result = caseMarked(image);
				if (result == null) result = caseGoverned(image);
				if (result == null) result = caseModelElement(image);
				if (result == null) result = caseReferrable(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseElement(link);
				if (result == null) result = caseWorkable(link);
				if (result == null) result = caseStringIdentity(link);
				if (result == null) result = caseDocumented(link);
				if (result == null) result = caseMarked(link);
				if (result == null) result = caseGoverned(link);
				if (result == null) result = caseModelElement(link);
				if (result == null) result = caseReferrable(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseElement(button);
				if (result == null) result = caseWorkable(button);
				if (result == null) result = caseStringIdentity(button);
				if (result == null) result = caseDocumented(button);
				if (result == null) result = caseMarked(button);
				if (result == null) result = caseGoverned(button);
				if (result == null) result = caseModelElement(button);
				if (result == null) result = caseReferrable(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseElement(input);
				if (result == null) result = caseWorkable(input);
				if (result == null) result = caseStringIdentity(input);
				if (result == null) result = caseDocumented(input);
				if (result == null) result = caseMarked(input);
				if (result == null) result = caseGoverned(input);
				if (result == null) result = caseModelElement(input);
				if (result == null) result = caseReferrable(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.TEXT_INPUT: {
				TextInput textInput = (TextInput)theEObject;
				T result = caseTextInput(textInput);
				if (result == null) result = caseInput(textInput);
				if (result == null) result = caseElement(textInput);
				if (result == null) result = caseWorkable(textInput);
				if (result == null) result = caseStringIdentity(textInput);
				if (result == null) result = caseDocumented(textInput);
				if (result == null) result = caseMarked(textInput);
				if (result == null) result = caseGoverned(textInput);
				if (result == null) result = caseModelElement(textInput);
				if (result == null) result = caseReferrable(textInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseInput(textArea);
				if (result == null) result = caseElement(textArea);
				if (result == null) result = caseWorkable(textArea);
				if (result == null) result = caseStringIdentity(textArea);
				if (result == null) result = caseDocumented(textArea);
				if (result == null) result = caseMarked(textArea);
				if (result == null) result = caseGoverned(textArea);
				if (result == null) result = caseModelElement(textArea);
				if (result == null) result = caseReferrable(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.CHECKBOX: {
				Checkbox checkbox = (Checkbox)theEObject;
				T result = caseCheckbox(checkbox);
				if (result == null) result = caseInput(checkbox);
				if (result == null) result = caseElement(checkbox);
				if (result == null) result = caseWorkable(checkbox);
				if (result == null) result = caseStringIdentity(checkbox);
				if (result == null) result = caseDocumented(checkbox);
				if (result == null) result = caseMarked(checkbox);
				if (result == null) result = caseGoverned(checkbox);
				if (result == null) result = caseModelElement(checkbox);
				if (result == null) result = caseReferrable(checkbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = caseModelElement(option);
				if (result == null) result = caseStringIdentity(option);
				if (result == null) result = caseDocumented(option);
				if (result == null) result = caseMarked(option);
				if (result == null) result = caseReferrable(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseInput(select);
				if (result == null) result = caseElement(select);
				if (result == null) result = caseWorkable(select);
				if (result == null) result = caseStringIdentity(select);
				if (result == null) result = caseDocumented(select);
				if (result == null) result = caseMarked(select);
				if (result == null) result = caseGoverned(select);
				if (result == null) result = caseModelElement(select);
				if (result == null) result = caseReferrable(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.RADIO_GROUP: {
				RadioGroup radioGroup = (RadioGroup)theEObject;
				T result = caseRadioGroup(radioGroup);
				if (result == null) result = caseInput(radioGroup);
				if (result == null) result = caseElement(radioGroup);
				if (result == null) result = caseWorkable(radioGroup);
				if (result == null) result = caseStringIdentity(radioGroup);
				if (result == null) result = caseDocumented(radioGroup);
				if (result == null) result = caseMarked(radioGroup);
				if (result == null) result = caseGoverned(radioGroup);
				if (result == null) result = caseModelElement(radioGroup);
				if (result == null) result = caseReferrable(radioGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.SLIDER: {
				Slider slider = (Slider)theEObject;
				T result = caseSlider(slider);
				if (result == null) result = caseInput(slider);
				if (result == null) result = caseElement(slider);
				if (result == null) result = caseWorkable(slider);
				if (result == null) result = caseStringIdentity(slider);
				if (result == null) result = caseDocumented(slider);
				if (result == null) result = caseMarked(slider);
				if (result == null) result = caseGoverned(slider);
				if (result == null) result = caseModelElement(slider);
				if (result == null) result = caseReferrable(slider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.DATE_INPUT: {
				DateInput dateInput = (DateInput)theEObject;
				T result = caseDateInput(dateInput);
				if (result == null) result = caseInput(dateInput);
				if (result == null) result = caseElement(dateInput);
				if (result == null) result = caseWorkable(dateInput);
				if (result == null) result = caseStringIdentity(dateInput);
				if (result == null) result = caseDocumented(dateInput);
				if (result == null) result = caseMarked(dateInput);
				if (result == null) result = caseGoverned(dateInput);
				if (result == null) result = caseModelElement(dateInput);
				if (result == null) result = caseReferrable(dateInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.FILE_INPUT: {
				FileInput fileInput = (FileInput)theEObject;
				T result = caseFileInput(fileInput);
				if (result == null) result = caseInput(fileInput);
				if (result == null) result = caseElement(fileInput);
				if (result == null) result = caseWorkable(fileInput);
				if (result == null) result = caseStringIdentity(fileInput);
				if (result == null) result = caseDocumented(fileInput);
				if (result == null) result = caseMarked(fileInput);
				if (result == null) result = caseGoverned(fileInput);
				if (result == null) result = caseModelElement(fileInput);
				if (result == null) result = caseReferrable(fileInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseContainer(form);
				if (result == null) result = caseElement(form);
				if (result == null) result = caseWorkable(form);
				if (result == null) result = caseStringIdentity(form);
				if (result == null) result = caseDocumented(form);
				if (result == null) result = caseMarked(form);
				if (result == null) result = caseGoverned(form);
				if (result == null) result = caseModelElement(form);
				if (result == null) result = caseReferrable(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_DOMAIN: {
				UiDomain uiDomain = (UiDomain)theEObject;
				T result = caseUiDomain(uiDomain);
				if (result == null) result = caseModelElement(uiDomain);
				if (result == null) result = caseStringIdentity(uiDomain);
				if (result == null) result = caseDocumented(uiDomain);
				if (result == null) result = caseMarked(uiDomain);
				if (result == null) result = caseReferrable(uiDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueBinding(ValueBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBinding(EventBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterator(Iterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataContext(DataContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragment(Fragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustom(Custom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStack(Stack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrid(Grid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabs(Tabs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTab(Tab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInput(TextInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckbox(Checkbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioGroup(RadioGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlider(Slider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateInput(DateInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileInput(FileInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiDomain(UiDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoverned(Governed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkable(Workable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UiSwitch
