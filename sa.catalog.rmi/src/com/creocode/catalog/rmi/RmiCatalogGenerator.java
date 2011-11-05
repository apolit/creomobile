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

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Szymek
 * 
 */
public interface RmiCatalogGenerator extends Remote {
	public static final String DEFAULT_SERVER_NAME = "com.creocode.catalog.rmi.RmiCatalogGeneratorServer";
	public static final String DEFAULT_SERVER_ADDRESS = "127.0.0.1";
	public static final String DEFAULT_SERVER_PORT = "5550";

	public String generateCatalog(String xml) throws RemoteException;
}
