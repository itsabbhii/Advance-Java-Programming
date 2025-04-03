<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Active Controls Demo</title>
</head>
<body>
    <h2>Active Controls Example</h2>

    <form method="post">
        <label>Enter Your Name:</label>
        <input type="text" name="username" required><br><br>

        <label>Select Your Hobbies:</label><br>
        <input type="checkbox" name="hobby" value="Reading"> Reading
        <input type="checkbox" name="hobby" value="Gaming"> Gaming
        <input type="checkbox" name="hobby" value="Traveling"> Traveling
        <br><br>

        <label>Select Your Gender:</label><br>
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female
        <input type="radio" name="gender" value="Other"> Other
        <br><br>

        <input type="submit" value="Submit">
    </form>

    <%
        String name = request.getParameter("username");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobby");

        if (name != null && gender != null) {
    %>
        <h3>Submitted Information:</h3>
        <p><strong>Name:</strong> <%= name %></p>
        <p><strong>Gender:</strong> <%= gender %></p>
        <p><strong>Hobbies:</strong> 
        <%
            if (hobbies != null) {
                for (String hobby : hobbies) {
                    out.print(hobby + " ");
                }
            } else {
                out.print("No hobbies selected.");
            }
        %>
        </p>
    <%
        }
    %>

</body>
</html>
