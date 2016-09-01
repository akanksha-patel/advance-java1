<%@ page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<!-- Case 1 -->
	<%--
	<% 		
		String[] str1 = {"Kartik","Sudesh","Manak"};
		String[] str2 = {"Mohan","Sohan","Rohan"};
		String[] str3 = {"Vijay","Vikram","Mayank"};
		
		ArrayList ar = new ArrayList();
		ar.add(str1);
		ar.add(str2);
		ar.add(str3);

		application.setAttribute("al",ar);
	%>
		
	The value: ${al['0'][1]}
	--%>

	<!-- Case 2 -->
	
	<% 		
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		ArrayList al3 = new ArrayList();

		al1.add("Kartik");
		al1.add("Sudesh");
		al1.add("Manak");

		al2.add("Mohan");
		al2.add("Sohan");
		al2.add("Rohan");

		al3.add("Vijay");
		al3.add("Vikram");
		al3.add("Mayank");

		ArrayList[] str = {al1,al2,al3};
		
		application.setAttribute("st",str);
	%>
	
	
	The value: ${st['1'][1]}
	
		
 </BODY>
</HTML>
