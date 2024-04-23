<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Decleration </title>
</head>
<body>

<%!
int value =1000;
	public double max(double op1,double op2){
		return (op1>op2)?op1:op2;
	
}

	public double min(double op1, double op2) {
		return (op1 > op2) ? op1 : op2;

	}
%>
<p>Max value of 34.5 & 35.6: <%= max(34.5,35.6) %> </p>
<p> Value : <%= value %></p>
<p>Min value of 34.5 & 35.6: <%= max(34.5,35.6) %> </p>

</body>
</html>