package com.smart.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smart.user.model.User;

public interface UserDao {
	
	public User getUserByUserName(String userName);
	
	public List<User> getAlList();
	
	public int insertUser(@Param("userName") String userName,@Param("passWord") String passWord);
}
