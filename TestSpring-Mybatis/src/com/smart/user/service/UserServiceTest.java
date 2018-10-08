package com.smart.user.service;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smart.user.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:config/applicationContext.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void test() {
		List<User> users = userService.getAllList();
		for (User user : users) {
			System.out.println(user);
		}
		
	}

}
