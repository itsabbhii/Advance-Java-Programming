package com.adm;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServletCookie extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}

		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result = "+k);
		
	}
}
