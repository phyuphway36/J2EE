<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new Pages</title>
</head>
<body>

<%
	String favouriteNews = "IT";
	Cookie[] cookies = request.getCookies();
	
	if(cookies!=null){
		for(final Cookie cookie : cookies){
			if(cookie.getName().equals("jsp_servlet.favouriteNews")){
				favouriteNews = cookie.getValue();
				break;
				
			}
			
		}
		
	}
	
%>
<h3>Popular Topic for <b><em> <%= favouriteNews %> </em></b>News </h3>
<p>Interesting topic for <b><em> <%= favouriteNews %> </em></b> </p>
<p>Interesting topic for <b><em> <%= favouriteNews %> </em></b> </p>
<p>Interesting topic for <b><em> <%= favouriteNews %> </em></b> </p>
<p>Interesting topic for <b><em> <%= favouriteNews %> </em></b> </p>
<p>Interesting topic for <b><em> <%= favouriteNews %> </em></b> </p>
<p>Interesting topic for <b><em> <%= favouriteNews %> </em></b> </p>
<p>Interesting topic for <b><em> <%= favouriteNews %> </em></b> </p>

</body>
</html>