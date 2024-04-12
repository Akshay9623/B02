package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4","root","root");
		Statement smt = con.createStatement();
				  boolean execute = smt.execute("insert into student (rollno,name,email,addr) values (101,'ak','ak@gmail.com','pune')");
				  System.out.println("insert data"+execute);
	} catch (ClassNotFoundException | SQLException e ) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		
	}
	
}
}