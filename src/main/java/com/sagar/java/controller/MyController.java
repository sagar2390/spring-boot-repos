package com.sagar.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test-docker")
	public String getData() {
		return "Welcome to Spring boot and docker example project";
	}

}