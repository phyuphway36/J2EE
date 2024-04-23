<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
             <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Import Tag</title>
</head>
<body>
	<h3>Import content</h3>
	<c:import url="http://www.example.com" var="data"></c:import>
	<c:out value="${data }"></c:out>

	
</body>
</html>