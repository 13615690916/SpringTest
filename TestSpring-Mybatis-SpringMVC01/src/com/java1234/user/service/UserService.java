package com.java1234.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java1234.user.mappers.UserMapper;
import com.java1234.user.model.User;



@Service
public class UserService {
	
	
	@Autowired
	private UserMapper userMapper;


	public User getUserByUserName(String userName){
	    User user=userMapper.getUserByUserName(userName);
	    return user;
	}
	
	public List<User> getAllList(){
		return userMapper.getAlList();
	}
	
	public boolean insertUser(String userName,String passWord){
		int r=userMapper.insertUser(userName, passWord);
		return r>0;
	}
	
	public List<User> findByPage(int start,int end){
		return userMapper.findByPage(start, end);
	}
	
}
