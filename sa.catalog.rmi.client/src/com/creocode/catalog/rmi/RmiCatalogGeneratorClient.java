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
package com.creocode.catalog.rmi;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Szymek
 * 
 */
public class RmiCatalogGeneratorClient {
	private PrintWriter out;
	private RmiCatalogGenerator server;

	public RmiCatalogGeneratorClient(OutputStream stream, String serverAddress,
			String serverPort, String serverName) {
		Registry registry;

		out = new PrintWriter(stream);

		try {
			registry = LocateRegistry.getRegistry(serverAddress, Integer
					.valueOf(serverPort));

			server = (RmiCatalogGenerator) (registry.lookup(serverName));

			out.println("Server startup: OK");
		} catch (RemoteException e) {
			out.println("Server startup: FAILED");
			e.printStackTrace(out);
		} catch (NotBoundException e) {
			out.println("Server startup: FAILED");
			e.printStackTrace(out);
		}

		out.flush();
	}

	public String generateCatalog(String xml) {
		String status;

		status = "<status unavailable>";

		try {
			status = server.generateCatalog(xml);
		} catch (RemoteException e) {
		} finally {
			out.println("Generate catalog server status:\n" + status);
			out.flush();
		}
		return status;
	}
}
