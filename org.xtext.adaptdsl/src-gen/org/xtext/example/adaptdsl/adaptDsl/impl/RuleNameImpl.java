/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.adaptdsl.adaptDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage;
import org.xtext.example.adaptdsl.adaptDsl.RuleName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.RuleNameImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleNameImpl extends adaptionRuleImpl implements RuleName
{
  /**
   * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected static final String RULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected String rule = RULE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleNameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdaptDslPackage.Literals.RULE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(String newRule)
  {
    String oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.RULE_NAME__RULE, oldRule, rule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdaptDslPackage.RULE_NAME__RULE:
        return getRule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdaptDslPackage.RULE_NAME__RULE:
        setRule((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdaptDslPackage.RULE_NAME__RULE:
        setRule(RULE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdaptDslPackage.RULE_NAME__RULE:
        return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (rule: ");
    result.append(rule);
    result.append(')');
    return result.toString();
  }

} //RuleNameImpl