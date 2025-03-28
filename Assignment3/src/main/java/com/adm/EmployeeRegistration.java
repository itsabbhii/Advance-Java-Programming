package com.adm;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.sql.*;

@WebServlet("/EmployeeReg")
public class EmployeeRegistration extends GenericServlet{
	
	private String url = "jdbc:mysql://localhost:3306/assignments";
	private String uname = "root";
	private String pass = "speed";
	
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String dept = req.getParameter("dept");
		double salary = Double.parseDouble(req.getParameter("salary"));
		
		PrintWriter out = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement pst = con.prepareStatement("insert into employees(id, name, department, salary) values(?,?,?,?)");
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, dept);
			pst.setDouble(4, salary);
			
			int rows = pst.executeUpdate();
			
			out.println("<h1>Inserted Successfully</h1><br><br><h3>"+rows+" Rows Affected!!</h3>");
			
		}catch(Exception e) {
			out.println("Error Occured \n"+e.getMessage());
		}
	}

}
