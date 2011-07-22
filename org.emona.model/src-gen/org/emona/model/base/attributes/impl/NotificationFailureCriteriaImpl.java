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

import org.emona.model.base.BasePackage;
import org.emona.model.base.ServiceFailureCriteria;
import org.emona.model.base.ServiceState;

import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.NotificationFailureCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Failure Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#isOk <em>Ok</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#isWarning <em>Warning</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#isUnknown <em>Unknown</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#isPending <em>Pending</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#isNone <em>None</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationFailureCriteriaImpl extends EObjectImpl implements
		NotificationFailureCriteria {
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
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "notification_failure_criteria";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationFailureCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.NOTIFICATION_FAILURE_CRITERIA;
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
					AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__COMMENT,
					oldComment, comment));
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
					AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__OK, oldOk,
					ok));
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
					AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__WARNING,
					oldWarning, warning));
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
					AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__CRITICAL,
					oldCritical, critical));
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
					AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__UNKNOWN,
					oldUnknown, unknown));
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
					AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__PENDING,
					oldPending, pending));
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
					AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__NONE,
					oldNone, none));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__COMMENT:
			return getComment();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__OK:
			return isOk();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__WARNING:
			return isWarning();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__CRITICAL:
			return isCritical();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__UNKNOWN:
			return isUnknown();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__PENDING:
			return isPending();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__NONE:
			return isNone();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__TOKEN:
			return getToken();
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
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__OK:
			setOk((Boolean) newValue);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__WARNING:
			setWarning((Boolean) newValue);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__CRITICAL:
			setCritical((Boolean) newValue);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__UNKNOWN:
			setUnknown((Boolean) newValue);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__PENDING:
			setPending((Boolean) newValue);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__NONE:
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
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__OK:
			setOk(OK_EDEFAULT);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__WARNING:
			setWarning(WARNING_EDEFAULT);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__CRITICAL:
			setCritical(CRITICAL_EDEFAULT);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__UNKNOWN:
			setUnknown(UNKNOWN_EDEFAULT);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__PENDING:
			setPending(PENDING_EDEFAULT);
			return;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__NONE:
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
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__OK:
			return ok != OK_EDEFAULT;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__WARNING:
			return warning != WARNING_EDEFAULT;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__CRITICAL:
			return critical != CRITICAL_EDEFAULT;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__UNKNOWN:
			return unknown != UNKNOWN_EDEFAULT;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__PENDING:
			return pending != PENDING_EDEFAULT;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__NONE:
			return none != NONE_EDEFAULT;
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT
					.equals(token);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ServiceState.class) {
			switch (derivedFeatureID) {
			case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__OK:
				return BasePackage.SERVICE_STATE__OK;
			case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__WARNING:
				return BasePackage.SERVICE_STATE__WARNING;
			case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__CRITICAL:
				return BasePackage.SERVICE_STATE__CRITICAL;
			case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__UNKNOWN:
				return BasePackage.SERVICE_STATE__UNKNOWN;
			default:
				return -1;
			}
		}
		if (baseClass == ServiceFailureCriteria.class) {
			switch (derivedFeatureID) {
			case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__PENDING:
				return BasePackage.SERVICE_FAILURE_CRITERIA__PENDING;
			case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__NONE:
				return BasePackage.SERVICE_FAILURE_CRITERIA__NONE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ServiceState.class) {
			switch (baseFeatureID) {
			case BasePackage.SERVICE_STATE__OK:
				return AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__OK;
			case BasePackage.SERVICE_STATE__WARNING:
				return AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__WARNING;
			case BasePackage.SERVICE_STATE__CRITICAL:
				return AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__CRITICAL;
			case BasePackage.SERVICE_STATE__UNKNOWN:
				return AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__UNKNOWN;
			default:
				return -1;
			}
		}
		if (baseClass == ServiceFailureCriteria.class) {
			switch (baseFeatureID) {
			case BasePackage.SERVICE_FAILURE_CRITERIA__PENDING:
				return AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__PENDING;
			case BasePackage.SERVICE_FAILURE_CRITERIA__NONE:
				return AttributesPackage.NOTIFICATION_FAILURE_CRITERIA__NONE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", ok: ");
		result.append(ok);
		result.append(", warning: ");
		result.append(warning);
		result.append(", critical: ");
		result.append(critical);
		result.append(", unknown: ");
		result.append(unknown);
		result.append(", pending: ");
		result.append(pending);
		result.append(", none: ");
		result.append(none);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //NotificationFailureCriteriaImpl
