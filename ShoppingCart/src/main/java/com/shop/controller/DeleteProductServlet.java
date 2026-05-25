package com.shop.controller;

import java.io.IOException;

import com.shop.dao.ProductDao;
import com.shop.dao.impl.ProductDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession session = req.getSession(false);

        if (session == null || session.getAttribute("role") == null ||
            !session.getAttribute("role").toString().equalsIgnoreCase("admin")) {
            resp.sendRedirect("accessDenied.jsp");
            return;
        }
        
        int id = Integer.parseInt(req.getParameter("id"));
        
        ProductDao dao = new ProductDaoImpl();
        
        boolean status = dao.deleteProduct(id);
        
        if(status)
        {
        	req.getSession().setAttribute("toast", "success|✔ Product deleted successfully.");
            resp.sendRedirect("products");
        }
        else
            resp.getWriter().println("Delete Failed!!!");
    }
}