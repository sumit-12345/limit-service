package com.in28minutes.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservice.limitservice.bean.LimitConfiguration;
import com.in28minutes.microservice.limitservice.component.Configuration;

@RestController
public class LimitController {

	@Autowired
	private Configuration configuration;
	@GetMapping(value = {"/getData"})
	public LimitConfiguration getData() {
		return new LimitConfiguration(configuration.getMax(),configuration.getMin());
	}
}
