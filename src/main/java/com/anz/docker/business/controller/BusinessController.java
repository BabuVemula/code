package com.anz.docker.business.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.docker.bean.Environment;
import com.anz.docker.bean.InfoBean;

@RestController
public class BusinessController {
	// #private static Logger logger =
	// Logger.getLogger(BusinessController.class.getName());
	private static final Logger logger = LoggerFactory.getLogger(BusinessController.class);

	@GetMapping("/info")
	public InfoBean getinfo() {
		String envInfoapp = System.getenv("app");
		String envInfover = System.getenv("ver");
		String envInfosha = System.getenv("sha");
		InfoBean info = new InfoBean();
		info.setService_name(envInfoapp);
		info.setVersion(envInfover);
		info.setGit_commit_sha(envInfosha);
		try (InputStream input = new ClassPathResource("classpath:application.properties").getInputStream();) {
			Properties prop = new Properties();
			Environment environment = new Environment();
			prop.load(input);
			environment.setLog_level(prop.getProperty("logging.level.root"));
			environment.setService_port(prop.getProperty("server.port"));
			info.setEnv(environment);
		} catch (IOException ex) {
			ex.printStackTrace();
			ex.getMessage();
			logger.error("Exception while fetching env details", ex.getMessage());
		}

		logger.info("Value received from run env for APP", envInfoapp);
		logger.info("Value received from run env for VER", envInfover);
		logger.info("Value received from run env for GIT SHA", envInfosha);

		return info;
	}
}
