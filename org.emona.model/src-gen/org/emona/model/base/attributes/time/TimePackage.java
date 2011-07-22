/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.emona.model.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.time.TimeFactory
 * @model kind="package"
 * @generated
 */
public interface TimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "time";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emona.org/model/base/attributes/time";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eatime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimePackage eINSTANCE = org.emona.model.base.attributes.time.impl.TimePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.TimeDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.TimeDefinitionImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getTimeDefinition()
	 * @generated
	 */
	int TIME_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEFINITION__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEFINITION__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEFINITION__DAYS = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEFINITION__RANGES = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEFINITION_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.DateSpecImpl <em>Date Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.DateSpecImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getDateSpec()
	 * @generated
	 */
	int DATE_SPEC = 2;

	/**
	 * The feature id for the '<em><b>Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SPEC__DIVISOR = 0;

	/**
	 * The number of structural features of the '<em>Date Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SPEC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.DayRangeImpl <em>Day Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.DayRangeImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getDayRange()
	 * @generated
	 */
	int DAY_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_RANGE__DIVISOR = DATE_SPEC__DIVISOR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_RANGE__START = DATE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_RANGE__END = DATE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Day Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_RANGE_FEATURE_COUNT = DATE_SPEC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.MonthSpecImpl <em>Month Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.MonthSpecImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getMonthSpec()
	 * @generated
	 */
	int MONTH_SPEC = 3;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_SPEC__MONTH = 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_SPEC__DAY = 1;

	/**
	 * The number of structural features of the '<em>Month Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_SPEC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.MonthRangeImpl <em>Month Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.MonthRangeImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getMonthRange()
	 * @generated
	 */
	int MONTH_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_RANGE__DIVISOR = DATE_SPEC__DIVISOR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_RANGE__START = DATE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_RANGE__END = DATE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Month Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_RANGE_FEATURE_COUNT = DATE_SPEC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.WeekdaySpecImpl <em>Weekday Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.WeekdaySpecImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getWeekdaySpec()
	 * @generated
	 */
	int WEEKDAY_SPEC = 5;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_SPEC__DAY = 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_SPEC__SELECTOR = 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_SPEC__MONTH = 2;

	/**
	 * The number of structural features of the '<em>Weekday Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_SPEC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.WeekdayRangeImpl <em>Weekday Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.WeekdayRangeImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getWeekdayRange()
	 * @generated
	 */
	int WEEKDAY_RANGE = 6;

	/**
	 * The feature id for the '<em><b>Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_RANGE__DIVISOR = DATE_SPEC__DIVISOR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_RANGE__START = DATE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_RANGE__END = DATE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weekday Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_RANGE_FEATURE_COUNT = DATE_SPEC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.time.impl.NumericDateRangeImpl <em>Numeric Date Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.time.impl.NumericDateRangeImpl
	 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getNumericDateRange()
	 * @generated
	 */
	int NUMERIC_DATE_RANGE = 7;

	/**
	 * The feature id for the '<em><b>Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATE_RANGE__DIVISOR = DATE_SPEC__DIVISOR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATE_RANGE__START = DATE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATE_RANGE__END = DATE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATE_RANGE_FEATURE_COUNT = DATE_SPEC_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.TimeDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.emona.model.base.attributes.time.TimeDefinition
	 * @generated
	 */
	EClass getTimeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.TimeDefinition#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.time.TimeDefinition#getToken()
	 * @see #getTimeDefinition()
	 * @generated
	 */
	EAttribute getTimeDefinition_Token();

	/**
	 * Returns the meta object for the containment reference '{@link org.emona.model.base.attributes.time.TimeDefinition#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Days</em>'.
	 * @see org.emona.model.base.attributes.time.TimeDefinition#getDays()
	 * @see #getTimeDefinition()
	 * @generated
	 */
	EReference getTimeDefinition_Days();

	/**
	 * Returns the meta object for the attribute list '{@link org.emona.model.base.attributes.time.TimeDefinition#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ranges</em>'.
	 * @see org.emona.model.base.attributes.time.TimeDefinition#getRanges()
	 * @see #getTimeDefinition()
	 * @generated
	 */
	EAttribute getTimeDefinition_Ranges();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.DayRange <em>Day Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Range</em>'.
	 * @see org.emona.model.base.attributes.time.DayRange
	 * @generated
	 */
	EClass getDayRange();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.DayRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.emona.model.base.attributes.time.DayRange#getStart()
	 * @see #getDayRange()
	 * @generated
	 */
	EAttribute getDayRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.DayRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.emona.model.base.attributes.time.DayRange#getEnd()
	 * @see #getDayRange()
	 * @generated
	 */
	EAttribute getDayRange_End();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.DateSpec <em>Date Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Spec</em>'.
	 * @see org.emona.model.base.attributes.time.DateSpec
	 * @generated
	 */
	EClass getDateSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.DateSpec#getDivisor <em>Divisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Divisor</em>'.
	 * @see org.emona.model.base.attributes.time.DateSpec#getDivisor()
	 * @see #getDateSpec()
	 * @generated
	 */
	EAttribute getDateSpec_Divisor();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.MonthSpec <em>Month Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month Spec</em>'.
	 * @see org.emona.model.base.attributes.time.MonthSpec
	 * @generated
	 */
	EClass getMonthSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.MonthSpec#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.emona.model.base.attributes.time.MonthSpec#getMonth()
	 * @see #getMonthSpec()
	 * @generated
	 */
	EAttribute getMonthSpec_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.MonthSpec#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.emona.model.base.attributes.time.MonthSpec#getDay()
	 * @see #getMonthSpec()
	 * @generated
	 */
	EAttribute getMonthSpec_Day();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.MonthRange <em>Month Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month Range</em>'.
	 * @see org.emona.model.base.attributes.time.MonthRange
	 * @generated
	 */
	EClass getMonthRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.emona.model.base.attributes.time.MonthRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.emona.model.base.attributes.time.MonthRange#getStart()
	 * @see #getMonthRange()
	 * @generated
	 */
	EReference getMonthRange_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.emona.model.base.attributes.time.MonthRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.emona.model.base.attributes.time.MonthRange#getEnd()
	 * @see #getMonthRange()
	 * @generated
	 */
	EReference getMonthRange_End();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.WeekdaySpec <em>Weekday Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weekday Spec</em>'.
	 * @see org.emona.model.base.attributes.time.WeekdaySpec
	 * @generated
	 */
	EClass getWeekdaySpec();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.WeekdaySpec#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.emona.model.base.attributes.time.WeekdaySpec#getDay()
	 * @see #getWeekdaySpec()
	 * @generated
	 */
	EAttribute getWeekdaySpec_Day();

	/**
	 * Returns the meta object for the attribute list '{@link org.emona.model.base.attributes.time.WeekdaySpec#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selector</em>'.
	 * @see org.emona.model.base.attributes.time.WeekdaySpec#getSelector()
	 * @see #getWeekdaySpec()
	 * @generated
	 */
	EAttribute getWeekdaySpec_Selector();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.WeekdaySpec#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.emona.model.base.attributes.time.WeekdaySpec#getMonth()
	 * @see #getWeekdaySpec()
	 * @generated
	 */
	EAttribute getWeekdaySpec_Month();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.WeekdayRange <em>Weekday Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weekday Range</em>'.
	 * @see org.emona.model.base.attributes.time.WeekdayRange
	 * @generated
	 */
	EClass getWeekdayRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.emona.model.base.attributes.time.WeekdayRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.emona.model.base.attributes.time.WeekdayRange#getStart()
	 * @see #getWeekdayRange()
	 * @generated
	 */
	EReference getWeekdayRange_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.emona.model.base.attributes.time.WeekdayRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.emona.model.base.attributes.time.WeekdayRange#getEnd()
	 * @see #getWeekdayRange()
	 * @generated
	 */
	EReference getWeekdayRange_End();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.time.NumericDateRange <em>Numeric Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Date Range</em>'.
	 * @see org.emona.model.base.attributes.time.NumericDateRange
	 * @generated
	 */
	EClass getNumericDateRange();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.NumericDateRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.emona.model.base.attributes.time.NumericDateRange#getStart()
	 * @see #getNumericDateRange()
	 * @generated
	 */
	EAttribute getNumericDateRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.time.NumericDateRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.emona.model.base.attributes.time.NumericDateRange#getEnd()
	 * @see #getNumericDateRange()
	 * @generated
	 */
	EAttribute getNumericDateRange_End();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeFactory getTimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.TimeDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.TimeDefinitionImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getTimeDefinition()
		 * @generated
		 */
		EClass TIME_DEFINITION = eINSTANCE.getTimeDefinition();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEFINITION__TOKEN = eINSTANCE.getTimeDefinition_Token();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEFINITION__DAYS = eINSTANCE.getTimeDefinition_Days();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEFINITION__RANGES = eINSTANCE
				.getTimeDefinition_Ranges();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.DayRangeImpl <em>Day Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.DayRangeImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getDayRange()
		 * @generated
		 */
		EClass DAY_RANGE = eINSTANCE.getDayRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_RANGE__START = eINSTANCE.getDayRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_RANGE__END = eINSTANCE.getDayRange_End();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.DateSpecImpl <em>Date Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.DateSpecImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getDateSpec()
		 * @generated
		 */
		EClass DATE_SPEC = eINSTANCE.getDateSpec();

		/**
		 * The meta object literal for the '<em><b>Divisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_SPEC__DIVISOR = eINSTANCE.getDateSpec_Divisor();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.MonthSpecImpl <em>Month Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.MonthSpecImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getMonthSpec()
		 * @generated
		 */
		EClass MONTH_SPEC = eINSTANCE.getMonthSpec();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH_SPEC__MONTH = eINSTANCE.getMonthSpec_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH_SPEC__DAY = eINSTANCE.getMonthSpec_Day();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.MonthRangeImpl <em>Month Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.MonthRangeImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getMonthRange()
		 * @generated
		 */
		EClass MONTH_RANGE = eINSTANCE.getMonthRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONTH_RANGE__START = eINSTANCE.getMonthRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONTH_RANGE__END = eINSTANCE.getMonthRange_End();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.WeekdaySpecImpl <em>Weekday Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.WeekdaySpecImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getWeekdaySpec()
		 * @generated
		 */
		EClass WEEKDAY_SPEC = eINSTANCE.getWeekdaySpec();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEKDAY_SPEC__DAY = eINSTANCE.getWeekdaySpec_Day();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEKDAY_SPEC__SELECTOR = eINSTANCE.getWeekdaySpec_Selector();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEKDAY_SPEC__MONTH = eINSTANCE.getWeekdaySpec_Month();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.WeekdayRangeImpl <em>Weekday Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.WeekdayRangeImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getWeekdayRange()
		 * @generated
		 */
		EClass WEEKDAY_RANGE = eINSTANCE.getWeekdayRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEKDAY_RANGE__START = eINSTANCE.getWeekdayRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEKDAY_RANGE__END = eINSTANCE.getWeekdayRange_End();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.time.impl.NumericDateRangeImpl <em>Numeric Date Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.time.impl.NumericDateRangeImpl
		 * @see org.emona.model.base.attributes.time.impl.TimePackageImpl#getNumericDateRange()
		 * @generated
		 */
		EClass NUMERIC_DATE_RANGE = eINSTANCE.getNumericDateRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_DATE_RANGE__START = eINSTANCE
				.getNumericDateRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_DATE_RANGE__END = eINSTANCE
				.getNumericDateRange_End();

	}

} //TimePackage
