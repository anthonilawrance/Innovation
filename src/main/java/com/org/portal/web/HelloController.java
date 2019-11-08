package com.org.portal.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${server.port}")
	private String port;
	@GetMapping("/hello")
	public String firstBootApplication() {
		System.out.println("port ===>"+port);
		return "Hi Web";
	}
}
