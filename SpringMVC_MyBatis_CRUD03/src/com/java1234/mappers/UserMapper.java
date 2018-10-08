package com.java1234.mappers;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.java1234.model.User;

public interface UserMapper {
	//添加用户
	int insert(User user);
	//修改用户
	int update(User user);
	//删除用户
	int delete(String id);
	//查找所有用户
	List<User> findAllUsers();
	//检查用户名唯一
	User findUserById(String id);
	//检查用户名密码是否正确
	int findOneUser(String id,String password);
	//获取表中全部数据
	int getCount();
	//分页 必须要写成这种格式
	List<User> paging(@Param("offset") int offset,@Param("limit") int limit);
}
