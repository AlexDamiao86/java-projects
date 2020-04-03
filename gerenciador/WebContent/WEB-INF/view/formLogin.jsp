<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Autentica</title>
</head>
<body leftmargin="0" topmargin="0">
	<div align="center">
		<form action="${linkEntradaServlet}" method="post">
			<table style="width: %100">
				<tr>
					<td colspan="2" align="center"><h3>Autenticação de usuário</h3></td>
				</tr>
				<tr>
					<td colspan="2"><input type="hidden" name="acao" value="Login" /></td>
				</tr>
				<tr>
					<td>Login:</td>
					<td><input type="text" name="login" /></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="password" name="senha" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>