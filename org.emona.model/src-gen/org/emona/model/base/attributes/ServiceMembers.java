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
 * A representation of the model object '<em><b>Service Members</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.ServiceMembers#getReference <em>Reference</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.ServiceMembers#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getServiceMembers()
 * @model
 * @generated
 */
public interface ServiceMembers extends ReferenceAttribute {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link org.emona.model.base.attributes.ServiceDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceMembers_Reference()
	 * @model
	 * @generated
	 */
	EList<ServiceDescription> getReference();

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"members"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.emona.model.base.attributes.AttributesPackage#getServiceMembers_Token()
	 * @model default="members"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.ServiceMembers#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // ServiceMembers
