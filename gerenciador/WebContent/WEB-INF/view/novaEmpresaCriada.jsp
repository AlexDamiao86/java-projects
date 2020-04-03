<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresa Cadastrada com Sucesso</title>
</head>
<body>
	<c:if test="${not empty nomeEmpresa}">
		<p>Empresa ${nomeEmpresa} cadastrada com sucesso!</p>
	</c:if>
	<c:if test="${empty nomeEmpresa}">
		<p>Nenhuma empresa foi cadastrada..</p>
	</c:if>
</body>
</html>