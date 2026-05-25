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

@WebServlet("/editProduct")
public class EditProductServlet extends HttpServlet
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
        Product p = dao.getProductById(id);  // Sahi product fetch karo by ID

        if (p == null) {
            resp.sendRedirect("products");
            return;
        }

        req.setAttribute("product", p);  // JSP ko product do
        req.getRequestDispatcher("update-product.jsp").forward(req, resp);
    }
}