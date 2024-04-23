<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Test</title>
</head>
<body>

	<h3>You don't need to login Again.We have your credentials</h3>
	<%
		if(session.getAttribute("user")!= null){
		String user = session.getAttribute("user").toString();
		out.print("Session ID:"+session.getId());
		out.print("User ->" +user);
		}else{
			out.print("You don't store any credentials is server.Please login again");
		}
		
		
	%>

</body>
</html>