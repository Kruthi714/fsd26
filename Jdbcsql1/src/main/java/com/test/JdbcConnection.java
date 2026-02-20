package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnection {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root@39");
		System.out.println("Connection successful");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into student values(1,'Kruthi',95)");
		System.out.println("Data inserted");
		con.close();
		
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
