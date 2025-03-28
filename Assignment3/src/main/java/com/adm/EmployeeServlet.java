package com.adm;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/EmployeeServ")
public class EmployeeServlet extends HttpServlet{
	private String url = "jdbc:mysql://localhost:3306/assignments";
	private String uname = "root";
	private String pass = "speed";
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		PrintWriter out = res.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			
			out.println("<html><body>");
            out.println("<h2>Employee Details</h2>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>");
			
			while(rs.next()) {
				out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("department") + "</td>");
                out.println("<td>" + rs.getInt("salary") + "</td>");
                out.println("</tr>");
			}
			
			out.println("</table></body></html>");
			rs.close();
			st.close();
			con.close();
			
		}catch(Exception e) {
			out.println("Error occured \n"+e.getMessage());
			out.println(e.getStackTrace());
		}
		
	}

}
