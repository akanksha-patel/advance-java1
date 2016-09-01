<%@ page import="model.Person,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	<!-- Case 1: -->
	<form action="nxpg.jsp">
		Your Name: <input type="text" name="nm" />
		<input type="submit" value="Save" />
	</form>
	<br /><br />
	++++++++++++++++++++++++++++++
	<br /><br />
	<!-- Case 2: -->
	<form action="nxpg.jsp">
		First Name: <input type="text" name="nm" /><br />
		Middle Name: <input type="text" name="nm" /><br />
		Last Name: <input type="text" name="nm" /><br />
		Email: <input type="text" name="em" /><br />
		<input type="submit" value="Save" />
	</form>
 </BODY>
</HTML>
