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
  <a href="${pageContext.request.contextPath}/student/input.do">添加</a>
    <table>
    	<tr>
    		<td>编号</td>
    		<td>姓名</td>
    		<td>年龄</td>
    		<td>操作</td>
    	</tr>
    	 <%-- 注意如果要用集合，需要使用var="student" items="${studentList}注意 --%>
    	<c:forEach var="student" items="${studentList}">
    		<tr>
    			<td>${student.id }</td>
    			<td>${student.name }</td>
    			<td>${student.age }</td>
    			<td>
    			<a href="${pageContext.request.contextPath }/student/input.do?id=${student.id}">修改</a>
    			&nbsp;&nbsp;&nbsp;
    			<a href="${pageContext.request.contextPath }/student/delete.do?id=${student.id}">删除</a>
    			</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
