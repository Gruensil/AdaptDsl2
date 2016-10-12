/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.adaptdsl.adaptDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.adaptdsl.adaptDsl.*;

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
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage
 * @generated
 */
public class AdaptDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdaptDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AdaptDslPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AdaptDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.SERVICE_LIST:
      {
        ServiceList serviceList = (ServiceList)theEObject;
        T result = caseServiceList(serviceList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.FUNCTION_LIST:
      {
        FunctionList functionList = (FunctionList)theEObject;
        T result = caseFunctionList(functionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.ADAPTATION_RULE:
      {
        AdaptationRule adaptationRule = (AdaptationRule)theEObject;
        T result = caseAdaptationRule(adaptationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CONDITIONAL_OR_EXPRESSION:
      {
        ConditionalOrExpression conditionalOrExpression = (ConditionalOrExpression)theEObject;
        T result = caseConditionalOrExpression(conditionalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CONDITIONAL_AND_EXPRESSION:
      {
        ConditionalAndExpression conditionalAndExpression = (ConditionalAndExpression)theEObject;
        T result = caseConditionalAndExpression(conditionalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CONDITIONAL_PRIMARY:
      {
        ConditionalPrimary conditionalPrimary = (ConditionalPrimary)theEObject;
        T result = caseConditionalPrimary(conditionalPrimary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.BOOLEAN_CONDITION:
      {
        BooleanCondition booleanCondition = (BooleanCondition)theEObject;
        T result = caseBooleanCondition(booleanCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.NUMBER_CONDITION:
      {
        NumberCondition numberCondition = (NumberCondition)theEObject;
        T result = caseNumberCondition(numberCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.STRING_CONDITION:
      {
        StringCondition stringCondition = (StringCondition)theEObject;
        T result = caseStringCondition(stringCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.ACTIONS:
      {
        Actions actions = (Actions)theEObject;
        T result = caseActions(actions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.ACTION_CATEGORY:
      {
        ActionCategory actionCategory = (ActionCategory)theEObject;
        T result = caseActionCategory(actionCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.PARENT_OPERATION:
      {
        ParentOperation parentOperation = (ParentOperation)theEObject;
        T result = caseParentOperation(parentOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.SERVICE_FUNCTION_CALL_OPERATION:
      {
        ServiceFunctionCallOperation serviceFunctionCallOperation = (ServiceFunctionCallOperation)theEObject;
        T result = caseServiceFunctionCallOperation(serviceFunctionCallOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.EDIT_FACT_OPERATION:
      {
        EditFactOperation editFactOperation = (EditFactOperation)theEObject;
        T result = caseEditFactOperation(editFactOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.SET_DISPLAY_PROPERTY_OPERATION:
      {
        SetDisplayPropertyOperation setDisplayPropertyOperation = (SetDisplayPropertyOperation)theEObject;
        T result = caseSetDisplayPropertyOperation(setDisplayPropertyOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.DISPLAY_PROPERTY_VALUE:
      {
        DisplayPropertyValue displayPropertyValue = (DisplayPropertyValue)theEObject;
        T result = caseDisplayPropertyValue(displayPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.BOOL_VALUE:
      {
        BoolValue boolValue = (BoolValue)theEObject;
        T result = caseBoolValue(boolValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.ADD_VIEW_COMPONENT_OPERATION:
      {
        AddViewComponentOperation addViewComponentOperation = (AddViewComponentOperation)theEObject;
        T result = caseAddViewComponentOperation(addViewComponentOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.DELETE_VIEW_COMPONENT_OPERATION:
      {
        DeleteViewComponentOperation deleteViewComponentOperation = (DeleteViewComponentOperation)theEObject;
        T result = caseDeleteViewComponentOperation(deleteViewComponentOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.ADD_NAV_LINK_OPERATION:
      {
        AddNavLinkOperation addNavLinkOperation = (AddNavLinkOperation)theEObject;
        T result = caseAddNavLinkOperation(addNavLinkOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.DELETE_NAV_LINK_OPERATION:
      {
        DeleteNavLinkOperation deleteNavLinkOperation = (DeleteNavLinkOperation)theEObject;
        T result = caseDeleteNavLinkOperation(deleteNavLinkOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.REDIRECT_NAV_LINK_OPERATION:
      {
        RedirectNavLinkOperation redirectNavLinkOperation = (RedirectNavLinkOperation)theEObject;
        T result = caseRedirectNavLinkOperation(redirectNavLinkOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CLEAR_NAV_OPERATION:
      {
        ClearNavOperation clearNavOperation = (ClearNavOperation)theEObject;
        T result = caseClearNavOperation(clearNavOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CHANGE_FONT_SIZE_OPERATION:
      {
        ChangeFontSizeOperation changeFontSizeOperation = (ChangeFontSizeOperation)theEObject;
        T result = caseChangeFontSizeOperation(changeFontSizeOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CHANGE_COLOR_SCHEME_OPERATION:
      {
        ChangeColorSchemeOperation changeColorSchemeOperation = (ChangeColorSchemeOperation)theEObject;
        T result = caseChangeColorSchemeOperation(changeColorSchemeOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CHANGE_FONT_OPERATION:
      {
        ChangeFontOperation changeFontOperation = (ChangeFontOperation)theEObject;
        T result = caseChangeFontOperation(changeFontOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.CHANGE_TABLE_CSS_CLASS_OPERATION:
      {
        ChangeTableCssClassOperation changeTableCssClassOperation = (ChangeTableCssClassOperation)theEObject;
        T result = caseChangeTableCssClassOperation(changeTableCssClassOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptDslPackage.ADAPT_CSS_CLASS_OPERATION:
      {
        AdaptCssClassOperation adaptCssClassOperation = (AdaptCssClassOperation)theEObject;
        T result = caseAdaptCssClassOperation(adaptCssClassOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceList(ServiceList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionList(FunctionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adaptation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adaptation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdaptationRule(AdaptationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalOrExpression(ConditionalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalAndExpression(ConditionalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalPrimary(ConditionalPrimary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanCondition(BooleanCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberCondition(NumberCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringCondition(StringCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActions(Actions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionCategory(ActionCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParentOperation(ParentOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Function Call Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Function Call Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceFunctionCallOperation(ServiceFunctionCallOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edit Fact Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edit Fact Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditFactOperation(EditFactOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Display Property Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Display Property Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetDisplayPropertyOperation(SetDisplayPropertyOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Display Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Display Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisplayPropertyValue(DisplayPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolValue(BoolValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add View Component Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add View Component Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddViewComponentOperation(AddViewComponentOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete View Component Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete View Component Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteViewComponentOperation(DeleteViewComponentOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Nav Link Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Nav Link Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddNavLinkOperation(AddNavLinkOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Nav Link Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Nav Link Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteNavLinkOperation(DeleteNavLinkOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Redirect Nav Link Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Redirect Nav Link Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRedirectNavLinkOperation(RedirectNavLinkOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clear Nav Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Nav Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClearNavOperation(ClearNavOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Font Size Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Font Size Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeFontSizeOperation(ChangeFontSizeOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Color Scheme Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Color Scheme Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeColorSchemeOperation(ChangeColorSchemeOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Font Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Font Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeFontOperation(ChangeFontOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Table Css Class Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Table Css Class Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeTableCssClassOperation(ChangeTableCssClassOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adapt Css Class Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adapt Css Class Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdaptCssClassOperation(AdaptCssClassOperation object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AdaptDslSwitch
