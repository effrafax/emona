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
 * A representation of the model object '<em><b>Two DCoords</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.TwoDCoords#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.TwoDCoords#getXcoord <em>Xcoord</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.TwoDCoords#getYcoord <em>Ycoord</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emona.model.base.attributes.AttributesPackage#getTwoDCoords()
 * @model
 * @generated
 */
public interface TwoDCoords extends Attribute {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"2d_coords"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see org.emona.model.base.attributes.AttributesPackage#getTwoDCoords_Token()
	 * @model default="2d_coords" changeable="false"
	 * @generated
	 */
	String getToken();

	/**
	 * Returns the value of the '<em><b>Xcoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xcoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xcoord</em>' attribute.
	 * @see #setXcoord(int)
	 * @see org.emona.model.base.attributes.AttributesPackage#getTwoDCoords_Xcoord()
	 * @model required="true"
	 * @generated
	 */
	int getXcoord();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.TwoDCoords#getXcoord <em>Xcoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xcoord</em>' attribute.
	 * @see #getXcoord()
	 * @generated
	 */
	void setXcoord(int value);

	/**
	 * Returns the value of the '<em><b>Ycoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ycoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ycoord</em>' attribute.
	 * @see #setYcoord(int)
	 * @see org.emona.model.base.attributes.AttributesPackage#getTwoDCoords_Ycoord()
	 * @model required="true"
	 * @generated
	 */
	int getYcoord();

	/**
	 * Sets the value of the '{@link org.emona.model.base.attributes.TwoDCoords#getYcoord <em>Ycoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ycoord</em>' attribute.
	 * @see #getYcoord()
	 * @generated
	 */
	void setYcoord(int value);

} // TwoDCoords
