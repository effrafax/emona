/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.emona.model.base.Attribute;
import org.emona.model.base.BasePackage;
import org.emona.model.base.ConfigObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Config Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emona.model.base.impl.ConfigObjectImpl#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigObjectImpl extends InfoObjectImpl implements ConfigObject {

	/**
	 * This adapter tracks
	 * 
	 * @author martin
	 * 
	 */
	private class AttributeObserver extends EContentAdapter {
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse
		 * .emf.common.notify.Notification)
		 */
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() == ConfigObjectImpl.this) {
				super.notifyChanged(notification);
				try {
					switch (notification.getEventType()) {
					case Notification.ADD:
						if (notification.getNewValue() instanceof Attribute) {
							Attribute att = (Attribute) notification
									.getNewValue();
							String token = att.getToken();
							if (currentTokens.contains(token)
									&& !att.isMultiline()) {
								System.err.println("Token already defined! "
										+ token);
							} else {
								currentTokens.add(token);
							}
						}
						break;
					case Notification.REMOVE:
						if (notification.getNewValue() instanceof Attribute) {
							currentTokens.remove(((Attribute) notification
									.getOldValue()).getToken());
						}

					default:
						System.err.println("UNNOTICED NOTIF: " + notification);
						break;
					}
				} catch (UnsupportedOperationException e) {
					System.err.println(e);
					System.err.println(notification);
					System.err.println(notification.getNewValue());
				}
			}
		}
	}

	private HashSet<String> currentTokens;

	/**
	 * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attr;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ConfigObjectImpl() {
		super();
		doInit();
	}

	/**
	 * 
	 */
	private void doInit() {
		currentTokens = new HashSet<String>();
		this.eAdapters().add(new AttributeObserver());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.CONFIG_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttr() {
		if (attr == null) {
			attr = new EObjectContainmentEList<Attribute>(Attribute.class,
					this, BasePackage.CONFIG_OBJECT__ATTR);
		}
		return attr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasAttribute(String token) {
		return currentTokens.contains(token);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasePackage.CONFIG_OBJECT__ATTR:
			return ((InternalEList<?>) getAttr()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasePackage.CONFIG_OBJECT__ATTR:
			return getAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasePackage.CONFIG_OBJECT__ATTR:
			getAttr().clear();
			getAttr().addAll((Collection<? extends Attribute>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BasePackage.CONFIG_OBJECT__ATTR:
			getAttr().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BasePackage.CONFIG_OBJECT__ATTR:
			return attr != null && !attr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConfigObjectImpl
