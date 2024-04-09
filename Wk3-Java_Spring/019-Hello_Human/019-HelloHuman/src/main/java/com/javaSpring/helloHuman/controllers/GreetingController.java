package com.javaSpring.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {
	
	// Endpoint for greeting by a single name - localhost:8080/hello?name=Khoa
	@RequestMapping("")
	public String helloName(@RequestParam(value="name", required=false) String name) {
		if (name != null) {
			return "Hello " + name; 
		}
		return "Hello Human! What's your name?";
	}
	
	// Endpoint for greeting by full name - localhost:8080/hello/full_name?first_name=Khoa&last_name=Le
	@RequestMapping("/full_name")
	public String helloFullName(
			@RequestParam(value="first_name", required=false) String firstName,
			@RequestParam(value="last_name", required=false) String lastName
			) {
		if (firstName != null && lastName != null) {
			return String.format("Hello %s %s!", firstName, lastName);
		} else if (firstName != null /* && lastName == null */) {
			return String.format("Hello %s! Do you have a surname?", firstName);
		} else if (lastName != null /* && firstName == null */) {
			return String.format("Hello %s! What is your first name?", lastName);
		} else {			
			return "Hello Human! What's your FULL name?";
		}
	}
	
	// localhost:8080/hello/full_name?first_name=Khoa&last_name=Le&times=3
	@RequestMapping("/repeat")
	public String repeatGreeting(
			@RequestParam(value="first_name", required=false) String firstName,
			@RequestParam(value="last_name", required=false) String lastName,
			@RequestParam(value="times", required=false) String times // Accept as String
			) {
		// Validate if times parameter is provided
		if (times == null || times.isEmpty()) {
			return "Please provide the 'times' parameter indicating the number of repetitions.";
		}
		
		try {
			Integer repeatTimes = Integer.parseInt(times); // Parse to Integer
			if (repeatTimes > 0) {
				StringBuilder output = new StringBuilder();
				for (int i=0; i < repeatTimes; i++) {
					if (firstName != null && lastName != null) {
						output.append(String.format("Hello %s %s • ", firstName, lastName));
					} else if (firstName != null) {
						output.append(String.format("Hello %s • ", firstName));
					} else if (lastName != null) {
						output.append(String.format("Hello %s • ", lastName));
					} else {
						output.append("Hello Human • ");
					}
				}
				return output.toString();
			} else {
				return "Please provide a positive integer value for the 'times' parameter.";
			}
		} catch (NumberFormatException e) {
			return "Invalid value provided for the 'times' parameter. Please provide a valid integer.";
		}
	}
}