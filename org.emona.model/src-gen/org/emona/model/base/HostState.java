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
 * A representation of the model object '<em><b>Host State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.HostState#isUp <em>Up</em>}</li>
 *   <li>{@link org.emona.model.base.HostState#isDown <em>Down</em>}</li>
 *   <li>{@link org.emona.model.base.HostState#isUnreachable <em>Unreachable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getHostState()
 * @model
 * @generated
 */
public interface HostState extends EObject {
	/**
	 * Returns the value of the '<em><b>Up</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up</em>' attribute.
	 * @see #setUp(boolean)
	 * @see org.emona.model.base.BasePackage#getHostState_Up()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUp();

	/**
	 * Sets the value of the '{@link org.emona.model.base.HostState#isUp <em>Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up</em>' attribute.
	 * @see #isUp()
	 * @generated
	 */
	void setUp(boolean value);

	/**
	 * Returns the value of the '<em><b>Down</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down</em>' attribute.
	 * @see #setDown(boolean)
	 * @see org.emona.model.base.BasePackage#getHostState_Down()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDown();

	/**
	 * Sets the value of the '{@link org.emona.model.base.HostState#isDown <em>Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down</em>' attribute.
	 * @see #isDown()
	 * @generated
	 */
	void setDown(boolean value);

	/**
	 * Returns the value of the '<em><b>Unreachable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreachable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreachable</em>' attribute.
	 * @see #setUnreachable(boolean)
	 * @see org.emona.model.base.BasePackage#getHostState_Unreachable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnreachable();

	/**
	 * Sets the value of the '{@link org.emona.model.base.HostState#isUnreachable <em>Unreachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unreachable</em>' attribute.
	 * @see #isUnreachable()
	 * @generated
	 */
	void setUnreachable(boolean value);

} // HostState
