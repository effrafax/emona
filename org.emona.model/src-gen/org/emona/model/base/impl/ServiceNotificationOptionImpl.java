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

import org.emona.model.base.BasePackage;
import org.emona.model.base.ServiceNotificationOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Notification Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.impl.ServiceNotificationOptionImpl#isFlapping <em>Flapping</em>}</li>
 *   <li>{@link org.emona.model.base.impl.ServiceNotificationOptionImpl#isNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceNotificationOptionImpl extends ServiceStateImpl implements
		ServiceNotificationOption {
	/**
	 * The default value of the '{@link #isFlapping() <em>Flapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlapping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLAPPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlapping() <em>Flapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlapping()
	 * @generated
	 * @ordered
	 */
	protected boolean flapping = FLAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isNone() <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNone() <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNone()
	 * @generated
	 * @ordered
	 */
	protected boolean none = NONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceNotificationOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.SERVICE_NOTIFICATION_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlapping() {
		return flapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlapping(boolean newFlapping) {
		boolean oldFlapping = flapping;
		flapping = newFlapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.SERVICE_NOTIFICATION_OPTION__FLAPPING,
					oldFlapping, flapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNone() {
		return none;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNone(boolean newNone) {
		boolean oldNone = none;
		none = newNone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.SERVICE_NOTIFICATION_OPTION__NONE, oldNone,
					none));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasePackage.SERVICE_NOTIFICATION_OPTION__FLAPPING:
			return isFlapping();
		case BasePackage.SERVICE_NOTIFICATION_OPTION__NONE:
			return isNone();
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
		case BasePackage.SERVICE_NOTIFICATION_OPTION__FLAPPING:
			setFlapping((Boolean) newValue);
			return;
		case BasePackage.SERVICE_NOTIFICATION_OPTION__NONE:
			setNone((Boolean) newValue);
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
		case BasePackage.SERVICE_NOTIFICATION_OPTION__FLAPPING:
			setFlapping(FLAPPING_EDEFAULT);
			return;
		case BasePackage.SERVICE_NOTIFICATION_OPTION__NONE:
			setNone(NONE_EDEFAULT);
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
		case BasePackage.SERVICE_NOTIFICATION_OPTION__FLAPPING:
			return flapping != FLAPPING_EDEFAULT;
		case BasePackage.SERVICE_NOTIFICATION_OPTION__NONE:
			return none != NONE_EDEFAULT;
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
		result.append(" (flapping: ");
		result.append(flapping);
		result.append(", none: ");
		result.append(none);
		result.append(')');
		return result.toString();
	}

} //ServiceNotificationOptionImpl
