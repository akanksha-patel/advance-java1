<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">


<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
 //Case 1:
	<%--
	<c:if test="${food eq 'Pizza'}">
		<h1>You want to eat Pizza</h1>
	</c:if>
	<c:if test="${food eq 'Burger'}">
		<h1>You want to eat Burger</h1>
	</c:if>
	<c:if test="${food eq 'Other'}">
		<h1>You want to eat Other</h1>
	</c:if>
	--%>
	 
 //Case 2:
 <%--<h1>You want to eat ${food}</h1>--%>

 //Case 3:
 
 <h1>You want to eat ${param.food}</h1>
 </BODY>
</HTML>
