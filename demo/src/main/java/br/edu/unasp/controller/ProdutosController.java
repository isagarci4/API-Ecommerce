package br.edu.unasp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutosController {

    @GetMapping("/hello")
	public String helloWorld(){
		return "Oi bonoite";
	}
}
