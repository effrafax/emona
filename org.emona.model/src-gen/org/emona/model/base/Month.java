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
 * A representation of the literals of the enumeration '<em><b>Month</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.BasePackage#getMonth()
 * @model
 * @generated
 */
public enum Month implements Enumerator {
	/**
	 * The '<em><b>JAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAN_VALUE
	 * @generated
	 * @ordered
	 */
	JAN(1, "JAN", "january"),

	/**
	 * The '<em><b>FEB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEB_VALUE
	 * @generated
	 * @ordered
	 */
	FEB(2, "FEB", "february"),

	/**
	 * The '<em><b>MAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAR_VALUE
	 * @generated
	 * @ordered
	 */
	MAR(3, "MAR", "march"),

	/**
	 * The '<em><b>APR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APR_VALUE
	 * @generated
	 * @ordered
	 */
	APR(4, "APR", "april"),

	/**
	 * The '<em><b>MAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAY_VALUE
	 * @generated
	 * @ordered
	 */
	MAY(5, "MAY", "may"),

	/**
	 * The '<em><b>JUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUN_VALUE
	 * @generated
	 * @ordered
	 */
	JUN(6, "JUN", "june"),

	/**
	 * The '<em><b>JUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUL_VALUE
	 * @generated
	 * @ordered
	 */
	JUL(7, "JUL", "july"),

	/**
	 * The '<em><b>AUG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUG_VALUE
	 * @generated
	 * @ordered
	 */
	AUG(8, "AUG", "august"),

	/**
	 * The '<em><b>SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEP_VALUE
	 * @generated
	 * @ordered
	 */
	SEP(9, "SEP", "september"),

	/**
	 * The '<em><b>OCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCT_VALUE
	 * @generated
	 * @ordered
	 */
	OCT(10, "OCT", "october"),

	/**
	 * The '<em><b>NOV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOV_VALUE
	 * @generated
	 * @ordered
	 */
	NOV(11, "NOV", "november"),

	/**
	 * The '<em><b>DEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEC_VALUE
	 * @generated
	 * @ordered
	 */
	DEC(12, "DEC", "december");

	/**
	 * The '<em><b>JAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAN
	 * @model literal="january"
	 * @generated
	 * @ordered
	 */
	public static final int JAN_VALUE = 1;

	/**
	 * The '<em><b>FEB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FEB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEB
	 * @model literal="february"
	 * @generated
	 * @ordered
	 */
	public static final int FEB_VALUE = 2;

	/**
	 * The '<em><b>MAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAR
	 * @model literal="march"
	 * @generated
	 * @ordered
	 */
	public static final int MAR_VALUE = 3;

	/**
	 * The '<em><b>APR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APR
	 * @model literal="april"
	 * @generated
	 * @ordered
	 */
	public static final int APR_VALUE = 4;

	/**
	 * The '<em><b>MAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAY
	 * @model literal="may"
	 * @generated
	 * @ordered
	 */
	public static final int MAY_VALUE = 5;

	/**
	 * The '<em><b>JUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JUN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUN
	 * @model literal="june"
	 * @generated
	 * @ordered
	 */
	public static final int JUN_VALUE = 6;

	/**
	 * The '<em><b>JUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JUL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUL
	 * @model literal="july"
	 * @generated
	 * @ordered
	 */
	public static final int JUL_VALUE = 7;

	/**
	 * The '<em><b>AUG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUG
	 * @model literal="august"
	 * @generated
	 * @ordered
	 */
	public static final int AUG_VALUE = 8;

	/**
	 * The '<em><b>SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEP
	 * @model literal="september"
	 * @generated
	 * @ordered
	 */
	public static final int SEP_VALUE = 9;

	/**
	 * The '<em><b>OCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCT
	 * @model literal="october"
	 * @generated
	 * @ordered
	 */
	public static final int OCT_VALUE = 10;

	/**
	 * The '<em><b>NOV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOV
	 * @model literal="november"
	 * @generated
	 * @ordered
	 */
	public static final int NOV_VALUE = 11;

	/**
	 * The '<em><b>DEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEC
	 * @model literal="december"
	 * @generated
	 * @ordered
	 */
	public static final int DEC_VALUE = 12;

	/**
	 * An array of all the '<em><b>Month</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Month[] VALUES_ARRAY = new Month[] { JAN, FEB, MAR,
			APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC, };

	/**
	 * A public read-only list of all the '<em><b>Month</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Month> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Month</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Month get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Month result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Month</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Month getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Month result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Month</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Month get(int value) {
		switch (value) {
		case JAN_VALUE:
			return JAN;
		case FEB_VALUE:
			return FEB;
		case MAR_VALUE:
			return MAR;
		case APR_VALUE:
			return APR;
		case MAY_VALUE:
			return MAY;
		case JUN_VALUE:
			return JUN;
		case JUL_VALUE:
			return JUL;
		case AUG_VALUE:
			return AUG;
		case SEP_VALUE:
			return SEP;
		case OCT_VALUE:
			return OCT;
		case NOV_VALUE:
			return NOV;
		case DEC_VALUE:
			return DEC;
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
	private Month(int value, String name, String literal) {
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

} //Month
