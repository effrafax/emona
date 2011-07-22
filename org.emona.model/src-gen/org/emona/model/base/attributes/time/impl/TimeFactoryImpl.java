/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emona.model.base.attributes.time.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeFactoryImpl extends EFactoryImpl implements TimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeFactory init() {
		try {
			TimeFactory theTimeFactory = (TimeFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.emona.org/model/base/attributes/time");
			if (theTimeFactory != null) {
				return theTimeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TimePackage.TIME_DEFINITION:
			return createTimeDefinition();
		case TimePackage.DAY_RANGE:
			return createDayRange();
		case TimePackage.DATE_SPEC:
			return createDateSpec();
		case TimePackage.MONTH_SPEC:
			return createMonthSpec();
		case TimePackage.MONTH_RANGE:
			return createMonthRange();
		case TimePackage.WEEKDAY_SPEC:
			return createWeekdaySpec();
		case TimePackage.WEEKDAY_RANGE:
			return createWeekdayRange();
		case TimePackage.NUMERIC_DATE_RANGE:
			return createNumericDateRange();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDefinition createTimeDefinition() {
		TimeDefinitionImpl timeDefinition = new TimeDefinitionImpl();
		return timeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayRange createDayRange() {
		DayRangeImpl dayRange = new DayRangeImpl();
		return dayRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateSpec createDateSpec() {
		DateSpecImpl dateSpec = new DateSpecImpl();
		return dateSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthSpec createMonthSpec() {
		MonthSpecImpl monthSpec = new MonthSpecImpl();
		return monthSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthRange createMonthRange() {
		MonthRangeImpl monthRange = new MonthRangeImpl();
		return monthRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekdaySpec createWeekdaySpec() {
		WeekdaySpecImpl weekdaySpec = new WeekdaySpecImpl();
		return weekdaySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekdayRange createWeekdayRange() {
		WeekdayRangeImpl weekdayRange = new WeekdayRangeImpl();
		return weekdayRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericDateRange createNumericDateRange() {
		NumericDateRangeImpl numericDateRange = new NumericDateRangeImpl();
		return numericDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePackage getTimePackage() {
		return (TimePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimePackage getPackage() {
		return TimePackage.eINSTANCE;
	}

} //TimeFactoryImpl
