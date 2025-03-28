package com.akp.java;
import java.util.*;
import java.sql.*;

public class StoredProcedure {
	public static void main(String args[]) throws Exception{
		String url = "jdbc:mysql://localhost:3306/player", user = "root", pass = "speed";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String storedProcedure = "{CALL inplayer(?, ?)}";
		CallableStatement csmt = con.prepareCall(storedProcedure);
		
		csmt.setString(1,  "Rahul Kumar");
		csmt.setInt(2, 85);
		
		csmt.execute();
		
		System.out.println("Player inserted");
		
	}
}
