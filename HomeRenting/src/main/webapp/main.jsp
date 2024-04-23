<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Home Renting System</title>
<meta content="" name="description">
<meta content="" name="keywords">

<!-- Favicons -->
<link href="assets/img/favicon.png" rel="icon">
<link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet">
<link href="assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="assets/vendor/glightbox/css/glightbox.min.css"
	rel="stylesheet">
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
<link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

<!-- Template Main CSS File -->
<link href="assets/css/style.css" rel="stylesheet">

<!-- =======================================================
  * Template Name: Tempo - v4.9.1
  * Template URL: https://bootstrapmade.com/tempo-free-onepage-bootstrap-theme/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

	<!-- ======= Header ======= -->
	<header id="header" class="fixed-top ">
		<div
			class="container d-flex align-items-center justify-content-between">

			<h1 class="logo">
				<a href="index.html"></a>
			</h1>
			<!-- Uncomment below if you prefer to use an image logo -->
			<!-- <a href="index.html" class="logo"><img src="image/2.jpg" alt="" class="img-fluid"></a>-->

			<nav id="navbar" class="navbar">
				<ul>
					<li><a class="nav-link scrollto active" href="#hero">Home</a></li>
					<!--           <li><a class="nav-link scrollto" href="#about">About</a></li> -->
					<li><a class="nav-link scrollto " href="#portfolio">House
							Images</a></li>
					<li><a class="nav-link scrollto " href="house">House List</a></li>

					<c:if test="${fn:contains(user.role,'owner') }">
						<li><a class="nav-link scrollto" href="add-home.jsp">Add
								Home</a></li>
						<li><a class="nav-link scrollto" href="rent">House Rent
								List</a></li>

					</c:if>
					<li><a class="nav-link scrollto" href="#contact">Contact</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							<c:out value="${user.name}">
							</c:out>
					</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="house?mode=LOGOUT">Logout</a></li>
						</ul></li>


				</ul>
				<i class="bi bi-list mobile-nav-toggle"></i>
			</nav>
			<!-- .navbar -->

		</div>
	</header>
	<!-- End Header -->

	<!-- ======= Hero Section ======= -->
	<section id="hero">
		<div class="hero-container">
			<h3>
				Welcome To <strong>Home Renting System</strong>
			</h3>
			<h1>FIND HOME TOGETHER</h1>
			<a href="#about" class="btn-get-started scrollto">Get Started</a>
		</div>
	</section>
	<!-- End Hero -->

	<main id="main">



		<!-- ======= Portfolio Section ======= -->
		<section id="portfolio" class="portfolio">
			<div class="container">

				<div class="section-title">
					<h2>House Images</h2>
					<h3>
						Our <span>House Images</span>
					</h3>
				</div>


				<div class="row portfolio-container">

					<div class="col-lg-4 col-md-6 portfolio-item filter-app">
						<img src="image/h1.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>App 1</h4>
							<p>App</p>
							<a href="assets/img/portfolio/portfolio-1.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="App 1"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-web">
						<img src="image/h2.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>Web 3</h4>
							<p>Web</p>
							<a href="assets/img/portfolio/portfolio-2.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="Web 3"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-app">
						<img src="image/h3.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>App 2</h4>
							<p>App</p>
							<a href="assets/img/portfolio/portfolio-3.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="App 2"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-card">
						<img src="image/h4.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>Card 2</h4>
							<p>Card</p>
							<a href="assets/img/portfolio/portfolio-4.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="Card 2"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-web">
						<img src="image/h5.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>Web 2</h4>
							<p>Web</p>
							<a href="assets/img/portfolio/portfolio-5.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="Web 2"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-app">
						<img src="image/h6.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>App 3</h4>
							<p>App</p>
							<a href="assets/img/portfolio/portfolio-6.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="App 3"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-card">
						<img src="image/h7.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>Card 1</h4>
							<p>Card</p>
							<a href="assets/img/portfolio/portfolio-7.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="Card 1"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-card">
						<img src="image/h8.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>Card 3</h4>
							<p>Card</p>
							<a href="assets/img/portfolio/portfolio-8.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="Card 3"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 portfolio-item filter-web">
						<img src="image/h9.jpg" class="img-fluid" alt="">
						<div class="portfolio-info">
							<h4>Web 3</h4>
							<p>Web</p>
							<a href="assets/img/portfolio/portfolio-9.jpg"
								data-gallery="portfolioGallery"
								class="portfolio-lightbox preview-link" title="Web 3"><i
								class="bx bx-plus"></i></a> <a href="portfolio-details.html"
								class="details-link" title="More Details"><i
								class="bx bx-link"></i></a>
						</div>
					</div>

				</div>

			</div>
		</section>
		<!-- End Portfolio Section -->



		<!-- ======= Contact Section ======= -->
		<section id="contact" class="contact">
			<div class="container">

				<div class="section-title">
					<h2>Contact</h2>
					<h3>
						Contact <span>Us</span>
					</h3>
				</div>



				<div class="row mt-5">

					<div class="col-lg-4">
						<div class="info">
							<div class="address">
								<i class="bi bi-geo-alt"></i>
								<h4>Location:</h4>
								<p>Mandalay Township</p>
							</div>

							<div class="email">
								<i class="bi bi-envelope"></i>
								<h4>Email:</h4>
								<p>purple@gmail.com</p>
							</div>

							<div class="phone">
								<i class="bi bi-phone"></i>
								<h4>Call:</h4>
								<p>+959 976190981</p>
							</div>

						</div>

					</div>

					<div class="col-lg-8 mt-5 mt-lg-0">

						<form action="forms/contact.php" method="post" role="form"
							class="php-email-form">
							<div class="row">
								<div class="col-md-6 form-group">
									<input type="text" name="name" class="form-control" id="name"
										placeholder="Your Name" required>
								</div>
								<div class="col-md-6 form-group mt-3 mt-md-0">
									<input type="email" class="form-control" name="email"
										id="email" placeholder="Your Email" required>
								</div>
							</div>
							<div class="form-group mt-3">
								<input type="text" class="form-control" name="subject"
									id="subject" placeholder="Subject" required>
							</div>
							<div class="form-group mt-3">
								<textarea class="form-control" name="message" rows="5"
									placeholder="Message" required></textarea>
							</div>
							<div class="my-3">
								<div class="loading">Loading</div>
								<div class="error-message"></div>
								<div class="sent-message">Your message has been sent.
									Thank you!</div>
							</div>
							<div class="text-center">
								<button type="submit">Send Message</button>
							</div>
						</form>

					</div>

				</div>

			</div>
		</section>
		<!-- End Contact Section -->

	</main>
	<!-- End #main -->



	<div class="container d-md-flex py-4">

		<div class="me-md-auto text-center text-md-start">
			<div class="copyright">
				&copy; Copyright <strong><span>Tempo</span></strong>. All Rights
				Reserved
			</div>
			<div class="credits">
				<!-- All the links in the footer should remain intact. -->
				<!-- You can delete the links only if you purchased the pro version. -->
				<!-- Licensing information: https://bootstrapmade.com/license/ -->
				<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/tempo-free-onepage-bootstrap-theme/ -->
				Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
			</div>
		</div>
		<div class="social-links text-center text-md-right pt-3 pt-md-0">
			<a href="#" class="twitter"><i class="bx bxl-twitter"></i></a> <a
				href="#" class="facebook"><i class="bx bxl-facebook"></i></a> <a
				href="#" class="instagram"><i class="bx bxl-instagram"></i></a> <a
				href="#" class="google-plus"><i class="bx bxl-skype"></i></a> <a
				href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
		</div>
	</div>
	</footer>
	<!-- End Footer -->

	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a>

	<!-- Vendor JS Files -->
	<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
	<script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
	<script src="assets/vendor/php-email-form/validate.js"></script>

	<!-- Template Main JS File -->
	<script src="assets/js/main.js"></script>

</body>

</html>