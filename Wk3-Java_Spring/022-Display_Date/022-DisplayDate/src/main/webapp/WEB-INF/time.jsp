<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="/css/index.css">
		<script type="text/javascript" src="/js/app.js"></script>
		<title>022 Display Time</title>
	</head>
	<body class="bg-secondary-subtle">
		<jsp:include page="partials/header.jsp" />
		
		<div class="container-fluid">		
			<div class="col-12 col-md-10 col-lg-8 mx-auto">
				<div class="bg-white rounded p-4 mt-2">
					
					<h2 class="fw-semibold fs-2 text-center mb-3">Display Time</h2>
					
					<p class="text-center fs-3 fw-medium text-danger-emphasis">
						<c:out value="${militaryTime}" />
					</p>
					
					<p class="text-center fs-3 fw-medium text-danger-emphasis">
						<c:out value="${time}" />
					</p>
					
				</div>
			</div>
		</div>
		
		<jsp:include page="partials/footer.jsp" />
	</body>
</html>