/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Remy Chi Jian Suen <remy.suen@gmail.com>
 *     		- Bug 44162 [Wizards]  Define constants for wizard ids of new.file, new.folder, and new.project
 *     Remy Chi Jian Suen - Bug 208804 [CommonNavigator] change "Navigator" view perspective links
 *     Artur Polit - perspective modifications for the Catalog Editor
  *******************************************************************************/
package sa.catalog.editor.customization;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsolePageParticipant;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.internal.console.ConsoleView;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.eclipse.ui.wizards.newresource.BasicNewFolderResourceWizard;

import sa.catalog.editor.views.ItemView;

/**
 */
public class CatedPerspective implements IPerspectiveFactory {
	
    /**
     * Constructs a new Default layout engine.
     */
    public CatedPerspective() {
        super();
    }

    /**
     * Defines the initial layout for a perspective.
     *
     * Implementors of this method may add additional views to a
     * perspective.  The perspective already contains an editor folder
     * with <code>ID = ILayoutFactory.ID_EDITORS</code>.  Add additional views
     * to the perspective in reference to the editor folder.
     *
     * This method is only called when a new perspective is created.  If
     * an old perspective is restored from a persistence file then
     * this method is not called.
     *
     * @param layout the factory used to add views to the perspective
     */
    public void createInitialLayout(IPageLayout layout) {
        defineActions(layout);
        defineLayout(layout);
    }

    /**
     * Defines the initial actions for a page.
     * @param layout The layout we are filling
     */
    public void defineActions(IPageLayout layout) {
        // Add "new wizards".
        layout.addNewWizardShortcut(BasicNewFolderResourceWizard.WIZARD_ID);
        layout.addNewWizardShortcut(BasicNewFileResourceWizard.WIZARD_ID);

        // Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
        layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        layout.addShowViewShortcut(IPageLayout.ID_PROGRESS_VIEW);
        layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);

        layout.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET);
    }

    /**
     * Defines the initial layout for a page.
     * @param layout The layout we are filling
     */
    public void defineLayout(IPageLayout layout) {
        // Editors are placed for free.
        String editorArea = layout.getEditorArea();

        // Top left.
        IFolderLayout topLeft = layout.createFolder(
                "topLeft", IPageLayout.LEFT, 0.26f, editorArea);//$NON-NLS-1$
		topLeft.addView(IPageLayout.ID_PROJECT_EXPLORER);
        topLeft.addPlaceholder(IPageLayout.ID_BOOKMARKS);

        // Add a placeholder for the old navigator to maintain compatibility
        topLeft.addPlaceholder("org.eclipse.ui.views.ResourceNavigator"); //$NON-NLS-1$

        IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.66f, editorArea);
        right.addView(ItemView.ID);
        
        // Bottom left.
        IFolderLayout bottomLeft = layout.createFolder(
                "bottomLeft", IPageLayout.BOTTOM, (float) 0.50,//$NON-NLS-1$
                "topLeft");//$NON-NLS-1$
       bottomLeft.addView(IPageLayout.ID_OUTLINE);

        // Bottom right.
		IFolderLayout bottomRight = layout.createFolder(
                "bottomRight", IPageLayout.BOTTOM, (float) 0.66,//$NON-NLS-1$
                editorArea);
		
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);
		bottomRight.addPlaceholder(IConsoleConstants.ID_CONSOLE_VIEW);
		
    }
}




///*******************************************************************************
// * Copyright (c) 2006 IBM Corporation and others.
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     IBM Corporation - initial API and implementation
// *******************************************************************************/
//package sa.catalog.editor.perspectives;
//
//import org.eclipse.jdt.ui.JavaUI;
//import org.eclipse.ui.IFolderLayout;
//import org.eclipse.ui.IPageLayout;
//import org.eclipse.ui.IPerspectiveFactory;
//import org.eclipse.ui.console.IConsoleConstants;
//import org.eclipse.ui.internal.ide.application.ResourcePerspective;
//
///**
// *  This class is meant to serve as an example for how various contributions 
// *  are made to a perspective. Note that some of the extension point id's are
// *  referred to as API constants while others are hardcoded and may be subject 
// *  to change. 
// */
//public class CatedPerspective extends ResourcePerspective implements IPerspectiveFactory{
//
//	@Override
//	public void createInitialLayout(IPageLayout layout) {
//		super.createInitialLayout(layout);
//	}
//
//	private IPageLayout factory;
//
//	public CatedPerspective() {
//		super();
//	}
//
//
//	private void addViews() {
//		// Creates the overall folder layout. 
//		// Note that each new Folder uses a percentage of the remaining EditorArea.
//		
//		IFolderLayout bottom =
//			factory.createFolder(
//				"bottomRight", //NON-NLS-1
//				IPageLayout.BOTTOM,
//				0.75f,
//				factory.getEditorArea());
//		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
//		bottom.addView("org.eclipse.team.ui.GenericHistoryView"); //NON-NLS-1
//		bottom.addPlaceholder(IConsoleConstants.ID_CONSOLE_VIEW);
//
//		IFolderLayout topLeft =
//			factory.createFolder(
//				"topLeft", //NON-NLS-1
//				IPageLayout.LEFT,
//				0.25f,
//				factory.getEditorArea());
//		topLeft.addView(IPageLayout.ID_RES_NAV);
//		topLeft.addView("org.eclipse.jdt.junit.ResultView"); //NON-NLS-1
//		
//		factory.addFastView("org.eclipse.team.ccvs.ui.RepositoriesView",0.50f); //NON-NLS-1
//		factory.addFastView("org.eclipse.team.sync.views.SynchronizeView", 0.50f); //NON-NLS-1
//	}
//
//	private void addActionSets() {
//		factory.addActionSet("org.eclipse.debug.ui.launchActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.debug.ui.debugActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.debug.ui.profileActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.jdt.debug.ui.JDTDebugActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.jdt.junit.JUnitActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.team.ui.actionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.team.cvs.ui.CVSActionSet"); //NON-NLS-1
//		factory.addActionSet("org.eclipse.ant.ui.actionSet.presentation"); //NON-NLS-1
//		factory.addActionSet(JavaUI.ID_ACTION_SET);
//		factory.addActionSet(JavaUI.ID_ELEMENT_CREATION_ACTION_SET);
//		factory.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET); //NON-NLS-1
//	}
//
//	private void addPerspectiveShortcuts() {
//		factory.addPerspectiveShortcut("org.eclipse.team.ui.TeamSynchronizingPerspective"); //NON-NLS-1
//		factory.addPerspectiveShortcut("org.eclipse.team.cvs.ui.cvsPerspective"); //NON-NLS-1
//		factory.addPerspectiveShortcut("org.eclipse.ui.resourcePerspective"); //NON-NLS-1
//	}
//
//	private void addNewWizardShortcuts() {
//		factory.addNewWizardShortcut("org.eclipse.team.cvs.ui.newProjectCheckout");//NON-NLS-1
//		factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");//NON-NLS-1
//		factory.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");//NON-NLS-1
//	}
//
//	private void addViewShortcuts() {
//		factory.addShowViewShortcut("org.eclipse.ant.ui.views.AntView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.team.ccvs.ui.AnnotateView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.pde.ui.DependenciesView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.jdt.junit.ResultView"); //NON-NLS-1
//		factory.addShowViewShortcut("org.eclipse.team.ui.GenericHistoryView"); //NON-NLS-1
//		factory.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
//		factory.addShowViewShortcut(JavaUI.ID_PACKAGES);
//		factory.addShowViewShortcut(IPageLayout.ID_RES_NAV);
//		factory.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
//		factory.addShowViewShortcut(IPageLayout.ID_OUTLINE);
//	}
//
//}
