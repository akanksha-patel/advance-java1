<%@ page import="java.util.*,model.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>

	Relational Operators: <br /><br />
	
	<% 
		int x = 2;
		request.setAttribute("a", x);
	%>
	// == -------------- <br />
	a == 2 : ${a == 2}<br />
	a eq 2 : ${a eq 2}<br />

	
	// != -------------- <br />
	a != 2 : ${a != 2}<br />
	a ne 2 : ${a ne 3}<br />
	
	
	// <= -------------- <br />
	a <= 2 : ${a <= 3}<br />
	a le 2 : ${a le 3}<br />
	
	
	// >= -------------- <br />
	a >= 2 : ${a >= 3}<br />	
	a ge 2 : ${a ge 3}<br />
	
	
	// < -------------- <br />
	a < 2 : ${a < 3}<br />
	a lt 2 : ${a lt 3}<br />
	
	
	// > -------------- <br />
	a > 2 : ${a > 3}<br />	
	a gt 2 : ${a gt 3}<br />
	

	
	
 </BODY>
</HTML>
