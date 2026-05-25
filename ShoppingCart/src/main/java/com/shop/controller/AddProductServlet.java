package com.shop.controller;

import java.io.IOException;

import com.shop.dao.ProductDao;
import com.shop.dao.impl.ProductDaoImpl;
import com.shop.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session = req.getSession(false);

		if(session == null || session.getAttribute("role") == null ||
		   !session.getAttribute("role").toString().equalsIgnoreCase("admin")) {
		    resp.sendRedirect("accessDenied.jsp");
		    return;
		}
		
		String name = req.getParameter("name");
		String desc = req.getParameter("description");
		double price = Double.parseDouble(req.getParameter("price"));
		String category = req.getParameter("category");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String image = req.getParameter("image");
		
		Product p = new Product(name, desc, price, category,quantity,image);
		
		ProductDao dao = new ProductDaoImpl();
		boolean status = dao.addProduct(p);
		

		if(status)
		{
			req.getSession().setAttribute("toast", "success|✔' Product \"" + name + "\" 'added successfully!");
			resp.sendRedirect("admin-dashboard.jsp");
		}
		else
		{
			req.getSession().setAttribute("toast", "error|✖ Failed to add product. Please try again.");
			resp.sendRedirect("add-product.jsp");
		}
	}
	
}