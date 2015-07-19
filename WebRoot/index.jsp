<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <h1>A Servlet Sample</h1>
    <hr>
    <a href="servlet/HelloServlet">request HelloServlet via GET.</a><br>
    <a href="servlet/JSONServlet">This is a Servlet provided in JSON.</a>
    <form action="servlet/HelloServlet" method="post">
      <input type="submit" value = "Post 方式提交">
    </form>
    <form action="servlet/JSONServlet" method="post">
    	<input type="submit" value = "Post 方式提交JSONServlet">
    </form>
  </body>
</html>
