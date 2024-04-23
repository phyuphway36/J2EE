<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Page variable value : <c:out value="${pageVar }"></c:out></p>
<p>Session variable value : <c:out value="${sessionVar }"></c:out></p>
<p>Request variable value : <c:out value="${requestVar }"></c:out></p>

<p>Application variable value : <c:out value="${applicationVar }"></c:out></p>

</body>
</html>