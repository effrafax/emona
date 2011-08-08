/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service State Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.BasePackage#getServiceStateValue()
 * @model
 * @generated
 */
public enum ServiceStateValue implements Enumerator {
	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(0, "OK", "o"),

	/**
	 * The '<em><b>WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(1, "WARNING", "w"),

	/**
	 * The '<em><b>CRITICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(2, "CRITICAL", "c"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(3, "UNKNOWN", "u"), /**
								 * The '<em><b>PENDING</b></em>' literal object.
								 * <!-- begin-user-doc -->
								 * <!-- end-user-doc -->
								 * @see #PENDING_VALUE
								 * @generated
								 * @ordered
								 */
	PENDING(4, "PENDING", "p"), /**
								 * The '<em><b>FLAPPING</b></em>' literal object.
								 * <!-- begin-user-doc -->
								 * <!-- end-user-doc -->
								 * @see #FLAPPING_VALUE
								 * @generated
								 * @ordered
								 */
	FLAPPING(5, "FLAPPING", "f"), /**
									 * The '<em><b>NONE</b></em>' literal object.
									 * <!-- begin-user-doc -->
									 * <!-- end-user-doc -->
									 * @see #NONE_VALUE
									 * @generated
									 * @ordered
									 */
	NONE(6, "NONE", "n");

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model literal="o"
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 0;

	/**
	 * The '<em><b>WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @model literal="w"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 1;

	/**
	 * The '<em><b>CRITICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRITICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model literal="c"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 2;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model literal="u"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 3;

	/**
	 * The '<em><b>PENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENDING
	 * @model literal="p"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_VALUE = 4;

	/**
	 * The '<em><b>FLAPPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLAPPING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAPPING
	 * @model literal="f"
	 * @generated
	 * @ordered
	 */
	public static final int FLAPPING_VALUE = 5;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model literal="n"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Service State Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceStateValue[] VALUES_ARRAY = new ServiceStateValue[] {
			OK, WARNING, CRITICAL, UNKNOWN, PENDING, FLAPPING, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Service State Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceStateValue> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service State Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceStateValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceStateValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service State Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceStateValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceStateValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service State Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceStateValue get(int value) {
		switch (value) {
		case OK_VALUE:
			return OK;
		case WARNING_VALUE:
			return WARNING;
		case CRITICAL_VALUE:
			return CRITICAL;
		case UNKNOWN_VALUE:
			return UNKNOWN;
		case PENDING_VALUE:
			return PENDING;
		case FLAPPING_VALUE:
			return FLAPPING;
		case NONE_VALUE:
			return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ServiceStateValue(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ServiceStateValue
