<%@ page import="model.Person" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>

  <%--
  <% Person p = (Person)request.getAttribute("prsn"); %>

  Person Name: <%= p.getName() %><br />
  Person Age: <%= p.getAge() %>
  --%>
  <br />
  ++++++++++++++++++++++++++++++++++++++++++
  <br />
	<%--
  <!-- Case 1: -->
  <jsp:useBean id="prsn" class="model.Person" scope="request" />

  
  Person Name:- <jsp:getProperty name="prsn" property="name" /><br />
  Person Age:- <jsp:getProperty name="prsn" property="age" />
 
  <!-- values we can use for scope attribute: page, request, session & application -->
  <br />
  --%>
  ++++++++++++++++++++++++++++++++
  <br />
 
  <!-- Case 2: -->
  <!-- scope attribute is optional, the default is PAGE_SCOPE -->
  <%
  Person p1 = new Person();
  p1.setName("rajiv");
  p1.setAge(12);
  pageContext.setAttribute("prsn", p1);%>

  <jsp:useBean id="prsn" class="model.Person" scope="request" />

  Person Name:- <jsp:getProperty name="prsn" property="name" /><br />
  Person Age:- <jsp:getProperty name="prsn" property="age" />


 </BODY>
</HTML>
