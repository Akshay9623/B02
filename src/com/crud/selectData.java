package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class selectData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4","root","root");
     Statement smt = con.createStatement();
     String sql= "select * from student";
     ResultSet rs = smt.executeQuery(sql);
     while(rs.next())
     {
    	 System.out.println(rs.getInt(1));
    	 System.out.println(rs.getString(2));
    	 System.out.println(rs.getString(3));
    	 System.out.println(rs.getString(4));
     }
}
}
