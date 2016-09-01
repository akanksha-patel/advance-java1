<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  
  <h1>Request Parameter: <%= request.getParameter("unm") %></h1>
  <h1>Session Attribute: <%= session.getAttribute("abc") %></h1>
  <h1>Init Parameter: <%= config.getInitParameter("abc") %></h1>
  <h1>Context Parameter: <%= application.getInitParameter("abc") %></h1>

 </BODY>
</HTML>
