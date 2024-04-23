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
				src="image/house1.jpeg" alt="logo" /> House List</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
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
						<th>Vaccancy</th>
						<th>Action</th>

					</tr>

				</thead>
				<tbody>

					<c:forEach var="house" items="${houseList }">
						<c:url var="updatelink" value="house">
							<c:param name="mode" value="LOAD"></c:param>
							<c:param name="id" value="${house.id }"></c:param>
						</c:url>



						<c:url var="deletelink" value="house">
							<c:param name="mode" value="DELETE"></c:param>
							<c:param name="id" value="${house.id }"></c:param>
						</c:url>
						<tr>
							<td><c:out value="${house.id }"></c:out></td>
							<td><c:out value="${house.address }"></c:out></td>
							<td><c:out value="${house.rentPrice }"></c:out></td>
							<td><c:out value="${house.bedRoom }"></c:out></td>
							<td><c:out value="${house.kitchen }"></c:out></td>
							<td><c:out value="${house.bathRoom }"></c:out></td>

							<td><c:choose>
									<c:when test="${house.vaccancy }">
										<c:out value="Vaccancied">
										</c:out>

									</c:when>
									<c:otherwise>
										<c:out value="Occupied"></c:out>


									</c:otherwise>
								</c:choose></td>


							<td><a class="btn btn-primary" href="${updatelink }">
									Edit </a> <a class="btn btn-danger" id="delete"
								href="${deletelink }"
								onclick="return confirm('Are you sure to delete this result');">
									Delete </a></td>

						</tr>


					</c:forEach>





				</tbody>
				<tfoot>

					<tr>

						<th>ID</th>
						<th>Address</th>
						<th>Rent Price</th>
						<th>Bed Room</th>
						<th>Kitchen</th>
						<th>Bath Room</th>

						<th>Vaccancy</th>
						<th>Action</th>
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