<%@ page import="model.Person,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	EL Implicit Objects:<br /><br />

	PageScope: ${pageScope} <br />
	RequestScope: ${requestScope} <br />
	SessionScope: ${sessionScope} <br />
	ApplicationScope: ${applicationScope} <br /><br />

	Parameters: ${param} <br />
	ParamValues: ${paramValues} <br /><br />
	
	InitialParameters: ${initParam} <br /><br />

	Header: ${header} <br />
	HeaderValues: ${headerValues} <br /><br />

	Cookie: ${cookie} <br /><br />

	PageContext: ${pageContext} <br /><br />
 </BODY>
</HTML>
