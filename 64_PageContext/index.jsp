<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <%= pageContext %><br />
  <%= pageContext.getPage() %><br />
  <%= pageContext.getOut() %><br />
  <%= pageContext.getRequest() %><br />
  <%= pageContext.getResponse() %><br />
  <%= pageContext.getSession() %><br />
  <%= pageContext.getServletContext() %><br />
  <%= pageContext.getServletConfig() %><br />

  <% pageContext.getOut().write("We are using the object...."); %>

 </BODY>
</HTML>
