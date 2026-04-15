package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class CartEntryServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String[] items = request.getParameterValues("product");
        
        HttpSession session = request.getSession();
        session.setAttribute("cart", items);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Adding the CSS directly into the dynamic response
        out.println("<html><head><style>");
        out.println("* { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Segoe UI', sans-serif; }");
        out.println("body { background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); min-height: 100vh; ");
        out.println("display: flex; align-items: center; justify-content: center; padding: 20px; }");
        out.println(".container { background: white; padding: 40px; border-radius: 16px; box-shadow: 0 15px 35px rgba(0,0,0,0.2); ");
        out.println("width: 100%; max-width: 400px; text-align: center; }");
        out.println("h2 { color: #333; margin-bottom: 20px; font-size: 1.8rem; border-bottom: 2px solid #f0f0f0; padding-bottom: 10px; }");
        out.println(".item-list { text-align: left; margin: 20px 0; }");
        out.println(".item { background: #f9f7ff; padding: 12px; margin-bottom: 8px; border-radius: 8px; ");
        out.println("color: #764ba2; font-weight: 600; border-left: 4px solid #764ba2; }");
        out.println(".no-items { color: #888; font-style: italic; margin: 20px 0; }");
        out.println("input[type='submit'] { background: #764ba2; color: white; border: none; padding: 14px 20px; ");
        out.println("border-radius: 8px; font-size: 1rem; font-weight: 600; cursor: pointer; transition: 0.3s; width: 100%; }");
        out.println("input[type='submit']:hover { background: #5a3a7e; transform: translateY(-2px); }");
        out.println("</style></head><body>");

        out.println("<div class='container'>");
        out.println("<h2>Review Your Cart</h2>");
        out.println("<div class='item-list'>");

        if (items != null && items.length > 0) {
            for (String item : items) {
                // Capitalizing the first letter for better UI
                String displayItem = item.substring(0, 1).toUpperCase() + item.substring(1);
                out.println("<div class='item'>" + displayItem + "</div>");
            }
        } else {
            out.println("<p class='no-items'>Your cart is empty.</p>");
        }

        out.println("</div>"); // Close item-list

        // Generate Bill Button
        out.println("<form action='billing' method='get'>");
        out.println("<input type='submit' value='Finalize & Generate Bill'>");
        out.println("</form>");
        
        out.println("</div>"); // Close container
        out.println("</body></html>");
    }
}