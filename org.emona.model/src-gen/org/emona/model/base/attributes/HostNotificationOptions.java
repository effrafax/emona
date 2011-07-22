/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.emona.model.base.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Notification Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.HostNotificationOptions#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.HostNotificationOptions#isRecovery <em>Recovery</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.HostNotificationOptions#isDown <em>Down</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.HostNotificationOptions#isUnreachable <em>Unreachable</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.HostNotificationOptions#isFlapping <em>Flapping</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.HostNotificationOptions#isScheduledDowntime <em>Scheduled Downtime</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.HostNotificationOptions#isNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions()
 * @model
 * @generated
 */
public interface HostNotificationOptions extends Attribute {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"host_notification_options"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions_Token()
	 * @model default="host_notification_options" changeable="false"
	 * @generated
	 */
	String getToken();

	/**
	 * Returns the value of the '<em><b>Recovery</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery</em>' attribute.
	 * @see #setRecovery(boolean)
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions_Recovery()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRecovery();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.HostNotificationOptions#isRecovery <em>Recovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery</em>' attribute.
	 * @see #isRecovery()
	 * @generated
	 */
	void setRecovery(boolean value);

	/**
	 * Returns the value of the '<em><b>Down</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down</em>' attribute.
	 * @see #setDown(boolean)
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions_Down()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDown();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.HostNotificationOptions#isDown <em>Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down</em>' attribute.
	 * @see #isDown()
	 * @generated
	 */
	void setDown(boolean value);

	/**
	 * Returns the value of the '<em><b>Unreachable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreachable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreachable</em>' attribute.
	 * @see #setUnreachable(boolean)
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions_Unreachable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnreachable();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.HostNotificationOptions#isUnreachable <em>Unreachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unreachable</em>' attribute.
	 * @see #isUnreachable()
	 * @generated
	 */
	void setUnreachable(boolean value);

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
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions_Flapping()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFlapping();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.HostNotificationOptions#isFlapping <em>Flapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flapping</em>' attribute.
	 * @see #isFlapping()
	 * @generated
	 */
	void setFlapping(boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduled Downtime</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Downtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Downtime</em>' attribute.
	 * @see #setScheduledDowntime(boolean)
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions_ScheduledDowntime()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isScheduledDowntime();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.HostNotificationOptions#isScheduledDowntime <em>Scheduled Downtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Downtime</em>' attribute.
	 * @see #isScheduledDowntime()
	 * @generated
	 */
	void setScheduledDowntime(boolean value);

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
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostNotificationOptions_None()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNone();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.HostNotificationOptions#isNone <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>None</em>' attribute.
	 * @see #isNone()
	 * @generated
	 */
	void setNone(boolean value);

} // HostNotificationOptions
