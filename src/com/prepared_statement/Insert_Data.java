package com.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Data {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4","root","root");
		String sql= "insert into student values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 101);
		ps.setString(2,"ak");
		ps.setString(3, "ak@gmail.com");
		ps.setString(4, "Addr");
		ps.execute();
		System.out.println("Insert Data");
}
}
