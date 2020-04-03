<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar empresa</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />
	<div align="center">
		<form action="${linkEntradaServlet}" method="post">
			<table style="width: %100">
				<tr>
					<td colspan="2" align="center"><h3>Editar empresa</h3></td>
				</tr>
				<tr>
					<td><input type="hidden" name="id" value="${empresa.id}"/></td>
					<td><input type="hidden" name="acao" value="AlteraEmpresa"/></td>
				</tr>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="nome" value="${empresa.nome}" /></td>
				</tr>
				<tr>
					<td>Data Abertura:</td>
					<td><input type="text" name="data" 
					value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>