<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>session - form -read</title>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");

session.setAttribute("user", username+":"+password);
session.setMaxInactiveInterval(60*60);
out.print("<p><em>We Stored your information into session</em></P>");

%>
</head>
<body>
<h3>Hello Stranger...</h3>

</body>
</html>