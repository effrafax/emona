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

import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.HostNotificationOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Notification Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#isMultiline <em>Multiline</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#isRecovery <em>Recovery</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#isDown <em>Down</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#isUnreachable <em>Unreachable</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#isFlapping <em>Flapping</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#isScheduledDowntime <em>Scheduled Downtime</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl#isNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostNotificationOptionsImpl extends EObjectImpl implements
		HostNotificationOptions {
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
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "host_notification_options";

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
	 * The default value of the '{@link #isRecovery() <em>Recovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecovery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECOVERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecovery() <em>Recovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecovery()
	 * @generated
	 * @ordered
	 */
	protected boolean recovery = RECOVERY_EDEFAULT;

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
	 * The default value of the '{@link #isScheduledDowntime() <em>Scheduled Downtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduledDowntime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCHEDULED_DOWNTIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScheduledDowntime() <em>Scheduled Downtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduledDowntime()
	 * @generated
	 * @ordered
	 */
	protected boolean scheduledDowntime = SCHEDULED_DOWNTIME_EDEFAULT;

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
	protected HostNotificationOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.HOST_NOTIFICATION_OPTIONS;
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
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__COMMENT,
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
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__MULTILINE,
					oldMultiline, multiline));
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
	public boolean isRecovery() {
		return recovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecovery(boolean newRecovery) {
		boolean oldRecovery = recovery;
		recovery = newRecovery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__RECOVERY,
					oldRecovery, recovery));
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
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__DOWN, oldDown,
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
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__UNREACHABLE,
					oldUnreachable, unreachable));
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
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__FLAPPING,
					oldFlapping, flapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScheduledDowntime() {
		return scheduledDowntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledDowntime(boolean newScheduledDowntime) {
		boolean oldScheduledDowntime = scheduledDowntime;
		scheduledDowntime = newScheduledDowntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME,
					oldScheduledDowntime, scheduledDowntime));
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
					AttributesPackage.HOST_NOTIFICATION_OPTIONS__NONE, oldNone,
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
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__COMMENT:
			return getComment();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__MULTILINE:
			return isMultiline();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__TOKEN:
			return getToken();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__RECOVERY:
			return isRecovery();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__DOWN:
			return isDown();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__UNREACHABLE:
			return isUnreachable();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__FLAPPING:
			return isFlapping();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME:
			return isScheduledDowntime();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__NONE:
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
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__COMMENT:
			setComment((String) newValue);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__MULTILINE:
			setMultiline((Boolean) newValue);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__RECOVERY:
			setRecovery((Boolean) newValue);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__DOWN:
			setDown((Boolean) newValue);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__UNREACHABLE:
			setUnreachable((Boolean) newValue);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__FLAPPING:
			setFlapping((Boolean) newValue);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME:
			setScheduledDowntime((Boolean) newValue);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__NONE:
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
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__MULTILINE:
			setMultiline(MULTILINE_EDEFAULT);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__RECOVERY:
			setRecovery(RECOVERY_EDEFAULT);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__DOWN:
			setDown(DOWN_EDEFAULT);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__UNREACHABLE:
			setUnreachable(UNREACHABLE_EDEFAULT);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__FLAPPING:
			setFlapping(FLAPPING_EDEFAULT);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME:
			setScheduledDowntime(SCHEDULED_DOWNTIME_EDEFAULT);
			return;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__NONE:
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
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__MULTILINE:
			return multiline != MULTILINE_EDEFAULT;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT
					.equals(token);
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__RECOVERY:
			return recovery != RECOVERY_EDEFAULT;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__DOWN:
			return down != DOWN_EDEFAULT;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__UNREACHABLE:
			return unreachable != UNREACHABLE_EDEFAULT;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__FLAPPING:
			return flapping != FLAPPING_EDEFAULT;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME:
			return scheduledDowntime != SCHEDULED_DOWNTIME_EDEFAULT;
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS__NONE:
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", multiline: ");
		result.append(multiline);
		result.append(", token: ");
		result.append(token);
		result.append(", recovery: ");
		result.append(recovery);
		result.append(", down: ");
		result.append(down);
		result.append(", unreachable: ");
		result.append(unreachable);
		result.append(", flapping: ");
		result.append(flapping);
		result.append(", scheduledDowntime: ");
		result.append(scheduledDowntime);
		result.append(", none: ");
		result.append(none);
		result.append(')');
		return result.toString();
	}

} //HostNotificationOptionsImpl
