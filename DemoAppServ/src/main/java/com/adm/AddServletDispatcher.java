package com.adm;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AddServletDispatcher extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
//		k= k*k;
		
		req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
