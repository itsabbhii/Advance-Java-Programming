<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.time.*, java.time.format.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Today</title>
</head>
<body>
<%
	LocalDateTime local = LocalDateTime.now();
	String st = local.toString();
	String Date = local.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	String Time= local.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	
%>
<h1></h1>
<h1>Date: </h1><h2><%= Date %></h2>
<h1>Time: </h1><h2><%= Time %></h2>
</body>
</html>