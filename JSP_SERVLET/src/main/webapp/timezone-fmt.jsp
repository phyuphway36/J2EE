<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TimeZone format</title>
</head>
<body>
<fmt:setTimeZone value="GMT-8"/>
<c:set var="today" value="<%= new Date() %>"> </c:set>
<p> Default Timezone: <fmt:formatDate value="${today }" type="both"/> </p>
<h3> Timezone GMT-8</h3>

<fmt:timeZone value="GMT-8">
	<p> GMT-8 Timezone : <fmt:formatDate value="${today }" type="both"/>

</fmt:timeZone>

</body>
</html>