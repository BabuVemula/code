package com.anz.docker.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

	@GetMapping("/info")
	public String getMyName() {
		
		return "Simple Spring Boot Application";
	}
}
