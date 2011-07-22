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
 * A representation of the literals of the enumeration '<em><b>Weekday</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.BasePackage#getWeekday()
 * @model
 * @generated
 */
public enum Weekday implements Enumerator {
	/**
	 * The '<em><b>SU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SU_VALUE
	 * @generated
	 * @ordered
	 */
	SU(0, "SU", "sunday"),

	/**
	 * The '<em><b>MO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MO_VALUE
	 * @generated
	 * @ordered
	 */
	MO(1, "MO", "monday"),

	/**
	 * The '<em><b>TU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TU_VALUE
	 * @generated
	 * @ordered
	 */
	TU(2, "TU", "tuesday"),

	/**
	 * The '<em><b>WE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WE_VALUE
	 * @generated
	 * @ordered
	 */
	WE(3, "WE", "wednesday"),

	/**
	 * The '<em><b>TH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TH_VALUE
	 * @generated
	 * @ordered
	 */
	TH(4, "TH", "thursday"),

	/**
	 * The '<em><b>FR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FR_VALUE
	 * @generated
	 * @ordered
	 */
	FR(5, "FR", "friday"),

	/**
	 * The '<em><b>SA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SA_VALUE
	 * @generated
	 * @ordered
	 */
	SA(6, "SA", "saturday");

	/**
	 * The '<em><b>SU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SU
	 * @model literal="sunday"
	 * @generated
	 * @ordered
	 */
	public static final int SU_VALUE = 0;

	/**
	 * The '<em><b>MO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MO
	 * @model literal="monday"
	 * @generated
	 * @ordered
	 */
	public static final int MO_VALUE = 1;

	/**
	 * The '<em><b>TU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TU
	 * @model literal="tuesday"
	 * @generated
	 * @ordered
	 */
	public static final int TU_VALUE = 2;

	/**
	 * The '<em><b>WE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WE
	 * @model literal="wednesday"
	 * @generated
	 * @ordered
	 */
	public static final int WE_VALUE = 3;

	/**
	 * The '<em><b>TH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TH
	 * @model literal="thursday"
	 * @generated
	 * @ordered
	 */
	public static final int TH_VALUE = 4;

	/**
	 * The '<em><b>FR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FR
	 * @model literal="friday"
	 * @generated
	 * @ordered
	 */
	public static final int FR_VALUE = 5;

	/**
	 * The '<em><b>SA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SA
	 * @model literal="saturday"
	 * @generated
	 * @ordered
	 */
	public static final int SA_VALUE = 6;

	/**
	 * An array of all the '<em><b>Weekday</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Weekday[] VALUES_ARRAY = new Weekday[] { SU, MO, TU,
			WE, TH, FR, SA, };

	/**
	 * A public read-only list of all the '<em><b>Weekday</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Weekday> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weekday</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Weekday get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Weekday result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weekday</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Weekday getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Weekday result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weekday</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Weekday get(int value) {
		switch (value) {
		case SU_VALUE:
			return SU;
		case MO_VALUE:
			return MO;
		case TU_VALUE:
			return TU;
		case WE_VALUE:
			return WE;
		case TH_VALUE:
			return TH;
		case FR_VALUE:
			return FR;
		case SA_VALUE:
			return SA;
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
	private Weekday(int value, String name, String literal) {
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

} //Weekday
