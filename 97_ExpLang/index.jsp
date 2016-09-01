<%@ taglib prefix="mno" uri="mynewtld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<% request.setAttribute("abc","mohan"); %>
	${mno:conv('rohan')}<br />
	${mno:conv("sohan")}<br />
	${mno:conv(abc)}<br />

	

 </BODY>
</HTML>
