<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">


<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
	<!-- ############ -->
	<%--
	<% request.setAttribute("abc", 3423); %>
	
	or,

   <jsp:useBean id="abc" class="java.lang.Integer" scope="request">
	<jsp:setProperty name="abc" property="?" />
   </jsp:useBean>

   or,

   <c:set var="abc" value="3423" scope="request" />
   --%>
   <!-- ############ -->	


   <!-- Case 1: -->
   <%--<h1>${pqr}</h1>--%>
	
   <!-- Case 2: -->  
	<%--
   <c:set var="pqr" value="${mno}" scope="session"  /><br />
   <h1>${sessionScope.pqr}</h1>
	--%>

	<%--
   <!-- Case 3: -->
   <c:set var="pqr">Kartik</c:set>
 
   <!-- Case 3.1 with 3: -->
   <br /><br />
   <h1>${pqr}</h1>
   
   <!-- Case 3.2 with 3: -->
   <br /><br />
   <h1>${requestScope.pqr}</h1>
	--%>


 </BODY>
</HTML>
