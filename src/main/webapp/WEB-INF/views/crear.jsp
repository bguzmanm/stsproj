<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear</title>
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


		<form action="${pageContext.request.getContextPath()}/estudiante/crear" method="post">
			<div class="mb-3">
				<label for="dni" class="form-label">DNI</label> <input type="text"
					class="form-control" id="dni" name="dni" placeholder="1-1">
			</div>
			<div class="mb-3">
				<label for="nombre" class="form-label">Nombre</label> <input
					type="text" class="form-control" id="nombre" name="nombre" placeholder="Julio">
			</div>
			<div class="mb-3">
				<label for="apellido" class="form-label">Apellido</label> <input
					type="text" class="form-control" id="apellido" name="apellido"
					placeholder="Ponce Lerau">
			</div>
			<div class="mb-3">
				<label for="direccion" class="form-label">Dirección</label> <input
					type="text" class="form-control" id="direccion" name="direccion"
					placeholder="Mapocho 1567">
			</div>
			<div class="col-12">
				<button type="submit" class="btn btn-primary">Enviar</button>
			</div>
		</form>

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