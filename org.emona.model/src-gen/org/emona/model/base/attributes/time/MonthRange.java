/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Month Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.time.MonthRange#getStart <em>Start</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.MonthRange#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.time.TimePackage#getMonthRange()
 * @model
 * @generated
 */
public interface MonthRange extends DateSpec {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(MonthSpec)
	 * @see org.emona.model.base.attributes.time.TimePackage#getMonthRange_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MonthSpec getStart();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.MonthRange#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(MonthSpec value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(MonthSpec)
	 * @see org.emona.model.base.attributes.time.TimePackage#getMonthRange_End()
	 * @model containment="true"
	 * @generated
	 */
	MonthSpec getEnd();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.MonthRange#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(MonthSpec value);

} // MonthRange
