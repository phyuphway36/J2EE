<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Image</title>
</head>
<body>
<h1 style=""color:red" align = "center"">Display Image Detail</h1>
<div align="center">
<form action="DisplayServlet" method="post">

Enter image id:
<input type="number" name="imageId">
<input type="text" name= "address">

<input type="submit" value="Display Image">
</form>
</div>
<hr>
<%

String address =(String) request.getAttribute("address");
String imgFileName =(String) request.getAttribute("img");
String imgId = (String) request.getAttribute("id");


%>
<div align="center">
<table border = "5px" style = "width:400px">
<tr>
<th>Image Id</th>
<th>Address</th>


<th>Image </th>
</tr>
<%
if(imgFileName !="" && imgId != "" )
{


%>
<tr>

<td><%=imgId %></td>
<td><%=address %></td>


<td><img src="image/<%=imgFileName %>"> </td>
</tr>
<%
}

%>


</table>

</div>

</body>
</html>