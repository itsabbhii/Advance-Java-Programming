package com.adm;

import java.io.IOException;

import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/GetThemeServlet")
public class GetThemeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Default theme is light
        String theme = "light";
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userTheme")) {
                    theme = cookie.getValue();
                }
            }
        }

        // Apply theme
        String bgColor = theme.equals("dark") ? "#333" : "#fff";
        String textColor = theme.equals("dark") ? "#fff" : "#000";

        out.println("<html><body style='background:" + bgColor + "; color:" + textColor + ";'>");
        out.println("<h3>Welcome! Your preferred theme is: " + theme + "</h3>");
        out.println("<a href='SetThemeServlet?theme=light'>Light Mode</a> | ");
        out.println("<a href='SetThemeServlet?theme=dark'>Dark Mode</a>");
        out.println("</body></html>");
    }
}
