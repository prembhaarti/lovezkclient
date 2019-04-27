package com.love.manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.love.client.ClientProvider;
import com.love.client.ZookeeperClient;
import com.love.config.ClientCreateConfig;
import com.love.manager.acl.ACLManager;
import com.love.manager.delete.ZNodeDeleteManager;
import com.love.manager.info.ZkInfoManager;
import com.love.manager.lookup.ZNodeLookupManager;
import com.love.manager.write.ZNodeWriteManager;
import com.love.model.ACL;
import com.love.model.ZNodeType;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

public class ZookeeperFacadeImpl implements ZookeeperFacade {
	private ZookeeperClient client;
	private ZNodeLookupManager lookupManager;
	private ZNodeDeleteManager deleteManager;
	private ACLManager aclManager;
	private ZkInfoManager infoManager;
	private ClientCreateConfig config;

	@Override
	public String getStatMap(String path)
			throws KeeperException, InterruptedException, JsonProcessingException {
		return lookupManager.getStatMap(path);
	}

	private ZNodeWriteManager writeManager;

	public ZookeeperFacadeImpl(ClientCreateConfig config) throws IOException {
		this.config = config;
		this.init();
	}

	public void init() throws IOException {
		this.client = ClientProvider.getClient(config.getHost(), config.getPort(), config.getSessionTimeout());
		lookupManager = new ZNodeLookupManager(client.getZooKeeper());
		writeManager = new ZNodeWriteManager(client.getZooKeeper());
		deleteManager = new ZNodeDeleteManager(client.getZooKeeper());
		aclManager = new ACLManager(client.getZooKeeper());
		infoManager = new ZkInfoManager(config);
	}

	@Override public byte[] getData(String path) throws KeeperException, InterruptedException {
		return lookupManager.getData(path);
	}

	@Override public boolean updateData(String path, String data, Integer version)
			throws KeeperException, InterruptedException {
		return writeManager.update(path, data.getBytes(), version);
	}

	@Override public Stat getStat(String path) throws KeeperException, InterruptedException {
		return lookupManager.getStat(path);
	}

	@Override public String getStringData(String path) throws KeeperException, InterruptedException {
		return lookupManager.getStringData(path);
	}

	@Override
	public boolean pathExist(String path) throws KeeperException, InterruptedException {
		return lookupManager.nodeExist(path);
	}

	@Override
	public String getChildren(String path) throws KeeperException, InterruptedException {
		return getChildrenUptoDepth(path,1);
	}

	@Override
	public String getChildrenUptoDepth(String path, int depth) throws KeeperException, InterruptedException {
		return lookupManager.getChildren(path, depth);
	}

	@Override
	public void create(String path, byte[] data, ACL acl, ZNodeType nodeType) throws KeeperException, InterruptedException {
		writeManager.create(path, data, acl, nodeType);
	}

	@Override
	public void create(String path, byte[] data) throws KeeperException, InterruptedException {
		writeManager.create(path, data);
	}

	@Override
	public void deleteData(String path) throws KeeperException, InterruptedException {
		deleteManager.delete(path);
	}

	@Override
	public String getACLInfo(String path) throws InterruptedException, JsonProcessingException, KeeperException {
		return aclManager.getACLInfo(path);
	}

	@Override
	public String getCommandInfo(String command) throws IOException {
		return infoManager.getCommandInfo(command);
	}

	@Override
	public byte[] getDataWithWatch(String path) throws IOException, KeeperException, InterruptedException {
		return lookupManager.getDataWithWatch(path);
	}

	@Override
	public void reconnect() throws IOException {
		ClientProvider.refreshClient();
		init();
	}

	@Override
	public void stop() throws IOException, InterruptedException {
		client.stop();
	}
}
