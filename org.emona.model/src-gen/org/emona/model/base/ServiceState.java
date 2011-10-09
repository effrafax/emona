/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.ServiceState#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getServiceState()
 * @model
 * @generated
 */
public interface ServiceState extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute list.
	 * The list contents are of type {@link org.emona.model.base.ServiceStateValue}.
	 * The literals are from the enumeration {@link org.emona.model.base.ServiceStateValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute list.
	 * @see org.emona.model.base.ServiceStateValue
	 * @see org.emona.model.base.BasePackage#getServiceState_State()
	 * @model
	 * @generated
	 */
	EList<ServiceStateValue> getState();

} // ServiceState
