<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scriptlet</title>
</head>
<body>
<!-- <h3>1 - 10000 Count</h3>
 -->
 <h3>Shirt Price</h3>
<%
	String shirtColor = "blue";
		switch(shirtColor){
		case "green" :
			out.print("Green shirt price : 15000");
		case "red" :
			out.print("red shirt price : 20000");
		case "blue" :
			out.print("Blue shirt price : 30000");
		default : 
		out.print("Your shirt color is out of stock");
		break;
	};
	

/* 	for(int i=1;i<=10000;i++){
		out.print("Count: "+ i +"</br>");
	} */
%>

<p>Shirt color: <%= shirtColor %> </p>
</body>
</html>