package com.shop.controller;

import java.io.IOException;
import java.util.List;

import com.shop.model.CartItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/removeFromCart")
public class RemoveFromCartServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		
		HttpSession session = req.getSession();
		
		List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
		
		if(cart!= null)
		{
			cart.removeIf(item -> item.getProductId() == id);
		}
		
		session.setAttribute("cart", cart);
		session.setAttribute("toast", "Success|✔ Item removed from cart.");
		
		resp.sendRedirect("viewCart");
	}
}
