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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import org.eclipse.xtend.util.stdlib.CounterExtensions;

import com.creocode.catalog.generator.core.Generator;

/**
 * @author Szymek
 * @author Artur
 * 
 */
public class RmiCatalogGeneratorServer extends UnicastRemoteObject implements
		RmiCatalogGenerator {
	private static final long serialVersionUID = 490816345289305917L;

	private List<Generator> generatorsList = null;
	private PrintWriter out;

	public RmiCatalogGeneratorServer(OutputStream stream, String serverPort,
			String serverName, List<Generator> generatorsList)
			throws RemoteException {
		String serverAddress;
		Registry registry;

		/**
		 * there is error without this line: it does not see
		 * org::eclipse::xtend::util::stdlib::counter in the template, so we
		 * force to use any class from this package
		 */
		CounterExtensions counterExtensions = new CounterExtensions();

		this.generatorsList = generatorsList;
		out = new PrintWriter(stream);
		out.println("Server starting...");

		try {
			serverAddress = (InetAddress.getLocalHost()).toString();

			out.println("Server address: " + serverAddress);
			out.println("Server port: " + serverPort);

			registry = LocateRegistry.createRegistry(Integer
					.valueOf(serverPort));
			registry.rebind(serverName, this);

			out.println("Server startup: OK");
		} catch (RemoteException e) {
			out.println("Server startup: FAILED");
			e.printStackTrace(out);
		} catch (UnknownHostException e) {
			out.println("Server startup: FAILED");
			e.printStackTrace(out);
		}

		out.flush();
	}

	@Override
	public String generateCatalog(String xml) throws RemoteException {
		
		File xmlFile = new File("received/catalog_tmp.xml");
		try {
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream(xmlFile));
			bos.write(xml.getBytes("UTF-8"), 0, xml.getBytes("UTF-8").length);
			bos.close();
			System.out.println("File saved:" + xmlFile.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String resultCommunicate = "";

		for (Generator generator : generatorsList) {
			StringBuffer sb = new StringBuffer();

			boolean result = generator.generate();

			String className = generator.getClass().getName();
			sb.append("Generation:");
			sb.append(className.substring(className.lastIndexOf('.')));
			sb.append(" ");
			if (result) {
				sb.append("OK");
			} else {
				sb.append("FAILED");
			}
			sb.append("\n");
			String partialString = sb.toString();
			System.out.println(partialString);
			resultCommunicate += partialString;
			out.flush();
		}

		// a tu moze wracac url co gotwej aplikacji jako status udanej
		// kompilacji
		return resultCommunicate;
	}

}
