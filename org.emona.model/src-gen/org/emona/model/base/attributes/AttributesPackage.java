/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emona.model.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.AttributesFactory
 * @model kind="package"
 * @generated
 */
public interface AttributesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "attributes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emona.org/model/base/attributes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eatt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributesPackage eINSTANCE = org.emona.model.base.attributes.impl.AttributesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.AliasImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostInitialStateImpl <em>Host Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostInitialStateImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostInitialState()
	 * @generated
	 */
	int HOST_INITIAL_STATE = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INITIAL_STATE__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INITIAL_STATE__VALUE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INITIAL_STATE__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INITIAL_STATE_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostgroupsImpl <em>Hostgroups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostgroupsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroups()
	 * @generated
	 */
	int HOSTGROUPS = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUPS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUPS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUPS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hostgroups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUPS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ParentsImpl <em>Parents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ParentsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getParents()
	 * @generated
	 */
	int PARENTS = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.AddressImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__VALUE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.DisplayNameImpl <em>Display Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.DisplayNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDisplayName()
	 * @generated
	 */
	int DISPLAY_NAME = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.RegisterImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.UseImpl <em>Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.UseImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getUse()
	 * @generated
	 */
	int USE = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.TimeperiodNameImpl <em>Timeperiod Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.TimeperiodNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTimeperiodName()
	 * @generated
	 */
	int TIMEPERIOD_NAME = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPERIOD_NAME__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPERIOD_NAME__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPERIOD_NAME__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timeperiod Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPERIOD_NAME_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostgroupNameImpl <em>Hostgroup Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostgroupNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroupName()
	 * @generated
	 */
	int HOSTGROUP_NAME = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hostgroup Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostNameImpl <em>Host Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostName()
	 * @generated
	 */
	int HOST_NAME = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Host Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.TemplateNameImpl <em>Template Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.TemplateNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTemplateName()
	 * @generated
	 */
	int TEMPLATE_NAME = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NAME__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NAME__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NAME__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_NAME_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.CommandLineImpl <em>Command Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.CommandLineImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCommandLine()
	 * @generated
	 */
	int COMMAND_LINE = 12;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.CommandNameImpl <em>Command Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.CommandNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCommandName()
	 * @generated
	 */
	int COMMAND_NAME = 13;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_NAME__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_NAME__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_NAME__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_NAME_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.MaxCheckAttemptsImpl <em>Max Check Attempts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.MaxCheckAttemptsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getMaxCheckAttempts()
	 * @generated
	 */
	int MAX_CHECK_ATTEMPTS = 14;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CHECK_ATTEMPTS__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CHECK_ATTEMPTS__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CHECK_ATTEMPTS__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Check Attempts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CHECK_ATTEMPTS_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.CheckIntervalImpl <em>Check Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.CheckIntervalImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckInterval()
	 * @generated
	 */
	int CHECK_INTERVAL = 15;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_INTERVAL__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_INTERVAL__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_INTERVAL__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_INTERVAL_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.RetryIntervalImpl <em>Retry Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.RetryIntervalImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRetryInterval()
	 * @generated
	 */
	int RETRY_INTERVAL = 16;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_INTERVAL__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_INTERVAL__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_INTERVAL__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retry Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_INTERVAL_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ActiveChecksEnabledImpl <em>Active Checks Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ActiveChecksEnabledImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getActiveChecksEnabled()
	 * @generated
	 */
	int ACTIVE_CHECKS_ENABLED = 17;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CHECKS_ENABLED__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CHECKS_ENABLED__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CHECKS_ENABLED__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Checks Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CHECKS_ENABLED_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.PassiveChecksEnabledImpl <em>Passive Checks Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.PassiveChecksEnabledImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getPassiveChecksEnabled()
	 * @generated
	 */
	int PASSIVE_CHECKS_ENABLED = 18;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CHECKS_ENABLED__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CHECKS_ENABLED__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CHECKS_ENABLED__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passive Checks Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CHECKS_ENABLED_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.CheckPeriodImpl <em>Check Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.CheckPeriodImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckPeriod()
	 * @generated
	 */
	int CHECK_PERIOD = 19;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_PERIOD__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_PERIOD__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_PERIOD__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_PERIOD_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.CheckCommandImpl <em>Check Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.CheckCommandImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckCommand()
	 * @generated
	 */
	int CHECK_COMMAND = 20;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COMMAND__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COMMAND__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COMMAND__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COMMAND_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.TimeExcludeImpl <em>Time Exclude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.TimeExcludeImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTimeExclude()
	 * @generated
	 */
	int TIME_EXCLUDE = 21;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXCLUDE__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXCLUDE__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXCLUDE__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Exclude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXCLUDE_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ContactNameImpl <em>Contact Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ContactNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactName()
	 * @generated
	 */
	int CONTACT_NAME = 22;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NAME__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NAME__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NAME__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NAME_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.NotificationsEnabledImpl <em>Notifications Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.NotificationsEnabledImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationsEnabled()
	 * @generated
	 */
	int NOTIFICATIONS_ENABLED = 23;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_ENABLED__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_ENABLED__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_ENABLED__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notifications Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_ENABLED_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostNotificationsEnabledImpl <em>Host Notifications Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostNotificationsEnabledImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationsEnabled()
	 * @generated
	 */
	int HOST_NOTIFICATIONS_ENABLED = 24;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATIONS_ENABLED__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATIONS_ENABLED__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATIONS_ENABLED__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Host Notifications Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATIONS_ENABLED_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationsEnabledImpl <em>Service Notifications Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceNotificationsEnabledImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationsEnabled()
	 * @generated
	 */
	int SERVICE_NOTIFICATIONS_ENABLED = 25;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATIONS_ENABLED__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATIONS_ENABLED__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATIONS_ENABLED__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Notifications Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATIONS_ENABLED_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.NotificationPeriodImpl <em>Notification Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.NotificationPeriodImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationPeriod()
	 * @generated
	 */
	int NOTIFICATION_PERIOD = 26;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PERIOD__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PERIOD__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PERIOD__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PERIOD_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostNotificationPeriodImpl <em>Host Notification Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostNotificationPeriodImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationPeriod()
	 * @generated
	 */
	int HOST_NOTIFICATION_PERIOD = 27;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_PERIOD__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_PERIOD__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_PERIOD__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Notification Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_PERIOD_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationPeriodImpl <em>Service Notification Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceNotificationPeriodImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationPeriod()
	 * @generated
	 */
	int SERVICE_NOTIFICATION_PERIOD = 28;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_PERIOD__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_PERIOD__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_PERIOD__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Notification Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_PERIOD_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl <em>Host Notification Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostNotificationOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationOptions()
	 * @generated
	 */
	int HOST_NOTIFICATION_OPTIONS = 29;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__RECOVERY = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__DOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unreachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__UNREACHABLE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__FLAPPING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduled Downtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS__NONE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Host Notification Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl <em>Service Notification Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationOptions()
	 * @generated
	 */
	int SERVICE_NOTIFICATION_OPTIONS = 30;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__WARNING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__CRITICAL = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__UNKNOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__FLAPPING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__NONE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Service Notification Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.NotificationCommandsImpl <em>Notification Commands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.NotificationCommandsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationCommands()
	 * @generated
	 */
	int NOTIFICATION_COMMANDS = 31;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_COMMANDS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_COMMANDS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_COMMANDS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_COMMANDS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostNotificationCommandsImpl <em>Host Notification Commands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostNotificationCommandsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationCommands()
	 * @generated
	 */
	int HOST_NOTIFICATION_COMMANDS = 32;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_COMMANDS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_COMMANDS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_COMMANDS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Notification Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_COMMANDS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationCommandsImpl <em>Service Notification Commands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceNotificationCommandsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationCommands()
	 * @generated
	 */
	int SERVICE_NOTIFICATION_COMMANDS = 33;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_COMMANDS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_COMMANDS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_COMMANDS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Notification Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_COMMANDS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ContactAddressImpl <em>Contact Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ContactAddressImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactAddress()
	 * @generated
	 */
	int CONTACT_ADDRESS = 34;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_ADDRESS_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.EmailImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 35;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__VALUE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.PagerImpl <em>Pager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.PagerImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getPager()
	 * @generated
	 */
	int PAGER = 36;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGER__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGER__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGER__VALUE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGER_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ContactMembersImpl <em>Contact Members</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ContactMembersImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactMembers()
	 * @generated
	 */
	int CONTACT_MEMBERS = 37;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MEMBERS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MEMBERS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MEMBERS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contact Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MEMBERS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ContactGroupNameImpl <em>Contact Group Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ContactGroupNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactGroupName()
	 * @generated
	 */
	int CONTACT_GROUP_NAME = 38;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUP_NAME__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUP_NAME__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUP_NAME__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact Group Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUP_NAME_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ContactsImpl <em>Contacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ContactsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContacts()
	 * @generated
	 */
	int CONTACTS = 39;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ContactGroupsImpl <em>Contact Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ContactGroupsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactGroups()
	 * @generated
	 */
	int CONTACT_GROUPS = 40;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUPS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUPS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUPS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contact Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_GROUPS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.NotificationIntervalImpl <em>Notification Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.NotificationIntervalImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationInterval()
	 * @generated
	 */
	int NOTIFICATION_INTERVAL = 41;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INTERVAL__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INTERVAL__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INTERVAL__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notification Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INTERVAL_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.FirstNotificationDelayImpl <em>First Notification Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.FirstNotificationDelayImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFirstNotificationDelay()
	 * @generated
	 */
	int FIRST_NOTIFICATION_DELAY = 42;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION_DELAY__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION_DELAY__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION_DELAY__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>First Notification Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION_DELAY_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostStalkingOptionsImpl <em>Host Stalking Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostStalkingOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostStalkingOptions()
	 * @generated
	 */
	int HOST_STALKING_OPTIONS = 43;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STALKING_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STALKING_OPTIONS__UP = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STALKING_OPTIONS__DOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unreachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STALKING_OPTIONS__UNREACHABLE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STALKING_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Host Stalking Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STALKING_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.NotesImpl <em>Notes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.NotesImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotes()
	 * @generated
	 */
	int NOTES = 44;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.NotesUrlImpl <em>Notes Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.NotesUrlImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotesUrl()
	 * @generated
	 */
	int NOTES_URL = 45;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_URL__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_URL__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_URL__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notes Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_URL_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ActionUrlImpl <em>Action Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ActionUrlImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getActionUrl()
	 * @generated
	 */
	int ACTION_URL = 46;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_URL__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_URL__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_URL__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_URL_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.IconImageImpl <em>Icon Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.IconImageImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getIconImage()
	 * @generated
	 */
	int ICON_IMAGE = 47;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Icon Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.IconImageAltImpl <em>Icon Image Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.IconImageAltImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getIconImageAlt()
	 * @generated
	 */
	int ICON_IMAGE_ALT = 48;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE_ALT__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE_ALT__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE_ALT__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Icon Image Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_IMAGE_ALT_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.VrmlImageImpl <em>Vrml Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.VrmlImageImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getVrmlImage()
	 * @generated
	 */
	int VRML_IMAGE = 49;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRML_IMAGE__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRML_IMAGE__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRML_IMAGE__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vrml Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRML_IMAGE_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.StatusmapImageImpl <em>Statusmap Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.StatusmapImageImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getStatusmapImage()
	 * @generated
	 */
	int STATUSMAP_IMAGE = 50;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAP_IMAGE__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAP_IMAGE__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAP_IMAGE__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statusmap Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAP_IMAGE_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.TwoDCoordsImpl <em>Two DCoords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.TwoDCoordsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTwoDCoords()
	 * @generated
	 */
	int TWO_DCOORDS = 51;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DCOORDS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DCOORDS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xcoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DCOORDS__XCOORD = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ycoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DCOORDS__YCOORD = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Two DCoords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_DCOORDS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ThreeDCoordsImpl <em>Three DCoords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ThreeDCoordsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getThreeDCoords()
	 * @generated
	 */
	int THREE_DCOORDS = 52;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DCOORDS__COMMENT = BasePackage.VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DCOORDS__VALUE = BasePackage.VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DCOORDS__TOKEN = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xcoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DCOORDS__XCOORD = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ycoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DCOORDS__YCOORD = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zcoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DCOORDS__ZCOORD = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Three DCoords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_DCOORDS_FEATURE_COUNT = BasePackage.VALUE_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostgroupMembersImpl <em>Hostgroup Members</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostgroupMembersImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroupMembers()
	 * @generated
	 */
	int HOSTGROUP_MEMBERS = 53;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_MEMBERS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_MEMBERS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_MEMBERS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hostgroup Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_MEMBERS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostMembersImpl <em>Host Members</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostMembersImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostMembers()
	 * @generated
	 */
	int HOST_MEMBERS = 54;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_MEMBERS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_MEMBERS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_MEMBERS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_MEMBERS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostNameReferenceImpl <em>Host Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostNameReferenceImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNameReference()
	 * @generated
	 */
	int HOST_NAME_REFERENCE = 55;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME_REFERENCE__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME_REFERENCE__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME_REFERENCE__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NAME_REFERENCE_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostgroupNameReferenceImpl <em>Hostgroup Name Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostgroupNameReferenceImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroupNameReference()
	 * @generated
	 */
	int HOSTGROUP_NAME_REFERENCE = 56;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME_REFERENCE__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME_REFERENCE__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME_REFERENCE__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hostgroup Name Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_NAME_REFERENCE_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceDescriptionImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceDescription()
	 * @generated
	 */
	int SERVICE_DESCRIPTION = 57;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceInitialStateImpl <em>Service Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceInitialStateImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceInitialState()
	 * @generated
	 */
	int SERVICE_INITIAL_STATE = 58;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INITIAL_STATE__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INITIAL_STATE__VALUE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INITIAL_STATE__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INITIAL_STATE__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INITIAL_STATE_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.IsVolatileFlagImpl <em>Is Volatile Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.IsVolatileFlagImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getIsVolatileFlag()
	 * @generated
	 */
	int IS_VOLATILE_FLAG = 59;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VOLATILE_FLAG__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VOLATILE_FLAG__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VOLATILE_FLAG__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Volatile Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VOLATILE_FLAG_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ObsessOverHostImpl <em>Obsess Over Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ObsessOverHostImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getObsessOverHost()
	 * @generated
	 */
	int OBSESS_OVER_HOST = 60;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_HOST__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_HOST__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_HOST__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obsess Over Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_HOST_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ObsessOverServiceImpl <em>Obsess Over Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ObsessOverServiceImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getObsessOverService()
	 * @generated
	 */
	int OBSESS_OVER_SERVICE = 61;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_SERVICE__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_SERVICE__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_SERVICE__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obsess Over Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSESS_OVER_SERVICE_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.CheckFreshnessImpl <em>Check Freshness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.CheckFreshnessImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckFreshness()
	 * @generated
	 */
	int CHECK_FRESHNESS = 62;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FRESHNESS__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FRESHNESS__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FRESHNESS__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Freshness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FRESHNESS_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.FreshnessThresholdImpl <em>Freshness Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.FreshnessThresholdImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFreshnessThreshold()
	 * @generated
	 */
	int FRESHNESS_THRESHOLD = 63;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRESHNESS_THRESHOLD__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRESHNESS_THRESHOLD__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRESHNESS_THRESHOLD__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Freshness Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRESHNESS_THRESHOLD_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.EventHandlerImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 64;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.EventHandlerEnabledImpl <em>Event Handler Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.EventHandlerEnabledImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEventHandlerEnabled()
	 * @generated
	 */
	int EVENT_HANDLER_ENABLED = 65;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_ENABLED__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_ENABLED__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_ENABLED__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Handler Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_ENABLED_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.LowFlapThresholdImpl <em>Low Flap Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.LowFlapThresholdImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getLowFlapThreshold()
	 * @generated
	 */
	int LOW_FLAP_THRESHOLD = 66;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_FLAP_THRESHOLD__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_FLAP_THRESHOLD__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_FLAP_THRESHOLD__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Low Flap Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_FLAP_THRESHOLD_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HighFlapThresholdImpl <em>High Flap Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HighFlapThresholdImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHighFlapThreshold()
	 * @generated
	 */
	int HIGH_FLAP_THRESHOLD = 67;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_FLAP_THRESHOLD__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_FLAP_THRESHOLD__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_FLAP_THRESHOLD__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>High Flap Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_FLAP_THRESHOLD_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.FlapDetectionEnabledImpl <em>Flap Detection Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.FlapDetectionEnabledImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFlapDetectionEnabled()
	 * @generated
	 */
	int FLAP_DETECTION_ENABLED = 68;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAP_DETECTION_ENABLED__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAP_DETECTION_ENABLED__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAP_DETECTION_ENABLED__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flap Detection Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAP_DETECTION_ENABLED_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostFlapDetectionOptionsImpl <em>Host Flap Detection Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostFlapDetectionOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostFlapDetectionOptions()
	 * @generated
	 */
	int HOST_FLAP_DETECTION_OPTIONS = 69;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FLAP_DETECTION_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FLAP_DETECTION_OPTIONS__VALUE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FLAP_DETECTION_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Flap Detection Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FLAP_DETECTION_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ProcessPerfDataImpl <em>Process Perf Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ProcessPerfDataImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getProcessPerfData()
	 * @generated
	 */
	int PROCESS_PERF_DATA = 70;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERF_DATA__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERF_DATA__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERF_DATA__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Perf Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PERF_DATA_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.RetainStatusInformationImpl <em>Retain Status Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.RetainStatusInformationImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRetainStatusInformation()
	 * @generated
	 */
	int RETAIN_STATUS_INFORMATION = 71;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_STATUS_INFORMATION__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_STATUS_INFORMATION__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_STATUS_INFORMATION__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retain Status Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_STATUS_INFORMATION_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.RetainNonstatusInformationImpl <em>Retain Nonstatus Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.RetainNonstatusInformationImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRetainNonstatusInformation()
	 * @generated
	 */
	int RETAIN_NONSTATUS_INFORMATION = 72;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_NONSTATUS_INFORMATION__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_NONSTATUS_INFORMATION__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_NONSTATUS_INFORMATION__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retain Nonstatus Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIN_NONSTATUS_INFORMATION_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceFlapDetectionOptionsImpl <em>Service Flap Detection Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceFlapDetectionOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceFlapDetectionOptions()
	 * @generated
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS = 73;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS__WARNING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS__CRITICAL = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS__UNKNOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Flap Detection Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FLAP_DETECTION_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServicegroupNameImpl <em>Servicegroup Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServicegroupNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServicegroupName()
	 * @generated
	 */
	int SERVICEGROUP_NAME = 74;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_NAME__COMMENT = BasePackage.NAME_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_NAME__NAME = BasePackage.NAME_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_NAME__TOKEN = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servicegroup Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_NAME_FEATURE_COUNT = BasePackage.NAME_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceMembersImpl <em>Service Members</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceMembersImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceMembers()
	 * @generated
	 */
	int SERVICE_MEMBERS = 75;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MEMBERS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MEMBERS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MEMBERS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MEMBERS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServicegroupMembersImpl <em>Servicegroup Members</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServicegroupMembersImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServicegroupMembers()
	 * @generated
	 */
	int SERVICEGROUP_MEMBERS = 76;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_MEMBERS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_MEMBERS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_MEMBERS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Servicegroup Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_MEMBERS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServicegroupsImpl <em>Servicegroups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServicegroupsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServicegroups()
	 * @generated
	 */
	int SERVICEGROUPS = 77;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUPS__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUPS__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUPS__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Servicegroups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUPS_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.DependentHostNameImpl <em>Dependent Host Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.DependentHostNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependentHostName()
	 * @generated
	 */
	int DEPENDENT_HOST_NAME = 78;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOST_NAME__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOST_NAME__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOST_NAME__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependent Host Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOST_NAME_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.DependentHostgroupNameImpl <em>Dependent Hostgroup Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.DependentHostgroupNameImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependentHostgroupName()
	 * @generated
	 */
	int DEPENDENT_HOSTGROUP_NAME = 79;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOSTGROUP_NAME__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOSTGROUP_NAME__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOSTGROUP_NAME__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependent Hostgroup Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_HOSTGROUP_NAME_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.DependentServiceDescriptionImpl <em>Dependent Service Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.DependentServiceDescriptionImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependentServiceDescription()
	 * @generated
	 */
	int DEPENDENT_SERVICE_DESCRIPTION = 80;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_SERVICE_DESCRIPTION__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_SERVICE_DESCRIPTION__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_SERVICE_DESCRIPTION__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependent Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_SERVICE_DESCRIPTION_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceDescriptionReferenceImpl <em>Service Description Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceDescriptionReferenceImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceDescriptionReference()
	 * @generated
	 */
	int SERVICE_DESCRIPTION_REFERENCE = 81;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_REFERENCE__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_REFERENCE__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_REFERENCE__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Description Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_REFERENCE_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.InheritsParentImpl <em>Inherits Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.InheritsParentImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getInheritsParent()
	 * @generated
	 */
	int INHERITS_PARENT = 82;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITS_PARENT__COMMENT = BasePackage.BOOLEAN_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITS_PARENT__ENABLED = BasePackage.BOOLEAN_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITS_PARENT__TOKEN = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inherits Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITS_PARENT_FEATURE_COUNT = BasePackage.BOOLEAN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceExecutionFailureCriteriaImpl <em>Service Execution Failure Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceExecutionFailureCriteriaImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceExecutionFailureCriteria()
	 * @generated
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA = 83;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__WARNING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__CRITICAL = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__UNKNOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__PENDING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__NONE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Service Execution Failure Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_FAILURE_CRITERIA_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl <em>Notification Failure Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationFailureCriteria()
	 * @generated
	 */
	int NOTIFICATION_FAILURE_CRITERIA = 84;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__WARNING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__CRITICAL = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__UNKNOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__PENDING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__NONE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Notification Failure Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FAILURE_CRITERIA_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.DependencyPeriodImpl <em>Dependency Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.DependencyPeriodImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependencyPeriod()
	 * @generated
	 */
	int DEPENDENCY_PERIOD = 85;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_PERIOD__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_PERIOD__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_PERIOD__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_PERIOD_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl <em>Service Stalking Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceStalkingOptions()
	 * @generated
	 */
	int SERVICE_STALKING_OPTIONS = 86;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STALKING_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STALKING_OPTIONS__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STALKING_OPTIONS__WARNING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STALKING_OPTIONS__CRITICAL = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STALKING_OPTIONS__UNKNOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STALKING_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Stalking Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STALKING_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.FirstNotificationImpl <em>First Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.FirstNotificationImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFirstNotification()
	 * @generated
	 */
	int FIRST_NOTIFICATION = 87;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>First Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NOTIFICATION_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.LastNotificationImpl <em>Last Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.LastNotificationImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getLastNotification()
	 * @generated
	 */
	int LAST_NOTIFICATION = 88;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NOTIFICATION__COMMENT = BasePackage.INTEGER_VALUE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NOTIFICATION__VALUE = BasePackage.INTEGER_VALUE_ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NOTIFICATION__TOKEN = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Last Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NOTIFICATION_FEATURE_COUNT = BasePackage.INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.EscalationPeriodImpl <em>Escalation Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.EscalationPeriodImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEscalationPeriod()
	 * @generated
	 */
	int ESCALATION_PERIOD = 89;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_PERIOD__COMMENT = BasePackage.REFERENCE_ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_PERIOD__REFERENCE = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_PERIOD__TOKEN = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Escalation Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_PERIOD_FEATURE_COUNT = BasePackage.REFERENCE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceEscalationOptionsImpl <em>Service Escalation Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceEscalationOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceEscalationOptions()
	 * @generated
	 */
	int SERVICE_ESCALATION_OPTIONS = 90;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ESCALATION_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ESCALATION_OPTIONS__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ESCALATION_OPTIONS__WARNING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ESCALATION_OPTIONS__CRITICAL = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ESCALATION_OPTIONS__UNKNOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ESCALATION_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Escalation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ESCALATION_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostExecutionFailureCriteriaImpl <em>Host Execution Failure Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostExecutionFailureCriteriaImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostExecutionFailureCriteria()
	 * @generated
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA = 91;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA__UP = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA__DOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unreachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA__UNREACHABLE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA__PENDING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA__NONE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Host Execution Failure Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_EXECUTION_FAILURE_CRITERIA_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationFailureCriteriaImpl <em>Service Notification Failure Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.ServiceNotificationFailureCriteriaImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationFailureCriteria()
	 * @generated
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA = 92;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__OK = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__WARNING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__CRITICAL = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__UNKNOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__PENDING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__NONE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Service Notification Failure Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_FAILURE_CRITERIA_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostNotificationFailureCriteriaImpl <em>Host Notification Failure Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostNotificationFailureCriteriaImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationFailureCriteria()
	 * @generated
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA = 93;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA__UP = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA__DOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unreachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA__UNREACHABLE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA__PENDING = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA__NONE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Host Notification Failure Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_NOTIFICATION_FAILURE_CRITERIA_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emona.model.base.attributes.impl.HostEscalationOptionsImpl <em>Host Escalation Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.attributes.impl.HostEscalationOptionsImpl
	 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostEscalationOptions()
	 * @generated
	 */
	int HOST_ESCALATION_OPTIONS = 94;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ESCALATION_OPTIONS__COMMENT = BasePackage.ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ESCALATION_OPTIONS__UP = BasePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ESCALATION_OPTIONS__DOWN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unreachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ESCALATION_OPTIONS__UNREACHABLE = BasePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ESCALATION_OPTIONS__TOKEN = BasePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Host Escalation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_ESCALATION_OPTIONS_FEATURE_COUNT = BasePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see org.emona.model.base.attributes.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Alias#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Alias#getToken()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostInitialState <em>Host Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Initial State</em>'.
	 * @see org.emona.model.base.attributes.HostInitialState
	 * @generated
	 */
	EClass getHostInitialState();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostInitialState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.attributes.HostInitialState#getValue()
	 * @see #getHostInitialState()
	 * @generated
	 */
	EAttribute getHostInitialState_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostInitialState#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostInitialState#getToken()
	 * @see #getHostInitialState()
	 * @generated
	 */
	EAttribute getHostInitialState_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Hostgroups <em>Hostgroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostgroups</em>'.
	 * @see org.emona.model.base.attributes.Hostgroups
	 * @generated
	 */
	EClass getHostgroups();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.Hostgroups#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.Hostgroups#getReference()
	 * @see #getHostgroups()
	 * @generated
	 */
	EReference getHostgroups_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Hostgroups#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Hostgroups#getToken()
	 * @see #getHostgroups()
	 * @generated
	 */
	EAttribute getHostgroups_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Parents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parents</em>'.
	 * @see org.emona.model.base.attributes.Parents
	 * @generated
	 */
	EClass getParents();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.Parents#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.Parents#getReference()
	 * @see #getParents()
	 * @generated
	 */
	EReference getParents_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Parents#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Parents#getToken()
	 * @see #getParents()
	 * @generated
	 */
	EAttribute getParents_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.emona.model.base.attributes.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Address#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.attributes.Address#getValue()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Address#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Address#getToken()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.DisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name</em>'.
	 * @see org.emona.model.base.attributes.DisplayName
	 * @generated
	 */
	EClass getDisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.DisplayName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.DisplayName#getToken()
	 * @see #getDisplayName()
	 * @generated
	 */
	EAttribute getDisplayName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see org.emona.model.base.attributes.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Register#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Register#getToken()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use</em>'.
	 * @see org.emona.model.base.attributes.Use
	 * @generated
	 */
	EClass getUse();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.Use#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.Use#getReference()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Use#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Use#getToken()
	 * @see #getUse()
	 * @generated
	 */
	EAttribute getUse_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.TimeperiodName <em>Timeperiod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeperiod Name</em>'.
	 * @see org.emona.model.base.attributes.TimeperiodName
	 * @generated
	 */
	EClass getTimeperiodName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.TimeperiodName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.TimeperiodName#getToken()
	 * @see #getTimeperiodName()
	 * @generated
	 */
	EAttribute getTimeperiodName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostgroupName <em>Hostgroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostgroup Name</em>'.
	 * @see org.emona.model.base.attributes.HostgroupName
	 * @generated
	 */
	EClass getHostgroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostgroupName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostgroupName#getToken()
	 * @see #getHostgroupName()
	 * @generated
	 */
	EAttribute getHostgroupName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Name</em>'.
	 * @see org.emona.model.base.attributes.HostName
	 * @generated
	 */
	EClass getHostName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostName#getToken()
	 * @see #getHostName()
	 * @generated
	 */
	EAttribute getHostName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.TemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Name</em>'.
	 * @see org.emona.model.base.attributes.TemplateName
	 * @generated
	 */
	EClass getTemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.TemplateName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.TemplateName#getToken()
	 * @see #getTemplateName()
	 * @generated
	 */
	EAttribute getTemplateName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.CommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line</em>'.
	 * @see org.emona.model.base.attributes.CommandLine
	 * @generated
	 */
	EClass getCommandLine();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.CommandLine#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.CommandLine#getToken()
	 * @see #getCommandLine()
	 * @generated
	 */
	EAttribute getCommandLine_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.CommandName <em>Command Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Name</em>'.
	 * @see org.emona.model.base.attributes.CommandName
	 * @generated
	 */
	EClass getCommandName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.CommandName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.CommandName#getToken()
	 * @see #getCommandName()
	 * @generated
	 */
	EAttribute getCommandName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.MaxCheckAttempts <em>Max Check Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Check Attempts</em>'.
	 * @see org.emona.model.base.attributes.MaxCheckAttempts
	 * @generated
	 */
	EClass getMaxCheckAttempts();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.MaxCheckAttempts#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.MaxCheckAttempts#getToken()
	 * @see #getMaxCheckAttempts()
	 * @generated
	 */
	EAttribute getMaxCheckAttempts_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.CheckInterval <em>Check Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Interval</em>'.
	 * @see org.emona.model.base.attributes.CheckInterval
	 * @generated
	 */
	EClass getCheckInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.CheckInterval#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.CheckInterval#getToken()
	 * @see #getCheckInterval()
	 * @generated
	 */
	EAttribute getCheckInterval_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.RetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Interval</em>'.
	 * @see org.emona.model.base.attributes.RetryInterval
	 * @generated
	 */
	EClass getRetryInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.RetryInterval#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.RetryInterval#getToken()
	 * @see #getRetryInterval()
	 * @generated
	 */
	EAttribute getRetryInterval_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ActiveChecksEnabled <em>Active Checks Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Checks Enabled</em>'.
	 * @see org.emona.model.base.attributes.ActiveChecksEnabled
	 * @generated
	 */
	EClass getActiveChecksEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ActiveChecksEnabled#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ActiveChecksEnabled#getToken()
	 * @see #getActiveChecksEnabled()
	 * @generated
	 */
	EAttribute getActiveChecksEnabled_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.PassiveChecksEnabled <em>Passive Checks Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Checks Enabled</em>'.
	 * @see org.emona.model.base.attributes.PassiveChecksEnabled
	 * @generated
	 */
	EClass getPassiveChecksEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.PassiveChecksEnabled#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.PassiveChecksEnabled#getToken()
	 * @see #getPassiveChecksEnabled()
	 * @generated
	 */
	EAttribute getPassiveChecksEnabled_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.CheckPeriod <em>Check Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Period</em>'.
	 * @see org.emona.model.base.attributes.CheckPeriod
	 * @generated
	 */
	EClass getCheckPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.CheckPeriod#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.CheckPeriod#getReference()
	 * @see #getCheckPeriod()
	 * @generated
	 */
	EReference getCheckPeriod_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.CheckPeriod#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.CheckPeriod#getToken()
	 * @see #getCheckPeriod()
	 * @generated
	 */
	EAttribute getCheckPeriod_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.CheckCommand <em>Check Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Command</em>'.
	 * @see org.emona.model.base.attributes.CheckCommand
	 * @generated
	 */
	EClass getCheckCommand();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.CheckCommand#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.CheckCommand#getReference()
	 * @see #getCheckCommand()
	 * @generated
	 */
	EReference getCheckCommand_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.CheckCommand#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.CheckCommand#getToken()
	 * @see #getCheckCommand()
	 * @generated
	 */
	EAttribute getCheckCommand_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.TimeExclude <em>Time Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Exclude</em>'.
	 * @see org.emona.model.base.attributes.TimeExclude
	 * @generated
	 */
	EClass getTimeExclude();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.TimeExclude#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.TimeExclude#getReference()
	 * @see #getTimeExclude()
	 * @generated
	 */
	EReference getTimeExclude_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.TimeExclude#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.TimeExclude#getToken()
	 * @see #getTimeExclude()
	 * @generated
	 */
	EAttribute getTimeExclude_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Name</em>'.
	 * @see org.emona.model.base.attributes.ContactName
	 * @generated
	 */
	EClass getContactName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ContactName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ContactName#getToken()
	 * @see #getContactName()
	 * @generated
	 */
	EAttribute getContactName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.NotificationsEnabled <em>Notifications Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifications Enabled</em>'.
	 * @see org.emona.model.base.attributes.NotificationsEnabled
	 * @generated
	 */
	EClass getNotificationsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.NotificationsEnabled#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.NotificationsEnabled#getToken()
	 * @see #getNotificationsEnabled()
	 * @generated
	 */
	EAttribute getNotificationsEnabled_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostNotificationsEnabled <em>Host Notifications Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Notifications Enabled</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationsEnabled
	 * @generated
	 */
	EClass getHostNotificationsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationsEnabled#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationsEnabled#getToken()
	 * @see #getHostNotificationsEnabled()
	 * @generated
	 */
	EAttribute getHostNotificationsEnabled_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceNotificationsEnabled <em>Service Notifications Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Notifications Enabled</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationsEnabled
	 * @generated
	 */
	EClass getServiceNotificationsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceNotificationsEnabled#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationsEnabled#getToken()
	 * @see #getServiceNotificationsEnabled()
	 * @generated
	 */
	EAttribute getServiceNotificationsEnabled_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.NotificationPeriod <em>Notification Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Period</em>'.
	 * @see org.emona.model.base.attributes.NotificationPeriod
	 * @generated
	 */
	EClass getNotificationPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.NotificationPeriod#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.NotificationPeriod#getReference()
	 * @see #getNotificationPeriod()
	 * @generated
	 */
	EReference getNotificationPeriod_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.NotificationPeriod#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.NotificationPeriod#getToken()
	 * @see #getNotificationPeriod()
	 * @generated
	 */
	EAttribute getNotificationPeriod_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostNotificationPeriod <em>Host Notification Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Notification Period</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationPeriod
	 * @generated
	 */
	EClass getHostNotificationPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.HostNotificationPeriod#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationPeriod#getReference()
	 * @see #getHostNotificationPeriod()
	 * @generated
	 */
	EReference getHostNotificationPeriod_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationPeriod#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationPeriod#getToken()
	 * @see #getHostNotificationPeriod()
	 * @generated
	 */
	EAttribute getHostNotificationPeriod_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceNotificationPeriod <em>Service Notification Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Notification Period</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationPeriod
	 * @generated
	 */
	EClass getServiceNotificationPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.ServiceNotificationPeriod#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationPeriod#getReference()
	 * @see #getServiceNotificationPeriod()
	 * @generated
	 */
	EReference getServiceNotificationPeriod_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceNotificationPeriod#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationPeriod#getToken()
	 * @see #getServiceNotificationPeriod()
	 * @generated
	 */
	EAttribute getServiceNotificationPeriod_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostNotificationOptions <em>Host Notification Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Notification Options</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions
	 * @generated
	 */
	EClass getHostNotificationOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions#getToken()
	 * @see #getHostNotificationOptions()
	 * @generated
	 */
	EAttribute getHostNotificationOptions_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationOptions#isRecovery <em>Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions#isRecovery()
	 * @see #getHostNotificationOptions()
	 * @generated
	 */
	EAttribute getHostNotificationOptions_Recovery();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationOptions#isDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Down</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions#isDown()
	 * @see #getHostNotificationOptions()
	 * @generated
	 */
	EAttribute getHostNotificationOptions_Down();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationOptions#isUnreachable <em>Unreachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unreachable</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions#isUnreachable()
	 * @see #getHostNotificationOptions()
	 * @generated
	 */
	EAttribute getHostNotificationOptions_Unreachable();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationOptions#isFlapping <em>Flapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flapping</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions#isFlapping()
	 * @see #getHostNotificationOptions()
	 * @generated
	 */
	EAttribute getHostNotificationOptions_Flapping();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationOptions#isScheduledDowntime <em>Scheduled Downtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Downtime</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions#isScheduledDowntime()
	 * @see #getHostNotificationOptions()
	 * @generated
	 */
	EAttribute getHostNotificationOptions_ScheduledDowntime();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationOptions#isNone <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>None</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationOptions#isNone()
	 * @see #getHostNotificationOptions()
	 * @generated
	 */
	EAttribute getHostNotificationOptions_None();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceNotificationOptions <em>Service Notification Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Notification Options</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationOptions
	 * @generated
	 */
	EClass getServiceNotificationOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceNotificationOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationOptions#getToken()
	 * @see #getServiceNotificationOptions()
	 * @generated
	 */
	EAttribute getServiceNotificationOptions_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.NotificationCommands <em>Notification Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Commands</em>'.
	 * @see org.emona.model.base.attributes.NotificationCommands
	 * @generated
	 */
	EClass getNotificationCommands();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.NotificationCommands#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.NotificationCommands#getReference()
	 * @see #getNotificationCommands()
	 * @generated
	 */
	EReference getNotificationCommands_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.NotificationCommands#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.NotificationCommands#getToken()
	 * @see #getNotificationCommands()
	 * @generated
	 */
	EAttribute getNotificationCommands_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostNotificationCommands <em>Host Notification Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Notification Commands</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationCommands
	 * @generated
	 */
	EClass getHostNotificationCommands();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.HostNotificationCommands#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationCommands#getReference()
	 * @see #getHostNotificationCommands()
	 * @generated
	 */
	EReference getHostNotificationCommands_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationCommands#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationCommands#getToken()
	 * @see #getHostNotificationCommands()
	 * @generated
	 */
	EAttribute getHostNotificationCommands_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceNotificationCommands <em>Service Notification Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Notification Commands</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationCommands
	 * @generated
	 */
	EClass getServiceNotificationCommands();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.ServiceNotificationCommands#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationCommands#getReference()
	 * @see #getServiceNotificationCommands()
	 * @generated
	 */
	EReference getServiceNotificationCommands_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceNotificationCommands#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationCommands#getToken()
	 * @see #getServiceNotificationCommands()
	 * @generated
	 */
	EAttribute getServiceNotificationCommands_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ContactAddress <em>Contact Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Address</em>'.
	 * @see org.emona.model.base.attributes.ContactAddress
	 * @generated
	 */
	EClass getContactAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ContactAddress#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ContactAddress#getToken()
	 * @see #getContactAddress()
	 * @generated
	 */
	EAttribute getContactAddress_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see org.emona.model.base.attributes.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Email#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Email#getToken()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Email#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.attributes.Email#getValue()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Value();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Pager <em>Pager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pager</em>'.
	 * @see org.emona.model.base.attributes.Pager
	 * @generated
	 */
	EClass getPager();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Pager#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Pager#getToken()
	 * @see #getPager()
	 * @generated
	 */
	EAttribute getPager_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Pager#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.attributes.Pager#getValue()
	 * @see #getPager()
	 * @generated
	 */
	EAttribute getPager_Value();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ContactMembers <em>Contact Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Members</em>'.
	 * @see org.emona.model.base.attributes.ContactMembers
	 * @generated
	 */
	EClass getContactMembers();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.ContactMembers#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.ContactMembers#getReference()
	 * @see #getContactMembers()
	 * @generated
	 */
	EReference getContactMembers_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ContactMembers#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ContactMembers#getToken()
	 * @see #getContactMembers()
	 * @generated
	 */
	EAttribute getContactMembers_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ContactGroupName <em>Contact Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Group Name</em>'.
	 * @see org.emona.model.base.attributes.ContactGroupName
	 * @generated
	 */
	EClass getContactGroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ContactGroupName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ContactGroupName#getToken()
	 * @see #getContactGroupName()
	 * @generated
	 */
	EAttribute getContactGroupName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Contacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacts</em>'.
	 * @see org.emona.model.base.attributes.Contacts
	 * @generated
	 */
	EClass getContacts();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.Contacts#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.Contacts#getReference()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Contacts#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Contacts#getToken()
	 * @see #getContacts()
	 * @generated
	 */
	EAttribute getContacts_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ContactGroups <em>Contact Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Groups</em>'.
	 * @see org.emona.model.base.attributes.ContactGroups
	 * @generated
	 */
	EClass getContactGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.ContactGroups#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.ContactGroups#getReference()
	 * @see #getContactGroups()
	 * @generated
	 */
	EReference getContactGroups_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ContactGroups#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ContactGroups#getToken()
	 * @see #getContactGroups()
	 * @generated
	 */
	EAttribute getContactGroups_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.NotificationInterval <em>Notification Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Interval</em>'.
	 * @see org.emona.model.base.attributes.NotificationInterval
	 * @generated
	 */
	EClass getNotificationInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.NotificationInterval#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.NotificationInterval#getToken()
	 * @see #getNotificationInterval()
	 * @generated
	 */
	EAttribute getNotificationInterval_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.FirstNotificationDelay <em>First Notification Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Notification Delay</em>'.
	 * @see org.emona.model.base.attributes.FirstNotificationDelay
	 * @generated
	 */
	EClass getFirstNotificationDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.FirstNotificationDelay#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.FirstNotificationDelay#getToken()
	 * @see #getFirstNotificationDelay()
	 * @generated
	 */
	EAttribute getFirstNotificationDelay_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostStalkingOptions <em>Host Stalking Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Stalking Options</em>'.
	 * @see org.emona.model.base.attributes.HostStalkingOptions
	 * @generated
	 */
	EClass getHostStalkingOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostStalkingOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostStalkingOptions#getToken()
	 * @see #getHostStalkingOptions()
	 * @generated
	 */
	EAttribute getHostStalkingOptions_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Notes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notes</em>'.
	 * @see org.emona.model.base.attributes.Notes
	 * @generated
	 */
	EClass getNotes();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Notes#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Notes#getToken()
	 * @see #getNotes()
	 * @generated
	 */
	EAttribute getNotes_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.NotesUrl <em>Notes Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notes Url</em>'.
	 * @see org.emona.model.base.attributes.NotesUrl
	 * @generated
	 */
	EClass getNotesUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.NotesUrl#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.NotesUrl#getToken()
	 * @see #getNotesUrl()
	 * @generated
	 */
	EAttribute getNotesUrl_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ActionUrl <em>Action Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Url</em>'.
	 * @see org.emona.model.base.attributes.ActionUrl
	 * @generated
	 */
	EClass getActionUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ActionUrl#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ActionUrl#getToken()
	 * @see #getActionUrl()
	 * @generated
	 */
	EAttribute getActionUrl_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.IconImage <em>Icon Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Image</em>'.
	 * @see org.emona.model.base.attributes.IconImage
	 * @generated
	 */
	EClass getIconImage();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.IconImage#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.IconImage#getToken()
	 * @see #getIconImage()
	 * @generated
	 */
	EAttribute getIconImage_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.IconImageAlt <em>Icon Image Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Image Alt</em>'.
	 * @see org.emona.model.base.attributes.IconImageAlt
	 * @generated
	 */
	EClass getIconImageAlt();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.IconImageAlt#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.IconImageAlt#getToken()
	 * @see #getIconImageAlt()
	 * @generated
	 */
	EAttribute getIconImageAlt_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.VrmlImage <em>Vrml Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vrml Image</em>'.
	 * @see org.emona.model.base.attributes.VrmlImage
	 * @generated
	 */
	EClass getVrmlImage();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.VrmlImage#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.VrmlImage#getToken()
	 * @see #getVrmlImage()
	 * @generated
	 */
	EAttribute getVrmlImage_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.StatusmapImage <em>Statusmap Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statusmap Image</em>'.
	 * @see org.emona.model.base.attributes.StatusmapImage
	 * @generated
	 */
	EClass getStatusmapImage();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.StatusmapImage#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.StatusmapImage#getToken()
	 * @see #getStatusmapImage()
	 * @generated
	 */
	EAttribute getStatusmapImage_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.TwoDCoords <em>Two DCoords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two DCoords</em>'.
	 * @see org.emona.model.base.attributes.TwoDCoords
	 * @generated
	 */
	EClass getTwoDCoords();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.TwoDCoords#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.TwoDCoords#getToken()
	 * @see #getTwoDCoords()
	 * @generated
	 */
	EAttribute getTwoDCoords_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.TwoDCoords#getXcoord <em>Xcoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcoord</em>'.
	 * @see org.emona.model.base.attributes.TwoDCoords#getXcoord()
	 * @see #getTwoDCoords()
	 * @generated
	 */
	EAttribute getTwoDCoords_Xcoord();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.TwoDCoords#getYcoord <em>Ycoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ycoord</em>'.
	 * @see org.emona.model.base.attributes.TwoDCoords#getYcoord()
	 * @see #getTwoDCoords()
	 * @generated
	 */
	EAttribute getTwoDCoords_Ycoord();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ThreeDCoords <em>Three DCoords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Three DCoords</em>'.
	 * @see org.emona.model.base.attributes.ThreeDCoords
	 * @generated
	 */
	EClass getThreeDCoords();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ThreeDCoords#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ThreeDCoords#getToken()
	 * @see #getThreeDCoords()
	 * @generated
	 */
	EAttribute getThreeDCoords_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ThreeDCoords#getXcoord <em>Xcoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcoord</em>'.
	 * @see org.emona.model.base.attributes.ThreeDCoords#getXcoord()
	 * @see #getThreeDCoords()
	 * @generated
	 */
	EAttribute getThreeDCoords_Xcoord();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ThreeDCoords#getYcoord <em>Ycoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ycoord</em>'.
	 * @see org.emona.model.base.attributes.ThreeDCoords#getYcoord()
	 * @see #getThreeDCoords()
	 * @generated
	 */
	EAttribute getThreeDCoords_Ycoord();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ThreeDCoords#getZcoord <em>Zcoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zcoord</em>'.
	 * @see org.emona.model.base.attributes.ThreeDCoords#getZcoord()
	 * @see #getThreeDCoords()
	 * @generated
	 */
	EAttribute getThreeDCoords_Zcoord();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostgroupMembers <em>Hostgroup Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostgroup Members</em>'.
	 * @see org.emona.model.base.attributes.HostgroupMembers
	 * @generated
	 */
	EClass getHostgroupMembers();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.HostgroupMembers#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.HostgroupMembers#getReference()
	 * @see #getHostgroupMembers()
	 * @generated
	 */
	EReference getHostgroupMembers_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostgroupMembers#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostgroupMembers#getToken()
	 * @see #getHostgroupMembers()
	 * @generated
	 */
	EAttribute getHostgroupMembers_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostMembers <em>Host Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Members</em>'.
	 * @see org.emona.model.base.attributes.HostMembers
	 * @generated
	 */
	EClass getHostMembers();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.HostMembers#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.HostMembers#getReference()
	 * @see #getHostMembers()
	 * @generated
	 */
	EReference getHostMembers_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostMembers#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostMembers#getToken()
	 * @see #getHostMembers()
	 * @generated
	 */
	EAttribute getHostMembers_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostNameReference <em>Host Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Name Reference</em>'.
	 * @see org.emona.model.base.attributes.HostNameReference
	 * @generated
	 */
	EClass getHostNameReference();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.HostNameReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.HostNameReference#getReference()
	 * @see #getHostNameReference()
	 * @generated
	 */
	EReference getHostNameReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNameReference#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostNameReference#getToken()
	 * @see #getHostNameReference()
	 * @generated
	 */
	EAttribute getHostNameReference_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostgroupNameReference <em>Hostgroup Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostgroup Name Reference</em>'.
	 * @see org.emona.model.base.attributes.HostgroupNameReference
	 * @generated
	 */
	EClass getHostgroupNameReference();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.HostgroupNameReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.HostgroupNameReference#getReference()
	 * @see #getHostgroupNameReference()
	 * @generated
	 */
	EReference getHostgroupNameReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostgroupNameReference#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostgroupNameReference#getToken()
	 * @see #getHostgroupNameReference()
	 * @generated
	 */
	EAttribute getHostgroupNameReference_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description</em>'.
	 * @see org.emona.model.base.attributes.ServiceDescription
	 * @generated
	 */
	EClass getServiceDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceDescription#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceDescription#getToken()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceInitialState <em>Service Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Initial State</em>'.
	 * @see org.emona.model.base.attributes.ServiceInitialState
	 * @generated
	 */
	EClass getServiceInitialState();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceInitialState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.attributes.ServiceInitialState#getValue()
	 * @see #getServiceInitialState()
	 * @generated
	 */
	EAttribute getServiceInitialState_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceInitialState#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceInitialState#getToken()
	 * @see #getServiceInitialState()
	 * @generated
	 */
	EAttribute getServiceInitialState_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceInitialState#isOk <em>Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ok</em>'.
	 * @see org.emona.model.base.attributes.ServiceInitialState#isOk()
	 * @see #getServiceInitialState()
	 * @generated
	 */
	EAttribute getServiceInitialState_Ok();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.IsVolatileFlag <em>Is Volatile Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Volatile Flag</em>'.
	 * @see org.emona.model.base.attributes.IsVolatileFlag
	 * @generated
	 */
	EClass getIsVolatileFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.IsVolatileFlag#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.IsVolatileFlag#getToken()
	 * @see #getIsVolatileFlag()
	 * @generated
	 */
	EAttribute getIsVolatileFlag_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ObsessOverHost <em>Obsess Over Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obsess Over Host</em>'.
	 * @see org.emona.model.base.attributes.ObsessOverHost
	 * @generated
	 */
	EClass getObsessOverHost();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ObsessOverHost#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ObsessOverHost#getToken()
	 * @see #getObsessOverHost()
	 * @generated
	 */
	EAttribute getObsessOverHost_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ObsessOverService <em>Obsess Over Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obsess Over Service</em>'.
	 * @see org.emona.model.base.attributes.ObsessOverService
	 * @generated
	 */
	EClass getObsessOverService();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ObsessOverService#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ObsessOverService#getToken()
	 * @see #getObsessOverService()
	 * @generated
	 */
	EAttribute getObsessOverService_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.CheckFreshness <em>Check Freshness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Freshness</em>'.
	 * @see org.emona.model.base.attributes.CheckFreshness
	 * @generated
	 */
	EClass getCheckFreshness();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.CheckFreshness#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.CheckFreshness#getToken()
	 * @see #getCheckFreshness()
	 * @generated
	 */
	EAttribute getCheckFreshness_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.FreshnessThreshold <em>Freshness Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freshness Threshold</em>'.
	 * @see org.emona.model.base.attributes.FreshnessThreshold
	 * @generated
	 */
	EClass getFreshnessThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.FreshnessThreshold#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.FreshnessThreshold#getToken()
	 * @see #getFreshnessThreshold()
	 * @generated
	 */
	EAttribute getFreshnessThreshold_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler</em>'.
	 * @see org.emona.model.base.attributes.EventHandler
	 * @generated
	 */
	EClass getEventHandler();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.EventHandler#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.EventHandler#getReference()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.EventHandler#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.EventHandler#getToken()
	 * @see #getEventHandler()
	 * @generated
	 */
	EAttribute getEventHandler_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.EventHandlerEnabled <em>Event Handler Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler Enabled</em>'.
	 * @see org.emona.model.base.attributes.EventHandlerEnabled
	 * @generated
	 */
	EClass getEventHandlerEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.EventHandlerEnabled#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.EventHandlerEnabled#getToken()
	 * @see #getEventHandlerEnabled()
	 * @generated
	 */
	EAttribute getEventHandlerEnabled_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.LowFlapThreshold <em>Low Flap Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Low Flap Threshold</em>'.
	 * @see org.emona.model.base.attributes.LowFlapThreshold
	 * @generated
	 */
	EClass getLowFlapThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.LowFlapThreshold#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.LowFlapThreshold#getToken()
	 * @see #getLowFlapThreshold()
	 * @generated
	 */
	EAttribute getLowFlapThreshold_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HighFlapThreshold <em>High Flap Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Flap Threshold</em>'.
	 * @see org.emona.model.base.attributes.HighFlapThreshold
	 * @generated
	 */
	EClass getHighFlapThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HighFlapThreshold#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HighFlapThreshold#getToken()
	 * @see #getHighFlapThreshold()
	 * @generated
	 */
	EAttribute getHighFlapThreshold_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.FlapDetectionEnabled <em>Flap Detection Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flap Detection Enabled</em>'.
	 * @see org.emona.model.base.attributes.FlapDetectionEnabled
	 * @generated
	 */
	EClass getFlapDetectionEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.FlapDetectionEnabled#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.FlapDetectionEnabled#getToken()
	 * @see #getFlapDetectionEnabled()
	 * @generated
	 */
	EAttribute getFlapDetectionEnabled_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostFlapDetectionOptions <em>Host Flap Detection Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Flap Detection Options</em>'.
	 * @see org.emona.model.base.attributes.HostFlapDetectionOptions
	 * @generated
	 */
	EClass getHostFlapDetectionOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostFlapDetectionOptions#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.attributes.HostFlapDetectionOptions#getValue()
	 * @see #getHostFlapDetectionOptions()
	 * @generated
	 */
	EAttribute getHostFlapDetectionOptions_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostFlapDetectionOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostFlapDetectionOptions#getToken()
	 * @see #getHostFlapDetectionOptions()
	 * @generated
	 */
	EAttribute getHostFlapDetectionOptions_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ProcessPerfData <em>Process Perf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Perf Data</em>'.
	 * @see org.emona.model.base.attributes.ProcessPerfData
	 * @generated
	 */
	EClass getProcessPerfData();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ProcessPerfData#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ProcessPerfData#getToken()
	 * @see #getProcessPerfData()
	 * @generated
	 */
	EAttribute getProcessPerfData_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.RetainStatusInformation <em>Retain Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retain Status Information</em>'.
	 * @see org.emona.model.base.attributes.RetainStatusInformation
	 * @generated
	 */
	EClass getRetainStatusInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.RetainStatusInformation#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.RetainStatusInformation#getToken()
	 * @see #getRetainStatusInformation()
	 * @generated
	 */
	EAttribute getRetainStatusInformation_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.RetainNonstatusInformation <em>Retain Nonstatus Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retain Nonstatus Information</em>'.
	 * @see org.emona.model.base.attributes.RetainNonstatusInformation
	 * @generated
	 */
	EClass getRetainNonstatusInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.RetainNonstatusInformation#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.RetainNonstatusInformation#getToken()
	 * @see #getRetainNonstatusInformation()
	 * @generated
	 */
	EAttribute getRetainNonstatusInformation_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceFlapDetectionOptions <em>Service Flap Detection Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Flap Detection Options</em>'.
	 * @see org.emona.model.base.attributes.ServiceFlapDetectionOptions
	 * @generated
	 */
	EClass getServiceFlapDetectionOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceFlapDetectionOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceFlapDetectionOptions#getToken()
	 * @see #getServiceFlapDetectionOptions()
	 * @generated
	 */
	EAttribute getServiceFlapDetectionOptions_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServicegroupName <em>Servicegroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicegroup Name</em>'.
	 * @see org.emona.model.base.attributes.ServicegroupName
	 * @generated
	 */
	EClass getServicegroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServicegroupName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServicegroupName#getToken()
	 * @see #getServicegroupName()
	 * @generated
	 */
	EAttribute getServicegroupName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceMembers <em>Service Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Members</em>'.
	 * @see org.emona.model.base.attributes.ServiceMembers
	 * @generated
	 */
	EClass getServiceMembers();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.ServiceMembers#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.ServiceMembers#getReference()
	 * @see #getServiceMembers()
	 * @generated
	 */
	EReference getServiceMembers_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceMembers#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceMembers#getToken()
	 * @see #getServiceMembers()
	 * @generated
	 */
	EAttribute getServiceMembers_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServicegroupMembers <em>Servicegroup Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicegroup Members</em>'.
	 * @see org.emona.model.base.attributes.ServicegroupMembers
	 * @generated
	 */
	EClass getServicegroupMembers();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.ServicegroupMembers#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.ServicegroupMembers#getReference()
	 * @see #getServicegroupMembers()
	 * @generated
	 */
	EReference getServicegroupMembers_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServicegroupMembers#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServicegroupMembers#getToken()
	 * @see #getServicegroupMembers()
	 * @generated
	 */
	EAttribute getServicegroupMembers_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.Servicegroups <em>Servicegroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicegroups</em>'.
	 * @see org.emona.model.base.attributes.Servicegroups
	 * @generated
	 */
	EClass getServicegroups();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.Servicegroups#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.Servicegroups#getReference()
	 * @see #getServicegroups()
	 * @generated
	 */
	EReference getServicegroups_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.Servicegroups#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.Servicegroups#getToken()
	 * @see #getServicegroups()
	 * @generated
	 */
	EAttribute getServicegroups_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.DependentHostName <em>Dependent Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Host Name</em>'.
	 * @see org.emona.model.base.attributes.DependentHostName
	 * @generated
	 */
	EClass getDependentHostName();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.DependentHostName#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.DependentHostName#getReference()
	 * @see #getDependentHostName()
	 * @generated
	 */
	EReference getDependentHostName_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.DependentHostName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.DependentHostName#getToken()
	 * @see #getDependentHostName()
	 * @generated
	 */
	EAttribute getDependentHostName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.DependentHostgroupName <em>Dependent Hostgroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Hostgroup Name</em>'.
	 * @see org.emona.model.base.attributes.DependentHostgroupName
	 * @generated
	 */
	EClass getDependentHostgroupName();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.DependentHostgroupName#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.DependentHostgroupName#getReference()
	 * @see #getDependentHostgroupName()
	 * @generated
	 */
	EReference getDependentHostgroupName_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.DependentHostgroupName#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.DependentHostgroupName#getToken()
	 * @see #getDependentHostgroupName()
	 * @generated
	 */
	EAttribute getDependentHostgroupName_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.DependentServiceDescription <em>Dependent Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Service Description</em>'.
	 * @see org.emona.model.base.attributes.DependentServiceDescription
	 * @generated
	 */
	EClass getDependentServiceDescription();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.DependentServiceDescription#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.DependentServiceDescription#getReference()
	 * @see #getDependentServiceDescription()
	 * @generated
	 */
	EReference getDependentServiceDescription_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.DependentServiceDescription#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.DependentServiceDescription#getToken()
	 * @see #getDependentServiceDescription()
	 * @generated
	 */
	EAttribute getDependentServiceDescription_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceDescriptionReference <em>Service Description Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description Reference</em>'.
	 * @see org.emona.model.base.attributes.ServiceDescriptionReference
	 * @generated
	 */
	EClass getServiceDescriptionReference();

	/**
	 * Returns the meta object for the reference list '{@link org.emona.model.base.attributes.ServiceDescriptionReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.ServiceDescriptionReference#getReference()
	 * @see #getServiceDescriptionReference()
	 * @generated
	 */
	EReference getServiceDescriptionReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceDescriptionReference#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceDescriptionReference#getToken()
	 * @see #getServiceDescriptionReference()
	 * @generated
	 */
	EAttribute getServiceDescriptionReference_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.InheritsParent <em>Inherits Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherits Parent</em>'.
	 * @see org.emona.model.base.attributes.InheritsParent
	 * @generated
	 */
	EClass getInheritsParent();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.InheritsParent#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.InheritsParent#getToken()
	 * @see #getInheritsParent()
	 * @generated
	 */
	EAttribute getInheritsParent_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceExecutionFailureCriteria <em>Service Execution Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Execution Failure Criteria</em>'.
	 * @see org.emona.model.base.attributes.ServiceExecutionFailureCriteria
	 * @generated
	 */
	EClass getServiceExecutionFailureCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceExecutionFailureCriteria#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceExecutionFailureCriteria#getToken()
	 * @see #getServiceExecutionFailureCriteria()
	 * @generated
	 */
	EAttribute getServiceExecutionFailureCriteria_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.NotificationFailureCriteria <em>Notification Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Failure Criteria</em>'.
	 * @see org.emona.model.base.attributes.NotificationFailureCriteria
	 * @generated
	 */
	EClass getNotificationFailureCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.NotificationFailureCriteria#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.NotificationFailureCriteria#getToken()
	 * @see #getNotificationFailureCriteria()
	 * @generated
	 */
	EAttribute getNotificationFailureCriteria_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.DependencyPeriod <em>Dependency Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Period</em>'.
	 * @see org.emona.model.base.attributes.DependencyPeriod
	 * @generated
	 */
	EClass getDependencyPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.DependencyPeriod#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.DependencyPeriod#getReference()
	 * @see #getDependencyPeriod()
	 * @generated
	 */
	EReference getDependencyPeriod_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.DependencyPeriod#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.DependencyPeriod#getToken()
	 * @see #getDependencyPeriod()
	 * @generated
	 */
	EAttribute getDependencyPeriod_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceStalkingOptions <em>Service Stalking Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Stalking Options</em>'.
	 * @see org.emona.model.base.attributes.ServiceStalkingOptions
	 * @generated
	 */
	EClass getServiceStalkingOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceStalkingOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceStalkingOptions#getToken()
	 * @see #getServiceStalkingOptions()
	 * @generated
	 */
	EAttribute getServiceStalkingOptions_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.FirstNotification <em>First Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Notification</em>'.
	 * @see org.emona.model.base.attributes.FirstNotification
	 * @generated
	 */
	EClass getFirstNotification();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.FirstNotification#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.FirstNotification#getToken()
	 * @see #getFirstNotification()
	 * @generated
	 */
	EAttribute getFirstNotification_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.LastNotification <em>Last Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Notification</em>'.
	 * @see org.emona.model.base.attributes.LastNotification
	 * @generated
	 */
	EClass getLastNotification();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.LastNotification#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.LastNotification#getToken()
	 * @see #getLastNotification()
	 * @generated
	 */
	EAttribute getLastNotification_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.EscalationPeriod <em>Escalation Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escalation Period</em>'.
	 * @see org.emona.model.base.attributes.EscalationPeriod
	 * @generated
	 */
	EClass getEscalationPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.attributes.EscalationPeriod#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.emona.model.base.attributes.EscalationPeriod#getReference()
	 * @see #getEscalationPeriod()
	 * @generated
	 */
	EReference getEscalationPeriod_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.EscalationPeriod#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.EscalationPeriod#getToken()
	 * @see #getEscalationPeriod()
	 * @generated
	 */
	EAttribute getEscalationPeriod_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceEscalationOptions <em>Service Escalation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Escalation Options</em>'.
	 * @see org.emona.model.base.attributes.ServiceEscalationOptions
	 * @generated
	 */
	EClass getServiceEscalationOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceEscalationOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceEscalationOptions#getToken()
	 * @see #getServiceEscalationOptions()
	 * @generated
	 */
	EAttribute getServiceEscalationOptions_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostExecutionFailureCriteria <em>Host Execution Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Execution Failure Criteria</em>'.
	 * @see org.emona.model.base.attributes.HostExecutionFailureCriteria
	 * @generated
	 */
	EClass getHostExecutionFailureCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostExecutionFailureCriteria#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostExecutionFailureCriteria#getToken()
	 * @see #getHostExecutionFailureCriteria()
	 * @generated
	 */
	EAttribute getHostExecutionFailureCriteria_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.ServiceNotificationFailureCriteria <em>Service Notification Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Notification Failure Criteria</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationFailureCriteria
	 * @generated
	 */
	EClass getServiceNotificationFailureCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.ServiceNotificationFailureCriteria#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.ServiceNotificationFailureCriteria#getToken()
	 * @see #getServiceNotificationFailureCriteria()
	 * @generated
	 */
	EAttribute getServiceNotificationFailureCriteria_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostNotificationFailureCriteria <em>Host Notification Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Notification Failure Criteria</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationFailureCriteria
	 * @generated
	 */
	EClass getHostNotificationFailureCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostNotificationFailureCriteria#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostNotificationFailureCriteria#getToken()
	 * @see #getHostNotificationFailureCriteria()
	 * @generated
	 */
	EAttribute getHostNotificationFailureCriteria_Token();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.attributes.HostEscalationOptions <em>Host Escalation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Escalation Options</em>'.
	 * @see org.emona.model.base.attributes.HostEscalationOptions
	 * @generated
	 */
	EClass getHostEscalationOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.attributes.HostEscalationOptions#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.emona.model.base.attributes.HostEscalationOptions#getToken()
	 * @see #getHostEscalationOptions()
	 * @generated
	 */
	EAttribute getHostEscalationOptions_Token();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AttributesFactory getAttributesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.AliasImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getAlias()
		 * @generated
		 */
		EClass ALIAS = eINSTANCE.getAlias();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__TOKEN = eINSTANCE.getAlias_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostInitialStateImpl <em>Host Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostInitialStateImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostInitialState()
		 * @generated
		 */
		EClass HOST_INITIAL_STATE = eINSTANCE.getHostInitialState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INITIAL_STATE__VALUE = eINSTANCE
				.getHostInitialState_Value();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_INITIAL_STATE__TOKEN = eINSTANCE
				.getHostInitialState_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostgroupsImpl <em>Hostgroups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostgroupsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroups()
		 * @generated
		 */
		EClass HOSTGROUPS = eINSTANCE.getHostgroups();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTGROUPS__REFERENCE = eINSTANCE.getHostgroups_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTGROUPS__TOKEN = eINSTANCE.getHostgroups_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ParentsImpl <em>Parents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ParentsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getParents()
		 * @generated
		 */
		EClass PARENTS = eINSTANCE.getParents();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTS__REFERENCE = eINSTANCE.getParents_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENTS__TOKEN = eINSTANCE.getParents_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.AddressImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__VALUE = eINSTANCE.getAddress_Value();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TOKEN = eINSTANCE.getAddress_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.DisplayNameImpl <em>Display Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.DisplayNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDisplayName()
		 * @generated
		 */
		EClass DISPLAY_NAME = eINSTANCE.getDisplayName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME__TOKEN = eINSTANCE.getDisplayName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.RegisterImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__TOKEN = eINSTANCE.getRegister_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.UseImpl <em>Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.UseImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getUse()
		 * @generated
		 */
		EClass USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE__REFERENCE = eINSTANCE.getUse_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE__TOKEN = eINSTANCE.getUse_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.TimeperiodNameImpl <em>Timeperiod Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.TimeperiodNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTimeperiodName()
		 * @generated
		 */
		EClass TIMEPERIOD_NAME = eINSTANCE.getTimeperiodName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEPERIOD_NAME__TOKEN = eINSTANCE.getTimeperiodName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostgroupNameImpl <em>Hostgroup Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostgroupNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroupName()
		 * @generated
		 */
		EClass HOSTGROUP_NAME = eINSTANCE.getHostgroupName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTGROUP_NAME__TOKEN = eINSTANCE.getHostgroupName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostNameImpl <em>Host Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostName()
		 * @generated
		 */
		EClass HOST_NAME = eINSTANCE.getHostName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NAME__TOKEN = eINSTANCE.getHostName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.TemplateNameImpl <em>Template Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.TemplateNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTemplateName()
		 * @generated
		 */
		EClass TEMPLATE_NAME = eINSTANCE.getTemplateName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_NAME__TOKEN = eINSTANCE.getTemplateName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.CommandLineImpl <em>Command Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.CommandLineImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCommandLine()
		 * @generated
		 */
		EClass COMMAND_LINE = eINSTANCE.getCommandLine();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE__TOKEN = eINSTANCE.getCommandLine_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.CommandNameImpl <em>Command Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.CommandNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCommandName()
		 * @generated
		 */
		EClass COMMAND_NAME = eINSTANCE.getCommandName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_NAME__TOKEN = eINSTANCE.getCommandName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.MaxCheckAttemptsImpl <em>Max Check Attempts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.MaxCheckAttemptsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getMaxCheckAttempts()
		 * @generated
		 */
		EClass MAX_CHECK_ATTEMPTS = eINSTANCE.getMaxCheckAttempts();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_CHECK_ATTEMPTS__TOKEN = eINSTANCE
				.getMaxCheckAttempts_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.CheckIntervalImpl <em>Check Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.CheckIntervalImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckInterval()
		 * @generated
		 */
		EClass CHECK_INTERVAL = eINSTANCE.getCheckInterval();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_INTERVAL__TOKEN = eINSTANCE.getCheckInterval_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.RetryIntervalImpl <em>Retry Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.RetryIntervalImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRetryInterval()
		 * @generated
		 */
		EClass RETRY_INTERVAL = eINSTANCE.getRetryInterval();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_INTERVAL__TOKEN = eINSTANCE.getRetryInterval_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ActiveChecksEnabledImpl <em>Active Checks Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ActiveChecksEnabledImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getActiveChecksEnabled()
		 * @generated
		 */
		EClass ACTIVE_CHECKS_ENABLED = eINSTANCE.getActiveChecksEnabled();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_CHECKS_ENABLED__TOKEN = eINSTANCE
				.getActiveChecksEnabled_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.PassiveChecksEnabledImpl <em>Passive Checks Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.PassiveChecksEnabledImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getPassiveChecksEnabled()
		 * @generated
		 */
		EClass PASSIVE_CHECKS_ENABLED = eINSTANCE.getPassiveChecksEnabled();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSIVE_CHECKS_ENABLED__TOKEN = eINSTANCE
				.getPassiveChecksEnabled_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.CheckPeriodImpl <em>Check Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.CheckPeriodImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckPeriod()
		 * @generated
		 */
		EClass CHECK_PERIOD = eINSTANCE.getCheckPeriod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_PERIOD__REFERENCE = eINSTANCE
				.getCheckPeriod_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_PERIOD__TOKEN = eINSTANCE.getCheckPeriod_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.CheckCommandImpl <em>Check Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.CheckCommandImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckCommand()
		 * @generated
		 */
		EClass CHECK_COMMAND = eINSTANCE.getCheckCommand();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_COMMAND__REFERENCE = eINSTANCE
				.getCheckCommand_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_COMMAND__TOKEN = eINSTANCE.getCheckCommand_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.TimeExcludeImpl <em>Time Exclude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.TimeExcludeImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTimeExclude()
		 * @generated
		 */
		EClass TIME_EXCLUDE = eINSTANCE.getTimeExclude();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EXCLUDE__REFERENCE = eINSTANCE
				.getTimeExclude_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EXCLUDE__TOKEN = eINSTANCE.getTimeExclude_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ContactNameImpl <em>Contact Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ContactNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactName()
		 * @generated
		 */
		EClass CONTACT_NAME = eINSTANCE.getContactName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_NAME__TOKEN = eINSTANCE.getContactName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.NotificationsEnabledImpl <em>Notifications Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.NotificationsEnabledImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationsEnabled()
		 * @generated
		 */
		EClass NOTIFICATIONS_ENABLED = eINSTANCE.getNotificationsEnabled();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATIONS_ENABLED__TOKEN = eINSTANCE
				.getNotificationsEnabled_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostNotificationsEnabledImpl <em>Host Notifications Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostNotificationsEnabledImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationsEnabled()
		 * @generated
		 */
		EClass HOST_NOTIFICATIONS_ENABLED = eINSTANCE
				.getHostNotificationsEnabled();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATIONS_ENABLED__TOKEN = eINSTANCE
				.getHostNotificationsEnabled_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationsEnabledImpl <em>Service Notifications Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceNotificationsEnabledImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationsEnabled()
		 * @generated
		 */
		EClass SERVICE_NOTIFICATIONS_ENABLED = eINSTANCE
				.getServiceNotificationsEnabled();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NOTIFICATIONS_ENABLED__TOKEN = eINSTANCE
				.getServiceNotificationsEnabled_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.NotificationPeriodImpl <em>Notification Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.NotificationPeriodImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationPeriod()
		 * @generated
		 */
		EClass NOTIFICATION_PERIOD = eINSTANCE.getNotificationPeriod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_PERIOD__REFERENCE = eINSTANCE
				.getNotificationPeriod_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_PERIOD__TOKEN = eINSTANCE
				.getNotificationPeriod_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostNotificationPeriodImpl <em>Host Notification Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostNotificationPeriodImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationPeriod()
		 * @generated
		 */
		EClass HOST_NOTIFICATION_PERIOD = eINSTANCE.getHostNotificationPeriod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_NOTIFICATION_PERIOD__REFERENCE = eINSTANCE
				.getHostNotificationPeriod_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_PERIOD__TOKEN = eINSTANCE
				.getHostNotificationPeriod_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationPeriodImpl <em>Service Notification Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceNotificationPeriodImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationPeriod()
		 * @generated
		 */
		EClass SERVICE_NOTIFICATION_PERIOD = eINSTANCE
				.getServiceNotificationPeriod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NOTIFICATION_PERIOD__REFERENCE = eINSTANCE
				.getServiceNotificationPeriod_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NOTIFICATION_PERIOD__TOKEN = eINSTANCE
				.getServiceNotificationPeriod_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostNotificationOptionsImpl <em>Host Notification Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostNotificationOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationOptions()
		 * @generated
		 */
		EClass HOST_NOTIFICATION_OPTIONS = eINSTANCE
				.getHostNotificationOptions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_OPTIONS__TOKEN = eINSTANCE
				.getHostNotificationOptions_Token();

		/**
		 * The meta object literal for the '<em><b>Recovery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_OPTIONS__RECOVERY = eINSTANCE
				.getHostNotificationOptions_Recovery();

		/**
		 * The meta object literal for the '<em><b>Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_OPTIONS__DOWN = eINSTANCE
				.getHostNotificationOptions_Down();

		/**
		 * The meta object literal for the '<em><b>Unreachable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_OPTIONS__UNREACHABLE = eINSTANCE
				.getHostNotificationOptions_Unreachable();

		/**
		 * The meta object literal for the '<em><b>Flapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_OPTIONS__FLAPPING = eINSTANCE
				.getHostNotificationOptions_Flapping();

		/**
		 * The meta object literal for the '<em><b>Scheduled Downtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME = eINSTANCE
				.getHostNotificationOptions_ScheduledDowntime();

		/**
		 * The meta object literal for the '<em><b>None</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_OPTIONS__NONE = eINSTANCE
				.getHostNotificationOptions_None();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl <em>Service Notification Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceNotificationOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationOptions()
		 * @generated
		 */
		EClass SERVICE_NOTIFICATION_OPTIONS = eINSTANCE
				.getServiceNotificationOptions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NOTIFICATION_OPTIONS__TOKEN = eINSTANCE
				.getServiceNotificationOptions_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.NotificationCommandsImpl <em>Notification Commands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.NotificationCommandsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationCommands()
		 * @generated
		 */
		EClass NOTIFICATION_COMMANDS = eINSTANCE.getNotificationCommands();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_COMMANDS__REFERENCE = eINSTANCE
				.getNotificationCommands_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_COMMANDS__TOKEN = eINSTANCE
				.getNotificationCommands_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostNotificationCommandsImpl <em>Host Notification Commands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostNotificationCommandsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationCommands()
		 * @generated
		 */
		EClass HOST_NOTIFICATION_COMMANDS = eINSTANCE
				.getHostNotificationCommands();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_NOTIFICATION_COMMANDS__REFERENCE = eINSTANCE
				.getHostNotificationCommands_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_COMMANDS__TOKEN = eINSTANCE
				.getHostNotificationCommands_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationCommandsImpl <em>Service Notification Commands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceNotificationCommandsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationCommands()
		 * @generated
		 */
		EClass SERVICE_NOTIFICATION_COMMANDS = eINSTANCE
				.getServiceNotificationCommands();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NOTIFICATION_COMMANDS__REFERENCE = eINSTANCE
				.getServiceNotificationCommands_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NOTIFICATION_COMMANDS__TOKEN = eINSTANCE
				.getServiceNotificationCommands_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ContactAddressImpl <em>Contact Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ContactAddressImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactAddress()
		 * @generated
		 */
		EClass CONTACT_ADDRESS = eINSTANCE.getContactAddress();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_ADDRESS__TOKEN = eINSTANCE.getContactAddress_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.EmailImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__TOKEN = eINSTANCE.getEmail_Token();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__VALUE = eINSTANCE.getEmail_Value();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.PagerImpl <em>Pager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.PagerImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getPager()
		 * @generated
		 */
		EClass PAGER = eINSTANCE.getPager();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGER__TOKEN = eINSTANCE.getPager_Token();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGER__VALUE = eINSTANCE.getPager_Value();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ContactMembersImpl <em>Contact Members</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ContactMembersImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactMembers()
		 * @generated
		 */
		EClass CONTACT_MEMBERS = eINSTANCE.getContactMembers();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MEMBERS__REFERENCE = eINSTANCE
				.getContactMembers_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MEMBERS__TOKEN = eINSTANCE.getContactMembers_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ContactGroupNameImpl <em>Contact Group Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ContactGroupNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactGroupName()
		 * @generated
		 */
		EClass CONTACT_GROUP_NAME = eINSTANCE.getContactGroupName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_GROUP_NAME__TOKEN = eINSTANCE
				.getContactGroupName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ContactsImpl <em>Contacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ContactsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContacts()
		 * @generated
		 */
		EClass CONTACTS = eINSTANCE.getContacts();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTS__REFERENCE = eINSTANCE.getContacts_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACTS__TOKEN = eINSTANCE.getContacts_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ContactGroupsImpl <em>Contact Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ContactGroupsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getContactGroups()
		 * @generated
		 */
		EClass CONTACT_GROUPS = eINSTANCE.getContactGroups();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_GROUPS__REFERENCE = eINSTANCE
				.getContactGroups_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_GROUPS__TOKEN = eINSTANCE.getContactGroups_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.NotificationIntervalImpl <em>Notification Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.NotificationIntervalImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationInterval()
		 * @generated
		 */
		EClass NOTIFICATION_INTERVAL = eINSTANCE.getNotificationInterval();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_INTERVAL__TOKEN = eINSTANCE
				.getNotificationInterval_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.FirstNotificationDelayImpl <em>First Notification Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.FirstNotificationDelayImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFirstNotificationDelay()
		 * @generated
		 */
		EClass FIRST_NOTIFICATION_DELAY = eINSTANCE.getFirstNotificationDelay();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NOTIFICATION_DELAY__TOKEN = eINSTANCE
				.getFirstNotificationDelay_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostStalkingOptionsImpl <em>Host Stalking Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostStalkingOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostStalkingOptions()
		 * @generated
		 */
		EClass HOST_STALKING_OPTIONS = eINSTANCE.getHostStalkingOptions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_STALKING_OPTIONS__TOKEN = eINSTANCE
				.getHostStalkingOptions_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.NotesImpl <em>Notes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.NotesImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotes()
		 * @generated
		 */
		EClass NOTES = eINSTANCE.getNotes();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES__TOKEN = eINSTANCE.getNotes_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.NotesUrlImpl <em>Notes Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.NotesUrlImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotesUrl()
		 * @generated
		 */
		EClass NOTES_URL = eINSTANCE.getNotesUrl();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES_URL__TOKEN = eINSTANCE.getNotesUrl_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ActionUrlImpl <em>Action Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ActionUrlImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getActionUrl()
		 * @generated
		 */
		EClass ACTION_URL = eINSTANCE.getActionUrl();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_URL__TOKEN = eINSTANCE.getActionUrl_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.IconImageImpl <em>Icon Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.IconImageImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getIconImage()
		 * @generated
		 */
		EClass ICON_IMAGE = eINSTANCE.getIconImage();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_IMAGE__TOKEN = eINSTANCE.getIconImage_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.IconImageAltImpl <em>Icon Image Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.IconImageAltImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getIconImageAlt()
		 * @generated
		 */
		EClass ICON_IMAGE_ALT = eINSTANCE.getIconImageAlt();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_IMAGE_ALT__TOKEN = eINSTANCE.getIconImageAlt_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.VrmlImageImpl <em>Vrml Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.VrmlImageImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getVrmlImage()
		 * @generated
		 */
		EClass VRML_IMAGE = eINSTANCE.getVrmlImage();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VRML_IMAGE__TOKEN = eINSTANCE.getVrmlImage_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.StatusmapImageImpl <em>Statusmap Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.StatusmapImageImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getStatusmapImage()
		 * @generated
		 */
		EClass STATUSMAP_IMAGE = eINSTANCE.getStatusmapImage();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUSMAP_IMAGE__TOKEN = eINSTANCE.getStatusmapImage_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.TwoDCoordsImpl <em>Two DCoords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.TwoDCoordsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getTwoDCoords()
		 * @generated
		 */
		EClass TWO_DCOORDS = eINSTANCE.getTwoDCoords();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_DCOORDS__TOKEN = eINSTANCE.getTwoDCoords_Token();

		/**
		 * The meta object literal for the '<em><b>Xcoord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_DCOORDS__XCOORD = eINSTANCE.getTwoDCoords_Xcoord();

		/**
		 * The meta object literal for the '<em><b>Ycoord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_DCOORDS__YCOORD = eINSTANCE.getTwoDCoords_Ycoord();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ThreeDCoordsImpl <em>Three DCoords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ThreeDCoordsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getThreeDCoords()
		 * @generated
		 */
		EClass THREE_DCOORDS = eINSTANCE.getThreeDCoords();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREE_DCOORDS__TOKEN = eINSTANCE.getThreeDCoords_Token();

		/**
		 * The meta object literal for the '<em><b>Xcoord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREE_DCOORDS__XCOORD = eINSTANCE.getThreeDCoords_Xcoord();

		/**
		 * The meta object literal for the '<em><b>Ycoord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREE_DCOORDS__YCOORD = eINSTANCE.getThreeDCoords_Ycoord();

		/**
		 * The meta object literal for the '<em><b>Zcoord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREE_DCOORDS__ZCOORD = eINSTANCE.getThreeDCoords_Zcoord();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostgroupMembersImpl <em>Hostgroup Members</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostgroupMembersImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroupMembers()
		 * @generated
		 */
		EClass HOSTGROUP_MEMBERS = eINSTANCE.getHostgroupMembers();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTGROUP_MEMBERS__REFERENCE = eINSTANCE
				.getHostgroupMembers_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTGROUP_MEMBERS__TOKEN = eINSTANCE
				.getHostgroupMembers_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostMembersImpl <em>Host Members</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostMembersImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostMembers()
		 * @generated
		 */
		EClass HOST_MEMBERS = eINSTANCE.getHostMembers();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_MEMBERS__REFERENCE = eINSTANCE
				.getHostMembers_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_MEMBERS__TOKEN = eINSTANCE.getHostMembers_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostNameReferenceImpl <em>Host Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostNameReferenceImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNameReference()
		 * @generated
		 */
		EClass HOST_NAME_REFERENCE = eINSTANCE.getHostNameReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_NAME_REFERENCE__REFERENCE = eINSTANCE
				.getHostNameReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NAME_REFERENCE__TOKEN = eINSTANCE
				.getHostNameReference_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostgroupNameReferenceImpl <em>Hostgroup Name Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostgroupNameReferenceImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostgroupNameReference()
		 * @generated
		 */
		EClass HOSTGROUP_NAME_REFERENCE = eINSTANCE.getHostgroupNameReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTGROUP_NAME_REFERENCE__REFERENCE = eINSTANCE
				.getHostgroupNameReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTGROUP_NAME_REFERENCE__TOKEN = eINSTANCE
				.getHostgroupNameReference_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceDescriptionImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceDescription()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION = eINSTANCE.getServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__TOKEN = eINSTANCE
				.getServiceDescription_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceInitialStateImpl <em>Service Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceInitialStateImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceInitialState()
		 * @generated
		 */
		EClass SERVICE_INITIAL_STATE = eINSTANCE.getServiceInitialState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INITIAL_STATE__VALUE = eINSTANCE
				.getServiceInitialState_Value();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INITIAL_STATE__TOKEN = eINSTANCE
				.getServiceInitialState_Token();

		/**
		 * The meta object literal for the '<em><b>Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INITIAL_STATE__OK = eINSTANCE
				.getServiceInitialState_Ok();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.IsVolatileFlagImpl <em>Is Volatile Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.IsVolatileFlagImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getIsVolatileFlag()
		 * @generated
		 */
		EClass IS_VOLATILE_FLAG = eINSTANCE.getIsVolatileFlag();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_VOLATILE_FLAG__TOKEN = eINSTANCE
				.getIsVolatileFlag_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ObsessOverHostImpl <em>Obsess Over Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ObsessOverHostImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getObsessOverHost()
		 * @generated
		 */
		EClass OBSESS_OVER_HOST = eINSTANCE.getObsessOverHost();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSESS_OVER_HOST__TOKEN = eINSTANCE
				.getObsessOverHost_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ObsessOverServiceImpl <em>Obsess Over Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ObsessOverServiceImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getObsessOverService()
		 * @generated
		 */
		EClass OBSESS_OVER_SERVICE = eINSTANCE.getObsessOverService();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSESS_OVER_SERVICE__TOKEN = eINSTANCE
				.getObsessOverService_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.CheckFreshnessImpl <em>Check Freshness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.CheckFreshnessImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getCheckFreshness()
		 * @generated
		 */
		EClass CHECK_FRESHNESS = eINSTANCE.getCheckFreshness();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_FRESHNESS__TOKEN = eINSTANCE.getCheckFreshness_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.FreshnessThresholdImpl <em>Freshness Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.FreshnessThresholdImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFreshnessThreshold()
		 * @generated
		 */
		EClass FRESHNESS_THRESHOLD = eINSTANCE.getFreshnessThreshold();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRESHNESS_THRESHOLD__TOKEN = eINSTANCE
				.getFreshnessThreshold_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.EventHandlerImpl <em>Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.EventHandlerImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEventHandler()
		 * @generated
		 */
		EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__REFERENCE = eINSTANCE
				.getEventHandler_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_HANDLER__TOKEN = eINSTANCE.getEventHandler_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.EventHandlerEnabledImpl <em>Event Handler Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.EventHandlerEnabledImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEventHandlerEnabled()
		 * @generated
		 */
		EClass EVENT_HANDLER_ENABLED = eINSTANCE.getEventHandlerEnabled();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_HANDLER_ENABLED__TOKEN = eINSTANCE
				.getEventHandlerEnabled_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.LowFlapThresholdImpl <em>Low Flap Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.LowFlapThresholdImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getLowFlapThreshold()
		 * @generated
		 */
		EClass LOW_FLAP_THRESHOLD = eINSTANCE.getLowFlapThreshold();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOW_FLAP_THRESHOLD__TOKEN = eINSTANCE
				.getLowFlapThreshold_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HighFlapThresholdImpl <em>High Flap Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HighFlapThresholdImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHighFlapThreshold()
		 * @generated
		 */
		EClass HIGH_FLAP_THRESHOLD = eINSTANCE.getHighFlapThreshold();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_FLAP_THRESHOLD__TOKEN = eINSTANCE
				.getHighFlapThreshold_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.FlapDetectionEnabledImpl <em>Flap Detection Enabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.FlapDetectionEnabledImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFlapDetectionEnabled()
		 * @generated
		 */
		EClass FLAP_DETECTION_ENABLED = eINSTANCE.getFlapDetectionEnabled();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAP_DETECTION_ENABLED__TOKEN = eINSTANCE
				.getFlapDetectionEnabled_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostFlapDetectionOptionsImpl <em>Host Flap Detection Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostFlapDetectionOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostFlapDetectionOptions()
		 * @generated
		 */
		EClass HOST_FLAP_DETECTION_OPTIONS = eINSTANCE
				.getHostFlapDetectionOptions();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_FLAP_DETECTION_OPTIONS__VALUE = eINSTANCE
				.getHostFlapDetectionOptions_Value();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_FLAP_DETECTION_OPTIONS__TOKEN = eINSTANCE
				.getHostFlapDetectionOptions_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ProcessPerfDataImpl <em>Process Perf Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ProcessPerfDataImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getProcessPerfData()
		 * @generated
		 */
		EClass PROCESS_PERF_DATA = eINSTANCE.getProcessPerfData();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_PERF_DATA__TOKEN = eINSTANCE
				.getProcessPerfData_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.RetainStatusInformationImpl <em>Retain Status Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.RetainStatusInformationImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRetainStatusInformation()
		 * @generated
		 */
		EClass RETAIN_STATUS_INFORMATION = eINSTANCE
				.getRetainStatusInformation();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETAIN_STATUS_INFORMATION__TOKEN = eINSTANCE
				.getRetainStatusInformation_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.RetainNonstatusInformationImpl <em>Retain Nonstatus Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.RetainNonstatusInformationImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getRetainNonstatusInformation()
		 * @generated
		 */
		EClass RETAIN_NONSTATUS_INFORMATION = eINSTANCE
				.getRetainNonstatusInformation();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETAIN_NONSTATUS_INFORMATION__TOKEN = eINSTANCE
				.getRetainNonstatusInformation_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceFlapDetectionOptionsImpl <em>Service Flap Detection Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceFlapDetectionOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceFlapDetectionOptions()
		 * @generated
		 */
		EClass SERVICE_FLAP_DETECTION_OPTIONS = eINSTANCE
				.getServiceFlapDetectionOptions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FLAP_DETECTION_OPTIONS__TOKEN = eINSTANCE
				.getServiceFlapDetectionOptions_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServicegroupNameImpl <em>Servicegroup Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServicegroupNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServicegroupName()
		 * @generated
		 */
		EClass SERVICEGROUP_NAME = eINSTANCE.getServicegroupName();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICEGROUP_NAME__TOKEN = eINSTANCE
				.getServicegroupName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceMembersImpl <em>Service Members</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceMembersImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceMembers()
		 * @generated
		 */
		EClass SERVICE_MEMBERS = eINSTANCE.getServiceMembers();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MEMBERS__REFERENCE = eINSTANCE
				.getServiceMembers_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MEMBERS__TOKEN = eINSTANCE.getServiceMembers_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServicegroupMembersImpl <em>Servicegroup Members</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServicegroupMembersImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServicegroupMembers()
		 * @generated
		 */
		EClass SERVICEGROUP_MEMBERS = eINSTANCE.getServicegroupMembers();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICEGROUP_MEMBERS__REFERENCE = eINSTANCE
				.getServicegroupMembers_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICEGROUP_MEMBERS__TOKEN = eINSTANCE
				.getServicegroupMembers_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServicegroupsImpl <em>Servicegroups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServicegroupsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServicegroups()
		 * @generated
		 */
		EClass SERVICEGROUPS = eINSTANCE.getServicegroups();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICEGROUPS__REFERENCE = eINSTANCE
				.getServicegroups_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICEGROUPS__TOKEN = eINSTANCE.getServicegroups_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.DependentHostNameImpl <em>Dependent Host Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.DependentHostNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependentHostName()
		 * @generated
		 */
		EClass DEPENDENT_HOST_NAME = eINSTANCE.getDependentHostName();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT_HOST_NAME__REFERENCE = eINSTANCE
				.getDependentHostName_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT_HOST_NAME__TOKEN = eINSTANCE
				.getDependentHostName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.DependentHostgroupNameImpl <em>Dependent Hostgroup Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.DependentHostgroupNameImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependentHostgroupName()
		 * @generated
		 */
		EClass DEPENDENT_HOSTGROUP_NAME = eINSTANCE.getDependentHostgroupName();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT_HOSTGROUP_NAME__REFERENCE = eINSTANCE
				.getDependentHostgroupName_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT_HOSTGROUP_NAME__TOKEN = eINSTANCE
				.getDependentHostgroupName_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.DependentServiceDescriptionImpl <em>Dependent Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.DependentServiceDescriptionImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependentServiceDescription()
		 * @generated
		 */
		EClass DEPENDENT_SERVICE_DESCRIPTION = eINSTANCE
				.getDependentServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT_SERVICE_DESCRIPTION__REFERENCE = eINSTANCE
				.getDependentServiceDescription_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT_SERVICE_DESCRIPTION__TOKEN = eINSTANCE
				.getDependentServiceDescription_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceDescriptionReferenceImpl <em>Service Description Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceDescriptionReferenceImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceDescriptionReference()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION_REFERENCE = eINSTANCE
				.getServiceDescriptionReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION_REFERENCE__REFERENCE = eINSTANCE
				.getServiceDescriptionReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION_REFERENCE__TOKEN = eINSTANCE
				.getServiceDescriptionReference_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.InheritsParentImpl <em>Inherits Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.InheritsParentImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getInheritsParent()
		 * @generated
		 */
		EClass INHERITS_PARENT = eINSTANCE.getInheritsParent();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITS_PARENT__TOKEN = eINSTANCE.getInheritsParent_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceExecutionFailureCriteriaImpl <em>Service Execution Failure Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceExecutionFailureCriteriaImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceExecutionFailureCriteria()
		 * @generated
		 */
		EClass SERVICE_EXECUTION_FAILURE_CRITERIA = eINSTANCE
				.getServiceExecutionFailureCriteria();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXECUTION_FAILURE_CRITERIA__TOKEN = eINSTANCE
				.getServiceExecutionFailureCriteria_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl <em>Notification Failure Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.NotificationFailureCriteriaImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getNotificationFailureCriteria()
		 * @generated
		 */
		EClass NOTIFICATION_FAILURE_CRITERIA = eINSTANCE
				.getNotificationFailureCriteria();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_FAILURE_CRITERIA__TOKEN = eINSTANCE
				.getNotificationFailureCriteria_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.DependencyPeriodImpl <em>Dependency Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.DependencyPeriodImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getDependencyPeriod()
		 * @generated
		 */
		EClass DEPENDENCY_PERIOD = eINSTANCE.getDependencyPeriod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_PERIOD__REFERENCE = eINSTANCE
				.getDependencyPeriod_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_PERIOD__TOKEN = eINSTANCE
				.getDependencyPeriod_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl <em>Service Stalking Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceStalkingOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceStalkingOptions()
		 * @generated
		 */
		EClass SERVICE_STALKING_OPTIONS = eINSTANCE.getServiceStalkingOptions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_STALKING_OPTIONS__TOKEN = eINSTANCE
				.getServiceStalkingOptions_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.FirstNotificationImpl <em>First Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.FirstNotificationImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getFirstNotification()
		 * @generated
		 */
		EClass FIRST_NOTIFICATION = eINSTANCE.getFirstNotification();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NOTIFICATION__TOKEN = eINSTANCE
				.getFirstNotification_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.LastNotificationImpl <em>Last Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.LastNotificationImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getLastNotification()
		 * @generated
		 */
		EClass LAST_NOTIFICATION = eINSTANCE.getLastNotification();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAST_NOTIFICATION__TOKEN = eINSTANCE
				.getLastNotification_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.EscalationPeriodImpl <em>Escalation Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.EscalationPeriodImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getEscalationPeriod()
		 * @generated
		 */
		EClass ESCALATION_PERIOD = eINSTANCE.getEscalationPeriod();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCALATION_PERIOD__REFERENCE = eINSTANCE
				.getEscalationPeriod_Reference();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESCALATION_PERIOD__TOKEN = eINSTANCE
				.getEscalationPeriod_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceEscalationOptionsImpl <em>Service Escalation Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceEscalationOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceEscalationOptions()
		 * @generated
		 */
		EClass SERVICE_ESCALATION_OPTIONS = eINSTANCE
				.getServiceEscalationOptions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ESCALATION_OPTIONS__TOKEN = eINSTANCE
				.getServiceEscalationOptions_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostExecutionFailureCriteriaImpl <em>Host Execution Failure Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostExecutionFailureCriteriaImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostExecutionFailureCriteria()
		 * @generated
		 */
		EClass HOST_EXECUTION_FAILURE_CRITERIA = eINSTANCE
				.getHostExecutionFailureCriteria();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_EXECUTION_FAILURE_CRITERIA__TOKEN = eINSTANCE
				.getHostExecutionFailureCriteria_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.ServiceNotificationFailureCriteriaImpl <em>Service Notification Failure Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.ServiceNotificationFailureCriteriaImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getServiceNotificationFailureCriteria()
		 * @generated
		 */
		EClass SERVICE_NOTIFICATION_FAILURE_CRITERIA = eINSTANCE
				.getServiceNotificationFailureCriteria();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NOTIFICATION_FAILURE_CRITERIA__TOKEN = eINSTANCE
				.getServiceNotificationFailureCriteria_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostNotificationFailureCriteriaImpl <em>Host Notification Failure Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostNotificationFailureCriteriaImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostNotificationFailureCriteria()
		 * @generated
		 */
		EClass HOST_NOTIFICATION_FAILURE_CRITERIA = eINSTANCE
				.getHostNotificationFailureCriteria();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_NOTIFICATION_FAILURE_CRITERIA__TOKEN = eINSTANCE
				.getHostNotificationFailureCriteria_Token();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.attributes.impl.HostEscalationOptionsImpl <em>Host Escalation Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.attributes.impl.HostEscalationOptionsImpl
		 * @see org.emona.model.base.attributes.impl.AttributesPackageImpl#getHostEscalationOptions()
		 * @generated
		 */
		EClass HOST_ESCALATION_OPTIONS = eINSTANCE.getHostEscalationOptions();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_ESCALATION_OPTIONS__TOKEN = eINSTANCE
				.getHostEscalationOptions_Token();

	}

} //AttributesPackage
