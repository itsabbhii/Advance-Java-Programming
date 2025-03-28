<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Details</title>
</head>
<body>
    <h2>Registered User Details</h2>
    <p><strong>Name:</strong> <%= request.getAttribute("name") %></p>
    <p><strong>Email:</strong> <%= request.getAttribute("email") %></p>
    <p><strong>Phone:</strong> <%= request.getAttribute("phone") %></p>
    <p><strong>Age:</strong> <%= request.getAttribute("age") %></p>
</body>
</html>
