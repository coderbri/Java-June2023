package com.weekThree.firstSpring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
		
	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}
	
	// localhost:8080/hello/jane
	@RequestMapping("/hello/{name}")
	public String hello( @PathVariable("name") String name) {
		return "<h1>你好，" + name +"。</h1>";
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
