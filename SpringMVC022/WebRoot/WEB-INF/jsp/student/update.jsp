<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'delete.jsp' starting page</title>
    
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
    <form action="student/save.do" method="post">
    	<table>
    		<tr>
    			<th colspan="2">修改用户</th>
    		</tr>
    		<tr>
    			<td>姓名</td>
    			<td><input type="text" name="name" value="${student.name }"></td>
    		</tr>
    		<tr>
    			<td>年龄</td>
    			<td><input type="text" name="age" value="${student.age }"></td>
    		</tr>
    		<tr>
    			<td><input type="hidden" value="${student.id } " name="id"></td>
    			<td><input type="submit" value="修改"></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
