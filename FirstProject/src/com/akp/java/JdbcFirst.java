package com.akp.java;

import java.sql.*;

public class JdbcFirst {
	public static void main(String args[]) throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/empdb";
		String uname = "root", psswd = "speed";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, psswd);
		Statement st = con.createStatement();
		
		System.out.println("-------------------------------------------");
//		Processing one query where we have to get name of person with id = 2
		String query = "select name from emp where id=2";
		
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		
		String name = rs.getString("name");
		System.out.println(name); 
	
		//		closing the result set
		rs.close();
		
		System.out.println("-------------------------------------------");
//		Processing query where we have to print all data of table
		
		String query2 = "select * from emp";
		
		ResultSet rs2 = st.executeQuery(query2);
		
		//		2nd way to print all rows using meta data info of columns
		
//		ResultSetMetaData rsmd= rs2.getMetaData();
//		int col = rsmd.getColumnCount();
		
		
		while(rs2.next()) {
//			for(int i = 1; i<=col; i++)System.out.print(rs2.getString(i)+ '\t');
//			System.out.println();
			String empdata = rs2.getInt(1)+"\t"+rs2.getString(2)+"\t"+rs2.getString(3);
			System.out.println(empdata);
			
		}
		rs2.close();
		
		System.out.println("-------------------------------------------");
//		Processing query where we have to print only 3 rows and 2 specific columns of table
		
		String query3 = "select * from emp";
		
		ResultSet rs3 = st.executeQuery(query3);
		
		
		for(int i=0;i<3;i++){
			rs3.next();
			String empdata = rs3.getString(2)+"\t"+rs3.getString(3);
			System.out.println(empdata);
			
		}
		rs3.close();
		
		System.out.println("-------------------------------------------");
		
//		Closing the connection
		con.close();
	}

}
