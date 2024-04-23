<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Include Test</title>
</head>
<body>
<p>Content of current page</p>
<p>Content of current page</p>
<p>Content of current page</p>

	<%@ include file ="expression.jsp" %>
	
	<jsp:include page="request.jsp"></jsp:include>
	


	<jsp:forward page="forward-read.jsp">

	<jsp:param value="Apple,Mango,Banana" name="param1"/>
	<jsp:param value="Myanmar,japan,Thailand" name="param2"/>
</jsp:forward>

</body>
</html>
