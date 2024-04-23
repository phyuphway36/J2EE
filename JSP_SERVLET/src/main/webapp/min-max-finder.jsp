<%@page import="utility.MinMaxFinder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Max Min Finder</title>
</head>
<body>

<h3>Max Min Finder</h3>
<p> Max value of 30,20,40,60: <%= MinMaxFinder.max(30, 20, 40, 60) %> </p>

<%
	String minString = MinMaxFinder.min("Apple", "Banana", "Kiwi", "Orange");
	out.print("<p> Min string value " + minString + "</P>");
%>
</body>
</html>