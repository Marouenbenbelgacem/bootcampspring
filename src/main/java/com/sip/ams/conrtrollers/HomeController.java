package com.sip.ams.conrtrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping ("/info")
	public String info (Model model) {
		
		List<String> names = new ArrayList<String>();
		names.add("OCA");
		names.add("OCP");
		names.add("Spring");
		
		String formation = "FullStack";
		System.out.println("Bonjour methode info");
		
		model.addAttribute("workshop", formation);
		model.addAttribute("names", names);
		return "home/info";
	}
	@GetMapping ("/affichage")
	public String affichage () {
		System.out.println("Bonjour methode affichage");

		return "home/affichage";
	}
}
