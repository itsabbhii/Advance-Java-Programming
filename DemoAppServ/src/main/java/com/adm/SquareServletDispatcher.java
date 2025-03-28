package com.adm;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServletDispatcher extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = (int) req.getAttribute("k");
		k = k*k;
//		
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
//		out.println("Hello");
		
	}
}
