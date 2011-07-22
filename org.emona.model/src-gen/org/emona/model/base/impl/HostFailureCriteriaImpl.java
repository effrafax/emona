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
import org.emona.model.base.HostFailureCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Failure Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.impl.HostFailureCriteriaImpl#isPending <em>Pending</em>}</li>
 *   <li>{@link org.emona.model.base.impl.HostFailureCriteriaImpl#isNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostFailureCriteriaImpl extends HostStateImpl implements
		HostFailureCriteria {
	/**
	 * The default value of the '{@link #isPending() <em>Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPending() <em>Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPending()
	 * @generated
	 * @ordered
	 */
	protected boolean pending = PENDING_EDEFAULT;

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
	protected HostFailureCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.HOST_FAILURE_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPending() {
		return pending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPending(boolean newPending) {
		boolean oldPending = pending;
		pending = newPending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.HOST_FAILURE_CRITERIA__PENDING, oldPending,
					pending));
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
					BasePackage.HOST_FAILURE_CRITERIA__NONE, oldNone, none));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasePackage.HOST_FAILURE_CRITERIA__PENDING:
			return isPending();
		case BasePackage.HOST_FAILURE_CRITERIA__NONE:
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
		case BasePackage.HOST_FAILURE_CRITERIA__PENDING:
			setPending((Boolean) newValue);
			return;
		case BasePackage.HOST_FAILURE_CRITERIA__NONE:
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
		case BasePackage.HOST_FAILURE_CRITERIA__PENDING:
			setPending(PENDING_EDEFAULT);
			return;
		case BasePackage.HOST_FAILURE_CRITERIA__NONE:
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
		case BasePackage.HOST_FAILURE_CRITERIA__PENDING:
			return pending != PENDING_EDEFAULT;
		case BasePackage.HOST_FAILURE_CRITERIA__NONE:
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
		result.append(" (pending: ");
		result.append(pending);
		result.append(", none: ");
		result.append(none);
		result.append(')');
		return result.toString();
	}

} //HostFailureCriteriaImpl
