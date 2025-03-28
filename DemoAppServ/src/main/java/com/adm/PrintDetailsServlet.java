package com.adm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class PrintDetailsServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		long mob = Long.parseLong(req.getParameter("mob"));
		
		PrintWriter out = res.getWriter();
		out.println("User Name: "+name);
		out.println("Pass word"+pass);
		out.println("Mobile"+mob);
		
	}

}
