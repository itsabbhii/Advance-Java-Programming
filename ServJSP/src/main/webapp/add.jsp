<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jakarta.servlet.http.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add JSP</title>
</head>
<body bgcolor="pink">
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i+j;
	out.println("output = "+k);
	%>
</body>
</html>