package com.java1234.util;

public class Paging {
	
	public  String getPaging(int currentPage,int pageSize,int total){
		StringBuilder sb=new StringBuilder();
		int index=0;
		int pageCount=1;
		int count=0;
		int countNum=5;
		//计算页面总数
		if(total%pageSize==0){
			pageCount=total/pageSize;
		}else {
			pageCount=total/pageSize+1;
		}
		//首页
		sb.append("<a href='javascript:void(0) class='linkPage' linkAddress='currentPage=1&pageSize="+pageSize+"''>首页</a>");
		//上一页
		if(currentPage-1>=1){
			index=currentPage-1;
			sb.append("<a href='javascript:void(0) class='linkPage' linkAddress='currentPage="+index+"&pageSize="+pageSize+"''>上一页</a>");
		}else {
			sb.append("<a href='javascript:void(0) class='linkPage' linkAddress='currentPage="+currentPage+"&pageSize="+pageSize+"''>上一页</a>");
		}
		
		for (int i = index; i < pageCount; i++) {
			
			if(count>=countNum){
				
				break;
			}
			
			sb.append("<a href='javascript:void(0)' class='linkPage' linkAddress='currentPage="+(index+1)+"&pageSize="+pageSize+"'>"+(index+1)+"</a>");
			count++;
		}
		
		//下一页
		if (currentPage+1<=pageCount) {
			index=currentPage+1;
			sb.append("<a href='javascript:void(0) class='linkPage' linkAddress='currentPage="+index+"&pageSize="+pageSize+"''>下一页</a>");
		}else{
			sb.append("<a href='javascript:void(0) class='linkPage' linkAddress='currentPage="+pageCount+"&pageSize="+pageSize+"''>下一页</a>");
		}
		
		sb.append("当前是第"+(index+1)+"/总共有"+pageCount+"页");
		return sb.toString();
	}
}
