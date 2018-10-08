package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public String hello(Model model){
		model.addAttribute("message", "helloWorld");
		return "helloWorld";
	}
}
