<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Welcome <strong><%=request.getAttribute("name") %></strong></h3>

<h3>User Details are : </h3>
<h6>Name: <strong><%=request.getAttribute("name") %></strong></h6>
<h6>Department: <strong><%=request.getAttribute("dept") %></strong></h6>
<h6>Mobile Number: <strong><%=request.getAttribute("mob") %></strong></h6>

</body>
</html>