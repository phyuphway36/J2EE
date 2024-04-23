<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catch tag</title>
</head>
<body>

<c:catch var="exception">

	<%= 100/0 %>
</c:catch>

<c:if test="${not empty exception }">
<p>There is an exception :</p>
<p>Cause:<c:out value=" ${exception.message }"></c:out></p>

</c:if>
</body>
</html>