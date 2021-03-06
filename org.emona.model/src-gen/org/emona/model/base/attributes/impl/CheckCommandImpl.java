/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.CheckCommand;
import org.emona.model.base.attributes.CommandName;

import org.emona.model.base.impl.ReferenceAttributeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.attributes.impl.CheckCommandImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.CheckCommandImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.emona.model.base.attributes.impl.CheckCommandImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckCommandImpl extends ReferenceAttributeImpl implements
		CheckCommand {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected CommandName reference;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "check_command";

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributesPackage.Literals.CHECK_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandName getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (CommandName) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AttributesPackage.CHECK_COMMAND__REFERENCE,
							oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandName basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(CommandName newReference) {
		CommandName oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AttributesPackage.CHECK_COMMAND__REFERENCE, oldReference,
					reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this,
					AttributesPackage.CHECK_COMMAND__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AttributesPackage.CHECK_COMMAND__REFERENCE:
			if (resolve)
				return getReference();
			return basicGetReference();
		case AttributesPackage.CHECK_COMMAND__TOKEN:
			return getToken();
		case AttributesPackage.CHECK_COMMAND__ARGS:
			return getArgs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AttributesPackage.CHECK_COMMAND__REFERENCE:
			setReference((CommandName) newValue);
			return;
		case AttributesPackage.CHECK_COMMAND__ARGS:
			getArgs().clear();
			getArgs().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AttributesPackage.CHECK_COMMAND__REFERENCE:
			setReference((CommandName) null);
			return;
		case AttributesPackage.CHECK_COMMAND__ARGS:
			getArgs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AttributesPackage.CHECK_COMMAND__REFERENCE:
			return reference != null;
		case AttributesPackage.CHECK_COMMAND__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT
					.equals(token);
		case AttributesPackage.CHECK_COMMAND__ARGS:
			return args != null && !args.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (token: ");
		result.append(token);
		result.append(", args: ");
		result.append(args);
		result.append(')');
		return result.toString();
	}

} //CheckCommandImpl
