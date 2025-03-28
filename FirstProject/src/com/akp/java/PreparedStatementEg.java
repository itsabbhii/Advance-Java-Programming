package com.akp.java;
import java.sql.*;
import java.util.*;

public class PreparedStatementEg {
	public static void main(String argss[]) throws Exception{
		
		String uname = "root", pass = "speed", url = "jdbc:mysql://localhost:3306/empdb";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Scanner s = new Scanner(System.in);
		
		String user = "deep", city = "mumbai";
		int id = 7;
		
//		String query = "insert into emp(id, name, city) values(?,?,?)";
		String query = "delete from emp where id = ?";
		
		PreparedStatement pst = con.prepareStatement(query);
		
		// Hardcoded insert
//		pst.setInt(1, id);
//		pst.setString(2, uname);
//		pst.setString(3, city);

		// Input insert
//		
//		System.out.print("Enter id: ");
//		id = s.nextInt();
//		System.out.print("Enter name: ");
//		uname = s.next();
//		System.out.print("Enter city: ");
//		city = s.next();
//		
//		pst.setInt(1, id);
//		pst.setString(2, uname);
//		pst.setString(3, city);
		
		// delete
		System.out.print("Enter id to be deleted :");
		id = s.nextInt();
		pst.setInt(1, id);
		
		
		int count = pst.executeUpdate();
		System.out.println(count+" rows affected");		
		
		pst.close();
		con.close();
		
		
	}
}
