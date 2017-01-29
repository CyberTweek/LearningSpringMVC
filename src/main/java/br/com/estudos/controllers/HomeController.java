package br.com.estudos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na HOME da casa do codigo");
		
		return "home";
	}
	

}
