<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Employee information</h3>
	<p> FirstName : ${param.fname } </p>
	<p> LastName : <%= request.getParameter("lname") %> </p>
	<p> Email : <%= request.getParameter("email") %> </p>
	
	<p> Password : <%= request.getParameter("password") %> </p>
	<p> Country : <%= request.getParameter("country") %> </p>
	<p> Gender : <%= request.getParameter("gender") %> </p>
	
	<h4>Favourite Language list</h4>
	<ol>
	<% 
		String[] languageArray = request.getParameterValues("language");
		for(String language : languageArray)
			out.print("<li>"+language+"</li>");
	%></ol>

	<p> Description : <%= request.getParameter("description") %> </p>
	
	
</body>
</html>