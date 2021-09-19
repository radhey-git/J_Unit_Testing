package com.junit.main.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.main.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService service;
	
	@GetMapping(value = "/welcome")
	public ResponseEntity<String> wish() {
		String msg=service.getWelcomeMsg();
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
