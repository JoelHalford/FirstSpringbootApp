package com.qa.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.WelcomeService;

@RestController
public class WelcomeController {
	
	//Injected here - auto wiring
	@Autowired
	private WelcomeService service;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
}