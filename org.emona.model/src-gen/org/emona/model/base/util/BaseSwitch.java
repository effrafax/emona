/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emona.model.base.*;

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
 * @see org.emona.model.base.BasePackage
 * @generated
 */
public class BaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseSwitch() {
		if (modelPackage == null) {
			modelPackage = BasePackage.eINSTANCE;
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
		case BasePackage.MON_OBJECT: {
			MonObject monObject = (MonObject) theEObject;
			T result = caseMonObject(monObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.NAME_ATTRIBUTE: {
			NameAttribute nameAttribute = (NameAttribute) theEObject;
			T result = caseNameAttribute(nameAttribute);
			if (result == null)
				result = caseAttribute(nameAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.VALUE_ATTRIBUTE: {
			ValueAttribute valueAttribute = (ValueAttribute) theEObject;
			T result = caseValueAttribute(valueAttribute);
			if (result == null)
				result = caseAttribute(valueAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.BOOLEAN_ATTRIBUTE: {
			BooleanAttribute booleanAttribute = (BooleanAttribute) theEObject;
			T result = caseBooleanAttribute(booleanAttribute);
			if (result == null)
				result = caseAttribute(booleanAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.REFERENCE_ATTRIBUTE: {
			ReferenceAttribute referenceAttribute = (ReferenceAttribute) theEObject;
			T result = caseReferenceAttribute(referenceAttribute);
			if (result == null)
				result = caseAttribute(referenceAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.INTEGER_VALUE_ATTRIBUTE: {
			IntegerValueAttribute integerValueAttribute = (IntegerValueAttribute) theEObject;
			T result = caseIntegerValueAttribute(integerValueAttribute);
			if (result == null)
				result = caseAttribute(integerValueAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICE_FAILURE_CRITERIA: {
			ServiceFailureCriteria serviceFailureCriteria = (ServiceFailureCriteria) theEObject;
			T result = caseServiceFailureCriteria(serviceFailureCriteria);
			if (result == null)
				result = caseServiceState(serviceFailureCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICE_STATE: {
			ServiceState serviceState = (ServiceState) theEObject;
			T result = caseServiceState(serviceState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICE_NOTIFICATION_OPTION: {
			ServiceNotificationOption serviceNotificationOption = (ServiceNotificationOption) theEObject;
			T result = caseServiceNotificationOption(serviceNotificationOption);
			if (result == null)
				result = caseServiceState(serviceNotificationOption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.HOST_STATE: {
			HostState hostState = (HostState) theEObject;
			T result = caseHostState(hostState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.HOST_FAILURE_CRITERIA: {
			HostFailureCriteria hostFailureCriteria = (HostFailureCriteria) theEObject;
			T result = caseHostFailureCriteria(hostFailureCriteria);
			if (result == null)
				result = caseHostState(hostFailureCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.CONFIG_OBJECT: {
			ConfigObject configObject = (ConfigObject) theEObject;
			T result = caseConfigObject(configObject);
			if (result == null)
				result = caseInfoObject(configObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.INFO_OBJECT: {
			InfoObject infoObject = (InfoObject) theEObject;
			T result = caseInfoObject(infoObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.COMMENT_LINE: {
			CommentLine commentLine = (CommentLine) theEObject;
			T result = caseCommentLine(commentLine);
			if (result == null)
				result = caseInfoObject(commentLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.HOST: {
			Host host = (Host) theEObject;
			T result = caseHost(host);
			if (result == null)
				result = caseConfigObject(host);
			if (result == null)
				result = caseInfoObject(host);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.HOSTGROUP: {
			Hostgroup hostgroup = (Hostgroup) theEObject;
			T result = caseHostgroup(hostgroup);
			if (result == null)
				result = caseConfigObject(hostgroup);
			if (result == null)
				result = caseInfoObject(hostgroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseConfigObject(service);
			if (result == null)
				result = caseInfoObject(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICEGROUP: {
			Servicegroup servicegroup = (Servicegroup) theEObject;
			T result = caseServicegroup(servicegroup);
			if (result == null)
				result = caseConfigObject(servicegroup);
			if (result == null)
				result = caseInfoObject(servicegroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICEDEPENDENCY: {
			Servicedependency servicedependency = (Servicedependency) theEObject;
			T result = caseServicedependency(servicedependency);
			if (result == null)
				result = caseConfigObject(servicedependency);
			if (result == null)
				result = caseInfoObject(servicedependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.HOSTDEPENDENCY: {
			Hostdependency hostdependency = (Hostdependency) theEObject;
			T result = caseHostdependency(hostdependency);
			if (result == null)
				result = caseConfigObject(hostdependency);
			if (result == null)
				result = caseInfoObject(hostdependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICEESCALATION: {
			Serviceescalation serviceescalation = (Serviceescalation) theEObject;
			T result = caseServiceescalation(serviceescalation);
			if (result == null)
				result = caseConfigObject(serviceescalation);
			if (result == null)
				result = caseInfoObject(serviceescalation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.HOSTESCALATION: {
			Hostescalation hostescalation = (Hostescalation) theEObject;
			T result = caseHostescalation(hostescalation);
			if (result == null)
				result = caseConfigObject(hostescalation);
			if (result == null)
				result = caseInfoObject(hostescalation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.SERVICEEXTINFO: {
			Serviceextinfo serviceextinfo = (Serviceextinfo) theEObject;
			T result = caseServiceextinfo(serviceextinfo);
			if (result == null)
				result = caseConfigObject(serviceextinfo);
			if (result == null)
				result = caseInfoObject(serviceextinfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.HOSTEXTINFO: {
			Hostextinfo hostextinfo = (Hostextinfo) theEObject;
			T result = caseHostextinfo(hostextinfo);
			if (result == null)
				result = caseConfigObject(hostextinfo);
			if (result == null)
				result = caseInfoObject(hostextinfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = caseConfigObject(command);
			if (result == null)
				result = caseInfoObject(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.TIMEPERIOD: {
			Timeperiod timeperiod = (Timeperiod) theEObject;
			T result = caseTimeperiod(timeperiod);
			if (result == null)
				result = caseConfigObject(timeperiod);
			if (result == null)
				result = caseInfoObject(timeperiod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.CONTACT: {
			Contact contact = (Contact) theEObject;
			T result = caseContact(contact);
			if (result == null)
				result = caseConfigObject(contact);
			if (result == null)
				result = caseInfoObject(contact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasePackage.CONTACTGROUP: {
			Contactgroup contactgroup = (Contactgroup) theEObject;
			T result = caseContactgroup(contactgroup);
			if (result == null)
				result = caseConfigObject(contactgroup);
			if (result == null)
				result = caseInfoObject(contactgroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mon Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mon Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonObject(MonObject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Config Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigObject(ConfigObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoObject(InfoObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentLine(CommentLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHost(Host object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostgroup(Hostgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicegroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicegroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicegroup(Servicegroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicedependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicedependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicedependency(Servicedependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostdependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostdependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostdependency(Hostdependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serviceescalation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serviceescalation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceescalation(Serviceescalation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostescalation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostescalation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostescalation(Hostescalation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serviceextinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serviceextinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceextinfo(Serviceextinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostextinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostextinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostextinfo(Hostextinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeperiod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeperiod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeperiod(Timeperiod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contactgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contactgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactgroup(Contactgroup object) {
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

} //BaseSwitch
