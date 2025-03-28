package com.akp.java;
import java.math.*;
import java.sql.*;

public class TranactionsJdbc {
	public static void main(String args[]) throws Exception{
		String url = "jdbc:mysql://localhost:3306/empdb"
				+ "", user = "root", pass = "speed";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		con.setAutoCommit(false);
		
		String withdrawSQL = "update employee set salary = salary-? where name = ?";
		String depositSQL = "update employee set salary = salary+? where name = ?";
		
		PreparedStatement withdrawST = con.prepareStatement(withdrawSQL);
		PreparedStatement depositST = con.prepareStatement(depositSQL);
		
		// withdraw money from Amit Sharma
		withdrawST.setBigDecimal(1, new BigDecimal("5000.00"));
		withdrawST.setString(2, "Amit Sharma");
		withdrawST.executeUpdate();
		
		depositST.setBigDecimal(1, new BigDecimal("5000.00"));
		depositST.setString(2, "Rahul Verma");
		depositST.executeUpdate();
		
		con.commit();
		System.out.println("Commited successsfully");
		
		
	}
}
