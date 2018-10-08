<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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

<style type="css">

</style>
  </head>
  
  <body>
    <table>
    	<tr>
    		<th colspan="2">
    		<img alt="文章列表" src="${pageContext.request.contextPath }/resources/57d7bafd697a0.jpg">
    		 </th>
    	</tr>
    	<tr>
    		<td>1</td>
    		<td><a href="${pageContext.request.contextPath }/article/details/1" target="_blank">文章一</a></td>
    	</tr>
    	<tr>
    		<td>2</td>
    		<td><a href="${pageContext.request.contextPath }/article/details/2" target="_blank">文章二</a></td>
    	</tr>
    </table>
  </body>
</html>
