<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">


<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
    Hello!<br /><br />
	<!--  sdgjhfshjd -->
	
	<%-- Case 1: 
	<c:out value="12abc" />--%>

	<%-- Case 2: 
	<c:out  />   --%>     <!-- value --><br />
	
	<%-- Case 3: 
	<c:out value="12.3" default="guest" />--%>
	

	<%-- Case 4: 
	<c:out value="${abc}" default="guest" />--%>
	
	<%-- Case 5: 
	<c:out value="${abc2}" default="Guest" />--%>
	
	<%-- Case 6: 
	<c:out value="${abc}">Guest</c:out>--%>

	<%-- Case 7: 
	<c:out value='<%= request.getAttribute("abc") %>' />--%>
	
	<%-- Case 8: 
	${newtag}--%>

	<%-- Case 9:
	<c:out value="${newtag}"  /> --%>

	<%-- Case 10: 
	-<c:out value="${newtag}" escapeXml="false"  />- --%>


	<br /><br />I am in next page.
 </BODY>
</HTML>
