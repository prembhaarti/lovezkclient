package com.love.manager.write;

import com.love.model.ACL;
import com.love.model.ZNodeType;
import org.apache.zookeeper.*;

import javax.swing.*;
import java.util.List;

public class ZNodeWriteManager {

	private ZooKeeper zooKeeper;

	public ZNodeWriteManager(ZooKeeper zooKeeper) {
		this.zooKeeper = zooKeeper;
	}

	public void create(String path, byte[] data, ACL acl, ZNodeType nodeType) throws KeeperException, InterruptedException {
		AsyncCallback.StringCallback createCallBack = new AsyncCallback.StringCallback() {
			@Override public void processResult(int responseCode, String path, Object context, String name) {
				switch (KeeperException.Code.get(responseCode)) {
					case CONNECTIONLOSS:
						JOptionPane.showMessageDialog(null, "Connection loss problem occured");
						break;

					case OK:
						JOptionPane.showMessageDialog(null, "Node Created : "+ name);
						break;

					case NODEEXISTS:
						JOptionPane.showMessageDialog(null, "Node "+path+ " is already present");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Exception occured : "+ KeeperException.Code.get(responseCode));
				}
			}
		};

		List<org.apache.zookeeper.data.ACL> acls = null;
		switch (acl){
			case OPEN_ACL_UNSAFE:
				acls= ZooDefs.Ids.OPEN_ACL_UNSAFE;
				break;
			case CREATOR_ALL_ACL:
				acls= ZooDefs.Ids.CREATOR_ALL_ACL;
				break;
			case READ_ACL_UNSAFE:
				acls= ZooDefs.Ids.READ_ACL_UNSAFE;
				break;
		}

		zooKeeper.create(path, data, acls, CreateMode.valueOf(nodeType.name()), createCallBack, "Node creation");
	}

	public void create(String path, byte[] data) throws KeeperException, InterruptedException {
		zooKeeper.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
	}
	public boolean update(String path, byte[] data, Integer version) throws KeeperException, InterruptedException {
		return null!= zooKeeper.setData(path, data, version);
	}
}
