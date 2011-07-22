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
 * A representation of the model object '<em><b>Service Notification Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.ServiceNotificationOption#isFlapping <em>Flapping</em>}</li>
 *   <li>{@link org.emona.model.base.ServiceNotificationOption#isNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getServiceNotificationOption()
 * @model
 * @generated
 */
public interface ServiceNotificationOption extends ServiceState {
	/**
	 * Returns the value of the '<em><b>Flapping</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flapping</em>' attribute.
	 * @see #setFlapping(boolean)
	 * @see org.emona.model.base.BasePackage#getServiceNotificationOption_Flapping()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFlapping();

	/**
	 * Sets the value of the '{@link org.emona.model.base.ServiceNotificationOption#isFlapping <em>Flapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flapping</em>' attribute.
	 * @see #isFlapping()
	 * @generated
	 */
	void setFlapping(boolean value);

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
	 * @see org.emona.model.base.BasePackage#getServiceNotificationOption_None()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNone();

	/**
	 * Sets the value of the '{@link org.emona.model.base.ServiceNotificationOption#isNone <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>None</em>' attribute.
	 * @see #isNone()
	 * @generated
	 */
	void setNone(boolean value);

} // ServiceNotificationOption
