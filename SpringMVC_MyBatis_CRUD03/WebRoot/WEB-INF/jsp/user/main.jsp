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

<title>My JSP 'main.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
<link  type="text/css" href="${pageContext.request.contextPath }/css/table.css">


<script type="text/javascript">
	$(function() {
		//获取用户信息
		GetUserList();
		
	});
	//获取用户信息
	function GetUserList(){
		$.ajax({
			url : "${pageContext.request.contextPath}/user/main.do",
			data : "",
			dataType : "json",
			type : "post",
			success : function(data) {
				$("#jsonUser").html("");
				$("#linkTag").html("");
				var linkString="";
				var str = "";
				for ( var key in data.userList) {
					str += "<tr>";
					str += "<td>" + data.userList[key].id + "</td>";
					str += "<td>" + data.userList[key].password + "</td>";
					str+="<td><a href='${pageContext.request.contextPath}/user/detail.do?id="+data.userList[key].id+"'>详情</a></td>";
					str+="<td><a href='${pageContext.request.contextPath}/user/update?id="+data.userList[key].id+"&password="+data.userList[key].password+"'>修改</a></td>";
					str+="<td><a href='${pageContext.request.contextPath}/user/delete.do?id="+data.userList[key].id+"'>删除</a></td>";
					str += "</tr>";
				}
				$("#jsonUser").append(str);
				for(var key in data.str){
					linkString+=data.str[key];
				}
				$("#linkTag").append(linkString);
			}
		});
		//超链接的点击事件
		linkClick();
	}
	//超链接的点击事件
	function linkClick(){
		$(".link").click(function(){	
		var dataString=$(this).attr("str");
		alert(dataString);
		alert(realString);
			$.ajax({
				url:"${pageContext.request.contextPath}/user/test.do",
				data:dataString,
				dataType:"json",
				type:"post",
				success:function(data){
					$("#jsonUser").html("");
				$("#linkTag").html("");
				var linkString="";
				var str = "";
				for ( var key in data.userList) {
					str += "<tr>";
					str += "<td>" + data.userList[key].id + "</td>";
					str += "<td>" + data.userList[key].password + "</td>";
					str+="<td><a href='${pageContext.request.contextPath}/user/detail.do?id="+data.userList[key].id+"'>详情</a></td>";
					str+="<td><a href='${pageContext.request.contextPath}/user/update?id="+data.userList[key].id+"&password="+data.userList[key].password+"'>修改</a></td>";
					str+="<td><a href='${pageContext.request.contextPath}/user/delete.do?id="+data.userList[key].id+"'>删除</a></td>";
					str += "</tr>";
				}
				$("#jsonUser").append(str);
				for(var key in data.str){
					linkString+=data.str[key];
				}
				$("#linkTag").append(linkString);
				}
			});
		});
	}
</script>
</head>

<body>
	<a href="${pageContext.request.contextPath }/user/add.do" id="addUser">添加</a>
	<%--    <table>
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
    </table> --%>

	<table class="table4_11">
		<thead>
			<tr>
				<th>用户名</th>
				<th>密码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody id="jsonUser">

		</tbody>
	</table>
	<div id="linkTag">
		
	</div>
</body>
</html>
