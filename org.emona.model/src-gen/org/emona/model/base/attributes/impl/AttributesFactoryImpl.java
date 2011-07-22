/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emona.model.base.attributes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributesFactoryImpl extends EFactoryImpl implements
		AttributesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributesFactory init() {
		try {
			AttributesFactory theAttributesFactory = (AttributesFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.emona.org/model/base/attributes");
			if (theAttributesFactory != null) {
				return theAttributesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttributesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesFactoryImpl() {
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
		case AttributesPackage.ALIAS:
			return createAlias();
		case AttributesPackage.HOST_INITIAL_STATE:
			return createHostInitialState();
		case AttributesPackage.HOSTGROUPS:
			return createHostgroups();
		case AttributesPackage.PARENTS:
			return createParents();
		case AttributesPackage.ADDRESS:
			return createAddress();
		case AttributesPackage.DISPLAY_NAME:
			return createDisplayName();
		case AttributesPackage.REGISTER:
			return createRegister();
		case AttributesPackage.USE:
			return createUse();
		case AttributesPackage.TIMEPERIOD_NAME:
			return createTimeperiodName();
		case AttributesPackage.HOSTGROUP_NAME:
			return createHostgroupName();
		case AttributesPackage.HOST_NAME:
			return createHostName();
		case AttributesPackage.TEMPLATE_NAME:
			return createTemplateName();
		case AttributesPackage.COMMAND_LINE:
			return createCommandLine();
		case AttributesPackage.COMMAND_NAME:
			return createCommandName();
		case AttributesPackage.MAX_CHECK_ATTEMPTS:
			return createMaxCheckAttempts();
		case AttributesPackage.CHECK_INTERVAL:
			return createCheckInterval();
		case AttributesPackage.RETRY_INTERVAL:
			return createRetryInterval();
		case AttributesPackage.ACTIVE_CHECKS_ENABLED:
			return createActiveChecksEnabled();
		case AttributesPackage.PASSIVE_CHECKS_ENABLED:
			return createPassiveChecksEnabled();
		case AttributesPackage.CHECK_PERIOD:
			return createCheckPeriod();
		case AttributesPackage.CHECK_COMMAND:
			return createCheckCommand();
		case AttributesPackage.TIME_EXCLUDE:
			return createTimeExclude();
		case AttributesPackage.CONTACT_NAME:
			return createContactName();
		case AttributesPackage.NOTIFICATIONS_ENABLED:
			return createNotificationsEnabled();
		case AttributesPackage.HOST_NOTIFICATIONS_ENABLED:
			return createHostNotificationsEnabled();
		case AttributesPackage.SERVICE_NOTIFICATIONS_ENABLED:
			return createServiceNotificationsEnabled();
		case AttributesPackage.NOTIFICATION_PERIOD:
			return createNotificationPeriod();
		case AttributesPackage.HOST_NOTIFICATION_PERIOD:
			return createHostNotificationPeriod();
		case AttributesPackage.SERVICE_NOTIFICATION_PERIOD:
			return createServiceNotificationPeriod();
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS:
			return createHostNotificationOptions();
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS:
			return createServiceNotificationOptions();
		case AttributesPackage.NOTIFICATION_COMMANDS:
			return createNotificationCommands();
		case AttributesPackage.HOST_NOTIFICATION_COMMANDS:
			return createHostNotificationCommands();
		case AttributesPackage.SERVICE_NOTIFICATION_COMMANDS:
			return createServiceNotificationCommands();
		case AttributesPackage.CONTACT_ADDRESS:
			return createContactAddress();
		case AttributesPackage.EMAIL:
			return createEmail();
		case AttributesPackage.PAGER:
			return createPager();
		case AttributesPackage.CONTACT_MEMBERS:
			return createContactMembers();
		case AttributesPackage.CONTACT_GROUP_NAME:
			return createContactGroupName();
		case AttributesPackage.CONTACTS:
			return createContacts();
		case AttributesPackage.CONTACT_GROUPS:
			return createContactGroups();
		case AttributesPackage.NOTIFICATION_INTERVAL:
			return createNotificationInterval();
		case AttributesPackage.FIRST_NOTIFICATION_DELAY:
			return createFirstNotificationDelay();
		case AttributesPackage.HOST_STALKING_OPTIONS:
			return createHostStalkingOptions();
		case AttributesPackage.NOTES:
			return createNotes();
		case AttributesPackage.NOTES_URL:
			return createNotesUrl();
		case AttributesPackage.ACTION_URL:
			return createActionUrl();
		case AttributesPackage.ICON_IMAGE:
			return createIconImage();
		case AttributesPackage.ICON_IMAGE_ALT:
			return createIconImageAlt();
		case AttributesPackage.VRML_IMAGE:
			return createVrmlImage();
		case AttributesPackage.STATUSMAP_IMAGE:
			return createStatusmapImage();
		case AttributesPackage.TWO_DCOORDS:
			return createTwoDCoords();
		case AttributesPackage.THREE_DCOORDS:
			return createThreeDCoords();
		case AttributesPackage.HOSTGROUP_MEMBERS:
			return createHostgroupMembers();
		case AttributesPackage.HOST_MEMBERS:
			return createHostMembers();
		case AttributesPackage.HOST_NAME_REFERENCE:
			return createHostNameReference();
		case AttributesPackage.HOSTGROUP_NAME_REFERENCE:
			return createHostgroupNameReference();
		case AttributesPackage.SERVICE_DESCRIPTION:
			return createServiceDescription();
		case AttributesPackage.SERVICE_INITIAL_STATE:
			return createServiceInitialState();
		case AttributesPackage.IS_VOLATILE_FLAG:
			return createIsVolatileFlag();
		case AttributesPackage.OBSESS_OVER_HOST:
			return createObsessOverHost();
		case AttributesPackage.OBSESS_OVER_SERVICE:
			return createObsessOverService();
		case AttributesPackage.CHECK_FRESHNESS:
			return createCheckFreshness();
		case AttributesPackage.FRESHNESS_THRESHOLD:
			return createFreshnessThreshold();
		case AttributesPackage.EVENT_HANDLER:
			return createEventHandler();
		case AttributesPackage.EVENT_HANDLER_ENABLED:
			return createEventHandlerEnabled();
		case AttributesPackage.LOW_FLAP_THRESHOLD:
			return createLowFlapThreshold();
		case AttributesPackage.HIGH_FLAP_THRESHOLD:
			return createHighFlapThreshold();
		case AttributesPackage.FLAP_DETECTION_ENABLED:
			return createFlapDetectionEnabled();
		case AttributesPackage.HOST_FLAP_DETECTION_OPTIONS:
			return createHostFlapDetectionOptions();
		case AttributesPackage.PROCESS_PERF_DATA:
			return createProcessPerfData();
		case AttributesPackage.RETAIN_STATUS_INFORMATION:
			return createRetainStatusInformation();
		case AttributesPackage.RETAIN_NONSTATUS_INFORMATION:
			return createRetainNonstatusInformation();
		case AttributesPackage.SERVICE_FLAP_DETECTION_OPTIONS:
			return createServiceFlapDetectionOptions();
		case AttributesPackage.SERVICEGROUP_NAME:
			return createServicegroupName();
		case AttributesPackage.SERVICE_MEMBERS:
			return createServiceMembers();
		case AttributesPackage.SERVICEGROUP_MEMBERS:
			return createServicegroupMembers();
		case AttributesPackage.SERVICEGROUPS:
			return createServicegroups();
		case AttributesPackage.DEPENDENT_HOST_NAME:
			return createDependentHostName();
		case AttributesPackage.DEPENDENT_HOSTGROUP_NAME:
			return createDependentHostgroupName();
		case AttributesPackage.DEPENDENT_SERVICE_DESCRIPTION:
			return createDependentServiceDescription();
		case AttributesPackage.SERVICE_DESCRIPTION_REFERENCE:
			return createServiceDescriptionReference();
		case AttributesPackage.INHERITS_PARENT:
			return createInheritsParent();
		case AttributesPackage.SERVICE_EXECUTION_FAILURE_CRITERIA:
			return createServiceExecutionFailureCriteria();
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA:
			return createNotificationFailureCriteria();
		case AttributesPackage.DEPENDENCY_PERIOD:
			return createDependencyPeriod();
		case AttributesPackage.SERVICE_STALKING_OPTIONS:
			return createServiceStalkingOptions();
		case AttributesPackage.FIRST_NOTIFICATION:
			return createFirstNotification();
		case AttributesPackage.LAST_NOTIFICATION:
			return createLastNotification();
		case AttributesPackage.ESCALATION_PERIOD:
			return createEscalationPeriod();
		case AttributesPackage.SERVICE_ESCALATION_OPTIONS:
			return createServiceEscalationOptions();
		case AttributesPackage.HOST_EXECUTION_FAILURE_CRITERIA:
			return createHostExecutionFailureCriteria();
		case AttributesPackage.SERVICE_NOTIFICATION_FAILURE_CRITERIA:
			return createServiceNotificationFailureCriteria();
		case AttributesPackage.HOST_NOTIFICATION_FAILURE_CRITERIA:
			return createHostNotificationFailureCriteria();
		case AttributesPackage.HOST_ESCALATION_OPTIONS:
			return createHostEscalationOptions();
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
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostInitialState createHostInitialState() {
		HostInitialStateImpl hostInitialState = new HostInitialStateImpl();
		return hostInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostgroups createHostgroups() {
		HostgroupsImpl hostgroups = new HostgroupsImpl();
		return hostgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parents createParents() {
		ParentsImpl parents = new ParentsImpl();
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayName createDisplayName() {
		DisplayNameImpl displayName = new DisplayNameImpl();
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		RegisterImpl register = new RegisterImpl();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeperiodName createTimeperiodName() {
		TimeperiodNameImpl timeperiodName = new TimeperiodNameImpl();
		return timeperiodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostgroupName createHostgroupName() {
		HostgroupNameImpl hostgroupName = new HostgroupNameImpl();
		return hostgroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostName createHostName() {
		HostNameImpl hostName = new HostNameImpl();
		return hostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateName createTemplateName() {
		TemplateNameImpl templateName = new TemplateNameImpl();
		return templateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLine createCommandLine() {
		CommandLineImpl commandLine = new CommandLineImpl();
		return commandLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandName createCommandName() {
		CommandNameImpl commandName = new CommandNameImpl();
		return commandName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxCheckAttempts createMaxCheckAttempts() {
		MaxCheckAttemptsImpl maxCheckAttempts = new MaxCheckAttemptsImpl();
		return maxCheckAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckInterval createCheckInterval() {
		CheckIntervalImpl checkInterval = new CheckIntervalImpl();
		return checkInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryInterval createRetryInterval() {
		RetryIntervalImpl retryInterval = new RetryIntervalImpl();
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveChecksEnabled createActiveChecksEnabled() {
		ActiveChecksEnabledImpl activeChecksEnabled = new ActiveChecksEnabledImpl();
		return activeChecksEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveChecksEnabled createPassiveChecksEnabled() {
		PassiveChecksEnabledImpl passiveChecksEnabled = new PassiveChecksEnabledImpl();
		return passiveChecksEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckPeriod createCheckPeriod() {
		CheckPeriodImpl checkPeriod = new CheckPeriodImpl();
		return checkPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckCommand createCheckCommand() {
		CheckCommandImpl checkCommand = new CheckCommandImpl();
		return checkCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExclude createTimeExclude() {
		TimeExcludeImpl timeExclude = new TimeExcludeImpl();
		return timeExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactName createContactName() {
		ContactNameImpl contactName = new ContactNameImpl();
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationsEnabled createNotificationsEnabled() {
		NotificationsEnabledImpl notificationsEnabled = new NotificationsEnabledImpl();
		return notificationsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNotificationsEnabled createHostNotificationsEnabled() {
		HostNotificationsEnabledImpl hostNotificationsEnabled = new HostNotificationsEnabledImpl();
		return hostNotificationsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNotificationsEnabled createServiceNotificationsEnabled() {
		ServiceNotificationsEnabledImpl serviceNotificationsEnabled = new ServiceNotificationsEnabledImpl();
		return serviceNotificationsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationPeriod createNotificationPeriod() {
		NotificationPeriodImpl notificationPeriod = new NotificationPeriodImpl();
		return notificationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNotificationPeriod createHostNotificationPeriod() {
		HostNotificationPeriodImpl hostNotificationPeriod = new HostNotificationPeriodImpl();
		return hostNotificationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNotificationPeriod createServiceNotificationPeriod() {
		ServiceNotificationPeriodImpl serviceNotificationPeriod = new ServiceNotificationPeriodImpl();
		return serviceNotificationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNotificationOptions createHostNotificationOptions() {
		HostNotificationOptionsImpl hostNotificationOptions = new HostNotificationOptionsImpl();
		return hostNotificationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNotificationOptions createServiceNotificationOptions() {
		ServiceNotificationOptionsImpl serviceNotificationOptions = new ServiceNotificationOptionsImpl();
		return serviceNotificationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationCommands createNotificationCommands() {
		NotificationCommandsImpl notificationCommands = new NotificationCommandsImpl();
		return notificationCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNotificationCommands createHostNotificationCommands() {
		HostNotificationCommandsImpl hostNotificationCommands = new HostNotificationCommandsImpl();
		return hostNotificationCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNotificationCommands createServiceNotificationCommands() {
		ServiceNotificationCommandsImpl serviceNotificationCommands = new ServiceNotificationCommandsImpl();
		return serviceNotificationCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactAddress createContactAddress() {
		ContactAddressImpl contactAddress = new ContactAddressImpl();
		return contactAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Email createEmail() {
		EmailImpl email = new EmailImpl();
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pager createPager() {
		PagerImpl pager = new PagerImpl();
		return pager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMembers createContactMembers() {
		ContactMembersImpl contactMembers = new ContactMembersImpl();
		return contactMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactGroupName createContactGroupName() {
		ContactGroupNameImpl contactGroupName = new ContactGroupNameImpl();
		return contactGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contacts createContacts() {
		ContactsImpl contacts = new ContactsImpl();
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactGroups createContactGroups() {
		ContactGroupsImpl contactGroups = new ContactGroupsImpl();
		return contactGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationInterval createNotificationInterval() {
		NotificationIntervalImpl notificationInterval = new NotificationIntervalImpl();
		return notificationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstNotificationDelay createFirstNotificationDelay() {
		FirstNotificationDelayImpl firstNotificationDelay = new FirstNotificationDelayImpl();
		return firstNotificationDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostStalkingOptions createHostStalkingOptions() {
		HostStalkingOptionsImpl hostStalkingOptions = new HostStalkingOptionsImpl();
		return hostStalkingOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notes createNotes() {
		NotesImpl notes = new NotesImpl();
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesUrl createNotesUrl() {
		NotesUrlImpl notesUrl = new NotesUrlImpl();
		return notesUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUrl createActionUrl() {
		ActionUrlImpl actionUrl = new ActionUrlImpl();
		return actionUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconImage createIconImage() {
		IconImageImpl iconImage = new IconImageImpl();
		return iconImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconImageAlt createIconImageAlt() {
		IconImageAltImpl iconImageAlt = new IconImageAltImpl();
		return iconImageAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VrmlImage createVrmlImage() {
		VrmlImageImpl vrmlImage = new VrmlImageImpl();
		return vrmlImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusmapImage createStatusmapImage() {
		StatusmapImageImpl statusmapImage = new StatusmapImageImpl();
		return statusmapImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoDCoords createTwoDCoords() {
		TwoDCoordsImpl twoDCoords = new TwoDCoordsImpl();
		return twoDCoords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeDCoords createThreeDCoords() {
		ThreeDCoordsImpl threeDCoords = new ThreeDCoordsImpl();
		return threeDCoords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostgroupMembers createHostgroupMembers() {
		HostgroupMembersImpl hostgroupMembers = new HostgroupMembersImpl();
		return hostgroupMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostMembers createHostMembers() {
		HostMembersImpl hostMembers = new HostMembersImpl();
		return hostMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNameReference createHostNameReference() {
		HostNameReferenceImpl hostNameReference = new HostNameReferenceImpl();
		return hostNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostgroupNameReference createHostgroupNameReference() {
		HostgroupNameReferenceImpl hostgroupNameReference = new HostgroupNameReferenceImpl();
		return hostgroupNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescription createServiceDescription() {
		ServiceDescriptionImpl serviceDescription = new ServiceDescriptionImpl();
		return serviceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInitialState createServiceInitialState() {
		ServiceInitialStateImpl serviceInitialState = new ServiceInitialStateImpl();
		return serviceInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsVolatileFlag createIsVolatileFlag() {
		IsVolatileFlagImpl isVolatileFlag = new IsVolatileFlagImpl();
		return isVolatileFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObsessOverHost createObsessOverHost() {
		ObsessOverHostImpl obsessOverHost = new ObsessOverHostImpl();
		return obsessOverHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObsessOverService createObsessOverService() {
		ObsessOverServiceImpl obsessOverService = new ObsessOverServiceImpl();
		return obsessOverService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckFreshness createCheckFreshness() {
		CheckFreshnessImpl checkFreshness = new CheckFreshnessImpl();
		return checkFreshness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreshnessThreshold createFreshnessThreshold() {
		FreshnessThresholdImpl freshnessThreshold = new FreshnessThresholdImpl();
		return freshnessThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandler createEventHandler() {
		EventHandlerImpl eventHandler = new EventHandlerImpl();
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlerEnabled createEventHandlerEnabled() {
		EventHandlerEnabledImpl eventHandlerEnabled = new EventHandlerEnabledImpl();
		return eventHandlerEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowFlapThreshold createLowFlapThreshold() {
		LowFlapThresholdImpl lowFlapThreshold = new LowFlapThresholdImpl();
		return lowFlapThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighFlapThreshold createHighFlapThreshold() {
		HighFlapThresholdImpl highFlapThreshold = new HighFlapThresholdImpl();
		return highFlapThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlapDetectionEnabled createFlapDetectionEnabled() {
		FlapDetectionEnabledImpl flapDetectionEnabled = new FlapDetectionEnabledImpl();
		return flapDetectionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostFlapDetectionOptions createHostFlapDetectionOptions() {
		HostFlapDetectionOptionsImpl hostFlapDetectionOptions = new HostFlapDetectionOptionsImpl();
		return hostFlapDetectionOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPerfData createProcessPerfData() {
		ProcessPerfDataImpl processPerfData = new ProcessPerfDataImpl();
		return processPerfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetainStatusInformation createRetainStatusInformation() {
		RetainStatusInformationImpl retainStatusInformation = new RetainStatusInformationImpl();
		return retainStatusInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetainNonstatusInformation createRetainNonstatusInformation() {
		RetainNonstatusInformationImpl retainNonstatusInformation = new RetainNonstatusInformationImpl();
		return retainNonstatusInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFlapDetectionOptions createServiceFlapDetectionOptions() {
		ServiceFlapDetectionOptionsImpl serviceFlapDetectionOptions = new ServiceFlapDetectionOptionsImpl();
		return serviceFlapDetectionOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicegroupName createServicegroupName() {
		ServicegroupNameImpl servicegroupName = new ServicegroupNameImpl();
		return servicegroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMembers createServiceMembers() {
		ServiceMembersImpl serviceMembers = new ServiceMembersImpl();
		return serviceMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicegroupMembers createServicegroupMembers() {
		ServicegroupMembersImpl servicegroupMembers = new ServicegroupMembersImpl();
		return servicegroupMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicegroups createServicegroups() {
		ServicegroupsImpl servicegroups = new ServicegroupsImpl();
		return servicegroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentHostName createDependentHostName() {
		DependentHostNameImpl dependentHostName = new DependentHostNameImpl();
		return dependentHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentHostgroupName createDependentHostgroupName() {
		DependentHostgroupNameImpl dependentHostgroupName = new DependentHostgroupNameImpl();
		return dependentHostgroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentServiceDescription createDependentServiceDescription() {
		DependentServiceDescriptionImpl dependentServiceDescription = new DependentServiceDescriptionImpl();
		return dependentServiceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptionReference createServiceDescriptionReference() {
		ServiceDescriptionReferenceImpl serviceDescriptionReference = new ServiceDescriptionReferenceImpl();
		return serviceDescriptionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritsParent createInheritsParent() {
		InheritsParentImpl inheritsParent = new InheritsParentImpl();
		return inheritsParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceExecutionFailureCriteria createServiceExecutionFailureCriteria() {
		ServiceExecutionFailureCriteriaImpl serviceExecutionFailureCriteria = new ServiceExecutionFailureCriteriaImpl();
		return serviceExecutionFailureCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationFailureCriteria createNotificationFailureCriteria() {
		NotificationFailureCriteriaImpl notificationFailureCriteria = new NotificationFailureCriteriaImpl();
		return notificationFailureCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyPeriod createDependencyPeriod() {
		DependencyPeriodImpl dependencyPeriod = new DependencyPeriodImpl();
		return dependencyPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStalkingOptions createServiceStalkingOptions() {
		ServiceStalkingOptionsImpl serviceStalkingOptions = new ServiceStalkingOptionsImpl();
		return serviceStalkingOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstNotification createFirstNotification() {
		FirstNotificationImpl firstNotification = new FirstNotificationImpl();
		return firstNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastNotification createLastNotification() {
		LastNotificationImpl lastNotification = new LastNotificationImpl();
		return lastNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscalationPeriod createEscalationPeriod() {
		EscalationPeriodImpl escalationPeriod = new EscalationPeriodImpl();
		return escalationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEscalationOptions createServiceEscalationOptions() {
		ServiceEscalationOptionsImpl serviceEscalationOptions = new ServiceEscalationOptionsImpl();
		return serviceEscalationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostExecutionFailureCriteria createHostExecutionFailureCriteria() {
		HostExecutionFailureCriteriaImpl hostExecutionFailureCriteria = new HostExecutionFailureCriteriaImpl();
		return hostExecutionFailureCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNotificationFailureCriteria createServiceNotificationFailureCriteria() {
		ServiceNotificationFailureCriteriaImpl serviceNotificationFailureCriteria = new ServiceNotificationFailureCriteriaImpl();
		return serviceNotificationFailureCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNotificationFailureCriteria createHostNotificationFailureCriteria() {
		HostNotificationFailureCriteriaImpl hostNotificationFailureCriteria = new HostNotificationFailureCriteriaImpl();
		return hostNotificationFailureCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostEscalationOptions createHostEscalationOptions() {
		HostEscalationOptionsImpl hostEscalationOptions = new HostEscalationOptionsImpl();
		return hostEscalationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesPackage getAttributesPackage() {
		return (AttributesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttributesPackage getPackage() {
		return AttributesPackage.eINSTANCE;
	}

} //AttributesFactoryImpl
