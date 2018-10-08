package com.java1234.model;

import java.util.Date;

public class User {
	private int id;
	private String loginid;
	private String password;
	private String usertime;
	private int errortimes;
	private Date starttime;
	private Date endtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertime() {
		return usertime;
	}
	public void setUsertime(String usertime) {
		this.usertime = usertime;
	}
	public int getErrortimes() {
		return errortimes;
	}
	public void setErrortimes(int errortimes) {
		this.errortimes = errortimes;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String loginid, String password, String usertime,
			int errortimes, Date starttime, Date endtime) {
		super();
		this.id = id;
		this.loginid = loginid;
		this.password = password;
		this.usertime = usertime;
		this.errortimes = errortimes;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginid=" + loginid + ", password="
				+ password + ", usertime=" + usertime + ", errortimes="
				+ errortimes + ", starttime=" + starttime + ", endtime="
				+ endtime + "]";
	}
	
	
}
