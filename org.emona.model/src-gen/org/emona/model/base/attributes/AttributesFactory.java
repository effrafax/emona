/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.AttributesPackage
 * @generated
 */
public interface AttributesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributesFactory eINSTANCE = org.emona.model.base.attributes.impl.AttributesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias</em>'.
	 * @generated
	 */
	Alias createAlias();

	/**
	 * Returns a new object of class '<em>Host Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Initial State</em>'.
	 * @generated
	 */
	HostInitialState createHostInitialState();

	/**
	 * Returns a new object of class '<em>Hostgroups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostgroups</em>'.
	 * @generated
	 */
	Hostgroups createHostgroups();

	/**
	 * Returns a new object of class '<em>Parents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parents</em>'.
	 * @generated
	 */
	Parents createParents();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Display Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Name</em>'.
	 * @generated
	 */
	DisplayName createDisplayName();

	/**
	 * Returns a new object of class '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register</em>'.
	 * @generated
	 */
	Register createRegister();

	/**
	 * Returns a new object of class '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use</em>'.
	 * @generated
	 */
	Use createUse();

	/**
	 * Returns a new object of class '<em>Timeperiod Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeperiod Name</em>'.
	 * @generated
	 */
	TimeperiodName createTimeperiodName();

	/**
	 * Returns a new object of class '<em>Hostgroup Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostgroup Name</em>'.
	 * @generated
	 */
	HostgroupName createHostgroupName();

	/**
	 * Returns a new object of class '<em>Host Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Name</em>'.
	 * @generated
	 */
	HostName createHostName();

	/**
	 * Returns a new object of class '<em>Template Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Name</em>'.
	 * @generated
	 */
	TemplateName createTemplateName();

	/**
	 * Returns a new object of class '<em>Command Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Line</em>'.
	 * @generated
	 */
	CommandLine createCommandLine();

	/**
	 * Returns a new object of class '<em>Command Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Name</em>'.
	 * @generated
	 */
	CommandName createCommandName();

	/**
	 * Returns a new object of class '<em>Max Check Attempts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Check Attempts</em>'.
	 * @generated
	 */
	MaxCheckAttempts createMaxCheckAttempts();

	/**
	 * Returns a new object of class '<em>Check Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Interval</em>'.
	 * @generated
	 */
	CheckInterval createCheckInterval();

	/**
	 * Returns a new object of class '<em>Retry Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retry Interval</em>'.
	 * @generated
	 */
	RetryInterval createRetryInterval();

	/**
	 * Returns a new object of class '<em>Active Checks Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Checks Enabled</em>'.
	 * @generated
	 */
	ActiveChecksEnabled createActiveChecksEnabled();

	/**
	 * Returns a new object of class '<em>Passive Checks Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Checks Enabled</em>'.
	 * @generated
	 */
	PassiveChecksEnabled createPassiveChecksEnabled();

	/**
	 * Returns a new object of class '<em>Check Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Period</em>'.
	 * @generated
	 */
	CheckPeriod createCheckPeriod();

	/**
	 * Returns a new object of class '<em>Check Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Command</em>'.
	 * @generated
	 */
	CheckCommand createCheckCommand();

	/**
	 * Returns a new object of class '<em>Time Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Exclude</em>'.
	 * @generated
	 */
	TimeExclude createTimeExclude();

	/**
	 * Returns a new object of class '<em>Contact Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Name</em>'.
	 * @generated
	 */
	ContactName createContactName();

	/**
	 * Returns a new object of class '<em>Notifications Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notifications Enabled</em>'.
	 * @generated
	 */
	NotificationsEnabled createNotificationsEnabled();

	/**
	 * Returns a new object of class '<em>Host Notifications Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Notifications Enabled</em>'.
	 * @generated
	 */
	HostNotificationsEnabled createHostNotificationsEnabled();

	/**
	 * Returns a new object of class '<em>Service Notifications Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Notifications Enabled</em>'.
	 * @generated
	 */
	ServiceNotificationsEnabled createServiceNotificationsEnabled();

	/**
	 * Returns a new object of class '<em>Notification Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Period</em>'.
	 * @generated
	 */
	NotificationPeriod createNotificationPeriod();

	/**
	 * Returns a new object of class '<em>Host Notification Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Notification Period</em>'.
	 * @generated
	 */
	HostNotificationPeriod createHostNotificationPeriod();

	/**
	 * Returns a new object of class '<em>Service Notification Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Notification Period</em>'.
	 * @generated
	 */
	ServiceNotificationPeriod createServiceNotificationPeriod();

	/**
	 * Returns a new object of class '<em>Host Notification Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Notification Options</em>'.
	 * @generated
	 */
	HostNotificationOptions createHostNotificationOptions();

	/**
	 * Returns a new object of class '<em>Service Notification Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Notification Options</em>'.
	 * @generated
	 */
	ServiceNotificationOptions createServiceNotificationOptions();

	/**
	 * Returns a new object of class '<em>Notification Commands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Commands</em>'.
	 * @generated
	 */
	NotificationCommands createNotificationCommands();

	/**
	 * Returns a new object of class '<em>Host Notification Commands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Notification Commands</em>'.
	 * @generated
	 */
	HostNotificationCommands createHostNotificationCommands();

	/**
	 * Returns a new object of class '<em>Service Notification Commands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Notification Commands</em>'.
	 * @generated
	 */
	ServiceNotificationCommands createServiceNotificationCommands();

	/**
	 * Returns a new object of class '<em>Contact Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Address</em>'.
	 * @generated
	 */
	ContactAddress createContactAddress();

	/**
	 * Returns a new object of class '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email</em>'.
	 * @generated
	 */
	Email createEmail();

	/**
	 * Returns a new object of class '<em>Pager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pager</em>'.
	 * @generated
	 */
	Pager createPager();

	/**
	 * Returns a new object of class '<em>Contact Members</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Members</em>'.
	 * @generated
	 */
	ContactMembers createContactMembers();

	/**
	 * Returns a new object of class '<em>Contact Group Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Group Name</em>'.
	 * @generated
	 */
	ContactGroupName createContactGroupName();

	/**
	 * Returns a new object of class '<em>Contacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contacts</em>'.
	 * @generated
	 */
	Contacts createContacts();

	/**
	 * Returns a new object of class '<em>Contact Groups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Groups</em>'.
	 * @generated
	 */
	ContactGroups createContactGroups();

	/**
	 * Returns a new object of class '<em>Notification Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Interval</em>'.
	 * @generated
	 */
	NotificationInterval createNotificationInterval();

	/**
	 * Returns a new object of class '<em>First Notification Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Notification Delay</em>'.
	 * @generated
	 */
	FirstNotificationDelay createFirstNotificationDelay();

	/**
	 * Returns a new object of class '<em>Host Stalking Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Stalking Options</em>'.
	 * @generated
	 */
	HostStalkingOptions createHostStalkingOptions();

	/**
	 * Returns a new object of class '<em>Notes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notes</em>'.
	 * @generated
	 */
	Notes createNotes();

	/**
	 * Returns a new object of class '<em>Notes Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notes Url</em>'.
	 * @generated
	 */
	NotesUrl createNotesUrl();

	/**
	 * Returns a new object of class '<em>Action Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Url</em>'.
	 * @generated
	 */
	ActionUrl createActionUrl();

	/**
	 * Returns a new object of class '<em>Icon Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon Image</em>'.
	 * @generated
	 */
	IconImage createIconImage();

	/**
	 * Returns a new object of class '<em>Icon Image Alt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon Image Alt</em>'.
	 * @generated
	 */
	IconImageAlt createIconImageAlt();

	/**
	 * Returns a new object of class '<em>Vrml Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vrml Image</em>'.
	 * @generated
	 */
	VrmlImage createVrmlImage();

	/**
	 * Returns a new object of class '<em>Statusmap Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statusmap Image</em>'.
	 * @generated
	 */
	StatusmapImage createStatusmapImage();

	/**
	 * Returns a new object of class '<em>Two DCoords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two DCoords</em>'.
	 * @generated
	 */
	TwoDCoords createTwoDCoords();

	/**
	 * Returns a new object of class '<em>Three DCoords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Three DCoords</em>'.
	 * @generated
	 */
	ThreeDCoords createThreeDCoords();

	/**
	 * Returns a new object of class '<em>Hostgroup Members</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostgroup Members</em>'.
	 * @generated
	 */
	HostgroupMembers createHostgroupMembers();

	/**
	 * Returns a new object of class '<em>Host Members</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Members</em>'.
	 * @generated
	 */
	HostMembers createHostMembers();

	/**
	 * Returns a new object of class '<em>Host Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Name Reference</em>'.
	 * @generated
	 */
	HostNameReference createHostNameReference();

	/**
	 * Returns a new object of class '<em>Hostgroup Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostgroup Name Reference</em>'.
	 * @generated
	 */
	HostgroupNameReference createHostgroupNameReference();

	/**
	 * Returns a new object of class '<em>Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Description</em>'.
	 * @generated
	 */
	ServiceDescription createServiceDescription();

	/**
	 * Returns a new object of class '<em>Service Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Initial State</em>'.
	 * @generated
	 */
	ServiceInitialState createServiceInitialState();

	/**
	 * Returns a new object of class '<em>Is Volatile Flag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Volatile Flag</em>'.
	 * @generated
	 */
	IsVolatileFlag createIsVolatileFlag();

	/**
	 * Returns a new object of class '<em>Obsess Over Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obsess Over Host</em>'.
	 * @generated
	 */
	ObsessOverHost createObsessOverHost();

	/**
	 * Returns a new object of class '<em>Obsess Over Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obsess Over Service</em>'.
	 * @generated
	 */
	ObsessOverService createObsessOverService();

	/**
	 * Returns a new object of class '<em>Check Freshness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Freshness</em>'.
	 * @generated
	 */
	CheckFreshness createCheckFreshness();

	/**
	 * Returns a new object of class '<em>Freshness Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Freshness Threshold</em>'.
	 * @generated
	 */
	FreshnessThreshold createFreshnessThreshold();

	/**
	 * Returns a new object of class '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Handler</em>'.
	 * @generated
	 */
	EventHandler createEventHandler();

	/**
	 * Returns a new object of class '<em>Event Handler Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Handler Enabled</em>'.
	 * @generated
	 */
	EventHandlerEnabled createEventHandlerEnabled();

	/**
	 * Returns a new object of class '<em>Low Flap Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Low Flap Threshold</em>'.
	 * @generated
	 */
	LowFlapThreshold createLowFlapThreshold();

	/**
	 * Returns a new object of class '<em>High Flap Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>High Flap Threshold</em>'.
	 * @generated
	 */
	HighFlapThreshold createHighFlapThreshold();

	/**
	 * Returns a new object of class '<em>Flap Detection Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flap Detection Enabled</em>'.
	 * @generated
	 */
	FlapDetectionEnabled createFlapDetectionEnabled();

	/**
	 * Returns a new object of class '<em>Host Flap Detection Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Flap Detection Options</em>'.
	 * @generated
	 */
	HostFlapDetectionOptions createHostFlapDetectionOptions();

	/**
	 * Returns a new object of class '<em>Process Perf Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Perf Data</em>'.
	 * @generated
	 */
	ProcessPerfData createProcessPerfData();

	/**
	 * Returns a new object of class '<em>Retain Status Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retain Status Information</em>'.
	 * @generated
	 */
	RetainStatusInformation createRetainStatusInformation();

	/**
	 * Returns a new object of class '<em>Retain Nonstatus Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retain Nonstatus Information</em>'.
	 * @generated
	 */
	RetainNonstatusInformation createRetainNonstatusInformation();

	/**
	 * Returns a new object of class '<em>Service Flap Detection Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Flap Detection Options</em>'.
	 * @generated
	 */
	ServiceFlapDetectionOptions createServiceFlapDetectionOptions();

	/**
	 * Returns a new object of class '<em>Servicegroup Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicegroup Name</em>'.
	 * @generated
	 */
	ServicegroupName createServicegroupName();

	/**
	 * Returns a new object of class '<em>Service Members</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Members</em>'.
	 * @generated
	 */
	ServiceMembers createServiceMembers();

	/**
	 * Returns a new object of class '<em>Servicegroup Members</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicegroup Members</em>'.
	 * @generated
	 */
	ServicegroupMembers createServicegroupMembers();

	/**
	 * Returns a new object of class '<em>Servicegroups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicegroups</em>'.
	 * @generated
	 */
	Servicegroups createServicegroups();

	/**
	 * Returns a new object of class '<em>Dependent Host Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent Host Name</em>'.
	 * @generated
	 */
	DependentHostName createDependentHostName();

	/**
	 * Returns a new object of class '<em>Dependent Hostgroup Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent Hostgroup Name</em>'.
	 * @generated
	 */
	DependentHostgroupName createDependentHostgroupName();

	/**
	 * Returns a new object of class '<em>Dependent Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent Service Description</em>'.
	 * @generated
	 */
	DependentServiceDescription createDependentServiceDescription();

	/**
	 * Returns a new object of class '<em>Service Description Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Description Reference</em>'.
	 * @generated
	 */
	ServiceDescriptionReference createServiceDescriptionReference();

	/**
	 * Returns a new object of class '<em>Inherits Parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherits Parent</em>'.
	 * @generated
	 */
	InheritsParent createInheritsParent();

	/**
	 * Returns a new object of class '<em>Service Execution Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Execution Failure Criteria</em>'.
	 * @generated
	 */
	ServiceExecutionFailureCriteria createServiceExecutionFailureCriteria();

	/**
	 * Returns a new object of class '<em>Notification Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Failure Criteria</em>'.
	 * @generated
	 */
	NotificationFailureCriteria createNotificationFailureCriteria();

	/**
	 * Returns a new object of class '<em>Dependency Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Period</em>'.
	 * @generated
	 */
	DependencyPeriod createDependencyPeriod();

	/**
	 * Returns a new object of class '<em>Service Stalking Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Stalking Options</em>'.
	 * @generated
	 */
	ServiceStalkingOptions createServiceStalkingOptions();

	/**
	 * Returns a new object of class '<em>First Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Notification</em>'.
	 * @generated
	 */
	FirstNotification createFirstNotification();

	/**
	 * Returns a new object of class '<em>Last Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Last Notification</em>'.
	 * @generated
	 */
	LastNotification createLastNotification();

	/**
	 * Returns a new object of class '<em>Escalation Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escalation Period</em>'.
	 * @generated
	 */
	EscalationPeriod createEscalationPeriod();

	/**
	 * Returns a new object of class '<em>Service Escalation Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Escalation Options</em>'.
	 * @generated
	 */
	ServiceEscalationOptions createServiceEscalationOptions();

	/**
	 * Returns a new object of class '<em>Host Execution Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Execution Failure Criteria</em>'.
	 * @generated
	 */
	HostExecutionFailureCriteria createHostExecutionFailureCriteria();

	/**
	 * Returns a new object of class '<em>Service Notification Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Notification Failure Criteria</em>'.
	 * @generated
	 */
	ServiceNotificationFailureCriteria createServiceNotificationFailureCriteria();

	/**
	 * Returns a new object of class '<em>Host Notification Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Notification Failure Criteria</em>'.
	 * @generated
	 */
	HostNotificationFailureCriteria createHostNotificationFailureCriteria();

	/**
	 * Returns a new object of class '<em>Host Escalation Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Escalation Options</em>'.
	 * @generated
	 */
	HostEscalationOptions createHostEscalationOptions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttributesPackage getAttributesPackage();

} //AttributesFactory
