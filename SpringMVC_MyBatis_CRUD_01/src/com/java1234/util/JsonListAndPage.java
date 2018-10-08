package com.java1234.util;

import java.util.List;

import com.java1234.model.User;

public class JsonListAndPage {
	private List<User> userList;
	private String pagingString;
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public String getPagingString() {
		return pagingString;
	}
	public void setPagingString(String pagingString) {
		this.pagingString = pagingString;
	}
	public JsonListAndPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JsonListAndPage(List<User> userList, String pagingString) {
		super();
		this.userList = userList;
		this.pagingString = pagingString;
	}
	
}
