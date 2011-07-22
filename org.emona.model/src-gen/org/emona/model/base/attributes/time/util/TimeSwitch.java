/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emona.model.base.Attribute;

import org.emona.model.base.attributes.time.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.time.TimePackage
 * @generated
 */
public class TimeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSwitch() {
		if (modelPackage == null) {
			modelPackage = TimePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TimePackage.TIME_DEFINITION: {
			TimeDefinition timeDefinition = (TimeDefinition) theEObject;
			T result = caseTimeDefinition(timeDefinition);
			if (result == null)
				result = caseAttribute(timeDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TimePackage.DAY_RANGE: {
			DayRange dayRange = (DayRange) theEObject;
			T result = caseDayRange(dayRange);
			if (result == null)
				result = caseDateSpec(dayRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TimePackage.DATE_SPEC: {
			DateSpec dateSpec = (DateSpec) theEObject;
			T result = caseDateSpec(dateSpec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TimePackage.MONTH_SPEC: {
			MonthSpec monthSpec = (MonthSpec) theEObject;
			T result = caseMonthSpec(monthSpec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TimePackage.MONTH_RANGE: {
			MonthRange monthRange = (MonthRange) theEObject;
			T result = caseMonthRange(monthRange);
			if (result == null)
				result = caseDateSpec(monthRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TimePackage.WEEKDAY_SPEC: {
			WeekdaySpec weekdaySpec = (WeekdaySpec) theEObject;
			T result = caseWeekdaySpec(weekdaySpec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TimePackage.WEEKDAY_RANGE: {
			WeekdayRange weekdayRange = (WeekdayRange) theEObject;
			T result = caseWeekdayRange(weekdayRange);
			if (result == null)
				result = caseDateSpec(weekdayRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TimePackage.NUMERIC_DATE_RANGE: {
			NumericDateRange numericDateRange = (NumericDateRange) theEObject;
			T result = caseNumericDateRange(numericDateRange);
			if (result == null)
				result = caseDateSpec(numericDateRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDefinition(TimeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayRange(DayRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateSpec(DateSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthSpec(MonthSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthRange(MonthRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weekday Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weekday Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekdaySpec(WeekdaySpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weekday Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weekday Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekdayRange(WeekdayRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Date Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Date Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericDateRange(NumericDateRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TimeSwitch
