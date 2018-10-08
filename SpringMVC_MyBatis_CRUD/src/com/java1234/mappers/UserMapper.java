package com.java1234.mappers;

import java.util.List;


import com.java1234.model.User;

public interface UserMapper {
	
	int insert(User user);
	int update(User user);
	int delete(String id);
	List<User> findAllUsers();
	User findUserById(String id);
	int findOneUser(String id,String password);
	
}
