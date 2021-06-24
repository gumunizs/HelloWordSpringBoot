package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio01")
public class exercicio01 {

	@GetMapping
	public String hello() {
		return "A aplicação deverá conter um end-point que retorna"
				+ " uma string com as habilidades e mentalidades que"
				+ " você utilizou para realizar essa atividade."
				+ "\nMUITA persistência e trabalho em equipe me fizerem finalmente conseguir finalizar meu hello word!";
	}
	
}