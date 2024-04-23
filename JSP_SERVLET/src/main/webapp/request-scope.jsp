<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request scope</title>
</head>
<body>
<c:set var="requestVar" value="requestVarValue - ${2000 * 2} }" scope="request"></c:set>
<jsp:forward page="request-scope-test.jsp"></jsp:forward>

</body>
</html>