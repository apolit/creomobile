/*******************************************************************************
 * Copyright (c) 2010 Artur Polit, Szymon Ptaszkiewicz
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Szymon Ptaszkiewicz - initial code generation and customization
 *     Artur Polit - customization for Android
 *******************************************************************************/
package com.creocode.catalog.generator.android.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.creocode.catalog.generator.content.ContentGenerator;
import com.creocode.catalog.generator.core.Generator;
import com.creocode.catalog.rmi.RmiCatalogGenerator;
import com.creocode.catalog.rmi.RmiCatalogGeneratorServer;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello, Rmi Runner reporting on duty!");

		List<Generator> generatorsList = new ArrayList<Generator>();
		ContentGenerator contentGenerator = new ContentGenerator();
		contentGenerator.setPath("AndroidCatalog/src/com/creocode/catalog/generator/content");
		generatorsList.add(contentGenerator);
		
//		Generator midletGenerator = new MidletGenerator();
//		generatorsList.add(midletGenerator);
		
		Generator apkGenerator = new ApkGenerator();
		generatorsList.add(apkGenerator);
		
		new RmiCatalogGeneratorServer(System.out,
				RmiCatalogGenerator.DEFAULT_SERVER_PORT,
				RmiCatalogGenerator.DEFAULT_SERVER_NAME, generatorsList);

		Thread.currentThread().join();

		System.out.println("Bye bye, Rmi Runner goes down!");

		return IApplication.EXIT_OK;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		// nothing to do
	}
}
