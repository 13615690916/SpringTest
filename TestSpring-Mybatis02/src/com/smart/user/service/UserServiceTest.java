package com.smart.user.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.smart.loginLog.service.LoginLogService;
import com.smart.user.model.User;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:config/applicationContext.xml")
public class UserServiceTest {
	
	
	@Autowired
	private UserService userService;
	@Autowired
	private LoginLogService loginLogService;

	@Test
	public void test() {
		String userName="admin";
		User user=userService.getUserByUserName(userName);
		System.out.println(user);
	}
	
	@Test
	public void test1() {
		List<User>  users=userService.getAllList();
		System.out.println(users);
	}
	
	@Test
	public void test2() {
		int userId=1;
		String uIp="1111";
		boolean b=loginLogService.insertLoginLog(userId, uIp);
		System.out.println(b);
	}
	
	
	@Test
	@Transactional
	public void loginSuccess(){
		String userName="wqc";
		String passWord="123456";
		int userId=2;
		String ip="2222";
		
		boolean b1=userService.insertUser(userName, passWord);
		boolean b2= loginLogService.insertLoginLog(userId, ip);
		
		System.out.println((b1 || b2)+"||"+ (b1 && b2)+"||"+(b1+"|"+b2));
		
		
	}

}
