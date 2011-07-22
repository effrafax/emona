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
import org.emona.model.base.HostState;

import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.HostEscalationOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Escalation Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.HostEscalationOptionsImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostEscalationOptionsImpl#isUp <em>Up</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostEscalationOptionsImpl#isDown <em>Down</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostEscalationOptionsImpl#isUnreachable <em>Unreachable</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostEscalationOptionsImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostEscalationOptionsImpl extends EObjectImpl implements
		HostEscalationOptions {
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
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "escalation_options";

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
	protected HostEscalationOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.HOST_ESCALATION_OPTIONS;
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
					AttributesPackage.HOST_ESCALATION_OPTIONS__COMMENT,
					oldComment, comment));
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
					AttributesPackage.HOST_ESCALATION_OPTIONS__UP, oldUp, up));
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
					AttributesPackage.HOST_ESCALATION_OPTIONS__DOWN, oldDown,
					down));
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
					AttributesPackage.HOST_ESCALATION_OPTIONS__UNREACHABLE,
					oldUnreachable, unreachable));
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
					AttributesPackage.HOST_ESCALATION_OPTIONS__TOKEN, oldToken,
					token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributesPackage.HOST_ESCALATION_OPTIONS__COMMENT:
			return getComment();
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UP:
			return isUp();
		case AttributesPackage.HOST_ESCALATION_OPTIONS__DOWN:
			return isDown();
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UNREACHABLE:
			return isUnreachable();
		case AttributesPackage.HOST_ESCALATION_OPTIONS__TOKEN:
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
		case AttributesPackage.HOST_ESCALATION_OPTIONS__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UP:
			setUp((Boolean) newValue);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__DOWN:
			setDown((Boolean) newValue);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UNREACHABLE:
			setUnreachable((Boolean) newValue);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__TOKEN:
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
		case AttributesPackage.HOST_ESCALATION_OPTIONS__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UP:
			setUp(UP_EDEFAULT);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__DOWN:
			setDown(DOWN_EDEFAULT);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UNREACHABLE:
			setUnreachable(UNREACHABLE_EDEFAULT);
			return;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__TOKEN:
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
		case AttributesPackage.HOST_ESCALATION_OPTIONS__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UP:
			return up != UP_EDEFAULT;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__DOWN:
			return down != DOWN_EDEFAULT;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__UNREACHABLE:
			return unreachable != UNREACHABLE_EDEFAULT;
		case AttributesPackage.HOST_ESCALATION_OPTIONS__TOKEN:
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
		if (baseClass == HostState.class) {
			switch (derivedFeatureID) {
			case AttributesPackage.HOST_ESCALATION_OPTIONS__UP:
				return BasePackage.HOST_STATE__UP;
			case AttributesPackage.HOST_ESCALATION_OPTIONS__DOWN:
				return BasePackage.HOST_STATE__DOWN;
			case AttributesPackage.HOST_ESCALATION_OPTIONS__UNREACHABLE:
				return BasePackage.HOST_STATE__UNREACHABLE;
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
		if (baseClass == HostState.class) {
			switch (baseFeatureID) {
			case BasePackage.HOST_STATE__UP:
				return AttributesPackage.HOST_ESCALATION_OPTIONS__UP;
			case BasePackage.HOST_STATE__DOWN:
				return AttributesPackage.HOST_ESCALATION_OPTIONS__DOWN;
			case BasePackage.HOST_STATE__UNREACHABLE:
				return AttributesPackage.HOST_ESCALATION_OPTIONS__UNREACHABLE;
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
		result.append(", up: ");
		result.append(up);
		result.append(", down: ");
		result.append(down);
		result.append(", unreachable: ");
		result.append(unreachable);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //HostEscalationOptionsImpl
