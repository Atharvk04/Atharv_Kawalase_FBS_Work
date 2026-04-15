package com.listener;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


public class ContextListener implements ServletContextListener 
{
	Connection con = null;
   
    public void contextInitialized(ServletContextEvent e)  
    { 
         try
         {
        	 String driver = e.getServletContext().getInitParameter("driver");
        	 String url = e.getServletContext().getInitParameter("url");
        	 String user = e.getServletContext().getInitParameter("username");
        	 String pass = e.getServletContext().getInitParameter("password");
        	 
        	 Class.forName(driver);
        	 con = DriverManager.getConnection(url,user,pass);
        	 
        	 //putting into ServletContextListener
        	 
        	 e.getServletContext().setAttribute("dbcon", con);
         }
         
         catch(Exception e1)
         {
        	 e1.printStackTrace();
         }
    }

	
    public void contextDestroyed(ServletContextEvent e)  
    { 
         try
         {
        	 con = (Connection) e.getServletContext().getAttribute("dbcon");
        	 con.close();
         }
         
         catch(Exception e1)
         {
        	 e1.printStackTrace();
         }
    }
	
}
