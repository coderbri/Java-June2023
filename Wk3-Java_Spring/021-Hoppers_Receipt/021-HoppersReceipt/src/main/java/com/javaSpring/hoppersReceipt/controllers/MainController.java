package com.javaSpring.hoppersReceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		String customerName = "Grace Hopper";
		String itemName = "Copper Wire";
		double itemPrice = 5.20;
		String description = "Metal strips, also an illustration of nanosecond";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("customer", customerName);
		model.addAttribute("item", itemName);
		model.addAttribute("price", itemPrice);
		model.addAttribute("desc", description);
		model.addAttribute("vendor", vendor);
		
		return "index.jsp";
	}
}
