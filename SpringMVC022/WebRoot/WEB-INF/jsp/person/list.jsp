<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <a href="${pageContext.request.contextPath }/person/input.do">添加</a>
    <table>
    	<tr>
    		<th>编号</th>
    		<th>姓名</th>
    		<th>年龄</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach var="person" items="${ personList}">
    		<tr>
    			<td>${person.id }</td>
    			<td>${person.name }</td>
    			<td>${person.age }</td>
    			<td>
    			<a href="${pageContext.request.contextPath }/person/input.do?id=${person.id}">修改</a>
    			&nbsp;&nbsp;&nbsp;
    			<a href="${pageContext.request.contextPath }/person/delete.do?id=${person.id}">删除</a>
    			</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
