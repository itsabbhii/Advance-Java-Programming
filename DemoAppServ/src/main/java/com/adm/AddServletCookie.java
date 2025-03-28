package com.adm;

import java.io.IOException;

import jakarta.servlet.http.*;

public class AddServletCookie extends  HttpServlet{
	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sqcook");
	}
}
