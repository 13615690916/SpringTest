package com.smart.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.user.dao.UserDao;
import com.smart.user.model.User;


@Service
public class UserService {

	//ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	@Autowired
	private UserDao userDao;


	public User getUserByUserName(String userName){
	    User user=userDao.getUserByUserName(userName);
	    return user;
	}
	
	public List<User> getAllList(){
		return userDao.getAlList();
	}
	
	
	
}
