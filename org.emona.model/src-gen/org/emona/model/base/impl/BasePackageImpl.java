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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emona.model.base.Attribute;
import org.emona.model.base.BaseFactory;
import org.emona.model.base.BasePackage;
import org.emona.model.base.BooleanAttribute;
import org.emona.model.base.Command;
import org.emona.model.base.CommentLine;
import org.emona.model.base.ConfigObject;
import org.emona.model.base.Contact;
import org.emona.model.base.Contactgroup;
import org.emona.model.base.Host;
import org.emona.model.base.HostFailureCriteria;
import org.emona.model.base.HostState;
import org.emona.model.base.HostStateValue;
import org.emona.model.base.Hostdependency;
import org.emona.model.base.Hostescalation;
import org.emona.model.base.Hostextinfo;
import org.emona.model.base.Hostgroup;
import org.emona.model.base.InfoObject;
import org.emona.model.base.IntegerValueAttribute;
import org.emona.model.base.MonObject;
import org.emona.model.base.Month;
import org.emona.model.base.NameAttribute;
import org.emona.model.base.ReferenceAttribute;
import org.emona.model.base.Service;
import org.emona.model.base.ServiceFailureCriteria;
import org.emona.model.base.ServiceNotificationOption;
import org.emona.model.base.ServiceState;
import org.emona.model.base.ServiceStateValue;
import org.emona.model.base.Servicedependency;
import org.emona.model.base.Serviceescalation;
import org.emona.model.base.Serviceextinfo;
import org.emona.model.base.Servicegroup;
import org.emona.model.base.Timeperiod;
import org.emona.model.base.ValueAttribute;
import org.emona.model.base.Weekday;

import org.emona.model.base.attributes.AttributesPackage;

import org.emona.model.base.attributes.impl.AttributesPackageImpl;

import org.emona.model.base.attributes.time.TimePackage;
import org.emona.model.base.attributes.time.impl.TimePackageImpl;
import org.emona.model.types.TimeRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFailureCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNotificationOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostFailureCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicegroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicedependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostdependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceescalationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostescalationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceextinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostextinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeperiodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekdayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostStateValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStateValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inetAddressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeRangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mailAddressEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emona.model.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited)
			return (BasePackage) EPackage.Registry.INSTANCE
					.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		BasePackageImpl theBasePackage = (BasePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new BasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AttributesPackageImpl theAttributesPackage = (AttributesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AttributesPackage.eNS_URI) instanceof AttributesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(AttributesPackage.eNS_URI)
				: AttributesPackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theAttributesPackage.createPackageContents();
		theTimePackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theAttributesPackage.initializePackageContents();
		theTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonObject() {
		return monObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonObject_Name() {
		return (EAttribute) monObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonObject_Use() {
		return (EReference) monObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonObject_Register() {
		return (EAttribute) monObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Comment() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Multiline() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameAttribute() {
		return nameAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameAttribute_Name() {
		return (EAttribute) nameAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueAttribute() {
		return valueAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueAttribute_Value() {
		return (EAttribute) valueAttributeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAttribute() {
		return booleanAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanAttribute_Enabled() {
		return (EAttribute) booleanAttributeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceAttribute() {
		return referenceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueAttribute() {
		return integerValueAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueAttribute_Value() {
		return (EAttribute) integerValueAttributeEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFailureCriteria() {
		return serviceFailureCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFailureCriteria_Pending() {
		return (EAttribute) serviceFailureCriteriaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFailureCriteria_None() {
		return (EAttribute) serviceFailureCriteriaEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceState() {
		return serviceStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceState_Ok() {
		return (EAttribute) serviceStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceState_Warning() {
		return (EAttribute) serviceStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceState_Critical() {
		return (EAttribute) serviceStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceState_Unknown() {
		return (EAttribute) serviceStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNotificationOption() {
		return serviceNotificationOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNotificationOption_Flapping() {
		return (EAttribute) serviceNotificationOptionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNotificationOption_None() {
		return (EAttribute) serviceNotificationOptionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostState() {
		return hostStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostState_Up() {
		return (EAttribute) hostStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostState_Down() {
		return (EAttribute) hostStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostState_Unreachable() {
		return (EAttribute) hostStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostFailureCriteria() {
		return hostFailureCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostFailureCriteria_Pending() {
		return (EAttribute) hostFailureCriteriaEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostFailureCriteria_None() {
		return (EAttribute) hostFailureCriteriaEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigObject() {
		return configObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigObject_Attr() {
		return (EReference) configObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoObject() {
		return infoObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentLine() {
		return commentLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentLine_Value() {
		return (EAttribute) commentLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHost() {
		return hostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostgroup() {
		return hostgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicegroup() {
		return servicegroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicedependency() {
		return servicedependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostdependency() {
		return hostdependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceescalation() {
		return serviceescalationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostescalation() {
		return hostescalationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceextinfo() {
		return serviceextinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostextinfo() {
		return hostextinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeperiod() {
		return timeperiodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactgroup() {
		return contactgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeekday() {
		return weekdayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonth() {
		return monthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHostStateValue() {
		return hostStateValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceStateValue() {
		return serviceStateValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInetAddress() {
		return inetAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeRange() {
		return timeRangeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMailAddress() {
		return mailAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		monObjectEClass = createEClass(MON_OBJECT);
		createEAttribute(monObjectEClass, MON_OBJECT__NAME);
		createEReference(monObjectEClass, MON_OBJECT__USE);
		createEAttribute(monObjectEClass, MON_OBJECT__REGISTER);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__COMMENT);
		createEAttribute(attributeEClass, ATTRIBUTE__MULTILINE);

		nameAttributeEClass = createEClass(NAME_ATTRIBUTE);
		createEAttribute(nameAttributeEClass, NAME_ATTRIBUTE__NAME);

		valueAttributeEClass = createEClass(VALUE_ATTRIBUTE);
		createEAttribute(valueAttributeEClass, VALUE_ATTRIBUTE__VALUE);

		booleanAttributeEClass = createEClass(BOOLEAN_ATTRIBUTE);
		createEAttribute(booleanAttributeEClass, BOOLEAN_ATTRIBUTE__ENABLED);

		referenceAttributeEClass = createEClass(REFERENCE_ATTRIBUTE);

		integerValueAttributeEClass = createEClass(INTEGER_VALUE_ATTRIBUTE);
		createEAttribute(integerValueAttributeEClass,
				INTEGER_VALUE_ATTRIBUTE__VALUE);

		serviceFailureCriteriaEClass = createEClass(SERVICE_FAILURE_CRITERIA);
		createEAttribute(serviceFailureCriteriaEClass,
				SERVICE_FAILURE_CRITERIA__PENDING);
		createEAttribute(serviceFailureCriteriaEClass,
				SERVICE_FAILURE_CRITERIA__NONE);

		serviceStateEClass = createEClass(SERVICE_STATE);
		createEAttribute(serviceStateEClass, SERVICE_STATE__OK);
		createEAttribute(serviceStateEClass, SERVICE_STATE__WARNING);
		createEAttribute(serviceStateEClass, SERVICE_STATE__CRITICAL);
		createEAttribute(serviceStateEClass, SERVICE_STATE__UNKNOWN);

		serviceNotificationOptionEClass = createEClass(SERVICE_NOTIFICATION_OPTION);
		createEAttribute(serviceNotificationOptionEClass,
				SERVICE_NOTIFICATION_OPTION__FLAPPING);
		createEAttribute(serviceNotificationOptionEClass,
				SERVICE_NOTIFICATION_OPTION__NONE);

		hostStateEClass = createEClass(HOST_STATE);
		createEAttribute(hostStateEClass, HOST_STATE__UP);
		createEAttribute(hostStateEClass, HOST_STATE__DOWN);
		createEAttribute(hostStateEClass, HOST_STATE__UNREACHABLE);

		hostFailureCriteriaEClass = createEClass(HOST_FAILURE_CRITERIA);
		createEAttribute(hostFailureCriteriaEClass,
				HOST_FAILURE_CRITERIA__PENDING);
		createEAttribute(hostFailureCriteriaEClass, HOST_FAILURE_CRITERIA__NONE);

		configObjectEClass = createEClass(CONFIG_OBJECT);
		createEReference(configObjectEClass, CONFIG_OBJECT__ATTR);

		infoObjectEClass = createEClass(INFO_OBJECT);

		commentLineEClass = createEClass(COMMENT_LINE);
		createEAttribute(commentLineEClass, COMMENT_LINE__VALUE);

		hostEClass = createEClass(HOST);

		hostgroupEClass = createEClass(HOSTGROUP);

		serviceEClass = createEClass(SERVICE);

		servicegroupEClass = createEClass(SERVICEGROUP);

		servicedependencyEClass = createEClass(SERVICEDEPENDENCY);

		hostdependencyEClass = createEClass(HOSTDEPENDENCY);

		serviceescalationEClass = createEClass(SERVICEESCALATION);

		hostescalationEClass = createEClass(HOSTESCALATION);

		serviceextinfoEClass = createEClass(SERVICEEXTINFO);

		hostextinfoEClass = createEClass(HOSTEXTINFO);

		commandEClass = createEClass(COMMAND);

		timeperiodEClass = createEClass(TIMEPERIOD);

		contactEClass = createEClass(CONTACT);

		contactgroupEClass = createEClass(CONTACTGROUP);

		// Create enums
		weekdayEEnum = createEEnum(WEEKDAY);
		monthEEnum = createEEnum(MONTH);
		hostStateValueEEnum = createEEnum(HOST_STATE_VALUE);
		serviceStateValueEEnum = createEEnum(SERVICE_STATE_VALUE);

		// Create data types
		inetAddressEDataType = createEDataType(INET_ADDRESS);
		timeRangeEDataType = createEDataType(TIME_RANGE);
		dateEDataType = createEDataType(DATE);
		mailAddressEDataType = createEDataType(MAIL_ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AttributesPackage theAttributesPackage = (AttributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(AttributesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAttributesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nameAttributeEClass.getESuperTypes().add(this.getAttribute());
		valueAttributeEClass.getESuperTypes().add(this.getAttribute());
		booleanAttributeEClass.getESuperTypes().add(this.getAttribute());
		referenceAttributeEClass.getESuperTypes().add(this.getAttribute());
		integerValueAttributeEClass.getESuperTypes().add(this.getAttribute());
		serviceFailureCriteriaEClass.getESuperTypes().add(
				this.getServiceState());
		serviceNotificationOptionEClass.getESuperTypes().add(
				this.getServiceState());
		hostFailureCriteriaEClass.getESuperTypes().add(this.getHostState());
		configObjectEClass.getESuperTypes().add(this.getInfoObject());
		commentLineEClass.getESuperTypes().add(this.getInfoObject());
		hostEClass.getESuperTypes().add(this.getConfigObject());
		hostgroupEClass.getESuperTypes().add(this.getConfigObject());
		serviceEClass.getESuperTypes().add(this.getConfigObject());
		servicegroupEClass.getESuperTypes().add(this.getConfigObject());
		servicedependencyEClass.getESuperTypes().add(this.getConfigObject());
		hostdependencyEClass.getESuperTypes().add(this.getConfigObject());
		serviceescalationEClass.getESuperTypes().add(this.getConfigObject());
		hostescalationEClass.getESuperTypes().add(this.getConfigObject());
		serviceextinfoEClass.getESuperTypes().add(this.getConfigObject());
		hostextinfoEClass.getESuperTypes().add(this.getConfigObject());
		commandEClass.getESuperTypes().add(this.getConfigObject());
		timeperiodEClass.getESuperTypes().add(this.getConfigObject());
		contactEClass.getESuperTypes().add(this.getConfigObject());
		contactgroupEClass.getESuperTypes().add(this.getConfigObject());

		// Initialize classes and features; add operations and parameters
		initEClass(monObjectEClass, MonObject.class, "MonObject", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonObject_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, MonObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMonObject_Use(), this.getMonObject(), null, "use",
				null, 0, 1, MonObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonObject_Register(), ecorePackage.getEBoolean(),
				"register", null, 0, 1, MonObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Comment(), ecorePackage.getEString(),
				"comment", null, 0, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Multiline(), ecorePackage.getEBoolean(),
				"multiline", "false", 0, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(attributeEClass, ecorePackage.getEString(), "getToken",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nameAttributeEClass, NameAttribute.class, "NameAttribute",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameAttribute_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, NameAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(valueAttributeEClass, ValueAttribute.class,
				"ValueAttribute", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueAttribute_Value(), ecorePackage.getEString(),
				"value", null, 0, 1, ValueAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(booleanAttributeEClass, BooleanAttribute.class,
				"BooleanAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanAttribute_Enabled(),
				ecorePackage.getEBoolean(), "enabled", null, 0, 1,
				BooleanAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(referenceAttributeEClass, ReferenceAttribute.class,
				"ReferenceAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerValueAttributeEClass, IntegerValueAttribute.class,
				"IntegerValueAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValueAttribute_Value(),
				ecorePackage.getEInt(), "value", null, 0, 1,
				IntegerValueAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceFailureCriteriaEClass, ServiceFailureCriteria.class,
				"ServiceFailureCriteria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceFailureCriteria_Pending(),
				ecorePackage.getEBoolean(), "pending", "false", 1, 1,
				ServiceFailureCriteria.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getServiceFailureCriteria_None(),
				ecorePackage.getEBoolean(), "none", "false", 1, 1,
				ServiceFailureCriteria.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceStateEClass, ServiceState.class, "ServiceState",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceState_Ok(), ecorePackage.getEBoolean(), "ok",
				"false", 1, 1, ServiceState.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getServiceState_Warning(), ecorePackage.getEBoolean(),
				"warning", "false", 1, 1, ServiceState.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceState_Critical(), ecorePackage.getEBoolean(),
				"critical", "false", 1, 1, ServiceState.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceState_Unknown(), ecorePackage.getEBoolean(),
				"unknown", "false", 1, 1, ServiceState.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceNotificationOptionEClass,
				ServiceNotificationOption.class, "ServiceNotificationOption",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceNotificationOption_Flapping(),
				ecorePackage.getEBoolean(), "flapping", "false", 1, 1,
				ServiceNotificationOption.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getServiceNotificationOption_None(),
				ecorePackage.getEBoolean(), "none", "false", 1, 1,
				ServiceNotificationOption.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostStateEClass, HostState.class, "HostState", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostState_Up(), ecorePackage.getEBoolean(), "up",
				"false", 1, 1, HostState.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostState_Down(), ecorePackage.getEBoolean(), "down",
				"false", 1, 1, HostState.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostState_Unreachable(), ecorePackage.getEBoolean(),
				"unreachable", "false", 1, 1, HostState.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(hostFailureCriteriaEClass, HostFailureCriteria.class,
				"HostFailureCriteria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostFailureCriteria_Pending(),
				ecorePackage.getEBoolean(), "pending", "false", 1, 1,
				HostFailureCriteria.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostFailureCriteria_None(),
				ecorePackage.getEBoolean(), "none", "false", 1, 1,
				HostFailureCriteria.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(configObjectEClass, ConfigObject.class, "ConfigObject",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigObject_Attr(), this.getAttribute(), null,
				"attr", null, 0, -1, ConfigObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(configObjectEClass,
				ecorePackage.getEBoolean(), "hasAttribute", 1, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "token", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(infoObjectEClass, InfoObject.class, "InfoObject",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentLineEClass, CommentLine.class, "CommentLine",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentLine_Value(), ecorePackage.getEString(),
				"value", null, 0, 1, CommentLine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hostgroupEClass, Hostgroup.class, "Hostgroup", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicegroupEClass, Servicegroup.class, "Servicegroup",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicedependencyEClass, Servicedependency.class,
				"Servicedependency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hostdependencyEClass, Hostdependency.class,
				"Hostdependency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceescalationEClass, Serviceescalation.class,
				"Serviceescalation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hostescalationEClass, Hostescalation.class,
				"Hostescalation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceextinfoEClass, Serviceextinfo.class,
				"Serviceextinfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hostextinfoEClass, Hostextinfo.class, "Hostextinfo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeperiodEClass, Timeperiod.class, "Timeperiod",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactgroupEClass, Contactgroup.class, "Contactgroup",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(weekdayEEnum, Weekday.class, "Weekday");
		addEEnumLiteral(weekdayEEnum, Weekday.SU);
		addEEnumLiteral(weekdayEEnum, Weekday.MO);
		addEEnumLiteral(weekdayEEnum, Weekday.TU);
		addEEnumLiteral(weekdayEEnum, Weekday.WE);
		addEEnumLiteral(weekdayEEnum, Weekday.TH);
		addEEnumLiteral(weekdayEEnum, Weekday.FR);
		addEEnumLiteral(weekdayEEnum, Weekday.SA);

		initEEnum(monthEEnum, Month.class, "Month");
		addEEnumLiteral(monthEEnum, Month.JAN);
		addEEnumLiteral(monthEEnum, Month.FEB);
		addEEnumLiteral(monthEEnum, Month.MAR);
		addEEnumLiteral(monthEEnum, Month.APR);
		addEEnumLiteral(monthEEnum, Month.MAY);
		addEEnumLiteral(monthEEnum, Month.JUN);
		addEEnumLiteral(monthEEnum, Month.JUL);
		addEEnumLiteral(monthEEnum, Month.AUG);
		addEEnumLiteral(monthEEnum, Month.SEP);
		addEEnumLiteral(monthEEnum, Month.OCT);
		addEEnumLiteral(monthEEnum, Month.NOV);
		addEEnumLiteral(monthEEnum, Month.DEC);

		initEEnum(hostStateValueEEnum, HostStateValue.class, "HostStateValue");
		addEEnumLiteral(hostStateValueEEnum, HostStateValue.UP);
		addEEnumLiteral(hostStateValueEEnum, HostStateValue.DOWN);
		addEEnumLiteral(hostStateValueEEnum, HostStateValue.UNREACHABLE);

		initEEnum(serviceStateValueEEnum, ServiceStateValue.class,
				"ServiceStateValue");
		addEEnumLiteral(serviceStateValueEEnum, ServiceStateValue.OK);
		addEEnumLiteral(serviceStateValueEEnum, ServiceStateValue.WARNING);
		addEEnumLiteral(serviceStateValueEEnum, ServiceStateValue.CRITICAL);
		addEEnumLiteral(serviceStateValueEEnum, ServiceStateValue.UNKNOWN);

		// Initialize data types
		initEDataType(inetAddressEDataType, InetAddress.class, "InetAddress",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeRangeEDataType, TimeRange.class, "TimeRange",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mailAddressEDataType, InternetAddress.class,
				"MailAddress", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] { "invocationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"settingDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"validationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL" });
	}

} //BasePackageImpl
