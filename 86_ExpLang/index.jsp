
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	

	<a href="nxpg.jsp">The Link</a>
	
	<% 
		Cookie ck = new Cookie("nm","mohan"); 
		response.addCookie(ck);
	%>
	
	<br />
	<!-- there is no request side cookie at this time, you can't dream to 
	access the response side cookie object using the cookie EL implicit object -->
	${cookie.nm.name} : ${cookie.nm.value}

 </BODY>
</HTML>
