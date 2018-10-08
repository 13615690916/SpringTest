package com.java1234.model;

import java.util.List;

public class JsonList {
	private List<User> userList;
	private String str;
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public JsonList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JsonList(List<User> userList, String str) {
		super();
		this.userList = userList;
		this.str = str;
	}
	
}
