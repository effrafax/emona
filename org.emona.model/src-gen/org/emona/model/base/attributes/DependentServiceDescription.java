/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.emona.model.base.ReferenceAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Service Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.DependentServiceDescription#getReference <em>Reference</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.DependentServiceDescription#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getDependentServiceDescription()
 * @model
 * @generated
 */
public interface DependentServiceDescription extends ReferenceAttribute {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ServiceDescription)
	 * @see org.emona.model.base.attributes.AttributesPackage#getDependentServiceDescription_Reference()
	 * @model
	 * @generated
	 */
	ServiceDescription getReference();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.DependentServiceDescription#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ServiceDescription value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"dependent_service_description"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see org.emona.model.base.attributes.AttributesPackage#getDependentServiceDescription_Token()
	 * @model default="dependent_service_description" changeable="false"
	 * @generated
	 */
	String getToken();

} // DependentServiceDescription
