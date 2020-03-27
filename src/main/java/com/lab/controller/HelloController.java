package com.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/teste")
public class HelloController {

	@GetMapping
	@RequestMapping("/hello")
	public ResponseEntity<String> teste() {
		return ResponseEntity.ok("Hello World - Teste de servidor ok");
	}
	
	@GetMapping
	@RequestMapping("/hello2")
	public ResponseEntity<String> teste2() {
		return ResponseEntity.ok("Hello World - Teste de servidor ok 2");
	}
	
	
}
