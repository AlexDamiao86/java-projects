<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro de Java, Android, iPhone, Ruby, PHP e muito mais - Casa do código</title>
</head>
<style>
table {
	width: 100%;
}
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
th, td {
	padding: 5px;
	text-align: left;
}
</style>
<body>
	<div>${sucesso }</div>

	<h1>Lista de Produtos</h1>
	<table>
		<tr>
			<td><h3>Título</h3></td>
			<td><h3>Descrição</h3></td>
			<td><h3>Páginas</h3></td>
		</tr>
		<c:forEach items="${produtos }" var="produto">
			<tr>
				<td><a href="${s:mvcUrl('PC#detalhe').arg(0, produto.id).build()}">${produto.titulo }</a></td>
				<td>${produto.descricao } </td>
				<td>${produto.paginas }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>