/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.ServiceState#isOk <em>Ok</em>}</li>
 *   <li>{@link org.emona.model.base.ServiceState#isWarning <em>Warning</em>}</li>
 *   <li>{@link org.emona.model.base.ServiceState#isCritical <em>Critical</em>}</li>
 *   <li>{@link org.emona.model.base.ServiceState#isUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getServiceState()
 * @model
 * @generated
 */
public interface ServiceState extends EObject {
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
	 * @see org.emona.model.base.BasePackage#getServiceState_Ok()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOk();

	/**
	 * Sets the value of the '{@link org.emona.model.base.ServiceState#isOk <em>Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ok</em>' attribute.
	 * @see #isOk()
	 * @generated
	 */
	void setOk(boolean value);

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning</em>' attribute.
	 * @see #setWarning(boolean)
	 * @see org.emona.model.base.BasePackage#getServiceState_Warning()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isWarning();

	/**
	 * Sets the value of the '{@link org.emona.model.base.ServiceState#isWarning <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' attribute.
	 * @see #isWarning()
	 * @generated
	 */
	void setWarning(boolean value);

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #setCritical(boolean)
	 * @see org.emona.model.base.BasePackage#getServiceState_Critical()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCritical();

	/**
	 * Sets the value of the '{@link org.emona.model.base.ServiceState#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isCritical()
	 * @generated
	 */
	void setCritical(boolean value);

	/**
	 * Returns the value of the '<em><b>Unknown</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown</em>' attribute.
	 * @see #setUnknown(boolean)
	 * @see org.emona.model.base.BasePackage#getServiceState_Unknown()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnknown();

	/**
	 * Sets the value of the '{@link org.emona.model.base.ServiceState#isUnknown <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown</em>' attribute.
	 * @see #isUnknown()
	 * @generated
	 */
	void setUnknown(boolean value);

} // ServiceState
