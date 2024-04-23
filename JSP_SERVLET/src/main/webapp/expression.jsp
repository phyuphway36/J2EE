<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expression Tag</title>
</head>
<body>
<h3>Expression test</h3>
<p>Today Date : <%= LocalDateTime.now() %> </p>
<p>Upper Case : <%= new String("mgmg is a student").toUpperCase() %> </p>
<p>4 pow 5 : <%= Math.pow(4, 5) %> </p>
<p>100+200 : <%= 100+200 %></p>

<p>500*300+200 : ${500 * 300 + 200}</p>

</body>
</html>