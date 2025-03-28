package com.adm;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AddServletRedirect extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
//		k= k*k;
		
		res.sendRedirect("sq2?k="+k);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
