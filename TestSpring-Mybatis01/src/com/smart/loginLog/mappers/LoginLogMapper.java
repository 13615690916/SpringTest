package com.smart.loginLog.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface LoginLogMapper {
	
	@Insert("insert into t_login_log set user_id=#{userId},ip=#{ip}")
	public int insertLoginLog(@Param("userId") int userId,@Param("ip") String ip);
}
