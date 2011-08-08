/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.impl;

import java.net.InetAddress;

import java.util.Date;

import javax.mail.internet.InternetAddress;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emona.model.base.*;

import org.emona.model.types.TimeRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseFactory init() {
		try {
			BaseFactory theBaseFactory = (BaseFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.emona.org/model/base");
			if (theBaseFactory != null) {
				return theBaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BasePackage.MON_OBJECT:
			return createMonObject();
		case BasePackage.BOOLEAN_ATTRIBUTE:
			return createBooleanAttribute();
		case BasePackage.REFERENCE_ATTRIBUTE:
			return createReferenceAttribute();
		case BasePackage.INTEGER_VALUE_ATTRIBUTE:
			return createIntegerValueAttribute();
		case BasePackage.SERVICE_STATE:
			return createServiceState();
		case BasePackage.HOST_STATE:
			return createHostState();
		case BasePackage.SERVICE_FAILURE_CRITERIA:
			return createServiceFailureCriteria();
		case BasePackage.HOST_FAILURE_CRITERIA:
			return createHostFailureCriteria();
		case BasePackage.SERVICE_NOTIFICATION_OPTION:
			return createServiceNotificationOption();
		case BasePackage.CONFIG_OBJECT:
			return createConfigObject();
		case BasePackage.INFO_OBJECT:
			return createInfoObject();
		case BasePackage.COMMENT_LINE:
			return createCommentLine();
		case BasePackage.HOST:
			return createHost();
		case BasePackage.HOSTGROUP:
			return createHostgroup();
		case BasePackage.SERVICE:
			return createService();
		case BasePackage.SERVICEGROUP:
			return createServicegroup();
		case BasePackage.SERVICEDEPENDENCY:
			return createServicedependency();
		case BasePackage.HOSTDEPENDENCY:
			return createHostdependency();
		case BasePackage.SERVICEESCALATION:
			return createServiceescalation();
		case BasePackage.HOSTESCALATION:
			return createHostescalation();
		case BasePackage.SERVICEEXTINFO:
			return createServiceextinfo();
		case BasePackage.HOSTEXTINFO:
			return createHostextinfo();
		case BasePackage.COMMAND:
			return createCommand();
		case BasePackage.TIMEPERIOD:
			return createTimeperiod();
		case BasePackage.CONTACT:
			return createContact();
		case BasePackage.CONTACTGROUP:
			return createContactgroup();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BasePackage.WEEKDAY:
			return createWeekdayFromString(eDataType, initialValue);
		case BasePackage.MONTH:
			return createMonthFromString(eDataType, initialValue);
		case BasePackage.HOST_STATE_VALUE:
			return createHostStateValueFromString(eDataType, initialValue);
		case BasePackage.SERVICE_STATE_VALUE:
			return createServiceStateValueFromString(eDataType, initialValue);
		case BasePackage.INET_ADDRESS:
			return createInetAddressFromString(eDataType, initialValue);
		case BasePackage.TIME_RANGE:
			return createTimeRangeFromString(eDataType, initialValue);
		case BasePackage.DATE:
			return createDateFromString(eDataType, initialValue);
		case BasePackage.MAIL_ADDRESS:
			return createMailAddressFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BasePackage.WEEKDAY:
			return convertWeekdayToString(eDataType, instanceValue);
		case BasePackage.MONTH:
			return convertMonthToString(eDataType, instanceValue);
		case BasePackage.HOST_STATE_VALUE:
			return convertHostStateValueToString(eDataType, instanceValue);
		case BasePackage.SERVICE_STATE_VALUE:
			return convertServiceStateValueToString(eDataType, instanceValue);
		case BasePackage.INET_ADDRESS:
			return convertInetAddressToString(eDataType, instanceValue);
		case BasePackage.TIME_RANGE:
			return convertTimeRangeToString(eDataType, instanceValue);
		case BasePackage.DATE:
			return convertDateToString(eDataType, instanceValue);
		case BasePackage.MAIL_ADDRESS:
			return convertMailAddressToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonObject createMonObject() {
		MonObjectImpl monObject = new MonObjectImpl();
		return monObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAttribute createBooleanAttribute() {
		BooleanAttributeImpl booleanAttribute = new BooleanAttributeImpl();
		return booleanAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceAttribute createReferenceAttribute() {
		ReferenceAttributeImpl referenceAttribute = new ReferenceAttributeImpl();
		return referenceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueAttribute createIntegerValueAttribute() {
		IntegerValueAttributeImpl integerValueAttribute = new IntegerValueAttributeImpl();
		return integerValueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFailureCriteria createServiceFailureCriteria() {
		ServiceFailureCriteriaImpl serviceFailureCriteria = new ServiceFailureCriteriaImpl();
		return serviceFailureCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceState createServiceState() {
		ServiceStateImpl serviceState = new ServiceStateImpl();
		return serviceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNotificationOption createServiceNotificationOption() {
		ServiceNotificationOptionImpl serviceNotificationOption = new ServiceNotificationOptionImpl();
		return serviceNotificationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostState createHostState() {
		HostStateImpl hostState = new HostStateImpl();
		return hostState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostFailureCriteria createHostFailureCriteria() {
		HostFailureCriteriaImpl hostFailureCriteria = new HostFailureCriteriaImpl();
		return hostFailureCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigObject createConfigObject() {
		ConfigObjectImpl configObject = new ConfigObjectImpl();
		return configObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoObject createInfoObject() {
		InfoObjectImpl infoObject = new InfoObjectImpl();
		return infoObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentLine createCommentLine() {
		CommentLineImpl commentLine = new CommentLineImpl();
		return commentLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host createHost() {
		HostImpl host = new HostImpl();
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostgroup createHostgroup() {
		HostgroupImpl hostgroup = new HostgroupImpl();
		return hostgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicegroup createServicegroup() {
		ServicegroupImpl servicegroup = new ServicegroupImpl();
		return servicegroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicedependency createServicedependency() {
		ServicedependencyImpl servicedependency = new ServicedependencyImpl();
		return servicedependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostdependency createHostdependency() {
		HostdependencyImpl hostdependency = new HostdependencyImpl();
		return hostdependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serviceescalation createServiceescalation() {
		ServiceescalationImpl serviceescalation = new ServiceescalationImpl();
		return serviceescalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostescalation createHostescalation() {
		HostescalationImpl hostescalation = new HostescalationImpl();
		return hostescalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serviceextinfo createServiceextinfo() {
		ServiceextinfoImpl serviceextinfo = new ServiceextinfoImpl();
		return serviceextinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostextinfo createHostextinfo() {
		HostextinfoImpl hostextinfo = new HostextinfoImpl();
		return hostextinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeperiod createTimeperiod() {
		TimeperiodImpl timeperiod = new TimeperiodImpl();
		return timeperiod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contactgroup createContactgroup() {
		ContactgroupImpl contactgroup = new ContactgroupImpl();
		return contactgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weekday createWeekdayFromString(EDataType eDataType,
			String initialValue) {
		Weekday result = Weekday.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekdayToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Month createMonthFromString(EDataType eDataType, String initialValue) {
		Month result = Month.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostStateValue createHostStateValueFromString(EDataType eDataType,
			String initialValue) {
		HostStateValue result = HostStateValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostStateValueToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStateValue createServiceStateValueFromString(
			EDataType eDataType, String initialValue) {
		ServiceStateValue result = ServiceStateValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceStateValueToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InetAddress createInetAddressFromString(EDataType eDataType,
			String initialValue) {
		return (InetAddress) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInetAddressToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRange createTimeRangeFromString(EDataType eDataType,
			String initialValue) {
		return (TimeRange) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeRangeToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternetAddress createMailAddressFromString(EDataType eDataType,
			String initialValue) {
		return (InternetAddress) super
				.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMailAddressToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePackage getBasePackage() {
		return (BasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasePackage getPackage() {
		return BasePackage.eINSTANCE;
	}

} //BaseFactoryImpl
