<%@ page import="model.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
 <!-- The original object is of Employee type, but it is first saved 
 in a Person type varibale and when we set as an attribute it is 
 again changed in the Object type -->
 <%--
 <% Employee e = (Employee)request.getAttribute("prsn"); %>
 <%= e.getName() %>
 <%= e.getAge() %>
 <%= e.getEmpId() %>
--%>


  
  <jsp:useBean id="prsn" type="model.Person" class="model.Employee" scope="request" />  

  Person Name: <jsp:getProperty name="prsn" property="name" /><br />
  Person Age: <jsp:getProperty name="prsn" property="age" />
	

 </BODY>
</HTML>
