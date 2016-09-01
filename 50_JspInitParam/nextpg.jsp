<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  
  <h1><%= session.isNew() %></h1>
  <h1>Init Parameter: <%= config.getInitParameter("xyz") %></h1>
  <h1>Context Parameter: <%= application.getInitParameter("xyz") %></h1>

 </BODY>
</HTML>
