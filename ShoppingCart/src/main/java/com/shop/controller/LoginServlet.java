package com.shop.controller;

import java.io.IOException;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserDao dao = new UserDaoImpl();
		
		User user = dao.login(email,password);
		
		if(user!= null)
		{
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			session.setAttribute("role", user.getRole());
			
			if("ADMIN".equals(user.getRole()))
				resp.sendRedirect("admin-dashboard.jsp");
			
			else
				resp.sendRedirect("home.jsp");
		}
		
		else
			resp.getWriter().println("Invalid Credentials!!!!");
			
	}
}
