<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display String</title>
</head>
<body>
    <h2>Enter a String to Display</h2>
    
    <form method="post">
        <label>Enter Text:</label>
        <input type="text" name="userString" required>
        <input type="submit" value="Display">
    </form>

    <%
        String userString = request.getParameter("userString");

        if (userString != null) {
    %>
        <h3>You Entered:</h3>
        <p style="font-size: 18px; color: blue;"><strong><%= userString %></strong></p>
    <%
        }     
    %>

</body>
</html>
