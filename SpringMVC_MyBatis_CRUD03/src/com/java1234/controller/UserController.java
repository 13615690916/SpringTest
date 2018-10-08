package com.java1234.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java1234.mappers.UserMapper;
import com.java1234.model.JsonList;
import com.java1234.model.User;
import com.java1234.util.Paging;
import com.java1234.util.SqlSessionFactoryUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	SqlSession sqlSession = new SqlSessionFactoryUtil().getSqlSession();
	UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);

	@RequestMapping("/main")
	@ResponseBody
	public String main(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage,
			@RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize)
			throws JsonProcessingException {
		List<User> userList = userMapper.paging((currentPage-1)*pageSize, pageSize);
		int total = userMapper.getCount();
		String pagingString = Paging.PagingString(currentPage, pageSize, total);
		JsonList jsonList = new JsonList(userList, pagingString);
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(jsonList);
		System.out.println(jsonString);
		return jsonString;
	}
	
	@RequestMapping("/getMain")
	public String getMain(){
		return "user/main";
	}

	/*
	 * @RequestMapping("/main") public ModelAndView login() { ModelAndView mav =
	 * new ModelAndView(); List<User> userList = userMapper.findAllUsers();
	 * mav.addObject("userList", userList); mav.addObject("a", userList);
	 * mav.setViewName("user/main"); return mav; }
	 * 
	 * 
	 * 
	 * @RequestMapping(value = "/main")
	 * 
	 * @ResponseBody public String main() throws JsonProcessingException {
	 * List<User> userList = userMapper.findAllUsers(); ObjectMapper
	 * objectMapper = new ObjectMapper(); String jsonString =
	 * objectMapper.writeValueAsString(userList);
	 * System.out.println(jsonString); return jsonString; }
	 * 
	 * 
	 * @RequestMapping(value = "/main")
	 * 
	 * @ResponseBody public String main(
	 * 
	 * @RequestParam(value = "currentPage", defaultValue = "1", required =
	 * false) int currentPage,
	 * 
	 * @RequestParam(value = "pageSize", defaultValue = "10", required = false)
	 * int pageSize) throws JsonProcessingException { int total =
	 * userMapper.getCount(); System.out.println(total);
	 * System.out.println(currentPage); System.out.println(pageSize); String str
	 * = Paging.PagingString(currentPage, pageSize, total);
	 * System.out.println(str); List<User> userList; if (currentPage > 0) {
	 * userList = userMapper .paging((currentPage - 1) * pageSize, pageSize); }
	 * else { userList = userMapper.paging(0 * pageSize, pageSize); }
	 * System.out.println(userList); JsonList jsonList = new JsonList(userList,
	 * str); ObjectMapper objectMapper = new ObjectMapper(); String jsonString =
	 * objectMapper.writeValueAsString(jsonList);
	 * System.out.println(jsonString); return jsonString; }
	 * 
	 * @RequestMapping("/login") public String login() { return "user/login"; }
	 * 
	 * @RequestMapping("/test") public String mainString() { return "user/main";
	 * }
	 * 
	 * @RequestMapping("/add") public String add() { return "user/add"; }
	 * 
	 * @RequestMapping("/update") public ModelAndView update(@RequestParam(value
	 * = "id") String id,
	 * 
	 * @RequestParam(value = "password") String password) { ModelAndView mav =
	 * new ModelAndView(); User user = new User(id, password); List<User>
	 * userList = new ArrayList<User>(); userList.add(user);
	 * mav.addObject("userList", userList); mav.setViewName("user/update");
	 * return mav; }
	 * 
	 * @RequestMapping("/addUser") public String addUser(@RequestParam(value =
	 * "id") String id,
	 * 
	 * @RequestParam(value = "password") String password) { User user = new
	 * User(id, password); int r = userMapper.insert(user); if (r > 0) { return
	 * "redirect:/user/test.do"; } return "error"; }
	 * 
	 * @RequestMapping("/updateUser") public String
	 * updateUser(@RequestParam(value = "id") String id,
	 * 
	 * @RequestParam(value = "password") String password) { User user = new
	 * User(id, password); int r = userMapper.update(user); if (r > 0) { return
	 * "redirect:/user/test.do"; } return "error"; }
	 * 
	 * @RequestMapping("/delete") public String delete(@RequestParam("id")
	 * String id) { int r = userMapper.delete(id); if (r > 0) { return
	 * "redirect:/user/test.do"; } return "error"; }
	 * 
	 * @RequestMapping("/detail") public ModelAndView detail(@RequestParam("id")
	 * String id) { ModelAndView mav = new ModelAndView(); User user =
	 * userMapper.findUserById(id); List<User> userList = new ArrayList<User>();
	 * userList.add(user); mav.addObject("userList", userList);
	 * mav.setViewName("/user/detail"); return mav; }
	 */
}
