<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ver Estudiante</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="${pageContext.request.getContextPath()}/resources/css/estilo.css"
	rel="stylesheet" type="text/css">

</head>
<body>
	<div class="container">

		<jsp:include page="menu.jsp"></jsp:include>

		<h1>Crear Estudiante</h1>
		<div class="mb-3">
			<label for="rut" class="form-label">DNI</label>
			<c:out value="${e.getDni()}"></c:out>
		</div>
		<div class="mb-3">
			<label for="nombre" class="form-label">Nombre</label> 
			<c:out value="${e.getNombre()}"></c:out>
		</div>
		<div class="mb-3">
			<label for="apellido" class="form-label">Apellido</label> 
			<c:out value="${e.getApellido()}"></c:out>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>