<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
	<%
		String techName = request.getParameter("tech");
	
		if(techName.equals("java"))

		{
	%>
	

		<jsp:forward page = "java.html" />
	
	<%
	
		}
		
		else
			
		{
	%>
	
		<jsp:forward page = "python.html"/>
	
	<%
		}
	%>