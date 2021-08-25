<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link href="${pageContext.request.getContextPath()}/resources/css/estilo.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">

<jsp:include page="menu.jsp"></jsp:include>

<h1>Listado de Estudiantes</h1>
<div>

	<table class="table">
		<thead class="table-dark">
			<tr>
				<th>DNI</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${estudiantes}">
				<tr>
					<th>
					<a href="${pageContext.request.contextPath}/estudiante/ver/${e.getDni()}">
					<c:out value="${e.getDni()}"></c:out></a></th>
					<td><c:out value="${e.getNombre()}"></c:out></td>
					<td><c:out value="${e.getApellido()}"></c:out></td>
					<td>
					<a href="${pageContext.request.getContextPath()}/estudiante/editar/${e.getId()}">Editar</a> |
					<a href="${pageContext.request.getContextPath()}/estudiante/borrar/${e.getId()}">Borrar</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>



</div>




<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

</body>
</html>