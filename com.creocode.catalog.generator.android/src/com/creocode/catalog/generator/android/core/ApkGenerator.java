/*******************************************************************************
 * Copyright (c) 2010 Artur Polit
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Artur Polit
 *******************************************************************************/
package com.creocode.catalog.generator.android.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.xtend.util.stdlib.CounterExtensions;

import com.creocode.catalog.generator.core.Generator;

public class ApkGenerator implements Generator {

	private static final String WORKFLOW = "CatalogAndroid/androidWorkflow.mwe";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.creocode.catalog.generator.core.Generator#generate()
	 */
	@Override
	public boolean generate() {

		Map<String, String> properties = new HashMap<String, String>();
		Map<String, ?> slotContents = new HashMap<String, Object>();
		//
		// /**
		// * there is error without this line: it does not see
		// * org::eclipse::xtend::util::stdlib::counter in the template, so we
		// * force to use any class from this package
		// */
		CounterExtensions counterExtensions = new CounterExtensions();

		WorkflowRunner workflowRunner = new WorkflowRunner();
		boolean result = workflowRunner.run(WORKFLOW, new NullProgressMonitor(), properties,
				slotContents);
		if (result == false)
			return false;

		AntRunner runner = new AntRunner();
		runner.setBuildFileLocation("CatalogAndroid/build.xml");
		runner.setArguments("-d");
		try {
			runner.run();
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
