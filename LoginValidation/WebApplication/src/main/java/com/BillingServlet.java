package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class BillingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		
		String [] items = (String[]) session.getAttribute("cart");
		
		int total = 0;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2> Bill </h2>");
		
		if(items != null)
		{
			for (String item : items)
			{
				if(item.equals("iphone"))
				{
					out.println("iPhone - 70000<br>");
					total += 70000;
				}
				
				else if(item.equals("ipod"))
				{
					out.println("iPad - 50000");
					total += 50000;
				}
				
				else if(item.equals("macBook"))
				{
					out.println("macbook - 100000");
					total += 100000;
				}
			}
		}
		
		request.setAttribute("totalBill", total);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("bill.jsp");
		rd.forward(request, response);
	}

}
