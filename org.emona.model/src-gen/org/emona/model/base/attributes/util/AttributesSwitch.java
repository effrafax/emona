/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emona.model.base.Attribute;
import org.emona.model.base.BooleanAttribute;
import org.emona.model.base.HostFailureCriteria;
import org.emona.model.base.HostState;
import org.emona.model.base.IntegerValueAttribute;
import org.emona.model.base.NameAttribute;
import org.emona.model.base.ReferenceAttribute;
import org.emona.model.base.ServiceFailureCriteria;
import org.emona.model.base.ServiceNotificationOption;
import org.emona.model.base.ServiceState;
import org.emona.model.base.ValueAttribute;

import org.emona.model.base.attributes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.AttributesPackage
 * @generated
 */
public class AttributesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AttributesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesSwitch() {
		if (modelPackage == null) {
			modelPackage = AttributesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AttributesPackage.ALIAS: {
			Alias alias = (Alias) theEObject;
			T result = caseAlias(alias);
			if (result == null)
				result = caseValueAttribute(alias);
			if (result == null)
				result = caseAttribute(alias);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_INITIAL_STATE: {
			HostInitialState hostInitialState = (HostInitialState) theEObject;
			T result = caseHostInitialState(hostInitialState);
			if (result == null)
				result = caseAttribute(hostInitialState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOSTGROUPS: {
			Hostgroups hostgroups = (Hostgroups) theEObject;
			T result = caseHostgroups(hostgroups);
			if (result == null)
				result = caseReferenceAttribute(hostgroups);
			if (result == null)
				result = caseAttribute(hostgroups);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.PARENTS: {
			Parents parents = (Parents) theEObject;
			T result = caseParents(parents);
			if (result == null)
				result = caseReferenceAttribute(parents);
			if (result == null)
				result = caseAttribute(parents);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.ADDRESS: {
			Address address = (Address) theEObject;
			T result = caseAddress(address);
			if (result == null)
				result = caseAttribute(address);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.DISPLAY_NAME: {
			DisplayName displayName = (DisplayName) theEObject;
			T result = caseDisplayName(displayName);
			if (result == null)
				result = caseValueAttribute(displayName);
			if (result == null)
				result = caseAttribute(displayName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.REGISTER: {
			Register register = (Register) theEObject;
			T result = caseRegister(register);
			if (result == null)
				result = caseBooleanAttribute(register);
			if (result == null)
				result = caseAttribute(register);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.USE: {
			Use use = (Use) theEObject;
			T result = caseUse(use);
			if (result == null)
				result = caseReferenceAttribute(use);
			if (result == null)
				result = caseAttribute(use);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.TIMEPERIOD_NAME: {
			TimeperiodName timeperiodName = (TimeperiodName) theEObject;
			T result = caseTimeperiodName(timeperiodName);
			if (result == null)
				result = caseNameAttribute(timeperiodName);
			if (result == null)
				result = caseAttribute(timeperiodName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOSTGROUP_NAME: {
			HostgroupName hostgroupName = (HostgroupName) theEObject;
			T result = caseHostgroupName(hostgroupName);
			if (result == null)
				result = caseNameAttribute(hostgroupName);
			if (result == null)
				result = caseAttribute(hostgroupName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_NAME: {
			HostName hostName = (HostName) theEObject;
			T result = caseHostName(hostName);
			if (result == null)
				result = caseNameAttribute(hostName);
			if (result == null)
				result = caseAttribute(hostName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.TEMPLATE_NAME: {
			TemplateName templateName = (TemplateName) theEObject;
			T result = caseTemplateName(templateName);
			if (result == null)
				result = caseNameAttribute(templateName);
			if (result == null)
				result = caseAttribute(templateName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.COMMAND_LINE: {
			CommandLine commandLine = (CommandLine) theEObject;
			T result = caseCommandLine(commandLine);
			if (result == null)
				result = caseValueAttribute(commandLine);
			if (result == null)
				result = caseAttribute(commandLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.COMMAND_NAME: {
			CommandName commandName = (CommandName) theEObject;
			T result = caseCommandName(commandName);
			if (result == null)
				result = caseNameAttribute(commandName);
			if (result == null)
				result = caseAttribute(commandName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.MAX_CHECK_ATTEMPTS: {
			MaxCheckAttempts maxCheckAttempts = (MaxCheckAttempts) theEObject;
			T result = caseMaxCheckAttempts(maxCheckAttempts);
			if (result == null)
				result = caseIntegerValueAttribute(maxCheckAttempts);
			if (result == null)
				result = caseAttribute(maxCheckAttempts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CHECK_INTERVAL: {
			CheckInterval checkInterval = (CheckInterval) theEObject;
			T result = caseCheckInterval(checkInterval);
			if (result == null)
				result = caseIntegerValueAttribute(checkInterval);
			if (result == null)
				result = caseAttribute(checkInterval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.RETRY_INTERVAL: {
			RetryInterval retryInterval = (RetryInterval) theEObject;
			T result = caseRetryInterval(retryInterval);
			if (result == null)
				result = caseIntegerValueAttribute(retryInterval);
			if (result == null)
				result = caseAttribute(retryInterval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.ACTIVE_CHECKS_ENABLED: {
			ActiveChecksEnabled activeChecksEnabled = (ActiveChecksEnabled) theEObject;
			T result = caseActiveChecksEnabled(activeChecksEnabled);
			if (result == null)
				result = caseBooleanAttribute(activeChecksEnabled);
			if (result == null)
				result = caseAttribute(activeChecksEnabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.PASSIVE_CHECKS_ENABLED: {
			PassiveChecksEnabled passiveChecksEnabled = (PassiveChecksEnabled) theEObject;
			T result = casePassiveChecksEnabled(passiveChecksEnabled);
			if (result == null)
				result = caseBooleanAttribute(passiveChecksEnabled);
			if (result == null)
				result = caseAttribute(passiveChecksEnabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CHECK_PERIOD: {
			CheckPeriod checkPeriod = (CheckPeriod) theEObject;
			T result = caseCheckPeriod(checkPeriod);
			if (result == null)
				result = caseReferenceAttribute(checkPeriod);
			if (result == null)
				result = caseAttribute(checkPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CHECK_COMMAND: {
			CheckCommand checkCommand = (CheckCommand) theEObject;
			T result = caseCheckCommand(checkCommand);
			if (result == null)
				result = caseReferenceAttribute(checkCommand);
			if (result == null)
				result = caseAttribute(checkCommand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.TIME_EXCLUDE: {
			TimeExclude timeExclude = (TimeExclude) theEObject;
			T result = caseTimeExclude(timeExclude);
			if (result == null)
				result = caseReferenceAttribute(timeExclude);
			if (result == null)
				result = caseAttribute(timeExclude);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CONTACT_NAME: {
			ContactName contactName = (ContactName) theEObject;
			T result = caseContactName(contactName);
			if (result == null)
				result = caseNameAttribute(contactName);
			if (result == null)
				result = caseAttribute(contactName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.NOTIFICATIONS_ENABLED: {
			NotificationsEnabled notificationsEnabled = (NotificationsEnabled) theEObject;
			T result = caseNotificationsEnabled(notificationsEnabled);
			if (result == null)
				result = caseBooleanAttribute(notificationsEnabled);
			if (result == null)
				result = caseAttribute(notificationsEnabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_NOTIFICATIONS_ENABLED: {
			HostNotificationsEnabled hostNotificationsEnabled = (HostNotificationsEnabled) theEObject;
			T result = caseHostNotificationsEnabled(hostNotificationsEnabled);
			if (result == null)
				result = caseBooleanAttribute(hostNotificationsEnabled);
			if (result == null)
				result = caseAttribute(hostNotificationsEnabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_NOTIFICATIONS_ENABLED: {
			ServiceNotificationsEnabled serviceNotificationsEnabled = (ServiceNotificationsEnabled) theEObject;
			T result = caseServiceNotificationsEnabled(serviceNotificationsEnabled);
			if (result == null)
				result = caseBooleanAttribute(serviceNotificationsEnabled);
			if (result == null)
				result = caseAttribute(serviceNotificationsEnabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.NOTIFICATION_PERIOD: {
			NotificationPeriod notificationPeriod = (NotificationPeriod) theEObject;
			T result = caseNotificationPeriod(notificationPeriod);
			if (result == null)
				result = caseReferenceAttribute(notificationPeriod);
			if (result == null)
				result = caseAttribute(notificationPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_NOTIFICATION_PERIOD: {
			HostNotificationPeriod hostNotificationPeriod = (HostNotificationPeriod) theEObject;
			T result = caseHostNotificationPeriod(hostNotificationPeriod);
			if (result == null)
				result = caseReferenceAttribute(hostNotificationPeriod);
			if (result == null)
				result = caseAttribute(hostNotificationPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_NOTIFICATION_PERIOD: {
			ServiceNotificationPeriod serviceNotificationPeriod = (ServiceNotificationPeriod) theEObject;
			T result = caseServiceNotificationPeriod(serviceNotificationPeriod);
			if (result == null)
				result = caseReferenceAttribute(serviceNotificationPeriod);
			if (result == null)
				result = caseAttribute(serviceNotificationPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_NOTIFICATION_OPTIONS: {
			HostNotificationOptions hostNotificationOptions = (HostNotificationOptions) theEObject;
			T result = caseHostNotificationOptions(hostNotificationOptions);
			if (result == null)
				result = caseAttribute(hostNotificationOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_NOTIFICATION_OPTIONS: {
			ServiceNotificationOptions serviceNotificationOptions = (ServiceNotificationOptions) theEObject;
			T result = caseServiceNotificationOptions(serviceNotificationOptions);
			if (result == null)
				result = caseAttribute(serviceNotificationOptions);
			if (result == null)
				result = caseServiceNotificationOption(serviceNotificationOptions);
			if (result == null)
				result = caseServiceState(serviceNotificationOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.NOTIFICATION_COMMANDS: {
			NotificationCommands notificationCommands = (NotificationCommands) theEObject;
			T result = caseNotificationCommands(notificationCommands);
			if (result == null)
				result = caseReferenceAttribute(notificationCommands);
			if (result == null)
				result = caseAttribute(notificationCommands);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_NOTIFICATION_COMMANDS: {
			HostNotificationCommands hostNotificationCommands = (HostNotificationCommands) theEObject;
			T result = caseHostNotificationCommands(hostNotificationCommands);
			if (result == null)
				result = caseReferenceAttribute(hostNotificationCommands);
			if (result == null)
				result = caseAttribute(hostNotificationCommands);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_NOTIFICATION_COMMANDS: {
			ServiceNotificationCommands serviceNotificationCommands = (ServiceNotificationCommands) theEObject;
			T result = caseServiceNotificationCommands(serviceNotificationCommands);
			if (result == null)
				result = caseReferenceAttribute(serviceNotificationCommands);
			if (result == null)
				result = caseAttribute(serviceNotificationCommands);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CONTACT_ADDRESS: {
			ContactAddress contactAddress = (ContactAddress) theEObject;
			T result = caseContactAddress(contactAddress);
			if (result == null)
				result = caseValueAttribute(contactAddress);
			if (result == null)
				result = caseAttribute(contactAddress);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.EMAIL: {
			Email email = (Email) theEObject;
			T result = caseEmail(email);
			if (result == null)
				result = caseAttribute(email);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.PAGER: {
			Pager pager = (Pager) theEObject;
			T result = casePager(pager);
			if (result == null)
				result = caseAttribute(pager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CONTACT_MEMBERS: {
			ContactMembers contactMembers = (ContactMembers) theEObject;
			T result = caseContactMembers(contactMembers);
			if (result == null)
				result = caseReferenceAttribute(contactMembers);
			if (result == null)
				result = caseAttribute(contactMembers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CONTACT_GROUP_NAME: {
			ContactGroupName contactGroupName = (ContactGroupName) theEObject;
			T result = caseContactGroupName(contactGroupName);
			if (result == null)
				result = caseValueAttribute(contactGroupName);
			if (result == null)
				result = caseAttribute(contactGroupName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CONTACTS: {
			Contacts contacts = (Contacts) theEObject;
			T result = caseContacts(contacts);
			if (result == null)
				result = caseReferenceAttribute(contacts);
			if (result == null)
				result = caseAttribute(contacts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CONTACT_GROUPS: {
			ContactGroups contactGroups = (ContactGroups) theEObject;
			T result = caseContactGroups(contactGroups);
			if (result == null)
				result = caseReferenceAttribute(contactGroups);
			if (result == null)
				result = caseAttribute(contactGroups);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.NOTIFICATION_INTERVAL: {
			NotificationInterval notificationInterval = (NotificationInterval) theEObject;
			T result = caseNotificationInterval(notificationInterval);
			if (result == null)
				result = caseIntegerValueAttribute(notificationInterval);
			if (result == null)
				result = caseAttribute(notificationInterval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.FIRST_NOTIFICATION_DELAY: {
			FirstNotificationDelay firstNotificationDelay = (FirstNotificationDelay) theEObject;
			T result = caseFirstNotificationDelay(firstNotificationDelay);
			if (result == null)
				result = caseIntegerValueAttribute(firstNotificationDelay);
			if (result == null)
				result = caseAttribute(firstNotificationDelay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_STALKING_OPTIONS: {
			HostStalkingOptions hostStalkingOptions = (HostStalkingOptions) theEObject;
			T result = caseHostStalkingOptions(hostStalkingOptions);
			if (result == null)
				result = caseAttribute(hostStalkingOptions);
			if (result == null)
				result = caseHostState(hostStalkingOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.NOTES: {
			Notes notes = (Notes) theEObject;
			T result = caseNotes(notes);
			if (result == null)
				result = caseValueAttribute(notes);
			if (result == null)
				result = caseAttribute(notes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.NOTES_URL: {
			NotesUrl notesUrl = (NotesUrl) theEObject;
			T result = caseNotesUrl(notesUrl);
			if (result == null)
				result = caseValueAttribute(notesUrl);
			if (result == null)
				result = caseAttribute(notesUrl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.ACTION_URL: {
			ActionUrl actionUrl = (ActionUrl) theEObject;
			T result = caseActionUrl(actionUrl);
			if (result == null)
				result = caseValueAttribute(actionUrl);
			if (result == null)
				result = caseAttribute(actionUrl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.ICON_IMAGE: {
			IconImage iconImage = (IconImage) theEObject;
			T result = caseIconImage(iconImage);
			if (result == null)
				result = caseValueAttribute(iconImage);
			if (result == null)
				result = caseAttribute(iconImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.ICON_IMAGE_ALT: {
			IconImageAlt iconImageAlt = (IconImageAlt) theEObject;
			T result = caseIconImageAlt(iconImageAlt);
			if (result == null)
				result = caseValueAttribute(iconImageAlt);
			if (result == null)
				result = caseAttribute(iconImageAlt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.VRML_IMAGE: {
			VrmlImage vrmlImage = (VrmlImage) theEObject;
			T result = caseVrmlImage(vrmlImage);
			if (result == null)
				result = caseValueAttribute(vrmlImage);
			if (result == null)
				result = caseAttribute(vrmlImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.STATUSMAP_IMAGE: {
			StatusmapImage statusmapImage = (StatusmapImage) theEObject;
			T result = caseStatusmapImage(statusmapImage);
			if (result == null)
				result = caseValueAttribute(statusmapImage);
			if (result == null)
				result = caseAttribute(statusmapImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.TWO_DCOORDS: {
			TwoDCoords twoDCoords = (TwoDCoords) theEObject;
			T result = caseTwoDCoords(twoDCoords);
			if (result == null)
				result = caseAttribute(twoDCoords);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.THREE_DCOORDS: {
			ThreeDCoords threeDCoords = (ThreeDCoords) theEObject;
			T result = caseThreeDCoords(threeDCoords);
			if (result == null)
				result = caseValueAttribute(threeDCoords);
			if (result == null)
				result = caseAttribute(threeDCoords);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOSTGROUP_MEMBERS: {
			HostgroupMembers hostgroupMembers = (HostgroupMembers) theEObject;
			T result = caseHostgroupMembers(hostgroupMembers);
			if (result == null)
				result = caseReferenceAttribute(hostgroupMembers);
			if (result == null)
				result = caseAttribute(hostgroupMembers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_MEMBERS: {
			HostMembers hostMembers = (HostMembers) theEObject;
			T result = caseHostMembers(hostMembers);
			if (result == null)
				result = caseReferenceAttribute(hostMembers);
			if (result == null)
				result = caseAttribute(hostMembers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_NAME_REFERENCE: {
			HostNameReference hostNameReference = (HostNameReference) theEObject;
			T result = caseHostNameReference(hostNameReference);
			if (result == null)
				result = caseReferenceAttribute(hostNameReference);
			if (result == null)
				result = caseAttribute(hostNameReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOSTGROUP_NAME_REFERENCE: {
			HostgroupNameReference hostgroupNameReference = (HostgroupNameReference) theEObject;
			T result = caseHostgroupNameReference(hostgroupNameReference);
			if (result == null)
				result = caseReferenceAttribute(hostgroupNameReference);
			if (result == null)
				result = caseAttribute(hostgroupNameReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_DESCRIPTION: {
			ServiceDescription serviceDescription = (ServiceDescription) theEObject;
			T result = caseServiceDescription(serviceDescription);
			if (result == null)
				result = caseNameAttribute(serviceDescription);
			if (result == null)
				result = caseAttribute(serviceDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_INITIAL_STATE: {
			ServiceInitialState serviceInitialState = (ServiceInitialState) theEObject;
			T result = caseServiceInitialState(serviceInitialState);
			if (result == null)
				result = caseAttribute(serviceInitialState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.IS_VOLATILE_FLAG: {
			IsVolatileFlag isVolatileFlag = (IsVolatileFlag) theEObject;
			T result = caseIsVolatileFlag(isVolatileFlag);
			if (result == null)
				result = caseBooleanAttribute(isVolatileFlag);
			if (result == null)
				result = caseAttribute(isVolatileFlag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.OBSESS_OVER_HOST: {
			ObsessOverHost obsessOverHost = (ObsessOverHost) theEObject;
			T result = caseObsessOverHost(obsessOverHost);
			if (result == null)
				result = caseBooleanAttribute(obsessOverHost);
			if (result == null)
				result = caseAttribute(obsessOverHost);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.OBSESS_OVER_SERVICE: {
			ObsessOverService obsessOverService = (ObsessOverService) theEObject;
			T result = caseObsessOverService(obsessOverService);
			if (result == null)
				result = caseBooleanAttribute(obsessOverService);
			if (result == null)
				result = caseAttribute(obsessOverService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CHECK_FRESHNESS: {
			CheckFreshness checkFreshness = (CheckFreshness) theEObject;
			T result = caseCheckFreshness(checkFreshness);
			if (result == null)
				result = caseBooleanAttribute(checkFreshness);
			if (result == null)
				result = caseAttribute(checkFreshness);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.FRESHNESS_THRESHOLD: {
			FreshnessThreshold freshnessThreshold = (FreshnessThreshold) theEObject;
			T result = caseFreshnessThreshold(freshnessThreshold);
			if (result == null)
				result = caseIntegerValueAttribute(freshnessThreshold);
			if (result == null)
				result = caseAttribute(freshnessThreshold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.EVENT_HANDLER: {
			EventHandler eventHandler = (EventHandler) theEObject;
			T result = caseEventHandler(eventHandler);
			if (result == null)
				result = caseReferenceAttribute(eventHandler);
			if (result == null)
				result = caseAttribute(eventHandler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.EVENT_HANDLER_ENABLED: {
			EventHandlerEnabled eventHandlerEnabled = (EventHandlerEnabled) theEObject;
			T result = caseEventHandlerEnabled(eventHandlerEnabled);
			if (result == null)
				result = caseBooleanAttribute(eventHandlerEnabled);
			if (result == null)
				result = caseAttribute(eventHandlerEnabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.LOW_FLAP_THRESHOLD: {
			LowFlapThreshold lowFlapThreshold = (LowFlapThreshold) theEObject;
			T result = caseLowFlapThreshold(lowFlapThreshold);
			if (result == null)
				result = caseIntegerValueAttribute(lowFlapThreshold);
			if (result == null)
				result = caseAttribute(lowFlapThreshold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HIGH_FLAP_THRESHOLD: {
			HighFlapThreshold highFlapThreshold = (HighFlapThreshold) theEObject;
			T result = caseHighFlapThreshold(highFlapThreshold);
			if (result == null)
				result = caseIntegerValueAttribute(highFlapThreshold);
			if (result == null)
				result = caseAttribute(highFlapThreshold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.FLAP_DETECTION_ENABLED: {
			FlapDetectionEnabled flapDetectionEnabled = (FlapDetectionEnabled) theEObject;
			T result = caseFlapDetectionEnabled(flapDetectionEnabled);
			if (result == null)
				result = caseBooleanAttribute(flapDetectionEnabled);
			if (result == null)
				result = caseAttribute(flapDetectionEnabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_FLAP_DETECTION_OPTIONS: {
			HostFlapDetectionOptions hostFlapDetectionOptions = (HostFlapDetectionOptions) theEObject;
			T result = caseHostFlapDetectionOptions(hostFlapDetectionOptions);
			if (result == null)
				result = caseAttribute(hostFlapDetectionOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.PROCESS_PERF_DATA: {
			ProcessPerfData processPerfData = (ProcessPerfData) theEObject;
			T result = caseProcessPerfData(processPerfData);
			if (result == null)
				result = caseBooleanAttribute(processPerfData);
			if (result == null)
				result = caseAttribute(processPerfData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.RETAIN_STATUS_INFORMATION: {
			RetainStatusInformation retainStatusInformation = (RetainStatusInformation) theEObject;
			T result = caseRetainStatusInformation(retainStatusInformation);
			if (result == null)
				result = caseBooleanAttribute(retainStatusInformation);
			if (result == null)
				result = caseAttribute(retainStatusInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.RETAIN_NONSTATUS_INFORMATION: {
			RetainNonstatusInformation retainNonstatusInformation = (RetainNonstatusInformation) theEObject;
			T result = caseRetainNonstatusInformation(retainNonstatusInformation);
			if (result == null)
				result = caseBooleanAttribute(retainNonstatusInformation);
			if (result == null)
				result = caseAttribute(retainNonstatusInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_FLAP_DETECTION_OPTIONS: {
			ServiceFlapDetectionOptions serviceFlapDetectionOptions = (ServiceFlapDetectionOptions) theEObject;
			T result = caseServiceFlapDetectionOptions(serviceFlapDetectionOptions);
			if (result == null)
				result = caseAttribute(serviceFlapDetectionOptions);
			if (result == null)
				result = caseServiceState(serviceFlapDetectionOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICEGROUP_NAME: {
			ServicegroupName servicegroupName = (ServicegroupName) theEObject;
			T result = caseServicegroupName(servicegroupName);
			if (result == null)
				result = caseNameAttribute(servicegroupName);
			if (result == null)
				result = caseAttribute(servicegroupName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_MEMBERS: {
			ServiceMembers serviceMembers = (ServiceMembers) theEObject;
			T result = caseServiceMembers(serviceMembers);
			if (result == null)
				result = caseReferenceAttribute(serviceMembers);
			if (result == null)
				result = caseAttribute(serviceMembers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICEGROUP_MEMBERS: {
			ServicegroupMembers servicegroupMembers = (ServicegroupMembers) theEObject;
			T result = caseServicegroupMembers(servicegroupMembers);
			if (result == null)
				result = caseReferenceAttribute(servicegroupMembers);
			if (result == null)
				result = caseAttribute(servicegroupMembers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICEGROUPS: {
			Servicegroups servicegroups = (Servicegroups) theEObject;
			T result = caseServicegroups(servicegroups);
			if (result == null)
				result = caseReferenceAttribute(servicegroups);
			if (result == null)
				result = caseAttribute(servicegroups);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.DEPENDENT_HOST_NAME: {
			DependentHostName dependentHostName = (DependentHostName) theEObject;
			T result = caseDependentHostName(dependentHostName);
			if (result == null)
				result = caseReferenceAttribute(dependentHostName);
			if (result == null)
				result = caseAttribute(dependentHostName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.DEPENDENT_HOSTGROUP_NAME: {
			DependentHostgroupName dependentHostgroupName = (DependentHostgroupName) theEObject;
			T result = caseDependentHostgroupName(dependentHostgroupName);
			if (result == null)
				result = caseReferenceAttribute(dependentHostgroupName);
			if (result == null)
				result = caseAttribute(dependentHostgroupName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.DEPENDENT_SERVICE_DESCRIPTION: {
			DependentServiceDescription dependentServiceDescription = (DependentServiceDescription) theEObject;
			T result = caseDependentServiceDescription(dependentServiceDescription);
			if (result == null)
				result = caseReferenceAttribute(dependentServiceDescription);
			if (result == null)
				result = caseAttribute(dependentServiceDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_DESCRIPTION_REFERENCE: {
			ServiceDescriptionReference serviceDescriptionReference = (ServiceDescriptionReference) theEObject;
			T result = caseServiceDescriptionReference(serviceDescriptionReference);
			if (result == null)
				result = caseReferenceAttribute(serviceDescriptionReference);
			if (result == null)
				result = caseAttribute(serviceDescriptionReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.INHERITS_PARENT: {
			InheritsParent inheritsParent = (InheritsParent) theEObject;
			T result = caseInheritsParent(inheritsParent);
			if (result == null)
				result = caseBooleanAttribute(inheritsParent);
			if (result == null)
				result = caseAttribute(inheritsParent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_EXECUTION_FAILURE_CRITERIA: {
			ServiceExecutionFailureCriteria serviceExecutionFailureCriteria = (ServiceExecutionFailureCriteria) theEObject;
			T result = caseServiceExecutionFailureCriteria(serviceExecutionFailureCriteria);
			if (result == null)
				result = caseAttribute(serviceExecutionFailureCriteria);
			if (result == null)
				result = caseServiceFailureCriteria(serviceExecutionFailureCriteria);
			if (result == null)
				result = caseServiceState(serviceExecutionFailureCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.NOTIFICATION_FAILURE_CRITERIA: {
			NotificationFailureCriteria notificationFailureCriteria = (NotificationFailureCriteria) theEObject;
			T result = caseNotificationFailureCriteria(notificationFailureCriteria);
			if (result == null)
				result = caseAttribute(notificationFailureCriteria);
			if (result == null)
				result = caseServiceFailureCriteria(notificationFailureCriteria);
			if (result == null)
				result = caseServiceState(notificationFailureCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.DEPENDENCY_PERIOD: {
			DependencyPeriod dependencyPeriod = (DependencyPeriod) theEObject;
			T result = caseDependencyPeriod(dependencyPeriod);
			if (result == null)
				result = caseReferenceAttribute(dependencyPeriod);
			if (result == null)
				result = caseAttribute(dependencyPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_STALKING_OPTIONS: {
			ServiceStalkingOptions serviceStalkingOptions = (ServiceStalkingOptions) theEObject;
			T result = caseServiceStalkingOptions(serviceStalkingOptions);
			if (result == null)
				result = caseAttribute(serviceStalkingOptions);
			if (result == null)
				result = caseServiceState(serviceStalkingOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.FIRST_NOTIFICATION: {
			FirstNotification firstNotification = (FirstNotification) theEObject;
			T result = caseFirstNotification(firstNotification);
			if (result == null)
				result = caseIntegerValueAttribute(firstNotification);
			if (result == null)
				result = caseAttribute(firstNotification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.LAST_NOTIFICATION: {
			LastNotification lastNotification = (LastNotification) theEObject;
			T result = caseLastNotification(lastNotification);
			if (result == null)
				result = caseIntegerValueAttribute(lastNotification);
			if (result == null)
				result = caseAttribute(lastNotification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.ESCALATION_PERIOD: {
			EscalationPeriod escalationPeriod = (EscalationPeriod) theEObject;
			T result = caseEscalationPeriod(escalationPeriod);
			if (result == null)
				result = caseReferenceAttribute(escalationPeriod);
			if (result == null)
				result = caseAttribute(escalationPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_ESCALATION_OPTIONS: {
			ServiceEscalationOptions serviceEscalationOptions = (ServiceEscalationOptions) theEObject;
			T result = caseServiceEscalationOptions(serviceEscalationOptions);
			if (result == null)
				result = caseAttribute(serviceEscalationOptions);
			if (result == null)
				result = caseServiceState(serviceEscalationOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_EXECUTION_FAILURE_CRITERIA: {
			HostExecutionFailureCriteria hostExecutionFailureCriteria = (HostExecutionFailureCriteria) theEObject;
			T result = caseHostExecutionFailureCriteria(hostExecutionFailureCriteria);
			if (result == null)
				result = caseAttribute(hostExecutionFailureCriteria);
			if (result == null)
				result = caseHostFailureCriteria(hostExecutionFailureCriteria);
			if (result == null)
				result = caseHostState(hostExecutionFailureCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.SERVICE_NOTIFICATION_FAILURE_CRITERIA: {
			ServiceNotificationFailureCriteria serviceNotificationFailureCriteria = (ServiceNotificationFailureCriteria) theEObject;
			T result = caseServiceNotificationFailureCriteria(serviceNotificationFailureCriteria);
			if (result == null)
				result = caseAttribute(serviceNotificationFailureCriteria);
			if (result == null)
				result = caseServiceFailureCriteria(serviceNotificationFailureCriteria);
			if (result == null)
				result = caseServiceState(serviceNotificationFailureCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_NOTIFICATION_FAILURE_CRITERIA: {
			HostNotificationFailureCriteria hostNotificationFailureCriteria = (HostNotificationFailureCriteria) theEObject;
			T result = caseHostNotificationFailureCriteria(hostNotificationFailureCriteria);
			if (result == null)
				result = caseAttribute(hostNotificationFailureCriteria);
			if (result == null)
				result = caseHostFailureCriteria(hostNotificationFailureCriteria);
			if (result == null)
				result = caseHostState(hostNotificationFailureCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.HOST_ESCALATION_OPTIONS: {
			HostEscalationOptions hostEscalationOptions = (HostEscalationOptions) theEObject;
			T result = caseHostEscalationOptions(hostEscalationOptions);
			if (result == null)
				result = caseAttribute(hostEscalationOptions);
			if (result == null)
				result = caseHostState(hostEscalationOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributesPackage.CAN_SUBMIT_COMMANDS: {
			CanSubmitCommands canSubmitCommands = (CanSubmitCommands) theEObject;
			T result = caseCanSubmitCommands(canSubmitCommands);
			if (result == null)
				result = caseBooleanAttribute(canSubmitCommands);
			if (result == null)
				result = caseAttribute(canSubmitCommands);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlias(Alias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostInitialState(HostInitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostgroups</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostgroups</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostgroups(Hostgroups object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParents(Parents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayName(DisplayName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegister(Register object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUse(Use object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeperiod Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeperiod Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeperiodName(TimeperiodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostgroup Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostgroup Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostgroupName(HostgroupName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostName(HostName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateName(TemplateName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandLine(CommandLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandName(CommandName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Check Attempts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Check Attempts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxCheckAttempts(MaxCheckAttempts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckInterval(CheckInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetryInterval(RetryInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Checks Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Checks Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveChecksEnabled(ActiveChecksEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Checks Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Checks Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveChecksEnabled(PassiveChecksEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckPeriod(CheckPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckCommand(CheckCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Exclude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExclude(TimeExclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactName(ContactName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notifications Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notifications Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationsEnabled(NotificationsEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Notifications Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Notifications Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostNotificationsEnabled(HostNotificationsEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Notifications Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Notifications Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNotificationsEnabled(ServiceNotificationsEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationPeriod(NotificationPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Notification Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Notification Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostNotificationPeriod(HostNotificationPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Notification Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Notification Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNotificationPeriod(ServiceNotificationPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Notification Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Notification Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostNotificationOptions(HostNotificationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Notification Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Notification Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNotificationOptions(ServiceNotificationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Commands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Commands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationCommands(NotificationCommands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Notification Commands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Notification Commands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostNotificationCommands(HostNotificationCommands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Notification Commands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Notification Commands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNotificationCommands(ServiceNotificationCommands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactAddress(ContactAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmail(Email object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePager(Pager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Members</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Members</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactMembers(ContactMembers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Group Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Group Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactGroupName(ContactGroupName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contacts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contacts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContacts(Contacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Groups</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Groups</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactGroups(ContactGroups object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationInterval(NotificationInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Notification Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Notification Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstNotificationDelay(FirstNotificationDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Stalking Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Stalking Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostStalkingOptions(HostStalkingOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotes(Notes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotesUrl(NotesUrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionUrl(ActionUrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconImage(IconImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Image Alt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Image Alt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconImageAlt(IconImageAlt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vrml Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vrml Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVrmlImage(VrmlImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statusmap Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statusmap Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusmapImage(StatusmapImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two DCoords</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two DCoords</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoDCoords(TwoDCoords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Three DCoords</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Three DCoords</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreeDCoords(ThreeDCoords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostgroup Members</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostgroup Members</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostgroupMembers(HostgroupMembers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Members</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Members</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostMembers(HostMembers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostNameReference(HostNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostgroup Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostgroup Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostgroupNameReference(HostgroupNameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescription(ServiceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInitialState(ServiceInitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Volatile Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Volatile Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsVolatileFlag(IsVolatileFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obsess Over Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obsess Over Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObsessOverHost(ObsessOverHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obsess Over Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obsess Over Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObsessOverService(ObsessOverService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Freshness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Freshness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckFreshness(CheckFreshness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freshness Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freshness Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreshnessThreshold(FreshnessThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandler(EventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandlerEnabled(EventHandlerEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Low Flap Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Low Flap Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowFlapThreshold(LowFlapThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>High Flap Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>High Flap Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighFlapThreshold(HighFlapThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flap Detection Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flap Detection Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlapDetectionEnabled(FlapDetectionEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Flap Detection Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Flap Detection Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostFlapDetectionOptions(HostFlapDetectionOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Perf Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Perf Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPerfData(ProcessPerfData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retain Status Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retain Status Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetainStatusInformation(RetainStatusInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retain Nonstatus Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retain Nonstatus Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetainNonstatusInformation(RetainNonstatusInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Flap Detection Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Flap Detection Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFlapDetectionOptions(ServiceFlapDetectionOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicegroup Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicegroup Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicegroupName(ServicegroupName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Members</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Members</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceMembers(ServiceMembers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicegroup Members</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicegroup Members</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicegroupMembers(ServicegroupMembers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicegroups</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicegroups</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicegroups(Servicegroups object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Host Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Host Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentHostName(DependentHostName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Hostgroup Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Hostgroup Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentHostgroupName(DependentHostgroupName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Service Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentServiceDescription(DependentServiceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Description Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Description Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescriptionReference(ServiceDescriptionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherits Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherits Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritsParent(InheritsParent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Execution Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Execution Failure Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceExecutionFailureCriteria(
			ServiceExecutionFailureCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Failure Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationFailureCriteria(NotificationFailureCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyPeriod(DependencyPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Stalking Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Stalking Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceStalkingOptions(ServiceStalkingOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstNotification(FirstNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastNotification(LastNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escalation Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escalation Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscalationPeriod(EscalationPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Escalation Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Escalation Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEscalationOptions(ServiceEscalationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Execution Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Execution Failure Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostExecutionFailureCriteria(
			HostExecutionFailureCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Notification Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Notification Failure Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNotificationFailureCriteria(
			ServiceNotificationFailureCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Notification Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Notification Failure Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostNotificationFailureCriteria(
			HostNotificationFailureCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Escalation Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Escalation Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostEscalationOptions(HostEscalationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Can Submit Commands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Can Submit Commands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanSubmitCommands(CanSubmitCommands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueAttribute(ValueAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceAttribute(ReferenceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAttribute(BooleanAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameAttribute(NameAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueAttribute(IntegerValueAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceState(ServiceState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Notification Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Notification Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNotificationOption(ServiceNotificationOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostState(HostState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Failure Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFailureCriteria(ServiceFailureCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Failure Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Failure Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostFailureCriteria(HostFailureCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AttributesSwitch
