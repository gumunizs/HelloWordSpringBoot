package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio02")
public class exercicio2 {

	@GetMapping
	public String hello() {
		return "Esta semana estou focado em aprender Spring e fixar"
				+ "POO na minha cabeça!";
				}
	
}