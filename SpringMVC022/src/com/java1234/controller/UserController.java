package com.java1234.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java1234.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		Cookie cookie=new Cookie("user", userName+"-"+passWord);
		//设置cookie 的过期时间
		cookie.setMaxAge(1*60*60*24*7);
		//将cookie添加到response中
		response.addCookie(cookie);
		User currentUser=new User(userName,passWord);
		//创建session对象 
		HttpSession session = request.getSession();
		//将用户信息存入cookie中
		session.setAttribute("currentUser", currentUser);
		return "redirect:/main.jsp";
	}
	
	@RequestMapping("/ajax")
	public @ResponseBody User ajax(){
		User user=new User("zhangsan","111");
		return user;
	}
}
