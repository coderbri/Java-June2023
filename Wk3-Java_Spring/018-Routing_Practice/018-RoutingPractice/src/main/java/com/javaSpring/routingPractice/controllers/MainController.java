package com.javaSpring.routingPractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routes")
public class MainController {
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "<strong><emphasis>"
				+ "\"So never be anxious about the next day, for the next day will have its own anxieties. Each day has enough of its own troubles.\""
				+ "</emphasis></strong>"
				+ "—Matthew 6:34";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "<strong><emphasis>"
				+ "\"And he will wipe out every tear from their eyes, and death will be no more, neither will mourning nor outcry nor pain be anymore. The former things have passed away.\""
				+ "</emphasis></strong>"
				+ "—Revelation 21:4";
	}
}
