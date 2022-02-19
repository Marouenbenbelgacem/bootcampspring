package com.sip.ams.conrtrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping ("/info")
	public String info (Model model) {
		
		String formation = "FullStack";
		System.out.println("Bonjour methode info");
		
		model.addAttribute("workshop", formation);
		return "home/info";
	}
	@GetMapping ("/affichage")
	public String affichage () {
		System.out.println("Bonjour methode affichage");

		return "home/affichage";
	}
}
