package com.adm;
import java.io.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sqses")
public class SquareServletSession extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session=  req.getSession();
		
		int k  = (int)session.getAttribute("k");
		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result = "+k);
		
	}
}
