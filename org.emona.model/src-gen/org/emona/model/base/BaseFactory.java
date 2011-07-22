/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.BasePackage
 * @generated
 */
public interface BaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaseFactory eINSTANCE = org.emona.model.base.impl.BaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mon Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mon Object</em>'.
	 * @generated
	 */
	MonObject createMonObject();

	/**
	 * Returns a new object of class '<em>Boolean Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Attribute</em>'.
	 * @generated
	 */
	BooleanAttribute createBooleanAttribute();

	/**
	 * Returns a new object of class '<em>Reference Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Attribute</em>'.
	 * @generated
	 */
	ReferenceAttribute createReferenceAttribute();

	/**
	 * Returns a new object of class '<em>Integer Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Attribute</em>'.
	 * @generated
	 */
	IntegerValueAttribute createIntegerValueAttribute();

	/**
	 * Returns a new object of class '<em>Service Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Failure Criteria</em>'.
	 * @generated
	 */
	ServiceFailureCriteria createServiceFailureCriteria();

	/**
	 * Returns a new object of class '<em>Service State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service State</em>'.
	 * @generated
	 */
	ServiceState createServiceState();

	/**
	 * Returns a new object of class '<em>Service Notification Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Notification Option</em>'.
	 * @generated
	 */
	ServiceNotificationOption createServiceNotificationOption();

	/**
	 * Returns a new object of class '<em>Host State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host State</em>'.
	 * @generated
	 */
	HostState createHostState();

	/**
	 * Returns a new object of class '<em>Host Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Failure Criteria</em>'.
	 * @generated
	 */
	HostFailureCriteria createHostFailureCriteria();

	/**
	 * Returns a new object of class '<em>Config Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Object</em>'.
	 * @generated
	 */
	ConfigObject createConfigObject();

	/**
	 * Returns a new object of class '<em>Info Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info Object</em>'.
	 * @generated
	 */
	InfoObject createInfoObject();

	/**
	 * Returns a new object of class '<em>Comment Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Line</em>'.
	 * @generated
	 */
	CommentLine createCommentLine();

	/**
	 * Returns a new object of class '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host</em>'.
	 * @generated
	 */
	Host createHost();

	/**
	 * Returns a new object of class '<em>Hostgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostgroup</em>'.
	 * @generated
	 */
	Hostgroup createHostgroup();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Servicegroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicegroup</em>'.
	 * @generated
	 */
	Servicegroup createServicegroup();

	/**
	 * Returns a new object of class '<em>Servicedependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicedependency</em>'.
	 * @generated
	 */
	Servicedependency createServicedependency();

	/**
	 * Returns a new object of class '<em>Hostdependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostdependency</em>'.
	 * @generated
	 */
	Hostdependency createHostdependency();

	/**
	 * Returns a new object of class '<em>Serviceescalation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serviceescalation</em>'.
	 * @generated
	 */
	Serviceescalation createServiceescalation();

	/**
	 * Returns a new object of class '<em>Hostescalation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostescalation</em>'.
	 * @generated
	 */
	Hostescalation createHostescalation();

	/**
	 * Returns a new object of class '<em>Serviceextinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serviceextinfo</em>'.
	 * @generated
	 */
	Serviceextinfo createServiceextinfo();

	/**
	 * Returns a new object of class '<em>Hostextinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostextinfo</em>'.
	 * @generated
	 */
	Hostextinfo createHostextinfo();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Timeperiod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeperiod</em>'.
	 * @generated
	 */
	Timeperiod createTimeperiod();

	/**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
	Contact createContact();

	/**
	 * Returns a new object of class '<em>Contactgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contactgroup</em>'.
	 * @generated
	 */
	Contactgroup createContactgroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasePackage getBasePackage();

} //BaseFactory
