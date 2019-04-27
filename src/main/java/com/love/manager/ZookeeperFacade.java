package com.love.manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.love.model.ACL;
import com.love.model.ZNodeType;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

public interface ZookeeperFacade {

	boolean pathExist(String path) throws KeeperException, InterruptedException;

	String getChildren(String path) throws KeeperException, InterruptedException;

	String getChildrenUptoDepth(String path, int depth) throws KeeperException, InterruptedException;

	void create(String path, byte[] data) throws KeeperException, InterruptedException;

	void create(String path, byte[] data, ACL acl, ZNodeType nodeType) throws KeeperException, InterruptedException;

	public byte[] getData(String path) throws KeeperException, InterruptedException;

	public boolean updateData(String path, String data, Integer version) throws KeeperException, InterruptedException;

	public void deleteData(String path) throws KeeperException, InterruptedException;

	public String getStringData(String path) throws KeeperException, InterruptedException;

	public Stat getStat(String path) throws KeeperException, InterruptedException;

	public String getStatMap(String path)
			throws KeeperException, InterruptedException, JsonProcessingException;

	public String getACLInfo(String path) throws InterruptedException, JsonProcessingException, KeeperException;

	public void stop() throws IOException, InterruptedException;

	public String getCommandInfo(String command) throws IOException;

	public void reconnect() throws IOException;

	public byte[] getDataWithWatch(String path) throws IOException, KeeperException, InterruptedException;

}
