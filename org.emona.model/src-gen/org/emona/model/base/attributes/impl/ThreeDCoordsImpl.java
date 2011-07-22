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

import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.ThreeDCoords;

import org.emona.model.base.impl.ValueAttributeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Three DCoords</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.ThreeDCoordsImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ThreeDCoordsImpl#getXcoord <em>Xcoord</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ThreeDCoordsImpl#getYcoord <em>Ycoord</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ThreeDCoordsImpl#getZcoord <em>Zcoord</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreeDCoordsImpl extends ValueAttributeImpl implements
		ThreeDCoords {
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "3d_coords";

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
	protected static final double XCOORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXcoord() <em>Xcoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXcoord()
	 * @generated
	 * @ordered
	 */
	protected double xcoord = XCOORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getYcoord() <em>Ycoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYcoord()
	 * @generated
	 * @ordered
	 */
	protected static final double YCOORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYcoord() <em>Ycoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYcoord()
	 * @generated
	 * @ordered
	 */
	protected double ycoord = YCOORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getZcoord() <em>Zcoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZcoord()
	 * @generated
	 * @ordered
	 */
	protected static final double ZCOORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZcoord() <em>Zcoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZcoord()
	 * @generated
	 * @ordered
	 */
	protected double zcoord = ZCOORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreeDCoordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.THREE_DCOORDS;
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
	public double getXcoord() {
		return xcoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXcoord(double newXcoord) {
		double oldXcoord = xcoord;
		xcoord = newXcoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.THREE_DCOORDS__XCOORD, oldXcoord, xcoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYcoord() {
		return ycoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYcoord(double newYcoord) {
		double oldYcoord = ycoord;
		ycoord = newYcoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.THREE_DCOORDS__YCOORD, oldYcoord, ycoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZcoord() {
		return zcoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZcoord(double newZcoord) {
		double oldZcoord = zcoord;
		zcoord = newZcoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.THREE_DCOORDS__ZCOORD, oldZcoord, zcoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributesPackage.THREE_DCOORDS__TOKEN:
			return getToken();
		case AttributesPackage.THREE_DCOORDS__XCOORD:
			return getXcoord();
		case AttributesPackage.THREE_DCOORDS__YCOORD:
			return getYcoord();
		case AttributesPackage.THREE_DCOORDS__ZCOORD:
			return getZcoord();
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
		case AttributesPackage.THREE_DCOORDS__XCOORD:
			setXcoord((Double) newValue);
			return;
		case AttributesPackage.THREE_DCOORDS__YCOORD:
			setYcoord((Double) newValue);
			return;
		case AttributesPackage.THREE_DCOORDS__ZCOORD:
			setZcoord((Double) newValue);
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
		case AttributesPackage.THREE_DCOORDS__XCOORD:
			setXcoord(XCOORD_EDEFAULT);
			return;
		case AttributesPackage.THREE_DCOORDS__YCOORD:
			setYcoord(YCOORD_EDEFAULT);
			return;
		case AttributesPackage.THREE_DCOORDS__ZCOORD:
			setZcoord(ZCOORD_EDEFAULT);
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
		case AttributesPackage.THREE_DCOORDS__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT
					.equals(token);
		case AttributesPackage.THREE_DCOORDS__XCOORD:
			return xcoord != XCOORD_EDEFAULT;
		case AttributesPackage.THREE_DCOORDS__YCOORD:
			return ycoord != YCOORD_EDEFAULT;
		case AttributesPackage.THREE_DCOORDS__ZCOORD:
			return zcoord != ZCOORD_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(", xcoord: ");
		result.append(xcoord);
		result.append(", ycoord: ");
		result.append(ycoord);
		result.append(", zcoord: ");
		result.append(zcoord);
		result.append(')');
		return result.toString();
	}

} //ThreeDCoordsImpl
