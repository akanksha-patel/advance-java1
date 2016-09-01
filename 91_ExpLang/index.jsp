<%@ page import="model.*,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  
 </HEAD>

 <BODY>
	
	<!-- Case 1 -->
	<%--
	<%
		request.setAttribute("abc","key2");

		Map m = new HashMap();
		m.put("key1",123);
		m.put("key2",456);
		m.put("key3",789);

		session.setAttribute("dval",m);
	%>
	
	-${dval[key2]}- <br /><br />

	
	${dval[abc]} <br /><br />
	
	${dval['key3']}
	--%>

	<!-- Case 2: -->
	
	<%
		Person p = new Person();
		p.setName("Tanishq");

		request.setAttribute("pr", p);

		request.setAttribute("nm", "name");
	%>

	#${pr[name]}# <br /><br />
	
	${pr[nm]} <br /><br />
	
	${pr['name']}

	${pr['email']}
	
 </BODY>
</HTML>
