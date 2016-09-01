<%@ page import="java.util.*,model.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>

	Logical Operators: <br /><br />
	
	dollor{2<3 && 4>2} : ${2<3 && 4>2} <br />
	dollor{2 lt 3 and 4 gt 2} : ${2 lt 3 and 4 gt 2} <br />

	
	//+++++++++++++++++++++++++++++<br />
	dollor{2>3 || 4>2} : ${2>3 || 4>2} <br />
	dollor{2>3 or 4>2} : ${2 gt 3 or 4 gt 2} <br />
	
	
	//+++++++++++++++++++++++++++++<br />
	dollor{!(2>3)} : ${!(2>3)}<br />
	dollor{not(2>3)} : ${not(2 gt 3)}
	
 </BODY>
</HTML>
