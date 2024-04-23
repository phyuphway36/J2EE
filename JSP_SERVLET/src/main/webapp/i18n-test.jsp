<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>I18N Test</title>
</head>
<body>

	<c:set var="locale" value="${not empty param.locale?param.locale: pageContext.request.locale }"> </c:set>
	<fmt:setLocale value="${locale }"/>
	<fmt:setBundle basename="multilanguage.Language"/>
	<p>
	<a href="i18n-test.jsp"> English </a>
	<a href="i18n-test.jsp?locale=de_DE"> German </a>
	<a href="i18n-test.jsp?locale=es_ES"> Spanish </a>
	<a href="i18n-test.jsp?locale=fr_FR"> French </a>
	</p>
	
	<p>
	<fmt:message key="greeting"> </fmt:message> <br>
	<fmt:message key="proverb"> </fmt:message> <br>
	<fmt:message key="sample"> </fmt:message> <br>
	<fmt:message key="welcome"> </fmt:message> <br>
	</p>
		
	

</body>
</html>