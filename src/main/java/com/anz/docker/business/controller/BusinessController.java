package com.anz.docker.business.controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.docker.bean.InfoBean;

@RestController
public class BusinessController {
//	 #private static Logger logger = Logger.getLogger(BusinessController.class.getName());
	  private static final Logger logger = LoggerFactory.getLogger(BusinessController.class);
	@GetMapping("/info")
	public InfoBean getinfo() {
		String envInfo= System.getenv("jsoninput");
		JsonParser springParser = JsonParserFactory.getJsonParser();
		Map<String, Object> map = springParser.parseMap(envInfo);
		
		 logger.info("doStuff took input - {}",map.size());
		logger.trace("doStuff needed more information - {}","");
		logger.debug("doStuff needed to debug - {}","");
	    logger.info("doStuff took input - {}","");
	    logger.warn("doStuff needed to warn - {}","");
	    logger.error("doStuff encountered an error with value - {}","");
		return new InfoBean();
	}
}
