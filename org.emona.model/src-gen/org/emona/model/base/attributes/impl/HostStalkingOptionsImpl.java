/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.emona.model.base.BasePackage;
import org.emona.model.base.HostState;

import org.emona.model.base.HostStateValue;
import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.HostStalkingOptions;
import org.emona.model.base.impl.ObjectContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Stalking Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.HostStalkingOptionsImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostStalkingOptionsImpl#isMultiline <em>Multiline</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostStalkingOptionsImpl#getState <em>State</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostStalkingOptionsImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostStalkingOptionsImpl extends ObjectContentImpl implements
		HostStalkingOptions {
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
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<HostStateValue> state;

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
	protected HostStalkingOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.HOST_STALKING_OPTIONS;
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
					AttributesPackage.HOST_STALKING_OPTIONS__COMMENT,
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
					AttributesPackage.HOST_STALKING_OPTIONS__MULTILINE,
					oldMultiline, multiline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostStateValue> getState() {
		if (state == null) {
			state = new EDataTypeUniqueEList<HostStateValue>(
					HostStateValue.class, this,
					AttributesPackage.HOST_STALKING_OPTIONS__STATE);
		}
		return state;
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
		case AttributesPackage.HOST_STALKING_OPTIONS__COMMENT:
			return getComment();
		case AttributesPackage.HOST_STALKING_OPTIONS__MULTILINE:
			return isMultiline();
		case AttributesPackage.HOST_STALKING_OPTIONS__STATE:
			return getState();
		case AttributesPackage.HOST_STALKING_OPTIONS__TOKEN:
			return getToken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AttributesPackage.HOST_STALKING_OPTIONS__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.HOST_STALKING_OPTIONS__MULTILINE:
			setMultiline((Boolean) newValue);
			return;
		case AttributesPackage.HOST_STALKING_OPTIONS__STATE:
			getState().clear();
			getState().addAll((Collection<? extends HostStateValue>) newValue);
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
		case AttributesPackage.HOST_STALKING_OPTIONS__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.HOST_STALKING_OPTIONS__MULTILINE:
			setMultiline(MULTILINE_EDEFAULT);
			return;
		case AttributesPackage.HOST_STALKING_OPTIONS__STATE:
			getState().clear();
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
		case AttributesPackage.HOST_STALKING_OPTIONS__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.HOST_STALKING_OPTIONS__MULTILINE:
			return multiline != MULTILINE_EDEFAULT;
		case AttributesPackage.HOST_STALKING_OPTIONS__STATE:
			return state != null && !state.isEmpty();
		case AttributesPackage.HOST_STALKING_OPTIONS__TOKEN:
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
			case AttributesPackage.HOST_STALKING_OPTIONS__STATE:
				return BasePackage.HOST_STATE__STATE;
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
			case BasePackage.HOST_STATE__STATE:
				return AttributesPackage.HOST_STALKING_OPTIONS__STATE;
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
		result.append(", state: ");
		result.append(state);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //HostStalkingOptionsImpl
