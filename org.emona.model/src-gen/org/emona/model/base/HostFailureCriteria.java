/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Failure Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.HostFailureCriteria#isPending <em>Pending</em>}</li>
 *   <li>{@link org.emona.model.base.HostFailureCriteria#isNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getHostFailureCriteria()
 * @model
 * @generated
 */
public interface HostFailureCriteria extends HostState {
	/**
	 * Returns the value of the '<em><b>Pending</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending</em>' attribute.
	 * @see #setPending(boolean)
	 * @see org.emona.model.base.BasePackage#getHostFailureCriteria_Pending()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isPending();

	/**
	 * Sets the value of the '{@link org.emona.model.base.HostFailureCriteria#isPending <em>Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending</em>' attribute.
	 * @see #isPending()
	 * @generated
	 */
	void setPending(boolean value);

	/**
	 * Returns the value of the '<em><b>None</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>None</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None</em>' attribute.
	 * @see #setNone(boolean)
	 * @see org.emona.model.base.BasePackage#getHostFailureCriteria_None()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNone();

	/**
	 * Sets the value of the '{@link org.emona.model.base.HostFailureCriteria#isNone <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>None</em>' attribute.
	 * @see #isNone()
	 * @generated
	 */
	void setNone(boolean value);

} // HostFailureCriteria
