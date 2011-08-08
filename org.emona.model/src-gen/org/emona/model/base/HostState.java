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
 * A representation of the model object '<em><b>Host State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.HostState#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getHostState()
 * @model
 * @generated
 */
public interface HostState extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute list.
	 * The list contents are of type {@link org.emona.model.base.HostStateValue}.
	 * The literals are from the enumeration {@link org.emona.model.base.HostStateValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute list.
	 * @see org.emona.model.base.HostStateValue
	 * @see org.emona.model.base.BasePackage#getHostState_State()
	 * @model
	 * @generated
	 */
	EList<HostStateValue> getState();

} // HostState
