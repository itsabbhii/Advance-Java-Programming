<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Tag</title>
</head>
<body>
	<h2>Expression Tag Example</h2>
	<% int n = Integer.parseInt(request.getParameter("num")); %>
	<%!
		public int square(int n){
		return n*n;
		}
	%>
	<p>Expression output is : <%= square(n) %></p>
</body>
</html>