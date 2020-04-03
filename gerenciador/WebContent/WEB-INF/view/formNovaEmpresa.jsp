<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar nova empresa</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />
	<div align="center">
		<form action="${linkEntradaServlet}" method="post">
			<table style="width: %100">
				<tr>
					<td colspan="2" align="center"><h3>Cadastrar nova empresa</h3></td>
				</tr>
				<tr>
					<td colspan="2"><input type="hidden" name="acao" value="NovaEmpresa" /></td>
				</tr>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="nome" /></td>
				</tr>
				<tr>
					<td>Data Abertura:</td>
					<td><input type="text" name="data" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>