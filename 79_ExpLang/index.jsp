<%@ page import="model.Person" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<!-- Case 1: -->
	<%--${23}--%>  <br /><br />

	<!-- Case 2: -->
	<%--
	<% int a = 54; %>
	-${a}-	<br /><br />
	--%>

	<!-- Case 3: -->
	<%--
	<% pageContext.setAttribute("abc",45); %>
	Before:
	<% Integer xy = (Integer)pageContext.getAttribute("abc"); %>
	<%= xy+" ###" %><br />
	After:
	
	${abc}	<br /><br />
	--%>

	<!-- Case 4: -->
	<%--
	<%
		Person p = new Person();
		p.setName("Suresh");
		session.setAttribute("prsn",p);
	%>
	---${prsn.name}---
	--%>


	<!-- Case 5: -->
	${"2233"}
 </BODY>
</HTML>
