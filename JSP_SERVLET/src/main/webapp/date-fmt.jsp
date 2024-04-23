<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date format</title>
</head>
<body>

<c:set var="stringDate" value="22-09-2022">

</c:set>

<fmt:parseDate var="parsedDate" value="${stringDate }" type="date" pattern="dd-MM-yyyy">
</fmt:parseDate>

<p> Parsed Date : <c:out value="${parsedDate }"></c:out> </p>
<!-- - 
<c:set var="today" value="<%= new Date() %>"> </c:set>

<p> Original; <c:out value="${today }"> </c:out> </p>
<p> Date Only : <fmt:formatDate value="${today }" type="date"/> </p>
<p> Time Only : <fmt:formatDate value="${today }" type="time"/> </p>
<p> Both Only : <fmt:formatDate value="${today }" type="both"/> </p>
<p> Long style : <fmt:formatDate value="${today }" type="both" dateStyle="long" timeStyle="long"/> </p>
<p> Medium style : <fmt:formatDate value="${today }" type="both" dateStyle="medium" timeStyle="medium"/> </p>
<p> Short style : <fmt:formatDate value="${today }" type="both" dateStyle="short" timeStyle="short"/> </p>

-->
	

</body>
</html>