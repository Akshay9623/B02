package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4","root","root");
	String sql= "delete from student where rollno=101";
	Statement smt= con.createStatement();
	smt.execute(sql);
	System.out.println("Delete Data");
}
}
