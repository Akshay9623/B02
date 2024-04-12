package com.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4","root","root");
	String sql ="delete from student where rollno=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, 101);
	boolean execute = ps.execute();
	System.out.println("Delete Data");
	
}
}
