<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  
  
  <% application.setAttribute("abc","app"); %>  
  <% pageContext.setAttribute("abc-","app-",PageContext.APPLICATION_SCOPE); %> 
  

  <% session.setAttribute("abc","sess"); %>  
  <% pageContext.setAttribute("abc-","sess-",PageContext.SESSION_SCOPE); %> 
  
  <% request.setAttribute("abc","req"); %>  
  <% pageContext.setAttribute("abc-","req-",PageContext.REQUEST_SCOPE); %> 
  
  <% pageContext.setAttribute("abc","page"); %>  
  <% pageContext.setAttribute("abc-","page-",PageContext.PAGE_SCOPE); %> 
  
  <%= pageContext.getAttribute("abc-") %>

  <br />
  <%= pageContext.getAttribute("abc",PageContext.APPLICATION_SCOPE) %>

  	
 </BODY>
</HTML>
