<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Declaration Tag</title>
</head>
<body>
	<h2>Declaration Tag Example</h2>
    <!-- Declaration Tag-->
    <%! 
        String str = "JSP" ;
    %>

    <p>Declaration Output: <%= str %></p>


</body>
</html>