/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emona.model.base.BasePackage;
import org.emona.model.base.HostState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.impl.HostStateImpl#isUp <em>Up</em>}</li>
 *   <li>{@link org.emona.model.base.impl.HostStateImpl#isDown <em>Down</em>}</li>
 *   <li>{@link org.emona.model.base.impl.HostStateImpl#isUnreachable <em>Unreachable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostStateImpl extends EObjectImpl implements HostState {
	/**
	 * The default value of the '{@link #isUp() <em>Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUp() <em>Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUp()
	 * @generated
	 * @ordered
	 */
	protected boolean up = UP_EDEFAULT;

	/**
	 * The default value of the '{@link #isDown() <em>Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDown() <em>Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDown()
	 * @generated
	 * @ordered
	 */
	protected boolean down = DOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnreachable() <em>Unreachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnreachable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNREACHABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnreachable() <em>Unreachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnreachable()
	 * @generated
	 * @ordered
	 */
	protected boolean unreachable = UNREACHABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.HOST_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUp() {
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUp(boolean newUp) {
		boolean oldUp = up;
		up = newUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.HOST_STATE__UP, oldUp, up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDown() {
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDown(boolean newDown) {
		boolean oldDown = down;
		down = newDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.HOST_STATE__DOWN, oldDown, down));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnreachable() {
		return unreachable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnreachable(boolean newUnreachable) {
		boolean oldUnreachable = unreachable;
		unreachable = newUnreachable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.HOST_STATE__UNREACHABLE, oldUnreachable,
					unreachable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasePackage.HOST_STATE__UP:
			return isUp();
		case BasePackage.HOST_STATE__DOWN:
			return isDown();
		case BasePackage.HOST_STATE__UNREACHABLE:
			return isUnreachable();
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
		case BasePackage.HOST_STATE__UP:
			setUp((Boolean) newValue);
			return;
		case BasePackage.HOST_STATE__DOWN:
			setDown((Boolean) newValue);
			return;
		case BasePackage.HOST_STATE__UNREACHABLE:
			setUnreachable((Boolean) newValue);
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
		case BasePackage.HOST_STATE__UP:
			setUp(UP_EDEFAULT);
			return;
		case BasePackage.HOST_STATE__DOWN:
			setDown(DOWN_EDEFAULT);
			return;
		case BasePackage.HOST_STATE__UNREACHABLE:
			setUnreachable(UNREACHABLE_EDEFAULT);
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
		case BasePackage.HOST_STATE__UP:
			return up != UP_EDEFAULT;
		case BasePackage.HOST_STATE__DOWN:
			return down != DOWN_EDEFAULT;
		case BasePackage.HOST_STATE__UNREACHABLE:
			return unreachable != UNREACHABLE_EDEFAULT;
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
		result.append(" (up: ");
		result.append(up);
		result.append(", down: ");
		result.append(down);
		result.append(", unreachable: ");
		result.append(unreachable);
		result.append(')');
		return result.toString();
	}

} //HostStateImpl
