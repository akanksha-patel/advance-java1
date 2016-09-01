<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <% pageContext.setAttribute("abc","page-sope"); %>

  <!-- Case 1: -->  
  <%--<%= pageContext.getAttribute("abc") %>--%>

  <br />

  <!-- Case 2: -->
 
  <%= pageContext.getAttribute("abc",PageContext.APPLICATION_SCOPE) %>
  <br />
  
  <%= pageContext.getAttribute("abc",PageContext.SESSION_SCOPE) %>
  <br />
  <%= pageContext.getAttribute("abc",PageContext.REQUEST_SCOPE) %>
  <br />
  <%= pageContext.getAttribute("abc",PageContext.PAGE_SCOPE) %>
  

 </BODY>
</HTML>
