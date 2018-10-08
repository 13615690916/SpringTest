<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
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
  <a href="${pageContext.request.contextPath}/user/add.do">添加</a>
    <table>
    	<tr>
    		<th>用户名</th>
    		<th>密码</th>
    		<th>操作</th>
    	</tr>
    		<c:forEach var="user" items="${a}">
    			<tr>
    				<td>${user.id }</td>
    				<td>${user.password}</td>
    				<td><a href="${pageContext.request.contextPath}/user/detail.do?id=${user.id}">详情</a></td>
    				<td><a href="${pageContext.request.contextPath}/user/update.do?id=${user.id}&password=${user.password}">修改</a></td>
    				<td><a href="${pageContext.request.contextPath}/user/delete.do?id=${user.id}">删除</a></td>
    			</tr>
    		</c:forEach>
    </table>
  </body>
</html>
