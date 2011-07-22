/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time;

import org.eclipse.emf.common.util.EList;
import org.emona.model.base.Attribute;
import org.emona.model.types.TimeRange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.time.TimeDefinition#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.TimeDefinition#getDays <em>Days</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.TimeDefinition#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.time.TimePackage#getTimeDefinition()
 * @model
 * @generated
 */
public interface TimeDefinition extends Attribute {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"HH:MM"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see org.emona.model.base.attributes.time.TimePackage#getTimeDefinition_Token()
	 * @model default="HH:MM" changeable="false"
	 * @generated
	 */
	String getToken();

	/**
	 * Returns the value of the '<em><b>Days</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' containment reference.
	 * @see #setDays(DateSpec)
	 * @see org.emona.model.base.attributes.time.TimePackage#getTimeDefinition_Days()
	 * @model containment="true"
	 * @generated
	 */
	DateSpec getDays();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.TimeDefinition#getDays <em>Days</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days</em>' containment reference.
	 * @see #getDays()
	 * @generated
	 */
	void setDays(DateSpec value);

	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' attribute list.
	 * The list contents are of type {@link org.emona.model.types.TimeRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranges</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' attribute list.
	 * @see org.emona.model.base.attributes.time.TimePackage#getTimeDefinition_Ranges()
	 * @model dataType="org.emona.model.base.TimeRange"
	 * @generated
	 */
	EList<TimeRange> getRanges();

} // TimeDefinition
