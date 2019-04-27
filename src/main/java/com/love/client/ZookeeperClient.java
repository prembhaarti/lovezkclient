package com.love.client;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.io.IOException;

public class ZookeeperClient implements Watcher {
	private static final Logger LOG = LoggerFactory.getLogger(ZookeeperClient.class);

	private ZooKeeper zooKeeper;
	private boolean connected;
	private boolean expired;
	private String host;
	private String port;
	private Integer sessionTimeout;

	public ZookeeperClient(String host, String port, Integer sessionTimeout) throws IOException {
		this.host = host;
		this.port = port;
		this.sessionTimeout = sessionTimeout;
		this.init();
	}

	public void init() throws IOException {
		zooKeeper = new ZooKeeper(host + ":" + port, sessionTimeout,this);
	}

	public void stop() throws InterruptedException, IOException {
		zooKeeper.close();
		LOG.debug("love zookeeper client stopped");
	}

	public ZooKeeper getZooKeeper() {
		return zooKeeper;
	}

	public void setZooKeeper(ZooKeeper zooKeeper) {
		this.zooKeeper = zooKeeper;
	}

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public void process(WatchedEvent watchedEvent) {
		LOG.info("Processing event: " + watchedEvent.toString());
		if(watchedEvent.getType() == Event.EventType.None){
			switch (watchedEvent.getState()) {
				case SyncConnected:
					LOG.debug("connected to zookeeper");
					connected = true;
					break;
				case Disconnected:
					JOptionPane.showMessageDialog(null, "Client got disconnected");
					connected = false;
					break;
				case Expired:
					expired = true;
					connected = false;
					JOptionPane.showMessageDialog(null, "Client's session got disconnected");
				default:
					break;
			}
		}
	}
}
