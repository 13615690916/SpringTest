package com.java1234.user.service;

import java.beans.Beans;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java1234.loginLog.service.LoginLogService;
import com.java1234.user.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:config/applicationContext.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;
	@Autowired
	private LoginLogService loginLogService;

	@Test
	public void test() {
		String userName = "admin";
		User user = userService.getUserByUserName(userName);
		System.out.println(user);
	}

	@Test
	public void test1() {
		List<User> users = userService.getAllList();
		System.out.println(users);
	}

	@Test
	public void test2() {
		int userId = 1;
		String uIp = "1111";
		boolean b = loginLogService.insertLoginLog(userId, uIp);
		System.out.println(b);
	}

	@Test
	@Transactional
	public void loginSuccess() {
		String userName = "wqc";
		String passWord = "123456";
		int userId = 2;
		String ip = "2222";

		boolean b1 = userService.insertUser(userName, passWord);
		boolean b2 = loginLogService.insertLoginLog(userId, ip);
		System.out.println(b1 + "|" + b2);
	}

	ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

	@Test
	public void test3() throws IOException {
		// Resource resources[]=(Resource[])
		// resolver.getResources("classpath*:com/java1234/**/mappers/*.xml");
		// for(Resource resource:resources ){
		// System.out.println(resource.description());
		// }
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				Beans.class);
		User user = ctx.getBean("user", User.class);
		System.out.println(user);
	}

	@Test
	public void test4() {
		PageHelper.startPage(1, 10);
		List<User> users = userService.getAllList();
		PageInfo<User> pageInfo = new PageInfo<>(users);
		System.out.println(pageInfo);

	}

}
