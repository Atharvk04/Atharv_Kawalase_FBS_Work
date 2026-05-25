package com.shop.controller;

import java.io.IOException;
import java.util.List;

import com.shop.dao.ProductDao;
import com.shop.dao.impl.ProductDaoImpl;
import com.shop.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/products")
public class ViewProductsServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ProductDao dao = new ProductDaoImpl();
		
		List<Product> list = dao.getAllProducts();
		
		req.setAttribute("productList", list);
		req.getRequestDispatcher("products.jsp").forward(req, resp);
	}
}
