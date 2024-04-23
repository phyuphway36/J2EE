<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Condition Tag</title>
</head>
<body>
<!-- switch case default, if elseif else -->
<c:set var="salary" value ="700000">
</c:set>
<c:choose>
<c:when test="${(salary < 200000) && (salary > 0) }">
<c:out value="Your salary is low"></c:out>

</c:when>

<c:when test="${(salary ge 200000) and (salary < 600000) }">
<c:out value="Your salary is average"></c:out>

</c:when>

<c:when test="${(salary >= 600000)} ">
<c:out value="Your salary is high"></c:out>

</c:when>


<c:otherwise>
<c:out value="Your value is invalid"></c:out>
</c:otherwise>

</c:choose>

<!-- <h3>Simple If</h3>

<c:set var="age" value="40"></c:set>
- -->

<!-- gt lt ge le ne not empty -->
<!--
<c:if test="${age gt 50 }" var = "olf">
<p> <c:out value="You are too old"></c:out></p>

</c:if>
<p> Old? <c:out value="${old }"></c:out></p>

<c:if test="${age lt 50 }" var = "youth">
<p> <c:out value="You are still youth"></c:out></p>

</c:if>
<p> youth? <c:out value="${young }"></c:out></p>
- -->

</body>
</html>