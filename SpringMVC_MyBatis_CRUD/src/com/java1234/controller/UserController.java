package com.java1234.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.mappers.UserMapper;
import com.java1234.model.User;
import com.java1234.util.SqlSessionFactoryUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	SqlSession sqlSession = new SqlSessionFactoryUtil().getSqlSession();
	UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);

	@RequestMapping("/main")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		List<User> userList = userMapper.findAllUsers();
		mav.addObject("userList", userList);
		mav.addObject("a", userList);
		mav.setViewName("user/main");
		return mav;
	}

	@RequestMapping("/add")
	public String add() {
		return "user/add";
	}
	
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam(value="id") String id,
			@RequestParam(value="password") String password) {
		ModelAndView mav=new ModelAndView();
		User user=new User(id,password);
		List<User> userList=new ArrayList<User>();
		userList.add(user);
		mav.addObject("userList", userList);
		mav.setViewName("user/update");
		return mav;
	}
	
	@RequestMapping("/addUser")
	public String addUser(@RequestParam(value="id") String id,
			@RequestParam(value="password") String password){
		User user=new User(id,password);
		int r=	userMapper.insert(user);
		if (r>0) {
			return "redirect:/user/main.do";
		}
		return "error";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(@RequestParam(value="id") String id,
			@RequestParam(value="password") String password){
		User user=new User(id,password);
		int r=	userMapper.update(user);
		if (r>0) {
			return "redirect:/user/main.do";
		}
		return "error";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") String id){
		int r=userMapper.delete(id);
		if (r>0) {
			return "redirect:/user/main.do";
		}
		return "error";
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(@RequestParam("id") String id){
		ModelAndView mav=new ModelAndView();
		User user= userMapper.findUserById(id);
		List<User> userList=new ArrayList<User>();
		userList.add(user);
		mav.addObject("userList", userList);
		mav.setViewName("/user/detail");
		return mav;
	}
}
