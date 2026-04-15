package com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ServiceFilter extends HttpFilter implements Filter 
{
	
	public void init(FilterConfig fConfig) throws ServletException 
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
//			
//			Connection con = DriverManager.getConnection(url,user,pass);
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
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
//		System.out.println("Preprocessing Filter!!!");
		
		String user = request.getParameter("username");
		
		if(user!= null)
		{
			if(user.length() < 6)
			{
				System.out.println("Please Enter Username with atleast 6 letters!!!");
			}
			
		}
		
		
		
		chain.doFilter(request, response);
		
//		System.out.println("Postprocessing Filter!!!");
		
	}
	
	
	public void destroy() 
	{
		
	}
	
	

}
