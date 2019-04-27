package com.love.manager.acl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Stat;

import java.util.List;

public class ACLManager {

	private ZooKeeper zooKeeper;

	public ACLManager(ZooKeeper zooKeeper) {
		this.zooKeeper = zooKeeper;
	}

	public String getACLInfo(String path) throws KeeperException, InterruptedException, JsonProcessingException {
		Stat stat = zooKeeper.exists(path, true);
		List<ACL> aclList = zooKeeper.getACL(path, stat);
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		String formattedString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(aclList);
		return formattedString;
	}
}
