<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">


<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
   <c:choose>
		<c:when test="${food eq 'Pizza'}">
			<h1>You want to eat Pizza</h1>
		</c:when>
		<c:when test="${food eq 'Burger'}">
			<h1>You want to eat Burger</h1>
		</c:when>
		<c:otherwise>
			<h1>You want to eat Other</h1>
		</c:otherwise>
   </c:choose>	
 </BODY>
</HTML>
