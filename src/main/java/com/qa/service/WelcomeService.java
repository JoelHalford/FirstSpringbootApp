package com.qa.service;

import org.springframework.stereotype.Component;

//Spring to manage this bean and create an instance of this
@Component
public class WelcomeService {
	public String retrieveWelcomeMessage() {
		return "Good day!";
	}
}