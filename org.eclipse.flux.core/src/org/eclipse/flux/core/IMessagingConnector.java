/*******************************************************************************
 * Copyright (c) 2013, 2014 Pivotal Software, Inc. and others.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 
 * (http://www.eclipse.org/legal/epl-v10.html), and the Eclipse Distribution 
 * License v1.0 (http://www.eclipse.org/org/documents/edl-v10.html). 
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
*******************************************************************************/
package org.eclipse.flux.core;

import org.eclipse.flux.core.util.Observable;
import org.json.JSONObject;

/**
 * @author Martin Lippert
 */
public interface IMessagingConnector {
	
	boolean isConnected();
	String getChannel();
	void send(String messageType, JSONObject message);
	void disconnect();
	void connect();
	void connectChannel(String channel);

	void addConnectionListener(IConnectionListener connectionListener);
	void removeConnectionListener(IConnectionListener connectionListener);
	void addChannelListener(IChannelListener channelListener);
	void removeChannelListener(IChannelListener channelListener);
	void addMessageHandler(IMessageHandler messageHandler);
	void removeMessageHandler(IMessageHandler messageHandler);
	
	Observable<ConnectionStatus> getState();

}
