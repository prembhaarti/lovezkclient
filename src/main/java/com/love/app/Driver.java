package com.love.app;

import com.love.ui.LoveZkClientFrame;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException, KeeperException, InterruptedException {

		LoveZkClientFrame frame = new LoveZkClientFrame();
		frame.display();
//		ClientCreateConfig config = new ClientCreateConfig("10.32.95.25","2181", 10000);
//		ZookeeperFacade manager = new ZookeeperFacadeImpl(config);
//		String path= "/clients/love";
//		manager.create(path, "love".getBytes());
//		System.out.println(manager.getStringData(path));
//		System.out.println(manager.getStat(path));
//		System.out.println(manager.getStatMap(path));
//		System.out.println(manager.getZookeeperInfo());
	}
}
