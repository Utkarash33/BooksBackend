package com.books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

	
	
	@GetMapping("/hello")
	public String getMethodName() {
		return "hello world";
	}

}
