<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">


<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>

    <% 	
		String name = (String)request.getAttribute("abc2");
		if(name==null){
	%>
		<jsp:forward page="index.jsp" />
	<% } %>


	I am in next page.
 </BODY>
</HTML>
