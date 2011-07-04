/*
 * <copyright> 
 *
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 * </copyright>
 */
package org.emona.edit;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.SimpleNameProvider;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IValueSerializer;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.validation.INamesAreUniqueValidationHelper;
import org.emona.edit.converter.NagValueConverter;
import org.emona.edit.errors.NagiosCfgErrorMessageProvider;
import org.emona.edit.formatting.NagiosCfgFormatter;
import org.emona.edit.formatting.NagiosCfgHiddenTokenHelper;
import org.emona.edit.resource.container.SourceSetContainerStateProvider;
import org.emona.edit.serialization.NagiosCfgSerializer;
import org.emona.edit.sourceset.ISourceSetHandler;
import org.emona.edit.sourceset.ModifiableSourceSetHandler;
import org.emona.edit.validation.NagiosNameValidationHelper;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class NagiosCfgRuntimeModule extends org.emona.edit.AbstractNagiosCfgRuntimeModule {
	
	// These to are to provide a flat namespace for all *.cfg files
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return SimpleNameProvider.class;
	}
	
	// @Override
	public Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
		return NagiosCfgErrorMessageProvider.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return NagValueConverter.class;
	}

	// @Override
	public Class<? extends INamesAreUniqueValidationHelper> bindINamesAreUniqueValidationHelper() {
		return NagiosNameValidationHelper.class;
	}
	
	// @Override
	public Class<? extends IValueSerializer> bindIValueSerializer() {
		return NagiosCfgSerializer.class;
	}
	
	@Override
	public Class<? extends IFormatter> bindIFormatter() {
		return NagiosCfgFormatter.class;
	}
	
	// @Override
	public Class<? extends IHiddenTokenHelper>  bindIHiddenTokenHelper() {
		return NagiosCfgHiddenTokenHelper.class;
	}
	
	
	@Override
	public Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return StateBasedContainerManager.class;
	}
	
	public Class<? extends ISourceSetHandler> bindISourceSetHandler() {
		// return org.emona.edit.sourceset.SourceSubsetMock.class;
		return ModifiableSourceSetHandler.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.resource.containers.IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return SourceSetContainerStateProvider.class;
	}





}
