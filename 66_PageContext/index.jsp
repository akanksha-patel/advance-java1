<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  
  <!-- Case 1: -->
  <%--
  <% application.setAttribute("abc","app-scope"); %>
  <% session.setAttribute("abc","session-scope"); %>
  <% request.setAttribute("abc","request-scope"); %>
  <% pageContext.setAttribute("abc","page-scope"); %>

  <%= pageContext.findAttribute("abc") %>--%>
  

  <!-- Case 2: -->
  <%--
  <% application.setAttribute("abc","app-scope"); %>
  <% session.setAttribute("abc","session-scope"); %>
  <% request.setAttribute("abc","request-scope"); %>
  
  <%= pageContext.findAttribute("abc") %>
  --%>


  <!-- Case 3: -->
  <%--	
  <% application.setAttribute("abc","app-scope"); %>
  <% session.setAttribute("abc","session-scope"); %>
    
  <%= pageContext.findAttribute("abc") %>
  --%>


  <!-- Case 4: -->
  <%--
  <% application.setAttribute("abc","app-scope"); %>
      
  <%= pageContext.findAttribute("abc") %>
  --%>

  	
 </BODY>
</HTML>
