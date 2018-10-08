package com.java1234.loginLog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java1234.loginLog.mappers.LoginLogMapper;

@Service
public class LoginLogService {
		
	@Autowired
	private LoginLogMapper loginLogMapper;
	
	public boolean insertLoginLog(int userId,String ip){
		int r=loginLogMapper.insertLoginLog(userId, ip);
		return r>0;
	}
}
