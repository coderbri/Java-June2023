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
	<body class="bg-secondary-subtle">
		<div class="container-fluid">
			<div class="col-12 col-md-6">
			
				<div class="bg-white rounded p-3 mt-2">
					<h1 class="fw-bold text-center">JSTL Loop Example</h1>
					<h2 class="fw-bolder">Pets</h2>
					
					<c:forEach var="onePet" items="${allPets}">
						<c:choose>
							<c:when test="${onePet.equals('cats')}">
								<h3><span class="fw-bolder text-info-emphasis">cats </span>← the best animal</h3>
							</c:when>
							<c:otherwise>
								<h3><c:out value="${onePet}"/></h3>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</div>
			</div>
		</div>
	</body>
</html>