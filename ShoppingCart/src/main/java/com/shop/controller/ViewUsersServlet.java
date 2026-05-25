package com.shop.controller;

import java.io.IOException;
import java.util.List;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewUsers")
public class ViewUsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("role") == null ||
            !session.getAttribute("role").toString().equalsIgnoreCase("admin")) {
            response.sendRedirect("accessDenied.jsp");
            return;
        }

        UserDao dao = new UserDaoImpl();
        List<User> users = dao.getAllUsers();

        request.setAttribute("users", users);
        request.getRequestDispatcher("viewUsers.jsp").forward(request, response);
    }
}