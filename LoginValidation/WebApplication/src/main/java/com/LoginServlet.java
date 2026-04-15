package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	
	public void init()
	{
//		String driverClass=getServletContext().getInitParameter("driver");
//		String url=getServletContext().getInitParameter("url");
//		String user=getServletContext().getInitParameter("username");
//		String pass=getServletContext().getInitParameter("password");
//		
//		try 
//		{
//			Class.forName(driverClass);
//			
//			con = DriverManager.getConnection(url,user,pass);
//		} 

//		catch (ClassNotFoundException e) 
//		{
//			e.printStackTrace();
//		} 
//		catch (SQLException e) 
//		{
//			
//			e.printStackTrace();
//		}
		
		con = (Connection) getServletContext().getAttribute("dbcon");
				
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			
			String query = "select * from user where username = ? and password = ?";
			
			pst = con.prepareStatement(query);
			
			
//			String user = req.getParameter("username");
//			String pass =req.getParameter("password");
			
			String user = (String) req.getAttribute("username");

			if (user == null) {
			    user = req.getParameter("username");
			}

			String pass = req.getParameter("password");
			
			pst.setString(1, user);
			pst.setString(2, pass);
			
			rs = pst.executeQuery();
			
			//Servlet Config
			ServletConfig config = getServletConfig();
			String companyName = config.getInitParameter("company");
			user = "@" + companyName + ".com";
			
			
			//Servlet Collaboration
			
			RequestDispatcher rd = null;
			
			//Redirect rdd = null;
						
			if(rs.next())
			{
				HttpSession session = req.getSession(true);
				String sessionId = session.getId();
				session.setAttribute("username", user);
				
				System.out.println("Session id is: "+ sessionId);
				
//				rd = req.getRequestDispatcher("/gadgets.html");
//				rd.forward(req, resp);
				
				resp.sendRedirect("gadgets.html");
			}
				
			
//			else
//			{
//				rd = req.getRequestDispatcher("/login.html");
//				rd.include(req, resp);
//				
//				out.println("Invalid UserName or Password!!");
//			}
				
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
