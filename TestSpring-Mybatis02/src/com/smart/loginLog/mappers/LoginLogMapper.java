package com.smart.loginLog.mappers;


import org.apache.ibatis.annotations.Param;

public interface LoginLogMapper {
	
	public int insertLoginLog(@Param("userId") int userId,@Param("ip") String ip);
}
