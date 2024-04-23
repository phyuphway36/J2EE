<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Home Renting System</title>
<!-- CDN-->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/school.ico" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/styles.css" rel="stylesheet" />
<link href="css/custom.css" rel="stylesheet" />
</head>
<body>


	<c:url var="loadRent" value="house">
		<c:param name="mode" value="LOADRENT"></c:param>
	</c:url>
	<div class="container"></div>
	<!-- Responsive navbar-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="#"><img id="logo"
				src="image/house1.jpeg" alt="logo" /> House Rent List</a>
			<!-- 			<button class="navbar-toggler" type="button" -->
			<!-- 				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" -->
			<!-- 				aria-controls="navbarSupportedContent" aria-expanded="false" -->
			<!-- 				aria-label="Toggle navigation"> -->
			<!-- 				<span class="navbar-toggler-icon"></span> -->
			<!-- 			</button> -->
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="main.jsp">Home</a></li>

				</ul>
				</li>
				</ul>
			</div>
		</div>
	</nav>
	<div>
		<!-- Page content-->
		<div class="container mt-5">
			<table id="house" class="table table-striped">
				<thead>

					<tr>

						<th>ID</th>
						<th>Address</th>
						<th>Rent Price</th>
						<th>Bed Room</th>
						<th>Kitchen</th>
						<th>Bath Room</th>


					</tr>

				</thead>
				<tbody>

					<c:if test="${fn:contains(user.role,'user') }">
						<c:forEach var="rent" items="${rentList }">

							<tr>
								<td><c:out value="${rent.id }"></c:out></td>
								<td><c:out value="${rent.address }"></c:out></td>
								<td><c:out value="${rent.rentPrice }"></c:out></td>
								<td><c:out value="${rent.bedRoom }"></c:out></td>
								<td><c:out value="${rent.kitchen }"></c:out></td>
								<td><c:out value="${rent.bathRoom }"></c:out></td>

							</tr>


						</c:forEach>
					</c:if>
					<c:if test="${fn:contains(user.role,'owner') }">
						<c:forEach var="rent" items="${allRentList }">

							<tr>
								<td><c:out value="${rent.id }"></c:out></td>
								<td><c:out value="${rent.address }"></c:out></td>
								<td><c:out value="${rent.rentPrice }"></c:out></td>
								<td><c:out value="${rent.bedRoom }"></c:out></td>
								<td><c:out value="${rent.kitchen }"></c:out></td>
								<td><c:out value="${rent.bathRoom }"></c:out></td>

							</tr>


						</c:forEach>
					</c:if>





				</tbody>
				<tfoot>

					<tr>

						<th>ID</th>
						<th>Address</th>
						<th>Rent Price</th>
						<th>Bed Room</th>
						<th>Kitchen</th>
						<th>Bath Room</th>



					</tr>


				</tfoot>
			</table>

		</div>
		<!-- Bootstrap core JS-->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
		<!-- Core theme JS-->
		<script src="js/scripts.js"></script>

		<script>
            $(document).ready(function () {
                 $('#house').DataTable();
                 
                 
          
            });
            
           
        </script>
	</div>
</body>
</html>
