<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
</head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: left;
}

#center {
	text-align: center;
}

</style>
<body>
	<c:import url="logout-parcial.jsp" />
<%-- 	<c:if test="${not empty nomeEmpresa}"> --%>
<%-- 		<p>Empresa ${nomeEmpresa} cadastrada com sucesso!</p> --%>
<%-- 	</c:if> --%>
	<table style="width: 100%">
		<caption>Lista de Empresas</caption>
		<tr>
			<th width="10%">Identificador</th>
			<th width="50%">Razão Social</th>
			<th width="20%">Data da Abertura</th>
			<th width="20%" colspan="2" id="center">Ações</th>
		</tr>
		<c:forEach items="${empresas}" var="empresa">
			<tr>
				<td>${empresa.id}</td>
				<td>${empresa.nome}</td>
				<td><fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /></td>
				<td id="center"><a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">Editar</a></td>
				<td id="center"><a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
	<p><a href="entrada?acao=NovaEmpresaForm">Adicionar nova empresa</a></p>
</body>
</html>