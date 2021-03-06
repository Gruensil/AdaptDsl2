/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.ConditionalOrExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.ConditionalOrExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getConditionalOrExpression()
 * @model
 * @generated
 */
public interface ConditionalOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ConditionalAndExpression)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getConditionalOrExpression_Left()
   * @model containment="true"
   * @generated
   */
  ConditionalAndExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.ConditionalOrExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ConditionalAndExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ConditionalOrExpression)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getConditionalOrExpression_Right()
   * @model containment="true"
   * @generated
   */
  ConditionalOrExpression getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.ConditionalOrExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ConditionalOrExpression value);

} // ConditionalOrExpression
