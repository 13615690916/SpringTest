package com.smart.loginLog.model;

import java.util.Date;

public class LoginLog {
	private int loginLogId;
	private int userId;
	private String ip;
	private Date dateTime;
	public int getLoginLogId() {
		return loginLogId;
	}
	public void setLoginLogId(int loginLogId) {
		this.loginLogId = loginLogId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public LoginLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginLog(int loginLogId, int userId, String ip, Date dateTime) {
		super();
		this.loginLogId = loginLogId;
		this.userId = userId;
		this.ip = ip;
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "LoginLog [loginLogId=" + loginLogId + ", userId=" + userId
				+ ", ip=" + ip + ", dateTime=" + dateTime + "]";
	}
	
	
}
