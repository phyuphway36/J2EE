<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Variable Scope</title>
</head>
<body>

<!-- Scope- page,session,request,application -->	
<c:set var="pageVar" value="PageVarValue - ${2000 * 2} }" scope="page"></c:set>
<c:set var="sessionVar" value="SessionVarValue - ${2000 * 2} }" scope="session"></c:set>
<c:set var="requestVar" value="requestVarValue - ${2000 * 2} }" scope="request"></c:set>
<c:set var="applicationVar" value="ApplicationVarValue - {$2000 * 2} }" scope="application"></c:set>

<p>Page variable value : <c:out value="${pageVar }"></c:out></p>
<p>Session variable value : <c:out value="${sessionVar }"></c:out></p>
<p>Request variable value : <c:out value="${requestVar }"></c:out></p>

<p>Application variable value : <c:out value="${applicationVar }"></c:out></p>




</body>
</html>