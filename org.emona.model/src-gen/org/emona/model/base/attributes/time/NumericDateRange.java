/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Date Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.time.NumericDateRange#getStart <em>Start</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.NumericDateRange#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.time.TimePackage#getNumericDateRange()
 * @model
 * @generated
 */
public interface NumericDateRange extends DateSpec {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.emona.model.base.attributes.time.TimePackage#getNumericDateRange_Start()
	 * @model dataType="org.emona.model.base.Date" required="true"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.NumericDateRange#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.emona.model.base.attributes.time.TimePackage#getNumericDateRange_End()
	 * @model dataType="org.emona.model.base.Date"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.NumericDateRange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

} // NumericDateRange
