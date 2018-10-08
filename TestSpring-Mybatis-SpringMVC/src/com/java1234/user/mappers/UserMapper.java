package com.java1234.user.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java1234.user.model.User;


public interface UserMapper {
	
	public User getUserByUserName(String userName);
	
	public List<User> getAlList();
	
	public int insertUser(@Param("userName") String userName,@Param("passWord") String passWord);
}
