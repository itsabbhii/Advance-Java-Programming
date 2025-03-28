package com.adm;

import java.io.IOException;

import jakarta.servlet.http.*;

public class DetailsServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		long mob = Long.parseLong(req.getParameter("num"));
		
		res.sendRedirect("print?uname="+name+"&pass="+pass+"&mob="+mob);
	}

}
