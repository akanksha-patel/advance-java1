<%@ page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<% pageContext.setAttribute("nm","kartik-1"); %>
	<% request.setAttribute("nm","kartik-2"); %>
	<% session.setAttribute("nm","kartik-3"); %>
	<% application.setAttribute("nm","kartik-4"); %>
	
	<!-- Case 1: -->
	<%--
	${pageScope.nm}<br />
	${requestScope.nm}<br />
	${sessionScope.nm}<br />
	${applicationScope.nm}<br />	
	--%>

	+++++++++++++++++++++++<br />


	//Case 2: <br />
	<%--
	${pageScope['nm']}<br />
	${requestScope['nm']}<br />
	${sessionScope['nm']}<br />
	${applicationScope['nm']}<br />
	--%>

	+++++++++++++++++++++++<br />

	// Case 3 <br />
	<%--	
	<% 
		Map m = new HashMap(); 
		m.put("abc1","aaa");
		m.put("abc2","bbb");
		m.put("abc3","ccc");
		application.setAttribute("mpz",m);
	%>

	
	${applicationScope.mpz.abc1}<br />
	${applicationScope.mpz.abc2}<br />
	${applicationScope.mpz.abc3}<br />
	
	+++++++++++++++++++++++<br />
	
	${applicationScope.mpz['abc1']}<br />
	${applicationScope.mpz['abc2']}<br />
	${applicationScope.mpz['abc3']}<br />

	+++++++++++++++++++++++<br />
	
	${applicationScope['mpz']['abc1']}<br />
	${applicationScope['mpz']['abc2']}<br />
	${applicationScope['mpz']['abc3']}<br />
	--%>

	//case 4: <br />
	
	<% pageContext.setAttribute("for","kartik-2"); %>
	<%--${pageScope.123}--%>
	${pageScope['123']}
	
 </BODY>
</HTML>
