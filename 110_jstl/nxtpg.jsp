<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">


<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
   <!-- No arg constructor is required in Employee class -->
   <!-- Case 1: -->
   <%--
   <jsp:useBean id="e" class="model.Employee" scope="request">
	<jsp:setProperty name="e" property="name" value="Umesh" />			
   </jsp:useBean>
   <jsp:getProperty name="e" property="age" />   
  
   <h1>${e.age}</h1>
	--%>
	
	<!-- scope attribute in c:set is only allowed when  var attrib. is used.
	the scope attrib. is optional.-->
	<!-- Case 2: -->
   <%--
	${requestScope.e.name}--------<br />
   <c:set var="abc" value="sarvesh" />
   <c:set target="${e}" property="name" value="${abc}" />
   ${requestScope.e.name}--------
   --%>

	<!-- Case 3: -->
	<br /><br />
	Case 2a:
	<%--
	<c:set target="e" property="name" value="${abc}" />
	--%>
	<br /><br />
	<%--
	Case 2b:
	<c:set var="${e}" value="${e}" />--%>
	
	<br /><br />
	<%--
	Case 2c:
	<c:set var="acd" value="${e}" />
	<c:out value="${acd}" />
	--%>

	<br /><br />
	<%--
	Case 2d:
	<c:out value="${e.name}" /><br />+++++<br />
	<c:set var="bk" value="vijay" />
	<c:set var="rt" value="name" />
	<c:set target="${e}" property="${rt}" value="${bk}" />
	<c:out value="${e.name}" />
	--%>

	<br /><br />
	Case 2e:
	<%--
	<c:set target='<%= (model.Employee)request.getAttribute("e") %>' property="name" value="Gurmeet" />
	<c:out value='<%= ((model.Employee)request.getAttribute("e")).getName() %>' />
	--%>
	
	<br /><br />
    //Case 2f:
	<%--
	<jsp:useBean id="e" class="model.Employee" scope="request" />
	<c:out value='<jsp:getProperty name="e" property="name" />' escapeXml="false" />===--%>
    
	<br /><br />
   <%--
   <c:set target="${e}" property="name">Naraynan</c:set>
   <h1>${e.name}</h1>
  
   <br /><br />
   
   <c:out value="${cookie.abc.value}" />
   --%>
   <c:set target="${cookie.abc}" property="value" value="456" />
	
	<br /><br />
   <c:out value="${cookie.abc.value}" />
   <br /><br />
   
 </BODY>
</HTML>
