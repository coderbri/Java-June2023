package com.javaSpring.pathvariablePractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class MainController {
	
	// localhost:8080/practice
	@RequestMapping("")
	public String welcome() {
		return "Welcome! This route uses no @PathVariables.";
	}
	
	/* ? Note:
		No error-handling is being handled in any of these routes,
		so this will return a Whitelabel Error Page instead of errors.
	*/
	// localhost:8080/practice/travel/Kyoto
	@RequestMapping("/travel/{city}")
	public String travel( @PathVariable("city") String cityVariable ) {
		System.out.println(cityVariable);
		return String.format("Congratulations! You will soon travel to %s!", cityVariable);
	}
	
	// localhost:8080/practice/lotto/24
	@RequestMapping("/lotto/{number}")
	public String lotto( @PathVariable("number") int number ) {
		if (number % 2 == 0) { // if even...
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		} else { // if odd...
			return "You have enjoyed the fruits of your labor but now is a great time to dedicate time with family and friends.";
		}
	}
}
