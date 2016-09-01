<%@ page import="java.util.*,model.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<!-- Case 1: -->
	<%--
	<% String x = (String)request.getAttribute("a"); %>
	<%= x %><br />

	
	//+++++++<br />
	&gt;${a}&lt;<br />
	${7 == a}<br />
	

	<br />
	 Case 2: <br />
	
	<% Boolean x = (Boolean)request.getAttribute("a"); %>
	<%= x %><br />
	
	//+++++++<br />
	&gt;${a}&lt;<br />
	${true and a}<br />
	${7 < a}<br />
	
	//+++++++<br />	
	<!-- Case 3: -->
	${a == b}<br />
	${a and b}<br />
	${not a}<br />
	${not b}<br />
	
	
	//+++++++<br />
	
	<!-- Case 4: -->
	>${abc}<<br />
	>${abc[xyz]}<<br />
	>${abc.xyz}<<br />
	--%>
	

	//+++++++<br />
	<!-- Case 5: -->
	<% request.setAttribute("abc",123); %>
	>${abc}<<br />
	
	>${abc['xyz']}<<br />
	>${abc.xyz}<<br />
	

 </BODY>
</HTML>
