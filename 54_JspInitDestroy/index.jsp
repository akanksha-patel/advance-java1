<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
    
  <%!
  public void jspInit(){
	//Case 1:
	/*
	System.out.println(request);
	System.out.println(response);
	System.out.println(session);
	System.out.println(application);
	System.out.println(config);
	System.out.println(pageContext);
	System.out.println(out);
	System.out.println(page);
	*/

	//Case 2:
	/*
	ServletConfig cnf = getServletConfig();
	ServletContext cnt = getServletContext();
	System.out.println("++++++++++++++++++++++++++++++++");
	System.out.println("Config Object: "+cnf);
	System.out.println("Context Object: "+cnt);
	System.out.println("++++++++++++++++++++++++++++++++");
	*/
  }  
  %>


	
  <%
	/*
	out.println(request);
	System.out.println(response);
	System.out.println(session);
	System.out.println(application);
	System.out.println(config);
	System.out.println(pageContext);
	System.out.println(out);
	System.out.println(page);
	*/
  %>

	<%--
  <h3><%= request %>++</h3>
  <h3><%= application %>++</h3>--%>

  <%!
  public void jspDestroy(){
	//Case 1:
	
	System.out.println(request);
	System.out.println(response);
	System.out.println(session);
	System.out.println(application);
	System.out.println(config);
	System.out.println(pageContext);
	System.out.println(out);
	System.out.println(page);
	

	//Case 2:
	/*
	ServletConfig cnf = getServletConfig();
	ServletContext cnt = getServletContext();
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println("Config Object: "+cnf);
	System.out.println("Context Object: "+cnt);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	*/
  }  
  %>


 </BODY>
</HTML>
