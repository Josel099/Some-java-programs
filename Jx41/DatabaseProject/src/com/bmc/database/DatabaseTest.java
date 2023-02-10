package com.bmc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.mysql.cj.xdevapi.Statement;

public class DatabaseTest {
	public static void main(String[] arg ) {
		String user="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/bmc";
		Connection con =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  con = DriverManager.getConnection(url,user,pass);
			Statement stmt=con.createStatement();
			//stmt.executeUpdate("insert into Student values(8,'jnto',12,59)");
			ResultSet rs= stmt.executeQuery("select *from student;");// which query was exicute
			while(rs.next()) {
				
				System.out.println(rs.getInt("id") + ": "+ rs.getString("name")+" : "+rs.getInt("age")+" : "+rs.getInt("mark")) ;
				
				
			}
			
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Driver Class is not available");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
		
				System.out.println("some SQLEcception while cloding the connection ..........");
			}
		}
	}

}
