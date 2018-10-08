package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMVCController {

	@RequestMapping("/helloSpringMVC")
	public String hello(Model model){
		model.addAttribute("message", "HelloSpringMVC");
		return "HelloSpringMVC";
	}
}
