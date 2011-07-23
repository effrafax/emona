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
import org.emona.model.base.ServiceState;

import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.ServiceStalkingOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Stalking Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl#isMultiline <em>Multiline</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl#isOk <em>Ok</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl#isWarning <em>Warning</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl#isUnknown <em>Unknown</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceStalkingOptionsImpl extends EObjectImpl implements
		ServiceStalkingOptions {
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
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "stalking_options";

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
	protected ServiceStalkingOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.SERVICE_STALKING_OPTIONS;
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
					AttributesPackage.SERVICE_STALKING_OPTIONS__COMMENT,
					oldComment, comment));
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
					AttributesPackage.SERVICE_STALKING_OPTIONS__MULTILINE,
					oldMultiline, multiline));
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
					AttributesPackage.SERVICE_STALKING_OPTIONS__OK, oldOk, ok));
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
					AttributesPackage.SERVICE_STALKING_OPTIONS__WARNING,
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
					AttributesPackage.SERVICE_STALKING_OPTIONS__CRITICAL,
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
					AttributesPackage.SERVICE_STALKING_OPTIONS__UNKNOWN,
					oldUnknown, unknown));
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
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.SERVICE_STALKING_OPTIONS__TOKEN,
					oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributesPackage.SERVICE_STALKING_OPTIONS__COMMENT:
			return getComment();
		case AttributesPackage.SERVICE_STALKING_OPTIONS__MULTILINE:
			return isMultiline();
		case AttributesPackage.SERVICE_STALKING_OPTIONS__OK:
			return isOk();
		case AttributesPackage.SERVICE_STALKING_OPTIONS__WARNING:
			return isWarning();
		case AttributesPackage.SERVICE_STALKING_OPTIONS__CRITICAL:
			return isCritical();
		case AttributesPackage.SERVICE_STALKING_OPTIONS__UNKNOWN:
			return isUnknown();
		case AttributesPackage.SERVICE_STALKING_OPTIONS__TOKEN:
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
		case AttributesPackage.SERVICE_STALKING_OPTIONS__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__MULTILINE:
			setMultiline((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__OK:
			setOk((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__WARNING:
			setWarning((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__CRITICAL:
			setCritical((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__UNKNOWN:
			setUnknown((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__TOKEN:
			setToken((String) newValue);
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
		case AttributesPackage.SERVICE_STALKING_OPTIONS__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__MULTILINE:
			setMultiline(MULTILINE_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__OK:
			setOk(OK_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__WARNING:
			setWarning(WARNING_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__CRITICAL:
			setCritical(CRITICAL_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__UNKNOWN:
			setUnknown(UNKNOWN_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__TOKEN:
			setToken(TOKEN_EDEFAULT);
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
		case AttributesPackage.SERVICE_STALKING_OPTIONS__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.SERVICE_STALKING_OPTIONS__MULTILINE:
			return multiline != MULTILINE_EDEFAULT;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__OK:
			return ok != OK_EDEFAULT;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__WARNING:
			return warning != WARNING_EDEFAULT;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__CRITICAL:
			return critical != CRITICAL_EDEFAULT;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__UNKNOWN:
			return unknown != UNKNOWN_EDEFAULT;
		case AttributesPackage.SERVICE_STALKING_OPTIONS__TOKEN:
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
			case AttributesPackage.SERVICE_STALKING_OPTIONS__OK:
				return BasePackage.SERVICE_STATE__OK;
			case AttributesPackage.SERVICE_STALKING_OPTIONS__WARNING:
				return BasePackage.SERVICE_STATE__WARNING;
			case AttributesPackage.SERVICE_STALKING_OPTIONS__CRITICAL:
				return BasePackage.SERVICE_STATE__CRITICAL;
			case AttributesPackage.SERVICE_STALKING_OPTIONS__UNKNOWN:
				return BasePackage.SERVICE_STATE__UNKNOWN;
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
				return AttributesPackage.SERVICE_STALKING_OPTIONS__OK;
			case BasePackage.SERVICE_STATE__WARNING:
				return AttributesPackage.SERVICE_STALKING_OPTIONS__WARNING;
			case BasePackage.SERVICE_STATE__CRITICAL:
				return AttributesPackage.SERVICE_STALKING_OPTIONS__CRITICAL;
			case BasePackage.SERVICE_STATE__UNKNOWN:
				return AttributesPackage.SERVICE_STALKING_OPTIONS__UNKNOWN;
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
		result.append(", multiline: ");
		result.append(multiline);
		result.append(", ok: ");
		result.append(ok);
		result.append(", warning: ");
		result.append(warning);
		result.append(", critical: ");
		result.append(critical);
		result.append(", unknown: ");
		result.append(unknown);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //ServiceStalkingOptionsImpl
