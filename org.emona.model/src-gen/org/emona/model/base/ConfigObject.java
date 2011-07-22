/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.ConfigObject#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.BasePackage#getConfigObject()
 * @model
 * @generated
 */
public interface ConfigObject extends InfoObject {
	/**
	 * Returns the value of the '<em><b>Attr</b></em>' containment reference list.
	 * The list contents are of type {@link org.emona.model.base.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' containment reference list.
	 * @see org.emona.model.base.BasePackage#getConfigObject_Attr()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tokenRequired="true"
	 * @generated
	 */
	boolean hasAttribute(String token);

} // ConfigObject
