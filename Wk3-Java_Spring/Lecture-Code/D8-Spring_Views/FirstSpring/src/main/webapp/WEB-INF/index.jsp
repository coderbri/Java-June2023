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
		<link rel="stylesheet" type="text/css" href="/css/index.css">
		<script type="text/javascript" src="/js/index.js"></script>
		<title>D8: First Spring View</title>
	</head>
	<body class="bg-secondary-subtle">
		<div class="container-fluid">
			<div class="col-12 col-md-6">
				<div class="bg-white rounded p-3 mt-2">
					<h1 class="fw-bold text-center">Hello World</h1>
					
					<div id="Body__Text" class="mt-2">
						<h2>My first JSP file!</h2>
						
						<h2 class="fw-semibold mt-2">Rendering with c:out</h2>
						<p>This word is from the controller:
							<span class="fw-bolder"><c:out value="${cat}"/></span>
						</p>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>