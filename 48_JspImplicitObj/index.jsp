<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <%-- <h1>Request: <%= a %></h1> --%>
  <h1>Hello World... Welcome to Jsp</h1>
	

  <h1>All Jsp Implicit Objects: </h1>	
  <h1>Request: <%= request %></h1>
  <h1>Response: <%= response %></h1>
  <h1>Session: <%= session %></h1>
  <h1>ServletContext: <%= application %></h1>
  <h1>ServletConfig: <%= config %></h1>
  <h1>JspWriter: <%= out %></h1>
  <h1>PageContext: <%= pageContext %></h1>
  <h1>Object: <%= page %></h1>
  <%-- <h1>Throwable: <%= exception %></h1> --%>

  <h1>+++++++++++++++++++++++++++++</h1>	
  
  <h1>All Jsp Implicit Objects, but creted by Us: (But you do not need to...!!) </h1>
  
  <h1>ServletContext: <%= getServletContext() %></h1>
  <h1>ServletConfig: <%= getServletConfig() %></h1>

 </BODY>
</HTML>
