/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.emona.model.base.BaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emona.org/model/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ebase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = org.emona.model.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.MonObjectImpl <em>Mon Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.MonObjectImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getMonObject()
	 * @generated
	 */
	int MON_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MON_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MON_OBJECT__USE = 1;

	/**
	 * The feature id for the '<em><b>Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MON_OBJECT__REGISTER = 2;

	/**
	 * The number of structural features of the '<em>Mon Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MON_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.emona.model.base.Attribute <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.Attribute
	 * @see org.emona.model.base.impl.BasePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.NameAttributeImpl <em>Name Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.NameAttributeImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getNameAttribute()
	 * @generated
	 */
	int NAME_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ATTRIBUTE__COMMENT = ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ATTRIBUTE__NAME = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ValueAttributeImpl <em>Value Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ValueAttributeImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getValueAttribute()
	 * @generated
	 */
	int VALUE_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ATTRIBUTE__COMMENT = ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.BooleanAttributeImpl <em>Boolean Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.BooleanAttributeImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getBooleanAttribute()
	 * @generated
	 */
	int BOOLEAN_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__COMMENT = ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE__ENABLED = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ReferenceAttributeImpl <em>Reference Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ReferenceAttributeImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getReferenceAttribute()
	 * @generated
	 */
	int REFERENCE_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ATTRIBUTE__COMMENT = ATTRIBUTE__COMMENT;

	/**
	 * The number of structural features of the '<em>Reference Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.IntegerValueAttributeImpl <em>Integer Value Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.IntegerValueAttributeImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getIntegerValueAttribute()
	 * @generated
	 */
	int INTEGER_VALUE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_ATTRIBUTE__COMMENT = ATTRIBUTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServiceStateImpl <em>Service State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServiceStateImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getServiceState()
	 * @generated
	 */
	int SERVICE_STATE = 8;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATE__OK = 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATE__WARNING = 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATE__CRITICAL = 2;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATE__UNKNOWN = 3;

	/**
	 * The number of structural features of the '<em>Service State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServiceFailureCriteriaImpl <em>Service Failure Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServiceFailureCriteriaImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getServiceFailureCriteria()
	 * @generated
	 */
	int SERVICE_FAILURE_CRITERIA = 7;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FAILURE_CRITERIA__OK = SERVICE_STATE__OK;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FAILURE_CRITERIA__WARNING = SERVICE_STATE__WARNING;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FAILURE_CRITERIA__CRITICAL = SERVICE_STATE__CRITICAL;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FAILURE_CRITERIA__UNKNOWN = SERVICE_STATE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FAILURE_CRITERIA__PENDING = SERVICE_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FAILURE_CRITERIA__NONE = SERVICE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Failure Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FAILURE_CRITERIA_FEATURE_COUNT = SERVICE_STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServiceNotificationOptionImpl <em>Service Notification Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServiceNotificationOptionImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getServiceNotificationOption()
	 * @generated
	 */
	int SERVICE_NOTIFICATION_OPTION = 9;

	/**
	 * The feature id for the '<em><b>Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTION__OK = SERVICE_STATE__OK;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTION__WARNING = SERVICE_STATE__WARNING;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTION__CRITICAL = SERVICE_STATE__CRITICAL;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTION__UNKNOWN = SERVICE_STATE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Flapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTION__FLAPPING = SERVICE_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTION__NONE = SERVICE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Notification Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NOTIFICATION_OPTION_FEATURE_COUNT = SERVICE_STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.HostStateImpl <em>Host State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.HostStateImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getHostState()
	 * @generated
	 */
	int HOST_STATE = 10;

	/**
	 * The feature id for the '<em><b>Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STATE__UP = 0;

	/**
	 * The feature id for the '<em><b>Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STATE__DOWN = 1;

	/**
	 * The feature id for the '<em><b>Unreachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STATE__UNREACHABLE = 2;

	/**
	 * The number of structural features of the '<em>Host State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.HostFailureCriteriaImpl <em>Host Failure Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.HostFailureCriteriaImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getHostFailureCriteria()
	 * @generated
	 */
	int HOST_FAILURE_CRITERIA = 11;

	/**
	 * The feature id for the '<em><b>Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FAILURE_CRITERIA__UP = HOST_STATE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FAILURE_CRITERIA__DOWN = HOST_STATE__DOWN;

	/**
	 * The feature id for the '<em><b>Unreachable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FAILURE_CRITERIA__UNREACHABLE = HOST_STATE__UNREACHABLE;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FAILURE_CRITERIA__PENDING = HOST_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FAILURE_CRITERIA__NONE = HOST_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Failure Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FAILURE_CRITERIA_FEATURE_COUNT = HOST_STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.InfoObjectImpl <em>Info Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.InfoObjectImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getInfoObject()
	 * @generated
	 */
	int INFO_OBJECT = 13;

	/**
	 * The number of structural features of the '<em>Info Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ConfigObjectImpl <em>Config Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ConfigObjectImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getConfigObject()
	 * @generated
	 */
	int CONFIG_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OBJECT__ATTR = INFO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OBJECT_FEATURE_COUNT = INFO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.CommentLineImpl <em>Comment Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.CommentLineImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getCommentLine()
	 * @generated
	 */
	int COMMENT_LINE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINE__VALUE = INFO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_LINE_FEATURE_COUNT = INFO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.HostImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getHost()
	 * @generated
	 */
	int HOST = 15;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.HostgroupImpl <em>Hostgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.HostgroupImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getHostgroup()
	 * @generated
	 */
	int HOSTGROUP = 16;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Hostgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTGROUP_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServiceImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServicegroupImpl <em>Servicegroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServicegroupImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getServicegroup()
	 * @generated
	 */
	int SERVICEGROUP = 18;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Servicegroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEGROUP_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServicedependencyImpl <em>Servicedependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServicedependencyImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getServicedependency()
	 * @generated
	 */
	int SERVICEDEPENDENCY = 19;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEDEPENDENCY__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Servicedependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEDEPENDENCY_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.HostdependencyImpl <em>Hostdependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.HostdependencyImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getHostdependency()
	 * @generated
	 */
	int HOSTDEPENDENCY = 20;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTDEPENDENCY__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Hostdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTDEPENDENCY_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServiceescalationImpl <em>Serviceescalation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServiceescalationImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getServiceescalation()
	 * @generated
	 */
	int SERVICEESCALATION = 21;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEESCALATION__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Serviceescalation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEESCALATION_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.HostescalationImpl <em>Hostescalation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.HostescalationImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getHostescalation()
	 * @generated
	 */
	int HOSTESCALATION = 22;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTESCALATION__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Hostescalation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTESCALATION_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ServiceextinfoImpl <em>Serviceextinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ServiceextinfoImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getServiceextinfo()
	 * @generated
	 */
	int SERVICEEXTINFO = 23;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEEXTINFO__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Serviceextinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEEXTINFO_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.HostextinfoImpl <em>Hostextinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.HostextinfoImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getHostextinfo()
	 * @generated
	 */
	int HOSTEXTINFO = 24;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEXTINFO__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Hostextinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEXTINFO_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.CommandImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 25;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.TimeperiodImpl <em>Timeperiod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.TimeperiodImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getTimeperiod()
	 * @generated
	 */
	int TIMEPERIOD = 26;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPERIOD__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Timeperiod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPERIOD_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ContactImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 27;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.impl.ContactgroupImpl <em>Contactgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.impl.ContactgroupImpl
	 * @see org.emona.model.base.impl.BasePackageImpl#getContactgroup()
	 * @generated
	 */
	int CONTACTGROUP = 28;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTGROUP__ATTR = CONFIG_OBJECT__ATTR;

	/**
	 * The number of structural features of the '<em>Contactgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTGROUP_FEATURE_COUNT = CONFIG_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emona.model.base.Weekday <em>Weekday</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.Weekday
	 * @see org.emona.model.base.impl.BasePackageImpl#getWeekday()
	 * @generated
	 */
	int WEEKDAY = 29;

	/**
	 * The meta object id for the '{@link org.emona.model.base.Month <em>Month</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.Month
	 * @see org.emona.model.base.impl.BasePackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 30;

	/**
	 * The meta object id for the '{@link org.emona.model.base.HostStateValue <em>Host State Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.HostStateValue
	 * @see org.emona.model.base.impl.BasePackageImpl#getHostStateValue()
	 * @generated
	 */
	int HOST_STATE_VALUE = 31;

	/**
	 * The meta object id for the '{@link org.emona.model.base.ServiceStateValue <em>Service State Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.base.ServiceStateValue
	 * @see org.emona.model.base.impl.BasePackageImpl#getServiceStateValue()
	 * @generated
	 */
	int SERVICE_STATE_VALUE = 32;

	/**
	 * The meta object id for the '<em>Inet Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.InetAddress
	 * @see org.emona.model.base.impl.BasePackageImpl#getInetAddress()
	 * @generated
	 */
	int INET_ADDRESS = 33;

	/**
	 * The meta object id for the '<em>Time Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emona.model.types.TimeRange
	 * @see org.emona.model.base.impl.BasePackageImpl#getTimeRange()
	 * @generated
	 */
	int TIME_RANGE = 34;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.emona.model.base.impl.BasePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 35;

	/**
	 * The meta object id for the '<em>Mail Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.mail.internet.InternetAddress
	 * @see org.emona.model.base.impl.BasePackageImpl#getMailAddress()
	 * @generated
	 */
	int MAIL_ADDRESS = 36;

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.MonObject <em>Mon Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mon Object</em>'.
	 * @see org.emona.model.base.MonObject
	 * @generated
	 */
	EClass getMonObject();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.MonObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emona.model.base.MonObject#getName()
	 * @see #getMonObject()
	 * @generated
	 */
	EAttribute getMonObject_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emona.model.base.MonObject#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.emona.model.base.MonObject#getUse()
	 * @see #getMonObject()
	 * @generated
	 */
	EReference getMonObject_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.MonObject#isRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register</em>'.
	 * @see org.emona.model.base.MonObject#isRegister()
	 * @see #getMonObject()
	 * @generated
	 */
	EAttribute getMonObject_Register();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.emona.model.base.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.Attribute#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.emona.model.base.Attribute#getComment()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Comment();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.NameAttribute <em>Name Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Attribute</em>'.
	 * @see org.emona.model.base.NameAttribute
	 * @generated
	 */
	EClass getNameAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.NameAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emona.model.base.NameAttribute#getName()
	 * @see #getNameAttribute()
	 * @generated
	 */
	EAttribute getNameAttribute_Name();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.ValueAttribute <em>Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Attribute</em>'.
	 * @see org.emona.model.base.ValueAttribute
	 * @generated
	 */
	EClass getValueAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ValueAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.ValueAttribute#getValue()
	 * @see #getValueAttribute()
	 * @generated
	 */
	EAttribute getValueAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.BooleanAttribute <em>Boolean Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Attribute</em>'.
	 * @see org.emona.model.base.BooleanAttribute
	 * @generated
	 */
	EClass getBooleanAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.BooleanAttribute#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.emona.model.base.BooleanAttribute#isEnabled()
	 * @see #getBooleanAttribute()
	 * @generated
	 */
	EAttribute getBooleanAttribute_Enabled();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.ReferenceAttribute <em>Reference Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Attribute</em>'.
	 * @see org.emona.model.base.ReferenceAttribute
	 * @generated
	 */
	EClass getReferenceAttribute();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.IntegerValueAttribute <em>Integer Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Attribute</em>'.
	 * @see org.emona.model.base.IntegerValueAttribute
	 * @generated
	 */
	EClass getIntegerValueAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.IntegerValueAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.IntegerValueAttribute#getValue()
	 * @see #getIntegerValueAttribute()
	 * @generated
	 */
	EAttribute getIntegerValueAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.ServiceFailureCriteria <em>Service Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Failure Criteria</em>'.
	 * @see org.emona.model.base.ServiceFailureCriteria
	 * @generated
	 */
	EClass getServiceFailureCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceFailureCriteria#isPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pending</em>'.
	 * @see org.emona.model.base.ServiceFailureCriteria#isPending()
	 * @see #getServiceFailureCriteria()
	 * @generated
	 */
	EAttribute getServiceFailureCriteria_Pending();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceFailureCriteria#isNone <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>None</em>'.
	 * @see org.emona.model.base.ServiceFailureCriteria#isNone()
	 * @see #getServiceFailureCriteria()
	 * @generated
	 */
	EAttribute getServiceFailureCriteria_None();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.ServiceState <em>Service State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service State</em>'.
	 * @see org.emona.model.base.ServiceState
	 * @generated
	 */
	EClass getServiceState();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceState#isOk <em>Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ok</em>'.
	 * @see org.emona.model.base.ServiceState#isOk()
	 * @see #getServiceState()
	 * @generated
	 */
	EAttribute getServiceState_Ok();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceState#isWarning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning</em>'.
	 * @see org.emona.model.base.ServiceState#isWarning()
	 * @see #getServiceState()
	 * @generated
	 */
	EAttribute getServiceState_Warning();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceState#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see org.emona.model.base.ServiceState#isCritical()
	 * @see #getServiceState()
	 * @generated
	 */
	EAttribute getServiceState_Critical();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceState#isUnknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown</em>'.
	 * @see org.emona.model.base.ServiceState#isUnknown()
	 * @see #getServiceState()
	 * @generated
	 */
	EAttribute getServiceState_Unknown();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.ServiceNotificationOption <em>Service Notification Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Notification Option</em>'.
	 * @see org.emona.model.base.ServiceNotificationOption
	 * @generated
	 */
	EClass getServiceNotificationOption();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceNotificationOption#isFlapping <em>Flapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flapping</em>'.
	 * @see org.emona.model.base.ServiceNotificationOption#isFlapping()
	 * @see #getServiceNotificationOption()
	 * @generated
	 */
	EAttribute getServiceNotificationOption_Flapping();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.ServiceNotificationOption#isNone <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>None</em>'.
	 * @see org.emona.model.base.ServiceNotificationOption#isNone()
	 * @see #getServiceNotificationOption()
	 * @generated
	 */
	EAttribute getServiceNotificationOption_None();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.HostState <em>Host State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host State</em>'.
	 * @see org.emona.model.base.HostState
	 * @generated
	 */
	EClass getHostState();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.HostState#isUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Up</em>'.
	 * @see org.emona.model.base.HostState#isUp()
	 * @see #getHostState()
	 * @generated
	 */
	EAttribute getHostState_Up();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.HostState#isDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Down</em>'.
	 * @see org.emona.model.base.HostState#isDown()
	 * @see #getHostState()
	 * @generated
	 */
	EAttribute getHostState_Down();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.HostState#isUnreachable <em>Unreachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unreachable</em>'.
	 * @see org.emona.model.base.HostState#isUnreachable()
	 * @see #getHostState()
	 * @generated
	 */
	EAttribute getHostState_Unreachable();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.HostFailureCriteria <em>Host Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Failure Criteria</em>'.
	 * @see org.emona.model.base.HostFailureCriteria
	 * @generated
	 */
	EClass getHostFailureCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.HostFailureCriteria#isPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pending</em>'.
	 * @see org.emona.model.base.HostFailureCriteria#isPending()
	 * @see #getHostFailureCriteria()
	 * @generated
	 */
	EAttribute getHostFailureCriteria_Pending();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.HostFailureCriteria#isNone <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>None</em>'.
	 * @see org.emona.model.base.HostFailureCriteria#isNone()
	 * @see #getHostFailureCriteria()
	 * @generated
	 */
	EAttribute getHostFailureCriteria_None();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.ConfigObject <em>Config Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Object</em>'.
	 * @see org.emona.model.base.ConfigObject
	 * @generated
	 */
	EClass getConfigObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emona.model.base.ConfigObject#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attr</em>'.
	 * @see org.emona.model.base.ConfigObject#getAttr()
	 * @see #getConfigObject()
	 * @generated
	 */
	EReference getConfigObject_Attr();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.InfoObject <em>Info Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Object</em>'.
	 * @see org.emona.model.base.InfoObject
	 * @generated
	 */
	EClass getInfoObject();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.CommentLine <em>Comment Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Line</em>'.
	 * @see org.emona.model.base.CommentLine
	 * @generated
	 */
	EClass getCommentLine();

	/**
	 * Returns the meta object for the attribute '{@link org.emona.model.base.CommentLine#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emona.model.base.CommentLine#getValue()
	 * @see #getCommentLine()
	 * @generated
	 */
	EAttribute getCommentLine_Value();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see org.emona.model.base.Host
	 * @generated
	 */
	EClass getHost();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Hostgroup <em>Hostgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostgroup</em>'.
	 * @see org.emona.model.base.Hostgroup
	 * @generated
	 */
	EClass getHostgroup();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.emona.model.base.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Servicegroup <em>Servicegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicegroup</em>'.
	 * @see org.emona.model.base.Servicegroup
	 * @generated
	 */
	EClass getServicegroup();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Servicedependency <em>Servicedependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicedependency</em>'.
	 * @see org.emona.model.base.Servicedependency
	 * @generated
	 */
	EClass getServicedependency();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Hostdependency <em>Hostdependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostdependency</em>'.
	 * @see org.emona.model.base.Hostdependency
	 * @generated
	 */
	EClass getHostdependency();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Serviceescalation <em>Serviceescalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serviceescalation</em>'.
	 * @see org.emona.model.base.Serviceescalation
	 * @generated
	 */
	EClass getServiceescalation();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Hostescalation <em>Hostescalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostescalation</em>'.
	 * @see org.emona.model.base.Hostescalation
	 * @generated
	 */
	EClass getHostescalation();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Serviceextinfo <em>Serviceextinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serviceextinfo</em>'.
	 * @see org.emona.model.base.Serviceextinfo
	 * @generated
	 */
	EClass getServiceextinfo();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Hostextinfo <em>Hostextinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostextinfo</em>'.
	 * @see org.emona.model.base.Hostextinfo
	 * @generated
	 */
	EClass getHostextinfo();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.emona.model.base.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Timeperiod <em>Timeperiod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeperiod</em>'.
	 * @see org.emona.model.base.Timeperiod
	 * @generated
	 */
	EClass getTimeperiod();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.emona.model.base.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for class '{@link org.emona.model.base.Contactgroup <em>Contactgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contactgroup</em>'.
	 * @see org.emona.model.base.Contactgroup
	 * @generated
	 */
	EClass getContactgroup();

	/**
	 * Returns the meta object for enum '{@link org.emona.model.base.Weekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weekday</em>'.
	 * @see org.emona.model.base.Weekday
	 * @generated
	 */
	EEnum getWeekday();

	/**
	 * Returns the meta object for enum '{@link org.emona.model.base.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month</em>'.
	 * @see org.emona.model.base.Month
	 * @generated
	 */
	EEnum getMonth();

	/**
	 * Returns the meta object for enum '{@link org.emona.model.base.HostStateValue <em>Host State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host State Value</em>'.
	 * @see org.emona.model.base.HostStateValue
	 * @generated
	 */
	EEnum getHostStateValue();

	/**
	 * Returns the meta object for enum '{@link org.emona.model.base.ServiceStateValue <em>Service State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service State Value</em>'.
	 * @see org.emona.model.base.ServiceStateValue
	 * @generated
	 */
	EEnum getServiceStateValue();

	/**
	 * Returns the meta object for data type '{@link java.net.InetAddress <em>Inet Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inet Address</em>'.
	 * @see java.net.InetAddress
	 * @model instanceClass="java.net.InetAddress"
	 * @generated
	 */
	EDataType getInetAddress();

	/**
	 * Returns the meta object for data type '{@link org.emona.model.types.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Range</em>'.
	 * @see org.emona.model.types.TimeRange
	 * @model instanceClass="org.emona.model.types.TimeRange"
	 * @generated
	 */
	EDataType getTimeRange();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link javax.mail.internet.InternetAddress <em>Mail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mail Address</em>'.
	 * @see javax.mail.internet.InternetAddress
	 * @model instanceClass="javax.mail.internet.InternetAddress"
	 * @generated
	 */
	EDataType getMailAddress();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link org.emona.model.base.impl.MonObjectImpl <em>Mon Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.MonObjectImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getMonObject()
		 * @generated
		 */
		EClass MON_OBJECT = eINSTANCE.getMonObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MON_OBJECT__NAME = eINSTANCE.getMonObject_Name();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MON_OBJECT__USE = eINSTANCE.getMonObject_Use();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MON_OBJECT__REGISTER = eINSTANCE.getMonObject_Register();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.Attribute <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.Attribute
		 * @see org.emona.model.base.impl.BasePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__COMMENT = eINSTANCE.getAttribute_Comment();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.NameAttributeImpl <em>Name Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.NameAttributeImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getNameAttribute()
		 * @generated
		 */
		EClass NAME_ATTRIBUTE = eINSTANCE.getNameAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ATTRIBUTE__NAME = eINSTANCE.getNameAttribute_Name();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ValueAttributeImpl <em>Value Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ValueAttributeImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getValueAttribute()
		 * @generated
		 */
		EClass VALUE_ATTRIBUTE = eINSTANCE.getValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ATTRIBUTE__VALUE = eINSTANCE.getValueAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.BooleanAttributeImpl <em>Boolean Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.BooleanAttributeImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getBooleanAttribute()
		 * @generated
		 */
		EClass BOOLEAN_ATTRIBUTE = eINSTANCE.getBooleanAttribute();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ATTRIBUTE__ENABLED = eINSTANCE
				.getBooleanAttribute_Enabled();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ReferenceAttributeImpl <em>Reference Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ReferenceAttributeImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getReferenceAttribute()
		 * @generated
		 */
		EClass REFERENCE_ATTRIBUTE = eINSTANCE.getReferenceAttribute();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.IntegerValueAttributeImpl <em>Integer Value Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.IntegerValueAttributeImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getIntegerValueAttribute()
		 * @generated
		 */
		EClass INTEGER_VALUE_ATTRIBUTE = eINSTANCE.getIntegerValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_ATTRIBUTE__VALUE = eINSTANCE
				.getIntegerValueAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServiceFailureCriteriaImpl <em>Service Failure Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServiceFailureCriteriaImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getServiceFailureCriteria()
		 * @generated
		 */
		EClass SERVICE_FAILURE_CRITERIA = eINSTANCE.getServiceFailureCriteria();

		/**
		 * The meta object literal for the '<em><b>Pending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FAILURE_CRITERIA__PENDING = eINSTANCE
				.getServiceFailureCriteria_Pending();

		/**
		 * The meta object literal for the '<em><b>None</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FAILURE_CRITERIA__NONE = eINSTANCE
				.getServiceFailureCriteria_None();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServiceStateImpl <em>Service State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServiceStateImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getServiceState()
		 * @generated
		 */
		EClass SERVICE_STATE = eINSTANCE.getServiceState();

		/**
		 * The meta object literal for the '<em><b>Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_STATE__OK = eINSTANCE.getServiceState_Ok();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_STATE__WARNING = eINSTANCE.getServiceState_Warning();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_STATE__CRITICAL = eINSTANCE
				.getServiceState_Critical();

		/**
		 * The meta object literal for the '<em><b>Unknown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_STATE__UNKNOWN = eINSTANCE.getServiceState_Unknown();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServiceNotificationOptionImpl <em>Service Notification Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServiceNotificationOptionImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getServiceNotificationOption()
		 * @generated
		 */
		EClass SERVICE_NOTIFICATION_OPTION = eINSTANCE
				.getServiceNotificationOption();

		/**
		 * The meta object literal for the '<em><b>Flapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NOTIFICATION_OPTION__FLAPPING = eINSTANCE
				.getServiceNotificationOption_Flapping();

		/**
		 * The meta object literal for the '<em><b>None</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NOTIFICATION_OPTION__NONE = eINSTANCE
				.getServiceNotificationOption_None();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.HostStateImpl <em>Host State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.HostStateImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getHostState()
		 * @generated
		 */
		EClass HOST_STATE = eINSTANCE.getHostState();

		/**
		 * The meta object literal for the '<em><b>Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_STATE__UP = eINSTANCE.getHostState_Up();

		/**
		 * The meta object literal for the '<em><b>Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_STATE__DOWN = eINSTANCE.getHostState_Down();

		/**
		 * The meta object literal for the '<em><b>Unreachable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_STATE__UNREACHABLE = eINSTANCE
				.getHostState_Unreachable();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.HostFailureCriteriaImpl <em>Host Failure Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.HostFailureCriteriaImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getHostFailureCriteria()
		 * @generated
		 */
		EClass HOST_FAILURE_CRITERIA = eINSTANCE.getHostFailureCriteria();

		/**
		 * The meta object literal for the '<em><b>Pending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_FAILURE_CRITERIA__PENDING = eINSTANCE
				.getHostFailureCriteria_Pending();

		/**
		 * The meta object literal for the '<em><b>None</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_FAILURE_CRITERIA__NONE = eINSTANCE
				.getHostFailureCriteria_None();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ConfigObjectImpl <em>Config Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ConfigObjectImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getConfigObject()
		 * @generated
		 */
		EClass CONFIG_OBJECT = eINSTANCE.getConfigObject();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_OBJECT__ATTR = eINSTANCE.getConfigObject_Attr();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.InfoObjectImpl <em>Info Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.InfoObjectImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getInfoObject()
		 * @generated
		 */
		EClass INFO_OBJECT = eINSTANCE.getInfoObject();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.CommentLineImpl <em>Comment Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.CommentLineImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getCommentLine()
		 * @generated
		 */
		EClass COMMENT_LINE = eINSTANCE.getCommentLine();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_LINE__VALUE = eINSTANCE.getCommentLine_Value();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.HostImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getHost()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.HostgroupImpl <em>Hostgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.HostgroupImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getHostgroup()
		 * @generated
		 */
		EClass HOSTGROUP = eINSTANCE.getHostgroup();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServiceImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServicegroupImpl <em>Servicegroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServicegroupImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getServicegroup()
		 * @generated
		 */
		EClass SERVICEGROUP = eINSTANCE.getServicegroup();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServicedependencyImpl <em>Servicedependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServicedependencyImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getServicedependency()
		 * @generated
		 */
		EClass SERVICEDEPENDENCY = eINSTANCE.getServicedependency();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.HostdependencyImpl <em>Hostdependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.HostdependencyImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getHostdependency()
		 * @generated
		 */
		EClass HOSTDEPENDENCY = eINSTANCE.getHostdependency();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServiceescalationImpl <em>Serviceescalation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServiceescalationImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getServiceescalation()
		 * @generated
		 */
		EClass SERVICEESCALATION = eINSTANCE.getServiceescalation();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.HostescalationImpl <em>Hostescalation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.HostescalationImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getHostescalation()
		 * @generated
		 */
		EClass HOSTESCALATION = eINSTANCE.getHostescalation();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ServiceextinfoImpl <em>Serviceextinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ServiceextinfoImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getServiceextinfo()
		 * @generated
		 */
		EClass SERVICEEXTINFO = eINSTANCE.getServiceextinfo();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.HostextinfoImpl <em>Hostextinfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.HostextinfoImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getHostextinfo()
		 * @generated
		 */
		EClass HOSTEXTINFO = eINSTANCE.getHostextinfo();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.CommandImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.TimeperiodImpl <em>Timeperiod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.TimeperiodImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getTimeperiod()
		 * @generated
		 */
		EClass TIMEPERIOD = eINSTANCE.getTimeperiod();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ContactImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.impl.ContactgroupImpl <em>Contactgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.impl.ContactgroupImpl
		 * @see org.emona.model.base.impl.BasePackageImpl#getContactgroup()
		 * @generated
		 */
		EClass CONTACTGROUP = eINSTANCE.getContactgroup();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.Weekday <em>Weekday</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.Weekday
		 * @see org.emona.model.base.impl.BasePackageImpl#getWeekday()
		 * @generated
		 */
		EEnum WEEKDAY = eINSTANCE.getWeekday();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.Month <em>Month</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.Month
		 * @see org.emona.model.base.impl.BasePackageImpl#getMonth()
		 * @generated
		 */
		EEnum MONTH = eINSTANCE.getMonth();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.HostStateValue <em>Host State Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.HostStateValue
		 * @see org.emona.model.base.impl.BasePackageImpl#getHostStateValue()
		 * @generated
		 */
		EEnum HOST_STATE_VALUE = eINSTANCE.getHostStateValue();

		/**
		 * The meta object literal for the '{@link org.emona.model.base.ServiceStateValue <em>Service State Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.base.ServiceStateValue
		 * @see org.emona.model.base.impl.BasePackageImpl#getServiceStateValue()
		 * @generated
		 */
		EEnum SERVICE_STATE_VALUE = eINSTANCE.getServiceStateValue();

		/**
		 * The meta object literal for the '<em>Inet Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.InetAddress
		 * @see org.emona.model.base.impl.BasePackageImpl#getInetAddress()
		 * @generated
		 */
		EDataType INET_ADDRESS = eINSTANCE.getInetAddress();

		/**
		 * The meta object literal for the '<em>Time Range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emona.model.types.TimeRange
		 * @see org.emona.model.base.impl.BasePackageImpl#getTimeRange()
		 * @generated
		 */
		EDataType TIME_RANGE = eINSTANCE.getTimeRange();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.emona.model.base.impl.BasePackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Mail Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.mail.internet.InternetAddress
		 * @see org.emona.model.base.impl.BasePackageImpl#getMailAddress()
		 * @generated
		 */
		EDataType MAIL_ADDRESS = eINSTANCE.getMailAddress();

	}

} //BasePackage
