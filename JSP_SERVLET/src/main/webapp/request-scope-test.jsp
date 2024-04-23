<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
     <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Scope</title>
</head>
<body>
<h3>Forwarded From request-scope.jsp</h3>
<p>Request variable value : <c:out value="${requestVar }"></c:out></p>


</body>
</html>