/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.time.DateSpec#getDivisor <em>Divisor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.time.TimePackage#getDateSpec()
 * @model
 * @generated
 */
public interface DateSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divisor</em>' attribute.
	 * @see #setDivisor(int)
	 * @see org.emona.model.base.attributes.time.TimePackage#getDateSpec_Divisor()
	 * @model
	 * @generated
	 */
	int getDivisor();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.time.DateSpec#getDivisor <em>Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divisor</em>' attribute.
	 * @see #getDivisor()
	 * @generated
	 */
	void setDivisor(int value);

} // DateSpec
