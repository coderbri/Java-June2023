<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> --%>
<%-- <%@ page isErrorPage="true" %> --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<!-- <link rel="stylesheet" type="text/css" href="/css/index.css"> -->
		<!-- <script type="text/javascript" src="/js/index.js"></script> -->
		<title>021 Hopper's Receipt</title>
	</head>
	<body class="bg-secondary-subtle">
		<div class="container-fluid">
			<div class="col-12 col-md-10 col-xl-8 mx-auto">
			
				<div class="bg-white rounded p-3 mt-2 mx-auto">
					<h1 class="fw-bolder mb-3">Customer Name: <c:out value="${customer}" /></h1>
					<h3><span class="fw-bold">Item name:</span> <c:out value="${item}" /></h3>
					<h3>
						<span class="fw-bold">Price: </span>
						<%-- $<c:out value="${price}" /> --%>
						<fmt:formatNumber value="${price}" type="currency" minFractionDigits="2" maxFractionDigits="2" />
					</h3>
					<h3><span class="fw-bold">Description:</span> <c:out value="${desc}" /></h3>
					<h3><span class="fw-bold">Vendor:</span> <c:out value="${vendor}" /></h3>
				</div>
			</div>
		</div>
	</body>
</html>