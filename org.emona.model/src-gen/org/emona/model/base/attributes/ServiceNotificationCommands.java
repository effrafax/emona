/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.eclipse.emf.common.util.EList;
import org.emona.model.base.ReferenceAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Notification Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.ServiceNotificationCommands#getReference <em>Reference</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.ServiceNotificationCommands#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getServiceNotificationCommands()
 * @model
 * @generated
 */
public interface ServiceNotificationCommands extends ReferenceAttribute {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link org.emona.model.base.attributes.CommandName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceNotificationCommands_Reference()
	 * @model
	 * @generated
	 */
	EList<CommandName> getReference();

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"service_notification_commands"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceNotificationCommands_Token()
	 * @model default="service_notification_commands"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.ServiceNotificationCommands#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // ServiceNotificationCommands
