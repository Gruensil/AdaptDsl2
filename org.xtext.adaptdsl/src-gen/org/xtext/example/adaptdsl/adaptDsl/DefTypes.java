/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.DefTypes#getThis <em>This</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.DefTypes#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getDefTypes()
 * @model
 * @generated
 */
public interface DefTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>This</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>This</em>' containment reference.
   * @see #setThis(DefType)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getDefTypes_This()
   * @model containment="true"
   * @generated
   */
  DefType getThis();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.DefTypes#getThis <em>This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>This</em>' containment reference.
   * @see #getThis()
   * @generated
   */
  void setThis(DefType value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(DefTypes)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getDefTypes_Next()
   * @model containment="true"
   * @generated
   */
  DefTypes getNext();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.DefTypes#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(DefTypes value);

} // DefTypes
