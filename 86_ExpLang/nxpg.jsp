
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	<!-- Case 1: -->
	<%--
	<% 
		Cookie[] cks = request.getCookies(); 
		for(Cookie ck : cks){
	%>
			<h1><%= ck.getName()+":"+ck.getValue() %></h1>
	<% } 	%>	
	--%>

	<!-- Case 2: -->
	+++++++++++++++++++++++++++<br />
	${cookie.nm.name} : ${cookie.nm.value}  <br />
	++++++<br />
	${cookie.JSESSIONID.name} : ${cookie.JSESSIONID.value}
	****<br />
	${cookie.nm}
	
 </BODY>
</HTML>
