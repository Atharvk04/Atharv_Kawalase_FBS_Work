package com.shop.controller;

import java.io.IOException;
import java.util.List;

import com.shop.dao.OrderDao;
import com.shop.dao.impl.OrderDaoImpl;
import com.shop.model.CartItem;
import com.shop.model.Order;
import com.shop.model.Payment;
import com.shop.model.User;
import com.shop.util.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/payment")
public class PaymentServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		
		User user = (User) session.getAttribute("user");
		List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
		
		double total = 0;
		
		for(CartItem item : cart)
		{
			total += item.getPrice()*item.getQuantity();
			
		}
		
		Order order = new Order(user.getUserId(), total);
        OrderDao dao = new OrderDaoImpl();

        int orderId = dao.createOrder(order, cart);

        // Payment details
        String name = req.getParameter("cardName");
        String number = req.getParameter("cardNumber");
        String expiry = req.getParameter("expiry");
        String cvv = req.getParameter("cvv");

        Payment payment = new Payment(orderId, name, number, expiry, cvv);
        dao.savePayment(payment);

        // Clear cart
        session.removeAttribute("cart");

        req.getRequestDispatcher("orderSuccess.jsp").forward(req, resp);
	}
}
