/*******************************************************************************
 *
 * Copyright (c) 2011  Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 *******************************************************************************/
package org.emona.edit.ui.properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.editor.preferences.AbstractPreferencePage;
import org.eclipse.xtext.ui.editor.preferences.fields.LabelFieldEditor;
import org.emona.edit.sourceset.IModifiableSourceSetHandler;
import org.emona.edit.sourceset.ISourceSetHandler;
import org.emona.edit.ui.NagiosCfgActivator;
import org.emona.edit.ui.properties.SourceTreeContentProvider.SourceSetNode;

import com.google.inject.Inject;

public class SubsetPropertyPage extends AbstractPreferencePage {

	Log log = LogFactory.getLog(SubsetPropertyPage.class);

	private Composite treeField;

	@Inject
	private ISourceSetHandler sourceSet;

	private IProject project;

	private TreeViewer tree;

	private SourceSetNode selectedSubset;

	private URI selectedUri;

	private SourceSetNode selectedUriParent;

	private SourceTreeContentProvider sourceTreeProvider;

	private Button sButton;

	private Button addButton;

	private Button removeButton;

	public void setElement(IAdaptable element) {
		super.setElement(element);
		this.project = (IProject) element.getAdapter(IProject.class);
	}

	public IAdaptable getElement() {
		return project;
	}

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public SubsetPropertyPage() {
		super();
	}

	@Override
	protected String qualifiedName() {
		return "NagiosCfg.subsets";
	}

	
	@Override
	protected void createFieldEditors() {
		addField(new LabelFieldEditor(Messages.SubsetPropertyPage_6,
				getFieldEditorParent()));
		createTree(getFieldEditorParent());
	}

	public Control createTree(Composite parent) {
		System.out.println("Creating tree property page");
		treeField = new Composite(parent, SWT.NONE);
		treeField.setFont(parent.getFont());

		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.numColumns = 1;
		treeField.setLayout(layout);

		TabFolder folder = new TabFolder(treeField, SWT.NONE);
		folder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		folder.setFont(treeField.getFont());

		TabItem item;
		item = new TabItem(folder, SWT.NONE);
		item.setText("Source Folder");

		GridLayout tabLayout = new GridLayout();
		tabLayout.marginWidth = 0;
		tabLayout.marginHeight = 0;
		tabLayout.numColumns = 2;
		folder.setLayout(tabLayout);

		Composite srcFolderComposite = new Composite(folder, SWT.NONE);
		GridData srcGData = new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 3);
		srcGData.widthHint = 400;
		srcGData.heightHint = 200;
		srcFolderComposite.setLayoutData(srcGData);

		srcFolderComposite.setBackground(parent.getDisplay().getSystemColor(
				SWT.COLOR_WHITE));

		FillLayout rowLayout = new FillLayout();
		rowLayout.type = SWT.VERTICAL;
		srcFolderComposite.setLayout(rowLayout);

		sButton = new Button(folder, SWT.NONE);
		sButton.setText("Add Source Set");
		sButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
		sButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				applySourceSetName();

			}
		});

		addButton = new Button(folder, SWT.NONE);
		addButton.setText("Add Folder");
		addButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Object[] files = getDirectories();
				System.out.println("SELECTED: " + selectedSubset);
				if (selectedSubset != null) {
					for (int i = 0; i < files.length; i++) {
						System.out.println("FILE: " + files[i]);
						if (files[i] instanceof IFolder) {
							String path = ((IFolder)files[i]).getFullPath().toString();
							URI uri = URI.createPlatformResourceURI(path, true);
							selectedSubset.addURI(uri);
							tree.refresh(selectedSubset);

						}
						System.out.println("DIR: "
								+ files[i].getClass().getName());
					}
				}
			}
		});
		addButton.setEnabled(false);

		removeButton = new Button(folder, SWT.NONE);
		removeButton.setText("Remove");
		removeButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false));
		removeButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				if (selectedUri != null) {
					System.out.println("Removing uri");
					selectedUriParent.removeURI(selectedUri);
					tree.refresh(selectedUriParent);
				} else if (selectedSubset != null) {
					System.out.println("Removing sourceSet");
					sourceTreeProvider.removeSourceSetNode(selectedSubset);
					tree.remove(selectedSubset);
					tree.refresh(true);
				}
			}
		});
		removeButton.setEnabled(false);

		// TODO: Filter for folders / files

		tree = new TreeViewer(srcFolderComposite);
		sourceTreeProvider = new SourceTreeContentProvider(project);
		tree.setContentProvider(sourceTreeProvider);
		tree.setLabelProvider(new SourceTreeLabelProvider());

		tree.setInput(sourceSet);

		tree.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				System.out.println("EVENT: " + event + "   "
						+ event.getClass().getName());
				System.out.println("SELECT: " + event.getSelection() + "  "
						+ event.getSelection().getClass().getName());
				TreeSelection select = (TreeSelection) event.getSelection();
				if (!select.isEmpty()) {
					System.out.println("FIRST" + select.getFirstElement()
							+ "   "
							+ select.getFirstElement().getClass().getName());
					System.out.println("PATH " + select.getPaths());
					if (select.getFirstElement() instanceof SourceSetNode) {
						removeButton.setEnabled(true);
						addButton.setEnabled(true);
						sButton.setEnabled(true);
						selectedSubset = (SourceSetNode) select
								.getFirstElement();
						selectedUri = null;
					} else if (select.getFirstElement() instanceof URI) {
						removeButton.setEnabled(true);
						addButton.setEnabled(false);
						sButton.setEnabled(false);
						selectedUri = (URI) select.getFirstElement();
						TreePath[] paths = select.getPathsFor(selectedUri);
						if (paths.length > 0) {
							int count = paths[0].getSegmentCount();
							selectedUriParent = (SourceSetNode) paths[0]
									.getSegment(count - 2);
						}
					} else {
						selectedSubset = null;
						selectedUri = null;
					}
				} else {
					selectedSubset = null;
					selectedUri = null;
				}

			}
		});

		tree.expandAll();

		return treeField;
	}

	protected void applySourceSetName() {
		InputDialog dialog = new InputDialog(getShell(), "Source Set Name",
				"Set the source set name", "", null);
		dialog.open();
		String newSet = dialog.getValue();
		tree.add(sourceSet, sourceTreeProvider.addSourceSetNode(newSet,
				(IModifiableSourceSetHandler) sourceSet));
		tree.refresh(true);
	}

	@Override
	protected void updateFieldEditors(boolean enabled) {
		super.updateFieldEditors(enabled);
		setEnabledWithChilds(treeField, enabled);
	}

	private void setEnabledWithChilds(Control control, boolean enabled) {
		if (enabled && control != addButton && control != removeButton) {
			control.setEnabled(enabled);
		}
		if (control instanceof Composite) {
			Composite comp = (Composite) control;
			Control[] childs = comp.getChildren();
			for (int i = 0; i < childs.length; i++) {
				setEnabledWithChilds(childs[i], enabled);
			}
		}
	}

	private Object[] getDirectories() {
		// ContainerSelectionDialog dialog = new ContainerSelectionDialog(
		//		getShell(), project, true, "Select Directories");

		// ResourceSelectionDialog dialog = new ResourceSelectionDialog(getShell(), project, "Select Directories");
		
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
		dialog.setTitle("Tree Selection");
		dialog.setMessage("Select the elements from the tree:");
		dialog.addFilter(new ViewerFilter() {
			
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				// TODO Auto-generated method stub
				if (element instanceof IContainer) {
					IContainer container = (IContainer) element;
					return !sourceTreeProvider.isPathUsed(container.getFullPath());
				} 
				return false;
			}
		});
		dialog.setInput(project);
		dialog.open();
		return dialog.getResult();

	}

	@Override
	public boolean performOk() {
		boolean retVal = super.performOk();
		sourceTreeProvider.applyChanges();
		if (retVal && isPropertyPage()) {
			try {
				project.setPersistentProperty(new QualifiedName(
						qualifiedName(), NagiosCfgActivator.SOURCE_SETS),
						sourceSet.serialize(project.getName()));
				((IPersistentPreferenceStore) getPreferenceStore()).save();
			} catch (Exception e) {
				log.error("Error while saving preferences: ", e); //$NON-NLS-1$
				retVal = false;

			}
		}

		try {
			if (log.isDebugEnabled())
				log.debug("Building project "
						+ sourceSet.serialize(project.getName()));
			project.touch(null);
			project.build(IncrementalProjectBuilder.FULL_BUILD,
					XtextProjectHelper.BUILDER_ID, null, null);
		} catch (CoreException e) {
			log.error("Exception occured during build", e);
		}

		return retVal;
	}
}