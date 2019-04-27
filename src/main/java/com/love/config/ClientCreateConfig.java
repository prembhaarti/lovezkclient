package com.love.config;

public class ClientCreateConfig {

	private String host;
	private String port;
	private Integer sessionTimeout;

	public ClientCreateConfig() {
	}

	public ClientCreateConfig(String host, String port, Integer sessionTimeout) {
		this.host = host;
		this.port = port;
		this.sessionTimeout = sessionTimeout;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Integer getSessionTimeout() {
		return sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}
}
