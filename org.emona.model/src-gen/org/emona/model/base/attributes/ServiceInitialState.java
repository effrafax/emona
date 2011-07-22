/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.emona.model.base.Attribute;
import org.emona.model.base.ServiceStateValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Initial State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.ServiceInitialState#getValue <em>Value</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.ServiceInitialState#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.ServiceInitialState#isOk <em>Ok</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getServiceInitialState()
 * @model
 * @generated
 */
public interface ServiceInitialState extends Attribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emona.model.base.ServiceStateValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.emona.model.base.ServiceStateValue
	 * @see #setValue(ServiceStateValue)
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceInitialState_Value()
	 * @model
	 * @generated
	 */
	ServiceStateValue getValue();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.ServiceInitialState#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.emona.model.base.ServiceStateValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ServiceStateValue value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"inital_state"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceInitialState_Token()
	 * @model default="inital_state" changeable="false"
	 * @generated
	 */
	String getToken();

	/**
	 * Returns the value of the '<em><b>Ok</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ok</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ok</em>' attribute.
	 * @see #setOk(boolean)
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceInitialState_Ok()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOk();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.ServiceInitialState#isOk <em>Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ok</em>' attribute.
	 * @see #isOk()
	 * @generated
	 */
	void setOk(boolean value);

} // ServiceInitialState
