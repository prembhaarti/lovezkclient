package com.love.manager.delete;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

public class ZNodeDeleteManager {

	private ZooKeeper zooKeeper;

	public ZNodeDeleteManager(ZooKeeper zooKeeper) {
		this.zooKeeper = zooKeeper;
	}

	public void delete(String path) throws KeeperException,
			InterruptedException {
		int version = zooKeeper.exists(path, true).getVersion();
		zooKeeper.delete(path, version);
	}
}
