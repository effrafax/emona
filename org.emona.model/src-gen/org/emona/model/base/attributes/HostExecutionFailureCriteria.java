/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.emona.model.base.Attribute;
import org.emona.model.base.HostFailureCriteria;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Execution Failure Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.HostExecutionFailureCriteria#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getHostExecutionFailureCriteria()
 * @model
 * @generated
 */
public interface HostExecutionFailureCriteria extends Attribute,
		HostFailureCriteria {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"execution_failure_criteria"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see org.emona.model.base.attributes.AttributesPackage#getHostExecutionFailureCriteria_Token()
	 * @model default="execution_failure_criteria" changeable="false"
	 * @generated
	 */
	String getToken();

} // HostExecutionFailureCriteria
