package com.adm;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/SetThemeServlet")
public class SetThemeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String theme = request.getParameter("theme");
        if (theme == null) theme = "light";

        Cookie themeCookie = new Cookie("userTheme", theme);
        response.addCookie(themeCookie);

        out.println("<h3>Theme set to: " + theme + "</h3>");
        out.println("<a href='GetThemeServlet'>Go to homepage</a>");
    }
}
