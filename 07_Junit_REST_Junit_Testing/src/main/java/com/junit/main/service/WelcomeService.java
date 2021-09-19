package com.junit.main.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String getWelcomeMsg() {
		return "Welcome To REST Controller....!!";
	}
}
