<%--
<%@ page import="java.util.Date,java.util.ArrayList" %>
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <h1>Hello World... Welcome to Jsp</h1>

  <% int a = 45;  %> 	
  <h1><%= a %></h1> 
	<!-- Another text-->
  <p><%= new java.util.Date() %></p>
  
  <%! 
	void go(){
		System.out.println("Inside go");
	}  
  %>
 </BODY>
</HTML>




