/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time;

import org.eclipse.emf.ecore.EObject;

import org.emona.model.base.Month;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Month Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.time.MonthSpec#getMonth <em>Month</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.MonthSpec#getDay <em>Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.time.TimePackage#getMonthSpec()
 * @model
 * @generated
 */
public interface MonthSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emona.model.base.Month}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see org.emona.model.base.Month
	 * @see #setMonth(Month)
	 * @see org.emona.model.base.attributes.time.TimePackage#getMonthSpec_Month()
	 * @model
	 * @generated
	 */
	Month getMonth();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.MonthSpec#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see org.emona.model.base.Month
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(Month value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see org.emona.model.base.attributes.time.TimePackage#getMonthSpec_Day()
	 * @model
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.MonthSpec#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

} // MonthSpec
