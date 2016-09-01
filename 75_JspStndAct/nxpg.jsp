<%@ page import="model.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <!-- In each case don't forget to see the difference in the translation -->

  <!-- the type attrib is optional -->
  <%--<jsp:useBean id="prsn"  class="model.Employee" scope="request" />  --%>
   
  <!-- no type attrib & specify the abstract-class-name in the class attrib -->   
  <%--<jsp:useBean id="prsn" class="model.Person" scope="request" />--%>  
  <!-- no class attrib & specify the any thing allowed in the type attrib -->   
  <jsp:useBean id="prsn" type="model.Employee" scope="request" />
	
  

  Person Name: <jsp:getProperty name="prsn" property="name" /><br />
  Person Age: <jsp:getProperty name="prsn" property="age" />


 </BODY>
</HTML>
