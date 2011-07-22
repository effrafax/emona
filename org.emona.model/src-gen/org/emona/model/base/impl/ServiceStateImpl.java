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
import org.emona.model.base.ServiceState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.impl.ServiceStateImpl#isOk <em>Ok</em>}</li>
 *   <li>{@link org.emona.model.base.impl.ServiceStateImpl#isWarning <em>Warning</em>}</li>
 *   <li>{@link org.emona.model.base.impl.ServiceStateImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link org.emona.model.base.impl.ServiceStateImpl#isUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceStateImpl extends EObjectImpl implements ServiceState {
	/**
	 * The default value of the '{@link #isOk() <em>Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOk() <em>Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOk()
	 * @generated
	 * @ordered
	 */
	protected boolean ok = OK_EDEFAULT;

	/**
	 * The default value of the '{@link #isWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarning()
	 * @generated
	 * @ordered
	 */
	protected boolean warning = WARNING_EDEFAULT;

	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNKNOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknown()
	 * @generated
	 * @ordered
	 */
	protected boolean unknown = UNKNOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.SERVICE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOk() {
		return ok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOk(boolean newOk) {
		boolean oldOk = ok;
		ok = newOk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.SERVICE_STATE__OK, oldOk, ok));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWarning() {
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarning(boolean newWarning) {
		boolean oldWarning = warning;
		warning = newWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.SERVICE_STATE__WARNING, oldWarning, warning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		boolean oldCritical = critical;
		critical = newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.SERVICE_STATE__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnknown() {
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknown(boolean newUnknown) {
		boolean oldUnknown = unknown;
		unknown = newUnknown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasePackage.SERVICE_STATE__UNKNOWN, oldUnknown, unknown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasePackage.SERVICE_STATE__OK:
			return isOk();
		case BasePackage.SERVICE_STATE__WARNING:
			return isWarning();
		case BasePackage.SERVICE_STATE__CRITICAL:
			return isCritical();
		case BasePackage.SERVICE_STATE__UNKNOWN:
			return isUnknown();
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
		case BasePackage.SERVICE_STATE__OK:
			setOk((Boolean) newValue);
			return;
		case BasePackage.SERVICE_STATE__WARNING:
			setWarning((Boolean) newValue);
			return;
		case BasePackage.SERVICE_STATE__CRITICAL:
			setCritical((Boolean) newValue);
			return;
		case BasePackage.SERVICE_STATE__UNKNOWN:
			setUnknown((Boolean) newValue);
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
		case BasePackage.SERVICE_STATE__OK:
			setOk(OK_EDEFAULT);
			return;
		case BasePackage.SERVICE_STATE__WARNING:
			setWarning(WARNING_EDEFAULT);
			return;
		case BasePackage.SERVICE_STATE__CRITICAL:
			setCritical(CRITICAL_EDEFAULT);
			return;
		case BasePackage.SERVICE_STATE__UNKNOWN:
			setUnknown(UNKNOWN_EDEFAULT);
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
		case BasePackage.SERVICE_STATE__OK:
			return ok != OK_EDEFAULT;
		case BasePackage.SERVICE_STATE__WARNING:
			return warning != WARNING_EDEFAULT;
		case BasePackage.SERVICE_STATE__CRITICAL:
			return critical != CRITICAL_EDEFAULT;
		case BasePackage.SERVICE_STATE__UNKNOWN:
			return unknown != UNKNOWN_EDEFAULT;
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
		result.append(" (ok: ");
		result.append(ok);
		result.append(", warning: ");
		result.append(warning);
		result.append(", critical: ");
		result.append(critical);
		result.append(", unknown: ");
		result.append(unknown);
		result.append(')');
		return result.toString();
	}

} //ServiceStateImpl
