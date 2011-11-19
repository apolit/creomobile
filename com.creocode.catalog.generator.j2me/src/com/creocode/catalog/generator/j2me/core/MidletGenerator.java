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
package com.creocode.catalog.generator.j2me.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.xtend.util.stdlib.CounterExtensions;

import com.creocode.catalog.generator.core.Generator;

public class MidletGenerator implements Generator {
	private static final String WORKFLOW = "CatalogME/midletWorkflow.mwe";
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.creocode.catalog.generator.core.Generator#generate()
	 */
	@Override
	public boolean generate() {


// configure outlets
		
//		Outlet outlet = new Outlet("./CatalogME");
//		outlet.setOverwrite(true);
//				
//		OutputImpl output = new OutputImpl();
//		output.addOutlet(outlet);
//
//		// create execution context
//		Map globalVarsMap = new HashMap();
//		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null,
//				globalVarsMap, null, null);
//		XSDMetaModel metamodel = new XSDMetaModel();
//		metamodel.addSchemaFile("resources/catalog.xsd");
//		metamodel.setId("catalog");
//		execCtx.registerMetaModel(metamodel);
//
//
//		
//		WorkflowContextImpl ctx = new WorkflowContextImpl();
//		
//		XMLReader xmlReader = new XMLReader();
//		xmlReader.setModelSlot("model");
//		xmlReader.addMetaModel(metamodel);
//		xmlReader.setUri("received/catalog_tmp.xml");
//		xmlReader.invoke(ctx);
//		
//		EObject target = (EObject) ctx.get("model");
//
//		// generate
//		XpandFacade facade = XpandFacade.create(execCtx);
//		
//		try {
//			facade.evaluate("CatalogME::descriptorTemplate::Root", target);
//			facade.evaluate("CatalogME::buildTemplate::Root", target);
//			facade.evaluate("CatalogME::symbolsTemplate::Root", target);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
		Map<String, String> properties = new HashMap<String, String>();
		Map<String, ?> slotContents = new HashMap<String, Object>();

		/**
		 * there is error without this line: it does not see
		 * org::eclipse::xtend::util::stdlib::counter in the template, so we
		 * force to use any class from this package
		 */
		CounterExtensions counterExtensions = new CounterExtensions();

		WorkflowRunner workflowRunner = new WorkflowRunner();
		boolean result = workflowRunner.run(WORKFLOW, new NullProgressMonitor(), properties,
				slotContents);
		if (result == false)
			return false;
		
		AntRunner runner = new AntRunner();
		//runner.setPropertyFiles(new String[] { "CatalogME/mtj-build/mtj-build.properties" });
		runner.setBuildFileLocation("CatalogME/mtj-build/mtj-build-generated.xml");
		
		// runner.setArguments("-Dmessage=Building -verbose");
		//runner.setArguments("-Dbasedir=/home/artur/ws/workspace-netbuilder/CatalogME");
		try {
			runner.run();
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
