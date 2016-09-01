<%@ page import="model.Person" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <!-- Case 1: -->  
	 
  <jsp:useBean id="prsn" class="model.Person" scope="request" />

  <!-- Comment, Uncomment the setters to view the difference --> 
  <jsp:setProperty name="prsn" property="name" value="Jayesh" />
  <jsp:setProperty name="prsn" property="age" value="14" />
  <!-- Also see the translation of the setter tag -->

  Person Name: <jsp:getProperty name="prsn" property="name" /><br />
  Person Age: <jsp:getProperty name="prsn" property="age" />
  


  <!-- Case 2: -->
  <%--
  <jsp:useBean id="prsn" class="model.Person" scope="request">
	<jsp:setProperty name="prsn" property="name" value="Mayank" />
	<jsp:setProperty name="prsn" property="age" value="28" />
  </jsp:useBean>
  

  Person Name: <jsp:getProperty name="prsn" property="name" /><br />
  Person Age: <jsp:getProperty name="prsn" property="age" />
 --%>

 </BODY>
</HTML>
