/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.emona.model.base.attributes.time.DateSpec;
import org.emona.model.base.attributes.time.TimeDefinition;
import org.emona.model.base.attributes.time.TimePackage;
import org.emona.model.types.TimeRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.time.impl.TimeDefinitionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.impl.TimeDefinitionImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.impl.TimeDefinitionImpl#getDays <em>Days</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.impl.TimeDefinitionImpl#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeDefinitionImpl extends EObjectImpl implements TimeDefinition {
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
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "HH:MM";

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
	 * The cached value of the '{@link #getDays() <em>Days</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected DateSpec days;

	/**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeRange> ranges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.TIME_DEFINITION;
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
					TimePackage.TIME_DEFINITION__COMMENT, oldComment, comment));
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
	public DateSpec getDays() {
		return days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDays(DateSpec newDays,
			NotificationChain msgs) {
		DateSpec oldDays = days;
		days = newDays;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.TIME_DEFINITION__DAYS,
					oldDays, newDays);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDays(DateSpec newDays) {
		if (newDays != days) {
			NotificationChain msgs = null;
			if (days != null)
				msgs = ((InternalEObject) days)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.TIME_DEFINITION__DAYS, null, msgs);
			if (newDays != null)
				msgs = ((InternalEObject) newDays)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.TIME_DEFINITION__DAYS, null, msgs);
			msgs = basicSetDays(newDays, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.TIME_DEFINITION__DAYS, newDays, newDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeRange> getRanges() {
		if (ranges == null) {
			ranges = new EDataTypeUniqueEList<TimeRange>(TimeRange.class, this,
					TimePackage.TIME_DEFINITION__RANGES);
		}
		return ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimePackage.TIME_DEFINITION__DAYS:
			return basicSetDays(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimePackage.TIME_DEFINITION__COMMENT:
			return getComment();
		case TimePackage.TIME_DEFINITION__TOKEN:
			return getToken();
		case TimePackage.TIME_DEFINITION__DAYS:
			return getDays();
		case TimePackage.TIME_DEFINITION__RANGES:
			return getRanges();
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
		case TimePackage.TIME_DEFINITION__COMMENT:
			setComment((String) newValue);
			return;
		case TimePackage.TIME_DEFINITION__DAYS:
			setDays((DateSpec) newValue);
			return;
		case TimePackage.TIME_DEFINITION__RANGES:
			getRanges().clear();
			getRanges().addAll((Collection<? extends TimeRange>) newValue);
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
		case TimePackage.TIME_DEFINITION__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case TimePackage.TIME_DEFINITION__DAYS:
			setDays((DateSpec) null);
			return;
		case TimePackage.TIME_DEFINITION__RANGES:
			getRanges().clear();
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
		case TimePackage.TIME_DEFINITION__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case TimePackage.TIME_DEFINITION__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT
					.equals(token);
		case TimePackage.TIME_DEFINITION__DAYS:
			return days != null;
		case TimePackage.TIME_DEFINITION__RANGES:
			return ranges != null && !ranges.isEmpty();
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
		result.append(", token: ");
		result.append(token);
		result.append(", ranges: ");
		result.append(ranges);
		result.append(')');
		return result.toString();
	}

} //TimeDefinitionImpl
