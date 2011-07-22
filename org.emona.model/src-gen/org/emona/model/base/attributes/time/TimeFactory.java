/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.time.TimePackage
 * @generated
 */
public interface TimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeFactory eINSTANCE = org.emona.model.base.attributes.time.impl.TimeFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	TimeDefinition createTimeDefinition();

	/**
	 * Returns a new object of class '<em>Day Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day Range</em>'.
	 * @generated
	 */
	DayRange createDayRange();

	/**
	 * Returns a new object of class '<em>Date Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Spec</em>'.
	 * @generated
	 */
	DateSpec createDateSpec();

	/**
	 * Returns a new object of class '<em>Month Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Month Spec</em>'.
	 * @generated
	 */
	MonthSpec createMonthSpec();

	/**
	 * Returns a new object of class '<em>Month Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Month Range</em>'.
	 * @generated
	 */
	MonthRange createMonthRange();

	/**
	 * Returns a new object of class '<em>Weekday Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weekday Spec</em>'.
	 * @generated
	 */
	WeekdaySpec createWeekdaySpec();

	/**
	 * Returns a new object of class '<em>Weekday Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weekday Range</em>'.
	 * @generated
	 */
	WeekdayRange createWeekdayRange();

	/**
	 * Returns a new object of class '<em>Numeric Date Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Date Range</em>'.
	 * @generated
	 */
	NumericDateRange createNumericDateRange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimePackage getTimePackage();

} //TimeFactory
