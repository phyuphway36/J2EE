/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.26
 * Generated at: 2022-11-07 12:02:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:contains", org.apache.taglibs.standard.functions.Functions.class, "contains", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.0.jar", Long.valueOf(1667044410785L));
    _jspx_dependants.put("jar:file:/C:/JobReadyJavaEEOfline/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HomeRenting/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.0.jar!/META-INF/c-1_2.tld", Long.valueOf(1649412498000L));
    _jspx_dependants.put("jar:file:/C:/JobReadyJavaEEOfline/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HomeRenting/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.0.jar!/META-INF/fn-1_1.tld", Long.valueOf(1649412498000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("<title>Home Renting System</title>\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicons -->\r\n");
      out.write("<link href=\"assets/img/favicon.png\" rel=\"icon\">\r\n");
      out.write("<link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Vendor CSS Files -->\r\n");
      out.write("<link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/boxicons/css/boxicons.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/glightbox/css/glightbox.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Template Main CSS File -->\r\n");
      out.write("<link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- =======================================================\r\n");
      out.write("  * Template Name: Tempo - v4.9.1\r\n");
      out.write("  * Template URL: https://bootstrapmade.com/tempo-free-onepage-bootstrap-theme/\r\n");
      out.write("  * Author: BootstrapMade.com\r\n");
      out.write("  * License: https://bootstrapmade.com/license/\r\n");
      out.write("  ======================================================== -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- ======= Header ======= -->\r\n");
      out.write("	<header id=\"header\" class=\"fixed-top \">\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"container d-flex align-items-center justify-content-between\">\r\n");
      out.write("\r\n");
      out.write("			<h1 class=\"logo\">\r\n");
      out.write("				<a href=\"index.html\"></a>\r\n");
      out.write("			</h1>\r\n");
      out.write("			<!-- Uncomment below if you prefer to use an image logo -->\r\n");
      out.write("			<!-- <a href=\"index.html\" class=\"logo\"><img src=\"image/2.jpg\" alt=\"\" class=\"img-fluid\"></a>-->\r\n");
      out.write("\r\n");
      out.write("			<nav id=\"navbar\" class=\"navbar\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a class=\"nav-link scrollto active\" href=\"#hero\">Home</a></li>\r\n");
      out.write("					<!--           <li><a class=\"nav-link scrollto\" href=\"#about\">About</a></li> -->\r\n");
      out.write("					<li><a class=\"nav-link scrollto \" href=\"#portfolio\">House\r\n");
      out.write("							Images</a></li>\r\n");
      out.write("					<li><a class=\"nav-link scrollto \" href=\"house\">House List</a></li>\r\n");
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					<li><a class=\"nav-link scrollto\" href=\"#contact\">Contact</a></li>\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("							");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("							aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"house?mode=LOGOUT\">Logout</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("				<i class=\"bi bi-list mobile-nav-toggle\"></i>\r\n");
      out.write("			</nav>\r\n");
      out.write("			<!-- .navbar -->\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("	<!-- ======= Hero Section ======= -->\r\n");
      out.write("	<section id=\"hero\">\r\n");
      out.write("		<div class=\"hero-container\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				Welcome To <strong>Home Renting System</strong>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<h1>FING HOME TOGETHER</h1>\r\n");
      out.write("			<a href=\"#about\" class=\"btn-get-started scrollto\">Get Started</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- End Hero -->\r\n");
      out.write("\r\n");
      out.write("	<main id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- ======= Portfolio Section ======= -->\r\n");
      out.write("		<section id=\"portfolio\" class=\"portfolio\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section-title\">\r\n");
      out.write("					<h2>House Images</h2>\r\n");
      out.write("					<h3>\r\n");
      out.write("						Our <span>House Images</span>\r\n");
      out.write("					</h3>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"row portfolio-container\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">\r\n");
      out.write("						<img src=\"image/h1.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>App 1</h4>\r\n");
      out.write("							<p>App</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-1.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"App 1\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">\r\n");
      out.write("						<img src=\"image/h2.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>Web 3</h4>\r\n");
      out.write("							<p>Web</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-2.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"Web 3\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">\r\n");
      out.write("						<img src=\"image/h3.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>App 2</h4>\r\n");
      out.write("							<p>App</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-3.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"App 2\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">\r\n");
      out.write("						<img src=\"image/h4.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>Card 2</h4>\r\n");
      out.write("							<p>Card</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-4.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"Card 2\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">\r\n");
      out.write("						<img src=\"image/h5.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>Web 2</h4>\r\n");
      out.write("							<p>Web</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-5.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"Web 2\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">\r\n");
      out.write("						<img src=\"image/h6.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>App 3</h4>\r\n");
      out.write("							<p>App</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-6.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"App 3\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">\r\n");
      out.write("						<img src=\"image/h7.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>Card 1</h4>\r\n");
      out.write("							<p>Card</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-7.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"Card 1\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">\r\n");
      out.write("						<img src=\"image/h8.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>Card 3</h4>\r\n");
      out.write("							<p>Card</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-8.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"Card 3\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">\r\n");
      out.write("						<img src=\"image/h9.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("						<div class=\"portfolio-info\">\r\n");
      out.write("							<h4>Web 3</h4>\r\n");
      out.write("							<p>Web</p>\r\n");
      out.write("							<a href=\"assets/img/portfolio/portfolio-9.jpg\"\r\n");
      out.write("								data-gallery=\"portfolioGallery\"\r\n");
      out.write("								class=\"portfolio-lightbox preview-link\" title=\"Web 3\"><i\r\n");
      out.write("								class=\"bx bx-plus\"></i></a> <a href=\"portfolio-details.html\"\r\n");
      out.write("								class=\"details-link\" title=\"More Details\"><i\r\n");
      out.write("								class=\"bx bx-link\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<!-- End Portfolio Section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- ======= Contact Section ======= -->\r\n");
      out.write("		<section id=\"contact\" class=\"contact\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section-title\">\r\n");
      out.write("					<h2>Contact</h2>\r\n");
      out.write("					<h3>\r\n");
      out.write("						Contact <span>Us</span>\r\n");
      out.write("					</h3>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"row mt-5\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-4\">\r\n");
      out.write("						<div class=\"info\">\r\n");
      out.write("							<div class=\"address\">\r\n");
      out.write("								<i class=\"bi bi-geo-alt\"></i>\r\n");
      out.write("								<h4>Location:</h4>\r\n");
      out.write("								<p>Mandalay Township</p>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"email\">\r\n");
      out.write("								<i class=\"bi bi-envelope\"></i>\r\n");
      out.write("								<h4>Email:</h4>\r\n");
      out.write("								<p>purple@gmail.com</p>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"phone\">\r\n");
      out.write("								<i class=\"bi bi-phone\"></i>\r\n");
      out.write("								<h4>Call:</h4>\r\n");
      out.write("								<p>+959 976190981</p>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"col-lg-8 mt-5 mt-lg-0\">\r\n");
      out.write("\r\n");
      out.write("						<form action=\"forms/contact.php\" method=\"post\" role=\"form\"\r\n");
      out.write("							class=\"php-email-form\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 form-group\">\r\n");
      out.write("									<input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\"\r\n");
      out.write("										placeholder=\"Your Name\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 form-group mt-3 mt-md-0\">\r\n");
      out.write("									<input type=\"email\" class=\"form-control\" name=\"email\"\r\n");
      out.write("										id=\"email\" placeholder=\"Your Email\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group mt-3\">\r\n");
      out.write("								<input type=\"text\" class=\"form-control\" name=\"subject\"\r\n");
      out.write("									id=\"subject\" placeholder=\"Subject\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group mt-3\">\r\n");
      out.write("								<textarea class=\"form-control\" name=\"message\" rows=\"5\"\r\n");
      out.write("									placeholder=\"Message\" required></textarea>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"my-3\">\r\n");
      out.write("								<div class=\"loading\">Loading</div>\r\n");
      out.write("								<div class=\"error-message\"></div>\r\n");
      out.write("								<div class=\"sent-message\">Your message has been sent.\r\n");
      out.write("									Thank you!</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"text-center\">\r\n");
      out.write("								<button type=\"submit\">Send Message</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<!-- End Contact Section -->\r\n");
      out.write("\r\n");
      out.write("	</main>\r\n");
      out.write("	<!-- End #main -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container d-md-flex py-4\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"me-md-auto text-center text-md-start\">\r\n");
      out.write("			<div class=\"copyright\">\r\n");
      out.write("				&copy; Copyright <strong><span>Tempo</span></strong>. All Rights\r\n");
      out.write("				Reserved\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"credits\">\r\n");
      out.write("				<!-- All the links in the footer should remain intact. -->\r\n");
      out.write("				<!-- You can delete the links only if you purchased the pro version. -->\r\n");
      out.write("				<!-- Licensing information: https://bootstrapmade.com/license/ -->\r\n");
      out.write("				<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/tempo-free-onepage-bootstrap-theme/ -->\r\n");
      out.write("				Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"social-links text-center text-md-right pt-3 pt-md-0\">\r\n");
      out.write("			<a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a> <a\r\n");
      out.write("				href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a> <a\r\n");
      out.write("				href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a> <a\r\n");
      out.write("				href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a> <a\r\n");
      out.write("				href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("	<a href=\"#\"\r\n");
      out.write("		class=\"back-to-top d-flex align-items-center justify-content-center\"><i\r\n");
      out.write("		class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("	<!-- Vendor JS Files -->\r\n");
      out.write("	<script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Template Main JS File -->\r\n");
      out.write("	<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /main.jsp(69,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:contains(user.role,'owner') }", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li><a class=\"nav-link scrollto\" href=\"add-home.jsp\">Add\r\n");
          out.write("								Home</a></li>\r\n");
          out.write("						<li><a class=\"nav-link scrollto\" href=\"rent\">House Rent\r\n");
          out.write("								List</a></li>\r\n");
          out.write("\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /main.jsp(80,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.Object.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_eval_c_005fout_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fout_005f0 != jakarta.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fout_005f0);
        }
        do {
          out.write("\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fout_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fout_005f0 != jakarta.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
