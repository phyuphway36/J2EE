<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>HomeRenting Register Form</title>
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
	<div class="container">
		<form action="house" method="post" class="form-horizontal" role="form">
			<h2 class="text-center">Registration</h2>
			<h3>ID: ${house.id }</h3>
			<input type="hidden" name="mode" value="UPDATE" /> 
			<input
				type="hidden" name="id" value="${house.id}" />
			<div class="mb-3">
				<label for="address" class="form-label">Address</label> <input
					type="text" value="${house.address}" id="address" name="address"
					placeholder="Address" class="form-control" autofocus>

			</div>

			<div class="mb-3">
				<label for="rentPrice" class="form-label">Rent Price</label> <input
					type="text" value="${house.rentPrice}" id="rentPrice"
					name="rentPrice" placeholder="Rent Price" class="form-control">

			</div>
			<div class="mb-3">
				<label for="bedRoom" class="form-label">Bed Room</label> <input
					type="number" value="${house.bedRoom}" id="bedRoom" name="bedRoom"
					placeholder="Bed Room" class="form-control" autofocus>

			</div>

			<div class="mb-3">
				<label for="kitchen" class="form-label">Kitchen</label> <input
					type="number" value="${house.kitchen}" id="kitchen" name="kitchen"
					placeholder=" Kitchen" class="form-control">

			</div>
			<div class="mb-3">
				<label for="bathRoom" class="form-label">Bath Room</label> <input
					type="number" value="${house.bathRoom}" id="bathRoom"
					name="bathRoom" placeholder=" BathRoom" class="form-control">

			</div>

			<div class="mb-3">
				<label class="form-label">Vaccancy</label>
				<div class="col-sm-6">
					<div class="row">
						<c:choose>
							<c:when test="${house.vaccancy }">

								<div class="col-sm-4">
									<label class="radio-inline"> <input type="radio"
										id="vaccancy" name="vaccancy" value="true" checked="checked">Yes
									</label>
								</div>
								<div class="col-sm-4">
									<label class="radio-inline"> <input type="radio"
										id="vaccancy" name="vaccancy" value="false">No
									</label>
								</div>
							</c:when>
							<c:otherwise>
								<div class="col-sm-4">
									<label class="radio-inline"> <input type="radio"
										id="vaccancy" name="vaccancy" value="true">Yes
									</label>
								</div>
								<div class="col-sm-4">
									<label class="radio-inline"> <input type="radio"
										id="vaccancy" name="vaccancy" value="false" checked="checked">No
									</label>
								</div>

							</c:otherwise>

						</c:choose>

					</div>
				</div>
			</div>
			<!-- /.form-group -->
			<div class="mb-3">
				<div class="col-sm-9 col-sm-offset-3">
					<span class="help-block">*Required fields</span>
				</div>
			</div>
			<button type="submit" class="btn btn-primary btn-block">Submit</button>
			<button type="reset" class="btn btn-danger btn-block">Reset</button>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->

	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>

</body>
</html>