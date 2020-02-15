package com.anz.docker.business.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {
//	 #private static Logger logger = Logger.getLogger(BusinessController.class.getName());
	  private static final Logger logger = LoggerFactory.getLogger(BusinessController.class);
	@GetMapping("/info")
	public String getMyName() {
		logger.trace("doStuff needed more information - {}","");
		logger.debug("doStuff needed to debug - {}","");
	    logger.info("doStuff took input - {}","");
	    logger.warn("doStuff needed to warn - {}","");
	    logger.error("doStuff encountered an error with value - {}","");
		return "Simple Spring Boot Application";
	}
}
