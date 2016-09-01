
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<% pageContext.setAttribute("nm","kartik"); %>
	
	
	<!-- case 1: -->
	<%--${pageContext.attribute}--%>

	<!-- case 2: -->
	<%--
	${pageContext.page} <br />
	${pageContext.request} <br />
	${pageContext.response} <br />
	${pageContext.session} <br />
	${pageContext.servletConfig} <br />
	${pageContext.servletContext} <br />
	--%>

	<!-- case 3: -->
	
	<% request.setAttribute("nm","Kartik"); %>
	
	<%--${pageContext.request.attribute}
	${requestScope.nm}<br />
	${nm}--%>

	<!-- case 4: -->
	
	${pageScope.nm} ** <br />
	<a href="nxpg.jsp">The Next Page</a>
   
	
 </BODY>
</HTML>
