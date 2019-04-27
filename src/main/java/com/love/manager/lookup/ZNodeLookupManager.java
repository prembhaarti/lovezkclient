package com.love.manager.lookup;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.love.model.ZNode;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import javax.swing.*;
import java.util.List;

public class ZNodeLookupManager {

	private ZooKeeper zk;

	public ZNodeLookupManager(ZooKeeper zk) {
		this.zk = zk;
	}

	public String getChildren(String rootPath, int depth) throws KeeperException, InterruptedException {
		ZNode zNode = new ZNode(rootPath);
		this.createZNodeTree(rootPath, zNode, depth);
		return zNode.toString();
	}

	public Stat getStat(String path) throws KeeperException, InterruptedException {
		return zk.exists(path, false);
	}

	public String getStatMap(String path) throws KeeperException, InterruptedException, JsonProcessingException {
		Stat stat = zk.exists(path, false);
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stat);
	}

	public byte[] getData(String path) throws KeeperException, InterruptedException {
		return zk.getData(path, false, getStat(path));
	}

	public byte[] getDataWithWatch(String path) throws KeeperException, InterruptedException {
		Watcher watcher = new Watcher() {
			@Override public void process(WatchedEvent watchedEvent) {
				Event.EventType eventType = watchedEvent.getType();

				JOptionPane.showMessageDialog(null, eventType.name());
			}
		};
		return zk.getData(path, watcher, getStat(path));
	}

	public String getStringData(String path) throws KeeperException, InterruptedException {
		return new String(zk.getData(path, false, getStat(path)));
	}

	public boolean nodeExist(String path) throws KeeperException, InterruptedException {
		return null!=zk.exists(path, false);
	}

	private void createZNodeTree(String fullPath,ZNode root, int depth) throws KeeperException, InterruptedException {
		boolean watch = false;
		Stat stat = getStat(fullPath);

		if (stat != null && depth>0) {
			List<String> children = zk.getChildren(fullPath, watch);
			if(children == null){
				return;
			}
			root.addEmptyChildren();
			List<ZNode> zNodes = root.getzNodes();
			for(String child: children){
				String childPath = fullPath.endsWith("/") ? fullPath+child : fullPath+"/"+child;
				ZNode zNodeChild = new ZNode(child);
				zNodes.add(zNodeChild);
				createZNodeTree(childPath, zNodeChild, depth - 1);
			}
		}
	}
}
