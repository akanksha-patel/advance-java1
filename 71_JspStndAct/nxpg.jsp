<%@ page import="model.Person" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <!-- Case 1: -->
 <%--
  <% Person p = (Person)request.getAttribute("prsn"); %>--%>
<%--
  Person Name: <%= p.getName() %><br />
  Person Age: <%= p.getAge() %>
 --%>
  <br />
  ++++++++++++++++++++++++++++++++++++++++++
  <br />

  <!-- Case 2:  close one of them and try getProperty statndard action-->
  <jsp:useBean id="prsn" class="model.Person" scope="request" />
  
  <% 
	Person p = new Person("manmohan", 60); 
	application.setAttribute("prsn", p);
  %>

  Person Name: <jsp:getProperty name="prsn" property="name" />++++<br />
  Person Age: <jsp:getProperty name="prsn" property="age" />++++


 </BODY>
</HTML>
