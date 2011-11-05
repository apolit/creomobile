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
package com.creocode.catalog.actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.statushandlers.StatusManager;

import com.creocode.catalog.rmi.RmiCatalogGenerator;
import com.creocode.catalog.rmi.RmiCatalogGeneratorClient;

/**
 * @author Szymek
 * 
 */
public class GenerateCatalog implements IObjectActionDelegate {
	private static MessageConsole console;
	private static MessageConsoleStream stream;

	static {
		console = new MessageConsole("Generate catalog console", null);
		stream = console.newMessageStream();
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(
				new IConsole[] { console });
	}

	private ISelection selection;

	private static void log(String text) {
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
		stream.println(text);
	}

	private void generateCatalog(IFile file) throws IOException {
		String filePath;
		BufferedReader reader;
		StringBuilder builder;
		String line;
		String xml;

		filePath = file.getLocation().toString();

		log(filePath);

		reader = new BufferedReader(new FileReader(filePath));
		builder = new StringBuilder();

		line = reader.readLine();
		while (line != null) {
			builder.append(line);
			builder.append("\n");

			line = reader.readLine();
		}
		reader.close();

		xml = builder.toString();

		// TODO uzycie web service'u

		log("starting generation");

		RmiCatalogGeneratorClient client;
		client = new RmiCatalogGeneratorClient(stream,
				RmiCatalogGenerator.DEFAULT_SERVER_ADDRESS,
				RmiCatalogGenerator.DEFAULT_SERVER_PORT,
				RmiCatalogGenerator.DEFAULT_SERVER_NAME);

		client.generateCatalog(xml);

		log("end of generation");
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				try {
					generateCatalog((IFile) it.next());
				} catch (FileNotFoundException e) {
					StatusManager.getManager().handle(
							new Status(Status.ERROR, "sa.catalog.editor", e
									.getMessage(), e), StatusManager.LOG);
				} catch (IOException e) {
					StatusManager.getManager().handle(
							new Status(Status.ERROR, "sa.catalog.editor", e
									.getMessage(), e), StatusManager.LOG);
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}
