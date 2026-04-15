package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignupPage extends HttpServlet
{
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	public void init()
	{
		String driverName = getServletContext().getInitParameter("driver");
		String url = getServletContext().getInitParameter("url");
		String user = getServletContext().getInitParameter("username");
		String pass = getServletContext().getInitParameter("password");
		
		try
		{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,pass);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try
		{
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
		
			String query ="insert into user values(?,?,?,?)";
		
			psmt = con.prepareStatement(query);
			
			String user = req.getParameter("username");
			String pass = req.getParameter("password");
			String secQ = req.getParameter("security_question");
			String secA = req.getParameter("security_answer");
			
			psmt.setString(1, user);
			psmt.setString(2, pass);
			psmt.setString(3, secQ);
			psmt.setString(4, secA);
			
			int count = psmt.executeUpdate();
			
			System.out.println("Rows inserted: " + count);
	
 		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void destroy()
	{
		try 
		{
			con.close();
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
	}
}
