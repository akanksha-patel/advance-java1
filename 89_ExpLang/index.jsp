<%@ page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	
	<% 
		ArrayList ar = new ArrayList();
		ar.add("Mohan");
		ar.add("Sohan");
		ar.add("Rohan");
		application.setAttribute("al",ar);
		
		String[] str = {"Kartik","Sudesh","Manak"};
		application.setAttribute("st",str);
	%>
	
	<!-- Case 1: -->
	The value: ${al['0']}, ${al[1]}, ${al['2']}, ${al['3']}, <%--${al['one']}--%> <br /><br />
	
	<!-- Case 2: -->
	The values: ${st[0]}, ${st['1']}, ${st[2]}	
 </BODY>
</HTML>
