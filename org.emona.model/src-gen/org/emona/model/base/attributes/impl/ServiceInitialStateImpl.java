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

import org.emona.model.base.ServiceStateValue;

import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.ServiceInitialState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Initial State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceInitialStateImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceInitialStateImpl#isMultiline <em>Multiline</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceInitialStateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceInitialStateImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceInitialStateImpl#isOk <em>Ok</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInitialStateImpl extends EObjectImpl implements
		ServiceInitialState {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceStateValue VALUE_EDEFAULT = ServiceStateValue.OK;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ServiceStateValue value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "inital_state";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInitialStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.SERVICE_INITIAL_STATE;
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
					AttributesPackage.SERVICE_INITIAL_STATE__COMMENT,
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
					AttributesPackage.SERVICE_INITIAL_STATE__MULTILINE,
					oldMultiline, multiline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStateValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ServiceStateValue newValue) {
		ServiceStateValue oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.SERVICE_INITIAL_STATE__VALUE, oldValue,
					value));
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
					AttributesPackage.SERVICE_INITIAL_STATE__OK, oldOk, ok));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributesPackage.SERVICE_INITIAL_STATE__COMMENT:
			return getComment();
		case AttributesPackage.SERVICE_INITIAL_STATE__MULTILINE:
			return isMultiline();
		case AttributesPackage.SERVICE_INITIAL_STATE__VALUE:
			return getValue();
		case AttributesPackage.SERVICE_INITIAL_STATE__TOKEN:
			return getToken();
		case AttributesPackage.SERVICE_INITIAL_STATE__OK:
			return isOk();
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
		case AttributesPackage.SERVICE_INITIAL_STATE__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.SERVICE_INITIAL_STATE__MULTILINE:
			setMultiline((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_INITIAL_STATE__VALUE:
			setValue((ServiceStateValue) newValue);
			return;
		case AttributesPackage.SERVICE_INITIAL_STATE__OK:
			setOk((Boolean) newValue);
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
		case AttributesPackage.SERVICE_INITIAL_STATE__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_INITIAL_STATE__MULTILINE:
			setMultiline(MULTILINE_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_INITIAL_STATE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_INITIAL_STATE__OK:
			setOk(OK_EDEFAULT);
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
		case AttributesPackage.SERVICE_INITIAL_STATE__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.SERVICE_INITIAL_STATE__MULTILINE:
			return multiline != MULTILINE_EDEFAULT;
		case AttributesPackage.SERVICE_INITIAL_STATE__VALUE:
			return value != VALUE_EDEFAULT;
		case AttributesPackage.SERVICE_INITIAL_STATE__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT
					.equals(token);
		case AttributesPackage.SERVICE_INITIAL_STATE__OK:
			return ok != OK_EDEFAULT;
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
		result.append(", value: ");
		result.append(value);
		result.append(", token: ");
		result.append(token);
		result.append(", ok: ");
		result.append(ok);
		result.append(')');
		return result.toString();
	}

} //ServiceInitialStateImpl
