/**
 */
package org.nasdanika.models.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

import org.nasdanika.models.ui.Binding;
import org.nasdanika.models.ui.BindingMode;
import org.nasdanika.models.ui.Button;
import org.nasdanika.models.ui.Checkbox;
import org.nasdanika.models.ui.Component;
import org.nasdanika.models.ui.Conditional;
import org.nasdanika.models.ui.Custom;
import org.nasdanika.models.ui.DataContext;
import org.nasdanika.models.ui.DateInput;
import org.nasdanika.models.ui.DateKind;
import org.nasdanika.models.ui.Element;
import org.nasdanika.models.ui.EventBinding;
import org.nasdanika.models.ui.FileInput;
import org.nasdanika.models.ui.Form;
import org.nasdanika.models.ui.Fragment;
import org.nasdanika.models.ui.Grid;
import org.nasdanika.models.ui.Image;
import org.nasdanika.models.ui.Include;
import org.nasdanika.models.ui.Input;
import org.nasdanika.models.ui.Iterator;
import org.nasdanika.models.ui.Layout;
import org.nasdanika.models.ui.Link;
import org.nasdanika.models.ui.Option;
import org.nasdanika.models.ui.Orientation;
import org.nasdanika.models.ui.RadioGroup;
import org.nasdanika.models.ui.Select;
import org.nasdanika.models.ui.Slider;
import org.nasdanika.models.ui.Slot;
import org.nasdanika.models.ui.Stack;
import org.nasdanika.models.ui.Tab;
import org.nasdanika.models.ui.Tabs;
import org.nasdanika.models.ui.Text;
import org.nasdanika.models.ui.TextArea;
import org.nasdanika.models.ui.TextInput;
import org.nasdanika.models.ui.TextKind;
import org.nasdanika.models.ui.UiDomain;
import org.nasdanika.models.ui.UiFactory;
import org.nasdanika.models.ui.UiPackage;
import org.nasdanika.models.ui.ValueBinding;

import org.nasdanika.models.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkboxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited) return (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UiPackageImpl theUiPackage = registeredUiPackage instanceof UiPackageImpl ? (UiPackageImpl)registeredUiPackage : new UiPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		WorkPackage.eINSTANCE.eClass();
		GovernancePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Attributes() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_StyleClasses() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Style() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Bindings() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueBinding() {
		return valueBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueBinding_Target() {
		return (EAttribute)valueBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueBinding_Expression() {
		return (EAttribute)valueBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueBinding_Mode() {
		return (EAttribute)valueBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventBinding() {
		return eventBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventBinding_Event() {
		return (EAttribute)eventBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventBinding_Handler() {
		return (EAttribute)eventBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIterator() {
		return iteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIterator_Items() {
		return (EAttribute)iteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIterator_Variable() {
		return (EAttribute)iteratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIterator_Key() {
		return (EAttribute)iteratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditional_Condition() {
		return (EAttribute)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataContext() {
		return dataContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataContext_Expression() {
		return (EAttribute)dataContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Children() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFragment() {
		return fragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustom() {
		return customEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustom_Kind() {
		return (EAttribute)customEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInclude_Component() {
		return (EReference)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInclude_Arguments() {
		return (EReference)includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStack() {
		return stackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStack_Orientation() {
		return (EAttribute)stackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStack_Gap() {
		return (EAttribute)stackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrid() {
		return gridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrid_Columns() {
		return (EAttribute)gridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrid_Gap() {
		return (EAttribute)gridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTabs() {
		return tabsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTabs_Tabs() {
		return (EReference)tabsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTab_Text() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Content() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Source() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Alternative() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Text() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Location() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButton_Text() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButton_Command() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getButton_CommandFor() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Label() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Value() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Placeholder() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Required() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Disabled() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_ReadOnly() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextInput() {
		return textInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextInput_Kind() {
		return (EAttribute)textInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextArea_Rows() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckbox() {
		return checkboxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckbox_Checked() {
		return (EAttribute)checkboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOption_Text() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOption_Selected() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelect_Multiple() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_Options() {
		return (EReference)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRadioGroup() {
		return radioGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRadioGroup_Options() {
		return (EReference)radioGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlider() {
		return sliderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlider_Min() {
		return (EAttribute)sliderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlider_Max() {
		return (EAttribute)sliderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlider_Step() {
		return (EAttribute)sliderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateInput() {
		return dateInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateInput_Kind() {
		return (EAttribute)dateInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileInput() {
		return fileInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileInput_Accept() {
		return (EAttribute)fileInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileInput_Multiple() {
		return (EAttribute)fileInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUiDomain() {
		return uiDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUiDomain_Components() {
		return (EReference)uiDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUiDomain_Elements() {
		return (EReference)uiDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBindingMode() {
		return bindingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTextKind() {
		return textKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateKind() {
		return dateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UiFactory getUiFactory() {
		return (UiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEAttribute(elementEClass, ELEMENT__STYLE_CLASSES);
		createEAttribute(elementEClass, ELEMENT__STYLE);
		createEReference(elementEClass, ELEMENT__BINDINGS);

		bindingEClass = createEClass(BINDING);

		valueBindingEClass = createEClass(VALUE_BINDING);
		createEAttribute(valueBindingEClass, VALUE_BINDING__TARGET);
		createEAttribute(valueBindingEClass, VALUE_BINDING__EXPRESSION);
		createEAttribute(valueBindingEClass, VALUE_BINDING__MODE);

		eventBindingEClass = createEClass(EVENT_BINDING);
		createEAttribute(eventBindingEClass, EVENT_BINDING__EVENT);
		createEAttribute(eventBindingEClass, EVENT_BINDING__HANDLER);

		iteratorEClass = createEClass(ITERATOR);
		createEAttribute(iteratorEClass, ITERATOR__ITEMS);
		createEAttribute(iteratorEClass, ITERATOR__VARIABLE);
		createEAttribute(iteratorEClass, ITERATOR__KEY);

		conditionalEClass = createEClass(CONDITIONAL);
		createEAttribute(conditionalEClass, CONDITIONAL__CONDITION);

		dataContextEClass = createEClass(DATA_CONTEXT);
		createEAttribute(dataContextEClass, DATA_CONTEXT__EXPRESSION);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CHILDREN);

		fragmentEClass = createEClass(FRAGMENT);

		customEClass = createEClass(CUSTOM);
		createEAttribute(customEClass, CUSTOM__KIND);

		slotEClass = createEClass(SLOT);

		componentEClass = createEClass(COMPONENT);

		includeEClass = createEClass(INCLUDE);
		createEReference(includeEClass, INCLUDE__COMPONENT);
		createEReference(includeEClass, INCLUDE__ARGUMENTS);

		layoutEClass = createEClass(LAYOUT);

		stackEClass = createEClass(STACK);
		createEAttribute(stackEClass, STACK__ORIENTATION);
		createEAttribute(stackEClass, STACK__GAP);

		gridEClass = createEClass(GRID);
		createEAttribute(gridEClass, GRID__COLUMNS);
		createEAttribute(gridEClass, GRID__GAP);

		tabsEClass = createEClass(TABS);
		createEReference(tabsEClass, TABS__TABS);

		tabEClass = createEClass(TAB);
		createEAttribute(tabEClass, TAB__TEXT);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__CONTENT);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__SOURCE);
		createEAttribute(imageEClass, IMAGE__ALTERNATIVE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__TEXT);
		createEAttribute(linkEClass, LINK__LOCATION);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__TEXT);
		createEAttribute(buttonEClass, BUTTON__COMMAND);
		createEReference(buttonEClass, BUTTON__COMMAND_FOR);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__LABEL);
		createEAttribute(inputEClass, INPUT__VALUE);
		createEAttribute(inputEClass, INPUT__PLACEHOLDER);
		createEAttribute(inputEClass, INPUT__REQUIRED);
		createEAttribute(inputEClass, INPUT__DISABLED);
		createEAttribute(inputEClass, INPUT__READ_ONLY);

		textInputEClass = createEClass(TEXT_INPUT);
		createEAttribute(textInputEClass, TEXT_INPUT__KIND);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__ROWS);

		checkboxEClass = createEClass(CHECKBOX);
		createEAttribute(checkboxEClass, CHECKBOX__CHECKED);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__VALUE);
		createEAttribute(optionEClass, OPTION__TEXT);
		createEAttribute(optionEClass, OPTION__SELECTED);

		selectEClass = createEClass(SELECT);
		createEAttribute(selectEClass, SELECT__MULTIPLE);
		createEReference(selectEClass, SELECT__OPTIONS);

		radioGroupEClass = createEClass(RADIO_GROUP);
		createEReference(radioGroupEClass, RADIO_GROUP__OPTIONS);

		sliderEClass = createEClass(SLIDER);
		createEAttribute(sliderEClass, SLIDER__MIN);
		createEAttribute(sliderEClass, SLIDER__MAX);
		createEAttribute(sliderEClass, SLIDER__STEP);

		dateInputEClass = createEClass(DATE_INPUT);
		createEAttribute(dateInputEClass, DATE_INPUT__KIND);

		fileInputEClass = createEClass(FILE_INPUT);
		createEAttribute(fileInputEClass, FILE_INPUT__ACCEPT);
		createEAttribute(fileInputEClass, FILE_INPUT__MULTIPLE);

		formEClass = createEClass(FORM);

		uiDomainEClass = createEClass(UI_DOMAIN);
		createEReference(uiDomainEClass, UI_DOMAIN__COMPONENTS);
		createEReference(uiDomainEClass, UI_DOMAIN__ELEMENTS);

		// Create enums
		bindingModeEEnum = createEEnum(BINDING_MODE);
		orientationEEnum = createEEnum(ORIENTATION);
		textKindEEnum = createEEnum(TEXT_KIND);
		dateKindEEnum = createEEnum(DATE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		WorkPackage theWorkPackage = (WorkPackage)EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI);
		GovernancePackage theGovernancePackage = (GovernancePackage)EPackage.Registry.INSTANCE.getEPackage(GovernancePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		elementEClass.getESuperTypes().add(theWorkPackage.getWorkable());
		elementEClass.getESuperTypes().add(theGovernancePackage.getGoverned());
		bindingEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		valueBindingEClass.getESuperTypes().add(this.getBinding());
		eventBindingEClass.getESuperTypes().add(this.getBinding());
		iteratorEClass.getESuperTypes().add(this.getBinding());
		conditionalEClass.getESuperTypes().add(this.getBinding());
		dataContextEClass.getESuperTypes().add(this.getBinding());
		containerEClass.getESuperTypes().add(this.getElement());
		fragmentEClass.getESuperTypes().add(this.getContainer());
		customEClass.getESuperTypes().add(this.getContainer());
		slotEClass.getESuperTypes().add(this.getElement());
		componentEClass.getESuperTypes().add(this.getContainer());
		includeEClass.getESuperTypes().add(this.getElement());
		layoutEClass.getESuperTypes().add(this.getContainer());
		stackEClass.getESuperTypes().add(this.getLayout());
		gridEClass.getESuperTypes().add(this.getLayout());
		tabsEClass.getESuperTypes().add(this.getElement());
		tabEClass.getESuperTypes().add(this.getContainer());
		textEClass.getESuperTypes().add(this.getElement());
		imageEClass.getESuperTypes().add(this.getElement());
		linkEClass.getESuperTypes().add(this.getElement());
		buttonEClass.getESuperTypes().add(this.getElement());
		inputEClass.getESuperTypes().add(this.getElement());
		textInputEClass.getESuperTypes().add(this.getInput());
		textAreaEClass.getESuperTypes().add(this.getInput());
		checkboxEClass.getESuperTypes().add(this.getInput());
		optionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		selectEClass.getESuperTypes().add(this.getInput());
		radioGroupEClass.getESuperTypes().add(this.getInput());
		sliderEClass.getESuperTypes().add(this.getInput());
		dateInputEClass.getESuperTypes().add(this.getInput());
		fileInputEClass.getESuperTypes().add(this.getInput());
		formEClass.getESuperTypes().add(this.getContainer());
		uiDomainEClass.getESuperTypes().add(theNxcorePackage.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Attributes(), theNxcorePackage.getStringToStringMapEntry(), null, "attributes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_StyleClasses(), theEcorePackage.getEString(), "styleClasses", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Style(), theEcorePackage.getEString(), "style", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueBindingEClass, ValueBinding.class, "ValueBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueBinding_Target(), theEcorePackage.getEString(), "target", null, 0, 1, ValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueBinding_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, ValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueBinding_Mode(), this.getBindingMode(), "mode", null, 0, 1, ValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventBindingEClass, EventBinding.class, "EventBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventBinding_Event(), theEcorePackage.getEString(), "event", null, 0, 1, EventBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventBinding_Handler(), theEcorePackage.getEString(), "handler", null, 0, 1, EventBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorEClass, Iterator.class, "Iterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIterator_Items(), theEcorePackage.getEString(), "items", null, 0, 1, Iterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterator_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, Iterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterator_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Iterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditional_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataContextEClass, DataContext.class, "DataContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataContext_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, DataContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.models.ui.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Children(), this.getElement(), null, "children", null, 0, -1, org.nasdanika.models.ui.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customEClass, Custom.class, "Custom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustom_Kind(), theEcorePackage.getEString(), "kind", null, 0, 1, Custom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclude_Component(), this.getComponent(), null, "component", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInclude_Arguments(), theNxcorePackage.getStringToStringMapEntry(), null, "arguments", null, 0, -1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStack_Orientation(), this.getOrientation(), "orientation", null, 0, 1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStack_Gap(), theEcorePackage.getEString(), "gap", null, 0, 1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridEClass, Grid.class, "Grid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrid_Columns(), theEcorePackage.getEIntegerObject(), "columns", null, 0, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrid_Gap(), theEcorePackage.getEString(), "gap", null, 0, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabsEClass, Tabs.class, "Tabs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabs_Tabs(), this.getTab(), null, "tabs", null, 0, -1, Tabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTab_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Source(), theEcorePackage.getEString(), "source", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Alternative(), theEcorePackage.getEString(), "alternative", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Location(), theEcorePackage.getEString(), "location", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Command(), theEcorePackage.getEString(), "command", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButton_CommandFor(), this.getElement(), null, "commandFor", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_ReadOnly(), theEcorePackage.getEBoolean(), "readOnly", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInput_Kind(), this.getTextKind(), "kind", null, 0, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_Rows(), theEcorePackage.getEIntegerObject(), "rows", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkboxEClass, Checkbox.class, "Checkbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckbox_Checked(), theEcorePackage.getEBoolean(), "checked", null, 0, 1, Checkbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Selected(), theEcorePackage.getEBoolean(), "selected", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelect_Multiple(), theEcorePackage.getEBoolean(), "multiple", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Options(), this.getOption(), null, "options", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioGroupEClass, RadioGroup.class, "RadioGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRadioGroup_Options(), this.getOption(), null, "options", null, 0, -1, RadioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliderEClass, Slider.class, "Slider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlider_Min(), theEcorePackage.getEDouble(), "min", null, 0, 1, Slider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlider_Max(), theEcorePackage.getEDouble(), "max", null, 0, 1, Slider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlider_Step(), theEcorePackage.getEDouble(), "step", null, 0, 1, Slider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateInputEClass, DateInput.class, "DateInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateInput_Kind(), this.getDateKind(), "kind", null, 0, 1, DateInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileInputEClass, FileInput.class, "FileInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileInput_Accept(), theEcorePackage.getEString(), "accept", null, 0, 1, FileInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileInput_Multiple(), theEcorePackage.getEBoolean(), "multiple", null, 0, 1, FileInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiDomainEClass, UiDomain.class, "UiDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiDomain_Components(), this.getComponent(), null, "components", null, 0, -1, UiDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiDomain_Elements(), this.getElement(), null, "elements", null, 0, -1, UiDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingModeEEnum, BindingMode.class, "BindingMode");
		addEEnumLiteral(bindingModeEEnum, BindingMode.ONE_WAY);
		addEEnumLiteral(bindingModeEEnum, BindingMode.TWO_WAY);
		addEEnumLiteral(bindingModeEEnum, BindingMode.ONE_TIME);

		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);

		initEEnum(textKindEEnum, TextKind.class, "TextKind");
		addEEnumLiteral(textKindEEnum, TextKind.TEXT);
		addEEnumLiteral(textKindEEnum, TextKind.PASSWORD);
		addEEnumLiteral(textKindEEnum, TextKind.EMAIL);
		addEEnumLiteral(textKindEEnum, TextKind.NUMBER);
		addEEnumLiteral(textKindEEnum, TextKind.TEL);
		addEEnumLiteral(textKindEEnum, TextKind.URL);
		addEEnumLiteral(textKindEEnum, TextKind.SEARCH);

		initEEnum(dateKindEEnum, DateKind.class, "DateKind");
		addEEnumLiteral(dateKindEEnum, DateKind.DATE);
		addEEnumLiteral(dateKindEEnum, DateKind.TIME);
		addEEnumLiteral(dateKindEEnum, DateKind.DATETIME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "documentation", "Base UI element. Attributes are rendered onto the target markup (unlike\nproperties, which are annotations). Aspect supertypes give every element\nwork and governance; lifecycle and roles pending classpath:\n\nabstract class Element extends ModelElement, Workable, GovernedElement,\n    org.nasdanika.models.lifecycle.Staged, org.nasdanika.models.role.Undergoer"
		   });
		addAnnotation
		  (getElement_Style(),
		   source,
		   new String[] {
			   "documentation", " Inline style."
		   });
		addAnnotation
		  (bindingModeEEnum,
		   source,
		   new String[] {
			   "documentation", " ---- Bindings ----"
		   });
		addAnnotation
		  (bindingEClass,
		   source,
		   new String[] {
			   "documentation", "Dialect-neutral binding. Expressions are strings interpreted or translated\nby a binding provider model (alpinejs: x-bind / x-on / x-for / x-if /\nx-model / x-data). The core defines the vocabulary, not the execution."
		   });
		addAnnotation
		  (valueBindingEClass,
		   source,
		   new String[] {
			   "documentation", " Binds a property or attribute of the element to an expression."
		   });
		addAnnotation
		  (getValueBinding_Target(),
		   source,
		   new String[] {
			   "documentation", " Property or attribute name, e.g. value, checked, class, src."
		   });
		addAnnotation
		  (eventBindingEClass,
		   source,
		   new String[] {
			   "documentation", " Binds an event to a handler expression."
		   });
		addAnnotation
		  (getEventBinding_Event(),
		   source,
		   new String[] {
			   "documentation", " Event name, e.g. click, input, submit."
		   });
		addAnnotation
		  (iteratorEClass,
		   source,
		   new String[] {
			   "documentation", " Structural binding: repeats the owning element (typically a Fragment) per item."
		   });
		addAnnotation
		  (getIterator_Items(),
		   source,
		   new String[] {
			   "documentation", " Expression producing the items."
		   });
		addAnnotation
		  (getIterator_Variable(),
		   source,
		   new String[] {
			   "documentation", " Loop variable name."
		   });
		addAnnotation
		  (getIterator_Key(),
		   source,
		   new String[] {
			   "documentation", " Identity expression for keyed updates."
		   });
		addAnnotation
		  (conditionalEClass,
		   source,
		   new String[] {
			   "documentation", " Structural binding: the owning element is present when the condition holds."
		   });
		addAnnotation
		  (dataContextEClass,
		   source,
		   new String[] {
			   "documentation", " Establishes a data scope on the owning element, e.g. Alpine x-data."
		   });
		addAnnotation
		  (getDataContext_Expression(),
		   source,
		   new String[] {
			   "documentation", " Initial data, e.g. a JSON object expression."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Structure ----"
		   });
		addAnnotation
		  (fragmentEClass,
		   source,
		   new String[] {
			   "documentation", "Virtual element: renders nothing of its own, groups children and hosts\nstructural bindings (Iterator, Conditional). The template element of the\nmodel."
		   });
		addAnnotation
		  (customEClass,
		   source,
		   new String[] {
			   "documentation", "Extension point: an element with a unique kind. Maps to a web-components\ncustom element name; at generation time the kind participates in\ncapability-framework service resolution, so new element kinds are added\nby registering capabilities, not by changing the metamodel."
		   });
		addAnnotation
		  (slotEClass,
		   source,
		   new String[] {
			   "documentation", " Content projection point within a Component or Custom, addressed by name."
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
			   "documentation", " Reusable definition: a named tree with an optional data scope, used via Include."
		   });
		addAnnotation
		  (includeEClass,
		   source,
		   new String[] {
			   "documentation", " Uses a Component, locally defined or federated from another published model."
		   });
		addAnnotation
		  (getInclude_Arguments(),
		   source,
		   new String[] {
			   "documentation", " Arguments to the component\'s data scope."
		   });
		addAnnotation
		  (layoutEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Layouts ----"
		   });
		addAnnotation
		  (getTab_Text(),
		   source,
		   new String[] {
			   "documentation", " Tab label; name is the identity."
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Controls ----"
		   });
		addAnnotation
		  (buttonEClass,
		   source,
		   new String[] {
			   "documentation", "Button with optional declarative command per the OpenUI Invoker Commands\ndirection: command names an action, commandFor targets the element it\noperates on (show a modal, toggle a popover)."
		   });
		addAnnotation
		  (selectEClass,
		   source,
		   new String[] {
			   "documentation", " Informed by OpenUI customizable select."
		   });
		addAnnotation
		  (getFileInput_Accept(),
		   source,
		   new String[] {
			   "documentation", " Accepted types, e.g. image/*, .pdf."
		   });
		addAnnotation
		  (formEClass,
		   source,
		   new String[] {
			   "documentation", " Groups inputs; submission wiring via EventBinding or the target framework."
		   });
		addAnnotation
		  (uiDomainEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Root ----"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //UiPackageImpl
