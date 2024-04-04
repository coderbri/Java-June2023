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
	<body>
		
		<div class="container-fluid">		
			<h1>Hello World</h1>
			<h2>This is my first JSP file!</h2>
			
			<h3>This word is from the controller: 
				<c:out value="${cat}"/>
			</h3>
		</div>
	</body>
</html>