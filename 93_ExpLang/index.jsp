
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	<!--case 1 -->
	<%--
	${2+3} <br />
	${45-34} <br />
	${45/5} <br />
	${2*3} <br />
	${23%2} <br />
	

	<!--case 2 -->
	
	<% request.setAttribute("ab",12); %>
	${ab+3} <br />
	
	
	<% request.setAttribute("ab2","13"); %>
	${ab2+3} <br />
		
	<% request.setAttribute("ab3","one"); %>
	${ab3+3} <br />
	

	
	<!--case 3 -->
	
	${2/0}<br />
	${2%0}<br />
	--%>

	<!-- Case 4: -->
	
	${45 div 5} <br />
	${23 mod 2} <br />
	
 </BODY>
</HTML>
