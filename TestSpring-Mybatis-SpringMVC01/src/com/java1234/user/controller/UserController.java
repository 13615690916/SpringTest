package com.java1234.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java1234.user.model.User;
import com.java1234.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/getMain")
	public String getMain() {
		return "user/main";
	}

	@RequestMapping("/getUserList")
	@ResponseBody
	public String getUserList() {
		List<User> users = userService.getAllList();
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString=null;
		try {
			jsonString=objectMapper.writeValueAsString(users);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jsonString);
		return jsonString;
	}
}
