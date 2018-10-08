<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
	<script type="text/javascript" src="<%=path%>/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="<%=path%>/bootstrap/js/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path%>/bootstrap/css/bootstrap-theme.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/bootstrap/css/bootstrap.min.css">
	
	<script type="text/javascript">
		
	</script>
	
	<style type="text/css">
	 	div.hero-unit{
			/* background:url(image/bg.png) no-repeat; */ /* //设计背景图的Banner效果 */
			height:443px;   /* //固定高度显示,方便显示背景图Banner */
			width:980px;    /* //覆盖默认值940 */ 
			position:relative;  /* //设计定位包含框,以方便内部定位 */
			padding:0;      /* //清除默认值60像素 */
			margin:0;       /* //清除margin-bottom默认值30像素 */
			border-color:gray;  /* //重写默认值为red边框 */
		}
		div.hero-unit h1{  /* //隐藏标题 */
			display:none;
		}
		div.href-unit .banner{ /* //定位光该文本在左下角显示 */
			position:absoult;
			bottom:0;
			left:10px;
		}
		div.href-unit .btn{  /* //定位按钮在右下角显示 */
			position:absolute;
			bottom:14px;
			right:20px;
		}
		
		/*针对性重置,就是设置特定上下文环境来重设样式。  例如,针对通用选择器的使用,Bootstrap仅限制在打印媒体类型中使用*/
		 @media print{
 			*{
 				test-shadow:none !inportant;
 				color:#000 !inportant; /* black prints faster :h5bp.com/s */
 				background:transparent !inportant;
 				box-shadow:none !important;
 			}   
    	} 
    	
    	/*.row  div{
    		background-color:gary;
    		height:300px;
    	} */
	</style>
	
  </head>
  
  <body>
    <!-- <ul id="myTab" class="nav nav-tabs">
	<li class="active">
		<a href="#home" data-toggle="tab">
			 菜鸟教程
		</a>
	</li>
	<li><a href="#ios" data-toggle="tab">iOS</a></li>
	<li class="dropdown">
		<a href="#" id="myTabDrop1" class="dropdown-toggle" 
		   data-toggle="dropdown">Java 
			<b class="caret"></b>
		</a>
		<ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">
			<li><a href="#jmeter" tabindex="-1" data-toggle="tab">jmeter</a></li>
			<li><a href="#ejb" tabindex="-1" data-toggle="tab">ejb</a></li>
		</ul>
	</li>
</ul>
<div id="myTabContent" class="tab-content">
	<div class="tab-pane fade in active" id="home">
		<p>菜鸟教程是一个提供最新的web技术站点，本站免费提供了建站相关的技术文档，帮助广大web技术爱好者快速入门并建立自己的网站。菜鸟先飞早入行——学的不仅是技术，更是梦想。</p>
	</div>
	<div class="tab-pane fade" id="ios">
		<p>iOS 是一个由苹果公司开发和发布的手机操作系统。最初是于 2007 年首次发布 iPhone、iPod Touch 和 Apple 
			TV。iOS 派生自 OS X，它们共享 Darwin 基础。OS X 操作系统是用在苹果电脑上，iOS 是苹果的移动版本。</p>
	</div>
	<div class="tab-pane fade" id="jmeter">
		<p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>
	</div>
	<div class="tab-pane fade" id="ejb">
		<p>Enterprise Java Beans（EJB）是一个创建高度可扩展性和强大企业级应用程序的开发架构，部署在兼容应用程序服务器（比如 JBOSS、Web Logic 等）的 J2EE 上。
		</p>
	</div>
</div> -->

<!-- <ul class="nav nav-tabs">
	<li class="active"><a href="#tab1" data-toggle="tab">Tab1</a></li>
	<li><a href="#tab2" data-toggle="tab">Tab2</a></li>
	<li><a href="#tab3" data-toggle="tab">Tab3</a></li>
	<li><a href="#tab4" data-toggle="tab">Tab4</a></li>
</ul>
 <div class="tab-content">
 	<div class="tab-pane active" id="tab1">1</div>
 	<div class="tab-pane" id="tab2">2</div>
 	<div class="tab-pane" id="tab3">3</div>
 	<div class="tab-pane" id="tab4">4</div>
 </div> -->
 
<!--  <div class="container">
 	<div class="hero-unit">
 		<h1>联想控股</h1>
 		<p><img  alt="背景图片2"/></p>
 		<p><a href="#">更多&raquo;</a></p>
 	</div>
 	<div class="row">
 		<div class="span4">
 			<h2>公司专题</h2>
 			<p>aaaa</p>
 			<p><a href="#">了解更多</a></p>
 		</div>
		<div class="span4">
			<h2>特别关注</h2>
			<p>bbbb</p>
			<p><a href="#">了解更多</a></p>
		</div> 
		<div class="span4">
			<h2>关于我们</h2>
			<p>cccc</p>
			<p><a href="#">了解更多</a></p>
		</div> 	
 	</div>
 	<hr>
 	<footer>
 		<p>&copy; Company 2013</p>
 	</footer>
 </div>
  -->
    
    
   <!--  <div class="row" style="border:1px solid black;">
    	<div class="span3">3</div>
    	<div class="span6">6</div>
    	<div class="span3">3</div>
    </div> -->
    
   <!--  <div class="container"> 
    	<div class="row">
    		<div class="span4">span4</div>
    		<div class="span8">span8</div>
    	</div>
    	<div class="row">
    		<div class="span4">span4</div>
    		<div class="span6">span6</div>
    		<div class="span2">span2</div>
    	</div>
    </div> -->
    
    
    
  </body>
</html>
