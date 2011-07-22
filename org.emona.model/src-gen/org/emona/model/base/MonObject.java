/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mon Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.MonObject#getName <em>Name</em>}</li>
 *   <li>{@link org.emona.model.base.MonObject#getUse <em>Use</em>}</li>
 *   <li>{@link org.emona.model.base.MonObject#isRegister <em>Register</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getMonObject()
 * @model
 * @generated
 */
public interface MonObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emona.model.base.BasePackage#getMonObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emona.model.base.MonObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference.
	 * @see #setUse(MonObject)
	 * @see org.emona.model.base.BasePackage#getMonObject_Use()
	 * @model
	 * @generated
	 */
	MonObject getUse();

	/**
	 * Sets the value of the '{@link org.emona.model.base.MonObject#getUse <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(MonObject value);

	/**
	 * Returns the value of the '<em><b>Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' attribute.
	 * @see #setRegister(boolean)
	 * @see org.emona.model.base.BasePackage#getMonObject_Register()
	 * @model
	 * @generated
	 */
	boolean isRegister();

	/**
	 * Sets the value of the '{@link org.emona.model.base.MonObject#isRegister <em>Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' attribute.
	 * @see #isRegister()
	 * @generated
	 */
	void setRegister(boolean value);

} // MonObject
