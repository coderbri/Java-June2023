package com.weekThree.firstSpring.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@GetMapping("")
	public String indexView( Model viewModel ) {
		viewModel.addAttribute("cat", "猫");
		return "index.jsp";
	}
	
//*	JSTL Loop Example
	@GetMapping("/loop-example")
	public String viewLoop( Model viewModel ) {
		ArrayList<String> pets = new ArrayList<String>();
		pets.add("cats");
		pets.add("dogs");
		pets.add("bunnies");
		pets.add("goldfish");
		pets.add("parrots");
		viewModel.addAttribute("allPets", pets);
		return "demo.jsp";
	}
}
