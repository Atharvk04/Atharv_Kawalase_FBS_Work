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

@WebServlet("/updateProduct")
public class UpdateProductServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession session = req.getSession(false);

        if (session == null || session.getAttribute("role") == null ||
            !session.getAttribute("role").toString().equalsIgnoreCase("admin")) {
            resp.sendRedirect("accessDenied.jsp");
            return;
        }
        
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String desc = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        String category = req.getParameter("category");
        int qty = Integer.parseInt(req.getParameter("quantity"));
        String image = req.getParameter("image");
        
        Product p = new Product();
        
        p.setProductId(id);
        p.setName(name);
        p.setDescription(desc);
        p.setPrice(price);
        p.setCategory(category);
        p.setQuantity(qty);
        p.setImage(image);

        ProductDao dao = new ProductDaoImpl();
        
        boolean status = dao.updateProduct(p);
        
        if(status)
        {
            resp.sendRedirect("products"); 
        } 
        else 
        {
            resp.getWriter().println("Update Failed");
        }
    }
}