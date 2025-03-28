package com.adm;

import java.io.IOException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/addses")
public class AddServletSession extends  HttpServlet{
	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("sqses");
	}
}
