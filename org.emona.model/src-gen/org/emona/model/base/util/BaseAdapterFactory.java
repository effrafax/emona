/**
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.emona.model.base.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emona.model.base.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emona.model.base.BasePackage
 * @generated
 */
public class BaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasePackage.eINSTANCE;
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
	protected BaseSwitch<Adapter> modelSwitch = new BaseSwitch<Adapter>() {
		@Override
		public Adapter caseMonObject(MonObject object) {
			return createMonObjectAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseNameAttribute(NameAttribute object) {
			return createNameAttributeAdapter();
		}

		@Override
		public Adapter caseValueAttribute(ValueAttribute object) {
			return createValueAttributeAdapter();
		}

		@Override
		public Adapter caseBooleanAttribute(BooleanAttribute object) {
			return createBooleanAttributeAdapter();
		}

		@Override
		public Adapter caseReferenceAttribute(ReferenceAttribute object) {
			return createReferenceAttributeAdapter();
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
		public Adapter caseServiceNotificationOption(
				ServiceNotificationOption object) {
			return createServiceNotificationOptionAdapter();
		}

		@Override
		public Adapter caseConfigObject(ConfigObject object) {
			return createConfigObjectAdapter();
		}

		@Override
		public Adapter caseInfoObject(InfoObject object) {
			return createInfoObjectAdapter();
		}

		@Override
		public Adapter caseCommentLine(CommentLine object) {
			return createCommentLineAdapter();
		}

		@Override
		public Adapter caseHost(Host object) {
			return createHostAdapter();
		}

		@Override
		public Adapter caseHostgroup(Hostgroup object) {
			return createHostgroupAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseServicegroup(Servicegroup object) {
			return createServicegroupAdapter();
		}

		@Override
		public Adapter caseServicedependency(Servicedependency object) {
			return createServicedependencyAdapter();
		}

		@Override
		public Adapter caseHostdependency(Hostdependency object) {
			return createHostdependencyAdapter();
		}

		@Override
		public Adapter caseServiceescalation(Serviceescalation object) {
			return createServiceescalationAdapter();
		}

		@Override
		public Adapter caseHostescalation(Hostescalation object) {
			return createHostescalationAdapter();
		}

		@Override
		public Adapter caseServiceextinfo(Serviceextinfo object) {
			return createServiceextinfoAdapter();
		}

		@Override
		public Adapter caseHostextinfo(Hostextinfo object) {
			return createHostextinfoAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseTimeperiod(Timeperiod object) {
			return createTimeperiodAdapter();
		}

		@Override
		public Adapter caseContact(Contact object) {
			return createContactAdapter();
		}

		@Override
		public Adapter caseContactgroup(Contactgroup object) {
			return createContactgroupAdapter();
		}

		@Override
		public Adapter caseObjectContent(ObjectContent object) {
			return createObjectContentAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.MonObject <em>Mon Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.MonObject
	 * @generated
	 */
	public Adapter createMonObjectAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ConfigObject <em>Config Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ConfigObject
	 * @generated
	 */
	public Adapter createConfigObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.InfoObject <em>Info Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.InfoObject
	 * @generated
	 */
	public Adapter createInfoObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.CommentLine <em>Comment Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.CommentLine
	 * @generated
	 */
	public Adapter createCommentLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Host
	 * @generated
	 */
	public Adapter createHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Hostgroup <em>Hostgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Hostgroup
	 * @generated
	 */
	public Adapter createHostgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Servicegroup <em>Servicegroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Servicegroup
	 * @generated
	 */
	public Adapter createServicegroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Servicedependency <em>Servicedependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Servicedependency
	 * @generated
	 */
	public Adapter createServicedependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Hostdependency <em>Hostdependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Hostdependency
	 * @generated
	 */
	public Adapter createHostdependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Serviceescalation <em>Serviceescalation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Serviceescalation
	 * @generated
	 */
	public Adapter createServiceescalationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Hostescalation <em>Hostescalation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Hostescalation
	 * @generated
	 */
	public Adapter createHostescalationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Serviceextinfo <em>Serviceextinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Serviceextinfo
	 * @generated
	 */
	public Adapter createServiceextinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Hostextinfo <em>Hostextinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Hostextinfo
	 * @generated
	 */
	public Adapter createHostextinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Timeperiod <em>Timeperiod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Timeperiod
	 * @generated
	 */
	public Adapter createTimeperiodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.Contactgroup <em>Contactgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.Contactgroup
	 * @generated
	 */
	public Adapter createContactgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emona.model.base.ObjectContent <em>Object Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emona.model.base.ObjectContent
	 * @generated
	 */
	public Adapter createObjectContentAdapter() {
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

} //BaseAdapterFactory
