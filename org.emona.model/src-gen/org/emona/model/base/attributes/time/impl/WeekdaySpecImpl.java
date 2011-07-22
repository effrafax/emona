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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.emona.model.base.Month;
import org.emona.model.base.Weekday;

import org.emona.model.base.attributes.time.TimePackage;
import org.emona.model.base.attributes.time.WeekdaySpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weekday Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.time.impl.WeekdaySpecImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.impl.WeekdaySpecImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.time.impl.WeekdaySpecImpl#getMonth <em>Month</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekdaySpecImpl extends EObjectImpl implements WeekdaySpec {
	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final Weekday DAY_EDEFAULT = Weekday.SU;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Weekday day = DAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> selector;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Month MONTH_EDEFAULT = Month.JAN;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected Month month = MONTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekdaySpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.WEEKDAY_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weekday getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(Weekday newDay) {
		Weekday oldDay = day;
		day = newDay == null ? DAY_EDEFAULT : newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.WEEKDAY_SPEC__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSelector() {
		if (selector == null) {
			selector = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					TimePackage.WEEKDAY_SPEC__SELECTOR);
		}
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Month getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(Month newMonth) {
		Month oldMonth = month;
		month = newMonth == null ? MONTH_EDEFAULT : newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.WEEKDAY_SPEC__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimePackage.WEEKDAY_SPEC__DAY:
			return getDay();
		case TimePackage.WEEKDAY_SPEC__SELECTOR:
			return getSelector();
		case TimePackage.WEEKDAY_SPEC__MONTH:
			return getMonth();
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
		case TimePackage.WEEKDAY_SPEC__DAY:
			setDay((Weekday) newValue);
			return;
		case TimePackage.WEEKDAY_SPEC__SELECTOR:
			getSelector().clear();
			getSelector().addAll((Collection<? extends Integer>) newValue);
			return;
		case TimePackage.WEEKDAY_SPEC__MONTH:
			setMonth((Month) newValue);
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
		case TimePackage.WEEKDAY_SPEC__DAY:
			setDay(DAY_EDEFAULT);
			return;
		case TimePackage.WEEKDAY_SPEC__SELECTOR:
			getSelector().clear();
			return;
		case TimePackage.WEEKDAY_SPEC__MONTH:
			setMonth(MONTH_EDEFAULT);
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
		case TimePackage.WEEKDAY_SPEC__DAY:
			return day != DAY_EDEFAULT;
		case TimePackage.WEEKDAY_SPEC__SELECTOR:
			return selector != null && !selector.isEmpty();
		case TimePackage.WEEKDAY_SPEC__MONTH:
			return month != MONTH_EDEFAULT;
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
		result.append(" (day: ");
		result.append(day);
		result.append(", selector: ");
		result.append(selector);
		result.append(", month: ");
		result.append(month);
		result.append(')');
		return result.toString();
	}

} //WeekdaySpecImpl
