package com.flightbookingsystem.flightsearch.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class SecurityController {

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public String info() {
		return "the application is up";
	}

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello PXP!";
	}
	
	

}
