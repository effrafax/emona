/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.emona.model.base.Attribute;
import org.emona.model.base.ServiceState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Escalation Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.ServiceEscalationOptions#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getServiceEscalationOptions()
 * @model
 * @generated
 */
public interface ServiceEscalationOptions extends Attribute, ServiceState {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"escalation_options"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceEscalationOptions_Token()
	 * @model default="escalation_options"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.ServiceEscalationOptions#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // ServiceEscalationOptions
