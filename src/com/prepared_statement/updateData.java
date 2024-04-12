package com.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4","root","root");
	String sql = "update Student set name=?,email=?,addr=? where rollno=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, "ajay");
	ps.setString(2, "ajay@gmail.com");
	ps.setString(3, "nagar");
	ps.setInt(4, 101);
	int update = ps.executeUpdate();
	System.out.println("Update Data"+update);
}
}
