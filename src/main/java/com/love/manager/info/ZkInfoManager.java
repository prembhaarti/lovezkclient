package com.love.manager.info;

import com.love.config.ClientCreateConfig;
import org.apache.zookeeper.client.FourLetterWordMain;

import java.io.IOException;

public class ZkInfoManager {

	private ClientCreateConfig config;
	public ZkInfoManager(ClientCreateConfig config) {
		this.config = config;
	}

	public String getCommandInfo(String command) throws IOException {
		return FourLetterWordMain.send4LetterWord (config.getHost(), Integer.parseInt(config.getPort()), command);
	}
}
