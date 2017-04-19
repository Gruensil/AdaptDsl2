/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.Property#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.Property#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.Property#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' attribute.
   * @see #setPropertyName(String)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getProperty_PropertyName()
   * @model
   * @generated
   */
  String getPropertyName();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.Property#getPropertyName <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' attribute.
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TYPE)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  TYPE getType();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TYPE value);

  /**
   * Returns the value of the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' reference.
   * @see #setProvider(Provider)
   * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage#getProperty_Provider()
   * @model
   * @generated
   */
  Provider getProvider();

  /**
   * Sets the value of the '{@link org.xtext.example.adaptdsl.adaptDsl.Property#getProvider <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(Provider value);

} // Property
