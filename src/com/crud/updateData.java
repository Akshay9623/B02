package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class updateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4","root","root");
		
		String sql= "update student set name='akshay',email='akshay@gmail.com',addr='mumbai' where rollno=101";
			Statement smt = con.createStatement();
			int update = smt.executeUpdate(sql);
			System.out.println("Update Data"+update);

	}
}
