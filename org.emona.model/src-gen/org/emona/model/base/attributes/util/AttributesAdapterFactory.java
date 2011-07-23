/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.attributes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.attributes.AttributesPackage
 * @generated
 */
public class AttributesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AttributesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AttributesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesSwitch<Adapter> modelSwitch = new AttributesSwitch<Adapter>() {
		@Override
		public Adapter caseAlias(Alias object) {
			return createAliasAdapter();
		}

		@Override
		public Adapter caseHostInitialState(HostInitialState object) {
			return createHostInitialStateAdapter();
		}

		@Override
		public Adapter caseHostgroups(Hostgroups object) {
			return createHostgroupsAdapter();
		}

		@Override
		public Adapter caseParents(Parents object) {
			return createParentsAdapter();
		}

		@Override
		public Adapter caseAddress(Address object) {
			return createAddressAdapter();
		}

		@Override
		public Adapter caseDisplayName(DisplayName object) {
			return createDisplayNameAdapter();
		}

		@Override
		public Adapter caseRegister(Register object) {
			return createRegisterAdapter();
		}

		@Override
		public Adapter caseUse(Use object) {
			return createUseAdapter();
		}

		@Override
		public Adapter caseTimeperiodName(TimeperiodName object) {
			return createTimeperiodNameAdapter();
		}

		@Override
		public Adapter caseHostgroupName(HostgroupName object) {
			return createHostgroupNameAdapter();
		}

		@Override
		public Adapter caseHostName(HostName object) {
			return createHostNameAdapter();
		}

		@Override
		public Adapter caseTemplateName(TemplateName object) {
			return createTemplateNameAdapter();
		}

		@Override
		public Adapter caseCommandLine(CommandLine object) {
			return createCommandLineAdapter();
		}

		@Override
		public Adapter caseCommandName(CommandName object) {
			return createCommandNameAdapter();
		}

		@Override
		public Adapter caseMaxCheckAttempts(MaxCheckAttempts object) {
			return createMaxCheckAttemptsAdapter();
		}

		@Override
		public Adapter caseCheckInterval(CheckInterval object) {
			return createCheckIntervalAdapter();
		}

		@Override
		public Adapter caseRetryInterval(RetryInterval object) {
			return createRetryIntervalAdapter();
		}

		@Override
		public Adapter caseActiveChecksEnabled(ActiveChecksEnabled object) {
			return createActiveChecksEnabledAdapter();
		}

		@Override
		public Adapter casePassiveChecksEnabled(PassiveChecksEnabled object) {
			return createPassiveChecksEnabledAdapter();
		}

		@Override
		public Adapter caseCheckPeriod(CheckPeriod object) {
			return createCheckPeriodAdapter();
		}

		@Override
		public Adapter caseCheckCommand(CheckCommand object) {
			return createCheckCommandAdapter();
		}

		@Override
		public Adapter caseTimeExclude(TimeExclude object) {
			return createTimeExcludeAdapter();
		}

		@Override
		public Adapter caseContactName(ContactName object) {
			return createContactNameAdapter();
		}

		@Override
		public Adapter caseNotificationsEnabled(NotificationsEnabled object) {
			return createNotificationsEnabledAdapter();
		}

		@Override
		public Adapter caseHostNotificationsEnabled(
				HostNotificationsEnabled object) {
			return createHostNotificationsEnabledAdapter();
		}

		@Override
		public Adapter caseServiceNotificationsEnabled(
				ServiceNotificationsEnabled object) {
			return createServiceNotificationsEnabledAdapter();
		}

		@Override
		public Adapter caseNotificationPeriod(NotificationPeriod object) {
			return createNotificationPeriodAdapter();
		}

		@Override
		public Adapter caseHostNotificationPeriod(HostNotificationPeriod object) {
			return createHostNotificationPeriodAdapter();
		}

		@Override
		public Adapter caseServiceNotificationPeriod(
				ServiceNotificationPeriod object) {
			return createServiceNotificationPeriodAdapter();
		}

		@Override
		public Adapter caseHostNotificationOptions(
				HostNotificationOptions object) {
			return createHostNotificationOptionsAdapter();
		}

		@Override
		public Adapter caseServiceNotificationOptions(
				ServiceNotificationOptions object) {
			return createServiceNotificationOptionsAdapter();
		}

		@Override
		public Adapter caseNotificationCommands(NotificationCommands object) {
			return createNotificationCommandsAdapter();
		}

		@Override
		public Adapter caseHostNotificationCommands(
				HostNotificationCommands object) {
			return createHostNotificationCommandsAdapter();
		}

		@Override
		public Adapter caseServiceNotificationCommands(
				ServiceNotificationCommands object) {
			return createServiceNotificationCommandsAdapter();
		}

		@Override
		public Adapter caseContactAddress(ContactAddress object) {
			return createContactAddressAdapter();
		}

		@Override
		public Adapter caseEmail(Email object) {
			return createEmailAdapter();
		}

		@Override
		public Adapter casePager(Pager object) {
			return createPagerAdapter();
		}

		@Override
		public Adapter caseContactMembers(ContactMembers object) {
			return createContactMembersAdapter();
		}

		@Override
		public Adapter caseContactGroupName(ContactGroupName object) {
			return createContactGroupNameAdapter();
		}

		@Override
		public Adapter caseContacts(Contacts object) {
			return createContactsAdapter();
		}

		@Override
		public Adapter caseContactGroups(ContactGroups object) {
			return createContactGroupsAdapter();
		}

		@Override
		public Adapter caseNotificationInterval(NotificationInterval object) {
			return createNotificationIntervalAdapter();
		}

		@Override
		public Adapter caseFirstNotificationDelay(FirstNotificationDelay object) {
			return createFirstNotificationDelayAdapter();
		}

		@Override
		public Adapter caseHostStalkingOptions(HostStalkingOptions object) {
			return createHostStalkingOptionsAdapter();
		}

		@Override
		public Adapter caseNotes(Notes object) {
			return createNotesAdapter();
		}

		@Override
		public Adapter caseNotesUrl(NotesUrl object) {
			return createNotesUrlAdapter();
		}

		@Override
		public Adapter caseActionUrl(ActionUrl object) {
			return createActionUrlAdapter();
		}

		@Override
		public Adapter caseIconImage(IconImage object) {
			return createIconImageAdapter();
		}

		@Override
		public Adapter caseIconImageAlt(IconImageAlt object) {
			return createIconImageAltAdapter();
		}

		@Override
		public Adapter caseVrmlImage(VrmlImage object) {
			return createVrmlImageAdapter();
		}

		@Override
		public Adapter caseStatusmapImage(StatusmapImage object) {
			return createStatusmapImageAdapter();
		}

		@Override
		public Adapter caseTwoDCoords(TwoDCoords object) {
			return createTwoDCoordsAdapter();
		}

		@Override
		public Adapter caseThreeDCoords(ThreeDCoords object) {
			return createThreeDCoordsAdapter();
		}

		@Override
		public Adapter caseHostgroupMembers(HostgroupMembers object) {
			return createHostgroupMembersAdapter();
		}

		@Override
		public Adapter caseHostMembers(HostMembers object) {
			return createHostMembersAdapter();
		}

		@Override
		public Adapter caseHostNameReference(HostNameReference object) {
			return createHostNameReferenceAdapter();
		}

		@Override
		public Adapter caseHostgroupNameReference(HostgroupNameReference object) {
			return createHostgroupNameReferenceAdapter();
		}

		@Override
		public Adapter caseServiceDescription(ServiceDescription object) {
			return createServiceDescriptionAdapter();
		}

		@Override
		public Adapter caseServiceInitialState(ServiceInitialState object) {
			return createServiceInitialStateAdapter();
		}

		@Override
		public Adapter caseIsVolatileFlag(IsVolatileFlag object) {
			return createIsVolatileFlagAdapter();
		}

		@Override
		public Adapter caseObsessOverHost(ObsessOverHost object) {
			return createObsessOverHostAdapter();
		}

		@Override
		public Adapter caseObsessOverService(ObsessOverService object) {
			return createObsessOverServiceAdapter();
		}

		@Override
		public Adapter caseCheckFreshness(CheckFreshness object) {
			return createCheckFreshnessAdapter();
		}

		@Override
		public Adapter caseFreshnessThreshold(FreshnessThreshold object) {
			return createFreshnessThresholdAdapter();
		}

		@Override
		public Adapter caseEventHandler(EventHandler object) {
			return createEventHandlerAdapter();
		}

		@Override
		public Adapter caseEventHandlerEnabled(EventHandlerEnabled object) {
			return createEventHandlerEnabledAdapter();
		}

		@Override
		public Adapter caseLowFlapThreshold(LowFlapThreshold object) {
			return createLowFlapThresholdAdapter();
		}

		@Override
		public Adapter caseHighFlapThreshold(HighFlapThreshold object) {
			return createHighFlapThresholdAdapter();
		}

		@Override
		public Adapter caseFlapDetectionEnabled(FlapDetectionEnabled object) {
			return createFlapDetectionEnabledAdapter();
		}

		@Override
		public Adapter caseHostFlapDetectionOptions(
				HostFlapDetectionOptions object) {
			return createHostFlapDetectionOptionsAdapter();
		}

		@Override
		public Adapter caseProcessPerfData(ProcessPerfData object) {
			return createProcessPerfDataAdapter();
		}

		@Override
		public Adapter caseRetainStatusInformation(
				RetainStatusInformation object) {
			return createRetainStatusInformationAdapter();
		}

		@Override
		public Adapter caseRetainNonstatusInformation(
				RetainNonstatusInformation object) {
			return createRetainNonstatusInformationAdapter();
		}

		@Override
		public Adapter caseServiceFlapDetectionOptions(
				ServiceFlapDetectionOptions object) {
			return createServiceFlapDetectionOptionsAdapter();
		}

		@Override
		public Adapter caseServicegroupName(ServicegroupName object) {
			return createServicegroupNameAdapter();
		}

		@Override
		public Adapter caseServiceMembers(ServiceMembers object) {
			return createServiceMembersAdapter();
		}

		@Override
		public Adapter caseServicegroupMembers(ServicegroupMembers object) {
			return createServicegroupMembersAdapter();
		}

		@Override
		public Adapter caseServicegroups(Servicegroups object) {
			return createServicegroupsAdapter();
		}

		@Override
		public Adapter caseDependentHostName(DependentHostName object) {
			return createDependentHostNameAdapter();
		}

		@Override
		public Adapter caseDependentHostgroupName(DependentHostgroupName object) {
			return createDependentHostgroupNameAdapter();
		}

		@Override
		public Adapter caseDependentServiceDescription(
				DependentServiceDescription object) {
			return createDependentServiceDescriptionAdapter();
		}

		@Override
		public Adapter caseServiceDescriptionReference(
				ServiceDescriptionReference object) {
			return createServiceDescriptionReferenceAdapter();
		}

		@Override
		public Adapter caseInheritsParent(InheritsParent object) {
			return createInheritsParentAdapter();
		}

		@Override
		public Adapter caseServiceExecutionFailureCriteria(
				ServiceExecutionFailureCriteria object) {
			return createServiceExecutionFailureCriteriaAdapter();
		}

		@Override
		public Adapter caseNotificationFailureCriteria(
				NotificationFailureCriteria object) {
			return createNotificationFailureCriteriaAdapter();
		}

		@Override
		public Adapter caseDependencyPeriod(DependencyPeriod object) {
			return createDependencyPeriodAdapter();
		}

		@Override
		public Adapter caseServiceStalkingOptions(ServiceStalkingOptions object) {
			return createServiceStalkingOptionsAdapter();
		}

		@Override
		public Adapter caseFirstNotification(FirstNotification object) {
			return createFirstNotificationAdapter();
		}

		@Override
		public Adapter caseLastNotification(LastNotification object) {
			return createLastNotificationAdapter();
		}

		@Override
		public Adapter caseEscalationPeriod(EscalationPeriod object) {
			return createEscalationPeriodAdapter();
		}

		@Override
		public Adapter caseServiceEscalationOptions(
				ServiceEscalationOptions object) {
			return createServiceEscalationOptionsAdapter();
		}

		@Override
		public Adapter caseHostExecutionFailureCriteria(
				HostExecutionFailureCriteria object) {
			return createHostExecutionFailureCriteriaAdapter();
		}

		@Override
		public Adapter caseServiceNotificationFailureCriteria(
				ServiceNotificationFailureCriteria object) {
			return createServiceNotificationFailureCriteriaAdapter();
		}

		@Override
		public Adapter caseHostNotificationFailureCriteria(
				HostNotificationFailureCriteria object) {
			return createHostNotificationFailureCriteriaAdapter();
		}

		@Override
		public Adapter caseHostEscalationOptions(HostEscalationOptions object) {
			return createHostEscalationOptionsAdapter();
		}

		@Override
		public Adapter caseCanSubmitCommands(CanSubmitCommands object) {
			return createCanSubmitCommandsAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseValueAttribute(ValueAttribute object) {
			return createValueAttributeAdapter();
		}

		@Override
		public Adapter caseReferenceAttribute(ReferenceAttribute object) {
			return createReferenceAttributeAdapter();
		}

		@Override
		public Adapter caseBooleanAttribute(BooleanAttribute object) {
			return createBooleanAttributeAdapter();
		}

		@Override
		public Adapter caseNameAttribute(NameAttribute object) {
			return createNameAttributeAdapter();
		}

		@Override
		public Adapter caseIntegerValueAttribute(IntegerValueAttribute object) {
			return createIntegerValueAttributeAdapter();
		}

		@Override
		public Adapter caseServiceState(ServiceState object) {
			return createServiceStateAdapter();
		}

		@Override
		public Adapter caseServiceNotificationOption(
				ServiceNotificationOption object) {
			return createServiceNotificationOptionAdapter();
		}

		@Override
		public Adapter caseHostState(HostState object) {
			return createHostStateAdapter();
		}

		@Override
		public Adapter caseServiceFailureCriteria(ServiceFailureCriteria object) {
			return createServiceFailureCriteriaAdapter();
		}

		@Override
		public Adapter caseHostFailureCriteria(HostFailureCriteria object) {
			return createHostFailureCriteriaAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Alias
	 * @generated
	 */
	public Adapter createAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostInitialState <em>Host Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostInitialState
	 * @generated
	 */
	public Adapter createHostInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Hostgroups <em>Hostgroups</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Hostgroups
	 * @generated
	 */
	public Adapter createHostgroupsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Parents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Parents
	 * @generated
	 */
	public Adapter createParentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.DisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.DisplayName
	 * @generated
	 */
	public Adapter createDisplayNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Use
	 * @generated
	 */
	public Adapter createUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.TimeperiodName <em>Timeperiod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.TimeperiodName
	 * @generated
	 */
	public Adapter createTimeperiodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostgroupName <em>Hostgroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostgroupName
	 * @generated
	 */
	public Adapter createHostgroupNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostName
	 * @generated
	 */
	public Adapter createHostNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.TemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.TemplateName
	 * @generated
	 */
	public Adapter createTemplateNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.CommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.CommandLine
	 * @generated
	 */
	public Adapter createCommandLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.CommandName <em>Command Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.CommandName
	 * @generated
	 */
	public Adapter createCommandNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.MaxCheckAttempts <em>Max Check Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.MaxCheckAttempts
	 * @generated
	 */
	public Adapter createMaxCheckAttemptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.CheckInterval <em>Check Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.CheckInterval
	 * @generated
	 */
	public Adapter createCheckIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.RetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.RetryInterval
	 * @generated
	 */
	public Adapter createRetryIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ActiveChecksEnabled <em>Active Checks Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ActiveChecksEnabled
	 * @generated
	 */
	public Adapter createActiveChecksEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.PassiveChecksEnabled <em>Passive Checks Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.PassiveChecksEnabled
	 * @generated
	 */
	public Adapter createPassiveChecksEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.CheckPeriod <em>Check Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.CheckPeriod
	 * @generated
	 */
	public Adapter createCheckPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.CheckCommand <em>Check Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.CheckCommand
	 * @generated
	 */
	public Adapter createCheckCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.TimeExclude <em>Time Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.TimeExclude
	 * @generated
	 */
	public Adapter createTimeExcludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ContactName
	 * @generated
	 */
	public Adapter createContactNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.NotificationsEnabled <em>Notifications Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.NotificationsEnabled
	 * @generated
	 */
	public Adapter createNotificationsEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostNotificationsEnabled <em>Host Notifications Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostNotificationsEnabled
	 * @generated
	 */
	public Adapter createHostNotificationsEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceNotificationsEnabled <em>Service Notifications Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceNotificationsEnabled
	 * @generated
	 */
	public Adapter createServiceNotificationsEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.NotificationPeriod <em>Notification Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.NotificationPeriod
	 * @generated
	 */
	public Adapter createNotificationPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostNotificationPeriod <em>Host Notification Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostNotificationPeriod
	 * @generated
	 */
	public Adapter createHostNotificationPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceNotificationPeriod <em>Service Notification Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceNotificationPeriod
	 * @generated
	 */
	public Adapter createServiceNotificationPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostNotificationOptions <em>Host Notification Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostNotificationOptions
	 * @generated
	 */
	public Adapter createHostNotificationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceNotificationOptions <em>Service Notification Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceNotificationOptions
	 * @generated
	 */
	public Adapter createServiceNotificationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.NotificationCommands <em>Notification Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.NotificationCommands
	 * @generated
	 */
	public Adapter createNotificationCommandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostNotificationCommands <em>Host Notification Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostNotificationCommands
	 * @generated
	 */
	public Adapter createHostNotificationCommandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceNotificationCommands <em>Service Notification Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceNotificationCommands
	 * @generated
	 */
	public Adapter createServiceNotificationCommandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ContactAddress <em>Contact Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ContactAddress
	 * @generated
	 */
	public Adapter createContactAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Email
	 * @generated
	 */
	public Adapter createEmailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Pager <em>Pager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Pager
	 * @generated
	 */
	public Adapter createPagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ContactMembers <em>Contact Members</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ContactMembers
	 * @generated
	 */
	public Adapter createContactMembersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ContactGroupName <em>Contact Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ContactGroupName
	 * @generated
	 */
	public Adapter createContactGroupNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Contacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Contacts
	 * @generated
	 */
	public Adapter createContactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ContactGroups <em>Contact Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ContactGroups
	 * @generated
	 */
	public Adapter createContactGroupsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.NotificationInterval <em>Notification Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.NotificationInterval
	 * @generated
	 */
	public Adapter createNotificationIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.FirstNotificationDelay <em>First Notification Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.FirstNotificationDelay
	 * @generated
	 */
	public Adapter createFirstNotificationDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostStalkingOptions <em>Host Stalking Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostStalkingOptions
	 * @generated
	 */
	public Adapter createHostStalkingOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Notes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Notes
	 * @generated
	 */
	public Adapter createNotesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.NotesUrl <em>Notes Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.NotesUrl
	 * @generated
	 */
	public Adapter createNotesUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ActionUrl <em>Action Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ActionUrl
	 * @generated
	 */
	public Adapter createActionUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.IconImage <em>Icon Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.IconImage
	 * @generated
	 */
	public Adapter createIconImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.IconImageAlt <em>Icon Image Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.IconImageAlt
	 * @generated
	 */
	public Adapter createIconImageAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.VrmlImage <em>Vrml Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.VrmlImage
	 * @generated
	 */
	public Adapter createVrmlImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.StatusmapImage <em>Statusmap Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.StatusmapImage
	 * @generated
	 */
	public Adapter createStatusmapImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.TwoDCoords <em>Two DCoords</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.TwoDCoords
	 * @generated
	 */
	public Adapter createTwoDCoordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ThreeDCoords <em>Three DCoords</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ThreeDCoords
	 * @generated
	 */
	public Adapter createThreeDCoordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostgroupMembers <em>Hostgroup Members</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostgroupMembers
	 * @generated
	 */
	public Adapter createHostgroupMembersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostMembers <em>Host Members</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostMembers
	 * @generated
	 */
	public Adapter createHostMembersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostNameReference <em>Host Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostNameReference
	 * @generated
	 */
	public Adapter createHostNameReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostgroupNameReference <em>Hostgroup Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostgroupNameReference
	 * @generated
	 */
	public Adapter createHostgroupNameReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceDescription
	 * @generated
	 */
	public Adapter createServiceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceInitialState <em>Service Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceInitialState
	 * @generated
	 */
	public Adapter createServiceInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.IsVolatileFlag <em>Is Volatile Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.IsVolatileFlag
	 * @generated
	 */
	public Adapter createIsVolatileFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ObsessOverHost <em>Obsess Over Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ObsessOverHost
	 * @generated
	 */
	public Adapter createObsessOverHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ObsessOverService <em>Obsess Over Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ObsessOverService
	 * @generated
	 */
	public Adapter createObsessOverServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.CheckFreshness <em>Check Freshness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.CheckFreshness
	 * @generated
	 */
	public Adapter createCheckFreshnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.FreshnessThreshold <em>Freshness Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.FreshnessThreshold
	 * @generated
	 */
	public Adapter createFreshnessThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.EventHandler
	 * @generated
	 */
	public Adapter createEventHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.EventHandlerEnabled <em>Event Handler Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.EventHandlerEnabled
	 * @generated
	 */
	public Adapter createEventHandlerEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.LowFlapThreshold <em>Low Flap Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.LowFlapThreshold
	 * @generated
	 */
	public Adapter createLowFlapThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HighFlapThreshold <em>High Flap Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HighFlapThreshold
	 * @generated
	 */
	public Adapter createHighFlapThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.FlapDetectionEnabled <em>Flap Detection Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.FlapDetectionEnabled
	 * @generated
	 */
	public Adapter createFlapDetectionEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostFlapDetectionOptions <em>Host Flap Detection Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostFlapDetectionOptions
	 * @generated
	 */
	public Adapter createHostFlapDetectionOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ProcessPerfData <em>Process Perf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ProcessPerfData
	 * @generated
	 */
	public Adapter createProcessPerfDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.RetainStatusInformation <em>Retain Status Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.RetainStatusInformation
	 * @generated
	 */
	public Adapter createRetainStatusInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.RetainNonstatusInformation <em>Retain Nonstatus Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.RetainNonstatusInformation
	 * @generated
	 */
	public Adapter createRetainNonstatusInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceFlapDetectionOptions <em>Service Flap Detection Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceFlapDetectionOptions
	 * @generated
	 */
	public Adapter createServiceFlapDetectionOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServicegroupName <em>Servicegroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServicegroupName
	 * @generated
	 */
	public Adapter createServicegroupNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceMembers <em>Service Members</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceMembers
	 * @generated
	 */
	public Adapter createServiceMembersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServicegroupMembers <em>Servicegroup Members</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServicegroupMembers
	 * @generated
	 */
	public Adapter createServicegroupMembersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.Servicegroups <em>Servicegroups</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.Servicegroups
	 * @generated
	 */
	public Adapter createServicegroupsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.DependentHostName <em>Dependent Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.DependentHostName
	 * @generated
	 */
	public Adapter createDependentHostNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.DependentHostgroupName <em>Dependent Hostgroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.DependentHostgroupName
	 * @generated
	 */
	public Adapter createDependentHostgroupNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.DependentServiceDescription <em>Dependent Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.DependentServiceDescription
	 * @generated
	 */
	public Adapter createDependentServiceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceDescriptionReference <em>Service Description Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceDescriptionReference
	 * @generated
	 */
	public Adapter createServiceDescriptionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.InheritsParent <em>Inherits Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.InheritsParent
	 * @generated
	 */
	public Adapter createInheritsParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceExecutionFailureCriteria <em>Service Execution Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceExecutionFailureCriteria
	 * @generated
	 */
	public Adapter createServiceExecutionFailureCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.NotificationFailureCriteria <em>Notification Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.NotificationFailureCriteria
	 * @generated
	 */
	public Adapter createNotificationFailureCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.DependencyPeriod <em>Dependency Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.DependencyPeriod
	 * @generated
	 */
	public Adapter createDependencyPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceStalkingOptions <em>Service Stalking Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceStalkingOptions
	 * @generated
	 */
	public Adapter createServiceStalkingOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.FirstNotification <em>First Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.FirstNotification
	 * @generated
	 */
	public Adapter createFirstNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.LastNotification <em>Last Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.LastNotification
	 * @generated
	 */
	public Adapter createLastNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.EscalationPeriod <em>Escalation Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.EscalationPeriod
	 * @generated
	 */
	public Adapter createEscalationPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceEscalationOptions <em>Service Escalation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceEscalationOptions
	 * @generated
	 */
	public Adapter createServiceEscalationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostExecutionFailureCriteria <em>Host Execution Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostExecutionFailureCriteria
	 * @generated
	 */
	public Adapter createHostExecutionFailureCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.ServiceNotificationFailureCriteria <em>Service Notification Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.ServiceNotificationFailureCriteria
	 * @generated
	 */
	public Adapter createServiceNotificationFailureCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostNotificationFailureCriteria <em>Host Notification Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostNotificationFailureCriteria
	 * @generated
	 */
	public Adapter createHostNotificationFailureCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.HostEscalationOptions <em>Host Escalation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.HostEscalationOptions
	 * @generated
	 */
	public Adapter createHostEscalationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.attributes.CanSubmitCommands <em>Can Submit Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.attributes.CanSubmitCommands
	 * @generated
	 */
	public Adapter createCanSubmitCommandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ValueAttribute <em>Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ValueAttribute
	 * @generated
	 */
	public Adapter createValueAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ReferenceAttribute <em>Reference Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ReferenceAttribute
	 * @generated
	 */
	public Adapter createReferenceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.BooleanAttribute <em>Boolean Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.BooleanAttribute
	 * @generated
	 */
	public Adapter createBooleanAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.NameAttribute <em>Name Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.NameAttribute
	 * @generated
	 */
	public Adapter createNameAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.IntegerValueAttribute <em>Integer Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.IntegerValueAttribute
	 * @generated
	 */
	public Adapter createIntegerValueAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ServiceState <em>Service State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ServiceState
	 * @generated
	 */
	public Adapter createServiceStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ServiceNotificationOption <em>Service Notification Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ServiceNotificationOption
	 * @generated
	 */
	public Adapter createServiceNotificationOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.HostState <em>Host State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.HostState
	 * @generated
	 */
	public Adapter createHostStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ServiceFailureCriteria <em>Service Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ServiceFailureCriteria
	 * @generated
	 */
	public Adapter createServiceFailureCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.HostFailureCriteria <em>Host Failure Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.HostFailureCriteria
	 * @generated
	 */
	public Adapter createHostFailureCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AttributesAdapterFactory
