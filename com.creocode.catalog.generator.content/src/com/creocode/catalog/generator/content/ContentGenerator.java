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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.ExceptionHandler;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.NullEvaluationHandler;
import org.eclipse.xtend.typesystem.xsd.XMLReader;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;

import com.creocode.catalog.generator.core.Generator;

public class ContentGenerator implements Generator {
	

	private String path;

	public boolean generate() {
		XSDMetaModel metamodel = new XSDMetaModel();
		metamodel.addSchemaFile("resources/catalog.xsd");
		
		
		WorkflowContextImpl ctx = new WorkflowContextImpl();
		
		XMLReader xmlReader = new XMLReader();
		xmlReader.setModelSlot("model");
		xmlReader.addMetaModel(metamodel);
		xmlReader.setUri("received/catalog_tmp.xml");
		xmlReader.invoke(ctx);
		
		EObject target = (EObject) ctx.get("model");
		
		// configure outlets
		OutputImpl output = new OutputImpl();
		Outlet outlet = new Outlet(path);
		
		outlet.setOverwrite(true);
		output.addOutlet(outlet);

		ExceptionHandler handler = new ExceptionHandler() {
			
			@Override
			public void handleRuntimeException(RuntimeException ex, SyntaxElement element,
					ExecutionContext ctx, Map<String, Object> additionalContextInfo) {
				System.out.println(ex.getMessage());
				
			}
		};
		// create execution context
		Map globalVarsMap = new HashMap();
		
		NullEvaluationHandler handler2 = new NullEvaluationHandler() {
			
			@Override
			public Object handleNullEvaluation(SyntaxElement element, ExecutionContext ctx) {
				System.out.println(element.toString());
				return null;
			}
		};
		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null,
				globalVarsMap,handler, handler2 );
		
	
		execCtx.registerMetaModel(metamodel);

		
		// generate
		
		XpandFacade facade = XpandFacade.create(execCtx);
		String templatePath = "CatalogContent::catalogTemplate2::Root";
		try {
			facade.evaluate(templatePath, target);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return true;

//		 Map<String, String> properties = new HashMap<String, String>();
//		 Map<String, ?> slotContents = new HashMap<String, Object>();
//		
//		 /**
//		 * there is error without this line:
//		 * it does not see org::eclipse::xtend::util::stdlib::counter
//		 * in the template, so we force to use any class from this package
//		 */
//		 CounterExtensions counterExtensions = new CounterExtensions();
//		
//		 WorkflowRunner runner = new WorkflowRunner();
//		
//		 boolean result = runner
//		 .run("MobileCatalog/catalogWorkflow.mwe", new NullProgressMonitor(), properties,
//		 slotContents);
//		 return result;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
