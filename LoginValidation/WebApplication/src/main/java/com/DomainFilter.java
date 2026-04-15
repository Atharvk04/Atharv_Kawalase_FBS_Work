package com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import java.io.IOException;

@WebFilter("/ServiceFilter2")
public class DomainFilter extends HttpFilter implements Filter {
	
	 FilterConfig config;

	    public void init(FilterConfig fConfig) throws ServletException 
	    {
	        this.config = fConfig;   
	    }

	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain c)
	            throws IOException, ServletException {

	        String username = request.getParameter("username");

	        if (username != null) {
	            String companyName = config.getInitParameter("company");  

	            if (companyName != null) {
	                username = username + "@" + companyName + ".com";
	                request.setAttribute("username", username);
	            }
	        }

	        c.doFilter(request, response); 
	    }

	    public void destroy() {
	    }
}