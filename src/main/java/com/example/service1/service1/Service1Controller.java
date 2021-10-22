package com.example.service1.service1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service1")
public class Service1Controller {
	
	@GetMapping("/get")
	public String test1() {
		return "test1 method of service1";
	}
	@GetMapping("/get")
	public String test2() {
		return "test1 method of service1";
	}

}
