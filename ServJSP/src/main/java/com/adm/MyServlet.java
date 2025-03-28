package com.adm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletContext ctx = getServletContext();

		PrintWriter out = res.getWriter();
		out.println("name = "+ctx.getInitParameter("name"));
		out.println("phone = "+ctx.getInitParameter("phone"));


	}
}
