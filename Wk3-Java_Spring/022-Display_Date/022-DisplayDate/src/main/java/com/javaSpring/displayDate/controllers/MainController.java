package com.javaSpring.displayDate.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MainController {
	
	Date dateTime = new Date();
	
	@RequestMapping("")
	public String home() {
		System.out.println(dateTime); // Tue Apr 30 17:57:05 EDT 2024
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String displayDate(Model dateModel) {
		
		String datePattern = "E, MMM dd, yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
		
		String currentDate = simpleDateFormat.format(new Date());
		System.out.println(currentDate); // Tue, Apr 30, 2024
		
		dateModel.addAttribute("date", currentDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String displayTime(Model timeModel) {
		
		String timeMilitaryPattern = "HH:mm z";
		String timePattern = "h:mm a";
		SimpleDateFormat simpleMilitaryTimeFormat = new SimpleDateFormat(timeMilitaryPattern);
		SimpleDateFormat simpleTimeFormat = new SimpleDateFormat(timePattern);
		
		String currentMilitaryTime = simpleMilitaryTimeFormat.format(new Date());
		String currentTime = simpleTimeFormat.format(new Date());
		System.out.println(currentMilitaryTime);
		System.out.println(currentTime);
		
		timeModel.addAttribute("militaryTime", currentMilitaryTime);
		timeModel.addAttribute("time", currentTime);
		return "time.jsp";
	}
}
