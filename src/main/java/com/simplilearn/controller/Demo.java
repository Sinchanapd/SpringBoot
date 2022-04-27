package com.simplilearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	@RequestMapping("/testme")
	public String hello() 
	{
		return "Welcome";
	}
}
