/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.TwoDCoords;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two DCoords</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.TwoDCoordsImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.TwoDCoordsImpl#isMultiline <em>Multiline</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.TwoDCoordsImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.TwoDCoordsImpl#getXcoord <em>Xcoord</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.TwoDCoordsImpl#getYcoord <em>Ycoord</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwoDCoordsImpl extends EObjectImpl implements TwoDCoords {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiline() <em>Multiline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTILINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiline() <em>Multiline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiline()
	 * @generated
	 * @ordered
	 */
	protected boolean multiline = MULTILINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "2d_coords";

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getXcoord() <em>Xcoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXcoord()
	 * @generated
	 * @ordered
	 */
	protected static final int XCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXcoord() <em>Xcoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXcoord()
	 * @generated
	 * @ordered
	 */
	protected int xcoord = XCOORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getYcoord() <em>Ycoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYcoord()
	 * @generated
	 * @ordered
	 */
	protected static final int YCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYcoord() <em>Ycoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYcoord()
	 * @generated
	 * @ordered
	 */
	protected int ycoord = YCOORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwoDCoordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.TWO_DCOORDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.TWO_DCOORDS__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiline() {
		return multiline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiline(boolean newMultiline) {
		boolean oldMultiline = multiline;
		multiline = newMultiline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.TWO_DCOORDS__MULTILINE, oldMultiline,
					multiline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXcoord() {
		return xcoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXcoord(int newXcoord) {
		int oldXcoord = xcoord;
		xcoord = newXcoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.TWO_DCOORDS__XCOORD, oldXcoord, xcoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYcoord() {
		return ycoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYcoord(int newYcoord) {
		int oldYcoord = ycoord;
		ycoord = newYcoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.TWO_DCOORDS__YCOORD, oldYcoord, ycoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributesPackage.TWO_DCOORDS__COMMENT:
			return getComment();
		case AttributesPackage.TWO_DCOORDS__MULTILINE:
			return isMultiline();
		case AttributesPackage.TWO_DCOORDS__TOKEN:
			return getToken();
		case AttributesPackage.TWO_DCOORDS__XCOORD:
			return getXcoord();
		case AttributesPackage.TWO_DCOORDS__YCOORD:
			return getYcoord();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AttributesPackage.TWO_DCOORDS__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.TWO_DCOORDS__MULTILINE:
			setMultiline((Boolean) newValue);
			return;
		case AttributesPackage.TWO_DCOORDS__XCOORD:
			setXcoord((Integer) newValue);
			return;
		case AttributesPackage.TWO_DCOORDS__YCOORD:
			setYcoord((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AttributesPackage.TWO_DCOORDS__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.TWO_DCOORDS__MULTILINE:
			setMultiline(MULTILINE_EDEFAULT);
			return;
		case AttributesPackage.TWO_DCOORDS__XCOORD:
			setXcoord(XCOORD_EDEFAULT);
			return;
		case AttributesPackage.TWO_DCOORDS__YCOORD:
			setYcoord(YCOORD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AttributesPackage.TWO_DCOORDS__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.TWO_DCOORDS__MULTILINE:
			return multiline != MULTILINE_EDEFAULT;
		case AttributesPackage.TWO_DCOORDS__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT
					.equals(token);
		case AttributesPackage.TWO_DCOORDS__XCOORD:
			return xcoord != XCOORD_EDEFAULT;
		case AttributesPackage.TWO_DCOORDS__YCOORD:
			return ycoord != YCOORD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(", multiline: ");
		result.append(multiline);
		result.append(", token: ");
		result.append(token);
		result.append(", xcoord: ");
		result.append(xcoord);
		result.append(", ycoord: ");
		result.append(ycoord);
		result.append(')');
		return result.toString();
	}

} //TwoDCoordsImpl
