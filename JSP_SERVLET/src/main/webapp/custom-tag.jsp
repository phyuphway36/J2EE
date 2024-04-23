<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/print-tag.tld" prefix="custom" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Tag</title>
</head>
<body>
<h3>Test Custom Tag</h3>
<custom:print text="">This is sample content 1</custom:print>
<custom:print text="">This is sample content 1</custom:print>
<custom:print text="">This is sample content 1</custom:print>
<custom:print text="">This is sample content 1</custom:print>
<custom:print text="This is content from text attribute1"></custom:print>
<custom:print text="This is content from text attribute2"></custom:print>
<custom:print text="This is content from text attribute3"></custom:print>
</body>
</html>