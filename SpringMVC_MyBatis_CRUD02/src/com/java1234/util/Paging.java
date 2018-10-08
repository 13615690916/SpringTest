package com.java1234.util;

public class Paging {
	public static String PagingString(int currentPage, int pageSize, int total) {
		pageSize=10;
		int index=0;
		int count=0;
		int pageCount = 0;
		StringBuilder sb = new StringBuilder();

		if (total % pageSize == 0) {
			pageCount = total / pageSize;
		} else {
			pageCount = total / pageSize + 1;
		}
		//首页
		sb.append("<a class='link' str='?currentPage=1&pageSize="+pageSize+"' href='#'>首页</a>&nbsp;");
		//上一页
		if ((currentPage-1)>=0) {
			index=currentPage-1;
			sb.append("<a class='link' str='?currentPage="+index+"&pageSize="+pageSize+"' href='#'>上一页</a>&nbsp;");
		}
		//返回第一页的数据
		else {
			index=0;
			sb.append("<a class='link' str='?currentPage="+index+1+"&pageSize="+pageSize+"' href='#'>上一页</a>&nbsp;");
		}
		
		for (int i = index; i < pageCount; i++) {
			if (count>=10) {
				break;
			}
			
			sb.append("<a class='link' str='?currentPage="+(i+1)+"&pageSize="+pageSize+"' href='#'>"+(i+1)+"</a>&nbsp;");
			count++;
			
		}
		//下一页
		if ((currentPage+1)<=pageCount) {
			index=currentPage+1;
			sb.append("<a class='link' str='?currentPage="+index+"&pageSize="+pageSize+"' href='#'>下一页</a>&nbsp;");
		}
		//最后一页
		else {
			sb.append("<a class='link' str='?currentPage="+pageCount+"&pageSize="+pageSize+"' href='#'>"+pageCount+" </a>&nbsp;");
		}
		//尾页
		sb.append("<a class='link' str='?currentPage="+pageCount+"&pageSize="+pageSize+" href='#''>尾页</a>&nbsp;");
		sb.append("当前是"+currentPage+"第页/总共有"+pageCount+"页");
		return sb.toString();
	}
}
