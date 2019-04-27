package com.love.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Objects;

public class ClientProvider {

	private static final Logger LOG = LoggerFactory.getLogger(ClientProvider.class);
	private static ZookeeperClient zookeeperClient;
	private static String host;
	private static String port;
	private static Integer sessionTimeout;

	public static ZookeeperClient getClient(String host, String port, Integer sessionTimeout) throws IOException {
		ClientProvider.host = host;
		ClientProvider.port = port;
		ClientProvider.sessionTimeout = sessionTimeout;
		if(Objects.isNull(zookeeperClient)) {
			zookeeperClient = new ZookeeperClient(host, port, sessionTimeout);
		}
		LOG.debug("love zookeeper client started");
		return zookeeperClient;
	}

	public static void refreshClient() throws IOException {
		zookeeperClient = null;
		getClient(host,port,sessionTimeout);
	}
	public static void destroyClient() throws IOException {
		zookeeperClient = null;
	}
}
