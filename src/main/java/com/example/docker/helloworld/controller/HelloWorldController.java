package com.example.docker.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloWorldController {

	@GetMapping("/message")
	public String getMessage() {
		log.info("Debugger");
		return "Welcome to Hello World..!!";
	}

}
