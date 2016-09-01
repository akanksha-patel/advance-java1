<%@ page import="model.Person,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	<%--
	<%
		//request.setAttribute("abc","req");
		//session.setAttribute("abc","session");
		//application.setAttribute("abc","app");
		//pageContext.setAttribute("abc","page"); 
		//comment-uncomment to see the difference
	%>

	General:
	--${abc}--
	<br />
	--%>
	
	<%--
	<%
		session.setAttribute("abc","one");
		session.setAttribute("mno","two");
		session.setAttribute("pqr","three");	
	%>
	
	Specific:
	${ses-sionScope.pqr}
	--%>
 </BODY>
</HTML>
