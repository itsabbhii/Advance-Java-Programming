package com.adm.assignment4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		Cookie user1 = new Cookie("Abhinav", "1234");
		Cookie user2 = new Cookie("Abhishek", "5678");
		Cookie user3 = new Cookie("Rahul", "abcd");
		Cookie user4 = new Cookie("Ketan", "efgh");
		response.addCookie(user4);
		response.addCookie(user3);
		response.addCookie(user2);
		response.addCookie(user1);
		out.println("<h3>Cookies Set Successfully</h3>");
		out.println("<a href='login.html'>Login Now</a>");
    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        Cookie[] cookies = request.getCookies();
        boolean authenticated = false;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(userId) && cookie.getValue().equals(password)) {
                    authenticated = true;
                    break;
                }
            }
        }

        if (authenticated) {
            out.println("<h3>Login Successful! Welcome, " + userId + "</h3>");
        } else {
            out.println("<h3>Invalid Credentials! Try Again.</h3>");
        }
		
    }

}
