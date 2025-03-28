package com.adm;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.sql.*;
import java.util.ArrayList;
import java.io.*;


@WebServlet("/AttendanceServlet")
public class EmployeeAttendance extends HttpServlet {
    
    @SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String empName = request.getParameter("empName");
        String empId = request.getParameter("empId");
        
        try{
            HttpSession session = request.getSession();
            
            ArrayList<String> attendanceList = (ArrayList<String>) session.getAttribute("attendanceList");
            if(attendanceList==null) {
            	attendanceList = new ArrayList<>();
            }
            
            attendanceList.add("ID: " + empId + ", Name: " + empName);
            session.setAttribute("attendanceList", attendanceList);
            
            out.println("<h3>Attendance Marked Successfully!</h3>");
        } catch(Exception e) {
            out.println("<h3>Error Occured </h3>");
        }
        out.println("<a href='EmployeeAttendance.html'>Mark Another</a> | <a href='AttendanceServlet'>View Attendance</a>");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

    	PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        
        @SuppressWarnings("unchecked")
        ArrayList<String> attendanceList = (ArrayList<String>) session.getAttribute("attendanceList");
        
        out.println("<h2>Employee Attendance List</h2>");
        if (attendanceList == null || attendanceList.isEmpty()) {
            out.println("<p>No attendance records found.</p>");
        } else {
            out.println("<ul>");
            for (String record : attendanceList) {
                out.println("<li>" + record + "</li>");
            }
            out.println("</ul>");
        }
        out.println("<a href='EmployeeAttendance.html'>Mark Attendance</a>");
    }
}
