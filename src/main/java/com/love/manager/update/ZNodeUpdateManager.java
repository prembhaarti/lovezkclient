package com.love.manager.update;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

public class ZNodeUpdateManager {

	private ZooKeeper zooKeeper;

	public ZNodeUpdateManager(ZooKeeper zooKeeper) {
		this.zooKeeper = zooKeeper;
	}

	public void update(String path, byte[] data) throws KeeperException,
			InterruptedException {
		int version = zooKeeper.exists(path, true).getVersion();
		zooKeeper.setData(path, data, version);
	}
}
