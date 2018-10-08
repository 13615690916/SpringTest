package com.java1234.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java1234.model.User;


public interface UserMapper {
	//获取分页分页表中数据
	public List<User> getPagingList(@Param(value="offest") int offest,
			@Param(value="limit") int limit);
	//获取表中的数据总量
	public int getCount();
	//添加用户
	public int insertUser(User user);
	//更新表中数据
	public int updateUser(User user);
	//删除表中数据
	public int deleteUser(int id);
	
}
