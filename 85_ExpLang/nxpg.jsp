
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	<!-- Case 1: -->
	<%--<%= request.getHeader("Accept-Language") %>--%>	<br />


	<!-- Case 2: -->
	<%--${header.accept} <br />--%>

	
	<!-- Case 3: -->
	<%--	${header['accept-encoding']}--%> <br />
	<%--	${header['accept-language']}--%> <br />

	<!-- Case 4: -->
	${headerValues.accept} <br />
	${headerValues.accept[0]} <br />
	

 </BODY>
</HTML>
