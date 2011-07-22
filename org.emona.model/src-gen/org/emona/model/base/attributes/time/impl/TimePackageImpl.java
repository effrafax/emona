/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emona.model.base.BasePackage;

import org.emona.model.base.attributes.AttributesPackage;

import org.emona.model.base.attributes.impl.AttributesPackageImpl;

import org.emona.model.base.attributes.time.DateSpec;
import org.emona.model.base.attributes.time.DayRange;
import org.emona.model.base.attributes.time.MonthRange;
import org.emona.model.base.attributes.time.MonthSpec;
import org.emona.model.base.attributes.time.NumericDateRange;
import org.emona.model.base.attributes.time.TimeDefinition;
import org.emona.model.base.attributes.time.TimeFactory;
import org.emona.model.base.attributes.time.TimePackage;

import org.emona.model.base.attributes.time.WeekdayRange;
import org.emona.model.base.attributes.time.WeekdaySpec;
import org.emona.model.base.impl.BasePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimePackageImpl extends EPackageImpl implements TimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekdaySpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekdayRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericDateRangeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emona.model.base.attributes.time.TimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimePackageImpl() {
		super(eNS_URI, TimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimePackage init() {
		if (isInited)
			return (TimePackage) EPackage.Registry.INSTANCE
					.getEPackage(TimePackage.eNS_URI);

		// Obtain or create and register package
		TimePackageImpl theTimePackage = (TimePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new TimePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		AttributesPackageImpl theAttributesPackage = (AttributesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AttributesPackage.eNS_URI) instanceof AttributesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(AttributesPackage.eNS_URI)
				: AttributesPackage.eINSTANCE);

		// Create package meta-data objects
		theTimePackage.createPackageContents();
		theBasePackage.createPackageContents();
		theAttributesPackage.createPackageContents();

		// Initialize created meta-data
		theTimePackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theAttributesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimePackage.eNS_URI, theTimePackage);
		return theTimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeDefinition() {
		return timeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDefinition_Token() {
		return (EAttribute) timeDefinitionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeDefinition_Days() {
		return (EReference) timeDefinitionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDefinition_Ranges() {
		return (EAttribute) timeDefinitionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayRange() {
		return dayRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayRange_Start() {
		return (EAttribute) dayRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayRange_End() {
		return (EAttribute) dayRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateSpec() {
		return dateSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateSpec_Divisor() {
		return (EAttribute) dateSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonthSpec() {
		return monthSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthSpec_Month() {
		return (EAttribute) monthSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthSpec_Day() {
		return (EAttribute) monthSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonthRange() {
		return monthRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonthRange_Start() {
		return (EReference) monthRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonthRange_End() {
		return (EReference) monthRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeekdaySpec() {
		return weekdaySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekdaySpec_Day() {
		return (EAttribute) weekdaySpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekdaySpec_Selector() {
		return (EAttribute) weekdaySpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekdaySpec_Month() {
		return (EAttribute) weekdaySpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeekdayRange() {
		return weekdayRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeekdayRange_Start() {
		return (EReference) weekdayRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeekdayRange_End() {
		return (EReference) weekdayRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericDateRange() {
		return numericDateRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericDateRange_Start() {
		return (EAttribute) numericDateRangeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericDateRange_End() {
		return (EAttribute) numericDateRangeEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFactory getTimeFactory() {
		return (TimeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		timeDefinitionEClass = createEClass(TIME_DEFINITION);
		createEAttribute(timeDefinitionEClass, TIME_DEFINITION__TOKEN);
		createEReference(timeDefinitionEClass, TIME_DEFINITION__DAYS);
		createEAttribute(timeDefinitionEClass, TIME_DEFINITION__RANGES);

		dayRangeEClass = createEClass(DAY_RANGE);
		createEAttribute(dayRangeEClass, DAY_RANGE__START);
		createEAttribute(dayRangeEClass, DAY_RANGE__END);

		dateSpecEClass = createEClass(DATE_SPEC);
		createEAttribute(dateSpecEClass, DATE_SPEC__DIVISOR);

		monthSpecEClass = createEClass(MONTH_SPEC);
		createEAttribute(monthSpecEClass, MONTH_SPEC__MONTH);
		createEAttribute(monthSpecEClass, MONTH_SPEC__DAY);

		monthRangeEClass = createEClass(MONTH_RANGE);
		createEReference(monthRangeEClass, MONTH_RANGE__START);
		createEReference(monthRangeEClass, MONTH_RANGE__END);

		weekdaySpecEClass = createEClass(WEEKDAY_SPEC);
		createEAttribute(weekdaySpecEClass, WEEKDAY_SPEC__DAY);
		createEAttribute(weekdaySpecEClass, WEEKDAY_SPEC__SELECTOR);
		createEAttribute(weekdaySpecEClass, WEEKDAY_SPEC__MONTH);

		weekdayRangeEClass = createEClass(WEEKDAY_RANGE);
		createEReference(weekdayRangeEClass, WEEKDAY_RANGE__START);
		createEReference(weekdayRangeEClass, WEEKDAY_RANGE__END);

		numericDateRangeEClass = createEClass(NUMERIC_DATE_RANGE);
		createEAttribute(numericDateRangeEClass, NUMERIC_DATE_RANGE__START);
		createEAttribute(numericDateRangeEClass, NUMERIC_DATE_RANGE__END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage) EPackage.Registry.INSTANCE
				.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timeDefinitionEClass.getESuperTypes()
				.add(theBasePackage.getAttribute());
		dayRangeEClass.getESuperTypes().add(this.getDateSpec());
		monthRangeEClass.getESuperTypes().add(this.getDateSpec());
		weekdayRangeEClass.getESuperTypes().add(this.getDateSpec());
		numericDateRangeEClass.getESuperTypes().add(this.getDateSpec());

		// Initialize classes and features; add operations and parameters
		initEClass(timeDefinitionEClass, TimeDefinition.class,
				"TimeDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeDefinition_Token(), ecorePackage.getEString(),
				"token", "HH:MM", 0, 1, TimeDefinition.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeDefinition_Days(), this.getDateSpec(), null,
				"days", null, 0, 1, TimeDefinition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDefinition_Ranges(),
				theBasePackage.getTimeRange(), "ranges", null, 0, -1,
				TimeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dayRangeEClass, DayRange.class, "DayRange", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDayRange_Start(), ecorePackage.getEInt(), "start",
				null, 1, 1, DayRange.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDayRange_End(), ecorePackage.getEInt(), "end", null,
				0, 1, DayRange.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dateSpecEClass, DateSpec.class, "DateSpec", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateSpec_Divisor(), ecorePackage.getEInt(),
				"divisor", null, 0, 1, DateSpec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(monthSpecEClass, MonthSpec.class, "MonthSpec", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonthSpec_Month(), theBasePackage.getMonth(),
				"month", null, 0, 1, MonthSpec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonthSpec_Day(), ecorePackage.getEInt(), "day", null,
				0, 1, MonthSpec.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(monthRangeEClass, MonthRange.class, "MonthRange",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonthRange_Start(), this.getMonthSpec(), null,
				"start", null, 1, 1, MonthRange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonthRange_End(), this.getMonthSpec(), null, "end",
				null, 0, 1, MonthRange.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weekdaySpecEClass, WeekdaySpec.class, "WeekdaySpec",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeekdaySpec_Day(), theBasePackage.getWeekday(),
				"day", null, 0, 1, WeekdaySpec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeekdaySpec_Selector(), ecorePackage.getEInt(),
				"selector", null, 0, -1, WeekdaySpec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeekdaySpec_Month(), theBasePackage.getMonth(),
				"month", null, 0, 1, WeekdaySpec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(weekdayRangeEClass, WeekdayRange.class, "WeekdayRange",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeekdayRange_Start(), this.getWeekdaySpec(), null,
				"start", null, 1, 1, WeekdayRange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeekdayRange_End(), this.getWeekdaySpec(), null,
				"end", null, 0, 1, WeekdayRange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericDateRangeEClass, NumericDateRange.class,
				"NumericDateRange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericDateRange_Start(), theBasePackage.getDate(),
				"start", null, 1, 1, NumericDateRange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericDateRange_End(), theBasePackage.getDate(),
				"end", null, 0, 1, NumericDateRange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
	}

} //TimePackageImpl
