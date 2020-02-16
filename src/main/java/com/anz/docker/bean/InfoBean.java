package com.anz.docker.bean;

public class InfoBean {

	private String service_name;
	private String version;
	private String git_commit_sha;
	private Environment env;

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getGit_commit_sha() {
		return git_commit_sha;
	}

	public void setGit_commit_sha(String git_commit_sha) {
		this.git_commit_sha = git_commit_sha;
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

}
