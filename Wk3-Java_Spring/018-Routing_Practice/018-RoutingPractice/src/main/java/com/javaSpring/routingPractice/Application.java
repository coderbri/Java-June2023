package com.javaSpring.routingPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "<h3>Please enter a route</h3>"
				+ "\n<ol>"
				+ "\n<li>/routes</li>"
				+ "\n<li>/routes/today</li>"
				+ "\n<li>/routes/tomorrow</li>"
				+ "\n</ol>";
	}

}
