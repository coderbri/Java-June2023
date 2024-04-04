<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> --%>
<%-- <%@ page isErrorPage="true" %> --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<title>D8: First Spring View - Loop Ex.</title>
	</head>
	<body>
		
		<div class="container-fluid">		
			<h1 class="fw-semibold">JSTL Loop Example</h1>
			<h2>Pets</h2>
			
			<c:forEach var="onePet" items="${allPets}">
				<c:if test="${onePet.equals('cats')}">
				<h3 class="fw-bolder">cats <- the best animal</h3>
				</c:if>
				
				<h3><c:out value="${onePet}"/></h3>
				
			</c:forEach>
		</div>
	</body>
</html>