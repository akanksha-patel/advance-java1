<!-- Case 1b: -->
<%--<%@ page import="java.util.Date" %>--%>

<!-- Case 2a: -->	
<%--<%@ page import="java.util.Date,model.Person" %>--%>

<!-- Case 2b: -->	
<%--
<%@ page import="java.util.Date" %>
<%@ page import="model.Person" %>
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  
  <!-- Case 1a: -->	  
  <% Date dt = new Date(); %>
  <%= dt %> 
  
  <!-- Case 1b: -->	  
  <% Date dt = new Date(); %>
  <%= dt %>   

  <!-- Case 2a, 2b: -->	
  <%--
  <% java.util.Date dt = new java.util.Date(); %>
  <%= dt %>	
	
  <% Person p = new Person(); %>	
  <h1><%= p.name %></h1>--%>

 </BODY>
</HTML>
