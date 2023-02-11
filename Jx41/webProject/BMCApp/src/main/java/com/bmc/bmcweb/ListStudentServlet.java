package com.bmc.bmcweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/List")
public class ListStudentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String user = "root";
		String pass = "root";
		String url = "jdbc:mysql://localhost:3306/bmc";
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			// stmt.executeUpdate("insert into Student values(8,'jnto',12,59)");
			ResultSet rs = stmt.executeQuery("select *from student;");// which query was exicute
			ArrayList a1 = new ArrayList();
			while (rs.next()) {
				Student s = new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark"));
				a1.add(s);
			}

			// String query="insert into Student
			// (name,age,mark)values('"+name+"',"+age+","+mark+")";
			// System.out.println(query);
			// stmt.executeUpdate(query);
			req.setAttribute("studList", a1);
			RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/ListStudent.jsp");
			rd.forward(req, resp);

			// req.setAttribute("companyName","jThread");

//			PrintWriter out=resp.getWriter();
//			out.println("saved successfully");
//			

		} catch (ClassNotFoundException e) {

			System.out.println("Driver Class is not available");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {

				System.out.println("some SQLEcception while cloding the connection ..........");
			}
		}
	}

//	private PrintWriter respgetWriter() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
