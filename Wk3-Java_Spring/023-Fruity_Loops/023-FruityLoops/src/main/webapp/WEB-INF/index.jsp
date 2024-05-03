<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/index.css">
<title>023 Fruity Loops</title>
</head>
<body class="bg-secondary-subtle">
	<jsp:include page="partials/header.jsp" />
	<div class="container-fluid">
		<div class="col-12 col-md-9 col-xl-6 mx-auto">

			<div class="bg-white rounded p-3 mt-2">

				<div id="fruity_table" class="text-center mt-3 pb-3 px-3">
					<table class="table table-hover table-bordered">
						<thead class="table-dark">
							<tr>
								<th>Name</th>
								<th>Price</th>
							</tr>
						</thead>
						<!--  -->
						<c:forEach var="fruit" items="${fruits}">
							<tbody class="bg-light">
								<tr>
									<c:choose>
										<c:when test="${fruit.name.startsWith('G')}">
											<td><span class="text-warning fw-semibold">${fruit.name}</span></td>
										</c:when>
										<c:otherwise>
											<td>${fruit.name}</td>
										</c:otherwise>
									</c:choose>
									<td>$<fmt:formatNumber value="${fruit.price}"
											type="number" pattern="#,##0.00" /></td>
								</tr>
							</tbody>
						</c:forEach>
					</table>
				</div>

			</div>
		</div>
	</div>
	<jsp:include page="partials/footer.jsp" />
</body>
</html>