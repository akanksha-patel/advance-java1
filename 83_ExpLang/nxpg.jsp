<%@ page import="model.Person,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	<!-- Case 1: -->
	<%--${param.nm}<br />--%>

	<!-- Case 2: -->
	
	${paramValues.nm[0]}&nbsp;${paramValues.nm[1]}&nbsp;
	${paramValues.nm[2]}
	<br />

	${param.em}

 </BODY>
</HTML>
