<%@ page import= "java.util.Date" %>

<html>

	<p>Welcome User!!!</p>
	
	<%
		String dateTime = new Date().toString();
	
		out.println("Current Date and Time is: <br>"+dateTime);
	%>
	
	<%
	
		session.setAttribute("TechName", "Java Full Stack");
	%>
	
	<%!
		static int count = 0; 	
	
		public int getCount()
		{
			count++;
			return count;
		}
		
	%>
	
	<p>Page Visit Count <%=getCount() %></p>
</html>
