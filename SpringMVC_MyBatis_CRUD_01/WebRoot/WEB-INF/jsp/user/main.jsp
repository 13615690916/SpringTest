<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
	<script type="text/javascript">
		$(function(){
			
		});
		
		function getUserList(){
			$.ajax({
				url:"",
				data:"",
				dataType:"json",
				type:"post",
				success:function(data){
					$("#tbody").html("");
					$("#link").html("");
					var str="";
					for(var key in data.userList){
						str+="<tr>";
						
						str+="</tr>";
					}
					$("#tbody").append(str);
				}
			});
		}
	</script>
	
  </head>
  
  <body>
    <table>
    	<thead>
    		<tr>
    			<th>编号</th>
    			<th>用户名</th>
    			<th>密码</th>
    			<th>用户时间</th>
    			<th>错误次数</th>
    			<th>开始时间</th>
    			<th>结束时间</th>
    		</tr>
    		
    	</thead>
    	<tbody id="tbody">
    		
    	</tbody>
    </table>
    
    <div id="link">
    
    	
    </div>
  </body>
</html>
