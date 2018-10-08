<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'add.jsp' starting page</title>

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
	<form action="${pageContext.request.contextPath }/user/addUser.do"
		method="post">
		<table>
			<tr>
				<th>用户名</th>
				<th>密码</th>
			</tr>
			<tr>
				<td><input type="text" name="id"></td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="添加"></td>
			</tr>
		</table>
	</form>
</body>
</html>
