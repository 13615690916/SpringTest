package com.java1234.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java1234.mappers.UserMapper;
import com.java1234.model.User;
import com.java1234.util.JsonListAndPage;
import com.java1234.util.Paging;
import com.java1234.util.SqlSessionFactoryUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	private SqlSession sqlSession = new SqlSessionFactoryUtil().getSqlSession();
	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

	@RequestMapping("/main")
	@ResponseBody
	public String main(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage,
			@RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize) throws JsonProcessingException {

		List<User> userList = userMapper.getPagingList(currentPage, pageSize);
		Paging paging = new Paging();
		int total = userMapper.getCount();
		String pagingString = paging.getPaging(currentPage, pageSize, total);
		JsonListAndPage jsonListAndPage = new JsonListAndPage(userList,pagingString);
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(jsonListAndPage);
		return jsonString;
	}
	
}
