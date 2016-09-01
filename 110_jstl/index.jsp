<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
   
	<a href="nxtpg.do">Next Page</a>
    
	<%	
		Cookie k = new Cookie("abc","123");
		response.addCookie(k);
	%>
 </BODY>
</HTML>
