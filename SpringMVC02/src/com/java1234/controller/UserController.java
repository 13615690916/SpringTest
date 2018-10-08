package com.java1234.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
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
		System.out.println("----登录验证-----");
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		Cookie cookie = new Cookie("user", userName + "-" + passWord);
		//设置cookie的生存时间为1星期
		cookie.setMaxAge(1*60*60*24*7);
		User currentUser=new User(userName,passWord);
		response.addCookie(cookie);
		HttpSession session=request.getSession();
		session.setAttribute("currentUser", currentUser);
		return "redirect:/main.jsp";
	}
	
	@RequestMapping("/ajax")
	public @ResponseBody User ajax(){
		User user=new User("zhangsan","123");
		return user;
		
	}
}
