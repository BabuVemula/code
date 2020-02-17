package com.anz.docker.bean;

//Bean class to generate env details in Info bean
public class Environment {
	private String service_port;
	private String log_level;

	public String getService_port() {
		return service_port;
	}

	public void setService_port(String service_port) {
		this.service_port = service_port;
	}

	public String getLog_level() {
		return log_level;
	}

	public void setLog_level(String log_level) {
		this.log_level = log_level;
	}

}
