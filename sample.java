package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")

public class Usercontrollers {
	
	@GetMapping
	public String getUsers()
	{
		return "http GET request was sent";
	}
}
