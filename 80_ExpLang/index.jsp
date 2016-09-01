<%@ page import="model.Person,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<!-- Case 1: -->
	<%--
	<%
		Person p = new Person();
		p.setName("Ganesh");
		session.setAttribute("prsn",p);
	%>
	(Scripting)Before: <br />
	<% Person pr = (Person)session.getAttribute("prsn"); %>
	<%= pr.getName() %><br />

	(Standard Action)Before: <br />
	<jsp:useBean id="prsn" class="model.Person" scope="session" />
	<jsp:getProperty name="prsn" property="name" /><br />
	
	(EL)After: <br />
	${prsn.name}<br />
	--%>

	+++++++++++++++++++++++++++++<br />	
	<!-- Case 2: -->
	
	<% 
		Map mp = new HashMap(); 
		mp.put("MP","Jbp");
		mp.put("UP","Kan");
		mp.put("AP","Hydra");
		application.setAttribute("map",mp);
	%>
	++<%= mp %>++<br />
	Before:
	
	<% Map x = (Map)application.getAttribute("map"); %>
	<%= x.get("MP") %><br />
	
	After:
	${map.UP}
	
	

 </BODY>
</HTML>
