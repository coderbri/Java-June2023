package com.weekThree.firstSpring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	// ? Requests can be explicitly stated as well
	// localhost:8080/test
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		return "This is a test!";
	}
	
	// localhost:8080/hello/jane
	@RequestMapping("/hello/{name}")
	public String hello( @PathVariable("name") String name ) {
		System.out.println("\n============================\n"
				+ "Variable printed to console: " + name);
		return "<h1>你好，" + name +"。</h1>";
	}
	
	// localhost:8080/apple/7
	@RequestMapping("/test/{number}")
	public String variableTest( @PathVariable("number") Long incomingNum ) {
		String incomingWord = "String Repeat Test";
		System.out.printf("\n============================\n" + "Variables: %s x %s", incomingWord, incomingNum);
		String output = "";
		for (int i = 0; i < incomingNum; i++) {
			output += incomingWord;
		}
		return output;
	}
	
	// localhost:8080/test/apple/7
	@RequestMapping("/test/{word}/{number}")
	public String repeatString(
			@PathVariable("word") String incomingWord,
			@PathVariable("number") Integer incomingNum
			) {
		System.out.printf("\n============================\n" + "Variables: %s x %s", incomingWord, incomingNum);
		return incomingWord.repeat(incomingNum);
	}
	
	// localhost:8080/hello?firstName=Jane&lastName=Doe
	@RequestMapping("/hello")
	public String helloName(
			@RequestParam(value="firstName", required=false) String fname,
			@RequestParam(value="lastName", required=false) String lname
			) {
		if (fname == null && lname == null) {
			return "<h3>Hello...</h3>";
		} else if (lname == null) {
			return String.format("<h2>Hello, %s.</h2>", fname);
		} else if (fname == null) {
			return String.format("<h2>Hello, %s.</h2>", lname);
		} else {
			return String.format("<h1>Hello, %s %s.</h1>", fname, lname);
		}
	}
	
}