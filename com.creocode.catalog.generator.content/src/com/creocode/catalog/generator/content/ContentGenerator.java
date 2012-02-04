/*******************************************************************************
 * Copyright (c) 2010 Artur Polit, Szymon Ptaszkiewicz
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Szymon Ptaszkiewicz - initial code generation and customization
 *******************************************************************************/
package com.creocode.catalog.generator.content;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.xtend.util.stdlib.CounterExtensions;

import com.creocode.catalog.generator.core.Generator;

public class ContentGenerator implements Generator {

	private String path;

	public boolean generate() {

		Map<String, String> properties = new HashMap<String, String>();
		properties.put("outlet.path", getPath());
		
		Map<String, ?> slotContents = new HashMap<String, Object>();

		/**
		 * there is error without this line: it does not see
		 * org::eclipse::xtend::util::stdlib::counter in the template, so we
		 * force to use any class from this package
		 */
		CounterExtensions counterExtensions = new CounterExtensions();

		WorkflowRunner runner = new WorkflowRunner();
		//http://help.eclipse.org/galileo/index.jsp?topic=/org.eclipse.emf.mwe.doc/help/workflow_reference_workflow_configuration.html
		boolean result = runner.run("CatalogContent/catalogWorkflow.mwe",
				new NullProgressMonitor(), properties, slotContents);
		return result;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
