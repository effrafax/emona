/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.time.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emona.model.base.Attribute;

import org.emona.model.base.ObjectContent;
import org.emona.model.base.attributes.time.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.time.TimePackage
 * @generated
 */
public class TimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSwitch<Adapter> modelSwitch = new TimeSwitch<Adapter>() {
		@Override
		public Adapter caseTimeDefinition(TimeDefinition object) {
			return createTimeDefinitionAdapter();
		}

		@Override
		public Adapter caseDayRange(DayRange object) {
			return createDayRangeAdapter();
		}

		@Override
		public Adapter caseDateSpec(DateSpec object) {
			return createDateSpecAdapter();
		}

		@Override
		public Adapter caseMonthSpec(MonthSpec object) {
			return createMonthSpecAdapter();
		}

		@Override
		public Adapter caseMonthRange(MonthRange object) {
			return createMonthRangeAdapter();
		}

		@Override
		public Adapter caseWeekdaySpec(WeekdaySpec object) {
			return createWeekdaySpecAdapter();
		}

		@Override
		public Adapter caseWeekdayRange(WeekdayRange object) {
			return createWeekdayRangeAdapter();
		}

		@Override
		public Adapter caseNumericDateRange(NumericDateRange object) {
			return createNumericDateRangeAdapter();
		}

		@Override
		public Adapter caseObjectContent(ObjectContent object) {
			return createObjectContentAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.TimeDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.TimeDefinition
	 * @generated
	 */
	public Adapter createTimeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.DayRange <em>Day Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.DayRange
	 * @generated
	 */
	public Adapter createDayRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.DateSpec <em>Date Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.DateSpec
	 * @generated
	 */
	public Adapter createDateSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.MonthSpec <em>Month Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.MonthSpec
	 * @generated
	 */
	public Adapter createMonthSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.MonthRange <em>Month Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.MonthRange
	 * @generated
	 */
	public Adapter createMonthRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.WeekdaySpec <em>Weekday Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.WeekdaySpec
	 * @generated
	 */
	public Adapter createWeekdaySpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.WeekdayRange <em>Weekday Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.WeekdayRange
	 * @generated
	 */
	public Adapter createWeekdayRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.time.NumericDateRange <em>Numeric Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.time.NumericDateRange
	 * @generated
	 */
	public Adapter createNumericDateRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ObjectContent <em>Object Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ObjectContent
	 * @generated
	 */
	public Adapter createObjectContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TimeAdapterFactory
