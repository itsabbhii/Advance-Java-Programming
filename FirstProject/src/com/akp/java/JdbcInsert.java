package com.akp.java;
import java.sql.*;

public class JdbcInsert {
	public static void main(String args[]) throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/empdb";
		String uname = "root", psswd = "speed";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, psswd);
		Statement st = con.createStatement();
		
		// Inserting a row
		
//		int id = 6, count;
//		String name = "Keshabh", city = "Pune";
//		String query = "insert into emp(id, name, city) values(" + id + ", '" + name + "', '" + city+ "')";
//		count = st.executeUpdate(query);
//		
//		System.out.println(count+" rows affected");
//		
		// updating a row
		
//		int id =1, count;
//		String name = "Abhi";
//		String query = "update emp set name='"+name+"' where id = 1";
//		count = st.executeUpdate(query);
//		
//		System.out.println(count+" rows updated");
//	
		// Deleting a row
		
		int id = 6, count;
		String query = "delete from emp where id = "+id;
		count = st.executeUpdate(query);
		System.out.println(count+" Rows deleted");
	}
}
