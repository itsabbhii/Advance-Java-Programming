<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    Integer visitorCount = (Integer) application.getAttribute("visitorCount");

    if (visitorCount == null) {
        visitorCount = 1;
    } else {
        visitorCount++; 
    }

    application.setAttribute("visitorCount", visitorCount);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Visitor Counter</title>
</head>
<body>
    <h2>Welcome to My Website</h2>
    <h3>Total Visitors: <%= visitorCount %></h3>
</body>
</html>
