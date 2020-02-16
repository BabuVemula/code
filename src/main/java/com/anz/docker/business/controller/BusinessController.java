package com.anz.docker.business.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.docker.bean.InfoBean;

@RestController
public class BusinessController {
//	 #private static Logger logger = Logger.getLogger(BusinessController.class.getName());
	  private static final Logger logger = LoggerFactory.getLogger(BusinessController.class);
	@GetMapping("/info")
	public InfoBean getinfo() {
		String envInfoapp= System.getenv("app");
		String envInfover= System.getenv("ver");
		String envInfosha= System.getenv("sha");
		InfoBean info = new InfoBean();
		info.setService_name(envInfoapp);
		info.setVersion(envInfover);
		info.setGit_commit_sha(envInfosha);
		
		 logger.info("doStuff took input - {}",envInfoapp);
		 logger.info("doStuff took input - {}",envInfover);
		 logger.info("doStuff took input - {}",envInfosha);
		logger.trace("doStuff needed more information - {}","");
		logger.debug("doStuff needed to debug - {}","");
	    logger.info("doStuff took input - {}","");
	    logger.warn("doStuff needed to warn - {}","");
	    logger.error("doStuff encountered an error with value - {}","");
		return info;
	}
}
