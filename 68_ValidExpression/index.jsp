<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>



 
  <%!
	void go(){
		System.out.println("Hello");
	}
	
	int process(){
		System.out.println("Hello 2");
		return 67;
	}

  %>
 
  <% int x = 90; %>

  <!-- Case 1: -->
  <%= x %>    <br />

  <!-- Case 2: -->
  <%= 23 %>    <br />

  <!-- Case 3: -->
  <%= "mohan" %>    <br />

  <!-- Case 4: -->
  <%--<%= go() %> --%>   <br />
  
  <!-- Case 5: -->
  <%= process() %>    <br />

  <!-- Case 6: -->
  <%= 5+3*2 %>    <br />

  <!-- Case 7: -->
  <%--<%= int y = 9 %>--%>    <br />
  
  <!-- Case 8: -->
  <%= x = 2 %>    <br />
  
  <!-- Case 9: -->
  <%= 12>13 %>    <br />

  

  <!-- Case 10: -->
  <%--<% = x %>--%>    <br />

 </BODY>
</HTML>
