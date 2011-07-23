/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emona.model.base.BasePackage;

import org.emona.model.base.attributes.ActionUrl;
import org.emona.model.base.attributes.ActiveChecksEnabled;
import org.emona.model.base.attributes.Address;
import org.emona.model.base.attributes.Alias;
import org.emona.model.base.attributes.AttributesFactory;
import org.emona.model.base.attributes.AttributesPackage;
import org.emona.model.base.attributes.CanSubmitCommands;
import org.emona.model.base.attributes.CheckCommand;
import org.emona.model.base.attributes.CheckFreshness;
import org.emona.model.base.attributes.CheckInterval;
import org.emona.model.base.attributes.CheckPeriod;
import org.emona.model.base.attributes.CommandLine;
import org.emona.model.base.attributes.CommandName;
import org.emona.model.base.attributes.ContactAddress;
import org.emona.model.base.attributes.ContactGroupName;
import org.emona.model.base.attributes.ContactGroups;
import org.emona.model.base.attributes.ContactMembers;
import org.emona.model.base.attributes.ContactName;
import org.emona.model.base.attributes.Contacts;
import org.emona.model.base.attributes.DependencyPeriod;
import org.emona.model.base.attributes.DependentHostName;
import org.emona.model.base.attributes.DependentHostgroupName;
import org.emona.model.base.attributes.DependentServiceDescription;
import org.emona.model.base.attributes.DisplayName;
import org.emona.model.base.attributes.Email;
import org.emona.model.base.attributes.EscalationPeriod;
import org.emona.model.base.attributes.EventHandler;
import org.emona.model.base.attributes.EventHandlerEnabled;
import org.emona.model.base.attributes.FirstNotification;
import org.emona.model.base.attributes.FirstNotificationDelay;
import org.emona.model.base.attributes.FlapDetectionEnabled;
import org.emona.model.base.attributes.FreshnessThreshold;
import org.emona.model.base.attributes.HighFlapThreshold;
import org.emona.model.base.attributes.HostEscalationOptions;
import org.emona.model.base.attributes.HostExecutionFailureCriteria;
import org.emona.model.base.attributes.HostFlapDetectionOptions;
import org.emona.model.base.attributes.HostInitialState;
import org.emona.model.base.attributes.HostMembers;
import org.emona.model.base.attributes.HostName;
import org.emona.model.base.attributes.HostNameReference;
import org.emona.model.base.attributes.HostNotificationCommands;
import org.emona.model.base.attributes.HostNotificationFailureCriteria;
import org.emona.model.base.attributes.HostNotificationOptions;
import org.emona.model.base.attributes.HostNotificationPeriod;
import org.emona.model.base.attributes.HostNotificationsEnabled;
import org.emona.model.base.attributes.HostStalkingOptions;
import org.emona.model.base.attributes.HostgroupMembers;
import org.emona.model.base.attributes.HostgroupName;
import org.emona.model.base.attributes.HostgroupNameReference;
import org.emona.model.base.attributes.Hostgroups;
import org.emona.model.base.attributes.IconImage;
import org.emona.model.base.attributes.IconImageAlt;
import org.emona.model.base.attributes.InheritsParent;
import org.emona.model.base.attributes.IsVolatileFlag;
import org.emona.model.base.attributes.LastNotification;
import org.emona.model.base.attributes.LowFlapThreshold;
import org.emona.model.base.attributes.MaxCheckAttempts;
import org.emona.model.base.attributes.Notes;
import org.emona.model.base.attributes.NotesUrl;
import org.emona.model.base.attributes.NotificationCommands;
import org.emona.model.base.attributes.NotificationFailureCriteria;
import org.emona.model.base.attributes.NotificationInterval;
import org.emona.model.base.attributes.NotificationPeriod;
import org.emona.model.base.attributes.NotificationsEnabled;
import org.emona.model.base.attributes.ObsessOverHost;
import org.emona.model.base.attributes.ObsessOverService;
import org.emona.model.base.attributes.Pager;
import org.emona.model.base.attributes.Parents;
import org.emona.model.base.attributes.PassiveChecksEnabled;
import org.emona.model.base.attributes.ProcessPerfData;
import org.emona.model.base.attributes.Register;
import org.emona.model.base.attributes.RetainNonstatusInformation;
import org.emona.model.base.attributes.RetainStatusInformation;
import org.emona.model.base.attributes.RetryInterval;
import org.emona.model.base.attributes.ServiceDescription;
import org.emona.model.base.attributes.ServiceDescriptionReference;
import org.emona.model.base.attributes.ServiceEscalationOptions;
import org.emona.model.base.attributes.ServiceExecutionFailureCriteria;
import org.emona.model.base.attributes.ServiceFlapDetectionOptions;
import org.emona.model.base.attributes.ServiceInitialState;
import org.emona.model.base.attributes.ServiceMembers;
import org.emona.model.base.attributes.ServiceNotificationCommands;
import org.emona.model.base.attributes.ServiceNotificationFailureCriteria;
import org.emona.model.base.attributes.ServiceNotificationOptions;
import org.emona.model.base.attributes.ServiceNotificationPeriod;
import org.emona.model.base.attributes.ServiceNotificationsEnabled;
import org.emona.model.base.attributes.ServiceStalkingOptions;
import org.emona.model.base.attributes.ServicegroupMembers;
import org.emona.model.base.attributes.ServicegroupName;
import org.emona.model.base.attributes.Servicegroups;
import org.emona.model.base.attributes.StatusmapImage;
import org.emona.model.base.attributes.TemplateName;
import org.emona.model.base.attributes.ThreeDCoords;
import org.emona.model.base.attributes.TimeExclude;
import org.emona.model.base.attributes.TimeperiodName;
import org.emona.model.base.attributes.TwoDCoords;
import org.emona.model.base.attributes.Use;
import org.emona.model.base.attributes.VrmlImage;

import org.emona.model.base.attributes.time.TimePackage;
import org.emona.model.base.attributes.time.impl.TimePackageImpl;
import org.emona.model.base.impl.BasePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributesPackageImpl extends EPackageImpl implements
		AttributesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostInitialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostgroupsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeperiodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostgroupNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxCheckAttemptsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeChecksEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveChecksEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExcludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationsEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostNotificationsEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNotificationsEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostNotificationPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNotificationPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostNotificationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNotificationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationCommandsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostNotificationCommandsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNotificationCommandsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMembersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactGroupNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactGroupsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstNotificationDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostStalkingOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notesUrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionUrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconImageAltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vrmlImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusmapImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoDCoordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threeDCoordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostgroupMembersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostMembersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostNameReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostgroupNameReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInitialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isVolatileFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obsessOverHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obsessOverServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkFreshnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freshnessThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowFlapThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highFlapThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flapDetectionEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostFlapDetectionOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPerfDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retainStatusInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retainNonstatusInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFlapDetectionOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicegroupNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMembersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicegroupMembersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicegroupsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentHostNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentHostgroupNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentServiceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritsParentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceExecutionFailureCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationFailureCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceStalkingOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escalationPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEscalationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostExecutionFailureCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNotificationFailureCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostNotificationFailureCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEscalationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canSubmitCommandsEClass = null;

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
	 * @see org.emona.model.base.attributes.AttributesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AttributesPackageImpl() {
		super(eNS_URI, AttributesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AttributesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AttributesPackage init() {
		if (isInited)
			return (AttributesPackage) EPackage.Registry.INSTANCE
					.getEPackage(AttributesPackage.eNS_URI);

		// Obtain or create and register package
		AttributesPackageImpl theAttributesPackage = (AttributesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof AttributesPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new AttributesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);

		// Create package meta-data objects
		theAttributesPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theTimePackage.createPackageContents();

		// Initialize created meta-data
		theAttributesPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAttributesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AttributesPackage.eNS_URI,
				theAttributesPackage);
		return theAttributesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlias() {
		return aliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlias_Token() {
		return (EAttribute) aliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostInitialState() {
		return hostInitialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInitialState_Value() {
		return (EAttribute) hostInitialStateEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostInitialState_Token() {
		return (EAttribute) hostInitialStateEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostgroups() {
		return hostgroupsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostgroups_Reference() {
		return (EReference) hostgroupsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostgroups_Token() {
		return (EAttribute) hostgroupsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParents() {
		return parentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParents_Reference() {
		return (EReference) parentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParents_Token() {
		return (EAttribute) parentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Value() {
		return (EAttribute) addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Token() {
		return (EAttribute) addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayName() {
		return displayNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayName_Token() {
		return (EAttribute) displayNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_Token() {
		return (EAttribute) registerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUse() {
		return useEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUse_Reference() {
		return (EReference) useEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUse_Token() {
		return (EAttribute) useEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeperiodName() {
		return timeperiodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeperiodName_Token() {
		return (EAttribute) timeperiodNameEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostgroupName() {
		return hostgroupNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostgroupName_Token() {
		return (EAttribute) hostgroupNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostName() {
		return hostNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostName_Token() {
		return (EAttribute) hostNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateName() {
		return templateNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateName_Token() {
		return (EAttribute) templateNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandLine() {
		return commandLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLine_Token() {
		return (EAttribute) commandLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandName() {
		return commandNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandName_Token() {
		return (EAttribute) commandNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxCheckAttempts() {
		return maxCheckAttemptsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxCheckAttempts_Token() {
		return (EAttribute) maxCheckAttemptsEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckInterval() {
		return checkIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckInterval_Token() {
		return (EAttribute) checkIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetryInterval() {
		return retryIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryInterval_Token() {
		return (EAttribute) retryIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveChecksEnabled() {
		return activeChecksEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveChecksEnabled_Token() {
		return (EAttribute) activeChecksEnabledEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveChecksEnabled() {
		return passiveChecksEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassiveChecksEnabled_Token() {
		return (EAttribute) passiveChecksEnabledEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckPeriod() {
		return checkPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckPeriod_Reference() {
		return (EReference) checkPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckPeriod_Token() {
		return (EAttribute) checkPeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckCommand() {
		return checkCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckCommand_Reference() {
		return (EReference) checkCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckCommand_Token() {
		return (EAttribute) checkCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExclude() {
		return timeExcludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExclude_Reference() {
		return (EReference) timeExcludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeExclude_Token() {
		return (EAttribute) timeExcludeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactName() {
		return contactNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactName_Token() {
		return (EAttribute) contactNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationsEnabled() {
		return notificationsEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationsEnabled_Token() {
		return (EAttribute) notificationsEnabledEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostNotificationsEnabled() {
		return hostNotificationsEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationsEnabled_Token() {
		return (EAttribute) hostNotificationsEnabledEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNotificationsEnabled() {
		return serviceNotificationsEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNotificationsEnabled_Token() {
		return (EAttribute) serviceNotificationsEnabledEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationPeriod() {
		return notificationPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationPeriod_Reference() {
		return (EReference) notificationPeriodEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationPeriod_Token() {
		return (EAttribute) notificationPeriodEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostNotificationPeriod() {
		return hostNotificationPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostNotificationPeriod_Reference() {
		return (EReference) hostNotificationPeriodEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationPeriod_Token() {
		return (EAttribute) hostNotificationPeriodEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNotificationPeriod() {
		return serviceNotificationPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNotificationPeriod_Reference() {
		return (EReference) serviceNotificationPeriodEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNotificationPeriod_Token() {
		return (EAttribute) serviceNotificationPeriodEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostNotificationOptions() {
		return hostNotificationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationOptions_Token() {
		return (EAttribute) hostNotificationOptionsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationOptions_Recovery() {
		return (EAttribute) hostNotificationOptionsEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationOptions_Down() {
		return (EAttribute) hostNotificationOptionsEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationOptions_Unreachable() {
		return (EAttribute) hostNotificationOptionsEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationOptions_Flapping() {
		return (EAttribute) hostNotificationOptionsEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationOptions_ScheduledDowntime() {
		return (EAttribute) hostNotificationOptionsEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationOptions_None() {
		return (EAttribute) hostNotificationOptionsEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNotificationOptions() {
		return serviceNotificationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNotificationOptions_Token() {
		return (EAttribute) serviceNotificationOptionsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationCommands() {
		return notificationCommandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationCommands_Reference() {
		return (EReference) notificationCommandsEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationCommands_Token() {
		return (EAttribute) notificationCommandsEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostNotificationCommands() {
		return hostNotificationCommandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostNotificationCommands_Reference() {
		return (EReference) hostNotificationCommandsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationCommands_Token() {
		return (EAttribute) hostNotificationCommandsEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNotificationCommands() {
		return serviceNotificationCommandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNotificationCommands_Reference() {
		return (EReference) serviceNotificationCommandsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNotificationCommands_Token() {
		return (EAttribute) serviceNotificationCommandsEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactAddress() {
		return contactAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactAddress_Token() {
		return (EAttribute) contactAddressEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmail() {
		return emailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmail_Token() {
		return (EAttribute) emailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmail_Value() {
		return (EAttribute) emailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPager() {
		return pagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPager_Token() {
		return (EAttribute) pagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPager_Value() {
		return (EAttribute) pagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactMembers() {
		return contactMembersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactMembers_Reference() {
		return (EReference) contactMembersEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactMembers_Token() {
		return (EAttribute) contactMembersEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactGroupName() {
		return contactGroupNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactGroupName_Token() {
		return (EAttribute) contactGroupNameEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContacts() {
		return contactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContacts_Reference() {
		return (EReference) contactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContacts_Token() {
		return (EAttribute) contactsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactGroups() {
		return contactGroupsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactGroups_Reference() {
		return (EReference) contactGroupsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactGroups_Token() {
		return (EAttribute) contactGroupsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationInterval() {
		return notificationIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationInterval_Token() {
		return (EAttribute) notificationIntervalEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstNotificationDelay() {
		return firstNotificationDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstNotificationDelay_Token() {
		return (EAttribute) firstNotificationDelayEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostStalkingOptions() {
		return hostStalkingOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostStalkingOptions_Token() {
		return (EAttribute) hostStalkingOptionsEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotes() {
		return notesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotes_Token() {
		return (EAttribute) notesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotesUrl() {
		return notesUrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesUrl_Token() {
		return (EAttribute) notesUrlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionUrl() {
		return actionUrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionUrl_Token() {
		return (EAttribute) actionUrlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconImage() {
		return iconImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconImage_Token() {
		return (EAttribute) iconImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconImageAlt() {
		return iconImageAltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconImageAlt_Token() {
		return (EAttribute) iconImageAltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVrmlImage() {
		return vrmlImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVrmlImage_Token() {
		return (EAttribute) vrmlImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusmapImage() {
		return statusmapImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusmapImage_Token() {
		return (EAttribute) statusmapImageEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoDCoords() {
		return twoDCoordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwoDCoords_Token() {
		return (EAttribute) twoDCoordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwoDCoords_Xcoord() {
		return (EAttribute) twoDCoordsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwoDCoords_Ycoord() {
		return (EAttribute) twoDCoordsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreeDCoords() {
		return threeDCoordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDCoords_Token() {
		return (EAttribute) threeDCoordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDCoords_Xcoord() {
		return (EAttribute) threeDCoordsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDCoords_Ycoord() {
		return (EAttribute) threeDCoordsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreeDCoords_Zcoord() {
		return (EAttribute) threeDCoordsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostgroupMembers() {
		return hostgroupMembersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostgroupMembers_Reference() {
		return (EReference) hostgroupMembersEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostgroupMembers_Token() {
		return (EAttribute) hostgroupMembersEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostMembers() {
		return hostMembersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostMembers_Reference() {
		return (EReference) hostMembersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostMembers_Token() {
		return (EAttribute) hostMembersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostNameReference() {
		return hostNameReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostNameReference_Reference() {
		return (EReference) hostNameReferenceEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNameReference_Token() {
		return (EAttribute) hostNameReferenceEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostgroupNameReference() {
		return hostgroupNameReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostgroupNameReference_Reference() {
		return (EReference) hostgroupNameReferenceEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostgroupNameReference_Token() {
		return (EAttribute) hostgroupNameReferenceEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescription() {
		return serviceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescription_Token() {
		return (EAttribute) serviceDescriptionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInitialState() {
		return serviceInitialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInitialState_Value() {
		return (EAttribute) serviceInitialStateEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInitialState_Token() {
		return (EAttribute) serviceInitialStateEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInitialState_Ok() {
		return (EAttribute) serviceInitialStateEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsVolatileFlag() {
		return isVolatileFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsVolatileFlag_Token() {
		return (EAttribute) isVolatileFlagEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObsessOverHost() {
		return obsessOverHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObsessOverHost_Token() {
		return (EAttribute) obsessOverHostEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObsessOverService() {
		return obsessOverServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObsessOverService_Token() {
		return (EAttribute) obsessOverServiceEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckFreshness() {
		return checkFreshnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckFreshness_Token() {
		return (EAttribute) checkFreshnessEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreshnessThreshold() {
		return freshnessThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreshnessThreshold_Token() {
		return (EAttribute) freshnessThresholdEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHandler() {
		return eventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_Reference() {
		return (EReference) eventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventHandler_Token() {
		return (EAttribute) eventHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHandlerEnabled() {
		return eventHandlerEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventHandlerEnabled_Token() {
		return (EAttribute) eventHandlerEnabledEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowFlapThreshold() {
		return lowFlapThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLowFlapThreshold_Token() {
		return (EAttribute) lowFlapThresholdEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighFlapThreshold() {
		return highFlapThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighFlapThreshold_Token() {
		return (EAttribute) highFlapThresholdEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlapDetectionEnabled() {
		return flapDetectionEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlapDetectionEnabled_Token() {
		return (EAttribute) flapDetectionEnabledEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostFlapDetectionOptions() {
		return hostFlapDetectionOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostFlapDetectionOptions_Value() {
		return (EAttribute) hostFlapDetectionOptionsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostFlapDetectionOptions_Token() {
		return (EAttribute) hostFlapDetectionOptionsEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPerfData() {
		return processPerfDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessPerfData_Token() {
		return (EAttribute) processPerfDataEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetainStatusInformation() {
		return retainStatusInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetainStatusInformation_Token() {
		return (EAttribute) retainStatusInformationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetainNonstatusInformation() {
		return retainNonstatusInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetainNonstatusInformation_Token() {
		return (EAttribute) retainNonstatusInformationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFlapDetectionOptions() {
		return serviceFlapDetectionOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFlapDetectionOptions_Token() {
		return (EAttribute) serviceFlapDetectionOptionsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicegroupName() {
		return servicegroupNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicegroupName_Token() {
		return (EAttribute) servicegroupNameEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMembers() {
		return serviceMembersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMembers_Reference() {
		return (EReference) serviceMembersEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMembers_Token() {
		return (EAttribute) serviceMembersEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicegroupMembers() {
		return servicegroupMembersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicegroupMembers_Reference() {
		return (EReference) servicegroupMembersEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicegroupMembers_Token() {
		return (EAttribute) servicegroupMembersEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicegroups() {
		return servicegroupsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicegroups_Reference() {
		return (EReference) servicegroupsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicegroups_Token() {
		return (EAttribute) servicegroupsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentHostName() {
		return dependentHostNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentHostName_Reference() {
		return (EReference) dependentHostNameEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentHostName_Token() {
		return (EAttribute) dependentHostNameEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentHostgroupName() {
		return dependentHostgroupNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentHostgroupName_Reference() {
		return (EReference) dependentHostgroupNameEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentHostgroupName_Token() {
		return (EAttribute) dependentHostgroupNameEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentServiceDescription() {
		return dependentServiceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentServiceDescription_Reference() {
		return (EReference) dependentServiceDescriptionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentServiceDescription_Token() {
		return (EAttribute) dependentServiceDescriptionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescriptionReference() {
		return serviceDescriptionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescriptionReference_Reference() {
		return (EReference) serviceDescriptionReferenceEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptionReference_Token() {
		return (EAttribute) serviceDescriptionReferenceEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritsParent() {
		return inheritsParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritsParent_Token() {
		return (EAttribute) inheritsParentEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceExecutionFailureCriteria() {
		return serviceExecutionFailureCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceExecutionFailureCriteria_Token() {
		return (EAttribute) serviceExecutionFailureCriteriaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationFailureCriteria() {
		return notificationFailureCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationFailureCriteria_Token() {
		return (EAttribute) notificationFailureCriteriaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyPeriod() {
		return dependencyPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyPeriod_Reference() {
		return (EReference) dependencyPeriodEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyPeriod_Token() {
		return (EAttribute) dependencyPeriodEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceStalkingOptions() {
		return serviceStalkingOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceStalkingOptions_Token() {
		return (EAttribute) serviceStalkingOptionsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstNotification() {
		return firstNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstNotification_Token() {
		return (EAttribute) firstNotificationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastNotification() {
		return lastNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLastNotification_Token() {
		return (EAttribute) lastNotificationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscalationPeriod() {
		return escalationPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEscalationPeriod_Reference() {
		return (EReference) escalationPeriodEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEscalationPeriod_Token() {
		return (EAttribute) escalationPeriodEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceEscalationOptions() {
		return serviceEscalationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceEscalationOptions_Token() {
		return (EAttribute) serviceEscalationOptionsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostExecutionFailureCriteria() {
		return hostExecutionFailureCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostExecutionFailureCriteria_Token() {
		return (EAttribute) hostExecutionFailureCriteriaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNotificationFailureCriteria() {
		return serviceNotificationFailureCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNotificationFailureCriteria_Token() {
		return (EAttribute) serviceNotificationFailureCriteriaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostNotificationFailureCriteria() {
		return hostNotificationFailureCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostNotificationFailureCriteria_Token() {
		return (EAttribute) hostNotificationFailureCriteriaEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostEscalationOptions() {
		return hostEscalationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostEscalationOptions_Token() {
		return (EAttribute) hostEscalationOptionsEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanSubmitCommands() {
		return canSubmitCommandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanSubmitCommands_Token() {
		return (EAttribute) canSubmitCommandsEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesFactory getAttributesFactory() {
		return (AttributesFactory) getEFactoryInstance();
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
		aliasEClass = createEClass(ALIAS);
		createEAttribute(aliasEClass, ALIAS__TOKEN);

		hostInitialStateEClass = createEClass(HOST_INITIAL_STATE);
		createEAttribute(hostInitialStateEClass, HOST_INITIAL_STATE__VALUE);
		createEAttribute(hostInitialStateEClass, HOST_INITIAL_STATE__TOKEN);

		hostgroupsEClass = createEClass(HOSTGROUPS);
		createEReference(hostgroupsEClass, HOSTGROUPS__REFERENCE);
		createEAttribute(hostgroupsEClass, HOSTGROUPS__TOKEN);

		parentsEClass = createEClass(PARENTS);
		createEReference(parentsEClass, PARENTS__REFERENCE);
		createEAttribute(parentsEClass, PARENTS__TOKEN);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__VALUE);
		createEAttribute(addressEClass, ADDRESS__TOKEN);

		displayNameEClass = createEClass(DISPLAY_NAME);
		createEAttribute(displayNameEClass, DISPLAY_NAME__TOKEN);

		registerEClass = createEClass(REGISTER);
		createEAttribute(registerEClass, REGISTER__TOKEN);

		useEClass = createEClass(USE);
		createEReference(useEClass, USE__REFERENCE);
		createEAttribute(useEClass, USE__TOKEN);

		timeperiodNameEClass = createEClass(TIMEPERIOD_NAME);
		createEAttribute(timeperiodNameEClass, TIMEPERIOD_NAME__TOKEN);

		hostgroupNameEClass = createEClass(HOSTGROUP_NAME);
		createEAttribute(hostgroupNameEClass, HOSTGROUP_NAME__TOKEN);

		hostNameEClass = createEClass(HOST_NAME);
		createEAttribute(hostNameEClass, HOST_NAME__TOKEN);

		templateNameEClass = createEClass(TEMPLATE_NAME);
		createEAttribute(templateNameEClass, TEMPLATE_NAME__TOKEN);

		commandLineEClass = createEClass(COMMAND_LINE);
		createEAttribute(commandLineEClass, COMMAND_LINE__TOKEN);

		commandNameEClass = createEClass(COMMAND_NAME);
		createEAttribute(commandNameEClass, COMMAND_NAME__TOKEN);

		maxCheckAttemptsEClass = createEClass(MAX_CHECK_ATTEMPTS);
		createEAttribute(maxCheckAttemptsEClass, MAX_CHECK_ATTEMPTS__TOKEN);

		checkIntervalEClass = createEClass(CHECK_INTERVAL);
		createEAttribute(checkIntervalEClass, CHECK_INTERVAL__TOKEN);

		retryIntervalEClass = createEClass(RETRY_INTERVAL);
		createEAttribute(retryIntervalEClass, RETRY_INTERVAL__TOKEN);

		activeChecksEnabledEClass = createEClass(ACTIVE_CHECKS_ENABLED);
		createEAttribute(activeChecksEnabledEClass,
				ACTIVE_CHECKS_ENABLED__TOKEN);

		passiveChecksEnabledEClass = createEClass(PASSIVE_CHECKS_ENABLED);
		createEAttribute(passiveChecksEnabledEClass,
				PASSIVE_CHECKS_ENABLED__TOKEN);

		checkPeriodEClass = createEClass(CHECK_PERIOD);
		createEReference(checkPeriodEClass, CHECK_PERIOD__REFERENCE);
		createEAttribute(checkPeriodEClass, CHECK_PERIOD__TOKEN);

		checkCommandEClass = createEClass(CHECK_COMMAND);
		createEReference(checkCommandEClass, CHECK_COMMAND__REFERENCE);
		createEAttribute(checkCommandEClass, CHECK_COMMAND__TOKEN);

		timeExcludeEClass = createEClass(TIME_EXCLUDE);
		createEReference(timeExcludeEClass, TIME_EXCLUDE__REFERENCE);
		createEAttribute(timeExcludeEClass, TIME_EXCLUDE__TOKEN);

		contactNameEClass = createEClass(CONTACT_NAME);
		createEAttribute(contactNameEClass, CONTACT_NAME__TOKEN);

		notificationsEnabledEClass = createEClass(NOTIFICATIONS_ENABLED);
		createEAttribute(notificationsEnabledEClass,
				NOTIFICATIONS_ENABLED__TOKEN);

		hostNotificationsEnabledEClass = createEClass(HOST_NOTIFICATIONS_ENABLED);
		createEAttribute(hostNotificationsEnabledEClass,
				HOST_NOTIFICATIONS_ENABLED__TOKEN);

		serviceNotificationsEnabledEClass = createEClass(SERVICE_NOTIFICATIONS_ENABLED);
		createEAttribute(serviceNotificationsEnabledEClass,
				SERVICE_NOTIFICATIONS_ENABLED__TOKEN);

		notificationPeriodEClass = createEClass(NOTIFICATION_PERIOD);
		createEReference(notificationPeriodEClass,
				NOTIFICATION_PERIOD__REFERENCE);
		createEAttribute(notificationPeriodEClass, NOTIFICATION_PERIOD__TOKEN);

		hostNotificationPeriodEClass = createEClass(HOST_NOTIFICATION_PERIOD);
		createEReference(hostNotificationPeriodEClass,
				HOST_NOTIFICATION_PERIOD__REFERENCE);
		createEAttribute(hostNotificationPeriodEClass,
				HOST_NOTIFICATION_PERIOD__TOKEN);

		serviceNotificationPeriodEClass = createEClass(SERVICE_NOTIFICATION_PERIOD);
		createEReference(serviceNotificationPeriodEClass,
				SERVICE_NOTIFICATION_PERIOD__REFERENCE);
		createEAttribute(serviceNotificationPeriodEClass,
				SERVICE_NOTIFICATION_PERIOD__TOKEN);

		hostNotificationOptionsEClass = createEClass(HOST_NOTIFICATION_OPTIONS);
		createEAttribute(hostNotificationOptionsEClass,
				HOST_NOTIFICATION_OPTIONS__TOKEN);
		createEAttribute(hostNotificationOptionsEClass,
				HOST_NOTIFICATION_OPTIONS__RECOVERY);
		createEAttribute(hostNotificationOptionsEClass,
				HOST_NOTIFICATION_OPTIONS__DOWN);
		createEAttribute(hostNotificationOptionsEClass,
				HOST_NOTIFICATION_OPTIONS__UNREACHABLE);
		createEAttribute(hostNotificationOptionsEClass,
				HOST_NOTIFICATION_OPTIONS__FLAPPING);
		createEAttribute(hostNotificationOptionsEClass,
				HOST_NOTIFICATION_OPTIONS__SCHEDULED_DOWNTIME);
		createEAttribute(hostNotificationOptionsEClass,
				HOST_NOTIFICATION_OPTIONS__NONE);

		serviceNotificationOptionsEClass = createEClass(SERVICE_NOTIFICATION_OPTIONS);
		createEAttribute(serviceNotificationOptionsEClass,
				SERVICE_NOTIFICATION_OPTIONS__TOKEN);

		notificationCommandsEClass = createEClass(NOTIFICATION_COMMANDS);
		createEReference(notificationCommandsEClass,
				NOTIFICATION_COMMANDS__REFERENCE);
		createEAttribute(notificationCommandsEClass,
				NOTIFICATION_COMMANDS__TOKEN);

		hostNotificationCommandsEClass = createEClass(HOST_NOTIFICATION_COMMANDS);
		createEReference(hostNotificationCommandsEClass,
				HOST_NOTIFICATION_COMMANDS__REFERENCE);
		createEAttribute(hostNotificationCommandsEClass,
				HOST_NOTIFICATION_COMMANDS__TOKEN);

		serviceNotificationCommandsEClass = createEClass(SERVICE_NOTIFICATION_COMMANDS);
		createEReference(serviceNotificationCommandsEClass,
				SERVICE_NOTIFICATION_COMMANDS__REFERENCE);
		createEAttribute(serviceNotificationCommandsEClass,
				SERVICE_NOTIFICATION_COMMANDS__TOKEN);

		contactAddressEClass = createEClass(CONTACT_ADDRESS);
		createEAttribute(contactAddressEClass, CONTACT_ADDRESS__TOKEN);

		emailEClass = createEClass(EMAIL);
		createEAttribute(emailEClass, EMAIL__TOKEN);
		createEAttribute(emailEClass, EMAIL__VALUE);

		pagerEClass = createEClass(PAGER);
		createEAttribute(pagerEClass, PAGER__TOKEN);
		createEAttribute(pagerEClass, PAGER__VALUE);

		contactMembersEClass = createEClass(CONTACT_MEMBERS);
		createEReference(contactMembersEClass, CONTACT_MEMBERS__REFERENCE);
		createEAttribute(contactMembersEClass, CONTACT_MEMBERS__TOKEN);

		contactGroupNameEClass = createEClass(CONTACT_GROUP_NAME);
		createEAttribute(contactGroupNameEClass, CONTACT_GROUP_NAME__TOKEN);

		contactsEClass = createEClass(CONTACTS);
		createEReference(contactsEClass, CONTACTS__REFERENCE);
		createEAttribute(contactsEClass, CONTACTS__TOKEN);

		contactGroupsEClass = createEClass(CONTACT_GROUPS);
		createEReference(contactGroupsEClass, CONTACT_GROUPS__REFERENCE);
		createEAttribute(contactGroupsEClass, CONTACT_GROUPS__TOKEN);

		notificationIntervalEClass = createEClass(NOTIFICATION_INTERVAL);
		createEAttribute(notificationIntervalEClass,
				NOTIFICATION_INTERVAL__TOKEN);

		firstNotificationDelayEClass = createEClass(FIRST_NOTIFICATION_DELAY);
		createEAttribute(firstNotificationDelayEClass,
				FIRST_NOTIFICATION_DELAY__TOKEN);

		hostStalkingOptionsEClass = createEClass(HOST_STALKING_OPTIONS);
		createEAttribute(hostStalkingOptionsEClass,
				HOST_STALKING_OPTIONS__TOKEN);

		notesEClass = createEClass(NOTES);
		createEAttribute(notesEClass, NOTES__TOKEN);

		notesUrlEClass = createEClass(NOTES_URL);
		createEAttribute(notesUrlEClass, NOTES_URL__TOKEN);

		actionUrlEClass = createEClass(ACTION_URL);
		createEAttribute(actionUrlEClass, ACTION_URL__TOKEN);

		iconImageEClass = createEClass(ICON_IMAGE);
		createEAttribute(iconImageEClass, ICON_IMAGE__TOKEN);

		iconImageAltEClass = createEClass(ICON_IMAGE_ALT);
		createEAttribute(iconImageAltEClass, ICON_IMAGE_ALT__TOKEN);

		vrmlImageEClass = createEClass(VRML_IMAGE);
		createEAttribute(vrmlImageEClass, VRML_IMAGE__TOKEN);

		statusmapImageEClass = createEClass(STATUSMAP_IMAGE);
		createEAttribute(statusmapImageEClass, STATUSMAP_IMAGE__TOKEN);

		twoDCoordsEClass = createEClass(TWO_DCOORDS);
		createEAttribute(twoDCoordsEClass, TWO_DCOORDS__TOKEN);
		createEAttribute(twoDCoordsEClass, TWO_DCOORDS__XCOORD);
		createEAttribute(twoDCoordsEClass, TWO_DCOORDS__YCOORD);

		threeDCoordsEClass = createEClass(THREE_DCOORDS);
		createEAttribute(threeDCoordsEClass, THREE_DCOORDS__TOKEN);
		createEAttribute(threeDCoordsEClass, THREE_DCOORDS__XCOORD);
		createEAttribute(threeDCoordsEClass, THREE_DCOORDS__YCOORD);
		createEAttribute(threeDCoordsEClass, THREE_DCOORDS__ZCOORD);

		hostgroupMembersEClass = createEClass(HOSTGROUP_MEMBERS);
		createEReference(hostgroupMembersEClass, HOSTGROUP_MEMBERS__REFERENCE);
		createEAttribute(hostgroupMembersEClass, HOSTGROUP_MEMBERS__TOKEN);

		hostMembersEClass = createEClass(HOST_MEMBERS);
		createEReference(hostMembersEClass, HOST_MEMBERS__REFERENCE);
		createEAttribute(hostMembersEClass, HOST_MEMBERS__TOKEN);

		hostNameReferenceEClass = createEClass(HOST_NAME_REFERENCE);
		createEReference(hostNameReferenceEClass,
				HOST_NAME_REFERENCE__REFERENCE);
		createEAttribute(hostNameReferenceEClass, HOST_NAME_REFERENCE__TOKEN);

		hostgroupNameReferenceEClass = createEClass(HOSTGROUP_NAME_REFERENCE);
		createEReference(hostgroupNameReferenceEClass,
				HOSTGROUP_NAME_REFERENCE__REFERENCE);
		createEAttribute(hostgroupNameReferenceEClass,
				HOSTGROUP_NAME_REFERENCE__TOKEN);

		serviceDescriptionEClass = createEClass(SERVICE_DESCRIPTION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__TOKEN);

		serviceInitialStateEClass = createEClass(SERVICE_INITIAL_STATE);
		createEAttribute(serviceInitialStateEClass,
				SERVICE_INITIAL_STATE__VALUE);
		createEAttribute(serviceInitialStateEClass,
				SERVICE_INITIAL_STATE__TOKEN);
		createEAttribute(serviceInitialStateEClass, SERVICE_INITIAL_STATE__OK);

		isVolatileFlagEClass = createEClass(IS_VOLATILE_FLAG);
		createEAttribute(isVolatileFlagEClass, IS_VOLATILE_FLAG__TOKEN);

		obsessOverHostEClass = createEClass(OBSESS_OVER_HOST);
		createEAttribute(obsessOverHostEClass, OBSESS_OVER_HOST__TOKEN);

		obsessOverServiceEClass = createEClass(OBSESS_OVER_SERVICE);
		createEAttribute(obsessOverServiceEClass, OBSESS_OVER_SERVICE__TOKEN);

		checkFreshnessEClass = createEClass(CHECK_FRESHNESS);
		createEAttribute(checkFreshnessEClass, CHECK_FRESHNESS__TOKEN);

		freshnessThresholdEClass = createEClass(FRESHNESS_THRESHOLD);
		createEAttribute(freshnessThresholdEClass, FRESHNESS_THRESHOLD__TOKEN);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEReference(eventHandlerEClass, EVENT_HANDLER__REFERENCE);
		createEAttribute(eventHandlerEClass, EVENT_HANDLER__TOKEN);

		eventHandlerEnabledEClass = createEClass(EVENT_HANDLER_ENABLED);
		createEAttribute(eventHandlerEnabledEClass,
				EVENT_HANDLER_ENABLED__TOKEN);

		lowFlapThresholdEClass = createEClass(LOW_FLAP_THRESHOLD);
		createEAttribute(lowFlapThresholdEClass, LOW_FLAP_THRESHOLD__TOKEN);

		highFlapThresholdEClass = createEClass(HIGH_FLAP_THRESHOLD);
		createEAttribute(highFlapThresholdEClass, HIGH_FLAP_THRESHOLD__TOKEN);

		flapDetectionEnabledEClass = createEClass(FLAP_DETECTION_ENABLED);
		createEAttribute(flapDetectionEnabledEClass,
				FLAP_DETECTION_ENABLED__TOKEN);

		hostFlapDetectionOptionsEClass = createEClass(HOST_FLAP_DETECTION_OPTIONS);
		createEAttribute(hostFlapDetectionOptionsEClass,
				HOST_FLAP_DETECTION_OPTIONS__VALUE);
		createEAttribute(hostFlapDetectionOptionsEClass,
				HOST_FLAP_DETECTION_OPTIONS__TOKEN);

		processPerfDataEClass = createEClass(PROCESS_PERF_DATA);
		createEAttribute(processPerfDataEClass, PROCESS_PERF_DATA__TOKEN);

		retainStatusInformationEClass = createEClass(RETAIN_STATUS_INFORMATION);
		createEAttribute(retainStatusInformationEClass,
				RETAIN_STATUS_INFORMATION__TOKEN);

		retainNonstatusInformationEClass = createEClass(RETAIN_NONSTATUS_INFORMATION);
		createEAttribute(retainNonstatusInformationEClass,
				RETAIN_NONSTATUS_INFORMATION__TOKEN);

		serviceFlapDetectionOptionsEClass = createEClass(SERVICE_FLAP_DETECTION_OPTIONS);
		createEAttribute(serviceFlapDetectionOptionsEClass,
				SERVICE_FLAP_DETECTION_OPTIONS__TOKEN);

		servicegroupNameEClass = createEClass(SERVICEGROUP_NAME);
		createEAttribute(servicegroupNameEClass, SERVICEGROUP_NAME__TOKEN);

		serviceMembersEClass = createEClass(SERVICE_MEMBERS);
		createEReference(serviceMembersEClass, SERVICE_MEMBERS__REFERENCE);
		createEAttribute(serviceMembersEClass, SERVICE_MEMBERS__TOKEN);

		servicegroupMembersEClass = createEClass(SERVICEGROUP_MEMBERS);
		createEReference(servicegroupMembersEClass,
				SERVICEGROUP_MEMBERS__REFERENCE);
		createEAttribute(servicegroupMembersEClass, SERVICEGROUP_MEMBERS__TOKEN);

		servicegroupsEClass = createEClass(SERVICEGROUPS);
		createEReference(servicegroupsEClass, SERVICEGROUPS__REFERENCE);
		createEAttribute(servicegroupsEClass, SERVICEGROUPS__TOKEN);

		dependentHostNameEClass = createEClass(DEPENDENT_HOST_NAME);
		createEReference(dependentHostNameEClass,
				DEPENDENT_HOST_NAME__REFERENCE);
		createEAttribute(dependentHostNameEClass, DEPENDENT_HOST_NAME__TOKEN);

		dependentHostgroupNameEClass = createEClass(DEPENDENT_HOSTGROUP_NAME);
		createEReference(dependentHostgroupNameEClass,
				DEPENDENT_HOSTGROUP_NAME__REFERENCE);
		createEAttribute(dependentHostgroupNameEClass,
				DEPENDENT_HOSTGROUP_NAME__TOKEN);

		dependentServiceDescriptionEClass = createEClass(DEPENDENT_SERVICE_DESCRIPTION);
		createEReference(dependentServiceDescriptionEClass,
				DEPENDENT_SERVICE_DESCRIPTION__REFERENCE);
		createEAttribute(dependentServiceDescriptionEClass,
				DEPENDENT_SERVICE_DESCRIPTION__TOKEN);

		serviceDescriptionReferenceEClass = createEClass(SERVICE_DESCRIPTION_REFERENCE);
		createEReference(serviceDescriptionReferenceEClass,
				SERVICE_DESCRIPTION_REFERENCE__REFERENCE);
		createEAttribute(serviceDescriptionReferenceEClass,
				SERVICE_DESCRIPTION_REFERENCE__TOKEN);

		inheritsParentEClass = createEClass(INHERITS_PARENT);
		createEAttribute(inheritsParentEClass, INHERITS_PARENT__TOKEN);

		serviceExecutionFailureCriteriaEClass = createEClass(SERVICE_EXECUTION_FAILURE_CRITERIA);
		createEAttribute(serviceExecutionFailureCriteriaEClass,
				SERVICE_EXECUTION_FAILURE_CRITERIA__TOKEN);

		notificationFailureCriteriaEClass = createEClass(NOTIFICATION_FAILURE_CRITERIA);
		createEAttribute(notificationFailureCriteriaEClass,
				NOTIFICATION_FAILURE_CRITERIA__TOKEN);

		dependencyPeriodEClass = createEClass(DEPENDENCY_PERIOD);
		createEReference(dependencyPeriodEClass, DEPENDENCY_PERIOD__REFERENCE);
		createEAttribute(dependencyPeriodEClass, DEPENDENCY_PERIOD__TOKEN);

		serviceStalkingOptionsEClass = createEClass(SERVICE_STALKING_OPTIONS);
		createEAttribute(serviceStalkingOptionsEClass,
				SERVICE_STALKING_OPTIONS__TOKEN);

		firstNotificationEClass = createEClass(FIRST_NOTIFICATION);
		createEAttribute(firstNotificationEClass, FIRST_NOTIFICATION__TOKEN);

		lastNotificationEClass = createEClass(LAST_NOTIFICATION);
		createEAttribute(lastNotificationEClass, LAST_NOTIFICATION__TOKEN);

		escalationPeriodEClass = createEClass(ESCALATION_PERIOD);
		createEReference(escalationPeriodEClass, ESCALATION_PERIOD__REFERENCE);
		createEAttribute(escalationPeriodEClass, ESCALATION_PERIOD__TOKEN);

		serviceEscalationOptionsEClass = createEClass(SERVICE_ESCALATION_OPTIONS);
		createEAttribute(serviceEscalationOptionsEClass,
				SERVICE_ESCALATION_OPTIONS__TOKEN);

		hostExecutionFailureCriteriaEClass = createEClass(HOST_EXECUTION_FAILURE_CRITERIA);
		createEAttribute(hostExecutionFailureCriteriaEClass,
				HOST_EXECUTION_FAILURE_CRITERIA__TOKEN);

		serviceNotificationFailureCriteriaEClass = createEClass(SERVICE_NOTIFICATION_FAILURE_CRITERIA);
		createEAttribute(serviceNotificationFailureCriteriaEClass,
				SERVICE_NOTIFICATION_FAILURE_CRITERIA__TOKEN);

		hostNotificationFailureCriteriaEClass = createEClass(HOST_NOTIFICATION_FAILURE_CRITERIA);
		createEAttribute(hostNotificationFailureCriteriaEClass,
				HOST_NOTIFICATION_FAILURE_CRITERIA__TOKEN);

		hostEscalationOptionsEClass = createEClass(HOST_ESCALATION_OPTIONS);
		createEAttribute(hostEscalationOptionsEClass,
				HOST_ESCALATION_OPTIONS__TOKEN);

		canSubmitCommandsEClass = createEClass(CAN_SUBMIT_COMMANDS);
		createEAttribute(canSubmitCommandsEClass, CAN_SUBMIT_COMMANDS__TOKEN);
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
		TimePackage theTimePackage = (TimePackage) EPackage.Registry.INSTANCE
				.getEPackage(TimePackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage) EPackage.Registry.INSTANCE
				.getEPackage(BasePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTimePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aliasEClass.getESuperTypes().add(theBasePackage.getValueAttribute());
		hostInitialStateEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		hostgroupsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		parentsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		addressEClass.getESuperTypes().add(theBasePackage.getAttribute());
		displayNameEClass.getESuperTypes().add(
				theBasePackage.getValueAttribute());
		registerEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		useEClass.getESuperTypes().add(theBasePackage.getReferenceAttribute());
		timeperiodNameEClass.getESuperTypes().add(
				theBasePackage.getNameAttribute());
		hostgroupNameEClass.getESuperTypes().add(
				theBasePackage.getNameAttribute());
		hostNameEClass.getESuperTypes().add(theBasePackage.getNameAttribute());
		templateNameEClass.getESuperTypes().add(
				theBasePackage.getNameAttribute());
		commandLineEClass.getESuperTypes().add(
				theBasePackage.getValueAttribute());
		commandNameEClass.getESuperTypes().add(
				theBasePackage.getNameAttribute());
		maxCheckAttemptsEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		checkIntervalEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		retryIntervalEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		activeChecksEnabledEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		passiveChecksEnabledEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		checkPeriodEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		checkCommandEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		timeExcludeEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		contactNameEClass.getESuperTypes().add(
				theBasePackage.getNameAttribute());
		notificationsEnabledEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		hostNotificationsEnabledEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		serviceNotificationsEnabledEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		notificationPeriodEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		hostNotificationPeriodEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		serviceNotificationPeriodEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		hostNotificationOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		serviceNotificationOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		serviceNotificationOptionsEClass.getESuperTypes().add(
				theBasePackage.getServiceNotificationOption());
		notificationCommandsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		hostNotificationCommandsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		serviceNotificationCommandsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		contactAddressEClass.getESuperTypes().add(
				theBasePackage.getValueAttribute());
		emailEClass.getESuperTypes().add(theBasePackage.getAttribute());
		pagerEClass.getESuperTypes().add(theBasePackage.getAttribute());
		contactMembersEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		contactGroupNameEClass.getESuperTypes().add(
				theBasePackage.getValueAttribute());
		contactsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		contactGroupsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		notificationIntervalEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		firstNotificationDelayEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		hostStalkingOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		hostStalkingOptionsEClass.getESuperTypes().add(
				theBasePackage.getHostState());
		notesEClass.getESuperTypes().add(theBasePackage.getValueAttribute());
		notesUrlEClass.getESuperTypes().add(theBasePackage.getValueAttribute());
		actionUrlEClass.getESuperTypes()
				.add(theBasePackage.getValueAttribute());
		iconImageEClass.getESuperTypes()
				.add(theBasePackage.getValueAttribute());
		iconImageAltEClass.getESuperTypes().add(
				theBasePackage.getValueAttribute());
		vrmlImageEClass.getESuperTypes()
				.add(theBasePackage.getValueAttribute());
		statusmapImageEClass.getESuperTypes().add(
				theBasePackage.getValueAttribute());
		twoDCoordsEClass.getESuperTypes().add(theBasePackage.getAttribute());
		threeDCoordsEClass.getESuperTypes().add(
				theBasePackage.getValueAttribute());
		hostgroupMembersEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		hostMembersEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		hostNameReferenceEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		hostgroupNameReferenceEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		serviceDescriptionEClass.getESuperTypes().add(
				theBasePackage.getNameAttribute());
		serviceInitialStateEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		isVolatileFlagEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		obsessOverHostEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		obsessOverServiceEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		checkFreshnessEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		freshnessThresholdEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		eventHandlerEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		eventHandlerEnabledEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		lowFlapThresholdEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		highFlapThresholdEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		flapDetectionEnabledEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		hostFlapDetectionOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		processPerfDataEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		retainStatusInformationEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		retainNonstatusInformationEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		serviceFlapDetectionOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		serviceFlapDetectionOptionsEClass.getESuperTypes().add(
				theBasePackage.getServiceState());
		servicegroupNameEClass.getESuperTypes().add(
				theBasePackage.getNameAttribute());
		serviceMembersEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		servicegroupMembersEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		servicegroupsEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		dependentHostNameEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		dependentHostgroupNameEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		dependentServiceDescriptionEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		serviceDescriptionReferenceEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		inheritsParentEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());
		serviceExecutionFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		serviceExecutionFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getServiceFailureCriteria());
		notificationFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		notificationFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getServiceFailureCriteria());
		dependencyPeriodEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		serviceStalkingOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		serviceStalkingOptionsEClass.getESuperTypes().add(
				theBasePackage.getServiceState());
		firstNotificationEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		lastNotificationEClass.getESuperTypes().add(
				theBasePackage.getIntegerValueAttribute());
		escalationPeriodEClass.getESuperTypes().add(
				theBasePackage.getReferenceAttribute());
		serviceEscalationOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		serviceEscalationOptionsEClass.getESuperTypes().add(
				theBasePackage.getServiceState());
		hostExecutionFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		hostExecutionFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getHostFailureCriteria());
		serviceNotificationFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		serviceNotificationFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getServiceFailureCriteria());
		hostNotificationFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		hostNotificationFailureCriteriaEClass.getESuperTypes().add(
				theBasePackage.getHostFailureCriteria());
		hostEscalationOptionsEClass.getESuperTypes().add(
				theBasePackage.getAttribute());
		hostEscalationOptionsEClass.getESuperTypes().add(
				theBasePackage.getHostState());
		canSubmitCommandsEClass.getESuperTypes().add(
				theBasePackage.getBooleanAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlias_Token(), ecorePackage.getEString(), "token",
				"alias", 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostInitialStateEClass, HostInitialState.class,
				"HostInitialState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostInitialState_Value(),
				theBasePackage.getHostStateValue(), "value", null, 0, 1,
				HostInitialState.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostInitialState_Token(), ecorePackage.getEString(),
				"token", "inital_state", 0, 1, HostInitialState.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostgroupsEClass, Hostgroups.class, "Hostgroups",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostgroups_Reference(), this.getHostgroupName(),
				null, "reference", null, 0, -1, Hostgroups.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostgroups_Token(), ecorePackage.getEString(),
				"token", "hostgroups", 0, 1, Hostgroups.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentsEClass, Parents.class, "Parents", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParents_Reference(), this.getHostName(), null,
				"reference", null, 0, -1, Parents.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParents_Token(), ecorePackage.getEString(), "token",
				"parents", 0, 1, Parents.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Value(), theBasePackage.getInetAddress(),
				"value", null, 0, 1, Address.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Token(), ecorePackage.getEString(), "token",
				"address", 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(displayNameEClass, DisplayName.class, "DisplayName",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayName_Token(), ecorePackage.getEString(),
				"token", "display_name", 0, 1, DisplayName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registerEClass, Register.class, "Register", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegister_Token(), ecorePackage.getEString(), "token",
				"register", 0, 1, Register.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(useEClass, Use.class, "Use", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUse_Reference(), this.getTemplateName(), null,
				"reference", null, 0, -1, Use.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUse_Token(), ecorePackage.getEString(), "token",
				"use", 0, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(timeperiodNameEClass, TimeperiodName.class,
				"TimeperiodName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeperiodName_Token(), ecorePackage.getEString(),
				"token", "timeperiod_name", 0, 1, TimeperiodName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostgroupNameEClass, HostgroupName.class, "HostgroupName",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostgroupName_Token(), ecorePackage.getEString(),
				"token", "host_group_name", 0, 1, HostgroupName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostNameEClass, HostName.class, "HostName", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostName_Token(), ecorePackage.getEString(), "token",
				"host_name", 0, 1, HostName.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(templateNameEClass, TemplateName.class, "TemplateName",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateName_Token(), ecorePackage.getEString(),
				"token", "template_name", 0, 1, TemplateName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandLineEClass, CommandLine.class, "CommandLine",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandLine_Token(), ecorePackage.getEString(),
				"token", "command_line", 0, 1, CommandLine.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandNameEClass, CommandName.class, "CommandName",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandName_Token(), ecorePackage.getEString(),
				"token", "command_name", 0, 1, CommandName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxCheckAttemptsEClass, MaxCheckAttempts.class,
				"MaxCheckAttempts", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxCheckAttempts_Token(), ecorePackage.getEString(),
				"token", "max_check_attempts", 0, 1, MaxCheckAttempts.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkIntervalEClass, CheckInterval.class, "CheckInterval",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckInterval_Token(), ecorePackage.getEString(),
				"token", "check_interval", 0, 1, CheckInterval.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retryIntervalEClass, RetryInterval.class, "RetryInterval",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetryInterval_Token(), ecorePackage.getEString(),
				"token", "retry_interval", 0, 1, RetryInterval.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activeChecksEnabledEClass, ActiveChecksEnabled.class,
				"ActiveChecksEnabled", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiveChecksEnabled_Token(),
				ecorePackage.getEString(), "token", "active_checks_enabled", 0,
				1, ActiveChecksEnabled.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(passiveChecksEnabledEClass, PassiveChecksEnabled.class,
				"PassiveChecksEnabled", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassiveChecksEnabled_Token(),
				ecorePackage.getEString(), "token", "passive_checks_enabled",
				0, 1, PassiveChecksEnabled.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(checkPeriodEClass, CheckPeriod.class, "CheckPeriod",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckPeriod_Reference(), this.getTimeperiodName(),
				null, "reference", null, 0, 1, CheckPeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCheckPeriod_Token(), ecorePackage.getEString(),
				"token", "check_period", 0, 1, CheckPeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkCommandEClass, CheckCommand.class, "CheckCommand",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckCommand_Reference(), this.getCommandName(),
				null, "reference", null, 0, 1, CheckCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCheckCommand_Token(), ecorePackage.getEString(),
				"token", "check_command", 0, 1, CheckCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeExcludeEClass, TimeExclude.class, "TimeExclude",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeExclude_Reference(), this.getTimeperiodName(),
				null, "reference", null, 0, -1, TimeExclude.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTimeExclude_Token(), ecorePackage.getEString(),
				"token", "time_exclude", 0, 1, TimeExclude.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactNameEClass, ContactName.class, "ContactName",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactName_Token(), ecorePackage.getEString(),
				"token", "contact_name", 0, 1, ContactName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationsEnabledEClass, NotificationsEnabled.class,
				"NotificationsEnabled", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationsEnabled_Token(),
				ecorePackage.getEString(), "token", "notifications_enabled", 0,
				1, NotificationsEnabled.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostNotificationsEnabledEClass,
				HostNotificationsEnabled.class, "HostNotificationsEnabled",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostNotificationsEnabled_Token(),
				ecorePackage.getEString(), "token",
				"host_notifications_enabled", 0, 1,
				HostNotificationsEnabled.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceNotificationsEnabledEClass,
				ServiceNotificationsEnabled.class,
				"ServiceNotificationsEnabled", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceNotificationsEnabled_Token(),
				ecorePackage.getEString(), "token",
				"service_notifications_enabled", 0, 1,
				ServiceNotificationsEnabled.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(notificationPeriodEClass, NotificationPeriod.class,
				"NotificationPeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotificationPeriod_Reference(),
				this.getTimeperiodName(), null, "reference", null, 0, 1,
				NotificationPeriod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationPeriod_Token(),
				ecorePackage.getEString(), "token", "notification_period", 0,
				1, NotificationPeriod.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostNotificationPeriodEClass, HostNotificationPeriod.class,
				"HostNotificationPeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostNotificationPeriod_Reference(),
				this.getTimeperiodName(), null, "reference", null, 0, 1,
				HostNotificationPeriod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostNotificationPeriod_Token(),
				ecorePackage.getEString(), "token", "host_notification_period",
				0, 1, HostNotificationPeriod.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceNotificationPeriodEClass,
				ServiceNotificationPeriod.class, "ServiceNotificationPeriod",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceNotificationPeriod_Reference(),
				this.getTimeperiodName(), null, "reference", null, 0, 1,
				ServiceNotificationPeriod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceNotificationPeriod_Token(),
				ecorePackage.getEString(), "token",
				"service_notification_period", 0, 1,
				ServiceNotificationPeriod.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostNotificationOptionsEClass,
				HostNotificationOptions.class, "HostNotificationOptions",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostNotificationOptions_Token(),
				ecorePackage.getEString(), "token",
				"host_notification_options", 0, 1,
				HostNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostNotificationOptions_Recovery(),
				ecorePackage.getEBoolean(), "recovery", "false", 1, 1,
				HostNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostNotificationOptions_Down(),
				ecorePackage.getEBoolean(), "down", "false", 1, 1,
				HostNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostNotificationOptions_Unreachable(),
				ecorePackage.getEBoolean(), "unreachable", "false", 1, 1,
				HostNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostNotificationOptions_Flapping(),
				ecorePackage.getEBoolean(), "flapping", "false", 1, 1,
				HostNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostNotificationOptions_ScheduledDowntime(),
				ecorePackage.getEBoolean(), "scheduledDowntime", "false", 1, 1,
				HostNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostNotificationOptions_None(),
				ecorePackage.getEBoolean(), "none", "false", 1, 1,
				HostNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceNotificationOptionsEClass,
				ServiceNotificationOptions.class, "ServiceNotificationOptions",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceNotificationOptions_Token(),
				ecorePackage.getEString(), "token",
				"service_notification_options", 0, 1,
				ServiceNotificationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(notificationCommandsEClass, NotificationCommands.class,
				"NotificationCommands", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotificationCommands_Reference(),
				this.getCommandName(), null, "reference", null, 0, 1,
				NotificationCommands.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationCommands_Token(),
				ecorePackage.getEString(), "token", "notification_commands", 0,
				1, NotificationCommands.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostNotificationCommandsEClass,
				HostNotificationCommands.class, "HostNotificationCommands",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostNotificationCommands_Reference(),
				this.getCommandName(), null, "reference", null, 0, -1,
				HostNotificationCommands.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostNotificationCommands_Token(),
				ecorePackage.getEString(), "token",
				"host_notification_commands", 0, 1,
				HostNotificationCommands.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceNotificationCommandsEClass,
				ServiceNotificationCommands.class,
				"ServiceNotificationCommands", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceNotificationCommands_Reference(),
				this.getCommandName(), null, "reference", null, 0, -1,
				ServiceNotificationCommands.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceNotificationCommands_Token(),
				ecorePackage.getEString(), "token",
				"service_notification_commands", 0, 1,
				ServiceNotificationCommands.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(contactAddressEClass, ContactAddress.class,
				"ContactAddress", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactAddress_Token(), ecorePackage.getEString(),
				"token", "contact_address", 0, 1, ContactAddress.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmail_Token(), ecorePackage.getEString(), "token",
				"email", 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEmail_Value(), theBasePackage.getMailAddress(),
				"value", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pagerEClass, Pager.class, "Pager", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPager_Token(), ecorePackage.getEString(), "token",
				"pager", 0, 1, Pager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPager_Value(), theBasePackage.getMailAddress(),
				"value", null, 0, 1, Pager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(contactMembersEClass, ContactMembers.class,
				"ContactMembers", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactMembers_Reference(), this.getContactName(),
				null, "reference", null, 0, -1, ContactMembers.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getContactMembers_Token(), ecorePackage.getEString(),
				"token", "members", 0, 1, ContactMembers.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(contactGroupNameEClass, ContactGroupName.class,
				"ContactGroupName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactGroupName_Token(), ecorePackage.getEString(),
				"token", "contactgroup_name", 0, 1, ContactGroupName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactsEClass, Contacts.class, "Contacts", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContacts_Reference(), this.getContactName(), null,
				"reference", null, 0, -1, Contacts.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContacts_Token(), ecorePackage.getEString(), "token",
				"contacts", 0, 1, Contacts.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(contactGroupsEClass, ContactGroups.class, "ContactGroups",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactGroups_Reference(),
				this.getContactGroupName(), null, "reference", null, 0, -1,
				ContactGroups.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactGroups_Token(), ecorePackage.getEString(),
				"token", "contact_groups", 0, 1, ContactGroups.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationIntervalEClass, NotificationInterval.class,
				"NotificationInterval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationInterval_Token(),
				ecorePackage.getEString(), "token", "notification_interval", 0,
				1, NotificationInterval.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(firstNotificationDelayEClass, FirstNotificationDelay.class,
				"FirstNotificationDelay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirstNotificationDelay_Token(),
				ecorePackage.getEString(), "token", "first_notification_delay",
				0, 1, FirstNotificationDelay.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostStalkingOptionsEClass, HostStalkingOptions.class,
				"HostStalkingOptions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostStalkingOptions_Token(),
				ecorePackage.getEString(), "token", "stalking_options", 0, 1,
				HostStalkingOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(notesEClass, Notes.class, "Notes", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotes_Token(), ecorePackage.getEString(), "token",
				"notes", 0, 1, Notes.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(notesUrlEClass, NotesUrl.class, "NotesUrl", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotesUrl_Token(), ecorePackage.getEString(), "token",
				"notes_url", 0, 1, NotesUrl.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actionUrlEClass, ActionUrl.class, "ActionUrl", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionUrl_Token(), ecorePackage.getEString(),
				"token", "action_url", 0, 1, ActionUrl.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconImageEClass, IconImage.class, "IconImage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconImage_Token(), ecorePackage.getEString(),
				"token", "icon_image", 0, 1, IconImage.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconImageAltEClass, IconImageAlt.class, "IconImageAlt",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconImageAlt_Token(), ecorePackage.getEString(),
				"token", "icon_image_alt", 0, 1, IconImageAlt.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vrmlImageEClass, VrmlImage.class, "VrmlImage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVrmlImage_Token(), ecorePackage.getEString(),
				"token", "vrml_image", 0, 1, VrmlImage.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusmapImageEClass, StatusmapImage.class,
				"StatusmapImage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusmapImage_Token(), ecorePackage.getEString(),
				"token", "statusmap_image", 0, 1, StatusmapImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoDCoordsEClass, TwoDCoords.class, "TwoDCoords",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoDCoords_Token(), ecorePackage.getEString(),
				"token", "2d_coords", 0, 1, TwoDCoords.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwoDCoords_Xcoord(), ecorePackage.getEInt(),
				"xcoord", null, 1, 1, TwoDCoords.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwoDCoords_Ycoord(), ecorePackage.getEInt(),
				"ycoord", null, 1, 1, TwoDCoords.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(threeDCoordsEClass, ThreeDCoords.class, "ThreeDCoords",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreeDCoords_Token(), ecorePackage.getEString(),
				"token", "3d_coords", 0, 1, ThreeDCoords.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreeDCoords_Xcoord(), ecorePackage.getEDouble(),
				"xcoord", null, 1, 1, ThreeDCoords.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreeDCoords_Ycoord(), ecorePackage.getEDouble(),
				"ycoord", null, 1, 1, ThreeDCoords.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreeDCoords_Zcoord(), ecorePackage.getEDouble(),
				"zcoord", null, 1, 1, ThreeDCoords.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(hostgroupMembersEClass, HostgroupMembers.class,
				"HostgroupMembers", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostgroupMembers_Reference(),
				this.getHostgroupName(), null, "reference", null, 0, -1,
				HostgroupMembers.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostgroupMembers_Token(), ecorePackage.getEString(),
				"token", "hostgroup_members", 0, 1, HostgroupMembers.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostMembersEClass, HostMembers.class, "HostMembers",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostMembers_Reference(), this.getHostName(), null,
				"reference", null, 0, -1, HostMembers.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostMembers_Token(), ecorePackage.getEString(),
				"token", "members", 0, 1, HostMembers.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(hostNameReferenceEClass, HostNameReference.class,
				"HostNameReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostNameReference_Reference(), this.getHostName(),
				null, "reference", null, 0, -1, HostNameReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostNameReference_Token(), ecorePackage.getEString(),
				"token", "host_name", 0, 1, HostNameReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostgroupNameReferenceEClass, HostgroupNameReference.class,
				"HostgroupNameReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostgroupNameReference_Reference(),
				this.getHostgroupName(), null, "reference", null, 0, -1,
				HostgroupNameReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostgroupNameReference_Token(),
				ecorePackage.getEString(), "token", "hostgroup_name", 0, 1,
				HostgroupNameReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceDescriptionEClass, ServiceDescription.class,
				"ServiceDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescription_Token(),
				ecorePackage.getEString(), "token", "service_description", 0,
				1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceInitialStateEClass, ServiceInitialState.class,
				"ServiceInitialState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInitialState_Value(),
				theBasePackage.getServiceStateValue(), "value", null, 0, 1,
				ServiceInitialState.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getServiceInitialState_Token(),
				ecorePackage.getEString(), "token", "inital_state", 0, 1,
				ServiceInitialState.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getServiceInitialState_Ok(), ecorePackage.getEBoolean(),
				"ok", "false", 1, 1, ServiceInitialState.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(isVolatileFlagEClass, IsVolatileFlag.class,
				"IsVolatileFlag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsVolatileFlag_Token(), ecorePackage.getEString(),
				"token", "is_volatile", 0, 1, IsVolatileFlag.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obsessOverHostEClass, ObsessOverHost.class,
				"ObsessOverHost", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObsessOverHost_Token(), ecorePackage.getEString(),
				"token", "obsess_over_host", 0, 1, ObsessOverHost.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obsessOverServiceEClass, ObsessOverService.class,
				"ObsessOverService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObsessOverService_Token(), ecorePackage.getEString(),
				"token", "obsess_over_service", 0, 1, ObsessOverService.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkFreshnessEClass, CheckFreshness.class,
				"CheckFreshness", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckFreshness_Token(), ecorePackage.getEString(),
				"token", "check_freshness", 0, 1, CheckFreshness.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freshnessThresholdEClass, FreshnessThreshold.class,
				"FreshnessThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreshnessThreshold_Token(),
				ecorePackage.getEString(), "token", "freshness_threshold", 0,
				1, FreshnessThreshold.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHandler_Reference(), this.getCommandName(),
				null, "reference", null, 0, 1, EventHandler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEventHandler_Token(), ecorePackage.getEString(),
				"token", "event_handler", 0, 1, EventHandler.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerEnabledEClass, EventHandlerEnabled.class,
				"EventHandlerEnabled", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventHandlerEnabled_Token(),
				ecorePackage.getEString(), "token", "event_handler_enabled", 0,
				1, EventHandlerEnabled.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(lowFlapThresholdEClass, LowFlapThreshold.class,
				"LowFlapThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLowFlapThreshold_Token(), ecorePackage.getEString(),
				"token", "low_flap_threshold", 0, 1, LowFlapThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(highFlapThresholdEClass, HighFlapThreshold.class,
				"HighFlapThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighFlapThreshold_Token(), ecorePackage.getEString(),
				"token", "high_flap_threshold", 0, 1, HighFlapThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flapDetectionEnabledEClass, FlapDetectionEnabled.class,
				"FlapDetectionEnabled", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlapDetectionEnabled_Token(),
				ecorePackage.getEString(), "token", "flap_detection_enabled",
				0, 1, FlapDetectionEnabled.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostFlapDetectionOptionsEClass,
				HostFlapDetectionOptions.class, "HostFlapDetectionOptions",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostFlapDetectionOptions_Value(),
				theBasePackage.getHostStateValue(), "value", null, 0, 1,
				HostFlapDetectionOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHostFlapDetectionOptions_Token(),
				ecorePackage.getEString(), "token", "flap_detection_options",
				0, 1, HostFlapDetectionOptions.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPerfDataEClass, ProcessPerfData.class,
				"ProcessPerfData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessPerfData_Token(), ecorePackage.getEString(),
				"token", "process_perf_data", 0, 1, ProcessPerfData.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retainStatusInformationEClass,
				RetainStatusInformation.class, "RetainStatusInformation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetainStatusInformation_Token(),
				ecorePackage.getEString(), "token",
				"retain_status_information", 0, 1,
				RetainStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(retainNonstatusInformationEClass,
				RetainNonstatusInformation.class, "RetainNonstatusInformation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetainNonstatusInformation_Token(),
				ecorePackage.getEString(), "token",
				"retain_nonstatus_information", 0, 1,
				RetainNonstatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceFlapDetectionOptionsEClass,
				ServiceFlapDetectionOptions.class,
				"ServiceFlapDetectionOptions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceFlapDetectionOptions_Token(),
				ecorePackage.getEString(), "token", "flap_detection_options",
				0, 1, ServiceFlapDetectionOptions.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicegroupNameEClass, ServicegroupName.class,
				"ServicegroupName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServicegroupName_Token(), ecorePackage.getEString(),
				"token", "servicegroup_name", 0, 1, ServicegroupName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMembersEClass, ServiceMembers.class,
				"ServiceMembers", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceMembers_Reference(),
				this.getServiceDescription(), null, "reference", null, 0, -1,
				ServiceMembers.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMembers_Token(), ecorePackage.getEString(),
				"token", "members", 0, 1, ServiceMembers.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(servicegroupMembersEClass, ServicegroupMembers.class,
				"ServicegroupMembers", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicegroupMembers_Reference(),
				this.getServicegroupName(), null, "reference", null, 0, -1,
				ServicegroupMembers.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicegroupMembers_Token(),
				ecorePackage.getEString(), "token", "servicegroup_members", 0,
				1, ServicegroupMembers.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(servicegroupsEClass, Servicegroups.class, "Servicegroups",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicegroups_Reference(),
				this.getServicegroupName(), null, "reference", null, 0, -1,
				Servicegroups.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicegroups_Token(), ecorePackage.getEString(),
				"token", "servicegroups", 0, 1, Servicegroups.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependentHostNameEClass, DependentHostName.class,
				"DependentHostName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependentHostName_Reference(), this.getHostName(),
				null, "reference", null, 0, -1, DependentHostName.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDependentHostName_Token(), ecorePackage.getEString(),
				"token", "dependent_host_name", 0, 1, DependentHostName.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependentHostgroupNameEClass, DependentHostgroupName.class,
				"DependentHostgroupName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependentHostgroupName_Reference(),
				this.getHostgroupName(), null, "reference", null, 0, -1,
				DependentHostgroupName.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependentHostgroupName_Token(),
				ecorePackage.getEString(), "token", "dependent_hostgroup_name",
				0, 1, DependentHostgroupName.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependentServiceDescriptionEClass,
				DependentServiceDescription.class,
				"DependentServiceDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependentServiceDescription_Reference(),
				this.getServiceDescription(), null, "reference", null, 0, 1,
				DependentServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependentServiceDescription_Token(),
				ecorePackage.getEString(), "token",
				"dependent_service_description", 0, 1,
				DependentServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceDescriptionReferenceEClass,
				ServiceDescriptionReference.class,
				"ServiceDescriptionReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDescriptionReference_Reference(),
				this.getServiceDescription(), null, "reference", null, 1, -1,
				ServiceDescriptionReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptionReference_Token(),
				ecorePackage.getEString(), "token", "service_description", 0,
				1, ServiceDescriptionReference.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(inheritsParentEClass, InheritsParent.class,
				"InheritsParent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritsParent_Token(), ecorePackage.getEString(),
				"token", "inherits_parent", 0, 1, InheritsParent.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceExecutionFailureCriteriaEClass,
				ServiceExecutionFailureCriteria.class,
				"ServiceExecutionFailureCriteria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceExecutionFailureCriteria_Token(),
				ecorePackage.getEString(), "token",
				"execution_failure_criteria", 0, 1,
				ServiceExecutionFailureCriteria.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationFailureCriteriaEClass,
				NotificationFailureCriteria.class,
				"NotificationFailureCriteria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationFailureCriteria_Token(),
				ecorePackage.getEString(), "token",
				"notification_failure_criteria", 0, 1,
				NotificationFailureCriteria.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dependencyPeriodEClass, DependencyPeriod.class,
				"DependencyPeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyPeriod_Reference(),
				this.getTimeperiodName(), null, "reference", null, 1, 1,
				DependencyPeriod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyPeriod_Token(), ecorePackage.getEString(),
				"token", "dependency_period", 0, 1, DependencyPeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceStalkingOptionsEClass, ServiceStalkingOptions.class,
				"ServiceStalkingOptions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceStalkingOptions_Token(),
				ecorePackage.getEString(), "token", "stalking_options", 0, 1,
				ServiceStalkingOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(firstNotificationEClass, FirstNotification.class,
				"FirstNotification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirstNotification_Token(), ecorePackage.getEString(),
				"token", "first_notification", 0, 1, FirstNotification.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lastNotificationEClass, LastNotification.class,
				"LastNotification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLastNotification_Token(), ecorePackage.getEString(),
				"token", "last_notification", 0, 1, LastNotification.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(escalationPeriodEClass, EscalationPeriod.class,
				"EscalationPeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEscalationPeriod_Reference(),
				this.getTimeperiodName(), null, "reference", null, 0, 1,
				EscalationPeriod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEscalationPeriod_Token(), ecorePackage.getEString(),
				"token", "escalation_period", 0, 1, EscalationPeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEscalationOptionsEClass,
				ServiceEscalationOptions.class, "ServiceEscalationOptions",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceEscalationOptions_Token(),
				ecorePackage.getEString(), "token", "escalation_options", 0, 1,
				ServiceEscalationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hostExecutionFailureCriteriaEClass,
				HostExecutionFailureCriteria.class,
				"HostExecutionFailureCriteria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostExecutionFailureCriteria_Token(),
				ecorePackage.getEString(), "token",
				"execution_failure_criteria", 0, 1,
				HostExecutionFailureCriteria.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceNotificationFailureCriteriaEClass,
				ServiceNotificationFailureCriteria.class,
				"ServiceNotificationFailureCriteria", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceNotificationFailureCriteria_Token(),
				ecorePackage.getEString(), "token",
				"notification_failure_criteria", 0, 1,
				ServiceNotificationFailureCriteria.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostNotificationFailureCriteriaEClass,
				HostNotificationFailureCriteria.class,
				"HostNotificationFailureCriteria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostNotificationFailureCriteria_Token(),
				ecorePackage.getEString(), "token",
				"notification_failure_criteria", 0, 1,
				HostNotificationFailureCriteria.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostEscalationOptionsEClass, HostEscalationOptions.class,
				"HostEscalationOptions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostEscalationOptions_Token(),
				ecorePackage.getEString(), "token", "escalation_options", 0, 1,
				HostEscalationOptions.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(canSubmitCommandsEClass, CanSubmitCommands.class,
				"CanSubmitCommands", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanSubmitCommands_Token(), ecorePackage.getEString(),
				"token", "can_submit_commands", 0, 1, CanSubmitCommands.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AttributesPackageImpl
