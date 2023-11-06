package com.assignment.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetapi/v1")
public class HomeController {

	@GetMapping(value = "/hello")
	@ResponseBody
	public String getMessage() {
		return "Hello World!!";
	}

	@GetMapping(value = "/hello", params = { "name" })
	@ResponseBody
	public String getMessageWithName(@RequestParam String name) {
		return "Hello " + name + "!!";
	}
}
