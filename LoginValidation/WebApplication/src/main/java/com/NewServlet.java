package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NewServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try
		{
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			System.out.println("\n We are in new Servlet!!!");
			
			RequestDispatcher rd = null;
			HttpSession session = req.getSession(false);
			String name = (String)session.getAttribute("username");
			System.out.println("name and Session id is: "+ name +  session.getId());
			
			rd = req.getRequestDispatcher("/Home.html");
			rd.forward(req, resp);
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}