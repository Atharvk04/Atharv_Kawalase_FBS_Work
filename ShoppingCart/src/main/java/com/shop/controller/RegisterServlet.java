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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		User user = new User(name, email, password, "CUSTOMER");
		
		UserDao dao = new UserDaoImpl();
		
		boolean status = dao.registerUser(user);
		
		if(status)
		{
			resp.sendRedirect("login.jsp");
		}
		else
		{
			resp.getWriter().println("Registration Failed!!!");
		}
		
		
		
	}
}
