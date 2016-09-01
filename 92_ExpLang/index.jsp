<%@ page import="java.util.*,model.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<!-- Case 1: -->
	<%--1. -${pqr}- <br/>
	
	<!-- Case 2: -->	
	2. 
	<% 
		Person p = new Person();
		p.setName("Rajiv");
		request.setAttribute("pr",p); 
	%>
	-${pr.name}- <br/>
		
	<!-- Case 3: -->	
	3.
	<%
		Map mp = new HashMap();
		mp.put("ab1",123);
		mp.put("ab2",456);
		request.setAttribute("mpz", mp);
	%>
	-${mpz.ab1}- <br />
	#${mpz.ab3}#<br />
	

	
	<!-- Case 4: -->	
	4.	
	<%
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(13);
		request.setAttribute("lst", l);
	%>
	${lst["0"]}<br />
	${lst['1']}<br />
	-${lst[3]}-
	--%>

	
	<!-- Case 5: -->
	
	5.
	${2}<br />
	${2/0}<br />
	<%--${2%0}--%>
	

 </BODY>
</HTML>
