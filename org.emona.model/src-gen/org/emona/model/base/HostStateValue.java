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
 * A representation of the literals of the enumeration '<em><b>Host State Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.BasePackage#getHostStateValue()
 * @model
 * @generated
 */
public enum HostStateValue implements Enumerator {
	/**
	 * The '<em><b>UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(0, "UP", "o"),

	/**
	 * The '<em><b>DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN(1, "DOWN", "d"),

	/**
	 * The '<em><b>UNREACHABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREACHABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNREACHABLE(2, "UNREACHABLE", "u"), /**
										 * The '<em><b>PENDING</b></em>' literal object.
										 * <!-- begin-user-doc -->
										 * <!-- end-user-doc -->
										 * @see #PENDING_VALUE
										 * @generated
										 * @ordered
										 */
	PENDING(3, "PENDING", "p"), /**
								 * The '<em><b>FLAPPING</b></em>' literal object.
								 * <!-- begin-user-doc -->
								 * <!-- end-user-doc -->
								 * @see #FLAPPING_VALUE
								 * @generated
								 * @ordered
								 */
	FLAPPING(4, "FLAPPING", "f"), /**
									 * The '<em><b>SCHEDULEDDOWNTIME</b></em>' literal object.
									 * <!-- begin-user-doc -->
									 * <!-- end-user-doc -->
									 * @see #SCHEDULEDDOWNTIME_VALUE
									 * @generated
									 * @ordered
									 */
	SCHEDULEDDOWNTIME(5, "SCHEDULEDDOWNTIME", "s"), /**
													 * The '<em><b>NONE</b></em>' literal object.
													 * <!-- begin-user-doc -->
													 * <!-- end-user-doc -->
													 * @see #NONE_VALUE
													 * @generated
													 * @ordered
													 */
	NONE(6, "NONE", "n");

	/**
	 * The '<em><b>UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UP
	 * @model literal="o"
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 0;

	/**
	 * The '<em><b>DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWN
	 * @model literal="d"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_VALUE = 1;

	/**
	 * The '<em><b>UNREACHABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNREACHABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNREACHABLE
	 * @model literal="u"
	 * @generated
	 * @ordered
	 */
	public static final int UNREACHABLE_VALUE = 2;

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
	public static final int PENDING_VALUE = 3;

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
	public static final int FLAPPING_VALUE = 4;

	/**
	 * The '<em><b>SCHEDULEDDOWNTIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCHEDULEDDOWNTIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEDULEDDOWNTIME
	 * @model literal="s"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULEDDOWNTIME_VALUE = 5;

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
	 * An array of all the '<em><b>Host State Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HostStateValue[] VALUES_ARRAY = new HostStateValue[] {
			UP, DOWN, UNREACHABLE, PENDING, FLAPPING, SCHEDULEDDOWNTIME, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Host State Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HostStateValue> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Host State Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HostStateValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostStateValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host State Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HostStateValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostStateValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host State Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HostStateValue get(int value) {
		switch (value) {
		case UP_VALUE:
			return UP;
		case DOWN_VALUE:
			return DOWN;
		case UNREACHABLE_VALUE:
			return UNREACHABLE;
		case PENDING_VALUE:
			return PENDING;
		case FLAPPING_VALUE:
			return FLAPPING;
		case SCHEDULEDDOWNTIME_VALUE:
			return SCHEDULEDDOWNTIME;
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
	private HostStateValue(int value, String name, String literal) {
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

} //HostStateValue
