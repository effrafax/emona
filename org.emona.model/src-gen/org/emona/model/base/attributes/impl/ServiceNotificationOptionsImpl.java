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
import org.emona.model.base.ServiceNotificationOption;
import org.emona.model.base.ServiceState;

import org.emona.model.base.ServiceStateValue;
import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.ServiceNotificationOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Notification Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl#isMultiline <em>Multiline</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl#getState <em>State</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl#isFlapping <em>Flapping</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl#isNone <em>None</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceNotificationOptionsImpl extends EObjectImpl implements
		ServiceNotificationOptions {
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
	protected EList<ServiceStateValue> state;

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
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "service_notification_options";

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
	protected ServiceNotificationOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.SERVICE_NOTIFICATION_OPTIONS;
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
					AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__COMMENT,
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
					AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__MULTILINE,
					oldMultiline, multiline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceStateValue> getState() {
		if (state == null) {
			state = new EDataTypeUniqueEList<ServiceStateValue>(
					ServiceStateValue.class, this,
					AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__STATE);
		}
		return state;
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
					AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__FLAPPING,
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
					AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__NONE,
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
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__COMMENT:
			return getComment();
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__MULTILINE:
			return isMultiline();
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__STATE:
			return getState();
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__FLAPPING:
			return isFlapping();
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__NONE:
			return isNone();
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__TOKEN:
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
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__MULTILINE:
			setMultiline((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__STATE:
			getState().clear();
			getState().addAll(
					(Collection<? extends ServiceStateValue>) newValue);
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__FLAPPING:
			setFlapping((Boolean) newValue);
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__NONE:
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
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__MULTILINE:
			setMultiline(MULTILINE_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__STATE:
			getState().clear();
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__FLAPPING:
			setFlapping(FLAPPING_EDEFAULT);
			return;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__NONE:
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
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__MULTILINE:
			return multiline != MULTILINE_EDEFAULT;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__STATE:
			return state != null && !state.isEmpty();
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__FLAPPING:
			return flapping != FLAPPING_EDEFAULT;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__NONE:
			return none != NONE_EDEFAULT;
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__TOKEN:
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
			case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__STATE:
				return BasePackage.SERVICE_STATE__STATE;
			default:
				return -1;
			}
		}
		if (baseClass == ServiceNotificationOption.class) {
			switch (derivedFeatureID) {
			case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__FLAPPING:
				return BasePackage.SERVICE_NOTIFICATION_OPTION__FLAPPING;
			case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__NONE:
				return BasePackage.SERVICE_NOTIFICATION_OPTION__NONE;
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
			case BasePackage.SERVICE_STATE__STATE:
				return AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__STATE;
			default:
				return -1;
			}
		}
		if (baseClass == ServiceNotificationOption.class) {
			switch (baseFeatureID) {
			case BasePackage.SERVICE_NOTIFICATION_OPTION__FLAPPING:
				return AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__FLAPPING;
			case BasePackage.SERVICE_NOTIFICATION_OPTION__NONE:
				return AttributesPackage.SERVICE_NOTIFICATION_OPTIONS__NONE;
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
		result.append(", flapping: ");
		result.append(flapping);
		result.append(", none: ");
		result.append(none);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //ServiceNotificationOptionsImpl
