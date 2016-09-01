<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
  <!-- Case 1: Before -->
  <%--
  <%
	  public void jspInit(){
		System.out.println("Hello");
	  }  
  %>--%>


  <!-- Case 2: After -->
  
  <%!
	  public void jspInit(){
		System.out.println("Hello");
	  }  
  %>


  <%!
	public void jspDestroy(){
		System.out.println("Bye++++++++++++++++++++++++++$$$$$###");
	}  
  %>


 </BODY>
</HTML>
