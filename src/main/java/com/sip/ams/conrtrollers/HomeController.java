package com.sip.ams.conrtrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping ("/info")
	public String info () {
		System.out.println("Bonjour methode info");
		return "home/info";
	}
	@GetMapping ("/affichage")
	public String affichage () {
		
		return "home/affichage";
	}
}
