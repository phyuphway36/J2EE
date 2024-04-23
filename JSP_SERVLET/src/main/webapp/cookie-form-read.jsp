<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cookie-form-read</title>
</head>
<body>

<%
	String favouriteNews = request.getParameter("favouriteNews");
	
	Cookie newsCookie = new Cookie("jsp_servlet.favouriteNews",favouriteNews);
	
	newsCookie.setMaxAge(60*60);
	
	response.addCookie(newsCookie);
	out.print("<p><b>Your personal preference is added to cookie.</b></p>");

%>
<p><a href="news-page.jsp">Checked Here</a></p>
</body>
</html>