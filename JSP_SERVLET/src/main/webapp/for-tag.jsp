<%@page import="utility.Vehicle"%>
<%@page import="java.util.List"%>
<%@page import="utility.VehicleDataSource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For tag</title>
</head>
<body>

<c:forTokens items="Myanmar:Japan:Thailand:Korea" delims=":">
<c:out value="${country }"></c:out><br>

</c:forTokens>
<%---
<%

VehicleDataSource data =new VehicleDataSource();
List<Vehicle> vehicleList = data.getVehicleList();
pageContext.setAttribute("vehicleList", vehicleList);


%>
 --%>
<!-- 
	<table border ="1">
	<tr>
		<th>Brand</th>
		<th>Model</th>
		
		<th>Year</th>
		</tr>
		<c:forEach items="${vehicleList }" var ="vehicle">
		<tr>
		<td> <c:out value=" ${vehicle.brand }"></c:out></td>
				<td> <c:out value=" ${vehicle.model }"></c:out></td>
		
				<td> <c:out value=" ${vehicle.year }"></c:out></td>
		
		</tr>
		
		
		</c:forEach>
		</table>
		 -->
		
<!--  
<c:forEach items="Apple,Banana,Mango,papaya,Pineapple" var ="fruit" begin="1" end="3" step="2">
	<c:out value="${fruit} "></c:out> <br> </c:forEach>
	-->
<!-- - 
<h3>1-10000 Loop</h3>
	<c:forEach var="i" begin="1" end="10000" step ="10">
	<c:out value="Count: ${i} }"></c:out><br>
	
	
	</c:forEach>
	-->
	

</body>
</html>