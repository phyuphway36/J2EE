<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
             <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function jstl</title>
</head>
<body>
<c:set var="str" value="This is sample String">
</c:set>
 <p>Replace: <c:out value="${fn:replace(str,'String','Integer') }"></c:out> </p>
 <p> SubString After: <c:out value="${fn:substringAfter(str,'sample') }"></c:out> </p>
 
 <p> SubString Before: <c:out value="${fn:substringBefore(str,'sample') }"></c:out> </p>
 <c:set var="xmlTag" value="<custom> <hello> This is sample content</hello></custom>"></c:set>
 <p>Without escapeXML : ${xmlTag } </p>
 <p>With escapeXML : ${fn:escapeXml(xmlTag) } </p>


</body>
</html>